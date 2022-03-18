package com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.e */
public class C7472e extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private int f20155a;

    /* renamed from: b */
    private int f20156b;

    /* renamed from: c */
    private boolean f20157c;

    public C7472e(int i, int i2, boolean z) {
        this.f20155a = i;
        this.f20156b = i2;
        this.f20157c = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        if (this.f20155a > 0) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                i2 = gridLayoutManager.mo6499a().mo6534a(childAdapterPosition, this.f20155a);
                i = gridLayoutManager.mo6499a().mo6533a(childAdapterPosition);
            } else {
                i2 = childAdapterPosition % this.f20155a;
                i = 0;
            }
            if (!this.f20157c || i != this.f20155a) {
                int i3 = this.f20156b;
                rect.left = i3 - ((i2 * i3) / this.f20155a);
                rect.right = ((i2 + 1) * this.f20156b) / this.f20155a;
            } else {
                rect.left = 0;
                rect.right = 0;
            }
            if (this.f20157c || childAdapterPosition >= this.f20155a) {
                rect.top = 0;
            } else {
                rect.top = this.f20156b;
            }
            rect.bottom = this.f20156b;
            return;
        }
        rect.setEmpty();
    }
}
