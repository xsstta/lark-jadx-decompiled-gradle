package dagger.hilt.android.internal.lifecycle;

import android.app.Application;
import dagger.hilt.android.internal.lifecycle.C68133a;
import dagger.hilt.android.internal.p3448a.AbstractC68125e;
import dagger.internal.AbstractC68174b;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: dagger.hilt.android.internal.lifecycle.c */
public final class C68138c implements AbstractC68174b<C68133a.C68136c> {

    /* renamed from: a */
    private final Provider<Application> f171372a;

    /* renamed from: b */
    private final Provider<Set<String>> f171373b;

    /* renamed from: c */
    private final Provider<AbstractC68125e> f171374c;

    /* renamed from: a */
    public C68133a.C68136c mo47880b() {
        return m264783a(this.f171372a.mo47880b(), this.f171373b.mo47880b(), this.f171374c.mo47880b());
    }

    /* renamed from: a */
    public static C68133a.C68136c m264783a(Application application, Set<String> set, AbstractC68125e eVar) {
        return new C68133a.C68136c(application, set, eVar);
    }
}
