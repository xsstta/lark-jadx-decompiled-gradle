package com.tt.miniapp.chooser.p3267a;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.tt.miniapp.chooser.a.c */
public class C65829c extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private int f165907a;

    /* renamed from: b */
    private int f165908b;

    public C65829c(int i, int i2) {
        this.f165908b = i;
        this.f165907a = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.left = this.f165907a;
        rect.bottom = this.f165907a;
        if (recyclerView.getChildLayoutPosition(view) % this.f165908b == 0) {
            rect.left = 0;
        }
    }
}
