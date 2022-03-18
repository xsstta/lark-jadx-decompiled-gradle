package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.C1442a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class Recreator implements AbstractC1164j {

    /* renamed from: a */
    private final SavedStateRegistryOwner f5064a;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.savedstate.Recreator$a */
    public static final class C1441a implements C1442a.AbstractC1444b {

        /* renamed from: a */
        final Set<String> f5065a = new HashSet();

        @Override // androidx.savedstate.C1442a.AbstractC1444b
        /* renamed from: a */
        public Bundle mo5991a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f5065a));
            return bundle;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7619a(String str) {
            this.f5065a.add(str);
        }

        C1441a(C1442a aVar) {
            aVar.mo7624a("androidx.savedstate.Restarter", this);
        }
    }

    Recreator(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.f5064a = savedStateRegistryOwner;
    }

    /* renamed from: a */
    private void m6585a(String str) {
        Class cls;
        try {
            try {
                Constructor<? extends U> declaredConstructor = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C1442a.AbstractC1443a.class).getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((C1442a.AbstractC1443a) declaredConstructor.newInstance(new Object[0])).mo5971a(this.f5064a);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            lifecycleOwner.getLifecycle().removeObserver(this);
            Bundle a = this.f5064a.getSavedStateRegistry().mo7620a("androidx.savedstate.Restarter");
            if (a != null) {
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        m6585a(it.next());
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
