package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.C1144ai;
import androidx.savedstate.C1442a;
import androidx.savedstate.SavedStateRegistryOwner;

/* renamed from: androidx.lifecycle.a */
public abstract class AbstractC1127a extends C1144ai.AbstractC1147c {

    /* renamed from: a */
    private final C1442a f4217a;

    /* renamed from: b */
    private final Lifecycle f4218b;

    /* renamed from: c */
    private final Bundle f4219c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract <T extends AbstractC1142af> T mo5973a(String str, Class<T> cls, C1133ab abVar);

    /* access modifiers changed from: package-private */
    @Override // androidx.lifecycle.C1144ai.C1149e
    /* renamed from: a */
    public void mo5974a(AbstractC1142af afVar) {
        SavedStateHandleController.m5320a(afVar, this.f4217a, this.f4218b);
    }

    @Override // androidx.lifecycle.C1144ai.AbstractC1147c, androidx.lifecycle.C1144ai.AbstractC1146b
    public final <T extends AbstractC1142af> T create(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) mo5972a(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public AbstractC1127a(SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        this.f4217a = savedStateRegistryOwner.getSavedStateRegistry();
        this.f4218b = savedStateRegistryOwner.getLifecycle();
        this.f4219c = bundle;
    }

    @Override // androidx.lifecycle.C1144ai.AbstractC1147c
    /* renamed from: a */
    public final <T extends AbstractC1142af> T mo5972a(String str, Class<T> cls) {
        SavedStateHandleController a = SavedStateHandleController.m5319a(this.f4217a, this.f4218b, str, this.f4219c);
        T t = (T) mo5973a(str, cls, a.mo5970b());
        t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", a);
        return t;
    }
}
