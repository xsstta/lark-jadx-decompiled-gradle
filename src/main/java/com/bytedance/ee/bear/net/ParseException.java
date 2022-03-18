package com.bytedance.ee.bear.net;

public class ParseException extends Exception {
    public ParseException() {
        super("Parse json from server error!");
    }
}
