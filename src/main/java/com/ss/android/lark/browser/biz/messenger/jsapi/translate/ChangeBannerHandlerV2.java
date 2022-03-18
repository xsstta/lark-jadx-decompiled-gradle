package com.ss.android.lark.browser.biz.messenger.jsapi.translate;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi;
import com.ss.android.lark.browser.impl.translate.jsb.params.ChangeBannerJSParams;
import com.ss.android.lark.browser.impl.translate.jsb.result.ErrorJSResult;

public class ChangeBannerHandlerV2 extends BaseJsApiHandlerV2<ChangeBannerJSParams> {
    public static final Parcelable.Creator<ChangeBannerHandlerV2> CREATOR = new Parcelable.Creator<ChangeBannerHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.translate.ChangeBannerHandlerV2.C298611 */

        /* renamed from: a */
        public ChangeBannerHandlerV2[] newArray(int i) {
            return new ChangeBannerHandlerV2[i];
        }

        /* renamed from: a */
        public ChangeBannerHandlerV2 createFromParcel(Parcel parcel) {
            return new ChangeBannerHandlerV2(parcel);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    public ChangeBannerHandlerV2() {
    }

    public ChangeBannerHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(ChangeBannerJSParams changeBannerJSParams, AbstractC25832c cVar) {
        TranslateJSApi.JSApiV2Callback fVar = new TranslateJSApi.JSApiV2Callback(cVar);
        if (changeBannerJSParams == null) {
            fVar.mo107886a(new ErrorJSResult("data is null"));
            return;
        }
        TranslateJSApi.IHandlerApi b = mo107524b();
        if (b != null) {
            b.mo107880a(changeBannerJSParams, fVar);
        }
    }
}
