package com.ss.android.lark.browser.biz.messenger.jsapi.translate;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi;
import com.ss.android.lark.browser.impl.translate.jsb.params.DetectSourceLanguageJSParams;
import com.ss.android.lark.browser.impl.translate.jsb.result.ErrorJSResult;

/* access modifiers changed from: package-private */
public class DetectSourceLanguageHandlerV2 extends BaseJsApiHandlerV2<DetectSourceLanguageJSParams> {
    public static final Parcelable.Creator<DetectSourceLanguageHandlerV2> CREATOR = new Parcelable.Creator<DetectSourceLanguageHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.translate.DetectSourceLanguageHandlerV2.C298621 */

        /* renamed from: a */
        public DetectSourceLanguageHandlerV2[] newArray(int i) {
            return new DetectSourceLanguageHandlerV2[i];
        }

        /* renamed from: a */
        public DetectSourceLanguageHandlerV2 createFromParcel(Parcel parcel) {
            return new DetectSourceLanguageHandlerV2(parcel);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    public DetectSourceLanguageHandlerV2() {
    }

    public DetectSourceLanguageHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(DetectSourceLanguageJSParams detectSourceLanguageJSParams, AbstractC25832c cVar) {
        TranslateJSApi.JSApiV2Callback fVar = new TranslateJSApi.JSApiV2Callback(cVar);
        if (detectSourceLanguageJSParams == null) {
            fVar.mo107886a(new ErrorJSResult("data is null"));
            return;
        }
        TranslateJSApi.IHandlerApi b = mo107524b();
        if (b != null) {
            b.mo107881a(detectSourceLanguageJSParams, fVar);
        }
    }
}
