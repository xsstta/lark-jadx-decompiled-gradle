package com.ss.android.lark.apihandler.basic.jsapi.device.p1352a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.larksuite.framework.utils.C26264b;

/* renamed from: com.ss.android.lark.apihandler.basic.jsapi.device.a.b */
public class C28753b extends AbstractC28751a {

    /* renamed from: c */
    private C28755a f72310c;

    /* renamed from: h */
    private void m105418h() {
        if (this.f72310c != null) {
            C26264b.m95069a(this.f72305a, this.f72310c);
            this.f72310c = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28751a
    /* renamed from: d */
    public void mo102251d() {
        m105418h();
        C26264b.m95077c().cancelDiscovery();
    }

    /* renamed from: g */
    private void m105417g() {
        if (this.f72310c == null) {
            this.f72310c = new C28755a();
            C26264b.m95070a(this.f72305a, this.f72310c, new IntentFilter("android.bluetooth.device.action.FOUND"));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28751a
    /* renamed from: c */
    public void mo102250c() {
        BluetoothAdapter c = C26264b.m95077c();
        if (c.isDiscovering()) {
            c.cancelDiscovery();
        }
        m105417g();
        c.startDiscovery();
    }

    public C28753b(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.apihandler.basic.jsapi.device.a.b$a */
    public class C28755a extends BroadcastReceiver {
        private C28755a() {
        }

        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            if (C28753b.this.f72306b && intent.getAction().equals("android.bluetooth.device.action.FOUND") && (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) != null) {
                C28753b.this.mo102246a(bluetoothDevice, context);
            }
        }
    }
}
