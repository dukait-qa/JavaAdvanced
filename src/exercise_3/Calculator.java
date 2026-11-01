package exercise_3;

public class Calculator implements Operands, Operations {
    public double a,b;

    public double add() {
        return a+b;
    }
    public double sub() {
        return a-b;
    }
    public double mul() {
        return a*b;
    }
    public double div() {
        return a/b;
    }
    public void setOperands(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
