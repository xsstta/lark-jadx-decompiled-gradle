package com.bytedance.ee.bear.account;

public class LoginException extends Exception {
    private int returnCode = 100;

    public int getReturnCode() {
        return this.returnCode;
    }

    public LoginException(String str) {
        super(str);
    }

    public LoginException(int i) {
        super("login failed, code = " + i);
        this.returnCode = i;
    }
}
