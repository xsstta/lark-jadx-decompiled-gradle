package com.ss.lark.android.passport.biz.compat.v1.http;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.network.p2431a.C49069a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.http.AbstractC49355c;
import com.ss.android.lark.passport.signinsdk_api.base.http.C49353a;
import com.ss.android.lark.passport.signinsdk_api.base.http.IRequest;
import com.ss.lark.android.passport.biz.C64340b;
import java.io.Serializable;

public class ResponseFilter implements AbstractC49355c {

    /* renamed from: a */
    private static AbstractC64477a f162805a;

    /* renamed from: b */
    private final IRequest f162806b;

    /* renamed from: c */
    private final PassportLog f162807c = PassportLog.f123351c.mo171474a();

    /* renamed from: com.ss.lark.android.passport.biz.compat.v1.http.ResponseFilter$a */
    public interface AbstractC64477a {
        /* renamed from: a */
        void mo223083a(String str);
    }

    public static class BaseResponseModelCopy implements Serializable {
        private int code;
        private String error;
        private String message;

        public int getErrorCode() {
            return this.code;
        }

        public boolean isSuccess() {
            if (this.code == 0) {
                return true;
            }
            return false;
        }

        public String getErrorMessage() {
            if (TextUtils.isEmpty(this.message)) {
                return this.error;
            }
            return this.message;
        }

        public void setCode(int i) {
            this.code = i;
        }

        public void setError(String str) {
            this.error = str;
        }

        public void setMessage(String str) {
            this.message = str;
        }
    }

    public ResponseFilter(IRequest iRequest) {
        this.f162806b = iRequest;
    }

    /* renamed from: a */
    private BaseResponseModelCopy m253362a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (BaseResponseModelCopy) JSONObject.parseObject(str, BaseResponseModelCopy.class);
        } catch (Exception e) {
            this.f162807c.mo171462a("ResponseFilter", "parse body exception", e);
            return null;
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.AbstractC49355c
    /* renamed from: a */
    public NetworkErrorResult mo172168a(C49353a aVar) {
        NetworkErrorResult networkErrorResult;
        NetworkErrorResult networkErrorResult2;
        int a = aVar.mo172165a();
        if (a == 401) {
            AbstractC64477a aVar2 = f162805a;
            if (aVar2 != null) {
                aVar2.mo223083a(aVar.mo172167c());
            }
            networkErrorResult = new NetworkErrorResult(a, C64340b.m252955a().mo222860b().getString(R.string.Lark_Login_SessionExpiredTip));
        } else {
            if (a == 400 || a == 500) {
                BaseResponseModelCopy a2 = m253362a(aVar.mo172166b());
                if (a2 != null) {
                    networkErrorResult = new NetworkErrorResult(a, a2.getErrorMessage());
                } else {
                    networkErrorResult2 = new NetworkErrorResult(-2, "http status code:" + a);
                }
            } else if (a <= 500 || a >= 600) {
                networkErrorResult = null;
            } else {
                networkErrorResult2 = new NetworkErrorResult(-2, "http status code:" + a + " " + "server error");
            }
            networkErrorResult = networkErrorResult2;
        }
        if (networkErrorResult != null) {
            networkErrorResult.setBizCode(C49069a.m193379a(aVar.mo172166b(), this.f162806b.getUniContext()));
            if (this.f162806b.canLog()) {
                PassportLog passportLog = this.f162807c;
                passportLog.mo171471d("ResponseFilter", PassportLog.m193687a(this.f162806b.getName() + " filter error", networkErrorResult));
            }
        }
        return networkErrorResult;
    }
}
