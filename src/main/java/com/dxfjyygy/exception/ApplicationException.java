package com.dxfjyygy.exception;

/**
 * Created by longjinwen on 18/08/2017.
 */
public class ApplicationException extends Exception {

    public ApplicationException() {
        super();
    }

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
