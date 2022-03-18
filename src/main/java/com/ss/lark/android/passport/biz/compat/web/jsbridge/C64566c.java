package com.ss.lark.android.passport.biz.compat.web.jsbridge;

import android.content.Context;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.jsbridge.AbstractC40669e;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49185d;
import com.ss.android.lark.passport.infra.util.C49194j;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e;

/* renamed from: com.ss.lark.android.passport.biz.compat.web.jsbridge.c */
public class C64566c extends AbstractC64564a {

    /* renamed from: a */
    public final Context f162999a;

    @Override // com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64564a
    /* renamed from: a */
    public String mo223288a() {
        return "device.base.getSystemInfo";
    }

    /* renamed from: com.ss.lark.android.passport.biz.compat.web.jsbridge.c$a */
    private class C64568a extends BaseJSModel {
        public String appVersion;
        public String deviceID;
        public String model;
        public float pixelRatio;
        public String platform;
        public String system;

        private C64568a() {
        }
    }

    public C64566c(Context context) {
        this.f162999a = context;
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64564a, com.ss.android.lark.jsbridge.AbstractC40665a
    /* renamed from: a */
    public void mo146778a(String str, final AbstractC40669e eVar) {
        PassportLog a = PassportLog.f123351c.mo171474a();
        a.mo171465b("Bridge", "GetSystemInfoJsHandler: " + str);
        C49194j.m193951a(true, new AbstractC49392e() {
            /* class com.ss.lark.android.passport.biz.compat.web.jsbridge.C64566c.C645671 */

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: b */
            public void mo171342b(String str) {
                eVar.mo107243b("{}");
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: a */
            public void mo171341a(String str) {
                C64568a aVar = new C64568a();
                aVar.system = C49185d.m193927b();
                aVar.appVersion = C49185d.m193926a(C64566c.this.f162999a);
                aVar.platform = "android";
                aVar.model = C49185d.m193925a();
                aVar.pixelRatio = C49185d.m193929c(C64566c.this.f162999a);
                aVar.deviceID = str;
                PassportLog a = PassportLog.f123351c.mo171474a();
                a.mo171465b("Bridge", "GetSystemInfoJsHandler: encrypt deviceId=" + str);
                eVar.mo107242a(C38760a.m153057a(aVar));
            }
        });
    }
}
