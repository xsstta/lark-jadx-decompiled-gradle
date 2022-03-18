package com.bytedance.ee.larkwebview.pool;

public class BizTagNotFoundException extends Exception {
    public BizTagNotFoundException(String str) {
        super("not found target biz tag " + str + ".");
    }
}
