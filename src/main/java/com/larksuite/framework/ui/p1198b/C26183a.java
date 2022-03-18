package com.larksuite.framework.ui.p1198b;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.larksuite.framework.ui.b.a */
public class C26183a extends C26198f {
    public C26183a(AbstractC26197e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    private void m94715a(Canvas canvas, RecyclerView recyclerView) {
        boolean a;
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1 && ((a = this.f64685e.mo93168a(childAt, this.f64684d.mo93174a(recyclerView), childAdapterPosition)) || this.f64685e.mo93167a(childAdapterPosition, this.f64684d.mo93175b(recyclerView)))) {
                View a2 = this.f64683c.mo93161a(recyclerView, childAdapterPosition);
                boolean a3 = this.f64685e.mo93169a(recyclerView, childAt, a2, this.f64684d.mo93174a(recyclerView));
                int height = a2.getHeight();
                if (a3) {
                    Rect rect = new Rect();
                    this.f64685e.mo93166a(rect, recyclerView, a2, childAt, a);
                    Log.d("headerAnim", "position: " + childAdapterPosition + " outRect: " + rect.toString());
                    this.f64686f.mo93172a(recyclerView, canvas, a2, new Rect(paddingLeft, rect.top, width, rect.top + height));
                } else {
                    int top = (childAt.getTop() - ((RecyclerView.LayoutParams) childAt.getLayoutParams()).topMargin) + ((int) (childAt.getTranslationY() + 0.5f));
                    this.f64686f.mo93172a(recyclerView, canvas, a2, new Rect(paddingLeft, top - height, width, top));
                }
            }
        }
    }

    @Override // com.larksuite.framework.ui.p1198b.C26198f, androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (recyclerView.getItemAnimator() == null || !recyclerView.getItemAnimator().isRunning()) {
            super.onDrawOver(canvas, recyclerView, state);
        } else {
            m94715a(canvas, recyclerView);
        }
    }
}
