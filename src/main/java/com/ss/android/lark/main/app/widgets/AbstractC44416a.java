package com.ss.android.lark.main.app.widgets;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.lark.main.app.widgets.a */
public abstract class AbstractC44416a<T> extends PagerAdapter {

    /* renamed from: a */
    private final FragmentManager f112718a;

    /* renamed from: b */
    private FragmentTransaction f112719b;

    /* renamed from: c */
    private ArrayList<C44418b> f112720c = new ArrayList<>();

    /* renamed from: d */
    private ArrayList<C44417a<T>> f112721d = new ArrayList<>();

    /* renamed from: e */
    private Fragment f112722e = null;

    /* renamed from: f */
    private boolean f112723f = false;

    /* renamed from: com.ss.android.lark.main.app.widgets.a$b */
    protected static class C44418b {

        /* renamed from: a */
        Fragment.SavedState f112727a;

        /* renamed from: b */
        Class<? extends Fragment> f112728b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo157782a(T t);

    /* renamed from: a */
    public abstract Fragment mo157783a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo157784a(T t, T t2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo157785b(int i);

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        mo157813a();
    }

    /* renamed from: a */
    private void mo157813a() {
        if (this.f112723f) {
            this.f112723f = false;
            ArrayList<C44417a<T>> arrayList = new ArrayList<>(this.f112721d.size());
            for (int i = 0; i < this.f112721d.size(); i++) {
                arrayList.add(null);
            }
            Iterator<C44417a<T>> it = this.f112721d.iterator();
            while (it.hasNext()) {
                C44417a<T> next = it.next();
                if (next != null && next.f112726c >= 0) {
                    while (arrayList.size() <= next.f112726c) {
                        arrayList.add(null);
                    }
                    arrayList.set(next.f112726c, next);
                }
            }
            this.f112721d = arrayList;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f112719b;
        if (fragmentTransaction != null) {
            fragmentTransaction.commitNowAllowingStateLoss();
            this.f112719b = null;
        }
    }

    public AbstractC44416a(FragmentManager fragmentManager) {
        this.f112718a = fragmentManager;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        this.f112723f = true;
        C44417a aVar = (C44417a) obj;
        int indexOf = this.f112721d.indexOf(aVar);
        if (indexOf < 0) {
            return -1;
        }
        D d = aVar.f112725b;
        if (mo157784a(d, mo157785b(indexOf))) {
            return -1;
        }
        C44417a<T> aVar2 = this.f112721d.get(indexOf);
        int a = mo157782a(d);
        if (a < 0) {
            a = -2;
        }
        if (aVar2 != null) {
            aVar2.f112726c = a;
        }
        return a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        if (((C44417a) obj).f112724a.getView() == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        C44418b bVar;
        C44417a<T> aVar;
        if (this.f112721d.size() > i && (aVar = this.f112721d.get(i)) != null) {
            return aVar;
        }
        if (this.f112719b == null) {
            this.f112719b = this.f112718a.beginTransaction();
        }
        Fragment a = mo157783a(i);
        if (a == null) {
            Log.m165383e("FragmentStatePagerAdapt", "fragment is null, position = " + i + " ,item count = " + getCount());
        }
        if (this.f112720c.size() > i && (bVar = this.f112720c.get(i)) != null && bVar.f112727a != null && bVar.f112728b == a.getClass()) {
            a.setInitialSavedState(bVar.f112727a);
        }
        while (this.f112721d.size() <= i) {
            this.f112721d.add(null);
        }
        a.setMenuVisibility(false);
        a.setUserVisibleHint(false);
        C44417a<T> aVar2 = new C44417a<>(a, mo157785b(i), i);
        this.f112721d.set(i, aVar2);
        this.f112719b.add(viewGroup.getId(), a);
        return aVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.lark.main.app.widgets.a$a */
    public static class C44417a<D> {

        /* renamed from: a */
        Fragment f112724a;

        /* renamed from: b */
        D f112725b;

        /* renamed from: c */
        int f112726c;

        public C44417a(Fragment fragment, D d, int i) {
            this.f112724a = fragment;
            this.f112725b = d;
            this.f112726c = i;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C44417a aVar = (C44417a) obj;
        if (this.f112719b == null) {
            this.f112719b = this.f112718a.beginTransaction();
        }
        this.f112721d.set(i, null);
        this.f112719b.remove(aVar.f112724a);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = ((C44417a) obj).f112724a;
        Fragment fragment2 = this.f112722e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f112722e.setUserVisibleHint(false);
                View view = this.f112722e.getView();
                if (view != null) {
                    view.dispatchDisplayHint(4);
                }
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                try {
                    fragment.setUserVisibleHint(true);
                } catch (Exception unused) {
                }
                View view2 = fragment.getView();
                if (view2 != null) {
                    view2.dispatchDisplayHint(0);
                }
            }
            this.f112722e = fragment;
        }
    }
}
