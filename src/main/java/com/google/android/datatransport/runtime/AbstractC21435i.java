package com.google.android.datatransport.runtime;

import dagger.Module;
import dagger.Provides;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.inject.Singleton;

/* access modifiers changed from: package-private */
@Module
/* renamed from: com.google.android.datatransport.runtime.i */
public abstract class AbstractC21435i {
    @Provides
    @Singleton
    /* renamed from: a */
    static Executor m77549a() {
        return Executors.newSingleThreadExecutor();
    }
}
