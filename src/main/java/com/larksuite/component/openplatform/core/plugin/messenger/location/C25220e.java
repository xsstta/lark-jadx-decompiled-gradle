package com.larksuite.component.openplatform.core.plugin.messenger.location;

import android.content.Context;
import android.location.LocationManager;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.HashMap;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.location.e */
public class C25220e extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getLocationStatus";
    }

    public C25220e() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        boolean z;
        String str;
        if (AppbrandContext.getInst().getApplicationContext() != null) {
            boolean a = m90637a(AppbrandContext.getInst().getApplicationContext());
            if (!C66588h.m260183a().mo232195a(AppbrandContext.getInst().getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") || !C66588h.m260183a().mo232195a(AppbrandContext.getInst().getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                z = false;
            } else {
                z = true;
            }
            boolean a2 = ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo50179a(12, false);
            if (!a || !z || !a2) {
                str = "off";
            } else {
                str = "on";
            }
            AppBrandLogger.m52830i("LarkApiGetLocationStatus", "gps state:" + str, "system permission:" + z, "app permission:" + a2, "gps is open:" + a);
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("gpsStatus", str);
            callbackOtherExtraMsg(true, hashMap);
            return;
        }
        callbackFail("context is null");
        AppBrandLogger.m52829e("LarkApiGetLocationStatus", "GetLocationStatus:", "context is null");
    }

    /* renamed from: a */
    private boolean m90637a(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager != null) {
            return locationManager.isProviderEnabled("gps");
        }
        return false;
    }

    public C25220e(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
