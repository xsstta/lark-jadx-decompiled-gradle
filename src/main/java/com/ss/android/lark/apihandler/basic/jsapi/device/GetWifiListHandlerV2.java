package com.ss.android.lark.apihandler.basic.jsapi.device;

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
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.ss.android.lark.utils.C57878s;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.ele.lancet.base.annotations.Skip;

public class GetWifiListHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<GetWifiListHandlerV2> CREATOR = new Parcelable.Creator<GetWifiListHandlerV2>() {
        /* class com.ss.android.lark.apihandler.basic.jsapi.device.GetWifiListHandlerV2.C287362 */

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
    public Application f72287a;

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.apihandler.basic.jsapi.device.GetWifiListHandlerV2$a */
    public static class C28738a implements BaseJSModel {
        private int code;
        private List<C28739b> data;

        C28738a() {
        }

        public int getCode() {
            return this.code;
        }

        public List<C28739b> getData() {
            return this.data;
        }

        public void setCode(int i) {
            this.code = i;
        }

        public void setData(List<C28739b> list) {
            this.data = list;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.apihandler.basic.jsapi.device.GetWifiListHandlerV2$b */
    public static class C28739b implements BaseJSModel {
        public String macIp;
        public String ssid;

        C28739b() {
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

    protected GetWifiListHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
        this.f72287a = mo91997u().getApplication();
    }

    /* renamed from: a */
    public ArrayList<C28739b> mo102191a(ArrayList<ScanResult> arrayList) {
        ArrayList<C28739b> arrayList2 = new ArrayList<>();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < arrayList.size(); i++) {
            ScanResult scanResult = arrayList.get(i);
            if (!scanResult.SSID.isEmpty()) {
                String str = scanResult.SSID + " " + scanResult.capabilities;
                if (!hashMap.containsKey(str)) {
                    C28739b bVar = new C28739b();
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
    public void mo102193a(AbstractC25832c cVar) {
        C28738a aVar = new C28738a();
        aVar.setCode(0);
        aVar.setData(new ArrayList());
        cVar.mo91902a(C57878s.m224591a(aVar));
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public void mo102192a(final WifiManager wifiManager, final AbstractC25832c cVar) {
        m105356a(mo91997u(), new BroadcastReceiver() {
            /* class com.ss.android.lark.apihandler.basic.jsapi.device.GetWifiListHandlerV2.C287373 */

            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("android.net.wifi.SCAN_RESULTS")) {
                    ArrayList<C28739b> a = GetWifiListHandlerV2.this.mo102191a((ArrayList) wifiManager.getScanResults());
                    if (cVar != null) {
                        C28738a aVar = new C28738a();
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
        if (mo91997u() == null || mo91998v() == null) {
            mo102193a(cVar);
        }
        boolean g = NetworkUtils.m153074g(mo91997u());
        Activity u = mo91997u();
        if (!g || u == null) {
            mo102193a(cVar);
        } else {
            new C51331a(u).mo176924c("android.permission.ACCESS_FINE_LOCATION").subscribe(new Consumer<Boolean>() {
                /* class com.ss.android.lark.apihandler.basic.jsapi.device.GetWifiListHandlerV2.C287351 */

                /* renamed from: a */
                public void accept(Boolean bool) throws Exception {
                    if (bool.booleanValue()) {
                        WifiManager wifiManager = (WifiManager) GetWifiListHandlerV2.this.f72287a.getSystemService("wifi");
                        GetWifiListHandlerV2.this.mo102192a(wifiManager, cVar);
                        wifiManager.startScan();
                        return;
                    }
                    GetWifiListHandlerV2.this.mo102193a(cVar);
                }
            });
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m105356a(Activity activity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
