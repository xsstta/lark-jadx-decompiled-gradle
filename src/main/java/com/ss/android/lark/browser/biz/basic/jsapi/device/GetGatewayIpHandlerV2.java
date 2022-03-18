package com.ss.android.lark.browser.biz.basic.jsapi.device;

import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.common.utility.NetworkUtils;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class GetGatewayIpHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<GetGatewayIpHandlerV2> CREATOR = new Parcelable.Creator<GetGatewayIpHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.device.GetGatewayIpHandlerV2.C296671 */

        /* renamed from: a */
        public GetGatewayIpHandlerV2[] newArray(int i) {
            return new GetGatewayIpHandlerV2[i];
        }

        /* renamed from: a */
        public GetGatewayIpHandlerV2 createFromParcel(Parcel parcel) {
            return new GetGatewayIpHandlerV2(parcel);
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

    public GetGatewayIpHandlerV2() {
    }

    protected GetGatewayIpHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    private String m109784a(int i) {
        return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    private void m109785a(Context context, AbstractC25832c cVar) {
        DhcpInfo dhcpInfo = ((WifiManager) context.getSystemService("wifi")).getDhcpInfo();
        if (dhcpInfo == null) {
            m109786a(cVar, "no dhcp Info", 423003);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ip", (Object) m109784a(dhcpInfo.gateway));
        cVar.mo91902a(jSONObject.toJSONString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        if (mo91997u() == null) {
            m109786a(cVar, "context null", 423000);
        } else if (!NetworkUtils.getNetworkType(mo91997u()).isWifi()) {
            m109786a(cVar, "no wifi connected", 423002);
        } else {
            m109785a(mo91997u(), cVar);
        }
    }

    /* renamed from: a */
    private void m109786a(AbstractC25832c cVar, String str, int i) {
        if (cVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMessage", (Object) str);
            jSONObject.put("errorCode", (Object) Integer.valueOf(i));
            cVar.mo91904b(jSONObject.toJSONString());
        }
    }
}
