package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class OpenContactHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<OpenContactHandlerV2> CREATOR = new Parcelable.Creator<OpenContactHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.OpenContactHandlerV2.C298111 */

        /* renamed from: a */
        public OpenContactHandlerV2[] newArray(int i) {
            return new OpenContactHandlerV2[i];
        }

        /* renamed from: a */
        public OpenContactHandlerV2 createFromParcel(Parcel parcel) {
            return new OpenContactHandlerV2(parcel);
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

    public OpenContactHandlerV2() {
    }

    protected OpenContactHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        C29638a.m109622a().getMainDependency().mo107690b(mo91997u());
    }
}
