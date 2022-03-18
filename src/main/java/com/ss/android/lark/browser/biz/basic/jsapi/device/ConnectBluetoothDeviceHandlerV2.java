package com.ss.android.lark.browser.biz.basic.jsapi.device;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26264b;
import com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.C29689c;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.utils.rxjava.C57865c;

public class ConnectBluetoothDeviceHandlerV2 extends AbstractInjectJSApiHandler<C29662a> implements Parcelable {
    public static final Parcelable.Creator<ConnectBluetoothDeviceHandlerV2> CREATOR = new Parcelable.Creator<ConnectBluetoothDeviceHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.device.ConnectBluetoothDeviceHandlerV2.C296591 */

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
    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.ConnectBluetoothDeviceHandlerV2$a */
    public static class C29662a implements BaseJSModel {
        public String id;
        public String uuid;

        C29662a() {
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
    private void m109759a(final AbstractC25832c cVar, final int i) {
        if (cVar != null) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.browser.biz.basic.jsapi.device.ConnectBluetoothDeviceHandlerV2.RunnableC296613 */

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
    public void mo91861a(C29662a aVar, AbstractC25832c cVar) {
        Activity u = mo91997u();
        if (!C51327f.m199081a(u, "android.permission.BLUETOOTH") || !C51327f.m199081a(u, "android.permission.BLUETOOTH_ADMIN")) {
            m109759a(cVar, -2);
        } else {
            m109760b(aVar.id, aVar.uuid, cVar);
        }
    }

    /* renamed from: b */
    private void m109760b(final String str, final String str2, final AbstractC25832c cVar) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.browser.biz.basic.jsapi.device.ConnectBluetoothDeviceHandlerV2.RunnableC296602 */

            public void run() {
                ConnectBluetoothDeviceHandlerV2.this.mo106911a(str, str2, cVar);
            }
        });
    }

    /* renamed from: a */
    public void mo106911a(String str, String str2, AbstractC25832c cVar) {
        try {
            BluetoothDevice a = C26264b.m95068a(str);
            if (a == null) {
                m109759a(cVar, -1);
            } else {
                m109759a(cVar, new C29689c(a).mo107009a().mo107010a(str2));
            }
        } catch (Throwable unused) {
            m109759a(cVar, -1);
        }
    }
}
