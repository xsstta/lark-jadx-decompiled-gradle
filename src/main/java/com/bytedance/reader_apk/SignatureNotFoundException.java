package com.bytedance.reader_apk;

public class SignatureNotFoundException extends Exception {
    private static final long serialVersionUID = 1;

    public SignatureNotFoundException(String str) {
        super(str);
    }
}
