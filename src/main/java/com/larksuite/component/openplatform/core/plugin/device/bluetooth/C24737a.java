package com.larksuite.component.openplatform.core.plugin.device.bluetooth;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.ParcelUuid;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.p649d.C12988a;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24777a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.ele.lancet.base.annotations.Skip;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.a */
public class C24737a {

    /* renamed from: a */
    public Map<String, ScanResult> f60858a = new HashMap();

    /* renamed from: b */
    public IAppContext f60859b;

    /* renamed from: c */
    private boolean f60860c;

    /* renamed from: d */
    private boolean f60861d;

    /* renamed from: e */
    private ScanCallback f60862e;

    /* renamed from: f */
    private C24740b f60863f;

    /* renamed from: g */
    private boolean f60864g;

    /* renamed from: h */
    private C24739a f60865h = new C24739a();

    /* renamed from: a */
    public void mo87735a() {
        this.f60860c = true;
    }

    /* renamed from: c */
    public boolean mo87740c() {
        return this.f60860c;
    }

    /* renamed from: d */
    public boolean mo87741d() {
        return this.f60861d;
    }

    /* renamed from: e */
    public Map<String, ScanResult> mo87742e() {
        HashMap hashMap;
        synchronized (this.f60858a) {
            hashMap = new HashMap(this.f60858a);
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AbstractC67709b mo87746i() {
        return (AbstractC67709b) this.f60859b.findServiceByInterface(AbstractC67709b.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public AbstractC67709b.AbstractC67710a mo87747j() {
        return (AbstractC67709b.AbstractC67710a) mo87746i().mo235130i();
    }

    /* renamed from: b */
    public void mo87739b() {
        this.f60860c = false;
        mo87744g();
        mo87745h();
        this.f60858a.clear();
        C24777a.m89866a(this.f60859b).mo87824a();
    }

    /* renamed from: f */
    public void mo87743f() {
        if (this.f60863f == null) {
            this.f60863f = new C24740b();
        }
        if (!this.f60864g) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            AppBrandLogger.m52830i("BluetoothTAG", "register state_changed receiver");
            m89796a(AppbrandContext.getInst().getApplicationContext(), this.f60863f, intentFilter);
            this.f60864g = true;
        }
    }

    /* renamed from: g */
    public void mo87744g() {
        if (this.f60863f != null && this.f60864g) {
            AppBrandLogger.m52830i("BluetoothTAG", "unregister state receiver");
            AppbrandContext.getInst().getApplicationContext().unregisterReceiver(this.f60863f);
            this.f60863f = null;
            this.f60864g = false;
        }
    }

    /* renamed from: h */
    public boolean mo87745h() {
        if (this.f60862e != null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                AppBrandLogger.m52829e("BluetoothTAG", "stopScan, adapter is null");
                return false;
            }
            BluetoothLeScanner bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner();
            if (bluetoothLeScanner == null) {
                AppBrandLogger.m52829e("BluetoothTAG", "stopScan, leScanner is null");
                return false;
            }
            AppBrandLogger.m52830i("BluetoothTAG", "stopBluetoothScan");
            bluetoothLeScanner.stopScan(this.f60862e);
            this.f60862e = null;
            this.f60861d = false;
            mo87736a(defaultAdapter);
        } else {
            AppBrandLogger.m52831w("BluetoothTAG", "stopScan, mScanCallback is null");
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.a$a */
    public class C24739a {

        /* renamed from: b */
        private boolean f60869b;

        /* renamed from: c */
        private boolean f60870c;

        /* renamed from: d */
        private boolean f60871d;

        private C24739a() {
        }

        /* renamed from: b */
        private boolean m89812b(BluetoothAdapter bluetoothAdapter) {
            if (this.f60869b && this.f60870c == bluetoothAdapter.isEnabled() && this.f60871d == C24737a.this.mo87741d()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public void mo87751a(BluetoothAdapter bluetoothAdapter) {
            if (m89812b(bluetoothAdapter)) {
                this.f60869b = true;
                this.f60870c = bluetoothAdapter.isEnabled();
                this.f60871d = C24737a.this.mo87741d();
                C24737a.this.mo87737a("bluetoothAdapterStateChange", C24758b.m89826a(bluetoothAdapter, C24737a.this.f60859b).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.a$b */
    public class C24740b extends BroadcastReceiver {
        C24740b() {
        }

        public void onReceive(Context context, Intent intent) {
            AppBrandLogger.m52830i("BluetoothTAG", "bluetooth state change, action: ", intent.getAction(), ", state: ", Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1)), ", previous state: ", Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1)));
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                AppBrandLogger.m52829e("BluetoothTAG", "BluetoothStateReceiver, adapter is null");
                return;
            }
            C24737a.this.mo87736a(defaultAdapter);
        }
    }

    /* renamed from: a */
    private ScanCallback m89795a(final boolean z) {
        return new ScanCallback() {
            /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24737a.C247381 */

            /* renamed from: a */
            private boolean m89811a(String str) {
                if (z || !C24737a.this.f60858a.containsKey(str)) {
                    return true;
                }
                return false;
            }

            public void onScanFailed(int i) {
                AppBrandLogger.m52829e("BluetoothTAG", "onScanFailed, errorCode: ", Integer.valueOf(i));
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onBatchScanResults(List<ScanResult> list) {
                if (list == null) {
                    AppBrandLogger.m52829e("BluetoothTAG", "onBatchScanResults, results null");
                    return;
                }
                AppBrandLogger.m52830i("BluetoothTAG", "onBatchScanResults size:" + list.size());
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                for (ScanResult scanResult : list) {
                    BluetoothDevice device = scanResult.getDevice();
                    if (device != null) {
                        String address = device.getAddress();
                        if (m89811a(address)) {
                            jSONArray.put(C24758b.m89827a(scanResult));
                        }
                        hashMap.put(address, scanResult);
                    } else {
                        AppBrandLogger.m52829e("BluetoothTAG", "bluetoothDevice is null");
                    }
                }
                synchronized (C24737a.this.f60858a) {
                    C24737a.this.f60858a.putAll(hashMap);
                }
                hashMap.clear();
                if (jSONArray.length() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("devices", jSONArray);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    AppBrandLogger.m52830i("BluetoothTAG", "onBatchScanResults");
                    C24737a.this.mo87737a("bluetoothDeviceFound", jSONObject.toString());
                }
            }

            public void onScanResult(int i, ScanResult scanResult) {
                AppBrandLogger.m52830i("BluetoothTAG", "onScanResult callback");
                if (scanResult == null) {
                    AppBrandLogger.m52829e("BluetoothTAG", "onScanResult result null");
                    return;
                }
                BluetoothDevice device = scanResult.getDevice();
                if (device != null) {
                    String address = device.getAddress();
                    if (m89811a(address)) {
                        JSONArray put = new JSONArray().put(C24758b.m89827a(scanResult));
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("devices", put);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        AppBrandLogger.m52830i("BluetoothTAG", "onScanResult");
                        C24737a.this.mo87737a("bluetoothDeviceFound", jSONObject.toString());
                    }
                    synchronized (C24737a.this.f60858a) {
                        C24737a.this.f60858a.put(address, scanResult);
                    }
                    return;
                }
                AppBrandLogger.m52829e("BluetoothTAG", "bluetoothDevice is null");
            }
        };
    }

    /* renamed from: a */
    public static C24737a m89797a(IAppContext iAppContext) {
        return C12988a.m53439a(iAppContext).mo48909e();
    }

    public C24737a(IAppContext iAppContext) {
        this.f60859b = iAppContext;
    }

    /* renamed from: a */
    public void mo87736a(BluetoothAdapter bluetoothAdapter) {
        AppBrandLogger.m52830i("BluetoothTAG", "notifyBluetoothStateChange...");
        this.f60865h.mo87751a(bluetoothAdapter);
    }

    /* renamed from: a */
    public boolean mo87737a(String str, String str2) {
        if (C67432a.m262319a(this.f60859b).getJsBridge() != null) {
            C67432a.m262319a(this.f60859b).getJsBridge().sendMsgToJsCore(str, str2);
            return true;
        }
        try {
            mo87747j().mo235028a(C67706e.C67708a.m263377a(str, new JSONObject(str2)).mo235009a());
            return true;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("BluetoothTAG", "JSONException", e);
            AppBrandLogger.m52831w("BluetoothTAG", "sendMsg2JsCore, JsBridge is null");
            return false;
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m89796a(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return application.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public boolean mo87738a(JSONArray jSONArray, boolean z, int i) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            AppBrandLogger.m52829e("BluetoothTAG", "startScan, adapter is null");
            return false;
        }
        BluetoothLeScanner bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner();
        if (bluetoothLeScanner == null) {
            AppBrandLogger.m52829e("BluetoothTAG", "startScan, leScanner is null");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    arrayList.add(new ScanFilter.Builder().setServiceUuid(ParcelUuid.fromString(jSONArray.getString(i2))).build());
                } catch (JSONException unused) {
                    AppBrandLogger.m52830i("BluetoothTAG", "get uuid from array error" + jSONArray);
                }
            }
        }
        ScanSettings build = new ScanSettings.Builder().setReportDelay((long) i).build();
        ScanCallback scanCallback = this.f60862e;
        if (scanCallback != null) {
            bluetoothLeScanner.stopScan(scanCallback);
        }
        this.f60862e = m89795a(z);
        AppBrandLogger.m52830i("BluetoothTAG", "startBluetoothScan, allowDuplicatesKey: ", Boolean.valueOf(z), ", interval: ", Integer.valueOf(i), ", services: ", jSONArray);
        bluetoothLeScanner.startScan(arrayList, build, this.f60862e);
        this.f60861d = true;
        mo87736a(defaultAdapter);
        return true;
    }
}
