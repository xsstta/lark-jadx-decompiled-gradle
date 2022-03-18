package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.ComponentCallbacks2C2126g;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.manager.n */
public class C2507n extends Fragment {

    /* renamed from: a */
    private final C2490a f8134a;

    /* renamed from: b */
    private final AbstractC2505l f8135b;

    /* renamed from: c */
    private final Set<C2507n> f8136c;

    /* renamed from: d */
    private C2507n f8137d;

    /* renamed from: e */
    private ComponentCallbacks2C2126g f8138e;

    /* renamed from: f */
    private Fragment f8139f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2490a mo11090a() {
        return this.f8134a;
    }

    /* renamed from: b */
    public ComponentCallbacks2C2126g mo11093b() {
        return this.f8138e;
    }

    /* renamed from: c */
    public AbstractC2505l mo11094c() {
        return this.f8135b;
    }

    public C2507n() {
        this(new C2490a());
    }

    /* renamed from: e */
    private Fragment m10557e() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return this.f8139f;
    }

    /* renamed from: f */
    private void m10558f() {
        C2507n nVar = this.f8137d;
        if (nVar != null) {
            nVar.m10555b(this);
            this.f8137d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f8134a.mo11068c();
        m10558f();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f8139f = null;
        m10558f();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f8134a.mo11064a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f8134a.mo11066b();
    }

    /* renamed from: com.bumptech.glide.manager.n$a */
    private class C2508a implements AbstractC2505l {
        public String toString() {
            return super.toString() + "{fragment=" + C2507n.this + "}";
        }

        @Override // com.bumptech.glide.manager.AbstractC2505l
        /* renamed from: a */
        public Set<ComponentCallbacks2C2126g> mo11062a() {
            Set<C2507n> d = C2507n.this.mo11095d();
            HashSet hashSet = new HashSet(d.size());
            for (C2507n nVar : d) {
                if (nVar.mo11093b() != null) {
                    hashSet.add(nVar.mo11093b());
                }
            }
            return hashSet;
        }

        C2508a() {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m10557e() + "}";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Set<C2507n> mo11095d() {
        C2507n nVar = this.f8137d;
        if (nVar == null) {
            return Collections.emptySet();
        }
        if (equals(nVar)) {
            return Collections.unmodifiableSet(this.f8136c);
        }
        HashSet hashSet = new HashSet();
        for (C2507n nVar2 : this.f8137d.mo11095d()) {
            if (m10556c(nVar2.m10557e())) {
                hashSet.add(nVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    private void m10553a(C2507n nVar) {
        this.f8136c.add(nVar);
    }

    /* renamed from: b */
    private void m10555b(C2507n nVar) {
        this.f8136c.remove(nVar);
    }

    /* renamed from: b */
    private static FragmentManager m10554b(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    /* renamed from: a */
    public void mo11092a(ComponentCallbacks2C2126g gVar) {
        this.f8138e = gVar;
    }

    public C2507n(C2490a aVar) {
        this.f8135b = new C2508a();
        this.f8136c = new HashSet();
        this.f8134a = aVar;
    }

    /* renamed from: c */
    private boolean m10556c(Fragment fragment) {
        Fragment e = m10557e();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(e)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11091a(Fragment fragment) {
        FragmentManager b;
        this.f8139f = fragment;
        if (fragment != null && fragment.getContext() != null && (b = m10554b(fragment)) != null) {
            m10552a(fragment.getContext(), b);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager b = m10554b((Fragment) this);
        if (b != null) {
            try {
                m10552a(getContext(), b);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    /* renamed from: a */
    private void m10552a(Context context, FragmentManager fragmentManager) {
        m10558f();
        C2507n a = ComponentCallbacks2C2115c.m9149b(context).mo10360g().mo11078a(context, fragmentManager);
        this.f8137d = a;
        if (!equals(a)) {
            this.f8137d.m10553a(this);
        }
    }
}
