package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.i */
public final class C23115i {

    /* renamed from: a */
    static final Charset f57061a = Charset.forName("UTF-8");

    /* renamed from: b */
    static final Charset f57062b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f57063c;

    /* renamed from: d */
    public static final ByteBuffer f57064d;

    /* renamed from: e */
    public static final C23108e f57065e;

    /* renamed from: com.google.protobuf.i$a */
    public interface AbstractC23116a {
    }

    /* renamed from: com.google.protobuf.i$b */
    public interface AbstractC23117b<T extends AbstractC23116a> {
    }

    /* renamed from: com.google.protobuf.i$c */
    public interface AbstractC23118c<E> extends List<E>, RandomAccess {
        /* renamed from: a */
        AbstractC23118c<E> mo80278a(int i);

        /* renamed from: a */
        boolean mo80236a();

        /* renamed from: b */
        void mo80241b();
    }

    /* renamed from: a */
    public static int m83808a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static {
        byte[] bArr = new byte[0];
        f57063c = bArr;
        f57064d = ByteBuffer.wrap(bArr);
        f57065e = C23108e.m83766a(bArr);
    }

    /* renamed from: a */
    public static int m83809a(byte[] bArr) {
        return m83810a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    static int m83810a(byte[] bArr, int i, int i2) {
        int a = m83807a(i2, bArr, i, i2);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a */
    static int m83807a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
