package com.ss.android.lark.browser.biz.basic.jsapi.util;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class LockViewOrientationHandlerV2 extends AbstractInjectJSApiHandler<C29744a> implements Parcelable {
    public static final Parcelable.Creator<LockViewOrientationHandlerV2> CREATOR = new Parcelable.Creator<LockViewOrientationHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.util.LockViewOrientationHandlerV2.C297431 */

        /* renamed from: a */
        public LockViewOrientationHandlerV2[] newArray(int i) {
            return new LockViewOrientationHandlerV2[i];
        }

        /* renamed from: a */
        public LockViewOrientationHandlerV2 createFromParcel(Parcel parcel) {
            return new LockViewOrientationHandlerV2(parcel);
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.util.LockViewOrientationHandlerV2$a */
    public static class C29744a implements BaseJSModel {
        public boolean clockwise;
        public boolean toHorizontal;

        C29744a() {
        }
    }

    public LockViewOrientationHandlerV2() {
    }

    protected LockViewOrientationHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(C29744a aVar, AbstractC25832c cVar) {
        if (mo91997u() == null || mo91997u().isDestroyed()) {
            cVar.mo91904b("{\"errorCode\":1003,\"errorMessage\":\"\"}");
            return;
        }
        if (!aVar.toHorizontal) {
            mo91997u().setRequestedOrientation(1);
        } else if (aVar.clockwise) {
            mo91997u().setRequestedOrientation(0);
        } else {
            mo91997u().setRequestedOrientation(8);
        }
        cVar.mo91902a("{}");
    }
}
