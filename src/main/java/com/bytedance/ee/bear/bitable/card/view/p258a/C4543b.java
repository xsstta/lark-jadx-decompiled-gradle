package com.bytedance.ee.bear.bitable.card.view.p258a;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.a.b */
public class C4543b extends RecyclerView.AbstractC1335d {
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Context context = view.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.bitable_cell_horizon_margin);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.bitable_cell_vertical_margin);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.bitable_cell_bottom_margin);
        boolean z = true;
        if (recyclerView.getChildAdapterPosition(view) != recyclerView.getAdapter().getItemCount() - 1) {
            z = false;
        }
        if (z) {
            dimensionPixelSize2 = 0;
        }
        if (!z) {
            dimensionPixelSize3 = 0;
        }
        rect.set(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
    }
}
