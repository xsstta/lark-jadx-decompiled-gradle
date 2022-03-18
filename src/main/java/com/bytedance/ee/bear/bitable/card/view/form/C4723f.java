package com.bytedance.ee.bear.bitable.card.view.form;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.form.f */
public class C4723f extends RecyclerView.AbstractC1335d {
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        int itemViewType = recyclerView.getChildViewHolder(view).getItemViewType();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        Context context = view.getContext();
        if (itemViewType == -2) {
            i2 = 0;
        } else {
            if (itemViewType == -3) {
                i = context.getResources().getDimensionPixelSize(R.dimen.bitable_form_footer_vertical_margin);
                i2 = context.getResources().getDimensionPixelSize(R.dimen.bitable_form_horizon_margin);
            } else if (childAdapterPosition == 1) {
                i2 = context.getResources().getDimensionPixelSize(R.dimen.bitable_form_horizon_margin);
            } else {
                i = context.getResources().getDimensionPixelSize(R.dimen.bitable_form_vertical_margin);
                i2 = context.getResources().getDimensionPixelSize(R.dimen.bitable_form_horizon_margin);
            }
            rect.set(i2, i, i2, 0);
        }
        i = 0;
        rect.set(i2, i, i2, 0);
    }
}
