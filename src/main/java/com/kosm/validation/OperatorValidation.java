package com.kosm.validation;

import java.util.ArrayList;

import com.kosm.data.ExpressionData;
import com.kosm.exceptions.InvalidCharacterException;
import com.kosm.partition.ExpressionPart;

/**
 * Validator implementation for operators numbers
 */
public class OperatorValidation implements TokenValidation {
	
	/**
	 * Default constructor without parameters
	 */
	public OperatorValidation() {}

	/**
     * Validate the given expression part is valid at current index
     * @param currentExp ArrayList of current expression parts
     * @param currentIndex index of current expression part in currentExp ArrayList
     * @return returns true if the given expression part at current index is valid, otherwise returns false
     */
    @Override
    public boolean performValidation(ArrayList < ExpressionPart > currentExp, int currentIndex) {
        String currentExpression = currentExp.get(currentIndex).getExpressionPart();
        boolean result = true;
        if (currentIndex == currentExp.size() - 1 && ExpressionData.isOperator(currentExpression)) {
            result = false;
            throw new InvalidCharacterException("Operator at the end of the expression: " + currentExpression);
        }
        if (ExpressionData.isOperator(currentExpression) && (ExpressionData.isOperator(currentExp.get(currentIndex + 1).getExpressionPart()) && currentExp.get(currentIndex + 1).getExpressionPart().equals(currentExpression))) {
            result = false;
            throw new InvalidCharacterException("More than 2 operators at: " + currentExpression + currentExp.get(currentIndex + 1).getExpressionPart());
        }
        return result;
    }
}