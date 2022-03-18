package com.larksuite.component.openplatform.core.plugin.device.p1133d;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12807f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import me.ele.lancet.base.annotations.Skip;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.d.e */
public class C24819e {

    /* renamed from: a */
    public WifiManager f60956a = ((WifiManager) AppbrandContext.getInst().getApplicationContext().getSystemService("wifi"));

    /* renamed from: b */
    public boolean f60957b = false;

    /* renamed from: c */
    public ConcurrentHashMap<IAppContext, AbstractC67709b> f60958c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private Map<IAppContext, C24820a> f60959d = new ConcurrentHashMap();

    /* renamed from: e */
    private AtomicBoolean f60960e = new AtomicBoolean();

    /* renamed from: f */
    private C12807f f60961f;

    /* renamed from: d */
    public C12807f mo87862d() {
        return this.f60961f;
    }

    /* renamed from: b */
    public boolean mo87859b() {
        return this.f60956a.isWifiEnabled();
    }

    /* renamed from: c */
    public boolean mo87861c() {
        return this.f60956a.startScan();
    }

    /* renamed from: a */
    public static C24819e m89919a() {
        return ContextSingletonInstance.getInstance().getAppbrandWifiManager();
    }

    /* renamed from: a */
    public void mo87854a(C12807f fVar) {
        this.f60961f = fVar;
    }

    /* renamed from: b */
    public void mo87858b(IAppContext iAppContext) {
        C24820a remove = this.f60959d.remove(iAppContext);
        if (remove != null && this.f60957b) {
            AppbrandContext.getInst().getApplicationContext().unregisterReceiver(remove);
            this.f60957b = false;
        }
    }

    /* renamed from: a */
    public void mo87855a(IAppContext iAppContext) {
        C24820a aVar = this.f60959d.get(iAppContext);
        if (aVar == null) {
            aVar = new C24820a(iAppContext);
            this.f60959d.put(iAppContext, aVar);
        }
        if (!this.f60957b) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            m89918a(AppbrandContext.getInst().getApplicationContext(), aVar, intentFilter);
            this.f60957b = true;
        }
    }

    /* renamed from: c */
    public void mo87860c(IAppContext iAppContext) {
        this.f60958c.remove(iAppContext);
        if (this.f60958c.size() == 0 && this.f60960e.compareAndSet(true, false)) {
            C24820a remove = this.f60959d.remove(iAppContext);
            if (remove != null) {
                AppbrandContext.getInst().getApplicationContext().unregisterReceiver(remove);
                return;
            }
            AppBrandLogger.m52830i("AppbrandWifiManager", "not unRegistered: " + this.f60958c.size() + this.f60960e.get());
        }
    }

    /* renamed from: a */
    public boolean mo87857a(ScanResult scanResult) {
        String str = scanResult.capabilities;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArr = {"WEP", "WPA", "WPA2", "WPA-EAP", "IEEE8021X", "-EAP-"};
        for (int i = 0; i < 6; i++) {
            if (str.contains(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.d.e$a */
    class C24820a extends BroadcastReceiver {

        /* renamed from: b */
        private IAppContext f60963b;

        public C24820a(IAppContext iAppContext) {
            this.f60963b = iAppContext;
        }

        public void onReceive(Context context, Intent intent) {
            if (C66588h.m260183a().mo232195a(context, "android.permission.ACCESS_FINE_LOCATION") || C66588h.m260183a().mo232195a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                try {
                    List<ScanResult> scanResults = C24819e.this.f60956a.getScanResults();
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    for (ScanResult scanResult : scanResults) {
                        JSONObject jSONObject2 = new JSONObject();
                        if (scanResult.SSID != null) {
                            if (scanResult.BSSID != null) {
                                jSONObject2.put("SSID", scanResult.SSID);
                                jSONObject2.put("BSSID", scanResult.BSSID);
                                jSONObject2.put("secure", C24819e.this.mo87857a(scanResult));
                                jSONObject2.put("signalStrength", Math.abs(scanResult.level));
                                jSONArray.put(jSONObject2);
                            }
                        }
                    }
                    jSONObject.put("wifiList", jSONArray);
                    AppBrandLogger.m52830i("AppbrandWifiManager", "onReceive wifi: " + C24819e.this.f60957b + C24819e.this.f60958c.size());
                    if (C24819e.this.f60957b) {
                        C67432a.m262319a(this.f60963b).getJsBridge().sendMsgToJsCore("onGetWifiList", jSONObject.toString());
                        return;
                    }
                    for (Map.Entry<IAppContext, AbstractC67709b> entry : C24819e.this.f60958c.entrySet()) {
                        ((AbstractC67709b.AbstractC67710a) entry.getValue().mo235130i()).mo235028a(C67706e.C67708a.m263377a("onGetWifiList", jSONObject).mo235009a());
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo87856a(IAppContext iAppContext, AbstractC67709b bVar) {
        this.f60958c.put(iAppContext, bVar);
        if (this.f60960e.compareAndSet(false, true)) {
            C24820a aVar = this.f60959d.get(iAppContext);
            if (aVar == null) {
                aVar = new C24820a(iAppContext);
                this.f60959d.put(iAppContext, aVar);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            m89918a(AppbrandContext.getInst().getApplicationContext(), aVar, intentFilter);
            return;
        }
        AppBrandLogger.m52830i("AppbrandWifiManager", "registered");
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m89918a(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return application.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
