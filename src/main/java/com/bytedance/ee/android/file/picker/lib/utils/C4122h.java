package com.bytedance.ee.android.file.picker.lib.utils;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0006"}, d2 = {"getMD5", "", "byteStr", "", "md5Hex", "str", "file-picker-lib_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.utils.h */
public final class C4122h {
    /* renamed from: a */
    public static final String m17160a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    Charset forName = Charset.forName("UTF-8");
                    Intrinsics.checkExpressionValueIsNotNull(forName, "Charset.forName(charsetName)");
                    byte[] bytes = str.getBytes(forName);
                    Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                    instance.update(bytes);
                    byte[] digest = instance.digest();
                    Intrinsics.checkExpressionValueIsNotNull(digest, "digester.digest()");
                    return m17161a(digest);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final String m17161a(byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "byteStr");
        StringBuffer stringBuffer = new StringBuffer();
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            Intrinsics.checkExpressionValueIsNotNull(instance, "MessageDigest.getInstance(\"MD5\")");
            instance.reset();
            instance.update(bArr);
            byte[] digest = instance.digest();
            Intrinsics.checkExpressionValueIsNotNull(digest, "byteArray");
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                if (Integer.toHexString(digest[i] & 255).length() == 1) {
                    stringBuffer.append("0");
                    stringBuffer.append(Integer.toHexString(digest[i] & 255));
                } else {
                    stringBuffer.append(Integer.toHexString(digest[i] & 255));
                }
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkExpressionValueIsNotNull(stringBuffer2, "md5StrBuff.toString()");
        return stringBuffer2;
    }
}
