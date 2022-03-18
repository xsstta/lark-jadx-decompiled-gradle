package org.apache.commons.codec.p3491a;

import java.nio.charset.Charset;
import org.apache.commons.codec.C69742a;

/* renamed from: org.apache.commons.codec.a.b */
public class C69744b {
    /* renamed from: a */
    public static byte[] m267691a(String str) {
        return m267692a(str, C69742a.f174205f);
    }

    /* renamed from: a */
    private static byte[] m267692a(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }
}
