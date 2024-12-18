package edu.agh.wfiis.solid.ocp.task1.Operations;

import edu.agh.wfiis.solid.ocp.task1.Operational;

public class Division implements Operational {
    private String operator = "/";
    @Override
    public boolean isOperatorEqual(String operator){

        return this.operator.equals(operator);
    }
    @Override
    public Number calculate(int a, int b){
        return a / b;
    }
}
