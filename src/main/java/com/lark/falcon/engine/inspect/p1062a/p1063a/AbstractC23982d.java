package com.lark.falcon.engine.inspect.p1062a.p1063a;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.lark.falcon.engine.inspect.a.a.d */
public abstract class AbstractC23982d {
    /* renamed from: a */
    public abstract String mo86141a();

    /* renamed from: a */
    public abstract void mo86142a(OutputStream outputStream) throws IOException;

    /* renamed from: b */
    public abstract int mo86143b();

    /* renamed from: a */
    public static AbstractC23982d m87687a(final byte[] bArr, final String str) {
        return new AbstractC23982d() {
            /* class com.lark.falcon.engine.inspect.p1062a.p1063a.AbstractC23982d.C239831 */

            @Override // com.lark.falcon.engine.inspect.p1062a.p1063a.AbstractC23982d
            /* renamed from: b */
            public int mo86143b() {
                return bArr.length;
            }

            @Override // com.lark.falcon.engine.inspect.p1062a.p1063a.AbstractC23982d
            /* renamed from: a */
            public String mo86141a() {
                return str;
            }

            @Override // com.lark.falcon.engine.inspect.p1062a.p1063a.AbstractC23982d
            /* renamed from: a */
            public void mo86142a(OutputStream outputStream) throws IOException {
                outputStream.write(bArr);
            }
        };
    }

    /* renamed from: a */
    public static AbstractC23982d m87686a(String str, String str2) {
        try {
            return m87687a(str.getBytes("UTF-8"), str2);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
