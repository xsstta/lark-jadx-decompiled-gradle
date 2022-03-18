package com.ss.android.photoeditor.ve.utils;

import android.content.Context;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/photoeditor/ve/utils/VEStorageUtils;", "", "()V", "EDITED_PIC_DIR_NAME", "", "LOG_TAG", "MIN_SDCARD_SPACE", "", "VE_BRUSH_CACHE_DIR", "VE_FRAME_CACHE_DIR", "clearVEFrameCache", "", "context", "Landroid/content/Context;", "getCachePath", "getOutputPath", "getVEBrushCachePath", "getVEFrameCachePath", "getVESDKPath", "hasSDCardMounted", "", "haveFreeSpace", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.e.k */
public final class VEStorageUtils {

    /* renamed from: a */
    public static final VEStorageUtils f149211a = new VEStorageUtils();

    private VEStorageUtils() {
    }

    /* renamed from: c */
    public final String mo203987c(Context context) {
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

    /* renamed from: a */
    public final String mo203985a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = String.valueOf(mo203987c(context)) + "/image_editor/";
        C59902f.m232484b(str);
        return str;
    }

    /* renamed from: b */
    public final String mo203986b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        try {
            File externalFilesDir = context.getExternalFilesDir("imagecut/brush");
            if ((externalFilesDir == null || !externalFilesDir.exists()) && externalFilesDir != null) {
                externalFilesDir.mkdirs();
            }
            if (externalFilesDir != null) {
                return externalFilesDir.getAbsolutePath();
            }
            return null;
        } catch (IOException e) {
            Log.m165397w("FileUtils", "getVEBrushCachePath exception :" + e.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    public final String mo203988d(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        try {
            File createTempFile = File.createTempFile("larkveedited", ".jpg", context.getExternalFilesDir("imagecut"));
            Intrinsics.checkExpressionValueIsNotNull(createTempFile, "File.createTempFile(\"lar…Dir(EDITED_PIC_DIR_NAME))");
            return createTempFile.getAbsolutePath();
        } catch (IOException e) {
            Log.m165397w("FileUtils", "getOutputPath exception :" + e.getMessage());
            return null;
        }
    }
}
