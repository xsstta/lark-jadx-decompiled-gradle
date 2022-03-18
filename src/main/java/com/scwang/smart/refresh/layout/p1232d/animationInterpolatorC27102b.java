package com.scwang.smart.refresh.layout.p1232d;

import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ScrollingView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.scwang.smart.refresh.layout.d.b  reason: invalid class name */
public class animationInterpolatorC27102b implements Interpolator {

    /* renamed from: a */
    public static int f67347a = 0;

    /* renamed from: b */
    public static int f67348b = 1;

    /* renamed from: d */
    private static float f67349d = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: e */
    private static final float f67350e;

    /* renamed from: f */
    private static final float f67351f;

    /* renamed from: c */
    private int f67352c;

    static {
        float b = 1.0f / m98457b(1.0f);
        f67350e = b;
        f67351f = 1.0f - (b * m98457b(1.0f));
    }

    public animationInterpolatorC27102b(int i) {
        this.f67352c = i;
    }

    /* renamed from: a */
    public static float m98449a(int i) {
        return ((float) i) / f67349d;
    }

    /* renamed from: a */
    public static int m98450a(float f) {
        return (int) ((f * f67349d) + 0.5f);
    }

    /* renamed from: b */
    public static boolean m98458b(View view) {
        if ((view instanceof AbsListView) || (view instanceof ScrollView) || (view instanceof ScrollingView) || (view instanceof WebView) || (view instanceof NestedScrollingChild)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m98459c(View view) {
        if (m98458b(view) || (view instanceof ViewPager) || (view instanceof NestedScrollingParent)) {
            return true;
        }
        return false;
    }

    public float getInterpolation(float f) {
        if (this.f67352c == f67348b) {
            float f2 = 1.0f - f;
            return 1.0f - (f2 * f2);
        }
        float b = f67350e * m98457b(f);
        if (b > BitmapDescriptorFactory.HUE_RED) {
            return b + f67351f;
        }
        return b;
    }

    /* renamed from: a */
    public static int m98451a(View view) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        if (layoutParams.height > 0) {
            i = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
        } else {
            i = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, i);
        return view.getMeasuredHeight();
    }

    /* renamed from: b */
    private static float m98457b(float f) {
        float f2 = f * 8.0f;
        if (f2 < 1.0f) {
            return f2 - (1.0f - ((float) Math.exp((double) (-f2))));
        }
        return ((1.0f - ((float) Math.exp((double) (1.0f - f2)))) * 0.63212055f) + 0.36787945f;
    }

    /* renamed from: a */
    public static void m98452a(View view, int i) {
        if (view instanceof ScrollView) {
            ((ScrollView) view).fling(i);
        } else if (view instanceof AbsListView) {
            if (Build.VERSION.SDK_INT >= 21) {
                ((AbsListView) view).fling(i);
            }
        } else if (view instanceof WebView) {
            ((WebView) view).flingScroll(0, i);
        } else if (view instanceof NestedScrollView) {
            ((NestedScrollView) view).mo4756d(i);
        } else if (view instanceof RecyclerView) {
            ((RecyclerView) view).fling(0, i);
        }
    }

    /* renamed from: a */
    public static void m98453a(AbsListView absListView, int i) {
        View childAt;
        if (Build.VERSION.SDK_INT >= 19) {
            absListView.scrollListBy(i);
        } else if (absListView instanceof ListView) {
            int firstVisiblePosition = absListView.getFirstVisiblePosition();
            if (firstVisiblePosition != -1 && (childAt = absListView.getChildAt(0)) != null) {
                ((ListView) absListView).setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
            }
        } else {
            absListView.smoothScrollBy(i, 0);
        }
    }

    /* renamed from: a */
    public static boolean m98454a(View view, PointF pointF) {
        if (view.canScrollVertically(-1) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof ViewGroup) || pointF == null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        PointF pointF2 = new PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount - 1);
            if (m98456a(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                Object tag = childAt.getTag(R.id.srl_tag);
                if ("fixed".equals(tag) || "fixed-bottom".equals(tag)) {
                    return false;
                }
                pointF.offset(pointF2.x, pointF2.y);
                boolean a = m98454a(childAt, pointF);
                pointF.offset(-pointF2.x, -pointF2.y);
                return a;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m98455a(View view, PointF pointF, boolean z) {
        if (view.canScrollVertically(1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null && !m98458b(view)) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (m98456a(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    Object tag = childAt.getTag(R.id.srl_tag);
                    if ("fixed".equals(tag) || "fixed-top".equals(tag)) {
                        return false;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean a = m98455a(childAt, pointF, z);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return a;
                }
            }
        }
        if (z || view.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m98456a(View view, View view2, float f, float f2, PointF pointF) {
        boolean z;
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f, f2};
        fArr[0] = fArr[0] + ((float) (view.getScrollX() - view2.getLeft()));
        fArr[1] = fArr[1] + ((float) (view.getScrollY() - view2.getTop()));
        if (fArr[0] < BitmapDescriptorFactory.HUE_RED || fArr[1] < BitmapDescriptorFactory.HUE_RED || fArr[0] >= ((float) view2.getWidth()) || fArr[1] >= ((float) view2.getHeight())) {
            z = false;
        } else {
            z = true;
        }
        if (z && pointF != null) {
            pointF.set(fArr[0] - f, fArr[1] - f2);
        }
        return z;
    }
}
