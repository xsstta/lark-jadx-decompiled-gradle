package com.bytedance.ee.bear.list.sort;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.util.p718t.C13749l;

/* renamed from: com.bytedance.ee.bear.list.sort.d */
public class C8759d extends RecyclerView.AbstractC1335d {
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (!(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            return;
        }
        if (recyclerView.getChildAdapterPosition(view) % 2 == 0) {
            rect.set(0, C13749l.m55738a(12), C13749l.m55738a(6), 0);
        } else {
            rect.set(C13749l.m55738a(6), C13749l.m55738a(12), 0, 0);
        }
    }
}
