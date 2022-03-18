package com.ss.android.bytedcert.utils;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;

/* renamed from: com.ss.android.bytedcert.utils.e */
public class C28439e {
    /* renamed from: a */
    private static boolean m104227a(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    /* renamed from: b */
    private static boolean m104229b(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* renamed from: b */
    private static String m104228b(Context context, Uri uri) {
        return m104226a(context, uri, null, null);
    }

    /* renamed from: a */
    public static String m104225a(Context context, Uri uri) {
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                return m104230c(context, uri);
            }
            return m104228b(context, uri);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private static String m104230c(Context context, Uri uri) {
        String a;
        if ("content".equalsIgnoreCase(uri.getScheme())) {
            return m104226a(context, uri, null, null);
        }
        if (DocumentsContract.isDocumentUri(context, uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            if (m104227a(uri)) {
                a = m104226a(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{documentId.split(":")[1]});
            } else if (!m104229b(uri)) {
                return null;
            } else {
                a = m104226a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
            }
            return a;
        } else if ("file".equals(uri.getScheme())) {
            return uri.getPath();
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r8 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r8 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        return r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m104226a(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            r6 = 0
            r2 = r9
            r3 = r0
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            if (r8 == 0) goto L_0x002b
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0029 }
            if (r9 == 0) goto L_0x002b
            r9 = 0
            r9 = r0[r9]     // Catch:{ Exception -> 0x0029 }
            int r9 = r8.getColumnIndexOrThrow(r9)     // Catch:{ Exception -> 0x0029 }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ Exception -> 0x0029 }
            r7 = r9
            goto L_0x002b
        L_0x0029:
            r9 = move-exception
            goto L_0x0035
        L_0x002b:
            if (r8 == 0) goto L_0x003b
        L_0x002d:
            r8.close()
            goto L_0x003b
        L_0x0031:
            r9 = move-exception
            goto L_0x003e
        L_0x0033:
            r9 = move-exception
            r8 = r7
        L_0x0035:
            r9.printStackTrace()     // Catch:{ all -> 0x003c }
            if (r8 == 0) goto L_0x003b
            goto L_0x002d
        L_0x003b:
            return r7
        L_0x003c:
            r9 = move-exception
            r7 = r8
        L_0x003e:
            if (r7 == 0) goto L_0x0043
            r7.close()
        L_0x0043:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.bytedcert.utils.C28439e.m104226a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
