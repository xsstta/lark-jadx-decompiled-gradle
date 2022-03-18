package com.ss.android.lark.passport.signinsdk_api.base.p2456b;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;

/* renamed from: com.ss.android.lark.passport.signinsdk_api.base.b.a */
public class C49345a {
    /* renamed from: a */
    public static ErrorResult m194380a(NetworkErrorResult networkErrorResult) {
        String str;
        int i;
        if (networkErrorResult != null) {
            int errorCode = networkErrorResult.getErrorCode();
            str = networkErrorResult.getErrorMessage();
            i = errorCode;
        } else {
            str = "";
            i = 0;
        }
        return new ErrorResult(i, str, null, str, null);
    }
}
