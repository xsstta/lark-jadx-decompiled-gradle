package com.larksuite.component.openplatform.core.plugin.device.nfc;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3411h.AbstractC67730a;
import com.tt.refer.p3400a.p3411h.AbstractC67731b;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.nfc.b */
public abstract class AbstractC24847b extends AbstractC65797c {
    /* renamed from: a */
    public abstract void mo87902a(AbstractC67731b bVar, C67701b bVar2);

    /* renamed from: b */
    public String mo87903b() {
        return "";
    }

    public AbstractC24847b() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(final C67701b bVar) {
        final String appId = mo230473f().getAppId();
        if (TextUtils.isEmpty(appId)) {
            AppBrandLogger.m52830i("ApiHandler", "appid is empty");
            mo230493c("appid is empty");
            return;
        }
        final String str = (String) bVar.mo234984a("tech");
        if (TextUtils.isEmpty(str)) {
            str = mo87903b();
        }
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52830i("ApiHandler", "nfc type is empty");
            mo230493c("nfc type is empty");
            return;
        }
        final AbstractC67730a aVar = (AbstractC67730a) mo230473f().findServiceByInterface(AbstractC67730a.class);
        if (aVar == null) {
            AppBrandLogger.m52830i("ApiHandler", "nfc service is null");
            mo230493c("nfc service is null");
            return;
        }
        aVar.mo87909a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.device.nfc.AbstractC24847b.RunnableC248481 */

            public void run() {
                AbstractC67730a aVar = aVar;
                AbstractC67731b a = aVar.mo87905a(appId + "_" + str);
                if (a == null) {
                    AppBrandLogger.m52830i("ApiHandler", "nfc is null, now create one");
                    a = aVar.mo87906a(str, appId);
                }
                if (a == null) {
                    AppBrandLogger.m52830i("ApiHandler", "nfc is null");
                    AbstractC24847b.this.mo230493c("nfc is null");
                    return;
                }
                AbstractC24847b.this.mo87902a(a, bVar);
            }
        });
    }

    public AbstractC24847b(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
