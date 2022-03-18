package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.AbstractC21523a;
import dagger.internal.AbstractC68174b;
import dagger.internal.C68177e;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.scheduling.g */
public final class C21495g implements AbstractC68174b<SchedulerConfig> {

    /* renamed from: a */
    private final Provider<AbstractC21523a> f52145a;

    /* renamed from: a */
    public SchedulerConfig mo47880b() {
        return m77751a(this.f52145a.mo47880b());
    }

    public C21495g(Provider<AbstractC21523a> provider) {
        this.f52145a = provider;
    }

    /* renamed from: a */
    public static C21495g m77750a(Provider<AbstractC21523a> provider) {
        return new C21495g(provider);
    }

    /* renamed from: a */
    public static SchedulerConfig m77751a(AbstractC21523a aVar) {
        return (SchedulerConfig) C68177e.m264824a(AbstractC21494f.m77749a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
