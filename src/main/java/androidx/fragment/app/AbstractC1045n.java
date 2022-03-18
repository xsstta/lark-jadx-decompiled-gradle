package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.n */
public abstract class AbstractC1045n extends PagerAdapter {

    /* renamed from: a */
    private final FragmentManager f3960a;

    /* renamed from: b */
    private final int f3961b;

    /* renamed from: c */
    private FragmentTransaction f3962c;

    /* renamed from: d */
    private ArrayList<Fragment.SavedState> f3963d;

    /* renamed from: e */
    private ArrayList<Fragment> f3964e;

    /* renamed from: f */
    private Fragment f3965f;

    /* renamed from: g */
    private boolean f3966g;

    /* renamed from: a */
    public abstract Fragment mo5615a(int i);

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        Bundle bundle;
        if (this.f3963d.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f3963d.size()];
            this.f3963d.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f3964e.size(); i++) {
            Fragment fragment = this.f3964e.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f3960a.putFragment(bundle, C13998f.f36682a + i, fragment);
            }
        }
        return bundle;
    }

    public AbstractC1045n(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    /* JADX INFO: finally extract failed */
    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f3962c;
        if (fragmentTransaction != null) {
            if (!this.f3966g) {
                try {
                    this.f3966g = true;
                    fragmentTransaction.commitNowAllowingStateLoss();
                    this.f3966g = false;
                } catch (Throwable th) {
                    this.f3966g = false;
                    throw th;
                }
            }
            this.f3962c = null;
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

    public AbstractC1045n(FragmentManager fragmentManager, int i) {
        this.f3963d = new ArrayList<>();
        this.f3964e = new ArrayList<>();
        this.f3965f = null;
        this.f3960a = fragmentManager;
        this.f3961b = i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f3964e.size() > i && (fragment = this.f3964e.get(i)) != null) {
            return fragment;
        }
        if (this.f3962c == null) {
            this.f3962c = this.f3960a.beginTransaction();
        }
        Fragment a = mo5615a(i);
        if (this.f3963d.size() > i && (savedState = this.f3963d.get(i)) != null) {
            a.setInitialSavedState(savedState);
        }
        while (this.f3964e.size() <= i) {
            this.f3964e.add(null);
        }
        a.setMenuVisibility(false);
        if (this.f3961b == 0) {
            a.setUserVisibleHint(false);
        }
        this.f3964e.set(i, a);
        this.f3962c.add(viewGroup.getId(), a);
        if (this.f3961b == 1) {
            this.f3962c.setMaxLifecycle(a, Lifecycle.State.STARTED);
        }
        return a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f3963d.clear();
            this.f3964e.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f3963d.add((Fragment.SavedState) parcelable2);
                }
            }
            for (T t : bundle.keySet()) {
                if (t.startsWith(C13998f.f36682a)) {
                    int parseInt = Integer.parseInt(t.substring(1));
                    Fragment fragment = this.f3960a.getFragment(bundle, t);
                    if (fragment != null) {
                        while (this.f3964e.size() <= parseInt) {
                            this.f3964e.add(null);
                        }
                        fragment.setMenuVisibility(false);
                        this.f3964e.set(parseInt, fragment);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + ((String) t));
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment.SavedState savedState;
        Fragment fragment = (Fragment) obj;
        if (this.f3962c == null) {
            this.f3962c = this.f3960a.beginTransaction();
        }
        while (this.f3963d.size() <= i) {
            this.f3963d.add(null);
        }
        ArrayList<Fragment.SavedState> arrayList = this.f3963d;
        if (fragment.isAdded()) {
            savedState = this.f3960a.saveFragmentInstanceState(fragment);
        } else {
            savedState = null;
        }
        arrayList.set(i, savedState);
        this.f3964e.set(i, null);
        this.f3962c.remove(fragment);
        if (fragment.equals(this.f3965f)) {
            this.f3965f = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3965f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f3961b == 1) {
                    if (this.f3962c == null) {
                        this.f3962c = this.f3960a.beginTransaction();
                    }
                    this.f3962c.setMaxLifecycle(this.f3965f, Lifecycle.State.STARTED);
                } else {
                    this.f3965f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f3961b == 1) {
                if (this.f3962c == null) {
                    this.f3962c = this.f3960a.beginTransaction();
                }
                this.f3962c.setMaxLifecycle(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f3965f = fragment;
        }
    }
}
