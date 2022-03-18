package com.ss.android.photoeditor.ve.p3018e;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u001a\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u001a\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u001e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003\u001a\u001e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003\u001a\u0010\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u001a\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001b\u001a\u000e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u000e\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0010\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0003\u001a\u0010\u0010\"\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0003\u001a\u000e\u0010#\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e\u001a\u000e\u0010$\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0010\u0010%\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u001a\u001c\u0010&\u001a\u0004\u0018\u00010\u00032\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010\u0003\u001a\u001a\u0010*\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u001b2\b\u0010,\u001a\u0004\u0018\u00010\u0003\u001a\u0016\u0010-\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"BUFFER_SIZE", "", "LOG_TAG", "", "ZIP_SUFFIX", "clearDirectory", "", "path", "closeStream", "", "closeable", "Ljava/io/Closeable;", "copy", "input", "Ljava/io/InputStream;", "output", "Ljava/io/OutputStream;", "copyAssetToStorage", "context", "Landroid/content/Context;", "src", "des", "copyResourcesAndUnzip", "desPath", "resName", "delete", C13998f.f36682a, "Ljava/io/File;", "deleteFiles", "file", "getStickerResourcePath", "getVEImageCachePath", "isDirectoryNotEmpty", "filePath", "isFileExist", "makeInputBuffered", "makeOutputBuffered", "mkdirIfNoExists", "saveBitmapToFile", "bmp", "Landroid/graphics/Bitmap;", "fileDir", "unZipFile", ShareHitPoint.f121868c, "destDir", "unzipStickerResources", "photoeditor_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.e.f */
public final class C59902f {
    /* renamed from: a */
    public static final boolean m232480a(String str) {
        String[] list;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.isDirectory() || !file.exists() || (list = file.list()) == null) {
            return false;
        }
        if (!(list.length == 0)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m232479a(Closeable closeable) {
        if (closeable == null) {
            return false;
        }
        try {
            closeable.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.e.f$a */
    static final class C59903a extends Lambda implements Function0<Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $resName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59903a(Context context, String str) {
            super(0);
            this.$context = context;
            this.$resName = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            String a = C59902f.m232472a(this.$context);
            try {
                C59902f.m232486d(a + this.$resName);
            } catch (Exception e) {
                e.printStackTrace();
                Log.m165397w("VEImageEditorFileUtils", "clearDirectory :" + e.getMessage());
            }
            try {
                C59902f.m232486d(a + this.$resName + ".zip");
            } catch (Exception e2) {
                e2.printStackTrace();
                Log.m165397w("VEImageEditorFileUtils", "clearDirectory :" + e2.getMessage());
            }
            try {
                C59902f.m232484b(a);
            } catch (Exception e3) {
                e3.printStackTrace();
                Log.m165397w("VEImageEditorFileUtils", "mkdirIfNoExists :" + e3.getMessage());
            }
            try {
                C59902f.m232475a(this.$context, a, this.$resName);
            } catch (Exception e4) {
                e4.printStackTrace();
                Log.m165397w("VEImageEditorFileUtils", "copyResourcesAndUnzip : " + e4.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static final void m232476a(File file) {
        if (file != null && file.exists()) {
            file.delete();
        }
    }

    /* renamed from: b */
    public static final void m232484b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: a */
    public static final InputStream m232470a(InputStream inputStream) {
        InputStream inputStream2;
        Intrinsics.checkParameterIsNotNull(inputStream, "input");
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream2 = null;
        } else {
            inputStream2 = inputStream;
        }
        BufferedInputStream bufferedInputStream = (BufferedInputStream) inputStream2;
        if (bufferedInputStream == null) {
            bufferedInputStream = new BufferedInputStream(inputStream, 524288);
        }
        return bufferedInputStream;
    }

    /* renamed from: c */
    public static final boolean m232485c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.isFile() || !file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final OutputStream m232471a(OutputStream outputStream) {
        OutputStream outputStream2;
        Intrinsics.checkParameterIsNotNull(outputStream, "output");
        if (!(outputStream instanceof BufferedOutputStream)) {
            outputStream2 = null;
        } else {
            outputStream2 = outputStream;
        }
        BufferedOutputStream bufferedOutputStream = (BufferedOutputStream) outputStream2;
        if (bufferedOutputStream == null) {
            bufferedOutputStream = new BufferedOutputStream(outputStream, 524288);
        }
        return bufferedOutputStream;
    }

    /* renamed from: a */
    public static final String m232472a(Context context) {
        String str;
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (Build.VERSION.SDK_INT < 29 || Environment.isExternalStorageLegacy()) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            Intrinsics.checkExpressionValueIsNotNull(externalStorageDirectory, "Environment.getExternalStorageDirectory()");
            str = externalStorageDirectory.getAbsolutePath();
        } else {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(applicationContext, "context.applicationContext");
            if (applicationContext.getFilesDir() != null) {
                Context applicationContext2 = context.getApplicationContext();
                Intrinsics.checkExpressionValueIsNotNull(applicationContext2, "context.applicationContext");
                File filesDir = applicationContext2.getFilesDir();
                Intrinsics.checkExpressionValueIsNotNull(filesDir, "context.applicationContext.filesDir");
                str = filesDir.getPath();
            } else {
                File cacheDir = context.getCacheDir();
                Intrinsics.checkExpressionValueIsNotNull(cacheDir, "context.cacheDir");
                str = cacheDir.getAbsolutePath();
            }
        }
        Log.m165389i("VEImageEditorFileUtils", str + "/cache/veimage/res/");
        return str + "/cache/veimage/res/";
    }

    /* renamed from: b */
    public static final String m232481b(Context context) {
        String str;
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (Build.VERSION.SDK_INT < 29 || Environment.isExternalStorageLegacy()) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            Intrinsics.checkExpressionValueIsNotNull(externalStorageDirectory, "Environment.getExternalStorageDirectory()");
            str = externalStorageDirectory.getAbsolutePath();
        } else {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(applicationContext, "context.applicationContext");
            if (applicationContext.getFilesDir() != null) {
                Context applicationContext2 = context.getApplicationContext();
                Intrinsics.checkExpressionValueIsNotNull(applicationContext2, "context.applicationContext");
                File filesDir = applicationContext2.getFilesDir();
                Intrinsics.checkExpressionValueIsNotNull(filesDir, "context.applicationContext.filesDir");
                str = filesDir.getPath();
            } else {
                File cacheDir = context.getCacheDir();
                Intrinsics.checkExpressionValueIsNotNull(cacheDir, "context.cacheDir");
                str = cacheDir.getAbsolutePath();
            }
        }
        return str + "/cache/veimage/cache/";
    }

    /* renamed from: d */
    public static final void m232486d(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        Intrinsics.checkExpressionValueIsNotNull(file2, C13998f.f36682a);
                        if (file2.isFile()) {
                            m232476a(file2);
                        } else if (file2.isDirectory()) {
                            m232483b(file2);
                        }
                    }
                }
            } else if (file.exists() && file.isFile()) {
                m232476a(file);
            }
        }
    }

    /* renamed from: b */
    public static final void m232483b(File file) {
        Intrinsics.checkParameterIsNotNull(file, "file");
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    Intrinsics.checkExpressionValueIsNotNull(file2, C13998f.f36682a);
                    if (file2.isFile()) {
                        m232476a(file2);
                    } else if (file2.isDirectory()) {
                        m232483b(file2);
                    }
                }
            }
            m232476a(file);
        } else if (file.exists() && file.isFile()) {
            m232476a(file);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099 A[SYNTHETIC, Splitter:B:36:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a9 A[SYNTHETIC, Splitter:B:43:0x00a9] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m232473a(android.graphics.Bitmap r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.photoeditor.ve.p3018e.C59902f.m232473a(android.graphics.Bitmap, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static final void m232474a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "resName");
        C59905h.m232489a(new C59903a(context, str));
    }

    /* renamed from: a */
    public static final void m232477a(File file, String str) throws IOException {
        if (!m232480a(str)) {
            File file2 = new File(str);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                Intrinsics.checkExpressionValueIsNotNull(zipEntry, "entry");
                String name = zipEntry.getName();
                File file3 = new File(file2, name);
                if (zipEntry.isDirectory()) {
                    file3.mkdirs();
                } else if (name == null || !StringsKt.contains$default((CharSequence) name, (CharSequence) "../", false, 2, (Object) null)) {
                    file3.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        InputStream inputStream = zipFile.getInputStream(zipEntry);
                        Intrinsics.checkExpressionValueIsNotNull(inputStream, "zipFile.getInputStream(entry)");
                        m232478a(inputStream, fileOutputStream);
                    } catch (Exception e) {
                        Log.m165397w("VEImageEditorFileUtils", e.getMessage());
                    }
                    fileOutputStream.close();
                }
            }
            zipFile.close();
        }
    }

    /* renamed from: a */
    public static final void m232478a(InputStream inputStream, OutputStream outputStream) throws IOException {
        Intrinsics.checkParameterIsNotNull(inputStream, "input");
        Intrinsics.checkParameterIsNotNull(outputStream, "output");
        try {
            byte[] bArr = new byte[524288];
            InputStream a = m232470a(inputStream);
            OutputStream a2 = m232471a(outputStream);
            while (true) {
                int read = a.read(bArr);
                if (read != -1) {
                    a2.write(bArr, 0, read);
                    a2.flush();
                } else {
                    m232479a((Closeable) a);
                    m232479a((Closeable) a2);
                    return;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            m232479a((Closeable) inputStream);
            m232479a((Closeable) outputStream);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c A[SYNTHETIC, Splitter:B:33:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a6 A[SYNTHETIC, Splitter:B:40:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ba A[SYNTHETIC, Splitter:B:45:0x00ba] */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m232482b(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.photoeditor.ve.p3018e.C59902f.m232482b(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static final void m232475a(Context context, String str, String str2) throws IOException {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "desPath");
        Intrinsics.checkParameterIsNotNull(str2, "resName");
        m232482b(context, str2 + ".zip", str + str2 + ".zip");
        File file = new File(str + str2 + ".zip");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        m232477a(file, sb.toString());
    }
}
