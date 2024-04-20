package MVC;

import javax.swing.*;

public class CalculatorMain {
    public static void main(String[] args){
    CalculatorView view = new CalculatorView();
    CalculatorModel model = new CalculatorModel();
    CalculatorController controller = new CalculatorController(model, view);
    view.setVisible(true);

    try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }catch (Exception e){
        e.printStackTrace();
    }

    }
}
