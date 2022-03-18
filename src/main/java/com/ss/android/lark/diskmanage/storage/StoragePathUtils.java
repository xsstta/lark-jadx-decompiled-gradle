package com.ss.android.lark.diskmanage.storage;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.C26308n;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.permission.C51327f;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010&\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010(\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010*\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010+\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010,\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010.\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010/\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u00100\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u00101\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u00102\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u00103\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0004J\u000e\u00105\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u00106\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0004J\u000e\u00107\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u00108\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u00109\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010:\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010;\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010<\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010=\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010>\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010?\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010@\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010A\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010B\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010C\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J \u0010D\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010E\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010F\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010G\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010H\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010I\u001a\u00020J2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006K"}, d2 = {"Lcom/ss/android/lark/diskmanage/storage/StoragePathUtils;", "", "()V", "getAudioDirPath", "", "context", "Landroid/content/Context;", "getAudioFilePath", "filename", "key", "getAvatarCropDirPath", "getAvatarDirPath", "getAvatarFilePath", "getCacheDownloadDirPath", "getCachePath", "getCalendarPath", "getCameraPath", "getCameraPhotoPath", "getCameraVideoPath", "getCrashLogDirPath", "getDbPath", "getDocFileCacheDirPath", "getDownLoadDirPath", "getDriveCopyDirPath", "getFileCameraPath", "getFilePath", "getFilePicturePath", "getGlideCacheDirPath", "getHashFileName", "fileName", "getImageCacheDirPath", "getImageCompressDirPath", "getInnerCachePath", "getInnerFilePath", "getInnerImageCompressDirPath", "getJournalDirPath", "getLarkPath", "getLogDirPath", "getLuBanCacheDirPath", "getMediaCoverDirPath", "getMediaSupportCompressDirPath", "getMetricsLogDirPath", "getMiniAppRustLogPath", "getNativeCrashPath", "getOuterCachePath", "getPatchCacheDirPath", "getPicturePath", "getPrivateJournalDirPath", "getPublicJournalDirPath", "getRustAudioDirPath", "getRustCacheImagePath", "getRustLogPath", "rustLogSubPath", "getRustStoragePath", "getRustXLogPath", "getSDCameraPath", "getSDDownloadDirPath", "getSDPicturePath", "getShareTempFilePath", "getSimpleRustLogPath", "getSpPath", "getSpaceDirPath", "getSpaceLogDirPath", "getStickerCacheDirPath", "getTempFilePath", "getUpdatePackageDirPath", "getVideoCacheDirPath", "getVideoCompressPath", "getVideoDownloadPath", "mime", "getVoIPLogDirPath", "getWsChannelRustLogPath", "getZipDirPath", "isUsePublicDirPath", "", "disk-manage_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.diskmanage.storage.d */
public final class StoragePathUtils {

    /* renamed from: a */
    public static final StoragePathUtils f94669a = new StoragePathUtils();

    private StoragePathUtils() {
    }

    /* renamed from: V */
    public final String mo135724V(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String b = C26308n.m95256b(context);
        Intrinsics.checkExpressionValueIsNotNull(b, "FilePathUtils.getCachePath(context)");
        return b;
    }

    /* renamed from: e */
    public final boolean mo135739e(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return C26284k.m95186b(context);
    }

    /* renamed from: A */
    public final String mo135703A(Context context) {
        String str;
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!C51327f.m199081a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            str = mo135704B(context);
        } else {
            str = mo135705C(context);
        }
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: B */
    public final String mo135704B(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95257c(context) + "/picture/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: C */
    public final String mo135705C(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95250a() + "/Lark/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: D */
    public final String mo135706D(Context context) {
        String str;
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!C51327f.m199081a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            str = mo135707E(context);
        } else {
            str = mo135708F(context);
        }
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: E */
    public final String mo135707E(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95256b(context) + "/download/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: G */
    public final String mo135709G(Context context) {
        String str;
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!C51327f.m199081a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            str = mo135710H(context);
        } else {
            str = mo135711I(context);
        }
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: L */
    public final String mo135714L(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo135725W(context) + "/audio/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: M */
    public final String mo135715M(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo135714L(context) + "rust/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: N */
    public final String mo135716N(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95257c(context) + "/avatar/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: O */
    public final String mo135717O(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95256b(context) + "/luban_disk_cache/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: P */
    public final String mo135718P(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95256b(context) + "/image_cache/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: Q */
    public final String mo135719Q(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95256b(context) + "/image_compressed/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: S */
    public final String mo135721S(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95256b(context) + "/glide_cache/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: T */
    public final String mo135722T(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95256b(context) + "/picture/rust/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: U */
    public final String mo135723U(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95256b(context) + "/temp/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: W */
    public final String mo135725W(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return "";
        }
        String path = cacheDir.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "dir.path");
        return path;
    }

    /* renamed from: X */
    public final String mo135726X(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            return "";
        }
        String path = externalCacheDir.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "dir.path");
        return path;
    }

    /* renamed from: Y */
    public final String mo135727Y(Context context) {
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

    /* renamed from: Z */
    public final String mo135728Z(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            return "";
        }
        String path = filesDir.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "dir.path");
        return path;
    }

    /* renamed from: b */
    public final String mo135733b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return C26308n.m95257c(context) + "/Journal/";
    }

    /* renamed from: c */
    public final String mo135736c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return C26308n.m95258d(context) + "/Journal/";
    }

    /* renamed from: d */
    public final String mo135738d(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (mo135739e(context)) {
            return mo135733b(context);
        }
        return mo135736c(context);
    }

    /* renamed from: f */
    public final String mo135740f(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95256b(context) + "/update/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: g */
    public final String mo135741g(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95256b(context) + "/MediaCover/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: h */
    public final String mo135742h(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo135738d(context) + "log/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: i */
    public final String mo135743i(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo135738d(context) + "space/log/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: j */
    public final String mo135744j(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo135738d(context) + "miniapp/rustLog/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: k */
    public final String mo135745k(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo135738d(context) + "wschannel/rustLog/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: l */
    public final String mo135746l(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo135738d(context) + "crashLog/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: m */
    public final String mo135747m(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo135738d(context) + "voIPLog/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: n */
    public final String mo135748n(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo135738d(context) + "metrics/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: o */
    public final String mo135749o(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo135725W(context) + "/zip/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: p */
    public final String mo135750p(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo135738d(context) + "nativeCrash/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: r */
    public final String mo135752r(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo135751q(context) + "sdk_storage/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: s */
    public final String mo135753s(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95256b(context) + "/doc_file/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: t */
    public final String mo135754t(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95257c(context) + "/drive/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: u */
    public final String mo135755u(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95256b(context) + "/media_support_compress/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: v */
    public final String mo135756v(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95256b(context) + "/video_cache/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: w */
    public final String mo135757w(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95256b(context) + "/video_compress/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: x */
    public final String mo135758x(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95256b(context) + "/sticker/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: y */
    public final String mo135759y(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95256b(context) + "/share_temp/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: F */
    public final String mo135708F(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo135729a(context) + "download" + File.separator;
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: H */
    public final String mo135710H(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95257c(context) + File.separator + "camera" + File.separator;
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: I */
    public final String mo135711I(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo135729a(context) + "camera" + File.separator;
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: J */
    public final String mo135712J(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo135709G(context) + "photo" + File.separator;
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: K */
    public final String mo135713K(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = mo135709G(context) + "video" + File.separator;
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: R */
    public final String mo135720R(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = context.getCacheDir().toString() + "/image_compressed/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: a */
    public final String mo135729a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = C26308n.m95251a(context) + "/Lark/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        return str;
    }

    /* renamed from: q */
    public final String mo135751q(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        File filesDir = context.getFilesDir();
        Intrinsics.checkExpressionValueIsNotNull(filesDir, "context.filesDir");
        String path = filesDir.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "path");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) path, "/", 0, false, 6, (Object) null);
        StringBuilder sb = new StringBuilder();
        String substring = path.substring(0, lastIndexOf$default);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append("/databases/");
        return sb.toString();
    }

    /* renamed from: z */
    public final String mo135760z(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        File filesDir = context.getFilesDir();
        Intrinsics.checkExpressionValueIsNotNull(filesDir, "context.filesDir");
        String path = filesDir.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "path");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) path, "/", 0, false, 6, (Object) null);
        StringBuilder sb = new StringBuilder();
        String substring = path.substring(0, lastIndexOf$default);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append("/shared_prefs/");
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo135734b(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "rustLogSubPath");
        String str2 = mo135730a(context, str) + "/xlog/";
        C26311p.m95289i(str2);
        return str2;
    }

    /* renamed from: c */
    public final String mo135737c(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "filename");
        String str2 = mo135716N(context) + str;
        if (C26311p.m95290j(str2)) {
            return str2;
        }
        return "";
    }

    /* renamed from: a */
    public final String mo135730a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "rustLogSubPath");
        String str2 = mo135752r(context) + str;
        C26311p.m95289i(str2);
        return str2;
    }

    /* renamed from: a */
    public final String mo135732a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "key");
        if (str == null) {
            return "";
        }
        String f = C26311p.m95286f(str);
        String g = C26311p.m95287g(str);
        return f + "." + Math.abs(str2.hashCode()) + g;
    }

    /* renamed from: b */
    public final String mo135735b(Context context, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str2, "key");
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String L = mo135714L(context);
        String a = mo135732a(str, str2);
        return L + a;
    }

    /* renamed from: a */
    public final String mo135731a(Context context, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str2, "key");
        return mo135703A(context) + Math.abs(str2.hashCode()) + "." + C26311p.m95288h(str);
    }
}
