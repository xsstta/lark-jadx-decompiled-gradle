package com.ss.lark.android.passport.biz.compat.v2.http.base;

import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.passport.env.C48998a;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.config.PassportConfigCenter;
import com.ss.android.lark.passport.infra.config.PassportConfigHelper;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49196k;
import com.ss.android.lark.passport.infra.util.storage.C49216a;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.http.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64493b;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.OpsiteAccountData;
import com.ss.lark.android.passport.biz.compat.v2.http.common.C64524d;
import java.util.ArrayList;
import java.util.Map;

public abstract class BaseLoginHttpRequest<T> extends AfterLoginBaseHttpRequest<T> {
    public static final PassportLog log = PassportLog.f123351c.mo171474a();
    protected String mCaptchaType;
    protected boolean mIgnoreCaptchaToken;

    /* access modifiers changed from: protected */
    public boolean isGlobalScene() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean isNewPassportLifecycle() {
        return false;
    }

    public BaseLoginHttpRequest() {
        generateExtraInfo();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest
    public ArrayList<AbstractC64511a> getExtraCommonCodeHandler() {
        return C64524d.m253497a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AfterLoginBaseHttpRequest
    public boolean isAfterLoginStatus() {
        return isGlobalScene();
    }

    public static void removeXPassportToken() {
        C49216a.m194036a().mo171741b("X-Passport-Token");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest
    public SparseArray<Class> getResponseDataClass() {
        SparseArray<Class> responseDataClass = super.getResponseDataClass();
        if (responseDataClass.get(4209) == null) {
            responseDataClass.put(4209, BaseStepData.class);
        }
        return responseDataClass;
    }

    private void generateExtraInfo() {
        if (isNewPassportLifecycle()) {
            String pattern = ServiceFinder.m193752g().getPattern();
            if (!TextUtils.isEmpty(pattern)) {
                if (this.mHttpMethod == HttpMethod.POST) {
                    mRequestBody.put("pattern", pattern);
                } else {
                    this.mQueryParams.put("pattern", pattern);
                }
            }
            Map<String, String> passportExtraRegisterParams = ServiceFinder.m193752g().getPassportExtraRegisterParams();
            if (passportExtraRegisterParams != null && !passportExtraRegisterParams.isEmpty()) {
                mRequestBody.put("reg_params", C38760a.m153057a(passportExtraRegisterParams));
            }
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest, com.ss.lark.android.passport.biz.compat.v2.http.base.AfterLoginBaseHttpRequest
    public C64519g getRequestIntercepts() {
        if (PassportConfigHelper.m193026h()) {
            return new C64519g(getUniContext(), new C64515d(getUniContext()), new C64513c(this.mCaptchaType, this.mIgnoreCaptchaToken, getUniContext()));
        }
        return new C64519g(getUniContext(), new C64515d(getUniContext()));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest$a */
    public static class C64507a<T> implements AbstractC49342a<V2ResponseModel<T>> {

        /* renamed from: a */
        public final IRequest f162870a;

        /* renamed from: b */
        private final AbstractC49342a<V2ResponseModel<T>> f162871b;

        /* renamed from: c */
        private final String f162872c;

        /* renamed from: d */
        private final long f162873d = System.currentTimeMillis();

        /* renamed from: e */
        private final UniContext f162874e;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a
        /* renamed from: a */
        public void mo171966a(NetworkErrorResult networkErrorResult) {
            if (networkErrorResult != null) {
                this.f162871b.mo171966a(networkErrorResult);
            }
        }

        /* renamed from: a */
        public void mo223167a(AbstractC49342a<V2ResponseModel<T>> aVar) {
            if (aVar != null) {
                aVar.mo171966a(new NetworkErrorResult(-1, "change unit error"));
            }
        }

        /* renamed from: a */
        private void m253451a(String str) {
            if (!TextUtils.isEmpty(str)) {
                C49096b.m193582b(str, System.currentTimeMillis() - this.f162873d);
            }
        }

        /* renamed from: a */
        public void mo223168a(V2ResponseModel<T> v2ResponseModel) {
            AbstractC49342a<V2ResponseModel<T>> aVar;
            m253451a(this.f162872c);
            if (!m253452a(v2ResponseModel, this.f162871b) && (aVar = this.f162871b) != null) {
                aVar.mo171968a(v2ResponseModel);
            }
        }

        /* renamed from: b */
        public void mo223169b(AbstractC49342a<V2ResponseModel<T>> aVar) {
            BaseLoginHttpRequest.removeXPassportToken();
            HttpHeaders headers = this.f162870a.getHeaders();
            if (headers != null) {
                headers.remove("X-Passport-Token");
                C49196k.m193953a(headers, "X-Passport-Unit", C48998a.f123026a.mo171069d());
            }
            this.f162870a.retryRequest(aVar);
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo171968a(Object obj) {
            mo223168a((V2ResponseModel) ((V2ResponseModel) obj));
        }

        /* renamed from: a */
        private boolean m253452a(V2ResponseModel<T> v2ResponseModel, final AbstractC49342a<V2ResponseModel<T>> aVar) {
            if (v2ResponseModel == null || v2ResponseModel.code != 4205) {
                return false;
            }
            OpsiteAccountData opsiteAccountData = (OpsiteAccountData) v2ResponseModel.data;
            if (this.f162870a.canLog()) {
                BaseLoginHttpRequest.log.mo171465b(this.f162870a.getName(), "changeEnv start");
            }
            if (opsiteAccountData == null) {
                if (this.f162870a.canLog()) {
                    BaseLoginHttpRequest.log.mo171471d(this.f162870a.getName(), "changeEnv data null and return");
                }
                mo223167a((AbstractC49342a) aVar);
                return false;
            }
            String str = opsiteAccountData.changeToUnit;
            if (TextUtils.isEmpty(str)) {
                if (this.f162870a.canLog()) {
                    BaseLoginHttpRequest.log.mo171471d(this.f162870a.getName(), "changeEnv targetUnit is empty");
                }
                mo223167a((AbstractC49342a) aVar);
                return false;
            }
            final String d = C48998a.f123026a.mo171069d();
            final String configEnv = ServiceFinder.m193749d().getConfigEnv();
            C64493b.m253418a(str, opsiteAccountData.changeToConfigEnv, this.f162874e, new AbstractC49352d<String>() {
                /* class com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest.C64507a.C645081 */

                /* renamed from: a */
                private void m253458a() {
                    PassportConfigCenter.f123034a.mo171110a(configEnv);
                    C48998a.f123026a.mo171065a(d, (AbstractC49352d<String>) null);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    m253458a();
                    if (C64507a.this.f162870a.canLog()) {
                        BaseLoginHttpRequest.log.mo171465b(C64507a.this.f162870a.getName(), PassportLog.m193687a("updateEnvAndGetDid updateEnvAndGetDid failed", networkErrorResult));
                    }
                    AbstractC49342a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo171966a(networkErrorResult);
                    }
                }

                /* renamed from: a */
                public void mo145179a(String str) {
                    if (C64507a.this.f162870a.canLog()) {
                        BaseLoginHttpRequest.log.mo171465b(C64507a.this.f162870a.getName(), "changeEnv updateEnvAndGetDid onSuccess");
                    }
                    if (C64507a.this.f162870a != null) {
                        C64507a.this.mo223169b(aVar);
                        return;
                    }
                    m253458a();
                    C64507a.this.mo223167a((AbstractC49342a) aVar);
                }
            });
            return true;
        }

        C64507a(AbstractC49342a<V2ResponseModel<T>> aVar, String str, UniContext uniContext, IRequest iRequest) {
            this.f162871b = aVar;
            this.f162872c = str;
            this.f162870a = iRequest;
            this.f162874e = uniContext;
        }
    }

    public static void updateXPassportToken(String str) {
        C49216a.m194036a().mo171740a("X-Passport-Token", str);
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest, com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public AbstractC49347c request2(AbstractC49342a<V2ResponseModel<T>> aVar) {
        return super.request2(new C64507a(aVar, this.mCaptchaType, this.mUniContext, this));
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest, com.ss.lark.android.passport.biz.compat.v2.http.base.BaseRequest
    public HttpHeaders buildHeaders(HttpHeaders httpHeaders) {
        super.buildHeaders(httpHeaders);
        if (!isNewPassportLifecycle()) {
            String a = C49216a.m194036a().mo171739a("X-Passport-Token");
            if (!TextUtils.isEmpty(a)) {
                httpHeaders.put("X-Passport-Token", a);
            }
        } else if (canLog()) {
            PassportLog passportLog = log;
            String name = getName();
            passportLog.mo171465b(name, "empty token : " + getPath());
        }
        return httpHeaders;
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest, com.ss.android.lark.passport.signinsdk_api.base.http.IRequest, com.ss.lark.android.passport.biz.compat.v2.http.base.AfterLoginBaseHttpRequest
    public void onProcessResponseHeaders(Map<String, String> map) {
        super.onProcessResponseHeaders(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if ("X-Passport-Token".equalsIgnoreCase(entry.getKey())) {
                String value = entry.getValue();
                if (!TextUtils.isEmpty(value) && !isCancelable()) {
                    if (canLog()) {
                        log.mo171465b(getName(), "updateXPassportToken");
                    }
                    updateXPassportToken(value);
                }
            }
        }
    }
}
