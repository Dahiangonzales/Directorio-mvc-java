package controller;

import model.Jewelry;
import model.JewelryDAO;
import view.JewelryView;
import java.util.List;

public class CtrlJewelry {
    private JewelryDAO jewelryDAO;
    private JewelryView jewelryView;

    public CtrlJewelry(JewelryDAO jewelryDAO, JewelryView jewelryView) {
        this.jewelryDAO = jewelryDAO;
        this.jewelryView = jewelryView;
    }

    public void iniciar() {
        int opcion;
        boolean salir = false;

        jewelryView.mostrarMensaje(" ¡Bienvenido al Sistema de Gestión de Inventario de Joyas!");

        while (!salir) {
            opcion = jewelryView.mostrarMenu();

            switch (opcion) {
                case 1: 
                    agregarJoya();
                    break;
                case 2: 
                    buscarPorSku();
                    break;
                case 3: 
                    mostrarTodasLasJoyas();
                    break;
                case 4: 
                    eliminarJoya();
                    break;
                case 5: 
                    buscarPorTipo();
                    break;
                case 6: 
                    buscarPorMaterial();
                    break;
                case 7: 
                    salir = true;
                    jewelryView.mostrarMensaje(" ¡Gracias por usar el Sistema de Inventario de Joyas!");
                    break;
                default:
                    jewelryView.mostrarMensaje(" Opción inválida. Por favor intente nuevamente.");
            }
        }
    }

    private void agregarJoya() {
        Jewelry nuevaJoya = jewelryView.obtenerDatosJoya();
        jewelryDAO.agregarJoya(nuevaJoya);
        jewelryView.mostrarMensaje(" ¡Joya agregada exitosamente!");
    }

    private void buscarPorSku() {
        String sku = jewelryView.obtenerSku();
        Jewelry joya = jewelryDAO.buscarJoyaPorSku(sku);
        jewelryView.mostrarJoya(joya);
    }

    private void mostrarTodasLasJoyas() {
        List<Jewelry> todasLasJoyas = jewelryDAO.obtenerTodas();
        jewelryView.mostrarTodasLasJoyas(todasLasJoyas);
    }

    private void eliminarJoya() {
        String sku = jewelryView.obtenerSku();
        boolean eliminada = jewelryDAO.eliminarJoya(sku);
        if (eliminada) {
            jewelryView.mostrarMensaje("¡Joya eliminada exitosamente!");
        } else {
            jewelryView.mostrarMensaje("Joya no encontrada.");
        }
    }

    private void buscarPorTipo() {
        String tipo = jewelryView.obtenerTipo();
        List<Jewelry> resultado = jewelryDAO.buscarPorTipo(tipo);
        jewelryView.mostrarMensaje("\n🔍 Resultados de búsqueda para Tipo: " + tipo);
        jewelryView.mostrarTodasLasJoyas(resultado);
    }

    private void buscarPorMaterial() {
        String material = jewelryView.obtenerMaterial();
        List<Jewelry> resultado = jewelryDAO.buscarPorMaterial(material);
        jewelryView.mostrarMensaje("\n Resultados de búsqueda para Material: " + material);
        jewelryView.mostrarTodasLasJoyas(resultado);
    }
}