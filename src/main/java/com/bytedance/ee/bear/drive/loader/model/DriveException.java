package com.bytedance.ee.bear.drive.loader.model;

public final class DriveException extends Exception {
    private final ErrCode errorCode;
    private Object extra;

    public ErrCode getErrorCode() {
        return this.errorCode;
    }

    public Object getExtra() {
        return this.extra;
    }

    public String toString() {
        String format = String.format("%s[%s]", getClass().getSimpleName(), this.errorCode.name());
        String localizedMessage = getLocalizedMessage();
        if (localizedMessage == null) {
            return format;
        }
        return format + ": " + localizedMessage;
    }

    public DriveException(ErrCode errCode) {
        this.errorCode = errCode;
    }

    public DriveException(ErrCode errCode, Object obj) {
        this.errorCode = errCode;
        this.extra = obj;
    }

    public DriveException(ErrCode errCode, String str) {
        super(str);
        this.errorCode = errCode;
    }

    public DriveException(ErrCode errCode, Throwable th) {
        this(errCode, (String) null, th);
    }

    public DriveException(ErrCode errCode, String str, Object obj) {
        super(str);
        this.errorCode = errCode;
        this.extra = obj;
    }

    public DriveException(ErrCode errCode, String str, Throwable th) {
        super(str, th);
        this.errorCode = errCode;
    }

    public DriveException(ErrCode errCode, String str, Throwable th, Object obj) {
        super(str, th);
        this.errorCode = errCode;
        this.extra = obj;
    }
}
