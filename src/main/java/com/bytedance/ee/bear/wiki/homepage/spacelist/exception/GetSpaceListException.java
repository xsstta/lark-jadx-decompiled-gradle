package com.bytedance.ee.bear.wiki.homepage.spacelist.exception;

public class GetSpaceListException extends Exception {
    private Throwable mOriginException;

    public GetSpaceListException() {
    }

    public Throwable getOriginException() {
        return this.mOriginException;
    }

    public GetSpaceListException(Throwable th) {
        this.mOriginException = th;
    }
}
