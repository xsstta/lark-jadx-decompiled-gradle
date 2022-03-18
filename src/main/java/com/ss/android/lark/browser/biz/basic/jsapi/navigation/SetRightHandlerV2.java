package com.ss.android.lark.browser.biz.basic.jsapi.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.NavigationRight;

public class SetRightHandlerV2 extends AbstractInjectJSApiHandler<NavigationRight> implements Parcelable {
    public static final Parcelable.Creator<SetRightHandlerV2> CREATOR = new Parcelable.Creator<SetRightHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.navigation.SetRightHandlerV2.C297141 */

        /* renamed from: a */
        public SetRightHandlerV2[] newArray(int i) {
            return new SetRightHandlerV2[i];
        }

        /* renamed from: a */
        public SetRightHandlerV2 createFromParcel(Parcel parcel) {
            return new SetRightHandlerV2(parcel);
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

    public SetRightHandlerV2() {
    }

    protected SetRightHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(NavigationRight navigationRight, AbstractC25832c cVar) {
        Log.m165389i("SetRightHandlerV2", "invoke api" + navigationRight);
        mo91999w().mo67308b().mo67333e(navigationRight.isShow());
        cVar.mo91902a("{}");
    }
}
