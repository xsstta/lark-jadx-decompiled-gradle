package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.AbstractC21523a;
import dagger.Module;
import dagger.Provides;

@Module
/* renamed from: com.google.android.datatransport.runtime.scheduling.f */
public abstract class AbstractC21494f {
    @Provides
    /* renamed from: a */
    static SchedulerConfig m77749a(AbstractC21523a aVar) {
        return SchedulerConfig.m77761a(aVar);
    }
}
