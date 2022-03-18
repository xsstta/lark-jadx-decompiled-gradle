package com.bytedance.ee.bear.photopicker.photo;

public class ErrorResult {

    /* renamed from: a */
    public final CheckMediaError f28192a;

    /* renamed from: b */
    public final String f28193b;

    public enum CheckMediaError {
        CANNOT_CHECK_BOTH_TYPE,
        CANNOT_CHECK_MORE_THAN_SET
    }

    public ErrorResult(CheckMediaError checkMediaError, String str) {
        this.f28192a = checkMediaError;
        this.f28193b = str;
    }
}
