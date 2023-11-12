package com.kosm.operators;

import com.kosm.exceptions.InvalidOperandException;

/**
 * Operator interface class
 */
public interface Operator {
    /**
     * Method for performing calculations in inherited classes
     * @param operands array of operands to perform the calculation
     * @return returns the result of operations
     * @throws InvalidOperandException if invalid number of operands is given
     */
    public Double doCalculation(Double...operands) throws InvalidOperandException;
}