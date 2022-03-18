package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC21520r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C21501a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C21507e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c;
import com.google.android.datatransport.runtime.time.AbstractC21523a;
import dagger.Module;
import dagger.Provides;

@Module
/* renamed from: com.google.android.datatransport.runtime.scheduling.h */
public abstract class AbstractC21496h {
    @Provides
    /* renamed from: a */
    static AbstractC21520r m77754a(Context context, AbstractC21461c cVar, SchedulerConfig schedulerConfig, AbstractC21523a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C21507e(context, cVar, schedulerConfig);
        }
        return new C21501a(context, cVar, aVar, schedulerConfig);
    }
}
