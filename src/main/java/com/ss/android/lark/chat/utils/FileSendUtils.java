package com.ss.android.lark.chat.utils;

import android.content.Context;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.statistics.fileupload.FileUploadHitPoint;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J \u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J \u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J&\u0010\u0014\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/chat/utils/FileSendUtils;", "", "()V", "maxSendFileSize", "", "multiFileSizeLimit", "", "kotlin.jvm.PlatformType", "getMultiFileSizeLimit", "()Ljava/lang/String;", "singleFileSizeLimit", "getSingleFileSizeLimit", "checkSingleFileSize", "", "file", "Ljava/io/File;", "limitSize", "context", "Landroid/content/Context;", "size", "checkTotalFileSize", "totalSize", "files", "", "getFileSize", "getMultiFileSizeLimitTips", "getSingleFileSizeLimitTips", "showErrorMessage", "", "message", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.utils.k */
public final class FileSendUtils {

    /* renamed from: a */
    public static final FileSendUtils f88686a = new FileSendUtils();

    /* renamed from: b */
    private static final String f88687b = UIHelper.getString(R.string.Lark_File_ToastSingleFileSizeLimit);

    /* renamed from: c */
    private static final String f88688c = UIHelper.getString(R.string.Lark_File_ToastTotalFileSizeLimit);

    private FileSendUtils() {
    }

    /* renamed from: a */
    public final String mo126927a(long j) {
        String mustacheFormat = UIHelper.mustacheFormat(f88687b, "max_single_size", C26311p.m95262a(j));
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…e_size\",displayLimitSize)");
        return mustacheFormat;
    }

    /* renamed from: b */
    public final String mo126928b(long j) {
        String mustacheFormat = UIHelper.mustacheFormat(f88688c, "max_total_size", C26311p.m95262a(j));
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…l_size\",displayLimitSize)");
        return mustacheFormat;
    }

    /* renamed from: a */
    private final void m133182a(String str, Context context) {
        LKUIToast.show(context, str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m133183a(long j, long j2, Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String a = C26311p.m95262a(j);
        FileUploadHitPoint.Companion aVar = FileUploadHitPoint.f135706a;
        Intrinsics.checkExpressionValueIsNotNull(a, "displaySize");
        aVar.mo187479a(a);
        if (j <= j2) {
            return true;
        }
        FileSendUtils kVar = f88686a;
        kVar.m133182a(kVar.mo126927a(j2), context);
        FileUploadHitPoint.f135706a.mo187480b(a);
        return false;
    }
}
