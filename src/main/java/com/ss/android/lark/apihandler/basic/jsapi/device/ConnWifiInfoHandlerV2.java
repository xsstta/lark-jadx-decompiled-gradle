package com.ss.android.lark.apihandler.basic.jsapi.device;

import android.app.Activity;
import android.net.wifi.WifiInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class ConnWifiInfoHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<ConnWifiInfoHandlerV2> CREATOR = new Parcelable.Creator<ConnWifiInfoHandlerV2>() {
        /* class com.ss.android.lark.apihandler.basic.jsapi.device.ConnWifiInfoHandlerV2.C287251 */

        /* renamed from: a */
        public ConnWifiInfoHandlerV2[] newArray(int i) {
            return new ConnWifiInfoHandlerV2[i];
        }

        /* renamed from: a */
        public ConnWifiInfoHandlerV2 createFromParcel(Parcel parcel) {
            return new ConnWifiInfoHandlerV2(parcel);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    public ConnWifiInfoHandlerV2() {
    }

    protected ConnWifiInfoHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        String str;
        int i;
        WifiInfo f;
        Activity u = mo91997u();
        String str2 = "";
        if (!NetworkUtils.m153074g(u) || (f = NetworkUtils.m153073f(u)) == null) {
            i = 1;
            str = str2;
        } else {
            str2 = f.getSSID();
            str = f.getMacAddress();
            i = 0;
        }
        m105317a(cVar, i, str2, str);
    }

    /* renamed from: a */
    private void m105317a(AbstractC25832c cVar, int i, String str, String str2) {
        if (cVar != null) {
            cVar.mo91902a("{" + "\"code\":" + i + ",\"ssid\":" + "\"" + str + "\"" + ",\"macIp\":" + "\"" + str2 + "\"" + "}");
        }
    }
}
