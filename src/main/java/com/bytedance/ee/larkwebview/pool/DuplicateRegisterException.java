package com.bytedance.ee.larkwebview.pool;

public class DuplicateRegisterException extends Exception {
    public DuplicateRegisterException(String str) {
        super("found duplicate biz tag register , biz tag " + str + " already exist.");
    }
}
