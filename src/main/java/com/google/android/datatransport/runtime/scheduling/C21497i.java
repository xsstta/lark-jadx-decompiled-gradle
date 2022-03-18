package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC21520r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c;
import com.google.android.datatransport.runtime.time.AbstractC21523a;
import dagger.internal.AbstractC68174b;
import dagger.internal.C68177e;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.scheduling.i */
public final class C21497i implements AbstractC68174b<AbstractC21520r> {

    /* renamed from: a */
    private final Provider<Context> f52146a;

    /* renamed from: b */
    private final Provider<AbstractC21461c> f52147b;

    /* renamed from: c */
    private final Provider<SchedulerConfig> f52148c;

    /* renamed from: d */
    private final Provider<AbstractC21523a> f52149d;

    /* renamed from: a */
    public AbstractC21520r mo47880b() {
        return m77756a(this.f52146a.mo47880b(), this.f52147b.mo47880b(), this.f52148c.mo47880b(), this.f52149d.mo47880b());
    }

    /* renamed from: a */
    public static C21497i m77755a(Provider<Context> provider, Provider<AbstractC21461c> provider2, Provider<SchedulerConfig> provider3, Provider<AbstractC21523a> provider4) {
        return new C21497i(provider, provider2, provider3, provider4);
    }

    public C21497i(Provider<Context> provider, Provider<AbstractC21461c> provider2, Provider<SchedulerConfig> provider3, Provider<AbstractC21523a> provider4) {
        this.f52146a = provider;
        this.f52147b = provider2;
        this.f52148c = provider3;
        this.f52149d = provider4;
    }

    /* renamed from: a */
    public static AbstractC21520r m77756a(Context context, AbstractC21461c cVar, SchedulerConfig schedulerConfig, AbstractC21523a aVar) {
        return (AbstractC21520r) C68177e.m264824a(AbstractC21496h.m77754a(context, cVar, schedulerConfig, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
