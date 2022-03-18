package com.ss.android.lark.widget.ptr;

/* renamed from: com.ss.android.lark.widget.ptr.c */
public abstract class AbstractRunnableC58938c implements Runnable {

    /* renamed from: a */
    private Runnable f145951a;

    /* renamed from: b */
    private byte f145952b;

    /* renamed from: b */
    public void mo199938b() {
        this.f145952b = 0;
    }

    /* renamed from: a */
    public void mo199936a() {
        mo199937a(null);
    }

    /* renamed from: c */
    public void mo199940c() {
        Runnable runnable = this.f145951a;
        if (runnable != null) {
            runnable.run();
        }
        this.f145952b = 2;
    }

    /* renamed from: b */
    public void mo199939b(Runnable runnable) {
        this.f145951a = runnable;
    }

    /* renamed from: a */
    public void mo199937a(Runnable runnable) {
        if (runnable != null) {
            this.f145951a = runnable;
        }
        byte b = this.f145952b;
        if (b == 0) {
            this.f145952b = 1;
            run();
        } else if (b == 2) {
            mo199940c();
        }
    }
}
