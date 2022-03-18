package com.ss.lark.android.passport.biz.compat.v2.http.base;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.passport.infra.base.p2423a.C49012c;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.C64340b;
import java.util.Map;

/* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.base.c */
public class C64513c implements AbstractC64517e<String> {

    /* renamed from: a */
    public final String f162885a;

    /* renamed from: b */
    public UniContext f162886b;

    /* renamed from: c */
    public final PassportLog f162887c = PassportLog.f123351c.mo171474a();

    /* renamed from: d */
    private final boolean f162888d;

    /* renamed from: a */
    public String mo223180a(BaseV3HttpRequest baseV3HttpRequest) {
        String path = baseV3HttpRequest.getPath();
        Map<String, String> queryParamsMap = baseV3HttpRequest.getQueryParamsMap();
        if (queryParamsMap.isEmpty()) {
            return path;
        }
        Uri.Builder buildUpon = Uri.parse(path).buildUpon();
        for (Map.Entry<String, String> entry : queryParamsMap.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64517e
    /* renamed from: a */
    public void mo223181a(BaseV3HttpRequest baseV3HttpRequest, AbstractC49352d<String> dVar) {
        m253474c(baseV3HttpRequest, dVar);
    }

    /* renamed from: b */
    private void m253473b(BaseV3HttpRequest baseV3HttpRequest, AbstractC49352d dVar) {
        String str;
        String a = mo223180a(baseV3HttpRequest);
        String str2 = "";
        if (HttpMethod.POST != baseV3HttpRequest.getMethod() || BaseV3HttpRequest.mRequestBody.isEmpty()) {
            str = str2;
        } else {
            str = C38760a.m153057a(BaseV3HttpRequest.mRequestBody);
        }
        Context b = C64340b.m252955a().mo222860b();
        try {
            str2 = b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
        } catch (Exception e) {
            this.f162887c.mo171462a("CaptchaIdInterceptor", "sendRequestBeforeGetToken, init error", e);
        }
        PassportLog passportLog = this.f162887c;
        passportLog.mo171465b("CaptchaIdInterceptor", "info: " + baseV3HttpRequest.getMethod() + "; " + str2 + "; " + "android");
        ServiceFinder.m193752g().getCaptchaToken(a, str, str2, "android", dVar);
    }

    /* renamed from: c */
    private void m253474c(final BaseV3HttpRequest baseV3HttpRequest, final AbstractC49352d dVar) {
        this.f162887c.mo171465b("CaptchaIdInterceptor", "doRequestCaptchaToken");
        if (baseV3HttpRequest == null) {
            this.f162887c.mo171465b("CaptchaIdInterceptor", "doRequestCaptchaToken request is null");
            if (dVar != null) {
                dVar.mo145178a(new NetworkErrorResult(-1, "request is null"));
            }
        } else if (this.f162888d) {
            this.f162887c.mo171465b("CaptchaIdInterceptor", "no need captchaToken");
            if (dVar != null) {
                dVar.mo145179a("");
            }
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            m253473b(baseV3HttpRequest, new C49012c(new AbstractC49352d<String>() {
                /* class com.ss.lark.android.passport.biz.compat.v2.http.base.C64513c.C645141 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    if (C64513c.this.f162886b != null) {
                        C64513c.this.f162886b.appendOneTimeParam("X-Request-ID", baseV3HttpRequest.getHeaders().get("X-Request-ID"));
                    }
                    C64513c.this.f162887c.mo171471d("CaptchaIdInterceptor", PassportLog.m193687a("sendRequestBeforeGetToken onError", networkErrorResult));
                    AbstractC49352d dVar = dVar;
                    if (dVar != null) {
                        dVar.mo145178a(new NetworkErrorResult(-4, networkErrorResult.getErrorMessage()));
                    }
                }

                /* renamed from: a */
                public void mo145179a(String str) {
                    C49096b.m193576a(C64513c.this.f162885a, System.currentTimeMillis() - currentTimeMillis);
                    if (!TextUtils.isEmpty(str)) {
                        baseV3HttpRequest.mHeaders.put("X-Sec-Captcha-Token", str);
                    } else {
                        C64513c.this.f162887c.mo171465b("CaptchaIdInterceptor", "sendRequestBeforeGetToken request token is empty");
                    }
                    AbstractC49352d dVar = dVar;
                    if (dVar != null) {
                        dVar.mo145179a(str);
                    }
                }
            }));
        }
    }

    public C64513c(String str, boolean z, UniContext uniContext) {
        this.f162885a = str;
        this.f162888d = z;
        this.f162886b = uniContext;
    }
}
