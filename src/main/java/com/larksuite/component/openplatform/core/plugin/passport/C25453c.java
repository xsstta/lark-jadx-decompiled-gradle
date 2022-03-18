package com.larksuite.component.openplatform.core.plugin.passport;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.ExtensionWrapper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import java.util.HashMap;

/* renamed from: com.larksuite.component.openplatform.core.plugin.passport.c */
public class C25453c extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getDeviceID";
    }

    public C25453c() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        boolean a = ((AbstractC67734b) getAppContext().findServiceByInterface(AbstractC67734b.class)).mo50195a("deviceID");
        AppBrandLogger.m52830i("LarkApiGetDeviceIdCtrl", "handle GetDeviceId api, permission:" + a);
        if (a) {
            LarkExtensionManager.getInstance().getExtension().getDeviceId(new ExtensionWrapper.AbstractC13303a() {
                /* class com.larksuite.component.openplatform.core.plugin.passport.C25453c.C254541 */

                @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper.AbstractC13303a
                /* renamed from: a */
                public void mo48821a(String str) {
                    if (str == null) {
                        AppBrandLogger.m52829e("LarkApiGetDeviceIdCtrl", "hash id failed");
                        C25453c.this.callbackExtraInfoMsg(false, " hash failed");
                        return;
                    }
                    AppBrandLogger.m52830i("LarkApiGetDeviceIdCtrl", "deviceID " + str);
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("deviceID", str);
                    C25453c.this.callbackMsg(true, hashMap, null);
                }

                @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper.AbstractC13303a
                /* renamed from: b */
                public void mo48822b(String str) {
                    AppBrandLogger.m52829e("LarkApiGetDeviceIdCtrl", "getDeviceId failed, msg:" + str);
                    C25453c.this.callbackExtraInfoMsg(false, str);
                }
            });
            return;
        }
        callbackExtraInfoMsg(false, "no deviceID authorization");
        AppBrandLogger.m52830i("LarkApiGetDeviceIdCtrl", "handle GetDeviceId api fail: no permission");
    }

    public C25453c(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
