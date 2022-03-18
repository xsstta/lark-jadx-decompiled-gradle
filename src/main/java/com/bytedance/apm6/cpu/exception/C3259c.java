package com.bytedance.apm6.cpu.exception;

import com.bytedance.apm6.cpu.C3223a;
import com.bytedance.apm6.cpu.exception.p171a.C3251d;
import com.bytedance.apm6.cpu.p169a.C3229c;
import com.bytedance.apm6.foundation.p182a.C3318a;

/* renamed from: com.bytedance.apm6.cpu.exception.c */
public class C3259c {

    /* renamed from: a */
    private boolean f10436a;

    /* renamed from: b */
    private AbstractC3264f f10437b;

    /* renamed from: c */
    private C3229c f10438c;

    /* renamed from: d */
    private boolean f10439d;

    /* renamed from: e */
    private long f10440e;

    /* renamed from: f */
    private C3223a.AbstractC3226c f10441f;

    /* renamed from: g */
    private C3223a.AbstractC3225b f10442g;

    /* renamed from: h */
    private boolean f10443h;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm6.cpu.exception.c$a */
    public static final class C3261a {

        /* renamed from: a */
        public static final C3259c f10444a = new C3259c();
    }

    /* renamed from: a */
    public static C3259c m13617a() {
        return C3261a.f10444a;
    }

    /* renamed from: c */
    public C3223a.AbstractC3226c mo13437c() {
        return this.f10441f;
    }

    /* renamed from: d */
    public C3223a.AbstractC3225b mo13438d() {
        return this.f10442g;
    }

    /* renamed from: b */
    public synchronized boolean mo13436b() {
        return this.f10439d;
    }

    private C3259c() {
        this.f10437b = new C3251d();
    }

    /* renamed from: a */
    public void mo13434a(long j) {
        this.f10440e = j;
    }

    /* renamed from: a */
    public synchronized void mo13435a(C3229c cVar) {
        if (cVar != null) {
            if (C3318a.m13827e() || cVar.mo13366g()) {
                this.f10438c = cVar;
                if (this.f10443h) {
                    if (!this.f10436a) {
                        this.f10436a = true;
                        this.f10439d = true;
                        this.f10437b.mo13429a(cVar);
                    }
                    return;
                }
                if (cVar.mo13355a()) {
                    this.f10436a = true;
                    this.f10439d = true;
                    this.f10437b.mo13429a(cVar);
                } else {
                    this.f10436a = false;
                    this.f10437b.mo13428a();
                }
            }
        }
    }
}
