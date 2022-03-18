package com.bytedance.memory.shrink;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.memory.shrink.h */
public final class C20106h {

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.memory.shrink.h$1 */
    public static /* synthetic */ class C201071 {

        /* renamed from: a */
        static final /* synthetic */ int[] f49087a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.memory.shrink.C20106h.C201071.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static short m73401a(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if ((read | read2) >= 0) {
            return (short) (read2 | (read << 8));
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public static int m73412c(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new EOFException();
    }

    /* renamed from: d */
    public static String m73413d(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        int read = inputStream.read();
        int i = 0;
        while (read != 0) {
            sb.append((char) read);
            i++;
            if (i <= 2048) {
                read = inputStream.read();
            } else {
                throw new IOException("Bad string data which causes result to be too long.");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static long m73408b(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8];
        m73402a(inputStream, bArr, 0, 8);
        return (((long) bArr[0]) << 56) + (((long) (bArr[1] & 255)) << 48) + (((long) (bArr[2] & 255)) << 40) + (((long) (bArr[3] & 255)) << 32) + (((long) (bArr[4] & 255)) << 24) + ((long) ((bArr[5] & 255) << 16)) + ((long) ((bArr[6] & 255) << 8)) + ((long) (bArr[7] & 255));
    }

    /* renamed from: a */
    public static void m73405a(OutputStream outputStream, C20101d dVar) throws IOException {
        outputStream.write(dVar.mo68195a());
    }

    /* renamed from: a */
    public static C20101d m73398a(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        m73402a(inputStream, bArr, 0, (long) i);
        return new C20101d(bArr);
    }

    /* renamed from: a */
    public static String m73400a(InputStream inputStream, long j) throws IOException {
        byte[] bArr = new byte[((int) j)];
        m73402a(inputStream, bArr, 0, j);
        return new String(bArr, Charset.forName("UTF-8"));
    }

    /* renamed from: b */
    public static void m73409b(InputStream inputStream, long j) throws IOException {
        long j2 = 0;
        while (j2 < j) {
            long skip = inputStream.skip(j - j2);
            if (skip >= 0) {
                j2 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: b */
    public static void m73410b(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >>> 24) & 255);
        outputStream.write((i >>> 16) & 255);
        outputStream.write((i >>> 8) & 255);
        outputStream.write(i & 255);
    }

    /* renamed from: b */
    public static void m73411b(OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[4096];
        for (int i = 0; ((long) i) < (j >> 12); i++) {
            outputStream.write(bArr);
        }
        outputStream.write(bArr, 0, (int) (j & 4095));
    }

    /* renamed from: a */
    public static void m73403a(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >>> 8) & 255);
        outputStream.write(i & 255);
    }

    /* renamed from: a */
    public static void m73404a(OutputStream outputStream, long j) throws IOException {
        outputStream.write(new byte[]{(byte) ((int) (j >>> 56)), (byte) ((int) (j >>> 48)), (byte) ((int) (j >>> 40)), (byte) ((int) (j >>> 32)), (byte) ((int) (j >>> 24)), (byte) ((int) (j >>> 16)), (byte) ((int) (j >>> 8)), (byte) ((int) j)}, 0, 8);
    }

    /* renamed from: a */
    public static void m73406a(OutputStream outputStream, Object obj) throws IOException {
        if (obj == null) {
            throw new IllegalArgumentException("value is null.");
        } else if (obj instanceof C20101d) {
            m73405a(outputStream, (C20101d) obj);
        } else if ((obj instanceof Boolean) || Boolean.TYPE.isAssignableFrom(obj.getClass())) {
            outputStream.write(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if ((obj instanceof Character) || Character.TYPE.isAssignableFrom(obj.getClass())) {
            m73403a(outputStream, (int) ((Character) obj).charValue());
        } else if ((obj instanceof Float) || Float.TYPE.isAssignableFrom(obj.getClass())) {
            m73410b(outputStream, Float.floatToRawIntBits(((Float) obj).floatValue()));
        } else if ((obj instanceof Double) || Double.TYPE.isAssignableFrom(obj.getClass())) {
            m73404a(outputStream, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
        } else if ((obj instanceof Byte) || Byte.TYPE.isAssignableFrom(obj.getClass())) {
            outputStream.write(((Byte) obj).byteValue());
        } else if ((obj instanceof Short) || Short.TYPE.isAssignableFrom(obj.getClass())) {
            m73403a(outputStream, (int) ((Short) obj).shortValue());
        } else if ((obj instanceof Integer) || Integer.TYPE.isAssignableFrom(obj.getClass())) {
            m73410b(outputStream, ((Integer) obj).intValue());
        } else if ((obj instanceof Long) || Long.TYPE.isAssignableFrom(obj.getClass())) {
            m73404a(outputStream, ((Long) obj).longValue());
        } else {
            throw new IllegalArgumentException("bad value type: " + obj.getClass().getName());
        }
    }

    /* renamed from: a */
    public static void m73407a(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    public static Object m73399a(InputStream inputStream, BaseType baseType, int i) throws IOException {
        boolean z;
        switch (C201071.f49087a[baseType.ordinal()]) {
            case 1:
                return m73398a(inputStream, i);
            case 2:
                if (inputStream.read() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                return Character.valueOf((char) m73401a(inputStream));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(m73412c(inputStream)));
            case 5:
                return Double.valueOf(Double.longBitsToDouble(m73408b(inputStream)));
            case 6:
                return Byte.valueOf((byte) inputStream.read());
            case 7:
                return Short.valueOf(m73401a(inputStream));
            case 8:
                return Integer.valueOf(m73412c(inputStream));
            case 9:
                return Long.valueOf(m73408b(inputStream));
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static void m73402a(InputStream inputStream, byte[] bArr, int i, long j) throws IOException {
        int i2 = 0;
        while (true) {
            long j2 = (long) i2;
            if (j2 < j) {
                int read = inputStream.read(bArr, i2, (int) (j - j2));
                if (read >= 0) {
                    i2 += read;
                } else {
                    throw new EOFException();
                }
            } else {
                return;
            }
        }
    }
}
