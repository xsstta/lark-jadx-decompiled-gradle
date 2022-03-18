package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.AbstractC0203c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.TaskStackBuilder;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ak;
import androidx.navigation.C1275p;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.navigation.g */
public class C1259g {

    /* renamed from: a */
    C1269k f4528a;

    /* renamed from: b */
    final Deque<C1250f> f4529b = new ArrayDeque();

    /* renamed from: c */
    private final Context f4530c;

    /* renamed from: d */
    private Activity f4531d;

    /* renamed from: e */
    private C1274o f4532e;

    /* renamed from: f */
    private Bundle f4533f;

    /* renamed from: g */
    private Parcelable[] f4534g;

    /* renamed from: h */
    private boolean f4535h;

    /* renamed from: i */
    private LifecycleOwner f4536i;

    /* renamed from: j */
    private C1262h f4537j;

    /* renamed from: k */
    private C1293s f4538k = new C1293s();

    /* renamed from: l */
    private final CopyOnWriteArrayList<AbstractC1261a> f4539l = new CopyOnWriteArrayList<>();

    /* renamed from: m */
    private final LifecycleObserver f4540m = new NavController$1(this);

    /* renamed from: n */
    private final AbstractC0203c f4541n = new AbstractC0203c(false) {
        /* class androidx.navigation.C1259g.C12601 */

        @Override // androidx.activity.AbstractC0203c
        public void handleOnBackPressed() {
            C1259g.this.mo6337b();
        }
    };

    /* renamed from: o */
    private boolean f4542o = true;

    /* renamed from: androidx.navigation.g$a */
    public interface AbstractC1261a {
        /* renamed from: a */
        void mo6345a(C1259g gVar, NavDestination navDestination, Bundle bundle);
    }

    /* renamed from: a */
    public C1293s mo6321a() {
        return this.f4538k;
    }

    /* renamed from: a */
    public boolean mo6333a(int i, boolean z) {
        return mo6338b(i, z) && m5716h();
    }

    /* renamed from: a */
    public void mo6330a(C1269k kVar) {
        mo6331a(kVar, (Bundle) null);
    }

    /* renamed from: a */
    public void mo6331a(C1269k kVar, Bundle bundle) {
        C1269k kVar2 = this.f4528a;
        if (kVar2 != null) {
            mo6338b(kVar2.mo6254h(), true);
        }
        this.f4528a = kVar;
        m5714b(bundle);
    }

    /* renamed from: a */
    public boolean mo6334a(Intent intent) {
        C1269k kVar;
        NavDestination.C1240a a;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        Bundle bundle = new Bundle();
        Bundle bundle2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (!((intArray != null && intArray.length != 0) || intent.getData() == null || (a = this.f4528a.mo6242a(new C1268j(intent))) == null)) {
            NavDestination a2 = a.mo6261a();
            int[] k = a2.mo6257k();
            bundle.putAll(a2.mo6241a(a.mo6262b()));
            intArray = k;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String a3 = m5712a(intArray);
        if (a3 != null) {
            Log.i("NavController", "Could not find destination " + a3 + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int flags = intent.getFlags();
        int i = 268435456 & flags;
        if (i != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            TaskStackBuilder.m3572a(this.f4530c).mo4234b(intent).mo4232a();
            Activity activity = this.f4531d;
            if (activity != null) {
                activity.finish();
                this.f4531d.overridePendingTransition(0, 0);
            }
            return true;
        } else if (i != 0) {
            if (!this.f4529b.isEmpty()) {
                mo6338b(this.f4528a.mo6254h(), true);
            }
            int i2 = 0;
            while (i2 < intArray.length) {
                int i3 = i2 + 1;
                int i4 = intArray[i2];
                NavDestination b = mo6335b(i4);
                if (b != null) {
                    m5713a(b, bundle, new C1275p.C1276a().mo6391a(0).mo6395b(0).mo6394a(), (Navigator.AbstractC1241a) null);
                    i2 = i3;
                } else {
                    String a4 = NavDestination.m5615a(this.f4530c, i4);
                    throw new IllegalStateException("Deep Linking failed: destination " + a4 + " cannot be found from the current destination " + mo6341d());
                }
            }
            return true;
        } else {
            C1269k kVar2 = this.f4528a;
            int i5 = 0;
            while (i5 < intArray.length) {
                int i6 = intArray[i5];
                NavDestination c = i5 == 0 ? this.f4528a : kVar2.mo6372c(i6);
                if (c != null) {
                    if (i5 != intArray.length - 1) {
                        while (true) {
                            kVar = (C1269k) c;
                            if (!(kVar.mo6372c(kVar.mo6368a()) instanceof C1269k)) {
                                break;
                            }
                            c = kVar.mo6372c(kVar.mo6368a());
                        }
                        kVar2 = kVar;
                    } else {
                        m5713a(c, c.mo6241a(bundle), new C1275p.C1276a().mo6392a(this.f4528a.mo6254h(), true).mo6391a(0).mo6395b(0).mo6394a(), (Navigator.AbstractC1241a) null);
                    }
                    i5++;
                } else {
                    String a5 = NavDestination.m5615a(this.f4530c, i6);
                    throw new IllegalStateException("Deep Linking failed: destination " + a5 + " cannot be found in graph " + kVar2);
                }
            }
            this.f4535h = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6332a(boolean z) {
        this.f4542o = z;
        m5717i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6329a(ak akVar) {
        if (this.f4537j != C1262h.getInstance(akVar)) {
            if (this.f4529b.isEmpty()) {
                this.f4537j = C1262h.getInstance(akVar);
                return;
            }
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
    }

    /* renamed from: d */
    public NavDestination mo6341d() {
        C1250f f = mo6344f();
        if (f != null) {
            return f.mo6299a();
        }
        return null;
    }

    /* renamed from: g */
    private int m5715g() {
        int i = 0;
        for (C1250f fVar : this.f4529b) {
            if (!(fVar.mo6299a() instanceof C1269k)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: i */
    private void m5717i() {
        AbstractC0203c cVar = this.f4541n;
        boolean z = true;
        if (!this.f4542o || m5715g() <= 1) {
            z = false;
        }
        cVar.setEnabled(z);
    }

    /* renamed from: b */
    public boolean mo6337b() {
        if (this.f4529b.isEmpty()) {
            return false;
        }
        return mo6333a(mo6341d().mo6254h(), true);
    }

    /* renamed from: c */
    public C1274o mo6339c() {
        if (this.f4532e == null) {
            this.f4532e = new C1274o(this.f4530c, this.f4538k);
        }
        return this.f4532e;
    }

    /* renamed from: f */
    public C1250f mo6344f() {
        if (this.f4529b.isEmpty()) {
            return null;
        }
        return this.f4529b.getLast();
    }

    /* renamed from: e */
    public Bundle mo6343e() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, Navigator<? extends NavDestination>> entry : this.f4538k.mo6459a().entrySet()) {
            String key = entry.getKey();
            Bundle e = entry.getValue().mo6268e();
            if (e != null) {
                arrayList.add(key);
                bundle2.putBundle(key, e);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!this.f4529b.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f4529b.size()];
            int i = 0;
            for (C1250f fVar : this.f4529b) {
                parcelableArr[i] = new NavBackStackEntryState(fVar);
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (this.f4535h) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f4535h);
        }
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0009  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m5716h() {
        /*
        // Method dump skipped, instructions count: 278
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C1259g.m5716h():boolean");
    }

    /* renamed from: a */
    public void mo6322a(int i) {
        mo6323a(i, (Bundle) null);
    }

    /* renamed from: c */
    public void mo6340c(int i) {
        mo6336b(i, (Bundle) null);
    }

    /* renamed from: a */
    public void mo6326a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.f4530c.getClassLoader());
            this.f4533f = bundle.getBundle("android-support-nav:controller:navigatorState");
            this.f4534g = bundle.getParcelableArray("android-support-nav:controller:backStack");
            this.f4535h = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public NavDestination mo6335b(int i) {
        NavDestination navDestination;
        C1269k kVar;
        C1269k kVar2 = this.f4528a;
        if (kVar2 == null) {
            return null;
        }
        if (kVar2.mo6254h() == i) {
            return this.f4528a;
        }
        if (this.f4529b.isEmpty()) {
            navDestination = this.f4528a;
        } else {
            navDestination = this.f4529b.getLast().mo6299a();
        }
        if (navDestination instanceof C1269k) {
            kVar = navDestination;
        } else {
            kVar = navDestination.mo6253g();
        }
        return kVar.mo6372c(i);
    }

    public C1259g(Context context) {
        this.f4530c = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.f4531d = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        C1293s sVar = this.f4538k;
        sVar.mo6456a(new C1271l(sVar));
        this.f4538k.mo6456a(new C1243b(this.f4530c));
    }

    /* renamed from: a */
    private String m5712a(int[] iArr) {
        C1269k kVar;
        C1269k kVar2 = this.f4528a;
        int i = 0;
        while (true) {
            NavDestination navDestination = null;
            if (i >= iArr.length) {
                return null;
            }
            int i2 = iArr[i];
            if (i != 0) {
                navDestination = kVar2.mo6372c(i2);
            } else if (this.f4528a.mo6254h() == i2) {
                navDestination = this.f4528a;
            }
            if (navDestination == null) {
                return NavDestination.m5615a(this.f4530c, i2);
            }
            if (i != iArr.length - 1) {
                while (true) {
                    kVar = (C1269k) navDestination;
                    if (!(kVar.mo6372c(kVar.mo6368a()) instanceof C1269k)) {
                        break;
                    }
                    navDestination = kVar.mo6372c(kVar.mo6368a());
                }
                kVar2 = kVar;
            }
            i++;
        }
    }

    /* renamed from: d */
    public C1250f mo6342d(int i) {
        C1250f fVar;
        Iterator<C1250f> descendingIterator = this.f4529b.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                fVar = null;
                break;
            }
            fVar = descendingIterator.next();
            if (fVar.mo6299a().mo6254h() == i) {
                break;
            }
        }
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalArgumentException("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + mo6341d());
    }

    /* renamed from: b */
    private void m5714b(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f4533f;
        if (!(bundle2 == null || (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) == null)) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                Navigator a = this.f4538k.mo6457a(next);
                Bundle bundle3 = this.f4533f.getBundle(next);
                if (bundle3 != null) {
                    a.mo6265a(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f4534g;
        boolean z = false;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                NavDestination b = mo6335b(navBackStackEntryState.mo6232b());
                if (b != null) {
                    Bundle c = navBackStackEntryState.mo6233c();
                    if (c != null) {
                        c.setClassLoader(this.f4530c.getClassLoader());
                    }
                    this.f4529b.add(new C1250f(this.f4530c, b, c, this.f4536i, this.f4537j, navBackStackEntryState.mo6231a(), navBackStackEntryState.mo6234d()));
                } else {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + NavDestination.m5615a(this.f4530c, navBackStackEntryState.mo6232b()) + " cannot be found from the current destination " + mo6341d());
                }
            }
            m5717i();
            this.f4534g = null;
        }
        if (this.f4528a == null || !this.f4529b.isEmpty()) {
            m5716h();
            return;
        }
        if (!this.f4535h && (activity = this.f4531d) != null && mo6334a(activity.getIntent())) {
            z = true;
        }
        if (!z) {
            m5713a(this.f4528a, bundle, (C1275p) null, (Navigator.AbstractC1241a) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6327a(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (this.f4536i != null) {
            this.f4541n.remove();
            onBackPressedDispatcher.addCallback(this.f4536i, this.f4541n);
            this.f4536i.getLifecycle().removeObserver(this.f4540m);
            this.f4536i.getLifecycle().addObserver(this.f4540m);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6328a(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.f4536i) {
            this.f4536i = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this.f4540m);
        }
    }

    /* renamed from: b */
    public void mo6336b(int i, Bundle bundle) {
        mo6324a(i, bundle, null);
    }

    /* renamed from: a */
    public void mo6323a(int i, Bundle bundle) {
        mo6331a(mo6339c().mo6381a(i), bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo6338b(int i, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.f4529b.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C1250f> descendingIterator = this.f4529b.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z2 = false;
                break;
            }
            NavDestination a = descendingIterator.next().mo6299a();
            Navigator a2 = this.f4538k.mo6457a(a.mo6256j());
            if (z || a.mo6254h() != i) {
                arrayList.add(a2);
            }
            if (a.mo6254h() == i) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            String a3 = NavDestination.m5615a(this.f4530c, i);
            Log.i("NavController", "Ignoring popBackStack to destination " + a3 + " as it was not found on the current back stack");
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && ((Navigator) it.next()).mo6266c()) {
            C1250f removeLast = this.f4529b.removeLast();
            if (removeLast.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                removeLast.mo6302a(Lifecycle.State.DESTROYED);
            }
            C1262h hVar = this.f4537j;
            if (hVar != null) {
                hVar.clear(removeLast.f4499a);
            }
            z3 = true;
        }
        m5717i();
        return z3;
    }

    /* renamed from: a */
    public void mo6324a(int i, Bundle bundle, C1275p pVar) {
        mo6325a(i, bundle, pVar, (Navigator.AbstractC1241a) null);
    }

    /* renamed from: a */
    public void mo6325a(int i, Bundle bundle, C1275p pVar, Navigator.AbstractC1241a aVar) {
        NavDestination navDestination;
        int i2;
        if (this.f4529b.isEmpty()) {
            navDestination = this.f4528a;
        } else {
            navDestination = this.f4529b.getLast().mo6299a();
        }
        if (navDestination != null) {
            C1247d b = navDestination.mo6250b(i);
            Bundle bundle2 = null;
            if (b != null) {
                if (pVar == null) {
                    pVar = b.mo6287b();
                }
                i2 = b.mo6284a();
                Bundle c = b.mo6288c();
                if (c != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(c);
                }
            } else {
                i2 = i;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i2 == 0 && pVar != null && pVar.mo6383b() != -1) {
                mo6333a(pVar.mo6383b(), pVar.mo6384c());
            } else if (i2 != 0) {
                NavDestination b2 = mo6335b(i2);
                if (b2 == null) {
                    String a = NavDestination.m5615a(this.f4530c, i2);
                    if (b != null) {
                        throw new IllegalArgumentException("Navigation destination " + a + " referenced from action " + NavDestination.m5615a(this.f4530c, i) + " cannot be found from the current destination " + navDestination);
                    }
                    throw new IllegalArgumentException("Navigation action/destination " + a + " cannot be found from the current destination " + navDestination);
                }
                m5713a(b2, bundle2, pVar, aVar);
            } else {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            }
        } else {
            throw new IllegalStateException("no current navigation node");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031 A[LOOP:0: B:10:0x0031->B:15:0x005d, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5713a(androidx.navigation.NavDestination r12, android.os.Bundle r13, androidx.navigation.C1275p r14, androidx.navigation.Navigator.AbstractC1241a r15) {
        /*
        // Method dump skipped, instructions count: 415
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C1259g.m5713a(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.p, androidx.navigation.Navigator$a):void");
    }
}
