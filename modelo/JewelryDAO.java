package model;

import java.util.ArrayList;
import java.util.List;

public class JewelryDAO {
    private List<Jewelry> joyas;

    public JewelryDAO() {
        this.joyas = new ArrayList<>();
        inicializarDatosEjemplo();
    }

    private void inicializarDatosEjemplo() {
        agregarJoya(new Jewelry("ORO-A001", "Anillo de Compromiso Diamante", "anillo", "oro blanco", 
                               4.5, 2, 2500.00, "Diamante corte redondo brillante"));
        agregarJoya(new Jewelry("PLATA-C001", "Collar de Cadena Plata", "collar", "plata esterlina", 
                               25.0, 5, 180.00, "Cadena clásica tipo cable"));
        agregarJoya(new Jewelry("PLAT-A001", "Aretes de Platino", "aretes", "platino", 
                               3.2, 3, 1200.00, "Aretes simples y elegantes"));
    }

    public void agregarJoya(Jewelry joya) {
        joyas.add(joya);
    }

    public Jewelry buscarJoyaPorSku(String sku) {
        for (Jewelry joya : joyas) {
            if (joya.getSku().equalsIgnoreCase(sku)) {
                return joya;
            }
        }
        return null;
    }

    public List<Jewelry> obtenerTodas() {
        return new ArrayList<>(joyas);
    }

    public boolean eliminarJoya(String sku) {
        Jewelry joyaAEliminar = buscarJoyaPorSku(sku);
        if (joyaAEliminar != null) {
            joyas.remove(joyaAEliminar);
            return true;
        }
        return false;
    }

    public List<Jewelry> buscarPorTipo(String tipo) {
        List<Jewelry> resultado = new ArrayList<>();
        for (Jewelry joya : joyas) {
            if (joya.getTipo().equalsIgnoreCase(tipo)) {
                resultado.add(joya);
            }
        }
        return resultado;
    }

    public List<Jewelry> buscarPorMaterial(String material) {
        List<Jewelry> resultado = new ArrayList<>();
        for (Jewelry joya : joyas) {
            if (joya.getMaterial().equalsIgnoreCase(material)) {
                resultado.add(joya);
            }
        }
        return resultado;
    }
}