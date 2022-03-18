package com.bytedance.ee.android.file.picker.lib.utils;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.LarkUriUtil;
import com.larksuite.framework.utils.MediaStoreUtil;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.FileType;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001>B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014J!\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0005H\u0007J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0007J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010 \u001a\u00020!H\u0007J\u000e\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005J\u0012\u0010%\u001a\u0004\u0018\u00010\u00052\u0006\u0010 \u001a\u00020!H\u0007J\u000e\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005J\u000e\u0010'\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010(\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0007J\u0015\u0010)\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b*J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H\u0007J\u000e\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0012J\u000e\u0010+\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120.2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010/\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u00100\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u000e\u00101\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u00102\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u0005J\u0010\u00105\u001a\u0002062\u0006\u0010$\u001a\u00020\u0005H\u0002J \u00107\u001a\u0002062\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u00108\u001a\u00020\u0005J \u00109\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!2\u0006\u0010:\u001a\u00020\u0005H\u0002J \u0010;\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!2\u0006\u0010<\u001a\u00020\u0005H\u0002J\u0012\u0010=\u001a\u00020\u0014*\u00020!2\u0006\u0010\u000e\u001a\u00020\u000fJ\n\u0010=\u001a\u00020\u0014*\u00020\u0012R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006?"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/utils/FileUtils;", "", "()V", "EXTENSION_TO_MIME_MAP", "Ljava/util/HashMap;", "", "MIME_MapTable", "", "[[Ljava/lang/String;", "MIME_TYPE_UNSPECIFIC", "TAG", "UNITS_FILE_SPACE", "[Ljava/lang/String;", "getCachePath", "context", "Landroid/content/Context;", "getDisplayFileSize", "file", "Ljava/io/File;", "size", "", "inSize", "units", "(J[Ljava/lang/String;)Ljava/lang/String;", "getDocFileCacheDirPath", "getDownLoadDirPath", "getFileExtension", "filePath", "getFileIconByFileName", "", "fileName", "getFileIconByMimeType", "uri", "Landroid/net/Uri;", "getFileName", "getFileNameByPath", "path", "getFileNameSuffix", "fName", "getFilePath", "getFileSizeFromUri", "getInnerDownloadDirPath", "getInnerDownloadDirPath$file_picker_lib_release", "getMIMEType", C13998f.f36682a, "getReceiveDirPaths", "", "getSDPath", "getStoragePath", "getVideoThumbCacheDirPath", "isGranted", "", "permissionName", "mkdirIfNoExists", "", "openFile", "specificMimeType", "openFileByMimeType", "mimeType", "openFileInner", "inMimeType", "getFileSize", "MimeTypeCompat", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.utils.g */
public final class FileUtils {

    /* renamed from: a */
    public static final FileUtils f12473a = new FileUtils();

    /* renamed from: b */
    private static final String[] f12474b = {" Byte", " KB", " MB", " GB"};

    /* renamed from: c */
    private static final String f12475c = f12475c;

    /* renamed from: d */
    private static final HashMap<String, String> f12476d = new HashMap<>();

    /* renamed from: e */
    private static final String[][] f12477e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0002\b\fR\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/utils/FileUtils$MimeTypeCompat;", "", "()V", "COMPAT_MIME_MAP", "com/bytedance/ee/android/file/picker/lib/utils/FileUtils$MimeTypeCompat$COMPAT_MIME_MAP$1", "Lcom/bytedance/ee/android/file/picker/lib/utils/FileUtils$MimeTypeCompat$COMPAT_MIME_MAP$1;", "COMPAT_MIME_PAIR", "", "", "[[Ljava/lang/String;", "getCompatType", ShareHitPoint.f121869d, "getCompatType$file_picker_lib_release", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.utils.g$a */
    public static final class MimeTypeCompat {

        /* renamed from: a */
        public static final MimeTypeCompat f12478a;

        /* renamed from: b */
        private static final String[][] f12479b = {new String[]{"application/zip", "application/x-zip-compressed"}};

        /* renamed from: c */
        private static final FileUtils$MimeTypeCompat$COMPAT_MIME_MAP$1 f12480c;

        private MimeTypeCompat() {
        }

        static {
            MimeTypeCompat aVar = new MimeTypeCompat();
            f12478a = aVar;
            f12480c = new FileUtils$MimeTypeCompat$COMPAT_MIME_MAP$1(aVar);
        }

        /* renamed from: a */
        public final String mo16115a(String str) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            if (((String) f12480c.get((Object) str)) == null) {
                return "";
            }
            return str;
        }
    }

    private FileUtils() {
    }

    /* renamed from: a */
    public final boolean mo16107a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "permissionName");
        return ActivityCompat.checkSelfPermission(context, str) == 0;
    }

    static {
        String[][] strArr = {new String[]{"3gp", "video/3gpp"}, new String[]{"apk", "application/vnd.android.package-archive"}, new String[]{"asf", "video/x-ms-asf"}, new String[]{"avi", "video/x-msvideo"}, new String[]{"bin", "application/octet-stream"}, new String[]{"bmp", "image/bmp"}, new String[]{C60375c.f150914a, "text/plain"}, new String[]{"class", "application/octet-stream"}, new String[]{"conf", "text/plain"}, new String[]{"cpp", "text/plain"}, new String[]{"doc", "application/msword"}, new String[]{"docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"}, new String[]{"xls", "application/vnd.ms-excel"}, new String[]{"xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"}, new String[]{"exe", "application/octet-stream"}, new String[]{"gif", "image/gif"}, new String[]{"gtar", "application/x-gtar"}, new String[]{"gz", "application/x-gzip"}, new String[]{C14002h.f36692e, "text/plain"}, new String[]{"htm", "text/html"}, new String[]{"html", "text/html"}, new String[]{"jar", "application/java-archive"}, new String[]{"java", "text/plain"}, new String[]{"jpeg", "image/jpeg"}, new String[]{"jpg", "image/jpeg"}, new String[]{"js", "application/x-javascript"}, new String[]{"log", "text/plain"}, new String[]{"m3u", "audio/x-mpegurl"}, new String[]{"m4a", "audio/mp4a-latm"}, new String[]{"m4b", "audio/mp4a-latm"}, new String[]{"m4p", "audio/mp4a-latm"}, new String[]{"m4u", "video/vnd.mpegurl"}, new String[]{"m4v", "video/x-m4v"}, new String[]{"mov", "video/quicktime"}, new String[]{"mp2", "audio/x-mpeg"}, new String[]{"mp3", "audio/x-mpeg"}, new String[]{"mpg4", "video/mp4"}, new String[]{"mpc", "application/vnd.mpohun.certificate"}, new String[]{"mpe", "video/mpeg"}, new String[]{"vob", "video/mpeg"}, new String[]{"mpg", "video/mpeg"}, new String[]{"mp4", "video/mp4"}, new String[]{"mpga", "audio/mpeg"}, new String[]{"mpeg", "video/mpeg"}, new String[]{"msg", "application/vnd.ms-outlook"}, new String[]{"ogg", "audio/ogg"}, new String[]{"pdf", "application/pdf"}, new String[]{"png", "image/png"}, new String[]{"pps", "application/vnd.ms-powerpoint"}, new String[]{"ppt", "application/vnd.ms-powerpoint"}, new String[]{"pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation"}, new String[]{"prop", "text/plain"}, new String[]{"rc", "text/plain"}, new String[]{"rmvb", "audio/x-pn-realaudio"}, new String[]{"rtf", "application/rtf"}, new String[]{"sh", "text/plain"}, new String[]{"tar", "application/x-tar"}, new String[]{"tgz", "application/x-compressed"}, new String[]{"txt", "text/plain"}, new String[]{"wav", "audio/x-wav"}, new String[]{"wma", "audio/x-ms-wma"}, new String[]{"wmv", "audio/x-ms-wmv"}, new String[]{"amr", "audio/amr"}, new String[]{"aac", "audio/x-aac"}, new String[]{"wps", "application/vnd.ms-works"}, new String[]{"xml", "text/plain"}, new String[]{"z", "application/x-compress"}, new String[]{"zip", "application/x-zip-compressed"}, new String[]{"rar", "application/x-rar-compressed"}, new String[]{"ai", "application/postscript"}, new String[]{"", f12475c}};
        f12477e = strArr;
        for (String[] strArr2 : strArr) {
            f12476d.put(strArr2[0], strArr2[1]);
        }
    }

    /* renamed from: a */
    public final String mo16103a(long j) {
        return mo16104a(j, f12474b);
    }

    /* renamed from: d */
    private final void m17143d(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m17138a(Uri uri) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        Application application = LarkContext.getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
        String type = application.getContentResolver().getType(uri);
        if (type != null) {
            return type;
        }
        return f12475c;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m17139b(Uri uri) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        Application application = LarkContext.getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
        return LarkUriUtil.m95300a(application, uri);
    }

    /* renamed from: c */
    public final String mo16109c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo16114g(context) + "/doc_file_lib/";
        m17143d(str);
        return str;
    }

    /* renamed from: f */
    public final String mo16113f(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = context.getFilesDir();
        }
        if (externalFilesDir == null) {
            return "";
        }
        String path = externalFilesDir.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "dir.path");
        return path;
    }

    /* renamed from: g */
    public final String mo16114g(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        if (externalCacheDir == null) {
            return "";
        }
        String path = externalCacheDir.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "dir.path");
        return path;
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m17136a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        FileType fileType = FileType.TYPE_UNKNOWN;
        if (!TextUtils.isEmpty(str)) {
            String b = f12473a.mo16108b(str);
            if (!TextUtils.isEmpty(b)) {
                fileType = FileType.getFileTypeBySuffix(b);
                Intrinsics.checkExpressionValueIsNotNull(fileType, "FileType.getFileTypeBySuffix(suffix)");
            }
        }
        return fileType.getResId(3);
    }

    /* renamed from: h */
    private final String m17144h(Context context) {
        File file = null;
        if (Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted")) {
            file = Environment.getExternalStorageDirectory();
        }
        if (file == null) {
            file = context.getFilesDir();
        }
        if (file == null) {
            return "";
        }
        String path = file.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "sdDir.path");
        return path;
    }

    /* renamed from: c */
    public final String mo16110c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        String name = new File(str).getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "file.name");
        return name;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "use MediaStoreUtil instead")
    /* renamed from: d */
    public final String mo16111d(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = m17144h(context) + "/Lark/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        return str;
    }

    /* renamed from: e */
    public final String mo16112e(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo16113f(context) + File.separator + "download" + File.separator;
        m17143d(str);
        return str;
    }

    @JvmStatic
    /* renamed from: b */
    public static final List<File> m17140b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        ArrayList arrayList = new ArrayList();
        FileUtils gVar = f12473a;
        String e = gVar.mo16112e(context);
        arrayList.add(e);
        gVar.m17143d(e);
        if (gVar.mo16107a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            String str = gVar.mo16111d(context) + "download/";
            arrayList.add(str);
            gVar.m17143d(str);
        }
        ArrayList<String> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (String str2 : arrayList2) {
            arrayList3.add(new File(str2));
        }
        return CollectionsKt.plus((Collection) arrayList3, (Iterable) MediaStoreUtil.m94887a(context, (List) null, 2, (Object) null));
    }

    /* renamed from: a */
    public final long mo16102a(File file) {
        Intrinsics.checkParameterIsNotNull(file, "$this$getFileSize");
        if (file.exists() && file.isFile()) {
            try {
                return file.length();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                Log.m165379d("FileUtils", e.toString());
            } catch (IOException e2) {
                e2.printStackTrace();
                Log.m165379d("FileUtils", e2.toString());
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final String mo16108b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "fName");
        String str2 = str;
        if (StringsKt.lastIndexOf$default((CharSequence) str2, ".", 0, false, 6, (Object) null) <= 0) {
            return "";
        }
        String substring = str.substring(StringsKt.lastIndexOf$default((CharSequence) str2, ".", 0, false, 6, (Object) null), str.length());
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public final String mo16105a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo16114g(context) + "/video_thumb_cache/";
        m17143d(str);
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        kotlin.io.C69101b.m265907a(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        throw r3;
     */
    @kotlin.jvm.JvmStatic
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m17137a(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            android.content.ContentResolver r5 = r5.getContentResolver()
            r0 = 0
            r2 = 0
            kotlin.Result$a r3 = kotlin.Result.Companion     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = "r"
            android.os.ParcelFileDescriptor r5 = r5.openFileDescriptor(r6, r3)     // Catch:{ all -> 0x0041 }
            if (r5 == 0) goto L_0x0037
            java.io.Closeable r5 = (java.io.Closeable) r5     // Catch:{ all -> 0x0041 }
            r6 = r2
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0041 }
            r3 = r5
            android.os.ParcelFileDescriptor r3 = (android.os.ParcelFileDescriptor) r3     // Catch:{ all -> 0x0030 }
            java.lang.String r4 = "it"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)     // Catch:{ all -> 0x0030 }
            long r3 = r3.getStatSize()     // Catch:{ all -> 0x0030 }
            kotlin.io.C69101b.m265907a(r5, r6)
            goto L_0x0038
        L_0x0030:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r3 = move-exception
            kotlin.io.C69101b.m265907a(r5, r6)
            throw r3
        L_0x0037:
            r3 = r0
        L_0x0038:
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            java.lang.Object r5 = kotlin.Result.m271569constructorimpl(r5)
            goto L_0x004c
        L_0x0041:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.C69097g.m265890a(r5)
            java.lang.Object r5 = kotlin.Result.m271569constructorimpl(r5)
        L_0x004c:
            boolean r6 = kotlin.Result.m271575isFailureimpl(r5)
            if (r6 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r2 = r5
        L_0x0054:
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x005c
            long r0 = r2.longValue()
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.android.file.picker.lib.utils.FileUtils.m17137a(android.content.Context, android.net.Uri):long");
    }

    /* renamed from: a */
    public final String mo16104a(long j, String[] strArr) {
        Intrinsics.checkParameterIsNotNull(strArr, "units");
        if (j < 0) {
            j = 0;
        }
        long j2 = (long) 1024;
        if (j < j2) {
            return String.valueOf(j) + strArr[0];
        }
        long j3 = j / j2;
        if (j3 < j2) {
            return String.valueOf(j3) + strArr[1];
        } else if (j3 < ((long) 1048576)) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(j3 / j2));
            sb.append(".");
            long j4 = (long) 100;
            sb.append(String.valueOf(((j3 * j4) / j2) % j4));
            sb.append(strArr[2]);
            return sb.toString();
        } else {
            long j5 = (long) 100;
            long j6 = ((j3 * j5) / j2) / j2;
            return String.valueOf(j6 / j5) + "." + String.valueOf(j6 % j5) + strArr[3];
        }
    }

    /* renamed from: b */
    private final boolean m17141b(Context context, Uri uri, String str) {
        if (m17142c(context, uri, str)) {
            return true;
        }
        return m17142c(context, uri, MimeTypeCompat.f12478a.mo16115a(str));
    }

    /* renamed from: c */
    private final boolean m17142c(Context context, Uri uri, String str) {
        Log.m165389i("FileUtils", "openFile: " + str);
        if (TextUtils.isEmpty(str)) {
            str = m17138a(uri);
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(268435456);
        FileProviderUtils.f12472a.mo16100a(context, intent, str, uri, true);
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            Log.m165397w("FileUtils", "openFile: " + e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public final void mo16106a(Context context, Uri uri, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "specificMimeType");
        if (uri == null) {
            LKUIToast.show(context, (int) R.string.Lark_Legacy_FileOpenFail);
            return;
        }
        String a = m17138a(uri);
        if (!m17141b(context, uri, a)) {
            if ((TextUtils.equals(a, str) || !m17141b(context, uri, str)) && !m17142c(context, uri, f12475c)) {
                LKUIToast.show(context, (int) R.string.Lark_Legacy_FileBrowserNotSupport);
            }
        }
    }
}
