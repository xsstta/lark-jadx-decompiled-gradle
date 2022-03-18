package com.bytedance.ee.bear.bizwidget.shareview;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.bizwidget.shareview.c */
public class C4886c extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private final int f14384a = C13749l.m55738a(12);

    /* renamed from: b */
    private final int f14385b = C13749l.m55738a(4);

    /* renamed from: c */
    private Context f14386c;

    /* renamed from: d */
    private RecyclerView.LayoutManager f14387d;

    public C4886c(Context context, RecyclerView.LayoutManager layoutManager) {
        this.f14386c = context;
        this.f14387d = layoutManager;
    }

    /* renamed from: a */
    private int m20146a(View view, int i, int i2) {
        view.measure(0, 0);
        int measuredWidth = view.getMeasuredWidth();
        int i3 = i2 + i;
        if (measuredWidth <= i) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = Math.min(measuredWidth, i3);
        int i4 = layoutParams.width - i;
        view.setLayoutParams(layoutParams);
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        if (recyclerView.getAdapter() instanceof C4882b) {
            if (C13749l.m55763g(this.f14386c)) {
                i = C13749l.m55751b(this.f14386c).widthPixels;
            } else {
                i = C13749l.m55736a();
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int dimensionPixelSize = this.f14386c.getResources().getDimensionPixelSize(R.dimen.external_share_item_width);
            RecyclerView.LayoutManager layoutManager = this.f14387d;
            if (layoutManager instanceof GridLayoutManager) {
                int b = ((GridLayoutManager) layoutManager).mo6502b();
                int i4 = (i - (dimensionPixelSize * b)) / (b + 1);
                int i5 = childAdapterPosition % b;
                int a = m20146a(view, dimensionPixelSize, i4) / 2;
                rect.left = (((b - i5) * i4) / b) - a;
                rect.right = (((i5 + 1) * i4) / b) - a;
            } else if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).getOrientation() == 0) {
                int itemCount = ((C4882b) recyclerView.getAdapter()).getItemCount();
                if (childAdapterPosition == 0) {
                    i2 = this.f14384a;
                } else {
                    i2 = this.f14385b;
                }
                rect.left = i2;
                if (childAdapterPosition == itemCount - 1) {
                    i3 = this.f14384a;
                } else {
                    i3 = 0;
                }
                rect.right = i3;
            }
        }
    }
}
