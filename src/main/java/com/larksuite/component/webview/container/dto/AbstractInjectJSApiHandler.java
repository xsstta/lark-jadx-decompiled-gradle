package com.larksuite.component.webview.container.dto;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a;
import java.io.Serializable;

public abstract class AbstractInjectJSApiHandler<Param extends Serializable> extends AbstractC25869a<Param> implements Parcelable {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public abstract void mo91860a(Bundle bundle);

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public abstract void mo91861a(Param param, AbstractC25832c cVar);

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public boolean mo91862a() {
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public AbstractInjectJSApiHandler() {
    }

    protected AbstractInjectJSApiHandler(Parcel parcel) {
    }
}
