package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.ComponentCallbacks2C2126g;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RequestManagerFragment extends Fragment {

    /* renamed from: a */
    private final C2490a f8106a;

    /* renamed from: b */
    private final AbstractC2505l f8107b;

    /* renamed from: c */
    private final Set<RequestManagerFragment> f8108c;

    /* renamed from: d */
    private ComponentCallbacks2C2126g f8109d;

    /* renamed from: e */
    private RequestManagerFragment f8110e;

    /* renamed from: f */
    private Fragment f8111f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2490a mo11050a() {
        return this.f8106a;
    }

    /* renamed from: b */
    public ComponentCallbacks2C2126g mo11053b() {
        return this.f8109d;
    }

    /* renamed from: c */
    public AbstractC2505l mo11054c() {
        return this.f8107b;
    }

    public void onDetach() {
        super.onDetach();
        m10486f();
    }

    public RequestManagerFragment() {
        this(new C2490a());
    }

    /* renamed from: f */
    private void m10486f() {
        RequestManagerFragment requestManagerFragment = this.f8110e;
        if (requestManagerFragment != null) {
            requestManagerFragment.m10483b(this);
            this.f8110e = null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f8106a.mo11068c();
        m10486f();
    }

    public void onStart() {
        super.onStart();
        this.f8106a.mo11064a();
    }

    public void onStop() {
        super.onStop();
        this.f8106a.mo11066b();
    }

    /* renamed from: com.bumptech.glide.manager.RequestManagerFragment$a */
    private class C2489a implements AbstractC2505l {
        public String toString() {
            return super.toString() + "{fragment=" + RequestManagerFragment.this + "}";
        }

        @Override // com.bumptech.glide.manager.AbstractC2505l
        /* renamed from: a */
        public Set<ComponentCallbacks2C2126g> mo11062a() {
            Set<RequestManagerFragment> d = RequestManagerFragment.this.mo11055d();
            HashSet hashSet = new HashSet(d.size());
            for (RequestManagerFragment requestManagerFragment : d) {
                if (requestManagerFragment.mo11053b() != null) {
                    hashSet.add(requestManagerFragment.mo11053b());
                }
            }
            return hashSet;
        }

        C2489a() {
        }
    }

    /* renamed from: e */
    private Fragment m10485e() {
        Fragment fragment;
        if (Build.VERSION.SDK_INT >= 17) {
            fragment = getParentFragment();
        } else {
            fragment = null;
        }
        if (fragment != null) {
            return fragment;
        }
        return this.f8111f;
    }

    public String toString() {
        return super.toString() + "{parent=" + m10485e() + "}";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Set<RequestManagerFragment> mo11055d() {
        if (equals(this.f8110e)) {
            return Collections.unmodifiableSet(this.f8108c);
        }
        if (this.f8110e == null || Build.VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (RequestManagerFragment requestManagerFragment : this.f8110e.mo11055d()) {
            if (m10484b(requestManagerFragment.getParentFragment())) {
                hashSet.add(requestManagerFragment);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    private void m10482a(RequestManagerFragment requestManagerFragment) {
        this.f8108c.add(requestManagerFragment);
    }

    /* renamed from: b */
    private void m10483b(RequestManagerFragment requestManagerFragment) {
        this.f8108c.remove(requestManagerFragment);
    }

    /* renamed from: a */
    public void mo11052a(ComponentCallbacks2C2126g gVar) {
        this.f8109d = gVar;
    }

    RequestManagerFragment(C2490a aVar) {
        this.f8107b = new C2489a();
        this.f8108c = new HashSet();
        this.f8106a = aVar;
    }

    /* renamed from: a */
    private void m10481a(Activity activity) {
        m10486f();
        RequestManagerFragment b = ComponentCallbacks2C2115c.m9149b(activity).mo10360g().mo11079b(activity);
        this.f8110e = b;
        if (!equals(b)) {
            this.f8110e.m10482a(this);
        }
    }

    /* renamed from: b */
    private boolean m10484b(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m10481a(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11051a(Fragment fragment) {
        this.f8111f = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m10481a(fragment.getActivity());
        }
    }
}
