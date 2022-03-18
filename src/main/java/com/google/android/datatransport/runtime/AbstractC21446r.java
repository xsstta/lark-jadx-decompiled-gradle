package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.AbstractC21413f;
import com.google.android.datatransport.runtime.scheduling.AbstractC21494f;
import com.google.android.datatransport.runtime.scheduling.AbstractC21496h;
import com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c;
import com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21464e;
import com.google.android.datatransport.runtime.time.AbstractC21524b;
import dagger.BindsInstance;
import dagger.Component;
import java.io.Closeable;
import java.io.IOException;
import javax.inject.Singleton;

@Component(modules = {AbstractC21413f.class, AbstractC21464e.class, AbstractC21435i.class, AbstractC21496h.class, AbstractC21494f.class, AbstractC21524b.class})
@Singleton
/* renamed from: com.google.android.datatransport.runtime.r */
abstract class AbstractC21446r implements Closeable {

    @Component.Builder
    /* renamed from: com.google.android.datatransport.runtime.r$a */
    interface AbstractC21447a {
        /* renamed from: a */
        AbstractC21446r mo72673a();

        @BindsInstance
        /* renamed from: b */
        AbstractC21447a mo72674b(Context context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C21445q mo72670b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract AbstractC21461c mo72671c();

    AbstractC21446r() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        mo72671c().close();
    }
}
