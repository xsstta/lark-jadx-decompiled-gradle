package com.lynx.tasm.behavior.ui.list;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public final class ListLayoutManager {
    /* renamed from: a */
    private static int m97229a(int i, int i2, int i3, int i4) {
        int i5 = i - i2;
        if (i5 <= 0) {
            return 0;
        }
        int i6 = i4 + i3;
        int i7 = i5 - i6;
        if (i7 >= 0) {
            return i3;
        }
        return i3 + ((int) (((double) i7) * (((double) i3) / ((double) i6))));
    }

    public static class ListGridLayoutManager extends GridLayoutManager {

        /* renamed from: i */
        private UIList f66417i;

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
        public boolean canScrollVertically() {
            if (!this.f66417i.f66424d) {
                return false;
            }
            return super.canScrollVertically();
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
        public void onLayoutCompleted(RecyclerView.State state) {
            super.onLayoutCompleted(state);
            this.f66417i.aH();
        }

        public ListGridLayoutManager(Context context, int i, UIList uIList) {
            super(context, i);
            this.f66417i = uIList;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
        public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
            int scrollVerticallyBy = super.scrollVerticallyBy(i, recycler, state);
            this.f66417i.f66423c.mo95293a(i, scrollVerticallyBy);
            return scrollVerticallyBy;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            if (((GridLayoutManager.LayoutParams) view.getLayoutParams()).mo6532b() != mo6502b()) {
                super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
            } else {
                ListLayoutManager.m97230a(this, view, i2, i4);
            }
        }
    }

    public static class ListLinearLayoutManager extends LinearLayoutManager {

        /* renamed from: a */
        private UIList f66418a;

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
        public boolean canScrollVertically() {
            if (!this.f66418a.f66424d) {
                return false;
            }
            return super.canScrollVertically();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
        public void onLayoutCompleted(RecyclerView.State state) {
            super.onLayoutCompleted(state);
            this.f66418a.aH();
        }

        public ListLinearLayoutManager(Context context, UIList uIList) {
            super(context);
            this.f66418a = uIList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
        public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
            int scrollVerticallyBy = super.scrollVerticallyBy(i, recycler, state);
            this.f66418a.f66423c.mo95293a(i, scrollVerticallyBy);
            return scrollVerticallyBy;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            if (!this.f66418a.mo53307k().mo95329a(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewAdapterPosition())) {
                super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
            } else {
                ListLayoutManager.m97230a(this, view, i2, i4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.ListLayoutManager$a */
    public static class C26786a extends StaggeredGridLayoutManager {

        /* renamed from: i */
        private UIList f66419i;

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager
        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager
        public boolean canScrollVertically() {
            if (!this.f66419i.f66424d) {
                return false;
            }
            return super.canScrollVertically();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager
        public void onLayoutCompleted(RecyclerView.State state) {
            super.onLayoutCompleted(state);
            this.f66419i.aH();
        }

        public C26786a(int i, int i2, UIList uIList) {
            super(i, i2);
            this.f66419i = uIList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager
        public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
            int scrollVerticallyBy = super.scrollVerticallyBy(i, recycler, state);
            this.f66419i.f66423c.mo95293a(i, scrollVerticallyBy);
            return scrollVerticallyBy;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            if (!((StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams()).mo7275a()) {
                super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
            } else {
                ListLayoutManager.m97230a(this, view, i2, i4);
            }
        }
    }

    /* renamed from: a */
    public static void m97230a(RecyclerView.LayoutManager layoutManager, View view, int i, int i2) {
        int a = m97229a(layoutManager.getWidth(), view.getMeasuredWidth(), layoutManager.getPaddingLeft(), layoutManager.getPaddingRight());
        view.layout(a, i, view.getMeasuredWidth() + a, i2);
    }
}
