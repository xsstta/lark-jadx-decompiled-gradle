package com.ss.android.lark.apihandler.basic.jsapi.util;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class UnlockViewOrientationHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<UnlockViewOrientationHandlerV2> CREATOR = new Parcelable.Creator<UnlockViewOrientationHandlerV2>() {
        /* class com.ss.android.lark.apihandler.basic.jsapi.util.UnlockViewOrientationHandlerV2.C288231 */

        /* renamed from: a */
        public UnlockViewOrientationHandlerV2[] newArray(int i) {
            return new UnlockViewOrientationHandlerV2[i];
        }

        /* renamed from: a */
        public UnlockViewOrientationHandlerV2 createFromParcel(Parcel parcel) {
            return new UnlockViewOrientationHandlerV2(parcel);
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

    public UnlockViewOrientationHandlerV2() {
    }

    protected UnlockViewOrientationHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        if (mo91997u() == null || mo91997u().isDestroyed()) {
            cVar.mo91904b("{\"errorCode\":1003,\"errorMessage\":\"\"}");
            return;
        }
        mo91997u().setRequestedOrientation(-1);
        cVar.mo91902a("{}");
    }
}
