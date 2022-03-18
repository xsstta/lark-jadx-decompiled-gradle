package com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.larksuite.framework.utils.C26264b;

/* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.a.b */
public class C29686b extends AbstractC29684a {

    /* renamed from: c */
    private C29688a f74378c;

    /* renamed from: h */
    private void m109855h() {
        if (this.f74378c != null) {
            C26264b.m95069a(this.f74373a, this.f74378c);
            this.f74378c = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29684a
    /* renamed from: d */
    public void mo107004d() {
        m109855h();
        C26264b.m95077c().cancelDiscovery();
    }

    /* renamed from: g */
    private void m109854g() {
        if (this.f74378c == null) {
            this.f74378c = new C29688a();
            C26264b.m95070a(this.f74373a, this.f74378c, new IntentFilter("android.bluetooth.device.action.FOUND"));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29684a
    /* renamed from: c */
    public void mo107003c() {
        BluetoothAdapter c = C26264b.m95077c();
        if (c.isDiscovering()) {
            c.cancelDiscovery();
        }
        m109854g();
        c.startDiscovery();
    }

    public C29686b(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.a.b$a */
    public class C29688a extends BroadcastReceiver {
        private C29688a() {
        }

        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            if (C29686b.this.f74374b && intent.getAction().equals("android.bluetooth.device.action.FOUND") && (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) != null) {
                C29686b.this.mo106999a(bluetoothDevice);
            }
        }
    }
}
