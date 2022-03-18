package com.bytedance.ee.bear.basesdk.business.follow;

public class UnsupportedFollowTypeException extends Exception {
    public UnsupportedFollowTypeException() {
    }

    public UnsupportedFollowTypeException(String str) {
        super(str);
    }
}
