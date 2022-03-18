package com.larksuite.component.openplatform.core.plugin.device.p1133d;

import android.app.Activity;
import android.location.LocationManager;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapp.permission.C66578b;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

@ApiSupportType(apiName = {"getWifiList"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.d.g */
public class C24823g extends AbstractC65797c {
    public C24823g() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("getWifiList");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        if (!C24819e.m89919a().mo87859b()) {
            mo230481a(ApiCode.GETWIFILIST_WIFI_NOT_TURNED_ON);
        } else if (!((LocationManager) mo230473f().getApplicationContext().getSystemService("location")).isProviderEnabled("gps")) {
            mo230481a(ApiCode.GETWIFILIST_GPS_NOT_TURNED_ON);
        } else {
            Activity f = mo230475h().mo235051f();
            if (f == null) {
                mo230482a(ApiCode.GENERAL_UNKONW_ERROR, "activity is null");
            } else {
                m89933a(f, mo230475h().mo235030a(12));
            }
        }
    }

    public C24823g(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* renamed from: a */
    private void m89933a(Activity activity, final boolean z) {
        final AbstractC67733a aVar = (AbstractC67733a) mo230473f().findServiceByInterface(AbstractC67733a.class);
        mo230475h().mo235021a(activity, this.f165818h, C66578b.C66579a.m260113b(mo230473f()), new AbstractC67709b.AbstractC67711b() {
            /* class com.larksuite.component.openplatform.core.plugin.device.p1133d.C24823g.C248241 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87574a() {
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                C24823g.this.mo230475h().mo235022a(C24823g.this.mo230475h().mo235051f(), C24823g.this.mo230472e(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.device.p1133d.C24823g.C248241.C248251 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C24823g.this.mo230473f()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "success").mo231092a();
                        }
                        if (C24819e.m89919a().mo87861c()) {
                            C24823g.this.mo230494j();
                        } else {
                            C24823g.this.mo230482a(ApiCode.GENERAL_UNKONW_ERROR, "system internal error");
                        }
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C24823g.this.mo230473f()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                        }
                        C24823g.this.mo230481a(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
                    }
                });
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87575a(String str) {
                C24823g.this.mo230481a(ApiCode.GENERAL_USER_AUTH_DENIED);
            }
        });
    }
}
