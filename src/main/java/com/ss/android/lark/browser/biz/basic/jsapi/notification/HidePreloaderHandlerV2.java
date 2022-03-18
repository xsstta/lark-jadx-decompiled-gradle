package com.ss.android.lark.browser.biz.basic.jsapi.notification;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.ui.C57603e;

public class HidePreloaderHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<HidePreloaderHandlerV2> CREATOR = new Parcelable.Creator<HidePreloaderHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.notification.HidePreloaderHandlerV2.C297291 */

        /* renamed from: a */
        public HidePreloaderHandlerV2[] newArray(int i) {
            return new HidePreloaderHandlerV2[i];
        }

        /* renamed from: a */
        public HidePreloaderHandlerV2 createFromParcel(Parcel parcel) {
            return new HidePreloaderHandlerV2(parcel);
        }
    };

    /* renamed from: a */
    private C57603e f74437a;

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    public HidePreloaderHandlerV2() {
    }

    protected HidePreloaderHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
        if (mo91995c("PRELOADER_HANDLER_V2_COMMON_LOADING_MANAGER") == null) {
            C57603e eVar = new C57603e(mo91997u());
            this.f74437a = eVar;
            mo91992a("PRELOADER_HANDLER_V2_COMMON_LOADING_MANAGER", eVar);
            return;
        }
        this.f74437a = (C57603e) mo91995c("PRELOADER_HANDLER_V2_COMMON_LOADING_MANAGER");
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        C57603e eVar = this.f74437a;
        if (eVar != null) {
            eVar.mo195584b();
        }
    }
}
