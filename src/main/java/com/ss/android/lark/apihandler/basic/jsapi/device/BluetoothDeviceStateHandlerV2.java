package com.ss.android.lark.apihandler.basic.jsapi.device;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.utils.C26264b;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.permission.C51327f;

public class BluetoothDeviceStateHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<BluetoothDeviceStateHandlerV2> CREATOR = new Parcelable.Creator<BluetoothDeviceStateHandlerV2>() {
        /* class com.ss.android.lark.apihandler.basic.jsapi.device.BluetoothDeviceStateHandlerV2.C287241 */

        /* renamed from: a */
        public BluetoothDeviceStateHandlerV2[] newArray(int i) {
            return new BluetoothDeviceStateHandlerV2[i];
        }

        /* renamed from: a */
        public BluetoothDeviceStateHandlerV2 createFromParcel(Parcel parcel) {
            return new BluetoothDeviceStateHandlerV2(parcel);
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

    public BluetoothDeviceStateHandlerV2() {
    }

    protected BluetoothDeviceStateHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        int i;
        Activity u = mo91997u();
        BluetoothAdapter c = C26264b.m95077c();
        if (c == null) {
            i = 3;
        } else if (!C51327f.m199081a(u, "android.permission.BLUETOOTH")) {
            i = -1;
        } else if (c.isEnabled()) {
            i = 1;
        } else {
            i = 2;
        }
        if (cVar != null) {
            cVar.mo91902a("{" + "\"state\":" + String.valueOf(i) + "}");
        }
    }
}
