package com.bytedance.ee.bear.service;

import com.bytedance.ee.bear.thread.C11674a;
import io.reactivex.AbstractC68307f;
import io.reactivex.Scheduler;
import io.reactivex.internal.schedulers.C68934d;

/* renamed from: com.bytedance.ee.bear.service.c */
public class C10917c {

    /* renamed from: b */
    private static C68934d f29384b;

    /* renamed from: a */
    private final C10929e f29385a;

    /* renamed from: a */
    public static Scheduler m45411a() {
        if (f29384b == null) {
            f29384b = new C68934d(new C11674a().mo44757a("init"));
        }
        return f29384b;
    }

    public C10917c(C10929e eVar) {
        this.f29385a = eVar;
    }

    /* renamed from: a */
    public <T> T mo41506a(Class<T> cls) {
        return (T) this.f29385a.mo41522a(cls);
    }

    /* renamed from: b */
    public <T> AbstractC68307f<T> mo41507b(Class<T> cls) {
        return this.f29385a.mo41523b(cls);
    }

    /* renamed from: c */
    public <T> AbstractC68307f<T> mo41508c(Class<T> cls) {
        return mo41505a(cls, m45411a());
    }

    /* renamed from: a */
    public <T> AbstractC68307f<T> mo41505a(Class<T> cls, Scheduler scheduler) {
        return this.f29385a.mo41523b(cls).mo238004b(scheduler);
    }
}
