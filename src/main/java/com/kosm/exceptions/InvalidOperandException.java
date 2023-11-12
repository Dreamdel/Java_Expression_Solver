package com.kosm.exceptions;

/**
 * Invalid operand exception class
 */
@SuppressWarnings("serial")
public class InvalidOperandException extends RuntimeException {
	
	/**
	 * Throws a InvalidOperandException with a given message
	 * @param msg message to be printed
	 */
    public InvalidOperandException(String msg) {
        super(msg);
    }
}