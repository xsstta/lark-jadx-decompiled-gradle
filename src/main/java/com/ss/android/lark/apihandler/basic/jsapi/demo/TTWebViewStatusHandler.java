package com.ss.android.lark.apihandler.basic.jsapi.demo;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.lynx.webview.C19924b;
import com.bytedance.lynx.webview.TTWebSdk;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class TTWebViewStatusHandler extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<TTWebViewStatusHandler> CREATOR = new Parcelable.Creator<TTWebViewStatusHandler>() {
        /* class com.ss.android.lark.apihandler.basic.jsapi.demo.TTWebViewStatusHandler.C287221 */

        /* renamed from: a */
        public TTWebViewStatusHandler[] newArray(int i) {
            return new TTWebViewStatusHandler[i];
        }

        /* renamed from: a */
        public TTWebViewStatusHandler createFromParcel(Parcel parcel) {
            return new TTWebViewStatusHandler(parcel);
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

    public TTWebViewStatusHandler() {
    }

    protected TTWebViewStatusHandler(Parcel parcel) {
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
        Log.m165389i("TTWebViewStatusHandler", "invoke api");
        if (TTWebSdk.isTTWebView()) {
            str = C19924b.m72692a();
        } else {
            str = "system webView";
        }
        if (cVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            sb.append("\"loadSoVersion\":");
            sb.append("\"" + str + "\"");
            sb.append("}");
            cVar.mo91902a(sb.toString());
        }
    }
}
