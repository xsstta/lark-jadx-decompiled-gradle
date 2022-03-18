package com.ss.android.lark.browser.biz.messenger.jsapi.translate;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi;
import com.ss.android.lark.browser.impl.translate.jsb.params.UpdateBarStatusJSPrams;
import com.ss.android.lark.browser.impl.translate.jsb.result.ErrorJSResult;

/* access modifiers changed from: package-private */
public class UpdateBarStatusHandlerV2 extends BaseJsApiHandlerV2<UpdateBarStatusJSPrams> {
    public static final Parcelable.Creator<UpdateBarStatusHandlerV2> CREATOR = new Parcelable.Creator<UpdateBarStatusHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.translate.UpdateBarStatusHandlerV2.C298661 */

        /* renamed from: a */
        public UpdateBarStatusHandlerV2[] newArray(int i) {
            return new UpdateBarStatusHandlerV2[i];
        }

        /* renamed from: a */
        public UpdateBarStatusHandlerV2 createFromParcel(Parcel parcel) {
            return new UpdateBarStatusHandlerV2(parcel);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    public UpdateBarStatusHandlerV2() {
    }

    public UpdateBarStatusHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(UpdateBarStatusJSPrams updateBarStatusJSPrams, AbstractC25832c cVar) {
        TranslateJSApi.JSApiV2Callback fVar = new TranslateJSApi.JSApiV2Callback(cVar);
        if (updateBarStatusJSPrams == null) {
            fVar.mo107886a(new ErrorJSResult("data is null"));
            return;
        }
        TranslateJSApi.IHandlerApi b = mo107524b();
        if (b != null) {
            b.mo107884a(updateBarStatusJSPrams, fVar);
        }
    }
}
