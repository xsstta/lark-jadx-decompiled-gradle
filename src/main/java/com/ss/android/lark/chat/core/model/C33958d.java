package com.ss.android.lark.chat.core.model;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;

/* renamed from: com.ss.android.lark.chat.core.model.d */
public class C33958d implements AbstractExecutorC33962g {

    /* renamed from: a */
    private Handler f87547a;

    /* renamed from: b */
    private final HandlerThread f87548b;

    /* renamed from: b */
    public static HandlerThread m131430b(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: e */
    private void m131431e() {
        this.f87548b.start();
    }

    @Override // com.ss.android.lark.chat.core.model.AbstractExecutorC33962g
    /* renamed from: c */
    public void mo124077c() {
        this.f87548b.quitSafely();
    }

    @Override // com.ss.android.lark.chat.core.model.AbstractExecutorC33962g
    /* renamed from: d */
    public void mo124078d() {
        if (!mo124076b()) {
            throw new IllegalStateException("serial task check failed");
        }
    }

    /* renamed from: a */
    public synchronized Handler mo124075a() {
        if (this.f87547a == null) {
            this.f87547a = new Handler(this.f87548b.getLooper());
        }
        return this.f87547a;
    }

    /* renamed from: b */
    public boolean mo124076b() {
        if (Looper.myLooper() == mo124075a().getLooper()) {
            return true;
        }
        return false;
    }

    private C33958d(String str) {
        this.f87548b = m131430b(str);
    }

    /* renamed from: a */
    public static C33958d m131429a(String str) {
        C33958d dVar = new C33958d(str);
        dVar.m131431e();
        return dVar;
    }

    public void execute(Runnable runnable) {
        if (this.f87548b.isAlive()) {
            if (mo124076b()) {
                runnable.run();
            } else {
                mo124075a().post(runnable);
            }
        }
    }
}
