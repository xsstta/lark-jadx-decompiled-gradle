package com.huawei.updatesdk.p1029a.p1030a.p1035c;

import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* renamed from: com.huawei.updatesdk.a.a.c.d */
public abstract class AbstractC23838d {
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:3:0x000c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0076, code lost:
        if (r2 != null) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0050 A[Catch:{ NoSuchAlgorithmException -> 0x006f, FileNotFoundException -> 0x0065, IOException -> 0x005b, IllegalArgumentException -> 0x0051, IndexOutOfBoundsException -> 0x0047, all -> 0x0045, all -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005a A[Catch:{ NoSuchAlgorithmException -> 0x006f, FileNotFoundException -> 0x0065, IOException -> 0x005b, IllegalArgumentException -> 0x0051, IndexOutOfBoundsException -> 0x0047, all -> 0x0045, all -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0064 A[Catch:{ NoSuchAlgorithmException -> 0x006f, FileNotFoundException -> 0x0065, IOException -> 0x005b, IllegalArgumentException -> 0x0051, IndexOutOfBoundsException -> 0x0047, all -> 0x0045, all -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006e A[Catch:{ NoSuchAlgorithmException -> 0x006f, FileNotFoundException -> 0x0065, IOException -> 0x005b, IllegalArgumentException -> 0x0051, IndexOutOfBoundsException -> 0x0047, all -> 0x0045, all -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0081 A[SYNTHETIC, Splitter:B:55:0x0081] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m87127a(java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.p1029a.p1030a.p1035c.AbstractC23838d.m87127a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static void m87128a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C23834a.m87117a("FileUtil", "Closeable exception", e);
            }
        }
    }

    /* renamed from: a */
    public static boolean m87129a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                m87129a(file2);
            }
        }
        return file.delete();
    }
}
