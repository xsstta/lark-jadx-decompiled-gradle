package com.ss.android.lark.widget.recyclerview;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;

/* renamed from: com.ss.android.lark.widget.recyclerview.h */
public class C58996h {
    /* renamed from: c */
    public static void m228981c(RecyclerView recyclerView) {
        if (recyclerView != null) {
            ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        }
    }

    /* renamed from: b */
    public static void m228978b(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.getItemAnimator().setAddDuration(0);
            recyclerView.getItemAnimator().setChangeDuration(0);
            recyclerView.getItemAnimator().setMoveDuration(0);
            recyclerView.getItemAnimator().setRemoveDuration(0);
            ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        }
    }

    /* renamed from: d */
    public static boolean m228982d(RecyclerView recyclerView) {
        if (recyclerView != null && (recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            int findLastVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition();
            if (recyclerView.getAdapter() == null || findLastVisibleItemPosition < recyclerView.getAdapter().getItemCount() - 1) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m228983e(RecyclerView recyclerView) {
        if (recyclerView != null && (recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            int findFirstVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
            if (recyclerView.getAdapter() == null || findFirstVisibleItemPosition != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m228977a(RecyclerView recyclerView) {
        if (recyclerView != null && recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset() >= recyclerView.computeVerticalScrollRange()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m228973a(RecyclerView recyclerView, int i) {
        m228979b(recyclerView, i, 0);
    }

    /* renamed from: b */
    public static void m228980b(final RecyclerView recyclerView, final boolean z) {
        recyclerView.postDelayed(new Runnable() {
            /* class com.ss.android.lark.widget.recyclerview.C58996h.RunnableC589971 */

            public void run() {
                RecyclerView.Adapter adapter;
                RecyclerView recyclerView = recyclerView;
                if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                    if (z) {
                        RecyclerView recyclerView2 = recyclerView;
                        recyclerView2.scrollBy(0, recyclerView2.computeVerticalScrollRange());
                        return;
                    }
                    recyclerView.getLayoutManager().scrollToPosition(adapter.getItemCount() - 1);
                }
            }
        }, 300);
    }

    /* renamed from: a */
    public static void m228975a(RecyclerView recyclerView, boolean z) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (z != linearLayoutManager.getStackFromEnd()) {
                linearLayoutManager.setStackFromEnd(z);
            }
        }
    }

    /* renamed from: a */
    public static void m228974a(final RecyclerView recyclerView, final int i, int i2) {
        m228973a(recyclerView, i);
        UICallbackExecutor.executeDelayed(new Runnable() {
            /* class com.ss.android.lark.widget.recyclerview.C58996h.RunnableC589982 */

            public void run() {
                int i;
                View childAt;
                int measuredHeight;
                int measuredHeight2;
                int findFirstVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
                if (findFirstVisibleItemPosition != -1 && (i = i - findFirstVisibleItemPosition) >= 0 && i < recyclerView.getChildCount() && (childAt = recyclerView.getLayoutManager().getChildAt(i)) != null && (measuredHeight = childAt.getMeasuredHeight()) < (measuredHeight2 = recyclerView.getMeasuredHeight()) && !C58996h.m228977a(recyclerView)) {
                    recyclerView.smoothScrollBy(0, -((measuredHeight2 - measuredHeight) / 2));
                }
            }
        }, (long) i2);
    }

    /* renamed from: b */
    public static void m228979b(RecyclerView recyclerView, int i, int i2) {
        ((LinearLayoutManager) recyclerView.getLayoutManager()).scrollToPositionWithOffset(i, i2 + UIUtils.dp2px(recyclerView.getContext(), 5.0f));
    }

    /* renamed from: a */
    public static boolean m228976a(View view, int i, int i2) {
        int n = (int) (ViewCompat.m4099n(view) + 0.5f);
        int o = (int) (ViewCompat.m4100o(view) + 0.5f);
        int left = view.getLeft() + n;
        int right = view.getRight() + n;
        int top = view.getTop() + o;
        int bottom = view.getBottom() + o;
        if (i < left || i > right || i2 < top || i2 > bottom) {
            return false;
        }
        return true;
    }
}
