package com.tdtpjava.cours;

import java.time.Instant;

public class NoZeroException extends Exception{
    private Instant date;
    public NoZeroException() {
        this(Instant.now());
    }
    public NoZeroException(String message) {
        super(message);
    }
    public NoZeroException(Instant instant) {
        super("L'erreur est survenue le " + instant + " \n Please no Zero");
        this.date = instant;
    }
}
