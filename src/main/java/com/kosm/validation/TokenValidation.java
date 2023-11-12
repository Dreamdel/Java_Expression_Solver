package com.kosm.validation;

import java.util.ArrayList;

import com.kosm.partition.ExpressionPart;

/**
 * Token validation interface class
 */
interface TokenValidation {
    /**
     * Method for checking if expressionPart is valid at given index
     * @param currentExp expression parts ArrayList
     * @param currentIndex index of current expression part in currentExp ArrayList
     * @return returns true if the given expression part at current index is valid, otherwise returns false
     */
    boolean performValidation(ArrayList < ExpressionPart > currentExp, int currentIndex);
}