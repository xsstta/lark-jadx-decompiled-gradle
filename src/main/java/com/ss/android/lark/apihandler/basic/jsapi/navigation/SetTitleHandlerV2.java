package com.ss.android.lark.apihandler.basic.jsapi.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.NavigationTitle;

public class SetTitleHandlerV2 extends AbstractInjectJSApiHandler<NavigationTitle> implements Parcelable {
    public static final Parcelable.Creator<SetTitleHandlerV2> CREATOR = new Parcelable.Creator<SetTitleHandlerV2>() {
        /* class com.ss.android.lark.apihandler.basic.jsapi.navigation.SetTitleHandlerV2.C287821 */

        /* renamed from: a */
        public SetTitleHandlerV2[] newArray(int i) {
            return new SetTitleHandlerV2[i];
        }

        /* renamed from: a */
        public SetTitleHandlerV2 createFromParcel(Parcel parcel) {
            return new SetTitleHandlerV2(parcel);
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

    public SetTitleHandlerV2() {
    }

    protected SetTitleHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(NavigationTitle navigationTitle, AbstractC25832c cVar) {
        Log.m165389i("SetTitleHandlerV2", "invoke api");
        if (mo91999w().mo67308b() != null) {
            mo91999w().mo67308b().setTitle(navigationTitle.getTitle());
        } else {
            Log.m165389i("SetTitleHandlerV2", "titlebar is null");
        }
    }
}
