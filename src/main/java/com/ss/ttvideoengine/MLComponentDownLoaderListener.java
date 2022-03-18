package com.ss.ttvideoengine;

import com.bytedance.vcloud.mlcomponent_api.IMLComponentDownLoader;

public class MLComponentDownLoaderListener implements IMLComponentDownLoader {
    private IMLComponentDownLoader mInjectMLComponentDownLoader;

    public String decrypt(String str) {
        return null;
    }

    MLComponentDownLoaderListener(IMLComponentDownLoader iMLComponentDownLoader) {
        this.mInjectMLComponentDownLoader = iMLComponentDownLoader;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002b A[SYNTHETIC, Splitter:B:18:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] read(java.io.File r3) throws java.io.IOException {
        /*
            long r0 = r3.length()
            int r1 = (int) r0
            byte[] r0 = new byte[r1]
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0028 }
            r2.<init>(r3)     // Catch:{ all -> 0x0028 }
            int r3 = r2.read(r0)     // Catch:{ all -> 0x0025 }
            r1 = -1
            if (r3 == r1) goto L_0x001d
            r2.close()     // Catch:{ IOException -> 0x0018 }
            goto L_0x001c
        L_0x0018:
            r3 = move-exception
            r3.printStackTrace()
        L_0x001c:
            return r0
        L_0x001d:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "EOF reached while trying to read the whole file"
            r3.<init>(r0)
            throw r3
        L_0x0025:
            r3 = move-exception
            r1 = r2
            goto L_0x0029
        L_0x0028:
            r3 = move-exception
        L_0x0029:
            if (r1 == 0) goto L_0x0033
            r1.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0033:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.MLComponentDownLoaderListener.read(java.io.File):byte[]");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x001d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:57:0x001d */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.io.BufferedOutputStream */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: java.io.BufferedOutputStream */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: java.io.BufferedOutputStream */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: java.io.BufferedOutputStream */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c5 A[SYNTHETIC, Splitter:B:48:0x00c5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean unzipModelPackage(java.lang.String r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.MLComponentDownLoaderListener.unzipModelPackage(java.lang.String, java.lang.String):boolean");
    }

    @Override // com.bytedance.vcloud.mlcomponent_api.IMLComponentDownLoader
    public boolean downloadModelPackage(String str, String str2, String str3) {
        return this.mInjectMLComponentDownLoader.downloadModelPackage(str, str2, str3);
    }
}
