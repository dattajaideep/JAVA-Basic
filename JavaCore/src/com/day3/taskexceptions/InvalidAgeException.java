package com.day3.taskexceptions;

public class InvalidAgeException extends Exception{
	private static final long serialVersionUID = 5104477637617509302L;

	public InvalidAgeException(String message) {
		super(message);
	}
}
