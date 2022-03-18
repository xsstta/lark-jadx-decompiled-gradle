package com.bytedance.ee.android.file.picker.lib.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ&\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J&\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012J.\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/utils/FileProviderUtils;", "", "()V", "FILE_PROVIDER", "", "getUriForFile", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "file", "Ljava/io/File;", "getUriForFile24", "grantPermissions", "", "intent", "Landroid/content/Intent;", "uri", "writeAble", "", "setIntentData", "setIntentDataAndType", ShareHitPoint.f121869d, "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.utils.f */
public final class FileProviderUtils {

    /* renamed from: a */
    public static final FileProviderUtils f12472a = new FileProviderUtils();

    private FileProviderUtils() {
    }

    /* renamed from: a */
    public final Uri mo16099a(Context context, File file) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(file, "file");
        if (Build.VERSION.SDK_INT >= 24) {
            return mo16101b(context, file);
        }
        Uri fromFile = Uri.fromFile(file);
        Intrinsics.checkExpressionValueIsNotNull(fromFile, "Uri.fromFile(file)");
        return fromFile;
    }

    /* renamed from: b */
    public final Uri mo16101b(Context context, File file) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(file, "file");
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".common.fileprovider", file);
        Intrinsics.checkExpressionValueIsNotNull(uriForFile, "FileProvider.getUriForFi…me + FILE_PROVIDER, file)");
        return uriForFile;
    }

    /* renamed from: a */
    public final void mo16100a(Context context, Intent intent, String str, Uri uri, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        if (Build.VERSION.SDK_INT >= 24) {
            intent.setDataAndType(uri, str);
            intent.addFlags(1);
            if (z) {
                intent.addFlags(2);
                return;
            }
            return;
        }
        Intrinsics.checkExpressionValueIsNotNull(intent.setDataAndType(uri, str), "intent.setDataAndType(uri, type)");
    }
}
