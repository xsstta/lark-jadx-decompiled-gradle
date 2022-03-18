package com.bytedance.realx.base;

import java.io.UnsupportedEncodingException;
import java.util.Map;

class JniHelper {
    JniHelper() {
    }

    static Object getStringClass() {
        return String.class;
    }

    static Object getKey(Map.Entry entry) {
        return entry.getKey();
    }

    static Object getValue(Map.Entry entry) {
        return entry.getValue();
    }

    static byte[] getStringBytes(String str) {
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("utf-8 is unsupported");
        }
    }
}
