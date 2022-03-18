package com.bumptech.glide.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.util.a */
public final class C2542a {

    /* renamed from: a */
    private static final AtomicReference<byte[]> f8259a = new AtomicReference<>();

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.util.a$a */
    public static class C2543a extends InputStream {

        /* renamed from: a */
        private final ByteBuffer f8260a;

        /* renamed from: b */
        private int f8261b = -1;

        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f8260a.remaining();
        }

        @Override // java.io.InputStream
        public int read() {
            if (!this.f8260a.hasRemaining()) {
                return -1;
            }
            return this.f8260a.get() & 255;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i = this.f8261b;
            if (i != -1) {
                this.f8260a.position(i);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        C2543a(ByteBuffer byteBuffer) {
            this.f8260a = byteBuffer;
        }

        public synchronized void mark(int i) {
            this.f8261b = this.f8260a.position();
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            if (!this.f8260a.hasRemaining()) {
                return -1;
            }
            long min = Math.min(j, (long) available());
            ByteBuffer byteBuffer = this.f8260a;
            byteBuffer.position((int) (((long) byteBuffer.position()) + min));
            return min;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.f8260a.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, available());
            this.f8260a.get(bArr, i, min);
            return min;
        }
    }

    /* renamed from: b */
    public static InputStream m10847b(ByteBuffer byteBuffer) {
        return new C2543a(byteBuffer);
    }

    /* renamed from: c */
    private static C2544b m10848c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new C2544b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* renamed from: a */
    public static ByteBuffer m10844a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f8259a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                f8259a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|(2:10|11)|12|13|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049 A[SYNTHETIC, Splitter:B:24:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0050 A[SYNTHETIC, Splitter:B:28:0x0050] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m10843a(java.io.File r8) throws java.io.IOException {
        /*
            r0 = 0
            long r5 = r8.length()     // Catch:{ all -> 0x0045 }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x003d
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0035
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "r"
            r7.<init>(r8, r1)     // Catch:{ all -> 0x0045 }
            java.nio.channels.FileChannel r0 = r7.getChannel()     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0033 }
            r3 = 0
            r1 = r0
            java.nio.MappedByteBuffer r8 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0033 }
            java.nio.MappedByteBuffer r8 = r8.load()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            r7.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r8
        L_0x0033:
            r8 = move-exception
            goto L_0x0047
        L_0x0035:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r1 = "File unsuitable for memory mapping"
            r8.<init>(r1)
            throw r8
        L_0x003d:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r1 = "File too large to map into memory"
            r8.<init>(r1)
            throw r8
        L_0x0045:
            r8 = move-exception
            r7 = r0
        L_0x0047:
            if (r0 == 0) goto L_0x004e
            r0.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x004e
        L_0x004d:
        L_0x004e:
            if (r7 == 0) goto L_0x0053
            r7.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.util.C2542a.m10843a(java.io.File):java.nio.ByteBuffer");
    }

    /* renamed from: a */
    public static byte[] m10846a(ByteBuffer byteBuffer) {
        C2544b c = m10848c(byteBuffer);
        if (c != null && c.f8262a == 0 && c.f8263b == c.f8264c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|(2:6|7)|8|9|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b A[SYNTHETIC, Splitter:B:15:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032 A[SYNTHETIC, Splitter:B:19:0x0032] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m10845a(java.nio.ByteBuffer r4, java.io.File r5) throws java.io.IOException {
        /*
            r0 = 0
            r4.position(r0)
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = "rw"
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0027 }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ all -> 0x0025 }
            r1.write(r4)     // Catch:{ all -> 0x0025 }
            r1.force(r0)     // Catch:{ all -> 0x0025 }
            r1.close()     // Catch:{ all -> 0x0025 }
            r2.close()     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0021
            r1.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            r2.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            return
        L_0x0025:
            r4 = move-exception
            goto L_0x0029
        L_0x0027:
            r4 = move-exception
            r2 = r1
        L_0x0029:
            if (r1 == 0) goto L_0x0030
            r1.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0030
        L_0x002f:
        L_0x0030:
            if (r2 == 0) goto L_0x0035
            r2.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.util.C2542a.m10845a(java.nio.ByteBuffer, java.io.File):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.util.a$b */
    public static final class C2544b {

        /* renamed from: a */
        final int f8262a;

        /* renamed from: b */
        final int f8263b;

        /* renamed from: c */
        final byte[] f8264c;

        C2544b(byte[] bArr, int i, int i2) {
            this.f8264c = bArr;
            this.f8262a = i;
            this.f8263b = i2;
        }
    }
}
