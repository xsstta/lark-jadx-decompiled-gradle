package com.tt.miniapp;

import android.text.TextUtils;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapp.errorcode.ApiCode;

/* renamed from: com.tt.miniapp.c */
public class C65807c {

    /* renamed from: a */
    private AbstractC65808a f165843a;

    /* renamed from: com.tt.miniapp.c$a */
    public interface AbstractC65808a {
        /* renamed from: a */
        ApiCallResult.Builder mo230504a(String str);

        /* renamed from: b */
        ApiCallResult.Builder mo230505b(String str);

        /* renamed from: c */
        ApiCallResult.Builder mo230506c(String str);

        /* renamed from: d */
        ApiCallResult.Builder mo230507d(String str);

        /* renamed from: e */
        ApiCallResult.Builder mo230508e(String str);
    }

    public C65807c(AbstractC65808a aVar) {
        this.f165843a = aVar;
    }

    /* renamed from: a */
    public ApiCallResult.Builder mo230503a(String str, String str2) {
        if (this.f165843a == null) {
            return ApiCallResult.Builder.createFail(str).extraInfo(ApiCode.GENERAL_UNKONW_ERROR.msg).errorCode(ApiCode.GENERAL_UNKONW_ERROR.code);
        }
        if (TextUtils.equals(str, "navigateTo")) {
            return this.f165843a.mo230504a(str2);
        }
        if (TextUtils.equals(str, "redirectTo")) {
            return this.f165843a.mo230505b(str2);
        }
        if (TextUtils.equals(str, "reLaunch")) {
            return this.f165843a.mo230506c(str2);
        }
        if (TextUtils.equals(str, "switchTab")) {
            return this.f165843a.mo230507d(str2);
        }
        if (TextUtils.equals(str, "navigateBack")) {
            return this.f165843a.mo230508e(str2);
        }
        return null;
    }
}
