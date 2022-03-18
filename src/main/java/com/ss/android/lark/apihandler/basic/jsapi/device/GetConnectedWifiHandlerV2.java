package com.ss.android.lark.apihandler.basic.jsapi.device;

import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.permission.rxPermission.C51331a;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.List;

public class GetConnectedWifiHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<GetConnectedWifiHandlerV2> CREATOR = new Parcelable.Creator<GetConnectedWifiHandlerV2>() {
        /* class com.ss.android.lark.apihandler.basic.jsapi.device.GetConnectedWifiHandlerV2.C287301 */

        /* renamed from: a */
        public GetConnectedWifiHandlerV2[] newArray(int i) {
            return new GetConnectedWifiHandlerV2[i];
        }

        /* renamed from: a */
        public GetConnectedWifiHandlerV2 createFromParcel(Parcel parcel) {
            return new GetConnectedWifiHandlerV2(parcel);
        }
    };

    /* renamed from: a */
    private String[] f72286a = {"android.permission.ACCESS_FINE_LOCATION"};

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    public GetConnectedWifiHandlerV2() {
    }

    protected GetConnectedWifiHandlerV2(Parcel parcel) {
        super(parcel);
        this.f72286a = parcel.createStringArray();
    }

    /* renamed from: a */
    private String m105332a(WifiInfo wifiInfo) {
        String ssid = wifiInfo.getSSID();
        while (ssid.contains("\"")) {
            ssid = ssid.replace("\"", "");
        }
        return ssid;
    }

    /* renamed from: a */
    private int m105331a(WifiConfiguration wifiConfiguration) {
        if (wifiConfiguration.allowedKeyManagement.get(1)) {
            return 2;
        }
        if (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) {
            return 3;
        }
        if (wifiConfiguration.wepKeys[0] != null) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    private void m105333a(AbstractC25832c cVar) {
        WifiManager wifiManager = (WifiManager) mo91997u().getApplicationContext().getSystemService("wifi");
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("SSID", (Object) m105332a(connectionInfo));
        jSONObject.put("BSSID", (Object) connectionInfo.getBSSID());
        jSONObject.put("secure", (Object) Boolean.valueOf(m105336a(wifiManager, connectionInfo)));
        jSONObject.put("signalStrength", (Object) Integer.valueOf(connectionInfo.getRssi()));
        cVar.mo91902a(jSONObject.toJSONString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m105334a(AbstractC25832c cVar, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            m105333a(cVar);
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeStringArray(this.f72286a);
    }

    /* renamed from: a */
    private boolean m105336a(WifiManager wifiManager, WifiInfo wifiInfo) {
        int i;
        try {
            List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
            if (configuredNetworks != null) {
                Iterator<WifiConfiguration> it = configuredNetworks.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    WifiConfiguration next = it.next();
                    String str = next.SSID;
                    String ssid = wifiInfo.getSSID();
                    if (!TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(ssid)) {
                            if (ssid.replace("\"", "").equals(str.replace("\"", "")) && wifiInfo.getNetworkId() == next.networkId) {
                                i = m105331a(next);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            i = 0;
            if (i == 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            Logger.m15173i("GetConnectedWifiHandler", "getSecurity:" + e);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        if (!NetworkUtils.getNetworkType(mo91997u()).isWifi()) {
            m105335a(cVar, "no wifi connected", 413002);
        } else {
            new C51331a(mo91997u()).mo176924c(this.f72286a).subscribe(new Consumer(cVar) {
                /* class com.ss.android.lark.apihandler.basic.jsapi.device.$$Lambda$GetConnectedWifiHandlerV2$8q6e6OXwsbTijinc7QSoLqN4p_Q */
                public final /* synthetic */ AbstractC25832c f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    GetConnectedWifiHandlerV2.this.m105334a((GetConnectedWifiHandlerV2) this.f$1, (AbstractC25832c) ((Boolean) obj));
                }
            });
        }
    }

    /* renamed from: a */
    private void m105335a(AbstractC25832c cVar, String str, int i) {
        if (cVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMessage", (Object) str);
            jSONObject.put("errorCode", (Object) Integer.valueOf(i));
            cVar.mo91904b(jSONObject.toJSONString());
        }
    }
}
