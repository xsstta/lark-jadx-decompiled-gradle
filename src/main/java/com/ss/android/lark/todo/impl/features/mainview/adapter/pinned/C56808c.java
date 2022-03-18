package com.ss.android.lark.todo.impl.features.mainview.adapter.pinned;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: com.ss.android.lark.todo.impl.features.mainview.adapter.pinned.c */
public class C56808c extends RecyclerView.AbstractC1335d implements AbstractC56807a {

    /* renamed from: a */
    private Rect f140265a;

    /* renamed from: b */
    private int f140266b = -1;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.adapter.pinned.AbstractC56807a
    /* renamed from: a */
    public Rect mo193132a() {
        return this.f140265a;
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.adapter.pinned.AbstractC56807a
    /* renamed from: b */
    public int mo193133b() {
        return this.f140266b;
    }

    /* renamed from: a */
    private int m220751a(int i, PinnedHeaderAdapter bVar) {
        while (i >= 0) {
            if (bVar.mo191818b(i)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* renamed from: a */
    private void m220752a(View view, RecyclerView recyclerView) {
        int i;
        if (view.isLayoutRequested()) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "PinnedHeaderItemDecoration");
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((recyclerView.getMeasuredWidth() - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824);
            if (layoutParams.height > 0) {
                i = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                i = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(makeMeasureSpec, i);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int top;
        int height;
        super.onDrawOver(canvas, recyclerView, state);
        if ((recyclerView.getAdapter() instanceof PinnedHeaderAdapter) && recyclerView.getChildCount() > 0) {
            PinnedHeaderAdapter bVar = (PinnedHeaderAdapter) recyclerView.getAdapter();
            int a = m220751a(recyclerView.getChildAdapterPosition(recyclerView.getChildAt(0)), bVar);
            this.f140266b = a;
            if (a != -1) {
                RecyclerView.ViewHolder onCreateViewHolder = bVar.onCreateViewHolder(recyclerView, bVar.getItemViewType(a));
                bVar.onBindViewHolder(onCreateViewHolder, a);
                View view = onCreateViewHolder.itemView;
                m220752a(view, recyclerView);
                int i = 0;
                for (int i2 = 0; i2 < recyclerView.getChildCount(); i2++) {
                    if (bVar.mo191818b(recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i2))) && (top = recyclerView.getChildAt(i2).getTop()) < (height = view.getHeight()) && top > 0) {
                        i = top - height;
                    }
                }
                int save = canvas.save();
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "PinnedHeaderItemDecoration");
                canvas.translate((float) layoutParams.leftMargin, (float) i);
                canvas.clipRect(0, 0, recyclerView.getWidth(), view.getMeasuredHeight());
                view.draw(canvas);
                canvas.restoreToCount(save);
                if (this.f140265a == null) {
                    this.f140265a = new Rect();
                }
                this.f140265a.set(0, 0, recyclerView.getWidth(), view.getMeasuredHeight() + i);
                return;
            }
            this.f140265a = null;
        }
    }
}
