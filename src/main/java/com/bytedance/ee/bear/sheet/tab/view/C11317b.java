package com.bytedance.ee.bear.sheet.tab.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.sheet.tab.jsdata.SheetTabItem;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.p1237d.C27144b;

/* renamed from: com.bytedance.ee.bear.sheet.tab.view.b */
public class C11317b extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private static final int[] f30436a = {16843284};

    /* renamed from: b */
    private Drawable f30437b;

    /* renamed from: c */
    private Context f30438c;

    public C11317b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f30436a);
        this.f30437b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.f30438c = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        boolean z = false;
        for (int childCount = recyclerView.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = recyclerView.getChildAt(childCount);
            int right = childAt.getRight() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).rightMargin + Math.round(childAt.getTranslationX());
            int intrinsicHeight = this.f30437b.getIntrinsicHeight() + right;
            if (((SheetTabItem) childAt.getTag()).getSelected()) {
                this.f30437b.setBounds(right, paddingTop, intrinsicHeight, height);
                this.f30437b.setColorFilter(this.f30438c.getResources().getColor(R.color.sheet_tab_item_divider_selected), PorterDuff.Mode.SRC);
                this.f30437b.draw(canvas);
                z = true;
            } else if (z) {
                this.f30437b.setBounds(right, paddingTop, intrinsicHeight, height);
                this.f30437b.setColorFilter(this.f30438c.getResources().getColor(R.color.sheet_tab_item_divider_selected), PorterDuff.Mode.SRC);
                this.f30437b.draw(canvas);
                z = false;
            } else {
                this.f30437b.setBounds(right, C27144b.m98678a(4.0f) + paddingTop, intrinsicHeight, height - C27144b.m98678a(4.0f));
                this.f30437b.setColorFilter(this.f30438c.getResources().getColor(R.color.line_divider_default), PorterDuff.Mode.SRC);
                this.f30437b.draw(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.set(0, 0, this.f30437b.getIntrinsicWidth(), 0);
    }
}
