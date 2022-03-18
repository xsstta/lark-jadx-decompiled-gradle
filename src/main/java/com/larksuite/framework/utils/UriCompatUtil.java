package com.larksuite.framework.utils;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.larksuite.framework.utils.file.direct.DirectFileAccess;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.larksuite.framework.utils.ap */
public final class UriCompatUtil {

    /* renamed from: a */
    public static final UriCompatUtil f64857a = new UriCompatUtil();

    /* renamed from: b */
    private static final List<String> f64858b = CollectionsKt.listOf((Object[]) new String[]{"content://downloads/public_downloads", "content://downloads/my_downloads", "content://downloads/all_downloads"});

    /* renamed from: a */
    public static final File m95039a(Context context, Uri uri) {
        return m95042a(context, uri, false, 4, null);
    }

    private UriCompatUtil() {
    }

    /* renamed from: a */
    private final boolean m95048a(File file) {
        return file != null && file.exists() && file.canRead();
    }

    /* renamed from: a */
    private final File m95045a(String str, boolean z) {
        return m95050b(StringsKt.replaceFirst$default(str, "raw:", "", false, 4, (Object) null), z);
    }

    /* renamed from: b */
    private final File m95050b(String str, boolean z) {
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (!z) {
            return file;
        }
        if (m95048a(file)) {
            return file;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        kotlin.io.C69101b.m265907a(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m95051b(android.content.Context r8, android.net.Uri r9) {
        /*
            r7 = this;
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x0039 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r9
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0039 }
            java.io.Closeable r8 = (java.io.Closeable) r8     // Catch:{ Exception -> 0x0039 }
            r9 = r0
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ Exception -> 0x0039 }
            r1 = r8
            android.database.Cursor r1 = (android.database.Cursor) r1     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x002c
            boolean r2 = r1.moveToFirst()     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x002c
            java.lang.String r2 = "_display_name"
            int r2 = r1.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = r1.getString(r2)     // Catch:{ all -> 0x0032 }
            kotlin.io.C69101b.m265907a(r8, r9)
            return r1
        L_0x002c:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            kotlin.io.C69101b.m265907a(r8, r9)
            goto L_0x0039
        L_0x0032:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r1 = move-exception
            kotlin.io.C69101b.m265907a(r8, r9)
            throw r1
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.utils.UriCompatUtil.m95051b(android.content.Context, android.net.Uri):java.lang.String");
    }

    /* renamed from: a */
    private final File m95044a(Uri uri, boolean z) {
        String documentId = DocumentsContract.getDocumentId(uri);
        Intrinsics.checkExpressionValueIsNotNull(documentId, "docId");
        String str = documentId;
        List split$default = StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null);
        if (split$default.size() <= 1) {
            return null;
        }
        String str2 = (String) split$default.get(0);
        String str3 = (String) split$default.get(1);
        File file = null;
        if (StringsKt.equals(str2, "primary", true)) {
            file = new File(Environment.getExternalStorageDirectory(), str3);
        } else if (StringsKt.equals(str2, "home", true)) {
            file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), str3);
        }
        if (m95048a(file)) {
            return file;
        }
        File file2 = new File(Environment.getExternalStorageDirectory(), str3);
        if (m95048a(file2)) {
            return file2;
        }
        if (split$default.size() > 2) {
            String substring = documentId.substring(StringsKt.indexOf$default((CharSequence) str, ':', 0, false, 6, (Object) null) + 1);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
            File file3 = new File(Environment.getExternalStorageDirectory(), substring);
            if (m95048a(file3)) {
                Log.m165397w("UriCompatUtil", "Illegal File Name Found");
                return file3;
            }
        }
        for (String str4 : CollectionsKt.listOf((Object[]) new String[]{"SECONDARY_STORAGE", "EXTERNAL_STORAGE"})) {
            File file4 = new File(str4, str3);
            if (f64857a.m95048a(file4)) {
                return file4;
            }
        }
        return null;
    }

    /* renamed from: g */
    private final File m95056g(Context context, Uri uri, boolean z) {
        if (!StringsKt.equals("file", uri.getScheme(), true)) {
            return null;
        }
        return m95050b(uri.getPath(), z);
    }

    /* renamed from: d */
    private final File m95053d(Context context, Uri uri, boolean z) {
        String b = m95051b(context, uri);
        if (b == null) {
            return null;
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        Intrinsics.checkExpressionValueIsNotNull(externalStoragePublicDirectory, "Environment.getExternalS…ment.DIRECTORY_DOWNLOADS)");
        File b2 = m95050b(Uri.withAppendedPath(Uri.parse(externalStoragePublicDirectory.getAbsolutePath()), b).toString(), z);
        if (m95048a(b2)) {
            return b2;
        }
        return null;
    }

    /* renamed from: a */
    public static final File m95041a(Context context, Uri uri, boolean z) {
        if (context == null) {
            Log.m165383e("UriCompatUtil", "context is null");
            return null;
        } else if (uri == null) {
            Log.m165383e("UriCompatUtil", "uri is null");
            return null;
        } else {
            UriCompatUtil apVar = f64857a;
            File b = apVar.m95049b(context, uri, z);
            if (b == null) {
                b = apVar.m95055f(context, uri, z);
            }
            if (b != null) {
                return b;
            }
            return apVar.m95056g(context, uri, z);
        }
    }

    /* renamed from: b */
    private final File m95049b(Context context, Uri uri, boolean z) {
        String authority;
        if (!DocumentsContract.isDocumentUri(context, uri) || (authority = uri.getAuthority()) == null) {
            return null;
        }
        int hashCode = authority.hashCode();
        if (hashCode != 320699453) {
            if (hashCode != 596745902) {
                if (hashCode == 1734583286 && authority.equals("com.android.providers.media.documents")) {
                    return m95054e(context, uri, z);
                }
                return null;
            } else if (authority.equals("com.android.externalstorage.documents")) {
                return m95044a(uri, z);
            } else {
                return null;
            }
        } else if (authority.equals("com.android.providers.downloads.documents")) {
            return m95052c(context, uri, z);
        } else {
            return null;
        }
    }

    /* renamed from: c */
    private final File m95052c(Context context, Uri uri, boolean z) {
        String documentId = DocumentsContract.getDocumentId(uri);
        if (aj.m95023c(documentId)) {
            Intrinsics.checkExpressionValueIsNotNull(documentId, "docId");
            return m95040a(context, uri, Long.parseLong(documentId), z);
        }
        Intrinsics.checkExpressionValueIsNotNull(documentId, "docId");
        if (StringsKt.startsWith$default(documentId, "raw:", false, 2, (Object) null)) {
            return m95045a(documentId, z);
        }
        if (!StringsKt.startsWith$default(documentId, "msf:", false, 2, (Object) null) || Build.VERSION.SDK_INT < 29) {
            return null;
        }
        return m95043a(context, documentId, z);
    }

    /* renamed from: a */
    private final File m95043a(Context context, String str, boolean z) {
        Object[] array = StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null).toArray(new String[0]);
        if (array != null) {
            Uri uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
            Intrinsics.checkExpressionValueIsNotNull(uri, "Downloads.EXTERNAL_CONTENT_URI");
            return m95050b(m95046a(context, uri, ((String[]) array)[1]), z);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: e */
    private final File m95054e(Context context, Uri uri, boolean z) {
        Uri uri2;
        String documentId = DocumentsContract.getDocumentId(uri);
        Intrinsics.checkExpressionValueIsNotNull(documentId, "docId");
        List split$default = StringsKt.split$default((CharSequence) documentId, new String[]{":"}, false, 0, 6, (Object) null);
        String str = (String) split$default.get(0);
        int hashCode = str.hashCode();
        if (hashCode != 93166550) {
            if (hashCode != 100313435) {
                if (hashCode == 112202875 && str.equals("video")) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    Intrinsics.checkExpressionValueIsNotNull(uri2, "MediaStore.Video.Media.EXTERNAL_CONTENT_URI");
                    return m95050b(m95046a(context, uri2, (String) split$default.get(1)), z);
                }
            } else if (str.equals("image")) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                Intrinsics.checkExpressionValueIsNotNull(uri2, "MediaStore.Images.Media.EXTERNAL_CONTENT_URI");
                return m95050b(m95046a(context, uri2, (String) split$default.get(1)), z);
            }
        } else if (str.equals("audio")) {
            uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            Intrinsics.checkExpressionValueIsNotNull(uri2, "MediaStore.Audio.Media.EXTERNAL_CONTENT_URI");
            return m95050b(m95046a(context, uri2, (String) split$default.get(1)), z);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            uri2 = MediaStore.Files.getContentUri("external");
        } else {
            uri2 = MediaStore.Files.getContentUri("external");
        }
        Intrinsics.checkExpressionValueIsNotNull(uri2, "if (VERSION.SDK_INT >= V…\"external\")\n            }");
        return m95050b(m95046a(context, uri2, (String) split$default.get(1)), z);
    }

    /* renamed from: f */
    private final File m95055f(Context context, Uri uri, boolean z) {
        String path;
        if (!StringsKt.equals("content", uri.getScheme(), true)) {
            return null;
        }
        if (Intrinsics.areEqual("com.google.android.apps.photos.content", uri.getAuthority())) {
            return m95050b(uri.getLastPathSegment(), z);
        }
        File b = m95050b(m95047a(context, uri, (String) null, (String[]) null), z);
        if (b != null) {
            return b;
        }
        if (Intrinsics.areEqual(context.getPackageName() + ".common.fileprovider", uri.getAuthority())) {
            String valueOf = String.valueOf(uri.getPath());
            String str = File.separator;
            Intrinsics.checkExpressionValueIsNotNull(str, "File.separator");
            String removePrefix = StringsKt.removePrefix(valueOf, (CharSequence) str);
            if (StringsKt.startsWith$default(removePrefix, "android_files", false, 2, (Object) null)) {
                String removePrefix2 = StringsKt.removePrefix(removePrefix, (CharSequence) "android_files");
                File b2 = DirectFileAccess.m95104b(new DirectFileAccess.StorageParams(null, DirectFileAccess.StorageLocation.EXTERNAL, null, null, context, null, null, null, 237, null));
                if (b2 == null) {
                    return null;
                }
                UriCompatUtil apVar = f64857a;
                return apVar.m95050b(b2.getAbsolutePath() + removePrefix2, z);
            } else if (StringsKt.startsWith$default(removePrefix, "external_files", false, 2, (Object) null)) {
                return new File(Environment.getExternalStorageDirectory(), StringsKt.removePrefix(removePrefix, (CharSequence) "external_files"));
            } else {
                return null;
            }
        } else if ((true ^ Intrinsics.areEqual("com.android.fileexplorer.myprovider", uri.getAuthority())) || (path = uri.getPath()) == null) {
            return null;
        } else {
            Intrinsics.checkExpressionValueIsNotNull(path, "uri.path ?: return null");
            return m95050b(C26308n.m95251a(context) + File.separator + path, z);
        }
    }

    /* renamed from: a */
    private final String m95046a(Context context, Uri uri, String str) {
        return m95047a(context, uri, "_id=?", new String[]{str});
    }

    /* renamed from: a */
    private final File m95040a(Context context, Uri uri, long j, boolean z) {
        File d = m95053d(context, uri, z);
        if (d != null) {
            return d;
        }
        Iterator<T> it = f64858b.iterator();
        while (it.hasNext()) {
            Uri withAppendedId = ContentUris.withAppendedId(Uri.parse(it.next()), j);
            Intrinsics.checkExpressionValueIsNotNull(withAppendedId, "ContentUris.withAppendedId(Uri.parse(it), id)");
            UriCompatUtil apVar = f64857a;
            File b = apVar.m95050b(apVar.m95047a(context, withAppendedId, (String) null, (String[]) null), z);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        kotlin.io.C69101b.m265907a(r10, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        throw r13;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m95047a(android.content.Context r10, android.net.Uri r11, java.lang.String r12, java.lang.String[] r13) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.utils.UriCompatUtil.m95047a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* renamed from: a */
    public static /* synthetic */ File m95042a(Context context, Uri uri, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m95041a(context, uri, z);
    }
}
