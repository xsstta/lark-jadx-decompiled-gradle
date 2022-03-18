package com.bytedance.lynx.webview.util;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.feature.dynamic.DynamicModule;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.bytedance.lynx.webview.util.e */
public final class C20044e {
    /* renamed from: a */
    public static boolean m73152a(Context context, String str) {
        String[] list;
        try {
            for (String str2 : context.getAssets().list("")) {
                if (str2.contains(str.trim())) {
                    return true;
                }
            }
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fd A[SYNTHETIC, Splitter:B:63:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0107 A[SYNTHETIC, Splitter:B:68:0x0107] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0111 A[SYNTHETIC, Splitter:B:73:0x0111] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011d A[SYNTHETIC, Splitter:B:80:0x011d] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0127 A[SYNTHETIC, Splitter:B:85:0x0127] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0131 A[SYNTHETIC, Splitter:B:90:0x0131] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m73154a(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 314
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.util.C20044e.m73154a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d1 A[SYNTHETIC, Splitter:B:57:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00db A[SYNTHETIC, Splitter:B:62:0x00db] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e5 A[SYNTHETIC, Splitter:B:67:0x00e5] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f1 A[SYNTHETIC, Splitter:B:74:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00fb A[SYNTHETIC, Splitter:B:79:0x00fb] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0105 A[SYNTHETIC, Splitter:B:84:0x0105] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m73153a(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 270
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.util.C20044e.m73153a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054 A[SYNTHETIC, Splitter:B:18:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067 A[SYNTHETIC, Splitter:B:23:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m73150a(java.lang.String r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.util.C20044e.m73150a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m73151a(HashSet<String> hashSet) {
        final HashSet hashSet2 = new HashSet();
        if (hashSet != null) {
            Iterator<String> it = hashSet.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!TextUtils.isEmpty(next)) {
                    hashSet2.add(next + "_md5");
                }
            }
        }
        File file = new File(C20050i.m73175b());
        if (file.isDirectory()) {
            m73146a(0, file.listFiles(new FilenameFilter() {
                /* class com.bytedance.lynx.webview.util.C20044e.C200451 */

                public boolean accept(File file, String str) {
                    if (TextUtils.isEmpty(str) || !str.endsWith("_md5") || str.length() != 36) {
                        return false;
                    }
                    if (hashSet2.size() <= 0) {
                        return true;
                    }
                    return !hashSet2.contains(str);
                }
            }));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a6 A[SYNTHETIC, Splitter:B:22:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00be A[SYNTHETIC, Splitter:B:29:0x00be] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m73145a() {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.util.C20044e.m73145a():org.json.JSONObject");
    }

    /* renamed from: a */
    private static String m73144a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toString((b & 255) + DynamicModule.f58006b, 16).substring(1));
        }
        return sb.toString().toLowerCase(Locale.getDefault());
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003c A[SYNTHETIC, Splitter:B:25:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0042 A[SYNTHETIC, Splitter:B:31:0x0042] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m73143a(java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0040, all -> 0x0039 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0040, all -> 0x0039 }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r3 = 0
            r4 = 0
        L_0x001b:
            r5 = -1
            if (r4 == r5) goto L_0x0028
            int r4 = r2.read(r6)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            if (r4 <= 0) goto L_0x001b
            r0.update(r6, r3, r4)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            goto L_0x001b
        L_0x0028:
            byte[] r6 = r0.digest()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            java.lang.String r6 = m73144a(r6)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r2.close()     // Catch:{ Exception -> 0x0033 }
        L_0x0033:
            return r6
        L_0x0034:
            r6 = move-exception
            r0 = r2
            goto L_0x003a
        L_0x0037:
            r0 = r2
            goto L_0x0040
        L_0x0039:
            r6 = move-exception
        L_0x003a:
            if (r0 == 0) goto L_0x003f
            r0.close()     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            throw r6
        L_0x0040:
            if (r0 == 0) goto L_0x0045
            r0.close()     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.util.C20044e.m73143a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a A[SYNTHETIC, Splitter:B:20:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f A[SYNTHETIC, Splitter:B:28:0x006f] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m73155b(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.util.C20044e.m73155b(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static void m73146a(int i, File... fileArr) {
        if (fileArr == null || fileArr.length <= i) {
            C20048g.m73161a("no need to delete files");
            return;
        }
        int length = fileArr.length - i;
        for (int i2 = 0; i2 < length; i2++) {
            C20048g.m73161a("delete files=" + fileArr[i2]);
            m73149a(fileArr[i2], true);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m73148a(File file, File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        return;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            fileInputStream.close();
        }
    }

    /* renamed from: a */
    public static void m73149a(File file, boolean z) {
        if (file != null) {
            try {
                if (file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        m73149a(file2, true);
                    }
                }
                if (z) {
                    file.delete();
                }
            } catch (Exception e) {
                C20048g.m73164d("deleteRecursive File list erro", e.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m73147a(Context context, File file, String str) {
        try {
            if (!str.equals(file.getAbsolutePath())) {
                File[] listFiles = new File(str).getParentFile().listFiles();
                Arrays.sort(listFiles, new Comparator<File>() {
                    /* class com.bytedance.lynx.webview.util.C20044e.C200462 */

                    /* renamed from: a */
                    public int compare(File file, File file2) {
                        return (int) (file.lastModified() - file2.lastModified());
                    }
                });
                m73146a(5, listFiles);
            }
        } catch (Exception e) {
            C20048g.m73164d("clear so failed", e.toString());
        }
    }
}
