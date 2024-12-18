package edu.agh.wfiis.solid.ocp.task1;

import edu.agh.wfiis.solid.ocp.task1.Operations.Addition;
import edu.agh.wfiis.solid.ocp.task1.Operations.Division;
import edu.agh.wfiis.solid.ocp.task1.Operations.Multiplication;
import edu.agh.wfiis.solid.ocp.task1.Operations.Subtraction;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    final private List<Operational> operations = new ArrayList<Operational>();
    private int value1;
    private int value2;
    private String operator;
    private Number result;

    Calculator() {
        operations.add(new Addition());
        operations.add(new Subtraction());
        operations.add(new Multiplication());
        operations.add(new Division());
    }

    private void extractArguments(String[] args) {
        value1 = Integer.valueOf(args[0]);
        value2 = Integer.valueOf(args[2]);
        operator = args[1];
    }

    private void printResult() {
        System.out.println(result);
    }

    public Number calculate(String[] args) {
        extractArguments(args);

        for (Operational operational : operations) {
            if (operational.isOperatorEqual(operator)) {
                result = operational.calculate(value1, value2);
                printResult();
                return result;
            }
        }

        throw new IllegalArgumentException(operator + " is not supported");
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate(args);
    }
}
