package com.ttnet.org.chromium.base;

public class SecureRandomInitializer {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r4.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void initialize(java.security.SecureRandom r4) throws java.io.IOException {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.lang.String r1 = "/dev/urandom"
            r0.<init>(r1)
            r1 = 16
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x0020 }
            int r3 = r0.read(r2)     // Catch:{ all -> 0x0020 }
            if (r3 != r1) goto L_0x0018
            r4.setSeed(r2)     // Catch:{ all -> 0x0020 }
            r0.close()
            return
        L_0x0018:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r1 = "Failed to get enough random data."
            r4.<init>(r1)
            throw r4
        L_0x0020:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0027 }
            goto L_0x002b
        L_0x0027:
            r0 = move-exception
            r4.addSuppressed(r0)
        L_0x002b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.SecureRandomInitializer.initialize(java.security.SecureRandom):void");
    }
}
