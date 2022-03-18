package com.ss.lark.android.passport.biz.compat.v2.http.base;

import android.text.TextUtils;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.storage.C49216a;
import com.ss.lark.android.passport.biz.account.C64291a;
import java.util.Map;

public abstract class AfterLoginBaseHttpRequest<T> extends BaseV3HttpRequest<T> {
    private static String sXPassportPwdToken;

    /* access modifiers changed from: protected */
    public boolean isAfterLoginStatus() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean isNeedPassportToken() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean isNeedVerifyToken() {
        return false;
    }

    public AfterLoginBaseHttpRequest() {
        if (isAfterLoginStatus()) {
            appendAfterLoginDatas();
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest
    public C64519g getRequestIntercepts() {
        return new C64519g(getUniContext(), new C64515d(getUniContext()));
    }

    public void appendAfterLoginDatas() {
        if (!TextUtils.isEmpty(sXPassportPwdToken)) {
            this.mHeaders.put("X-Passport-PWD-Token", sXPassportPwdToken);
        }
        if (isNeedPassportToken()) {
            String a = C49216a.m194036a().mo171739a("X-Passport-Token");
            if (!TextUtils.isEmpty(a)) {
                this.mHeaders.put("X-Passport-Token", a);
            }
        }
        String a2 = C64291a.m252803a();
        if (!TextUtils.isEmpty(a2)) {
            this.mHeaders.put("Suite-Session-Key", a2);
            if (this.mHeaders.get(ConvertOfficeToSpaceService.f88309g) == null) {
                HttpHeaders httpHeaders = this.mHeaders;
                httpHeaders.put(ConvertOfficeToSpaceService.f88309g, "session=" + a2);
            }
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest, com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public void onProcessResponseHeaders(Map<String, String> map) {
        super.onProcessResponseHeaders(map);
        if (isAfterLoginStatus()) {
            handleResponseHandlers(map);
        }
    }

    public void handleResponseHandlers(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if ("X-Passport-PWD-Token".equalsIgnoreCase(entry.getKey())) {
                String value = entry.getValue();
                if (!TextUtils.isEmpty(value)) {
                    sXPassportPwdToken = value;
                }
            }
            if (isNeedPassportToken() && "X-Passport-Token".equalsIgnoreCase(entry.getKey())) {
                String value2 = entry.getValue();
                if (!TextUtils.isEmpty(value2) && !isCancelable()) {
                    if (canLog()) {
                        PassportLog passportLog = this.log;
                        String name = getName();
                        passportLog.mo171465b(name, "passportToken: " + value2);
                    }
                    C49216a.m194036a().mo171740a("X-Passport-Token", value2);
                }
            }
            if (isNeedVerifyToken() && "X-Verify-Token".equalsIgnoreCase(entry.getKey())) {
                String value3 = entry.getValue();
                if (!TextUtils.isEmpty(value3) && !isCancelable()) {
                    if (canLog()) {
                        PassportLog passportLog2 = this.log;
                        String name2 = getName();
                        passportLog2.mo171465b(name2, "verifyToken: " + value3);
                    }
                    C49216a.m194036a().mo171740a("X-Verify-Token", value3);
                }
            }
        }
    }
}
