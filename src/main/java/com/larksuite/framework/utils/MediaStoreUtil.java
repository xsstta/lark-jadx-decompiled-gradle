package com.larksuite.framework.utils;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import bytedance.io.C1683a;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.collections.am;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class MediaStoreUtil {

    /* renamed from: a */
    public static final MediaStoreUtil f64797a = new MediaStoreUtil();

    /* renamed from: b */
    private static final Set<String> f64798b = am.m265689a((Object[]) new String[]{"doc", "docx", "xls", "xlsx", "pdf", "pps", "ppt", "pptx", "txt"});

    /* renamed from: a */
    public static final Uri m94879a(Context context, String str) {
        return m94882a(context, str, (String) null, (DirType) null, (ContentValues) null, 28, (Object) null);
    }

    /* renamed from: a */
    public static final Uri m94880a(Context context, String str, String str2, DirType dirType) {
        return m94882a(context, str, str2, dirType, (ContentValues) null, 16, (Object) null);
    }

    /* renamed from: a */
    public static final boolean m94892a(Context context, Bitmap bitmap, Uri uri) {
        return m94894a(context, bitmap, uri, (Bitmap.CompressFormat) null, 0, 24, (Object) null);
    }

    /* renamed from: b */
    public static final File m94896b(Context context, String str) {
        return m94898b(context, str, null, null, null, 28, null);
    }

    /* JADX WARN: Init of enum PICTURES can be incorrect */
    /* JADX WARN: Init of enum DCIM can be incorrect */
    /* JADX WARN: Init of enum DOWNLOADS can be incorrect */
    /* JADX WARN: Init of enum DOCUMENTS can be incorrect */
    /* JADX WARN: Init of enum MUSIC can be incorrect */
    /* JADX WARN: Init of enum MOVIES can be incorrect */
    public enum DirType {
        PICTURES(r2),
        DCIM(r2),
        DOWNLOADS(r2),
        DOCUMENTS(r2),
        MUSIC(r2),
        MOVIES(r2);
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        static {
            Intrinsics.checkExpressionValueIsNotNull(Environment.DIRECTORY_PICTURES, "Environment.DIRECTORY_PICTURES");
            Intrinsics.checkExpressionValueIsNotNull(Environment.DIRECTORY_DCIM, "Environment.DIRECTORY_DCIM");
            Intrinsics.checkExpressionValueIsNotNull(Environment.DIRECTORY_DOWNLOADS, "Environment.DIRECTORY_DOWNLOADS");
            Intrinsics.checkExpressionValueIsNotNull(Environment.DIRECTORY_DOCUMENTS, "Environment.DIRECTORY_DOCUMENTS");
            Intrinsics.checkExpressionValueIsNotNull(Environment.DIRECTORY_MUSIC, "Environment.DIRECTORY_MUSIC");
            Intrinsics.checkExpressionValueIsNotNull(Environment.DIRECTORY_MOVIES, "Environment.DIRECTORY_MOVIES");
        }

        private DirType(String str) {
            this.value = str;
        }
    }

    private MediaStoreUtil() {
    }

    /* renamed from: a */
    public final File mo93328a(DirType dirType) {
        Intrinsics.checkParameterIsNotNull(dirType, "dirType");
        return new File(Environment.getExternalStoragePublicDirectory(dirType.getValue()), "Lark");
    }

    /* renamed from: a */
    public final DirType mo93327a(String str) {
        if (TextUtils.isEmpty(str)) {
            return DirType.DOWNLOADS;
        }
        String d = C26311p.m95284d(str);
        Intrinsics.checkExpressionValueIsNotNull(d, "extension");
        if (mo93329b(d)) {
            return DirType.DOCUMENTS;
        }
        String b = C26311p.m95280b(d);
        Intrinsics.checkExpressionValueIsNotNull(b, "mimeType");
        if (StringsKt.startsWith$default(b, "image", false, 2, (Object) null)) {
            return DirType.PICTURES;
        }
        if (StringsKt.startsWith$default(b, "video", false, 2, (Object) null)) {
            return DirType.MOVIES;
        }
        if (StringsKt.startsWith$default(b, "audio", false, 2, (Object) null)) {
            return DirType.MUSIC;
        }
        return DirType.DOWNLOADS;
    }

    /* renamed from: a */
    static /* synthetic */ void m94889a(MediaStoreUtil mediaStoreUtil, ContentValues contentValues, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 8) != 0) {
            j = System.currentTimeMillis();
        }
        mediaStoreUtil.m94888a(contentValues, str, str2, str3, j);
    }

    /* renamed from: a */
    private final void m94888a(ContentValues contentValues, String str, String str2, String str3, long j) {
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", str2);
        contentValues.put("relative_path", str3);
        contentValues.put("date_added", Long.valueOf(j));
    }

    /* renamed from: a */
    public static final void m94891a(String str, Uri uri, Context context) {
        Intrinsics.checkParameterIsNotNull(str, "srcFile");
        Intrinsics.checkParameterIsNotNull(uri, "destUri");
        Intrinsics.checkParameterIsNotNull(context, "context");
        m94890a(new File(str), uri, context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        kotlin.io.C69101b.m265907a(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        kotlin.io.C69101b.m265907a(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        throw r5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m94890a(java.io.File r4, android.net.Uri r5, android.content.Context r6) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.utils.MediaStoreUtil.m94890a(java.io.File, android.net.Uri, android.content.Context):void");
    }

    /* renamed from: a */
    public static /* synthetic */ List m94887a(Context context, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return m94886a(context, list);
    }

    /* renamed from: a */
    public static final List<File> m94886a(Context context, List<? extends DirType> list) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (list == null) {
            list = C69043h.m265786k(DirType.values());
        }
        List<? extends DirType> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new File(Environment.getExternalStoragePublicDirectory(it.next().getValue()), "Lark"));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m94894a(Context context, Bitmap bitmap, Uri uri, Bitmap.CompressFormat compressFormat, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if ((i2 & 16) != 0) {
            i = 100;
        }
        return m94893a(context, bitmap, uri, compressFormat, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        kotlin.io.C69101b.m265907a(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        throw r3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m94893a(android.content.Context r1, android.graphics.Bitmap r2, android.net.Uri r3, android.graphics.Bitmap.CompressFormat r4, int r5) {
        /*
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            r0 = 0
            if (r1 == 0) goto L_0x002d
            if (r2 == 0) goto L_0x002d
            if (r3 == 0) goto L_0x002d
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.io.OutputStream r1 = r1.openOutputStream(r3)
            if (r1 == 0) goto L_0x002d
            java.io.Closeable r1 = (java.io.Closeable) r1
            r3 = 0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r0 = r1
            java.io.OutputStream r0 = (java.io.OutputStream) r0     // Catch:{ all -> 0x0026 }
            boolean r0 = r2.compress(r4, r5, r0)     // Catch:{ all -> 0x0026 }
            kotlin.io.C69101b.m265907a(r1, r3)
            goto L_0x002d
        L_0x0026:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r3 = move-exception
            kotlin.io.C69101b.m265907a(r1, r2)
            throw r3
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.utils.MediaStoreUtil.m94893a(android.content.Context, android.graphics.Bitmap, android.net.Uri, android.graphics.Bitmap$CompressFormat, int):boolean");
    }

    /* renamed from: a */
    public static final Uri m94878a() {
        String str;
        if (f64797a.m94904d()) {
            str = "external_primary";
        } else {
            str = "external";
        }
        Uri contentUri = MediaStore.Files.getContentUri(str);
        Intrinsics.checkExpressionValueIsNotNull(contentUri, "MediaStore.Files.getCont…_PRIMARY else \"external\")");
        return contentUri;
    }

    /* renamed from: b */
    public static final Uri m94895b() {
        if (f64797a.m94904d()) {
            Uri contentUri = MediaStore.Video.Media.getContentUri("external_primary");
            Intrinsics.checkExpressionValueIsNotNull(contentUri, "MediaStore.Video.Media.g….VOLUME_EXTERNAL_PRIMARY)");
            return contentUri;
        }
        Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        Intrinsics.checkExpressionValueIsNotNull(uri, "MediaStore.Video.Media.EXTERNAL_CONTENT_URI");
        return uri;
    }

    /* renamed from: c */
    private final boolean m94902c() {
        if (Build.VERSION.SDK_INT > 29) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final boolean m94904d() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final String m94899b(DirType dirType) {
        File a = mo93328a(dirType);
        try {
            if (!a.exists()) {
                a.mkdirs();
            }
        } catch (Exception unused) {
        }
        return dirType.getValue() + File.separator + "Lark";
    }

    /* renamed from: b */
    public final boolean mo93329b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "extension");
        return f64798b.contains(str);
    }

    /* renamed from: b */
    public static final boolean m94900b(Context context, Uri uri) {
        return C1683a.m7451a(context, uri);
    }

    /* renamed from: a */
    private final Uri m94883a(String str, String str2) {
        File file = new File(str2);
        file.mkdirs();
        return Uri.fromFile(new File(file, str));
    }

    /* renamed from: a */
    private final File m94884a(String str, DirType dirType) {
        return new File(new File(Environment.getExternalStorageDirectory(), m94899b(dirType)), str);
    }

    /* renamed from: a */
    public static final String m94885a(Context context, Uri uri) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (uri == null) {
            return "*/*";
        }
        return context.getContentResolver().getType(uri);
    }

    /* renamed from: c */
    private final Uri m94901c(Context context, String str, String str2, DirType dirType, ContentValues contentValues) {
        return C1683a.m7453b(context, str, str2, m94899b(dirType), contentValues);
    }

    /* renamed from: d */
    private final Uri m94903d(Context context, String str, String str2, DirType dirType, ContentValues contentValues) {
        return C1683a.m7454c(context, str, str2, m94899b(dirType), contentValues);
    }

    /* renamed from: e */
    private final Uri m94905e(Context context, String str, String str2, DirType dirType, ContentValues contentValues) {
        return C1683a.m7450a(context, str, str2, m94899b(dirType), contentValues);
    }

    /* renamed from: f */
    private final Uri m94906f(Context context, String str, String str2, DirType dirType, ContentValues contentValues) {
        if (m94902c()) {
            return m94907g(context, str, str2, dirType, contentValues);
        }
        return m94883a(str, m94899b(dirType));
    }

    /* renamed from: h */
    private final Uri m94908h(Context context, String str, String str2, DirType dirType, ContentValues contentValues) {
        if (m94902c()) {
            return m94909i(context, str, str2, dirType, contentValues);
        }
        return m94883a(str, m94899b(dirType));
    }

    /* renamed from: i */
    private final Uri m94909i(Context context, String str, String str2, DirType dirType, ContentValues contentValues) {
        m94889a(this, contentValues, str, str2, m94899b(dirType), 0, 8, null);
        return context.getContentResolver().insert(MediaStore.Files.getContentUri("external_primary"), contentValues);
    }

    /* renamed from: g */
    private final Uri m94907g(Context context, String str, String str2, DirType dirType, ContentValues contentValues) {
        m94889a(this, contentValues, str, str2, m94899b(dirType), 0, 8, null);
        Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
        Intrinsics.checkExpressionValueIsNotNull(contentUri, "Downloads.getContentUri(….VOLUME_EXTERNAL_PRIMARY)");
        Uri insert = context.getContentResolver().insert(contentUri, contentValues);
        if (insert == null) {
            Log.m165383e("MediaStoreUtil", "create download uri for R failed");
        }
        return insert;
    }

    /* renamed from: b */
    public static final File m94897b(Context context, String str, String str2, DirType dirType, ContentValues contentValues) {
        Intrinsics.checkParameterIsNotNull(str2, "mimeType");
        Intrinsics.checkParameterIsNotNull(dirType, "dirType");
        if (str == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            MediaStoreUtil mediaStoreUtil = f64797a;
            if (!mediaStoreUtil.m94902c()) {
                return mediaStoreUtil.m94884a(str, dirType);
            }
            File a = UriCompatUtil.m95042a(context, m94881a(context, str, str2, dirType, contentValues), false, 4, null);
            if (a != null) {
                return a;
            }
            return mediaStoreUtil.m94884a(str, dirType);
        } else if (!C26284k.m95185a(context)) {
            return null;
        } else {
            throw new RuntimeException("Filename should not be null");
        }
    }

    /* renamed from: a */
    public static final Uri m94881a(Context context, String str, String str2, DirType dirType, ContentValues contentValues) {
        Intrinsics.checkParameterIsNotNull(str2, "mimeType");
        Intrinsics.checkParameterIsNotNull(dirType, "dirType");
        if (context == null) {
            Log.m165383e("MediaStoreUtil", "context is null");
            return null;
        } else if (str == null || TextUtils.isEmpty(str)) {
            Log.m165383e("MediaStoreUtil", "filename is not valid");
            return null;
        } else {
            if (contentValues == null) {
                contentValues = new ContentValues();
            }
            switch (C26321u.f64965a[dirType.ordinal()]) {
                case 1:
                    return f64797a.m94903d(context, str, str2, dirType, contentValues);
                case 2:
                    return f64797a.m94908h(context, str, str2, dirType, contentValues);
                case 3:
                    return f64797a.m94901c(context, str, str2, dirType, contentValues);
                case 4:
                case 5:
                    return f64797a.m94905e(context, str, str2, dirType, contentValues);
                case 6:
                    return f64797a.m94906f(context, str, str2, dirType, contentValues);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ File m94898b(Context context, String str, String str2, DirType dirType, ContentValues contentValues, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = C26311p.m95283c(str);
            Intrinsics.checkExpressionValueIsNotNull(str2, "FileUtils.getMIMEType(filename)");
        }
        if ((i & 8) != 0) {
            dirType = f64797a.mo93327a(str);
        }
        if ((i & 16) != 0) {
            contentValues = new ContentValues();
        }
        return m94897b(context, str, str2, dirType, contentValues);
    }

    /* renamed from: a */
    public static /* synthetic */ Uri m94882a(Context context, String str, String str2, DirType dirType, ContentValues contentValues, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = C26311p.m95283c(str);
            Intrinsics.checkExpressionValueIsNotNull(str2, "FileUtils.getMIMEType(filename)");
        }
        if ((i & 8) != 0) {
            dirType = f64797a.mo93327a(str);
        }
        if ((i & 16) != 0) {
            contentValues = new ContentValues();
        }
        return m94881a(context, str, str2, dirType, contentValues);
    }
}
