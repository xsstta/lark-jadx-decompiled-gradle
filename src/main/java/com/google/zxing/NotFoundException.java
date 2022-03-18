package com.google.zxing;

public final class NotFoundException extends ReaderException {
    private static final NotFoundException INSTANCE;

    private NotFoundException() {
    }

    public static NotFoundException getNotFoundInstance() {
        return INSTANCE;
    }

    static {
        NotFoundException notFoundException = new NotFoundException();
        INSTANCE = notFoundException;
        notFoundException.setStackTrace(NO_TRACE);
    }
}
