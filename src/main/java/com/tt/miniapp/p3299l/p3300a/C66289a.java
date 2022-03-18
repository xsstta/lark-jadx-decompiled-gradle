package com.tt.miniapp.p3299l.p3300a;

import java.nio.ByteBuffer;

/* renamed from: com.tt.miniapp.l.a.a */
public class C66289a {

    /* renamed from: a */
    public long f167289a;

    /* renamed from: b */
    public int f167290b;

    /* renamed from: c */
    public int f167291c;

    public String toString() {
        return "[" + this.f167289a + "," + this.f167290b + "," + this.f167291c + "]";
    }

    /* renamed from: a */
    private byte[] m259361a() {
        byte[] bArr = new byte[16];
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(0, this.f167289a);
        System.arraycopy(allocate.array(), 0, bArr, 0, 8);
        allocate.putInt(0, this.f167290b);
        System.arraycopy(allocate.array(), 0, bArr, 8, 4);
        allocate.putInt(0, this.f167291c);
        System.arraycopy(allocate.array(), 0, bArr, 12, 4);
        return bArr;
    }

    /* renamed from: a */
    private void m259360a(byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.put(bArr, 0, 8).flip();
        this.f167289a = allocate.getLong();
        allocate.rewind();
        allocate.put(bArr, 8, 4).flip();
        this.f167290b = allocate.getInt();
        allocate.rewind();
        allocate.put(bArr, 12, 4).flip();
        this.f167291c = allocate.getInt();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047 A[SYNTHETIC, Splitter:B:22:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059 A[SYNTHETIC, Splitter:B:29:0x0059] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo231683b(java.io.File r9) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.p3299l.p3300a.C66289a.mo231683b(java.io.File):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[SYNTHETIC, Splitter:B:18:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042 A[SYNTHETIC, Splitter:B:23:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo231682a(java.io.File r6) {
        /*
            r5 = this;
            java.lang.String r0 = "FileConfig"
            r1 = 0
            r2 = 1
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0029 }
            r4.<init>(r6)     // Catch:{ IOException -> 0x0029 }
            byte[] r6 = r5.m259361a()     // Catch:{ IOException -> 0x0024, all -> 0x0021 }
            r4.write(r6)     // Catch:{ IOException -> 0x0024, all -> 0x0021 }
            r4.flush()     // Catch:{ IOException -> 0x0024, all -> 0x0021 }
            r4.close()     // Catch:{ IOException -> 0x0018 }
            goto L_0x003f
        L_0x0018:
            r6 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e(r0, r2)
            goto L_0x003f
        L_0x0021:
            r6 = move-exception
            r3 = r4
            goto L_0x0040
        L_0x0024:
            r6 = move-exception
            r3 = r4
            goto L_0x002a
        L_0x0027:
            r6 = move-exception
            goto L_0x0040
        L_0x0029:
            r6 = move-exception
        L_0x002a:
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0027 }
            r4[r1] = r6     // Catch:{ all -> 0x0027 }
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e(r0, r4)     // Catch:{ all -> 0x0027 }
            if (r3 == 0) goto L_0x003f
            r3.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x003f
        L_0x0037:
            r6 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e(r0, r2)
        L_0x003f:
            return
        L_0x0040:
            if (r3 == 0) goto L_0x004e
            r3.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x004e
        L_0x0046:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r3
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e(r0, r2)
        L_0x004e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.p3299l.p3300a.C66289a.mo231682a(java.io.File):void");
    }
}
