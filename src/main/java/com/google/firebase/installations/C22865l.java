package com.google.firebase.installations;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: com.google.firebase.installations.l */
public class C22865l {

    /* renamed from: a */
    private static final byte f56514a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f56515b = Byte.parseByte("00001111", 2);

    /* renamed from: a */
    public String mo79394a() {
        byte[] a = m83017a(UUID.randomUUID(), new byte[17]);
        a[16] = a[0];
        a[0] = (byte) ((f56515b & a[0]) | f56514a);
        return m83016a(a);
    }

    /* renamed from: a */
    private static String m83016a(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: a */
    private static byte[] m83017a(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }
}
