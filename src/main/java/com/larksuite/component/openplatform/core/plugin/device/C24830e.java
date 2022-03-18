package com.larksuite.component.openplatform.core.plugin.device;

import android.app.Activity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66588h;
import com.tt.option.ext.AbstractC67619e;
import java.util.HashSet;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.e */
public class C24830e extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "onUserCaptureScreen";
    }

    public C24830e() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity == null) {
            callbackFail(ApiCallResultHelper.generateDataNullExtraInfo("activity"));
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add("android.permission.READ_EXTERNAL_STORAGE");
        C66588h.m260183a().mo232189a(currentActivity, hashSet, new AbstractC66590i() {
            /* class com.larksuite.component.openplatform.core.plugin.device.C24830e.C248311 */

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48890a() {
                try {
                    C24843n.m89965b(C24830e.this.getAppContext()).mo87868a();
                    C24830e.this.callbackOk();
                } catch (Exception e) {
                    AppBrandLogger.m52829e("ApiOnUserCaptureScreenCtrl", "act", e);
                    C24830e.this.callbackFail(e);
                }
            }

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48891a(String str) {
                AppBrandLogger.m52828d("ApiOnUserCaptureScreenCtrl", "requestPermissionsIfNecessaryForResult user denied");
                C24830e.this.callbackFail("system auth deny");
            }
        });
    }

    public C24830e(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
