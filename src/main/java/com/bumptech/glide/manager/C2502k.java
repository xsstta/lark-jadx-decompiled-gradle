package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.ComponentCallbacks2C2126g;
import com.bumptech.glide.util.C2567j;
import com.bumptech.glide.util.C2568k;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.manager.k */
public class C2502k implements Handler.Callback {

    /* renamed from: i */
    private static final AbstractC2504a f8122i = new AbstractC2504a() {
        /* class com.bumptech.glide.manager.C2502k.C25031 */

        @Override // com.bumptech.glide.manager.C2502k.AbstractC2504a
        /* renamed from: a */
        public ComponentCallbacks2C2126g mo10319a(ComponentCallbacks2C2115c cVar, AbstractC2499h hVar, AbstractC2505l lVar, Context context) {
            return new ComponentCallbacks2C2126g(cVar, hVar, lVar, context);
        }
    };

    /* renamed from: a */
    final Map<FragmentManager, RequestManagerFragment> f8123a = new HashMap();

    /* renamed from: b */
    final Map<androidx.fragment.app.FragmentManager, C2507n> f8124b = new HashMap();

    /* renamed from: c */
    private volatile ComponentCallbacks2C2126g f8125c;

    /* renamed from: d */
    private final Handler f8126d;

    /* renamed from: e */
    private final AbstractC2504a f8127e;

    /* renamed from: f */
    private final ArrayMap<View, Fragment> f8128f = new ArrayMap<>();

    /* renamed from: g */
    private final ArrayMap<View, android.app.Fragment> f8129g = new ArrayMap<>();

    /* renamed from: h */
    private final Bundle f8130h = new Bundle();

    /* renamed from: com.bumptech.glide.manager.k$a */
    public interface AbstractC2504a {
        /* renamed from: a */
        ComponentCallbacks2C2126g mo10319a(ComponentCallbacks2C2115c cVar, AbstractC2499h hVar, AbstractC2505l lVar, Context context);
    }

    /* renamed from: a */
    public ComponentCallbacks2C2126g mo11074a(Context context) {
        if (context != null) {
            if (C2568k.m10918c() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return mo11077a((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return mo11072a((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return mo11074a(contextWrapper.getBaseContext());
                    }
                }
            }
            return m10528b(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: a */
    public ComponentCallbacks2C2126g mo11077a(FragmentActivity fragmentActivity) {
        if (C2568k.m10920d()) {
            return mo11074a(fragmentActivity.getApplicationContext());
        }
        m10531c((Activity) fragmentActivity);
        return m10523a(fragmentActivity, fragmentActivity.getSupportFragmentManager(), (Fragment) null, m10532d(fragmentActivity));
    }

    /* renamed from: a */
    public ComponentCallbacks2C2126g mo11076a(Fragment fragment) {
        C2567j.m10895a(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (C2568k.m10920d()) {
            return mo11074a(fragment.getContext().getApplicationContext());
        }
        return m10523a(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    /* renamed from: a */
    public ComponentCallbacks2C2126g mo11072a(Activity activity) {
        if (C2568k.m10920d()) {
            return mo11074a(activity.getApplicationContext());
        }
        m10531c(activity);
        return m10522a(activity, activity.getFragmentManager(), (android.app.Fragment) null, m10532d(activity));
    }

    /* renamed from: a */
    public ComponentCallbacks2C2126g mo11075a(View view) {
        if (C2568k.m10920d()) {
            return mo11074a(view.getContext().getApplicationContext());
        }
        C2567j.m10894a(view);
        C2567j.m10895a(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity c = m10530c(view.getContext());
        if (c == null) {
            return mo11074a(view.getContext().getApplicationContext());
        }
        if (c instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) c;
            Fragment a = m10521a(view, fragmentActivity);
            return a != null ? mo11076a(a) : mo11077a(fragmentActivity);
        }
        android.app.Fragment a2 = m10520a(view, c);
        if (a2 == null) {
            return mo11072a(c);
        }
        return mo11073a(a2);
    }

    /* renamed from: a */
    private static void m10527a(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection != null) {
            for (Fragment fragment : collection) {
                if (!(fragment == null || fragment.getView() == null)) {
                    map.put(fragment.getView(), fragment);
                    m10527a(fragment.getChildFragmentManager().getFragments(), map);
                }
            }
        }
    }

    /* renamed from: a */
    public ComponentCallbacks2C2126g mo11073a(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (C2568k.m10920d() || Build.VERSION.SDK_INT < 17) {
            return mo11074a(fragment.getActivity().getApplicationContext());
        } else {
            return m10522a(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public RequestManagerFragment mo11079b(Activity activity) {
        return m10524a(activity.getFragmentManager(), (android.app.Fragment) null, m10532d(activity));
    }

    /* renamed from: c */
    private static Activity m10530c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m10530c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m10532d(Context context) {
        Activity c = m10530c(context);
        if (c == null || !c.isFinishing()) {
            return true;
        }
        return false;
    }

    public C2502k(AbstractC2504a aVar) {
        this.f8127e = aVar == null ? f8122i : aVar;
        this.f8126d = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: b */
    private ComponentCallbacks2C2126g m10528b(Context context) {
        if (this.f8125c == null) {
            synchronized (this) {
                if (this.f8125c == null) {
                    this.f8125c = this.f8127e.mo10319a(ComponentCallbacks2C2115c.m9149b(context.getApplicationContext()), new C2491b(), new C2498g(), context.getApplicationContext());
                }
            }
        }
        return this.f8125c;
    }

    /* renamed from: c */
    private static void m10531c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        Object obj3;
        int i = message.what;
        Object obj4 = null;
        boolean z = true;
        if (i == 1) {
            obj3 = (FragmentManager) message.obj;
            obj2 = this.f8123a.remove(obj3);
        } else if (i != 2) {
            z = false;
            obj = null;
            if (z && obj4 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
            }
            return z;
        } else {
            obj3 = (androidx.fragment.app.FragmentManager) message.obj;
            obj2 = this.f8124b.remove(obj3);
        }
        obj4 = obj2;
        obj = obj3;
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2507n mo11078a(Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        return m10525a(fragmentManager, (Fragment) null, m10532d(context));
    }

    /* renamed from: a */
    private android.app.Fragment m10520a(View view, Activity activity) {
        this.f8129g.clear();
        m10526a(activity.getFragmentManager(), this.f8129g);
        View findViewById = activity.findViewById(16908290);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f8129g.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f8129g.clear();
        return fragment;
    }

    /* renamed from: a */
    private Fragment m10521a(View view, FragmentActivity fragmentActivity) {
        this.f8128f.clear();
        m10527a(fragmentActivity.getSupportFragmentManager().getFragments(), this.f8128f);
        View findViewById = fragmentActivity.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f8128f.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f8128f.clear();
        return fragment;
    }

    /* renamed from: b */
    private void m10529b(FragmentManager fragmentManager, ArrayMap<View, android.app.Fragment> arrayMap) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.f8130h.putInt("key", i);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.f8130h, "key");
            } catch (Exception unused) {
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    arrayMap.put(fragment.getView(), fragment);
                    if (Build.VERSION.SDK_INT >= 17) {
                        m10526a(fragment.getChildFragmentManager(), arrayMap);
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m10526a(FragmentManager fragmentManager, ArrayMap<View, android.app.Fragment> arrayMap) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    arrayMap.put(fragment.getView(), fragment);
                    m10526a(fragment.getChildFragmentManager(), arrayMap);
                }
            }
            return;
        }
        m10529b(fragmentManager, arrayMap);
    }

    /* renamed from: a */
    private RequestManagerFragment m10524a(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        RequestManagerFragment requestManagerFragment = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment == null && (requestManagerFragment = this.f8123a.get(fragmentManager)) == null) {
            requestManagerFragment = new RequestManagerFragment();
            requestManagerFragment.mo11051a(fragment);
            if (z) {
                requestManagerFragment.mo11050a().mo11064a();
            }
            this.f8123a.put(fragmentManager, requestManagerFragment);
            fragmentManager.beginTransaction().add(requestManagerFragment, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f8126d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return requestManagerFragment;
    }

    /* renamed from: a */
    private C2507n m10525a(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z) {
        C2507n nVar = (C2507n) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (nVar == null && (nVar = this.f8124b.get(fragmentManager)) == null) {
            nVar = new C2507n();
            nVar.mo11091a(fragment);
            if (z) {
                nVar.mo11090a().mo11064a();
            }
            this.f8124b.put(fragmentManager, nVar);
            fragmentManager.beginTransaction().add(nVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f8126d.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return nVar;
    }

    /* renamed from: a */
    private ComponentCallbacks2C2126g m10522a(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        RequestManagerFragment a = m10524a(fragmentManager, fragment, z);
        ComponentCallbacks2C2126g b = a.mo11053b();
        if (b != null) {
            return b;
        }
        ComponentCallbacks2C2126g a2 = this.f8127e.mo10319a(ComponentCallbacks2C2115c.m9149b(context), a.mo11050a(), a.mo11054c(), context);
        a.mo11052a(a2);
        return a2;
    }

    /* renamed from: a */
    private ComponentCallbacks2C2126g m10523a(Context context, androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z) {
        C2507n a = m10525a(fragmentManager, fragment, z);
        ComponentCallbacks2C2126g b = a.mo11093b();
        if (b != null) {
            return b;
        }
        ComponentCallbacks2C2126g a2 = this.f8127e.mo10319a(ComponentCallbacks2C2115c.m9149b(context), a.mo11090a(), a.mo11094c(), context);
        a.mo11092a(a2);
        return a2;
    }
}
