package com.kosm.solver;

import java.util.ArrayList;

import com.kosm.evaluation.ExpressionEvaluation;
import com.kosm.partition.ExpressionPart;
import com.kosm.partition.ExpressionPartition;
import com.kosm.validation.ExpressionValidation;


/**
 * ExpressionSolver class implementation
 */
public class ExpressionSolver {
    private ArrayList < ExpressionPart > splittedExpression;
    private ExpressionPartition expressionPartition;
    private ExpressionEvaluation expressionEvaluation;

    /**
     * Constructor with given string to solve
     * @param expression the given string to solve
     */
    public ExpressionSolver(String expression) {
        splittedExpression = new ArrayList < ExpressionPart > ();
        expressionPartition = new ExpressionPartition(expression);
        expressionEvaluation = new ExpressionEvaluation();
    }

    /**
     * The expression is being split into parts, then it checks if it's valid and it both prints and returns the result
     * @return returns the solved value if the expression is valid, otherwise returns "Invalid expression"
     */
    public String solve() {
        expressionPartition.splitIntoExpressionParts();
        splittedExpression = expressionPartition.getExpressionParts();
        if (ExpressionValidation.isValid(splittedExpression)) {
            ExpressionPart evaluatedPart = expressionEvaluation.evaluate(splittedExpression);
            printResult(evaluatedPart);
            return evaluatedPart.getExpressionPart();
        } else {
            System.out.println("Invalid expression");
            return "Invalid expression";
        }
    }

    /**
     * Prints the result
     * @param evaluatedPart the result to be printed
     */
    private void printResult(ExpressionPart evaluatedPart) {
        double result = Double.parseDouble(evaluatedPart.getExpressionPart());
        if (result == Math.floor(result)) {
            int integerResult = (int) result;
            System.out.println(integerResult);
        } else {
            System.out.println(evaluatedPart.getExpressionPart());
        }
    }
}