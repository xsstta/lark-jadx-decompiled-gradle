package com.ss.android.lark.apihandler.basic.jsapi.device;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26264b;
import com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.C28756c;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.utils.rxjava.C57865c;

public class ConnectBluetoothDeviceHandlerV2 extends AbstractInjectJSApiHandler<C28729a> implements Parcelable {
    public static final Parcelable.Creator<ConnectBluetoothDeviceHandlerV2> CREATOR = new Parcelable.Creator<ConnectBluetoothDeviceHandlerV2>() {
        /* class com.ss.android.lark.apihandler.basic.jsapi.device.ConnectBluetoothDeviceHandlerV2.C287261 */

        /* renamed from: a */
        public ConnectBluetoothDeviceHandlerV2[] newArray(int i) {
            return new ConnectBluetoothDeviceHandlerV2[i];
        }

        /* renamed from: a */
        public ConnectBluetoothDeviceHandlerV2 createFromParcel(Parcel parcel) {
            return new ConnectBluetoothDeviceHandlerV2(parcel);
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
    /* renamed from: com.ss.android.lark.apihandler.basic.jsapi.device.ConnectBluetoothDeviceHandlerV2$a */
    public static class C28729a implements BaseJSModel {
        public String id;
        public String uuid;

        C28729a() {
        }
    }

    public ConnectBluetoothDeviceHandlerV2() {
    }

    protected ConnectBluetoothDeviceHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    private void m105323a(final AbstractC25832c cVar, final int i) {
        if (cVar != null) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.apihandler.basic.jsapi.device.ConnectBluetoothDeviceHandlerV2.RunnableC287283 */

                public void run() {
                    AbstractC25832c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo91902a("{" + "\"state\":" + String.valueOf(i) + "}");
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(C28729a aVar, AbstractC25832c cVar) {
        Activity u = mo91997u();
        if (!C51327f.m199081a(u, "android.permission.BLUETOOTH") || !C51327f.m199081a(u, "android.permission.BLUETOOTH_ADMIN")) {
            m105323a(cVar, -2);
        } else {
            m105324b(aVar.id, aVar.uuid, cVar);
        }
    }

    /* renamed from: b */
    private void m105324b(final String str, final String str2, final AbstractC25832c cVar) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.apihandler.basic.jsapi.device.ConnectBluetoothDeviceHandlerV2.RunnableC287272 */

            public void run() {
                ConnectBluetoothDeviceHandlerV2.this.mo102159a(str, str2, cVar);
            }
        });
    }

    /* renamed from: a */
    public void mo102159a(String str, String str2, AbstractC25832c cVar) {
        try {
            BluetoothDevice a = C26264b.m95068a(str);
            if (a == null) {
                m105323a(cVar, -1);
            } else {
                m105323a(cVar, new C28756c(a).mo102256a().mo102257a(str2));
            }
        } catch (Throwable unused) {
            m105323a(cVar, -1);
        }
    }
}
