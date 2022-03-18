package com.larksuite.component.openplatform.core.plugin.infra.network;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;
import java.util.HashMap;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.a */
public class C24928a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getNetworkType";
    }

    public C24928a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        HashMap hashMap = new HashMap();
        hashMap.put("networkType", m90164a(AppbrandContext.getInst().getApplicationContext()));
        callbackOk(ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
    }

    /* renamed from: a */
    private Object m90164a(Application application) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("getNetType ctxIsNull=");
        if (application == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        objArr[0] = sb.toString();
        AppBrandLogger.m52830i("ApiGetNetworkTypeCtrl", objArr);
        ConnectivityManager connectivityManager = (ConnectivityManager) application.getSystemService("connectivity");
        Object[] objArr2 = new Object[1];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getNetType cmIsNull=");
        if (connectivityManager == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sb2.append(z2);
        objArr2[0] = sb2.toString();
        AppBrandLogger.m52830i("ApiGetNetworkTypeCtrl", objArr2);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            Object[] objArr3 = new Object[1];
            StringBuilder sb3 = new StringBuilder();
            sb3.append("netInfoIsNull=");
            if (activeNetworkInfo != null) {
                z3 = false;
            }
            sb3.append(z3);
            objArr3[0] = sb3.toString();
            AppBrandLogger.m52830i("ApiGetNetworkTypeCtrl", objArr3);
            return "none";
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return C67053q.m261331c(application);
        }
        if (type == 1) {
            return "wifi";
        }
        AppBrandLogger.m52830i("ApiGetNetworkTypeCtrl", "netType=" + type);
        return "unknown";
    }

    public C24928a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
