import model.JewelryDAO;
import view.JewelryView;
import controller.CtrlJewelry;

public class App {
    public static void main(String[] args) {
        JewelryDAO jewelryDAO = new JewelryDAO();
        JewelryView jewelryView = new JewelryView();
        CtrlJewelry controller = new CtrlJewelry(jewelryDAO, jewelryView);
        
        controller.iniciar();
        
        
        jewelryView.cerrar();
    }
}