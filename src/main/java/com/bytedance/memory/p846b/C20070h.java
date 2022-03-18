package com.bytedance.memory.p846b;

import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: com.bytedance.memory.b.h */
public class C20070h {
    /* renamed from: a */
    public static File m73234a(File file, boolean z) {
        File parentFile = file.getParentFile();
        File file2 = new File(parentFile, file.getName().substring(0, file.getName().lastIndexOf(".")) + ".zip");
        m73235a(file, file2);
        if (file2.exists() && z) {
            file.delete();
        }
        return file2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b A[SYNTHETIC, Splitter:B:21:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m73235a(java.io.File r6, java.io.File r7) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0036 }
            r4.<init>(r7)     // Catch:{ Exception -> 0x0036 }
            java.util.zip.ZipOutputStream r7 = new java.util.zip.ZipOutputStream     // Catch:{ Exception -> 0x0036 }
            r7.<init>(r4)     // Catch:{ Exception -> 0x0036 }
            java.lang.String r3 = r6.getName()     // Catch:{ Exception -> 0x0031, all -> 0x002e }
            m73237a(r6, r7, r3)     // Catch:{ Exception -> 0x0031, all -> 0x002e }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0031, all -> 0x002e }
            java.lang.String r6 = "Compress over cost： %d ms"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0031, all -> 0x002e }
            long r3 = r3 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x0031, all -> 0x002e }
            r5[r2] = r0     // Catch:{ Exception -> 0x0031, all -> 0x002e }
            com.bytedance.memory.p846b.C20063c.m73220a(r6, r5)     // Catch:{ Exception -> 0x0031, all -> 0x002e }
            r7.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0048
        L_0x002e:
            r6 = move-exception
            r3 = r7
            goto L_0x0049
        L_0x0031:
            r6 = move-exception
            r3 = r7
            goto L_0x0037
        L_0x0034:
            r6 = move-exception
            goto L_0x0049
        L_0x0036:
            r6 = move-exception
        L_0x0037:
            java.lang.String r7 = "HeapFile compress failed"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0034 }
            com.bytedance.memory.p846b.C20063c.m73221a(r6, r7, r0)     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x0048
            r3.close()
            goto L_0x0048
        L_0x0044:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0048:
            return
        L_0x0049:
            if (r3 == 0) goto L_0x0053
            r3.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0053:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.memory.p846b.C20070h.m73235a(java.io.File, java.io.File):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0064 A[SYNTHETIC, Splitter:B:34:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007a A[SYNTHETIC, Splitter:B:44:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0084 A[SYNTHETIC, Splitter:B:49:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m73236a(java.io.File r9, java.io.File r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.memory.p846b.C20070h.m73236a(java.io.File, java.io.File, boolean):void");
    }

    /* renamed from: a */
    private static void m73237a(File file, ZipOutputStream zipOutputStream, String str) throws Exception {
        byte[] bArr = new byte[2048];
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read != -1) {
                zipOutputStream.write(bArr, 0, read);
            } else {
                zipOutputStream.closeEntry();
                fileInputStream.close();
                return;
            }
        }
    }
}
