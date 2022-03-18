package com.ss.android.lark.edu.util;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/edu/util/ErrorHandler;", "", "()V", "NETWORK_LIBRARY_ERROR", "", "OFF_LINE", "getErrorMsg", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "context", "Landroid/content/Context;", "defaultErrMsg", "isOffLine", "", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.edu.d.c */
public final class ErrorHandler {

    /* renamed from: a */
    public static final ErrorHandler f95004a = new ErrorHandler();

    private ErrorHandler() {
    }

    /* renamed from: a */
    private final boolean m145874a(ErrorResult errorResult) {
        if (errorResult.getErrorCode() == 10008 || errorResult.getErrorCode() == 10018) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String mo136386a(ErrorResult errorResult, Context context, String str) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (f95004a.m145874a(errorResult)) {
            return context.getString(R.string.Lark_General_NetworkErrorToast);
        }
        if (TextUtils.isEmpty(errorResult.getDisplayMsg())) {
            return str;
        }
        String displayMsg = errorResult.getDisplayMsg();
        if (displayMsg != null) {
            return displayMsg;
        }
        Intrinsics.throwNpe();
        return displayMsg;
    }
}
