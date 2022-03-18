package com.larksuite.component.openplatform.core.plugin.device.p1133d;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12807f;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66588h;
import com.tt.option.ext.AbstractC67619e;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.d.a */
public class C24808a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getConnectedWifi";
    }

    public C24808a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        HashSet hashSet = new HashSet();
        hashSet.add("android.permission.ACCESS_FINE_LOCATION");
        C66588h.m260183a().mo232189a(getAppContext().getCurrentActivity(), hashSet, new AbstractC66590i() {
            /* class com.larksuite.component.openplatform.core.plugin.device.p1133d.C24808a.C248091 */

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48890a() {
                int i;
                AppBrandLogger.m52830i("ApiGetConnecteWifiCtrl", "permission granted", C24808a.this.mArgs);
                try {
                    i = new JSONObject(C24808a.this.mArgs).optInt("cacheTimeout", 0);
                } catch (JSONException e) {
                    e.printStackTrace();
                    i = 0;
                }
                C12807f d = C24819e.m89919a().mo87862d();
                if (d == null || d.mo48361a() + ((long) (i * 1000)) < System.currentTimeMillis()) {
                    d = new C12807f(C24808a.this.getAppContext());
                    C24819e.m89919a().mo87854a(d);
                    AppBrandLogger.m52830i("ApiGetConnecteWifiCtrl", "no cache:time:", Long.valueOf(d.mo48361a()));
                }
                if (!d.mo48365e()) {
                    C24808a.this.callbackFail("wifi not turned on");
                } else if (TextUtils.isEmpty(d.mo48362b()) || d.mo48362b().contains("unknown ssid")) {
                    AppBrandLogger.m52830i("ApiGetConnecteWifiCtrl", "wifiSSID invalid：" + d.mo48362b());
                    C24808a.this.callbackFail("invalid SSID");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("SSID", d.mo48362b());
                    hashMap.put("BSSID", d.mo48363c());
                    hashMap.put("secure", Boolean.valueOf(d.mo48366f()));
                    hashMap.put("signalStrength", Integer.valueOf(d.mo48364d()));
                    C24808a.this.callbackOk(ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
                }
            }

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48891a(String str) {
                AppBrandLogger.m52830i("ApiGetConnecteWifiCtrl", "permission denied");
                C24808a.this.callbackFail("user denied");
            }
        });
    }

    public C24808a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
