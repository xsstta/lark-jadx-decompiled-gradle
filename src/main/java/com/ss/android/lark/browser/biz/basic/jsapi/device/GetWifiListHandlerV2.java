package com.ss.android.lark.browser.biz.basic.jsapi.device;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.common.utility.Logger;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.p2069j.p2070a.C40638e;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.ss.android.lark.utils.C57878s;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.ele.lancet.base.annotations.Skip;

public class GetWifiListHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<GetWifiListHandlerV2> CREATOR = new Parcelable.Creator<GetWifiListHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.device.GetWifiListHandlerV2.C296692 */

        /* renamed from: a */
        public GetWifiListHandlerV2[] newArray(int i) {
            return new GetWifiListHandlerV2[i];
        }

        /* renamed from: a */
        public GetWifiListHandlerV2 createFromParcel(Parcel parcel) {
            return new GetWifiListHandlerV2(parcel);
        }
    };

    /* renamed from: a */
    public Application f74355a;

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.GetWifiListHandlerV2$a */
    public static class C29671a implements BaseJSModel {
        private int code;
        private List<C29672b> data;

        C29671a() {
        }

        public int getCode() {
            return this.code;
        }

        public List<C29672b> getData() {
            return this.data;
        }

        public void setCode(int i) {
            this.code = i;
        }

        public void setData(List<C29672b> list) {
            this.data = list;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.GetWifiListHandlerV2$b */
    public static class C29672b implements BaseJSModel {
        public String macIp;
        public String ssid;

        C29672b() {
        }

        public String getMacIp() {
            return this.macIp;
        }

        public String getSsid() {
            return this.ssid;
        }

        public void setMacIp(String str) {
            this.macIp = str;
        }

        public void setSsid(String str) {
            this.ssid = str;
        }
    }

    public GetWifiListHandlerV2() {
    }

    /* renamed from: b */
    public void mo106947b() {
        new OPMonitor("mp_old_js_wifi_list_sum", C40638e.f103070a).reportPlatform(2).flush();
    }

    protected GetWifiListHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
        this.f74355a = mo91997u().getApplication();
    }

    /* renamed from: a */
    public ArrayList<C29672b> mo106943a(ArrayList<ScanResult> arrayList) {
        ArrayList<C29672b> arrayList2 = new ArrayList<>();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < arrayList.size(); i++) {
            ScanResult scanResult = arrayList.get(i);
            if (!scanResult.SSID.isEmpty()) {
                String str = scanResult.SSID + " " + scanResult.capabilities;
                if (!hashMap.containsKey(str)) {
                    C29672b bVar = new C29672b();
                    bVar.ssid = scanResult.SSID;
                    bVar.macIp = scanResult.BSSID;
                    arrayList2.add(bVar);
                    hashMap.put(str, Integer.valueOf(arrayList2.size() - 1));
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    public void mo106945a(AbstractC25832c cVar) {
        C29671a aVar = new C29671a();
        aVar.setCode(0);
        aVar.setData(new ArrayList());
        cVar.mo91902a(C57878s.m224591a(aVar));
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public void mo106944a(final WifiManager wifiManager, final AbstractC25832c cVar) {
        m109792a(mo91997u(), new BroadcastReceiver() {
            /* class com.ss.android.lark.browser.biz.basic.jsapi.device.GetWifiListHandlerV2.C296703 */

            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("android.net.wifi.SCAN_RESULTS")) {
                    ArrayList<C29672b> a = GetWifiListHandlerV2.this.mo106943a((ArrayList) wifiManager.getScanResults());
                    if (cVar != null) {
                        C29671a aVar = new C29671a();
                        aVar.setCode(1);
                        aVar.setData(a);
                        cVar.mo91902a(C57878s.m224591a(aVar));
                    }
                }
                GetWifiListHandlerV2.this.mo91997u().unregisterReceiver(this);
            }
        }, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, final AbstractC25832c cVar) {
        if (C29638a.m109622a().isFeatureGatingEnable("gadget.web.browser.getwifilist.close")) {
            mo106945a(cVar);
            Logger.m15173i("GetWifiListHandlerV2", "get wifi list is close");
            return;
        }
        if (mo91997u() == null || mo91998v() == null) {
            mo106945a(cVar);
        }
        boolean g = NetworkUtils.m153074g(mo91997u());
        Activity u = mo91997u();
        if (!g || u == null) {
            mo106945a(cVar);
        } else {
            new C51331a(u).mo176924c("android.permission.ACCESS_FINE_LOCATION").subscribe(new Consumer<Boolean>() {
                /* class com.ss.android.lark.browser.biz.basic.jsapi.device.GetWifiListHandlerV2.C296681 */

                /* renamed from: a */
                public void accept(Boolean bool) throws Exception {
                    if (bool.booleanValue()) {
                        WifiManager wifiManager = (WifiManager) GetWifiListHandlerV2.this.f74355a.getSystemService("wifi");
                        GetWifiListHandlerV2.this.mo106944a(wifiManager, cVar);
                        wifiManager.startScan();
                        return;
                    }
                    GetWifiListHandlerV2.this.mo106945a(cVar);
                }
            });
        }
        mo106947b();
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m109792a(Activity activity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return activity.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
