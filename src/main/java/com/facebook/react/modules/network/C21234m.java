package com.facebook.react.modules.network;

import com.facebook.common.logging.FLog;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* renamed from: com.facebook.react.modules.network.m */
public class C21234m {

    /* renamed from: a */
    private final CharsetDecoder f51734a;

    /* renamed from: b */
    private byte[] f51735b;

    public C21234m(Charset charset) {
        this.f51734a = charset.newDecoder();
    }

    /* renamed from: a */
    public String mo72072a(byte[] bArr, int i) {
        byte[] bArr2 = this.f51735b;
        if (bArr2 != null) {
            byte[] bArr3 = new byte[(bArr2.length + i)];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, this.f51735b.length, i);
            i += this.f51735b.length;
            bArr = bArr3;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
        boolean z = true;
        CharBuffer charBuffer = null;
        boolean z2 = false;
        int i2 = 0;
        while (!z2 && i2 < 4) {
            try {
                charBuffer = this.f51734a.decode(wrap);
                z2 = true;
            } catch (CharacterCodingException unused) {
                i2++;
                wrap = ByteBuffer.wrap(bArr, 0, i - i2);
            }
        }
        if (!z2 || i2 <= 0) {
            z = false;
        }
        if (z) {
            byte[] bArr4 = new byte[i2];
            this.f51735b = bArr4;
            System.arraycopy(bArr, i - i2, bArr4, 0, i2);
        } else {
            this.f51735b = null;
        }
        if (z2) {
            return new String(charBuffer.array(), 0, charBuffer.length());
        }
        FLog.m76614w("ReactNative", "failed to decode string from byte array");
        return "";
    }
}
