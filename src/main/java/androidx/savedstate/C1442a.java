package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.p011a.p012a.p014b.C0186b;
import androidx.savedstate.Recreator;
import java.util.Map;

/* renamed from: androidx.savedstate.a */
public final class C1442a {

    /* renamed from: a */
    boolean f5067a = true;

    /* renamed from: b */
    private C0186b<String, AbstractC1444b> f5068b = new C0186b<>();

    /* renamed from: c */
    private Bundle f5069c;

    /* renamed from: d */
    private boolean f5070d;

    /* renamed from: e */
    private Recreator.C1441a f5071e;

    /* renamed from: androidx.savedstate.a$a */
    public interface AbstractC1443a {
        /* renamed from: a */
        void mo5971a(SavedStateRegistryOwner savedStateRegistryOwner);
    }

    /* renamed from: androidx.savedstate.a$b */
    public interface AbstractC1444b {
        /* renamed from: a */
        Bundle mo5991a();
    }

    C1442a() {
    }

    /* renamed from: a */
    public Bundle mo7620a(String str) {
        if (this.f5070d) {
            Bundle bundle = this.f5069c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f5069c.remove(str);
            if (this.f5069c.isEmpty()) {
                this.f5069c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7621a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f5069c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0186b<K, V>.C0190d c = this.f5068b.mo563c();
        while (c.hasNext()) {
            Map.Entry entry = (Map.Entry) c.next();
            bundle2.putBundle((String) entry.getKey(), ((AbstractC1444b) entry.getValue()).mo5991a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: a */
    public void mo7623a(Class<? extends AbstractC1443a> cls) {
        if (this.f5067a) {
            if (this.f5071e == null) {
                this.f5071e = new Recreator.C1441a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f5071e.mo7619a(cls.getName());
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: a */
    public void mo7624a(String str, AbstractC1444b bVar) {
        if (this.f5068b.mo556a(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7622a(Lifecycle lifecycle, Bundle bundle) {
        if (!this.f5070d) {
            if (bundle != null) {
                this.f5069c = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            lifecycle.addObserver(new SavedStateRegistry$1(this));
            this.f5070d = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }
}
