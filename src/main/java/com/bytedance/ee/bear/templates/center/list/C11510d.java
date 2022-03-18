package com.bytedance.ee.bear.templates.center.list;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.util.C13655e;

/* renamed from: com.bytedance.ee.bear.templates.center.list.d */
public class C11510d extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    public static final int f30970a = C13655e.m55411a(16);

    /* renamed from: b */
    public static final int f30971b = C13655e.m55411a(32);

    /* renamed from: c */
    public static final int f30972c = C13655e.m55411a(8);

    /* renamed from: d */
    private final int f30973d;

    public C11510d(int i) {
        this.f30973d = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (!(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            return;
        }
        if (recyclerView.getChildAdapterPosition(view) % 2 == 0) {
            rect.left = f30972c;
        } else {
            rect.right = f30972c;
        }
    }
}
