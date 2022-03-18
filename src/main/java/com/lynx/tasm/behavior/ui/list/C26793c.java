package com.lynx.tasm.behavior.ui.list;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.list.C26799e;
import java.lang.ref.WeakReference;

/* renamed from: com.lynx.tasm.behavior.ui.list.c */
public class C26793c {

    /* renamed from: a */
    public static int f66462a = 80;

    /* renamed from: b */
    public static int f66463b = 3;

    /* renamed from: c */
    private static int f66464c = -1;

    /* renamed from: d */
    private static int f66465d = 1;

    /* renamed from: e */
    private final RecyclerView f66466e;

    /* renamed from: f */
    private RunnableC26794a f66467f;

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.c$a */
    public static class RunnableC26794a implements Runnable {

        /* renamed from: a */
        public boolean f66468a = false;

        /* renamed from: b */
        private WeakReference<RecyclerView> f66469b;

        /* renamed from: c */
        private int f66470c;

        /* renamed from: d */
        private String f66471d;

        /* renamed from: e */
        private int f66472e;

        /* renamed from: f */
        private int f66473f;

        /* renamed from: g */
        private int f66474g;

        /* renamed from: h */
        private View f66475h = null;

        public void run() {
            RecyclerView recyclerView = this.f66469b.get();
            if (recyclerView == null || recyclerView.getLayoutManager() == null || recyclerView.getChildCount() == 0) {
                this.f66468a = false;
            } else if (m97277a(recyclerView)) {
                recyclerView.post(this);
            } else {
                this.f66468a = false;
            }
        }

        RunnableC26794a(RecyclerView recyclerView) {
            this.f66469b = new WeakReference<>(recyclerView);
        }

        /* renamed from: c */
        private boolean m97279c(RecyclerView recyclerView) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((C26799e.C26800a) recyclerView.getChildAt(i)).f66488a != 3) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        private void m97280d(RecyclerView recyclerView) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            int childCount = recyclerView.getChildCount();
            this.f66473f = layoutManager.getItemCount();
            this.f66474g = 0;
            for (int i = 0; i < childCount; i++) {
                C26799e.C26800a aVar = (C26799e.C26800a) recyclerView.getChildAt(i);
                int viewLayoutPosition = ((RecyclerView.LayoutParams) aVar.getLayoutParams()).getViewLayoutPosition();
                this.f66474g = Math.max(viewLayoutPosition, this.f66474g);
                this.f66473f = Math.min(viewLayoutPosition, this.f66473f);
                if (viewLayoutPosition == this.f66470c) {
                    this.f66475h = aVar;
                    return;
                }
            }
        }

        /* renamed from: a */
        private boolean m97277a(RecyclerView recyclerView) {
            int i;
            int min = Math.min(this.f66470c, recyclerView.getLayoutManager().getItemCount() - 1);
            this.f66470c = min;
            this.f66470c = Math.max(min, 0);
            if (!m97279c(recyclerView)) {
                return true;
            }
            m97280d(recyclerView);
            if (this.f66475h == null) {
                int i2 = this.f66473f;
                int i3 = this.f66470c;
                if (i2 > i3) {
                    i = m97276a(recyclerView, i2 - i3) * -1;
                } else {
                    int i4 = this.f66474g;
                    if (i4 >= i3) {
                        return false;
                    }
                    i = m97276a(recyclerView, i3 - i4);
                }
                return C26793c.m97272a(recyclerView, i);
            }
            int b = m97278b(recyclerView);
            if (b == 0) {
                return false;
            }
            int min2 = Math.min(Math.max(Math.abs(b) / C26793c.f66463b, 1), C26793c.f66462a);
            if (b <= 0) {
                min2 = -min2;
            }
            return C26793c.m97272a(recyclerView, min2);
        }

        /* renamed from: b */
        private int m97278b(RecyclerView recyclerView) {
            if (this.f66475h == null) {
                return 0;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            int decoratedTop = layoutManager.getDecoratedTop(this.f66475h);
            int decoratedMeasuredHeight = layoutManager.getDecoratedMeasuredHeight(this.f66475h);
            int height = (layoutManager.getHeight() - layoutManager.getPaddingTop()) - layoutManager.getPaddingBottom();
            if (TextUtils.equals(this.f66471d, "middle")) {
                return decoratedTop - ((this.f66472e + layoutManager.getPaddingTop()) + ((height - decoratedMeasuredHeight) / 2));
            }
            if (TextUtils.equals(this.f66471d, "bottom")) {
                return decoratedTop - (((this.f66472e + layoutManager.getPaddingTop()) + height) - decoratedMeasuredHeight);
            }
            return decoratedTop - (this.f66472e + layoutManager.getPaddingTop());
        }

        /* renamed from: a */
        private int m97276a(RecyclerView recyclerView, int i) {
            int measuredHeight = recyclerView.getMeasuredHeight();
            if (i > 5) {
                return Math.min(measuredHeight, C26793c.f66462a * 5);
            }
            return Math.min(measuredHeight, C26793c.f66462a * i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo95305a(int i, String str, int i2) {
            RecyclerView recyclerView = this.f66469b.get();
            if (recyclerView == null || recyclerView.getLayoutManager() == null || recyclerView.getChildCount() == 0) {
                this.f66468a = false;
                return;
            }
            this.f66470c = i;
            this.f66471d = str;
            this.f66472e = i2;
            this.f66475h = null;
            if (!this.f66468a) {
                this.f66468a = true;
                recyclerView.post(this);
            }
        }
    }

    /* renamed from: a */
    private int m97271a(DisplayMetrics displayMetrics) {
        return displayMetrics.densityDpi / 4;
    }

    C26793c(Context context, RecyclerView recyclerView) {
        f66462a = m97271a(context.getResources().getDisplayMetrics());
        this.f66466e = recyclerView;
        this.f66467f = new RunnableC26794a(recyclerView);
    }

    /* renamed from: a */
    public static boolean m97272a(RecyclerView recyclerView, int i) {
        int i2;
        if (i == 0) {
            return false;
        }
        if (i > 0) {
            i2 = f66465d;
        } else {
            i2 = f66464c;
        }
        if (!m97273b(recyclerView, i2)) {
            return false;
        }
        recyclerView.scrollBy(0, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo95303a(int i, int i2) {
        RunnableC26794a aVar = this.f66467f;
        if (aVar == null || !aVar.f66468a) {
            RecyclerView.LayoutManager layoutManager = this.f66466e.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, i2);
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).mo7248a(i, i2);
            }
        } else if (UIList.f66420e) {
            LLog.m96429e("UIList2", "ListScroller scrollToPositionSmoothly is scrolling ");
        }
    }

    /* renamed from: b */
    private static boolean m97273b(RecyclerView recyclerView, int i) {
        boolean z;
        boolean z2;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int childCount = recyclerView.getChildCount();
        if (recyclerView.findViewHolderForLayoutPosition(0) != null) {
            z = true;
        } else {
            z = false;
        }
        if (recyclerView.findViewHolderForLayoutPosition(layoutManager.getItemCount() - 1) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((z && f66464c == i) || (z2 && f66465d == i)) {
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = recyclerView.getChildAt(i4);
                i2 = Math.min(layoutManager.getDecoratedTop(childAt), i2);
                i3 = Math.max(layoutManager.getDecoratedBottom(childAt), i3);
            }
            int paddingTop = layoutManager.getPaddingTop();
            int height = layoutManager.getHeight() - layoutManager.getPaddingBottom();
            if (!z || f66464c != i) {
                if (!z2 || f66465d != i || i3 > height) {
                    return true;
                }
                return false;
            } else if (i2 < paddingTop) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo95304a(int i, String str, int i2) {
        this.f66467f.mo95305a(i, str, i2);
    }
}
