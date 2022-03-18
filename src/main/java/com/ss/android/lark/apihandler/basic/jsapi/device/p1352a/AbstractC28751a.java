package com.ss.android.lark.apihandler.basic.jsapi.device.p1352a;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26264b;
import com.ss.android.lark.permission.C51327f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.apihandler.basic.jsapi.device.a.a */
public abstract class AbstractC28751a implements AbstractC28762h {

    /* renamed from: a */
    protected Context f72305a;

    /* renamed from: b */
    protected boolean f72306b;

    /* renamed from: c */
    private List<AbstractC28761g> f72307c = new ArrayList();

    /* renamed from: d */
    private Runnable f72308d;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo102250c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo102251d();

    /* renamed from: a */
    public void mo102243a() {
        this.f72307c.clear();
    }

    /* renamed from: g */
    private Runnable m105405g() {
        if (this.f72308d == null) {
            this.f72308d = new Runnable() {
                /* class com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28751a.RunnableC287521 */

                public void run() {
                    AbstractC28751a.this.mo102252e();
                }
            };
        }
        return this.f72308d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo102249b() {
        for (AbstractC28761g gVar : this.f72307c) {
            gVar.mo102226a();
        }
    }

    @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28762h
    /* renamed from: e */
    public void mo102252e() {
        if (this.f72306b) {
            this.f72306b = false;
            mo102251d();
            mo102253f();
            mo102243a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo102253f() {
        for (AbstractC28761g gVar : this.f72307c) {
            gVar.mo102229b();
        }
    }

    /* renamed from: b */
    private void m105404b(long j) {
        UICallbackExecutor.executeDelayed(m105405g(), Math.max(j, 0L));
    }

    @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28762h
    /* renamed from: a */
    public void mo102247a(AbstractC28761g gVar) {
        if (gVar != null && !this.f72307c.contains(gVar)) {
            this.f72307c.add(gVar);
        }
    }

    public AbstractC28751a(Context context) {
        this.f72305a = context.getApplicationContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo102244a(int i) {
        for (AbstractC28761g gVar : this.f72307c) {
            gVar.mo102227a(i);
        }
    }

    @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28762h
    /* renamed from: a */
    public void mo102245a(long j) {
        if (!mo102248a(this.f72305a)) {
            mo102244a(-1);
        } else if (!C26264b.m95071a()) {
            mo102244a(-2);
        } else {
            mo102249b();
            mo102250c();
            this.f72306b = true;
            m105404b(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo102248a(Context context) {
        return C51327f.m199081a(context, "android.permission.BLUETOOTH_ADMIN");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo102246a(BluetoothDevice bluetoothDevice, Context context) {
        for (AbstractC28761g gVar : this.f72307c) {
            gVar.mo102228a(new C28765k(bluetoothDevice, context));
        }
    }
}
