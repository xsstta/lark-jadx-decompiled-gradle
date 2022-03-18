package com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a;

import android.bluetooth.BluetoothDevice;
import android.os.Build;
import com.larksuite.framework.utils.C26264b;
import com.ss.android.lark.browser.C29638a;

/* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.a.k */
public class C29698k implements AbstractC29697j {

    /* renamed from: a */
    private int f74388a;

    /* renamed from: b */
    private String f74389b;

    /* renamed from: c */
    private int f74390c;

    /* renamed from: d */
    private String f74391d;

    @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29697j
    /* renamed from: a */
    public String mo107012a() {
        return this.f74391d;
    }

    @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29697j
    /* renamed from: b */
    public String mo107013b() {
        return this.f74389b;
    }

    @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29697j
    /* renamed from: c */
    public int mo107014c() {
        return this.f74390c;
    }

    @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29697j
    /* renamed from: d */
    public int mo107015d() {
        return this.f74388a;
    }

    public C29698k(BluetoothDevice bluetoothDevice) {
        this.f74391d = bluetoothDevice.getAddress();
        if (Build.VERSION.SDK_INT >= 18) {
            this.f74390c = bluetoothDevice.getType();
        }
        this.f74389b = bluetoothDevice.getName();
        int i = 2;
        if (C26264b.m95067a(C29638a.m109622a().getContext(), bluetoothDevice.getAddress()) != 2) {
            if (bluetoothDevice.getBondState() == 12) {
                i = 1;
            } else {
                i = 0;
            }
        }
        this.f74388a = i;
    }
}
