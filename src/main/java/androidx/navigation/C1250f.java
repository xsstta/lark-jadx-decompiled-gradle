package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C1135ac;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ak;
import androidx.savedstate.C1442a;
import androidx.savedstate.C1445b;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.UUID;

/* renamed from: androidx.navigation.f */
public final class C1250f implements HasDefaultViewModelProviderFactory, LifecycleOwner, ViewModelStoreOwner, SavedStateRegistryOwner {

    /* renamed from: a */
    final UUID f4499a;

    /* renamed from: b */
    private final Context f4500b;

    /* renamed from: c */
    private final NavDestination f4501c;

    /* renamed from: d */
    private Bundle f4502d;

    /* renamed from: e */
    private final LifecycleRegistry f4503e;

    /* renamed from: f */
    private final C1445b f4504f;

    /* renamed from: g */
    private Lifecycle.State f4505g;

    /* renamed from: h */
    private Lifecycle.State f4506h;

    /* renamed from: i */
    private C1262h f4507i;

    /* renamed from: j */
    private C1144ai.AbstractC1146b f4508j;

    /* renamed from: a */
    public NavDestination mo6299a() {
        return this.f4501c;
    }

    /* renamed from: b */
    public Bundle mo6303b() {
        return this.f4502d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Lifecycle.State mo6305c() {
        return this.f4506h;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.f4503e;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public C1442a getSavedStateRegistry() {
        return this.f4504f.mo7625a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6306d() {
        if (this.f4505g.ordinal() < this.f4506h.ordinal()) {
            this.f4503e.setCurrentState(this.f4505g);
        } else {
            this.f4503e.setCurrentState(this.f4506h);
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public C1144ai.AbstractC1146b getDefaultViewModelProviderFactory() {
        if (this.f4508j == null) {
            this.f4508j = new C1135ac((Application) this.f4500b.getApplicationContext(), this, this.f4502d);
        }
        return this.f4508j;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ak getViewModelStore() {
        C1262h hVar = this.f4507i;
        if (hVar != null) {
            return hVar.getViewModelStore(this.f4499a);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.f$1 */
    public static /* synthetic */ class C12511 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4509a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.navigation.C1250f.C12511.f4509a = r0
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = androidx.navigation.C1250f.C12511.f4509a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = androidx.navigation.C1250f.C12511.f4509a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = androidx.navigation.C1250f.C12511.f4509a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = androidx.navigation.C1250f.C12511.f4509a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = androidx.navigation.C1250f.C12511.f4509a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = androidx.navigation.C1250f.C12511.f4509a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C1250f.C12511.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6300a(Bundle bundle) {
        this.f4502d = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6304b(Bundle bundle) {
        this.f4504f.mo7627b(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6301a(Lifecycle.Event event) {
        this.f4505g = m5673b(event);
        mo6306d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6302a(Lifecycle.State state) {
        this.f4506h = state;
        mo6306d();
    }

    /* renamed from: b */
    private static Lifecycle.State m5673b(Lifecycle.Event event) {
        switch (C12511.f4509a[event.ordinal()]) {
            case 1:
            case 2:
                return Lifecycle.State.CREATED;
            case 3:
            case 4:
                return Lifecycle.State.STARTED;
            case 5:
                return Lifecycle.State.RESUMED;
            case 6:
                return Lifecycle.State.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + event);
        }
    }

    C1250f(Context context, NavDestination navDestination, Bundle bundle, LifecycleOwner lifecycleOwner, C1262h hVar) {
        this(context, navDestination, bundle, lifecycleOwner, hVar, UUID.randomUUID(), null);
    }

    C1250f(Context context, NavDestination navDestination, Bundle bundle, LifecycleOwner lifecycleOwner, C1262h hVar, UUID uuid, Bundle bundle2) {
        this.f4503e = new LifecycleRegistry(this);
        C1445b a = C1445b.m6595a(this);
        this.f4504f = a;
        this.f4505g = Lifecycle.State.CREATED;
        this.f4506h = Lifecycle.State.RESUMED;
        this.f4500b = context;
        this.f4499a = uuid;
        this.f4501c = navDestination;
        this.f4502d = bundle;
        this.f4507i = hVar;
        a.mo7626a(bundle2);
        if (lifecycleOwner != null) {
            this.f4505g = lifecycleOwner.getLifecycle().getCurrentState();
        }
    }
}
