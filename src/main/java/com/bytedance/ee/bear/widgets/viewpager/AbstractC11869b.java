package com.bytedance.ee.bear.widgets.viewpager;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.bytedance.ee.bear.widgets.viewpager.b */
public abstract class AbstractC11869b {

    /* renamed from: a */
    private final DataSetObservable f32128a = new DataSetObservable();

    /* renamed from: b */
    private DataSetObserver f32129b;

    /* renamed from: a */
    public abstract int mo18476a();

    /* renamed from: a */
    public int mo18477a(Object obj) {
        return -1;
    }

    /* renamed from: a */
    public void mo45584a(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: a */
    public void mo45585a(View view) {
    }

    /* renamed from: a */
    public abstract boolean mo18482a(View view, Object obj);

    /* renamed from: b */
    public void mo45588b(View view) {
    }

    /* renamed from: b */
    public void mo45589b(View view, int i, Object obj) {
    }

    /* renamed from: c */
    public float mo45591c(int i) {
        return 1.0f;
    }

    /* renamed from: e */
    public Parcelable mo45592e() {
        return null;
    }

    /* renamed from: c */
    public void mo34842c() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f32129b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f32128a.notifyChanged();
    }

    /* renamed from: b */
    public void mo45590b(ViewGroup viewGroup) {
        mo45588b((View) viewGroup);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo45583a(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f32129b = dataSetObserver;
        }
    }

    /* renamed from: a */
    public void mo45587a(ViewGroup viewGroup) {
        mo45585a((View) viewGroup);
    }

    /* renamed from: a */
    public Object mo45582a(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* renamed from: a */
    public Object mo18478a(ViewGroup viewGroup, int i) {
        return mo45582a((View) viewGroup, i);
    }

    /* renamed from: b */
    public void mo18483b(ViewGroup viewGroup, int i, Object obj) {
        mo45589b((View) viewGroup, i, obj);
    }

    /* renamed from: a */
    public void mo45586a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: a */
    public void mo18479a(ViewGroup viewGroup, int i, Object obj) {
        mo45586a((View) viewGroup, i, obj);
    }
}
