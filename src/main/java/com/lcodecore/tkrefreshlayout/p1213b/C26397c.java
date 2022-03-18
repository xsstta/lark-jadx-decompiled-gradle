package com.lcodecore.tkrefreshlayout.p1213b;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ScrollView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.reflect.Field;

/* renamed from: com.lcodecore.tkrefreshlayout.b.c */
public class C26397c {
    /* renamed from: a */
    private static int m95595a(RecyclerView.LayoutParams layoutParams) {
        try {
            Field declaredField = RecyclerView.LayoutParams.class.getDeclaredField("mDecorInsets");
            declaredField.setAccessible(true);
            return ((Rect) declaredField.get(layoutParams)).top;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static boolean m95597a(ViewGroup viewGroup) {
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null || childAt.getMeasuredHeight() > viewGroup.getScrollY() + viewGroup.getHeight()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m95602b(AbsListView absListView) {
        if (absListView == null || absListView.getAdapter() == null || absListView.getChildCount() <= 0 || absListView.getLastVisiblePosition() != ((ListAdapter) absListView.getAdapter()).getCount() - 1 || absListView.getChildAt(absListView.getChildCount() - 1).getBottom() > absListView.getMeasuredHeight()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m95603b(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager;
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || layoutManager.getItemCount() == 0)) {
            if (layoutManager instanceof LinearLayoutManager) {
                View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                if (childAt == null || childAt.getMeasuredHeight() < recyclerView.getMeasuredHeight()) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1) {
                        return true;
                    }
                } else if (Build.VERSION.SDK_INT >= 14) {
                    return !ViewCompat.m4060b((View) recyclerView, 1);
                } else {
                    if (ViewCompat.m4060b((View) recyclerView, 1) || recyclerView.getScrollY() < 0) {
                        return false;
                    }
                    return true;
                }
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int[] d = staggeredGridLayoutManager.mo7265d((int[]) null);
                int itemCount = staggeredGridLayoutManager.getItemCount() - 1;
                for (int i : d) {
                    if (i == itemCount) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m95599a(AbsListView absListView) {
        int i;
        if (absListView != null) {
            if (absListView.getChildCount() > 0) {
                i = absListView.getChildAt(0).getTop() - absListView.getPaddingTop();
            } else {
                i = 0;
            }
            if (absListView.getFirstVisiblePosition() == 0 && i == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0081 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m95600a(androidx.recyclerview.widget.RecyclerView r6) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lcodecore.tkrefreshlayout.p1213b.C26397c.m95600a(androidx.recyclerview.widget.RecyclerView):boolean");
    }

    /* renamed from: a */
    public static boolean m95596a(View view, int i) {
        if (view instanceof AbsListView) {
            return m95599a((AbsListView) view);
        }
        if (view instanceof RecyclerView) {
            return m95600a((RecyclerView) view);
        }
        if (view == null || Math.abs(view.getScrollY()) > i * 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m95601b(View view, int i) {
        if (view instanceof AbsListView) {
            return m95602b((AbsListView) view);
        }
        if (view instanceof RecyclerView) {
            return m95603b((RecyclerView) view);
        }
        if (view instanceof WebView) {
            return m95598a((WebView) view, i);
        }
        if (view instanceof ViewGroup) {
            return m95597a((ViewGroup) view);
        }
        return false;
    }

    /* renamed from: c */
    public static void m95604c(View view, int i) {
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).scrollBy(0, i);
        } else if (view instanceof ScrollView) {
            ((ScrollView) view).smoothScrollBy(0, i);
        } else if (view instanceof AbsListView) {
            ((AbsListView) view).smoothScrollBy(i, 0);
        } else {
            try {
                view.getClass().getDeclaredMethod("smoothScrollBy", Integer.class, Integer.class).invoke(view, 0, Integer.valueOf(i));
            } catch (Exception unused) {
                view.scrollBy(0, i);
            }
        }
    }

    /* renamed from: a */
    public static boolean m95598a(WebView webView, int i) {
        if (webView == null || (((float) webView.getContentHeight()) * webView.getScale()) - ((float) (webView.getHeight() + webView.getScrollY())) > ((float) (i * 2))) {
            return false;
        }
        return true;
    }
}
