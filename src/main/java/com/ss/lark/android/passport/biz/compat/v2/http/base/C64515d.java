package com.ss.lark.android.passport.biz.compat.v2.http.base;

import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49194j;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e;

/* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.base.d */
public class C64515d implements AbstractC64517e<String> {

    /* renamed from: a */
    public final PassportLog f162893a = PassportLog.f123351c.mo171474a();

    /* renamed from: b */
    public UniContext f162894b;

    public C64515d(UniContext uniContext) {
        this.f162894b = uniContext;
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64517e
    /* renamed from: a */
    public void mo223181a(final BaseV3HttpRequest baseV3HttpRequest, final AbstractC49352d<String> dVar) {
        C49194j.m193951a(false, new AbstractC49392e() {
            /* class com.ss.lark.android.passport.biz.compat.v2.http.base.C64515d.C645161 */

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: a */
            public void mo171341a(String str) {
                PassportLog passportLog = C64515d.this.f162893a;
                passportLog.mo171465b("DeviceIdInterceptor", "login with getDeviceId deviceId=" + str);
                dVar.mo145179a(str);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: b */
            public void mo171342b(String str) {
                if (!(C64515d.this.f162894b == null || baseV3HttpRequest == null)) {
                    C64515d.this.f162894b.appendOneTimeParam("X-Request-ID", baseV3HttpRequest.getHeaders().get("X-Request-ID"));
                }
                PassportLog passportLog = C64515d.this.f162893a;
                passportLog.mo171471d("DeviceIdInterceptor", "login failed, getDeviceId error: " + str);
                dVar.mo145178a(new NetworkErrorResult(-10, str));
            }
        });
    }
}
