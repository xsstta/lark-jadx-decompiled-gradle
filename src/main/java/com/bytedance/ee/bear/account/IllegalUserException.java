package com.bytedance.ee.bear.account;

public class IllegalUserException extends Exception {
    public IllegalUserException(UserInfo userInfo) {
        super("Illegal user, user = " + userInfo);
    }
}
