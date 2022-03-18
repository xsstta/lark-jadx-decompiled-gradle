package com.ss.android.lark.browser.biz.messenger.jsapi.translate;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi;
import com.ss.android.lark.browser.impl.translate.jsb.params.EmptyJSParams;
import com.ss.android.lark.log.Log;

/* access modifiers changed from: package-private */
public class GetDetectSettingHandlerV2 extends BaseJsApiHandlerV2<EmptyJSParams> {
    public static final Parcelable.Creator<GetDetectSettingHandlerV2> CREATOR = new Parcelable.Creator<GetDetectSettingHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.translate.GetDetectSettingHandlerV2.C298631 */

        /* renamed from: a */
        public GetDetectSettingHandlerV2[] newArray(int i) {
            return new GetDetectSettingHandlerV2[i];
        }

        /* renamed from: a */
        public GetDetectSettingHandlerV2 createFromParcel(Parcel parcel) {
            return new GetDetectSettingHandlerV2(parcel);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    public GetDetectSettingHandlerV2() {
    }

    public GetDetectSettingHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(EmptyJSParams emptyJSParams, AbstractC25832c cVar) {
        Log.m165389i("GetDetectSettingHandlerV2", "onRequest");
        TranslateJSApi.IHandlerApi b = mo107524b();
        if (b != null) {
            b.mo107879a(new TranslateJSApi.JSApiV2Callback(cVar));
        }
    }
}
