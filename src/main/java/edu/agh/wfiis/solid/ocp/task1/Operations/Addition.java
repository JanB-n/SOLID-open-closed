package edu.agh.wfiis.solid.ocp.task1;

public class Addition implements Operational{
    private String operator = "+";

    public boolean isOperatorEqual(String operator){
        return this.operator.equals(operator);
    }

    public Number calculate(int a, int b){
        return a + b;
    }
}
