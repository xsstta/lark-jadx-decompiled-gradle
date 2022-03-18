package com.lark.falcon.engine.inspect.p1062a.p1064b;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.lark.falcon.engine.inspect.a.b.h */
public class C24001h {

    /* renamed from: a */
    public static final Charset f59363a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static byte[] m87740a(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
