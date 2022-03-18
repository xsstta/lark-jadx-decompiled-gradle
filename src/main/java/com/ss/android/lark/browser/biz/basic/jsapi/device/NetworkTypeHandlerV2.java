package com.ss.android.lark.browser.biz.basic.jsapi.device;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class NetworkTypeHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<NetworkTypeHandlerV2> CREATOR = new Parcelable.Creator<NetworkTypeHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.device.NetworkTypeHandlerV2.C296731 */

        /* renamed from: a */
        public NetworkTypeHandlerV2[] newArray(int i) {
            return new NetworkTypeHandlerV2[i];
        }

        /* renamed from: a */
        public NetworkTypeHandlerV2 createFromParcel(Parcel parcel) {
            return new NetworkTypeHandlerV2(parcel);
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

    public NetworkTypeHandlerV2() {
    }

    protected NetworkTypeHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r0.equals("mobile") != false) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo91861a(com.ss.android.lark.openapi.jsapi.entity.BaseJSModel r4, com.larksuite.component.webview.container.dto.AbstractC25832c r5) {
        /*
            r3 = this;
            android.app.Activity r4 = r3.mo91997u()
            com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r4 = com.ss.android.lark.http.netstate.NetworkUtils.m153071d(r4)
            java.lang.String r0 = com.ss.android.lark.http.netstate.NetworkUtils.m153068a(r4)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "unknown"
            if (r1 == 0) goto L_0x001b
            com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r0 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.NONE
            if (r4 != r0) goto L_0x0023
            java.lang.String r0 = "none"
            goto L_0x0024
        L_0x001b:
            java.lang.String r4 = "mobile"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0024
        L_0x0023:
            r0 = r2
        L_0x0024:
            if (r5 == 0) goto L_0x005c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "{"
            r4.append(r1)
            java.lang.String r1 = "\"result\":"
            r4.append(r1)
            java.lang.String r1 = "\""
            r4.append(r1)
            r4.append(r0)
            java.lang.String r2 = "\","
            r4.append(r2)
            java.lang.String r2 = "\"networkType\":"
            r4.append(r2)
            r4.append(r1)
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "}"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r5.mo91902a(r4)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.browser.biz.basic.jsapi.device.NetworkTypeHandlerV2.mo91861a(com.ss.android.lark.openapi.jsapi.entity.BaseJSModel, com.larksuite.component.webview.container.dto.c):void");
    }
}
