package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C1144ai;
import androidx.savedstate.C1442a;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* renamed from: androidx.lifecycle.ac */
public final class C1135ac extends C1144ai.AbstractC1147c {

    /* renamed from: f */
    private static final Class<?>[] f4237f = {Application.class, C1133ab.class};

    /* renamed from: g */
    private static final Class<?>[] f4238g = {C1133ab.class};

    /* renamed from: a */
    private final Application f4239a;

    /* renamed from: b */
    private final C1144ai.AbstractC1146b f4240b;

    /* renamed from: c */
    private final Bundle f4241c;

    /* renamed from: d */
    private final Lifecycle f4242d;

    /* renamed from: e */
    private final C1442a f4243e;

    /* access modifiers changed from: package-private */
    @Override // androidx.lifecycle.C1144ai.C1149e
    /* renamed from: a */
    public void mo5974a(AbstractC1142af afVar) {
        SavedStateHandleController.m5320a(afVar, this.f4243e, this.f4242d);
    }

    @Override // androidx.lifecycle.C1144ai.AbstractC1147c, androidx.lifecycle.C1144ai.AbstractC1146b
    public <T extends AbstractC1142af> T create(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) mo5972a(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: a */
    private static <T> Constructor<T> m5345a(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            if (Arrays.equals(clsArr, constructor2.getParameterTypes())) {
                return constructor2;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.C1144ai.AbstractC1147c
    /* renamed from: a */
    public <T extends AbstractC1142af> T mo5972a(String str, Class<T> cls) {
        Constructor constructor;
        T t;
        boolean isAssignableFrom = C1150b.class.isAssignableFrom(cls);
        if (!isAssignableFrom || this.f4239a == null) {
            constructor = m5345a(cls, f4238g);
        } else {
            constructor = m5345a(cls, f4237f);
        }
        if (constructor == null) {
            return (T) this.f4240b.create(cls);
        }
        SavedStateHandleController a = SavedStateHandleController.m5319a(this.f4243e, this.f4242d, str, this.f4241c);
        if (isAssignableFrom) {
            try {
                Application application = this.f4239a;
                if (application != null) {
                    t = (T) ((AbstractC1142af) constructor.newInstance(application, a.mo5970b()));
                    t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", a);
                    return t;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to access " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
            }
        }
        t = (T) ((AbstractC1142af) constructor.newInstance(a.mo5970b()));
        t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", a);
        return t;
    }

    public C1135ac(Application application, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        C1144ai.AbstractC1146b bVar;
        this.f4243e = savedStateRegistryOwner.getSavedStateRegistry();
        this.f4242d = savedStateRegistryOwner.getLifecycle();
        this.f4241c = bundle;
        this.f4239a = application;
        if (application != null) {
            bVar = C1144ai.C1145a.m5360a(application);
        } else {
            bVar = C1144ai.C1148d.m5362a();
        }
        this.f4240b = bVar;
    }
}
