package com.ss.android.lark.apihandler.basic.jsapi.device.p1352a;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import com.larksuite.framework.utils.C26264b;

/* renamed from: com.ss.android.lark.apihandler.basic.jsapi.device.a.k */
public class C28765k implements AbstractC28764j {

    /* renamed from: a */
    private int f72320a;

    /* renamed from: b */
    private String f72321b;

    /* renamed from: c */
    private int f72322c;

    /* renamed from: d */
    private String f72323d;

    @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28764j
    /* renamed from: a */
    public String mo102259a() {
        return this.f72323d;
    }

    @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28764j
    /* renamed from: b */
    public String mo102260b() {
        return this.f72321b;
    }

    @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28764j
    /* renamed from: c */
    public int mo102261c() {
        return this.f72322c;
    }

    @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28764j
    /* renamed from: d */
    public int mo102262d() {
        return this.f72320a;
    }

    public C28765k(BluetoothDevice bluetoothDevice, Context context) {
        this.f72323d = bluetoothDevice.getAddress();
        if (Build.VERSION.SDK_INT >= 18) {
            this.f72322c = bluetoothDevice.getType();
        }
        this.f72321b = bluetoothDevice.getName();
        int i = 2;
        if (C26264b.m95067a(context, bluetoothDevice.getAddress()) != 2) {
            if (bluetoothDevice.getBondState() == 12) {
                i = 1;
            } else {
                i = 0;
            }
        }
        this.f72320a = i;
    }
}
