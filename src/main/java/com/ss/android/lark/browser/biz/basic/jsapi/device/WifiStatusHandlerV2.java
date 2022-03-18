package com.ss.android.lark.browser.biz.basic.jsapi.device;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class WifiStatusHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<WifiStatusHandlerV2> CREATOR = new Parcelable.Creator<WifiStatusHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.device.WifiStatusHandlerV2.C296811 */

        /* renamed from: a */
        public WifiStatusHandlerV2[] newArray(int i) {
            return new WifiStatusHandlerV2[i];
        }

        /* renamed from: a */
        public WifiStatusHandlerV2 createFromParcel(Parcel parcel) {
            return new WifiStatusHandlerV2(parcel);
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

    public WifiStatusHandlerV2() {
    }

    protected WifiStatusHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        int i;
        boolean g = NetworkUtils.m153074g(mo91997u());
        if (cVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            sb.append("\"status\":");
            if (g) {
                i = 1;
            } else {
                i = 0;
            }
            sb.append(String.valueOf(i));
            sb.append("}");
            cVar.mo91902a(sb.toString());
        }
    }
}
