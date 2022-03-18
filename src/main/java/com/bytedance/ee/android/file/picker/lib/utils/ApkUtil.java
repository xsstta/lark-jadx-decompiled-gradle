package com.bytedance.ee.android.file.picker.lib.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/utils/ApkUtil;", "", "()V", "getApkIcon", "Landroid/graphics/drawable/Drawable;", "filePath", "", "context", "Landroid/content/Context;", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.utils.a */
public final class ApkUtil {

    /* renamed from: a */
    public static final ApkUtil f12468a = new ApkUtil();

    private ApkUtil() {
    }

    /* renamed from: a */
    public final Drawable mo16094a(String str, Context context) {
        Intrinsics.checkParameterIsNotNull(str, "filePath");
        Intrinsics.checkParameterIsNotNull(context, "context");
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 0);
        if (packageArchiveInfo == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(packageArchiveInfo, "packageManager.getPackag…lePath, 0) ?: return null");
        packageArchiveInfo.applicationInfo.sourceDir = str;
        packageArchiveInfo.applicationInfo.publicSourceDir = str;
        return packageArchiveInfo.applicationInfo.loadIcon(packageManager);
    }
}
