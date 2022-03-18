package com.ss.android.lark.apihandler.basic.jsapi.device.p1352a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.larksuite.framework.utils.C26264b;

/* renamed from: com.ss.android.lark.apihandler.basic.jsapi.device.a.f */
public class C28759f extends AbstractC28751a {

    /* renamed from: c */
    private final BluetoothAdapter.LeScanCallback f72318c = new BluetoothAdapter.LeScanCallback() {
        /* class com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.C28759f.C287601 */

        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            C28759f fVar = C28759f.this;
            fVar.mo102246a(bluetoothDevice, fVar.f72305a);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28751a
    /* renamed from: c */
    public void mo102250c() {
        C26264b.m95077c().startLeScan(this.f72318c);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28751a
    /* renamed from: d */
    public void mo102251d() {
        C26264b.m95077c().stopLeScan(this.f72318c);
    }

    public C28759f(Context context) {
        super(context);
    }
}
