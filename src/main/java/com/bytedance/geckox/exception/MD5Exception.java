package com.bytedance.geckox.exception;

public class MD5Exception extends RuntimeException {
    public MD5Exception(String str, Throwable th) {
        super(str, th);
    }
}
