package dagger.hilt.android.internal.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1135ac;
import androidx.lifecycle.C1144ai;
import androidx.savedstate.SavedStateRegistryOwner;
import dagger.hilt.C68109a;
import dagger.hilt.android.internal.p3448a.AbstractC68125e;
import java.util.Set;
import javax.inject.Inject;

/* renamed from: dagger.hilt.android.internal.lifecycle.a */
public final class C68133a {

    /* renamed from: dagger.hilt.android.internal.lifecycle.a$a */
    public interface AbstractC68134a {
        /* renamed from: a */
        C68136c mo102460a();
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.a$b */
    public interface AbstractC68135b {
        /* renamed from: d */
        C68136c mo102481d();
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.a$c */
    public static final class C68136c {

        /* renamed from: a */
        private final Application f171369a;

        /* renamed from: b */
        private final Set<String> f171370b;

        /* renamed from: c */
        private final AbstractC68125e f171371c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1144ai.AbstractC1146b mo237045a(Fragment fragment, C1144ai.AbstractC1146b bVar) {
            return m264780a(fragment, fragment.getArguments(), bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1144ai.AbstractC1146b mo237044a(ComponentActivity componentActivity, C1144ai.AbstractC1146b bVar) {
            Bundle bundle;
            if (componentActivity.getIntent() != null) {
                bundle = componentActivity.getIntent().getExtras();
            } else {
                bundle = null;
            }
            return m264780a(componentActivity, bundle, bVar);
        }

        @Inject
        C68136c(Application application, Set<String> set, AbstractC68125e eVar) {
            this.f171369a = application;
            this.f171370b = set;
            this.f171371c = eVar;
        }

        /* renamed from: a */
        private C1144ai.AbstractC1146b m264780a(SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, C1144ai.AbstractC1146b bVar) {
            if (bVar == null) {
                bVar = new C1135ac(this.f171369a, savedStateRegistryOwner, bundle);
            }
            return new C68139d(savedStateRegistryOwner, bundle, this.f171370b, bVar, this.f171371c);
        }
    }

    /* renamed from: a */
    public static C1144ai.AbstractC1146b m264776a(ComponentActivity componentActivity, C1144ai.AbstractC1146b bVar) {
        return ((AbstractC68134a) C68109a.m264750a(componentActivity, AbstractC68134a.class)).mo102460a().mo237044a(componentActivity, bVar);
    }

    /* renamed from: a */
    public static C1144ai.AbstractC1146b m264777a(Fragment fragment, C1144ai.AbstractC1146b bVar) {
        return ((AbstractC68135b) C68109a.m264750a(fragment, AbstractC68135b.class)).mo102481d().mo237045a(fragment, bVar);
    }
}
