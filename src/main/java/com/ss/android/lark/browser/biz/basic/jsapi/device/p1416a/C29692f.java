package com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.larksuite.framework.utils.C26264b;

/* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.a.f */
public class C29692f extends AbstractC29684a {

    /* renamed from: c */
    private final BluetoothAdapter.LeScanCallback f74386c = new BluetoothAdapter.LeScanCallback() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.C29692f.C296931 */

        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            C29692f.this.mo106999a(bluetoothDevice);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29684a
    /* renamed from: c */
    public void mo107003c() {
        C26264b.m95077c().startLeScan(this.f74386c);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29684a
    /* renamed from: d */
    public void mo107004d() {
        C26264b.m95077c().stopLeScan(this.f74386c);
    }

    public C29692f(Context context) {
        super(context);
    }
}
