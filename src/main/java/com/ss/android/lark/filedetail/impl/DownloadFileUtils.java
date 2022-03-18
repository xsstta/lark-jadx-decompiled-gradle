package com.ss.android.lark.filedetail.impl;

import android.content.Context;
import android.os.Build;
import com.larksuite.framework.utils.C26308n;
import com.larksuite.framework.utils.MediaStoreUtil;
import com.larksuite.framework.utils.file.direct.DirectFileAccess;
import com.ss.android.lark.filedetail.FileDetailModule;
import com.ss.android.lark.filedetail.p1885a.AbstractC38197a;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0007J\u0014\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0014\u0010\r\u001a\u00020\u0006*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0006*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007J\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0006*\u00020\u000eH\u0002J\f\u0010\u0012\u001a\u00020\b*\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/DownloadFileUtils;", "", "()V", "CIPHER_FILE_HEADER", "", "TAG", "", "isFileEncryptionEnable", "", "isFileNotCipher", "filePath", "child", "Ljava/io/File;", "getDownloadFileDir", "Landroid/content/Context;", "fileName", "getDownloadFilePath", "getSandboxDownloadPath", "isAndroidROrLater", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.a */
public final class DownloadFileUtils {

    /* renamed from: a */
    public static final DownloadFileUtils f98020a = new DownloadFileUtils();

    /* renamed from: b */
    private static final byte[] f98021b = {5, 69, 69, 83, 0, 0, 0, 0};

    private DownloadFileUtils() {
    }

    /* renamed from: a */
    private final boolean m150310a() {
        AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
        if (a != null) {
            return a.isFeatureGatingCurrentEnable("admin.security.mobile_client.enable_encryption");
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m150313b(Context context) {
        if (Build.VERSION.SDK_INT <= 28 || context.getApplicationInfo().targetSdkVersion <= 28) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final String m150308a(Context context) {
        File b = DirectFileAccess.m95104b(new DirectFileAccess.StorageParams(null, DirectFileAccess.StorageLocation.EXTERNAL, null, null, context, null, null, null, 237, null));
        if (b == null) {
            return null;
        }
        return f98020a.m150307a(b, "download").getAbsolutePath() + "/";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        kotlin.io.C69101b.m265907a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        throw r1;
     */
    @kotlin.jvm.JvmStatic
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m150311a(java.lang.String r3) {
        /*
            java.lang.String r0 = "filePath"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002f }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x002f }
            r1.<init>(r3)     // Catch:{ Exception -> 0x002f }
            r0.<init>(r1)     // Catch:{ Exception -> 0x002f }
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch:{ Exception -> 0x002f }
            r3 = 0
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ Exception -> 0x002f }
            r1 = r0
            java.io.FileInputStream r1 = (java.io.FileInputStream) r1     // Catch:{ all -> 0x0028 }
            r2 = 8
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0028 }
            r1.read(r2)     // Catch:{ all -> 0x0028 }
            byte[] r1 = com.ss.android.lark.filedetail.impl.DownloadFileUtils.f98021b     // Catch:{ all -> 0x0028 }
            boolean r1 = java.util.Arrays.equals(r2, r1)     // Catch:{ all -> 0x0028 }
            kotlin.io.C69101b.m265907a(r0, r3)
            return r1
        L_0x0028:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002a }
        L_0x002a:
            r1 = move-exception
            kotlin.io.C69101b.m265907a(r0, r3)
            throw r1
        L_0x002f:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "DownloadFileUtils"
            com.ss.android.lark.log.Log.m165383e(r0, r3)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.filedetail.impl.DownloadFileUtils.m150311a(java.lang.String):boolean");
    }

    /* renamed from: a */
    private final File m150307a(File file, String str) {
        return new File(file, str);
    }

    /* renamed from: b */
    private final String m150312b(Context context, String str) {
        MediaStoreUtil.DirType a = MediaStoreUtil.f64797a.mo93327a(str);
        if (m150313b(context) && a != MediaStoreUtil.DirType.DOCUMENTS) {
            a = MediaStoreUtil.DirType.DOWNLOADS;
        }
        return MediaStoreUtil.f64797a.mo93328a(a).getAbsolutePath() + File.separator;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m150309a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "$this$getDownloadFilePath");
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        DownloadFileUtils aVar = f98020a;
        if (aVar.m150310a()) {
            return C26308n.m95252a(context, aVar.m150308a(context), str);
        }
        return C26308n.m95252a(context, aVar.m150312b(context, str), str);
    }
}
