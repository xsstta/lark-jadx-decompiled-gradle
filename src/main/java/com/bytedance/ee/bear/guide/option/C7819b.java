package com.bytedance.ee.bear.guide.option;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.util.p718t.C13749l;

/* renamed from: com.bytedance.ee.bear.guide.option.b */
public class C7819b extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private static final int f21125a = C13749l.m55738a(4);

    /* renamed from: b */
    private static final int f21126b = C13749l.m55738a(16);

    /* renamed from: c */
    private static final int f21127c = C13749l.m55738a(48);

    /* renamed from: d */
    private static final int f21128d = C13749l.m55738a(66);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        if (recyclerView.getAdapter() != null && (recyclerView.getParent() instanceof View)) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int itemCount = recyclerView.getAdapter().getItemCount();
            int i2 = f21125a;
            rect.top = i2;
            if (childAdapterPosition == itemCount - 1) {
                i = f21126b;
            } else {
                i = i2;
            }
            rect.bottom = i;
            View view2 = (View) recyclerView.getParent();
            if (view2.getHeight() != 0) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = Math.min(Math.max(((view2.getHeight() - (i2 * ((itemCount * 2) - 1))) - f21126b) / itemCount, f21127c), f21128d);
                view.setLayoutParams(layoutParams);
            }
        }
    }
}
