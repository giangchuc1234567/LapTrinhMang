package MVC;

public class CalculatorModel {
    double x,y;

    public CalculatorModel() {

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public CalculatorModel(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double add() {
        return this.x + this.y;
    }

    public double subtract() {
        return this.x - this.y;
    }

    public double multiply() {
        return this.x * this.y;
    }

    public double divide() {
        return this.x / this.y;
    }
    public double power() {
        return  Math.pow(this.x, this.y);
    }

    public double SoDu() {
        return  this.x % this.y;
    }
    public double sqrt() {
        return  Math.sqrt(this.x);
    }

    public double calculate(double a, double b, String op) {
        this.setX(a);
        this.setY(b);
        if (op.equals("+")) {
            return this.add();
        } else if (op.equals("-")) {
            return this.subtract();
        } else if (op.equals("*")) {
            return this.multiply();
        } else if (op.equals("/")) {
            return this.divide();
        }else if (op.equals("^")) {
            return this.power();
        }else if (op.equals("%")) {
            return this.SoDu();
        }else if (op.equals("sqrt")) {
            return this.sqrt();
        }else{
            return 0;
        }
    }
}
