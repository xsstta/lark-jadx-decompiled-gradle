package com.ss.android.lark.browser.biz.messenger.jsapi.translate;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi;
import com.ss.android.lark.browser.impl.translate.jsb.params.GetTranslateSettingJSParams;
import com.ss.android.lark.browser.impl.translate.jsb.result.ErrorJSResult;

/* access modifiers changed from: package-private */
public class GetTranslateSettingHandlerV2 extends BaseJsApiHandlerV2<GetTranslateSettingJSParams> {
    public static final Parcelable.Creator<GetTranslateSettingHandlerV2> CREATOR = new Parcelable.Creator<GetTranslateSettingHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.translate.GetTranslateSettingHandlerV2.C298641 */

        /* renamed from: a */
        public GetTranslateSettingHandlerV2[] newArray(int i) {
            return new GetTranslateSettingHandlerV2[i];
        }

        /* renamed from: a */
        public GetTranslateSettingHandlerV2 createFromParcel(Parcel parcel) {
            return new GetTranslateSettingHandlerV2(parcel);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    public GetTranslateSettingHandlerV2() {
    }

    public GetTranslateSettingHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(GetTranslateSettingJSParams getTranslateSettingJSParams, AbstractC25832c cVar) {
        TranslateJSApi.JSApiV2Callback fVar = new TranslateJSApi.JSApiV2Callback(cVar);
        if (getTranslateSettingJSParams == null) {
            fVar.mo107886a(new ErrorJSResult("data is null"));
            return;
        }
        TranslateJSApi.IHandlerApi b = mo107524b();
        if (b != null) {
            b.mo107882a(getTranslateSettingJSParams, fVar);
        }
    }
}
