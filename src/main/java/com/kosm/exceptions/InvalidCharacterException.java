package com.kosm.exceptions;

/**
 * Invalid character exception class
 */
@SuppressWarnings("serial")
public class InvalidCharacterException extends RuntimeException {
	
	/**
	 * Throws a InvalidCharacterException with a given message
	 * @param msg message to be printed
	 */
	public InvalidCharacterException(String msg) {
        super(msg);
    }
}
