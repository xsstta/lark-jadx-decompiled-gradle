package com.google.zxing;

public final class FormatException extends ReaderException {
    private static final FormatException INSTANCE;

    private FormatException() {
    }

    static {
        FormatException formatException = new FormatException();
        INSTANCE = formatException;
        formatException.setStackTrace(NO_TRACE);
    }

    public static FormatException getFormatInstance() {
        if (isStackTrace) {
            return new FormatException();
        }
        return INSTANCE;
    }
}
