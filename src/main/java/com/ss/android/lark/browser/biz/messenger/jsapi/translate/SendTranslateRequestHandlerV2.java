package com.ss.android.lark.browser.biz.messenger.jsapi.translate;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi;
import com.ss.android.lark.browser.impl.translate.jsb.params.SendTranslateRequestJSParams;
import com.ss.android.lark.browser.impl.translate.jsb.result.ErrorJSResult;

/* access modifiers changed from: package-private */
public class SendTranslateRequestHandlerV2 extends BaseJsApiHandlerV2<SendTranslateRequestJSParams> {
    public static final Parcelable.Creator<SendTranslateRequestHandlerV2> CREATOR = new Parcelable.Creator<SendTranslateRequestHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.translate.SendTranslateRequestHandlerV2.C298651 */

        /* renamed from: a */
        public SendTranslateRequestHandlerV2[] newArray(int i) {
            return new SendTranslateRequestHandlerV2[i];
        }

        /* renamed from: a */
        public SendTranslateRequestHandlerV2 createFromParcel(Parcel parcel) {
            return new SendTranslateRequestHandlerV2(parcel);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    public SendTranslateRequestHandlerV2() {
    }

    public SendTranslateRequestHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(SendTranslateRequestJSParams sendTranslateRequestJSParams, AbstractC25832c cVar) {
        TranslateJSApi.JSApiV2Callback fVar = new TranslateJSApi.JSApiV2Callback(cVar);
        if (sendTranslateRequestJSParams == null) {
            fVar.mo107886a(new ErrorJSResult("data is null"));
            return;
        }
        TranslateJSApi.IHandlerApi b = mo107524b();
        if (b != null) {
            b.mo107883a(sendTranslateRequestJSParams, fVar);
        }
    }
}
