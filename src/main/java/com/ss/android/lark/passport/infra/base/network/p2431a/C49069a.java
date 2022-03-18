package com.ss.android.lark.passport.infra.base.network.p2431a;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.passport.infra.base.network.a.a */
public class C49069a {

    /* renamed from: a */
    static final /* synthetic */ boolean f123232a = true;

    /* renamed from: a */
    public static ErrorResult m193380a(NetworkErrorResult networkErrorResult) {
        if (networkErrorResult == null) {
            return new ErrorResult(-1);
        }
        return m193381a(networkErrorResult, m193382a(LarkContext.getApplication(), networkErrorResult));
    }

    /* renamed from: a */
    public static int m193379a(String str, UniContext uniContext) {
        try {
            return m193378a(JSONObject.parseObject(str), uniContext);
        } catch (Throwable th) {
            PassportLog.f123351c.mo171474a().mo171462a("ErrorUtil", "parse body json error", th);
            return -1;
        }
    }

    /* renamed from: a */
    public static int m193378a(JSONObject jSONObject, UniContext uniContext) {
        if (jSONObject == null) {
            return -1;
        }
        try {
            if (jSONObject.containsKey("biz_code")) {
                return jSONObject.getInteger("biz_code").intValue();
            }
            return -1;
        } catch (Throwable th) {
            PassportLog.f123351c.mo171474a().mo171462a("ErrorUtil", "parse biz_code error", th);
            return -1;
        }
    }

    /* renamed from: a */
    public static ErrorResult m193381a(NetworkErrorResult networkErrorResult, String str) {
        if (networkErrorResult == null) {
            return new ErrorResult(-1);
        }
        return new ErrorResult(networkErrorResult.getErrorCode(), networkErrorResult.getErrorMessage(), null, str, null);
    }

    /* renamed from: a */
    public static String m193382a(Context context, NetworkErrorResult networkErrorResult) {
        int errorCode = networkErrorResult.getErrorCode();
        if (errorCode == -5) {
            return "";
        }
        if (errorCode == -4) {
            return UIUtils.getString(context, R.string.Lark_Passport_GetCaptchaError);
        }
        if (errorCode == -2) {
            return UIUtils.getString(context, R.string.Lark_Login_ErrorMessageOfInternet);
        }
        if (errorCode == -1) {
            return UIUtils.getString(context, R.string.Lark_Login_ErrorMessageOfOtherStatus);
        }
        switch (errorCode) {
            case SplitInstallErrorCode.PLAY_STORE_NOT_FOUND:
                return UIUtils.getString(context, R.string.Lark_Passport_CBLoginInitNetworkError);
            case SplitInstallErrorCode.SPLITCOMPAT_COPY_ERROR:
                return UIUtils.getString(context, R.string.Lark_Legacy_NetworkErrorRetry);
            case SplitInstallErrorCode.SPLITCOMPAT_EMULATION_ERROR:
                return UIUtils.getString(context, R.string.Lark_Passport_BadServerData);
            case SplitInstallErrorCode.SPLITCOMPAT_VERIFICATION_ERROR:
                return UIUtils.getString(context, R.string.Lark_Passport_BadAccountInfo);
            case -10:
                return UIUtils.getString(context, R.string.Lark_Passport_LoginInitNetworkError);
            default:
                return networkErrorResult.getErrorMessage();
        }
    }
}
