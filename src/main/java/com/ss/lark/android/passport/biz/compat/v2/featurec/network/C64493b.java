package com.ss.lark.android.passport.biz.compat.v2.featurec.network;

import com.ss.android.lark.passport.env.C48998a;
import com.ss.android.lark.passport.infra.config.PassportConfigCenter;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49194j;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e;

/* renamed from: com.ss.lark.android.passport.biz.compat.v2.featurec.network.b */
public class C64493b {

    /* renamed from: a */
    public static final PassportLog f162855a = PassportLog.f123351c.mo171474a();

    /* renamed from: a */
    public static void m253416a(final AbstractC49352d<String> dVar) {
        PassportConfigCenter.f123034a.mo171110a((String) null);
        ServiceFinder.m193752g().onHostEnvClear(new AbstractC49352d<String>() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64493b.C644963 */

            /* renamed from: a */
            public void mo145179a(String str) {
                C64493b.m253417a(null, dVar);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                PassportLog passportLog = C64493b.f162855a;
                passportLog.mo171465b("GetDidWrapper", "clean error" + networkErrorResult.getErrorMessage());
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145178a(networkErrorResult);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m253417a(UniContext uniContext, final AbstractC49352d<String> dVar) {
        C49194j.m193951a(false, new AbstractC49392e() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64493b.C644952 */

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: a */
            public void mo171341a(String str) {
                PassportLog passportLog = C64493b.f162855a;
                passportLog.mo171465b("GetDidWrapper", "getDeviceId success, deviceId: " + str);
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145179a(str);
                }
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: b */
            public void mo171342b(String str) {
                PassportLog passportLog = C64493b.f162855a;
                passportLog.mo171471d("GetDidWrapper", "getDeviceId Error: " + str);
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145178a(new NetworkErrorResult(-10, str));
                }
            }
        });
    }

    /* renamed from: a */
    public static void m253418a(String str, String str2, final UniContext uniContext, final AbstractC49352d<String> dVar) {
        f162855a.mo171465b("GetDidWrapper", "start updateEnvAndGetDid");
        PassportConfigCenter.f123034a.mo171110a(str2);
        C48998a.f123026a.mo171065a(str, new AbstractC49352d<String>() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64493b.C644941 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                C64493b.f162855a.mo171471d("GetDidWrapper", PassportLog.m193687a("updateEnv error", networkErrorResult));
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145178a(networkErrorResult);
                }
            }

            /* renamed from: a */
            public void mo145179a(String str) {
                C64493b.f162855a.mo171465b("GetDidWrapper", "updateEnv success");
                C64493b.m253417a(uniContext, dVar);
            }
        });
    }
}
