package com.ss.android.lark.apihandler.basic.jsapi.device;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class OffUserCaptureScreenHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<OffUserCaptureScreenHandlerV2> CREATOR = new Parcelable.Creator<OffUserCaptureScreenHandlerV2>() {
        /* class com.ss.android.lark.apihandler.basic.jsapi.device.OffUserCaptureScreenHandlerV2.C287411 */

        /* renamed from: a */
        public OffUserCaptureScreenHandlerV2[] newArray(int i) {
            return new OffUserCaptureScreenHandlerV2[i];
        }

        /* renamed from: a */
        public OffUserCaptureScreenHandlerV2 createFromParcel(Parcel parcel) {
            return new OffUserCaptureScreenHandlerV2(parcel);
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

    public OffUserCaptureScreenHandlerV2() {
    }

    protected OffUserCaptureScreenHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        try {
            C28749a.m105400a(mo91997u(), cVar).mo102241b();
        } catch (Exception e) {
            Log.m165383e("OffUserCaptureScreenHandler", "unregister failed! " + e);
        }
    }
}
