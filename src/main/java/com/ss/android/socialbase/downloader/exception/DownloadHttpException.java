package com.ss.android.socialbase.downloader.exception;

public class DownloadHttpException extends BaseException {
    private final int httpStatusCode;

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DownloadHttpException(int i, int i2, String str) {
        super(i, str);
        this.httpStatusCode = i2;
    }
}
