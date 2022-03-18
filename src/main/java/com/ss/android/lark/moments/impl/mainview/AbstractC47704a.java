package com.ss.android.lark.moments.impl.mainview;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.moments.impl.mainview.a */
public abstract class AbstractC47704a extends PagerAdapter {

    /* renamed from: a */
    public ArrayList<Fragment> f120218a = new ArrayList<>();

    /* renamed from: b */
    private final FragmentManager f120219b;

    /* renamed from: c */
    private final int f120220c;

    /* renamed from: d */
    private FragmentTransaction f120221d;

    /* renamed from: e */
    private Fragment f120222e = null;

    /* renamed from: f */
    private boolean f120223f;

    /* renamed from: a */
    public abstract Fragment mo167345a(int i);

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f120221d;
        if (fragmentTransaction != null) {
            if (!this.f120223f) {
                try {
                    this.f120223f = true;
                    fragmentTransaction.commitNowAllowingStateLoss();
                } catch (Exception e) {
                    Log.m165384e("FragmentStatePagerAdapt", "FragmentStatePagerAdapter finishUpdate exception", e);
                } catch (Throwable th) {
                    this.f120223f = false;
                    throw th;
                }
                this.f120223f = false;
            }
            this.f120221d = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    public AbstractC47704a(FragmentManager fragmentManager, int i) {
        this.f120219b = fragmentManager;
        this.f120220c = i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Fragment fragment;
        if (this.f120218a.size() > i && (fragment = this.f120218a.get(i)) != null) {
            return fragment;
        }
        if (this.f120221d == null) {
            this.f120221d = this.f120219b.beginTransaction();
        }
        Fragment a = mo167345a(i);
        while (this.f120218a.size() <= i) {
            this.f120218a.add(null);
        }
        a.setMenuVisibility(false);
        if (this.f120220c == 0) {
            a.setUserVisibleHint(false);
        }
        this.f120218a.set(i, a);
        this.f120221d.add(viewGroup.getId(), a);
        if (this.f120220c == 1) {
            this.f120221d.setMaxLifecycle(a, Lifecycle.State.STARTED);
        }
        return a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f120221d == null) {
            this.f120221d = this.f120219b.beginTransaction();
        }
        this.f120218a.set(i, null);
        this.f120221d.remove(fragment);
        if (fragment.equals(this.f120222e)) {
            this.f120222e = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f120222e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f120220c == 1) {
                    if (this.f120221d == null) {
                        this.f120221d = this.f120219b.beginTransaction();
                    }
                    this.f120221d.setMaxLifecycle(this.f120222e, Lifecycle.State.STARTED);
                } else {
                    this.f120222e.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f120220c == 1) {
                if (this.f120221d == null) {
                    this.f120221d = this.f120219b.beginTransaction();
                }
                this.f120221d.setMaxLifecycle(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f120222e = fragment;
        }
    }
}
