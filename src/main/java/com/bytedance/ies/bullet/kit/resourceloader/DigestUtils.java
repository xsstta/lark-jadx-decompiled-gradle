package com.bytedance.ies.bullet.kit.resourceloader;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\"\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/DigestUtils;", "", "()V", "HEX_CHARS", "", "md5Hex", "", "str", "toHexString", "bytes", "", "off", "", "len", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.a.a.b */
public final class DigestUtils {

    /* renamed from: a */
    public static final DigestUtils f37767a = new DigestUtils();

    /* renamed from: b */
    private static final char[] f37768b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private DigestUtils() {
    }

    /* renamed from: a */
    private final String m57891a(byte[] bArr) {
        if (bArr != null) {
            return m57892a(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    /* renamed from: a */
    public final String mo52548a(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        try {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return null;
            }
            MessageDigest instance = MessageDigest.getInstance("MD5");
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkExpressionValueIsNotNull(forName, "Charset.forName(charsetName)");
            byte[] bytes = str.getBytes(forName);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            instance.update(bytes);
            return m57891a(instance.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final String m57892a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = bArr[i5 + i] & 255;
                int i7 = i4 + 1;
                char[] cArr2 = f37768b;
                cArr[i4] = cArr2[i6 >> 4];
                i4 = i7 + 1;
                cArr[i7] = cArr2[i6 & 15];
            }
            return new String(cArr, 0, i3);
        }
    }
}
