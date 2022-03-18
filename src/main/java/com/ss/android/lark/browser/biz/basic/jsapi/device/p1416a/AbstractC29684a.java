package com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26264b;
import com.ss.android.lark.permission.C51327f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.a.a */
public abstract class AbstractC29684a implements AbstractC29695h {

    /* renamed from: a */
    protected Context f74373a;

    /* renamed from: b */
    protected boolean f74374b;

    /* renamed from: c */
    private List<AbstractC29694g> f74375c = new ArrayList();

    /* renamed from: d */
    private Runnable f74376d;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo107003c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo107004d();

    /* renamed from: a */
    public void mo106996a() {
        this.f74375c.clear();
    }

    /* renamed from: g */
    private Runnable m109842g() {
        if (this.f74376d == null) {
            this.f74376d = new Runnable() {
                /* class com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29684a.RunnableC296851 */

                public void run() {
                    AbstractC29684a.this.mo107005e();
                }
            };
        }
        return this.f74376d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo107002b() {
        for (AbstractC29694g gVar : this.f74375c) {
            gVar.mo106979a();
        }
    }

    @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29695h
    /* renamed from: e */
    public void mo107005e() {
        if (this.f74374b) {
            this.f74374b = false;
            mo107004d();
            mo107006f();
            mo106996a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo107006f() {
        for (AbstractC29694g gVar : this.f74375c) {
            gVar.mo106982b();
        }
    }

    /* renamed from: b */
    private void m109841b(long j) {
        UICallbackExecutor.executeDelayed(m109842g(), Math.max(j, 0L));
    }

    @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29695h
    /* renamed from: a */
    public void mo107000a(AbstractC29694g gVar) {
        if (gVar != null && !this.f74375c.contains(gVar)) {
            this.f74375c.add(gVar);
        }
    }

    public AbstractC29684a(Context context) {
        this.f74373a = context.getApplicationContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo106997a(int i) {
        for (AbstractC29694g gVar : this.f74375c) {
            gVar.mo106980a(i);
        }
    }

    @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29695h
    /* renamed from: a */
    public void mo106998a(long j) {
        if (!mo107001a(this.f74373a)) {
            mo106997a(-1);
        } else if (!C26264b.m95071a()) {
            mo106997a(-2);
        } else {
            mo107002b();
            mo107003c();
            this.f74374b = true;
            m109841b(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo106999a(BluetoothDevice bluetoothDevice) {
        for (AbstractC29694g gVar : this.f74375c) {
            gVar.mo106981a(new C29698k(bluetoothDevice));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo107001a(Context context) {
        return C51327f.m199081a(context, "android.permission.BLUETOOTH_ADMIN");
    }
}
