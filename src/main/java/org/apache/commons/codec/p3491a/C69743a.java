package org.apache.commons.codec.p3491a;

import java.nio.charset.Charset;
import org.apache.commons.codec.C69742a;

/* renamed from: org.apache.commons.codec.a.a */
public class C69743a {

    /* renamed from: a */
    public static final Charset f174206a = C69742a.f174205f;

    /* renamed from: b */
    private static final char[] f174207b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c */
    private static final char[] f174208c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: d */
    private final Charset f174209d;

    public String toString() {
        return super.toString() + "[charsetName=" + this.f174209d + "]";
    }

    /* renamed from: a */
    public static char[] m267688a(byte[] bArr) {
        return m267689a(bArr, true);
    }

    /* renamed from: a */
    public static char[] m267689a(byte[] bArr, boolean z) {
        char[] cArr;
        if (z) {
            cArr = f174207b;
        } else {
            cArr = f174208c;
        }
        return m267690a(bArr, cArr);
    }

    /* renamed from: a */
    protected static char[] m267690a(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[(length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return cArr2;
    }
}
