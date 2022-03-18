package com.ss.ttvideoengine.selector.shift;

public class BitrateNotMatchException extends Exception {
    private final int code;

    public int getCode() {
        return this.code;
    }

    public BitrateNotMatchException(int i, String str) {
        super(str);
        this.code = i;
    }
}
