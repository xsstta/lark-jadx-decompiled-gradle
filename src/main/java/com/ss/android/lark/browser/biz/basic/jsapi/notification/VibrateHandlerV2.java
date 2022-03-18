package com.ss.android.lark.browser.biz.basic.jsapi.notification;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.browser.biz.basic.jsapi.notification.p1418a.C29737a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class VibrateHandlerV2 extends AbstractInjectJSApiHandler<C29736a> implements Parcelable {
    public static final Parcelable.Creator<VibrateHandlerV2> CREATOR = new Parcelable.Creator<VibrateHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.notification.VibrateHandlerV2.C297351 */

        /* renamed from: a */
        public VibrateHandlerV2[] newArray(int i) {
            return new VibrateHandlerV2[i];
        }

        /* renamed from: a */
        public VibrateHandlerV2 createFromParcel(Parcel parcel) {
            return new VibrateHandlerV2(parcel);
        }
    };

    /* renamed from: a */
    C29737a f74445a;

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
    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.notification.VibrateHandlerV2$a */
    public static class C29736a implements BaseJSModel {
        public long duration;

        C29736a() {
        }
    }

    public VibrateHandlerV2() {
    }

    protected VibrateHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(C29736a aVar, AbstractC25832c cVar) {
        boolean z;
        String str;
        if (this.f74445a == null) {
            this.f74445a = new C29737a(mo91997u());
        }
        try {
            z = this.f74445a.mo107111a(aVar.duration);
        } catch (Throwable th) {
            Log.m165386e("VibrateHandlerV2", th);
            z = false;
        }
        if (cVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            sb.append("\"code\":");
            if (z) {
                str = "0";
            } else {
                str = "1";
            }
            sb.append(str);
            sb.append("}");
            cVar.mo91902a(sb.toString());
        }
    }
}
