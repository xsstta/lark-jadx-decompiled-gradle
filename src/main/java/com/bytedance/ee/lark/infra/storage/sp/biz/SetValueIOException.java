package com.bytedance.ee.lark.infra.storage.sp.biz;

import java.io.IOException;

public class SetValueIOException extends IOException {
    private int code = -1;

    public int getCode() {
        return this.code;
    }

    public SetValueIOException(int i, String str) {
        super(str);
        this.code = i;
    }
}
