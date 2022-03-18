package dagger.hilt.android.internal.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1127a;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1133ab;
import androidx.lifecycle.C1144ai;
import androidx.savedstate.SavedStateRegistryOwner;
import dagger.hilt.C68109a;
import dagger.hilt.android.internal.p3448a.AbstractC68125e;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: dagger.hilt.android.internal.lifecycle.d */
public final class C68139d implements C1144ai.AbstractC1146b {

    /* renamed from: a */
    private final Set<String> f171375a;

    /* renamed from: b */
    private final C1144ai.AbstractC1146b f171376b;

    /* renamed from: c */
    private final AbstractC1127a f171377c;

    /* renamed from: dagger.hilt.android.internal.lifecycle.d$a */
    public interface AbstractC68141a {
        /* renamed from: a */
        Map<String, Provider<AbstractC1142af>> mo102491a();
    }

    @Override // androidx.lifecycle.C1144ai.AbstractC1146b
    public <T extends AbstractC1142af> T create(Class<T> cls) {
        return this.f171375a.contains(cls.getName()) ? (T) this.f171377c.create(cls) : (T) this.f171376b.create(cls);
    }

    public C68139d(SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, Set<String> set, C1144ai.AbstractC1146b bVar, final AbstractC68125e eVar) {
        this.f171375a = set;
        this.f171376b = bVar;
        this.f171377c = new AbstractC1127a(savedStateRegistryOwner, bundle) {
            /* class dagger.hilt.android.internal.lifecycle.C68139d.C681401 */

            /* access modifiers changed from: protected */
            @Override // androidx.lifecycle.AbstractC1127a
            /* renamed from: a */
            public <T extends AbstractC1142af> T mo5973a(String str, Class<T> cls, C1133ab abVar) {
                Provider<AbstractC1142af> provider = ((AbstractC68141a) C68109a.m264750a(eVar.mo102490b(abVar).mo102489b(), AbstractC68141a.class)).mo102491a().get(cls.getName());
                if (provider != null) {
                    return (T) provider.mo47880b();
                }
                throw new IllegalStateException("Expected the @HiltViewModel-annotated class '" + cls.getName() + "' to be available in the multi-binding of @HiltViewModelMap but none was found.");
            }
        };
    }
}
