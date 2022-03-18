package com.ss.android.lark.mediarecorder.p2245c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u001a\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u001a\u001c\u0010\f\u001a\u0004\u0018\u00010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"TAG", "", "deleteFile", "", "fileName", "mkdirIfNoExists", "", "path", "notifySystemScanFile", "context", "Landroid/content/Context;", "filePath", "saveBitmapToFile", "bmp", "Landroid/graphics/Bitmap;", "fileDir", "mediarecorder_release"}, mo238835k = 2, mv = {1, 1, 13})
/* renamed from: com.ss.android.lark.mediarecorder.c.e */
public final class C44792e {
    /* renamed from: a */
    public static final boolean m177630a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new File(str).delete();
        } catch (Exception e) {
            Log.m165383e("FileUtils", e.getMessage());
            return false;
        }
    }

    /* renamed from: b */
    public static final void m177631b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        kotlin.io.C69101b.m265907a(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        throw r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m177628a(android.graphics.Bitmap r6, java.lang.String r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x003a
            r1 = r7
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x000d
            goto L_0x003a
        L_0x000d:
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x003a }
            r2.<init>(r1)     // Catch:{ Exception -> 0x003a }
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch:{ Exception -> 0x003a }
            r1 = r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ Exception -> 0x003a }
            r3 = r2
            java.io.FileOutputStream r3 = (java.io.FileOutputStream) r3     // Catch:{ all -> 0x0033 }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0033 }
            r5 = 95
            java.io.OutputStream r3 = (java.io.OutputStream) r3     // Catch:{ all -> 0x0033 }
            boolean r6 = r6.compress(r4, r5, r3)     // Catch:{ all -> 0x0033 }
            if (r6 == 0) goto L_0x002f
            kotlin.io.C69101b.m265907a(r2, r1)
            return r7
        L_0x002f:
            kotlin.io.C69101b.m265907a(r2, r1)
            return r0
        L_0x0033:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r7 = move-exception
            kotlin.io.C69101b.m265907a(r2, r6)
            throw r7
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mediarecorder.p2245c.C44792e.m177628a(android.graphics.Bitmap, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static final void m177629a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!TextUtils.isEmpty(str)) {
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(str))));
        }
    }
}
