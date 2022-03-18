package com.larksuite.component.openplatform.core.plugin.device.p1133d;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12807f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@ApiSupportType(apiName = {"getConnectedWifi"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.d.f */
public class C24821f extends AbstractC65797c {
    public C24821f() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("getConnectedWifi");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(final C67701b bVar) {
        HashSet hashSet = new HashSet();
        hashSet.add("android.permission.ACCESS_FINE_LOCATION");
        mo230475h().mo235022a(mo230475h().mo235051f(), mo230472e(), hashSet, new AbstractC67709b.AbstractC67711b() {
            /* class com.larksuite.component.openplatform.core.plugin.device.p1133d.C24821f.C248221 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87574a() {
                boolean z;
                AppBrandLogger.m52830i("GetConnectedWifiHandler", "permission granted", bVar.mo234987c());
                int intValue = ((Integer) bVar.mo234987c().mo234998a("cacheTimeout", 0)).intValue();
                C12807f d = C24819e.m89919a().mo87862d();
                Object[] objArr = new Object[1];
                StringBuilder sb = new StringBuilder();
                sb.append("wifiObjIsNull=");
                if (d == null) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z);
                objArr[0] = sb.toString();
                AppBrandLogger.m52830i("GetConnectedWifiHandler", objArr);
                if (d == null || d.mo48361a() + ((long) (intValue * 1000)) < System.currentTimeMillis()) {
                    d = new C12807f(C24821f.this.mo230475h().mo235051f());
                    C24819e.m89919a().mo87854a(d);
                    AppBrandLogger.m52830i("GetConnectedWifiHandler", "no cache:time:", Long.valueOf(d.mo48361a()));
                }
                if (!d.mo48365e()) {
                    AppBrandLogger.m52830i("GetConnectedWifiHandler", "wifi not enable");
                    C24821f.this.mo230481a(ApiCode.GETCONNECTEDWIFI_WIFI_NOT_TURNED_ON);
                } else if (TextUtils.isEmpty(d.mo48362b()) || d.mo48362b().contains("unknown ssid")) {
                    AppBrandLogger.m52830i("GetConnectedWifiHandler", "wifiSSID invalid：" + d.mo48362b());
                    C24821f.this.mo230481a(ApiCode.GETCONNECTEDWIFI_INVALID_SSID);
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("SSID", d.mo48362b());
                    hashMap.put("BSSID", d.mo48363c());
                    hashMap.put("secure", Boolean.valueOf(d.mo48366f()));
                    hashMap.put("signalStrength", Integer.valueOf(d.mo48364d()));
                    C24821f.this.mo230492b(ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
                }
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87575a(String str) {
                AppBrandLogger.m52830i("GetConnectedWifiHandler", "permission denied permission=" + str);
                C24821f.this.mo230481a(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
            }
        });
    }

    public C24821f(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
