package com.tonicartos.superslim;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tonicartos.superslim.LayoutManager;

/* renamed from: com.tonicartos.superslim.a */
public class C65671a {

    /* renamed from: a */
    public final RecyclerView.Recycler f165453a;

    /* renamed from: b */
    public final SparseArray<View> f165454b;

    /* renamed from: c */
    public final boolean f165455c;

    /* renamed from: d */
    private final RecyclerView.State f165456d;

    /* renamed from: a */
    public RecyclerView.State mo229902a() {
        return this.f165456d;
    }

    /* renamed from: com.tonicartos.superslim.a$a */
    public static class C65672a {

        /* renamed from: a */
        public final View f165457a;

        /* renamed from: b */
        public final boolean f165458b;

        /* renamed from: a */
        public LayoutManager.LayoutParams mo229908a() {
            return (LayoutManager.LayoutParams) this.f165457a.getLayoutParams();
        }

        public C65672a(View view, boolean z) {
            this.f165457a = view;
            this.f165458b = z;
        }
    }

    /* renamed from: b */
    public void mo229906b() {
        for (int i = 0; i < this.f165454b.size(); i++) {
            this.f165453a.recycleView(this.f165454b.valueAt(i));
        }
    }

    /* renamed from: a */
    public void mo229903a(int i) {
        this.f165454b.remove(i);
    }

    /* renamed from: b */
    public View mo229905b(int i) {
        return this.f165454b.get(i);
    }

    /* renamed from: c */
    public C65672a mo229907c(int i) {
        boolean z;
        View b = mo229905b(i);
        if (b != null) {
            z = true;
        } else {
            z = false;
        }
        if (b == null) {
            b = this.f165453a.getViewForPosition(i);
        }
        return new C65672a(b, z);
    }

    /* renamed from: a */
    public void mo229904a(int i, View view) {
        this.f165454b.put(i, view);
    }

    public C65671a(RecyclerView.LayoutManager layoutManager, RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z;
        this.f165454b = new SparseArray<>(layoutManager.getChildCount());
        this.f165456d = state;
        this.f165453a = recycler;
        if (layoutManager.getLayoutDirection() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f165455c = z;
    }
}
