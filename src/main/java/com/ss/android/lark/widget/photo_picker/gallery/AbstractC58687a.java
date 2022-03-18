package com.ss.android.lark.widget.photo_picker.gallery;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.a */
public abstract class AbstractC58687a<T> extends PagerAdapter {

    /* renamed from: a */
    private final FragmentManager f145027a;

    /* renamed from: b */
    private FragmentTransaction f145028b;

    /* renamed from: c */
    private ArrayList<Fragment.SavedState> f145029c = new ArrayList<>();

    /* renamed from: d */
    private ArrayList<C58688a<T>> f145030d = new ArrayList<>();

    /* renamed from: e */
    private Fragment f145031e = null;

    /* renamed from: f */
    private boolean f145032f = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo199038a(T t);

    /* renamed from: a */
    public abstract Fragment mo199039a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo199040a(T t, T t2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo199042c(int i);

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        mo199121a();
    }

    /* renamed from: a */
    private void mo199121a() {
        if (this.f145032f) {
            this.f145032f = false;
            ArrayList<C58688a<T>> arrayList = new ArrayList<>(this.f145030d.size());
            for (int i = 0; i < this.f145030d.size(); i++) {
                arrayList.add(null);
            }
            Iterator<C58688a<T>> it = this.f145030d.iterator();
            while (it.hasNext()) {
                C58688a<T> next = it.next();
                if (next != null && next.f145035c >= 0) {
                    while (arrayList.size() <= next.f145035c) {
                        arrayList.add(null);
                    }
                    arrayList.set(next.f145035c, next);
                }
            }
            this.f145030d = arrayList;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f145028b;
        if (fragmentTransaction != null) {
            fragmentTransaction.commitNowAllowingStateLoss();
            this.f145028b = null;
        }
    }

    public AbstractC58687a(FragmentManager fragmentManager) {
        this.f145027a = fragmentManager;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Fragment mo199041b(int i) {
        if (i < 0 || i >= this.f145030d.size()) {
            return null;
        }
        return this.f145030d.get(i).f145033a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        this.f145032f = true;
        C58688a aVar = (C58688a) obj;
        int indexOf = this.f145030d.indexOf(aVar);
        if (indexOf < 0) {
            return -1;
        }
        D d = aVar.f145034b;
        if (mo199040a(d, mo199042c(indexOf))) {
            return -1;
        }
        C58688a<T> aVar2 = this.f145030d.get(indexOf);
        int a = mo199038a(d);
        if (a < 0) {
            a = -2;
        }
        if (aVar2 != null) {
            aVar2.f145035c = a;
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
        if (((C58688a) obj).f145033a.getView() == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        C58688a<T> aVar;
        if (this.f145030d.size() > i && (aVar = this.f145030d.get(i)) != null) {
            if (aVar.f145035c == i) {
                return aVar;
            }
            mo199121a();
        }
        if (this.f145028b == null) {
            this.f145028b = this.f145027a.beginTransaction();
        }
        Fragment a = mo199039a(i);
        if (this.f145029c.size() > i && (savedState = this.f145029c.get(i)) != null) {
            a.setInitialSavedState(savedState);
        }
        while (this.f145030d.size() <= i) {
            this.f145030d.add(null);
        }
        a.setMenuVisibility(false);
        a.setUserVisibleHint(false);
        C58688a<T> aVar2 = new C58688a<>(a, mo199042c(i), i);
        this.f145030d.set(i, aVar2);
        this.f145028b.add(viewGroup.getId(), a);
        return aVar2;
    }

    /* renamed from: a */
    private void m227728a(int i, Object obj) {
        Fragment.SavedState savedState;
        C58688a aVar = (C58688a) obj;
        if (this.f145028b == null) {
            this.f145028b = this.f145027a.beginTransaction();
        }
        while (this.f145029c.size() <= i) {
            this.f145029c.add(null);
        }
        ArrayList<Fragment.SavedState> arrayList = this.f145029c;
        if (aVar.f145033a.isAdded()) {
            savedState = this.f145027a.saveFragmentInstanceState(aVar.f145033a);
        } else {
            savedState = null;
        }
        arrayList.set(i, savedState);
        this.f145030d.set(i, null);
        this.f145028b.remove(aVar.f145033a);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        m227729a(viewGroup, i, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.a$a */
    public static class C58688a<D> {

        /* renamed from: a */
        Fragment f145033a;

        /* renamed from: b */
        D f145034b;

        /* renamed from: c */
        int f145035c;

        public C58688a(Fragment fragment, D d, int i) {
            this.f145033a = fragment;
            this.f145034b = d;
            this.f145035c = i;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = ((C58688a) obj).f145033a;
        Fragment fragment2 = this.f145031e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f145031e.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f145031e = fragment;
        }
    }

    /* renamed from: a */
    private void m227729a(ViewGroup viewGroup, int i, Object obj) {
        if (i >= this.f145030d.size()) {
            StringBuilder sb = new StringBuilder("safeClearFragment: Out Of Bounds！！");
            sb.append(" ");
            if (obj != null && (obj instanceof C58688a)) {
                sb.append("object position: ");
                sb.append(((C58688a) obj).f145035c);
            }
            Log.m165387e("FragmentStatePagerAdapt", (Throwable) new Exception(sb.toString()), true);
            while (this.f145030d.size() <= i) {
                this.f145030d.add(null);
            }
            Iterator<C58688a<T>> it = this.f145030d.iterator();
            while (it.hasNext()) {
                C58688a<T> next = it.next();
                if (next != null) {
                    int a = mo199038a(next.f145034b);
                    if (a < 0) {
                        a = -2;
                    }
                    next.f145035c = a;
                }
            }
            mo199121a();
            int indexOf = this.f145030d.indexOf(obj);
            if (indexOf >= 0) {
                this.f145030d.set(indexOf, null);
            }
        }
        m227728a(i, obj);
    }
}
