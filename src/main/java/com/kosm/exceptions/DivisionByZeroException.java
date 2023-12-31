package com.kosm.exceptions;

/**
 * Division by zero exception class
 */
@SuppressWarnings("serial")
public class DivisionByZeroException extends RuntimeException {
	
	/**
	 * Throws a DivisionByZeroException with a given message
	 * @param msg message to be printed
	 */
    public DivisionByZeroException(String msg) {
        super(msg);
    }
}