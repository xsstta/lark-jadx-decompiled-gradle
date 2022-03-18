package com.he.v8_inspect.server.websocket;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Utf8Charset {
    public static final Charset INSTANCE = Charset.forName("UTF-8");

    public static String decodeUTF8(byte[] bArr) {
        return new String(bArr, INSTANCE);
    }

    public static byte[] encodeUTF8(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
