package com.scwang.smartrefresh.layout.p1237d;

import android.graphics.PointF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.scwang.smartrefresh.layout.d.c */
public class C27145c {
    /* renamed from: a */
    public static boolean m98682a(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            return view.canScrollVertically(-1);
        }
        if (view instanceof AbsListView) {
            AbsListView absListView = (AbsListView) view;
            if (absListView.getChildCount() <= 0 || (absListView.getFirstVisiblePosition() <= 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
                return false;
            }
            return true;
        } else if (view.getScrollY() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m98686b(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            return view.canScrollVertically(1);
        }
        if (view instanceof AbsListView) {
            AbsListView absListView = (AbsListView) view;
            if (absListView.getChildCount() <= 0 || (absListView.getLastVisiblePosition() >= absListView.getChildCount() - 1 && absListView.getChildAt(absListView.getChildCount() - 1).getBottom() <= absListView.getPaddingBottom())) {
                return false;
            }
            return true;
        } else if (view.getScrollY() < 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m98688c(View view, MotionEvent motionEvent) {
        if (m98686b(view) && view.getVisibility() == 0) {
            return true;
        }
        if ((view instanceof ViewGroup) && motionEvent != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            PointF pointF = new PointF();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (m98685a(viewGroup, childAt, motionEvent.getX(), motionEvent.getY(), pointF)) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(pointF.x, pointF.y);
                    return m98688c(childAt, obtain);
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m98687b(View view, MotionEvent motionEvent) {
        if (!m98686b(view) && m98682a(view) && view.getVisibility() == 0) {
            return true;
        }
        if ((view instanceof ViewGroup) && motionEvent != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            PointF pointF = new PointF();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (m98685a(viewGroup, childAt, motionEvent.getX(), motionEvent.getY(), pointF)) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(pointF.x, pointF.y);
                    return m98687b(childAt, obtain);
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m98684a(View view, MotionEvent motionEvent) {
        if (m98682a(view) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof ViewGroup) || motionEvent == null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        PointF pointF = new PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount - 1);
            if (m98685a(viewGroup, childAt, motionEvent.getX(), motionEvent.getY(), pointF)) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(pointF.x, pointF.y);
                return m98684a(childAt, obtain);
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m98681a(ViewGroup viewGroup, View view, float[] fArr) {
        fArr[0] = fArr[0] + ((float) (viewGroup.getScrollX() - view.getLeft()));
        fArr[1] = fArr[1] + ((float) (viewGroup.getScrollY() - view.getTop()));
    }

    /* renamed from: a */
    public static boolean m98683a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        if (f < f4 || f2 < f4 || f >= width + f3 || f2 >= height + f3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m98685a(ViewGroup viewGroup, View view, float f, float f2, PointF pointF) {
        if (view.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f, f2};
        m98681a(viewGroup, view, fArr);
        boolean a = m98683a(view, fArr[0], fArr[1], BitmapDescriptorFactory.HUE_RED);
        if (a && pointF != null) {
            pointF.set(fArr[0] - f, fArr[1] - f2);
        }
        return a;
    }
}
