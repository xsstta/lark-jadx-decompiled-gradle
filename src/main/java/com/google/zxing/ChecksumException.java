package com.google.zxing;

public final class ChecksumException extends ReaderException {
    private static final ChecksumException INSTANCE;

    private ChecksumException() {
    }

    static {
        ChecksumException checksumException = new ChecksumException();
        INSTANCE = checksumException;
        checksumException.setStackTrace(NO_TRACE);
    }

    public static ChecksumException getChecksumInstance() {
        if (isStackTrace) {
            return new ChecksumException();
        }
        return INSTANCE;
    }

    private ChecksumException(Throwable th) {
        super(th);
    }

    public static ChecksumException getChecksumInstance(Throwable th) {
        if (isStackTrace) {
            return new ChecksumException(th);
        }
        return INSTANCE;
    }
}
