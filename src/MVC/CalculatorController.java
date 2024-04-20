package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel cm ,CalculatorView cv){
        this.model = cm;
        this.view = cv;
        view.addCalculateListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    double num1vl = view.getNum1Value();
                    double num2vl = view.getNum2Value();
                    String action = e.getActionCommand();
                    double rs = model.calculate(num1vl,num2vl,action);
                    view.setResult(rs);
                }catch (Exception e1){
                    e1.printStackTrace();
                }
            }


        });
    }


}
