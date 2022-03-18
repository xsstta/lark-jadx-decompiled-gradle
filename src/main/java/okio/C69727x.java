package okio;

import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
/* renamed from: okio.x */
public final class C69727x {

    /* renamed from: a */
    public static final Charset f174176a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static int m267644a(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: a */
    public static long m267645a(long j) {
        return ((j & 255) << 56) | ((-72057594037927936L & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    /* renamed from: a */
    public static short m267646a(short s) {
        int i = s & 65535;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    /* renamed from: a */
    public static void m267648a(Throwable th) {
        m267650b(th);
    }

    /* renamed from: b */
    private static <T extends Throwable> void m267650b(Throwable th) throws Throwable {
        throw th;
    }

    /* renamed from: a */
    public static void m267647a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    /* renamed from: a */
    public static boolean m267649a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
