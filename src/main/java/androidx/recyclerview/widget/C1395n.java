package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.recyclerview.widget.n */
public class C1395n extends AbstractC1409v {

    /* renamed from: a */
    private AbstractC1401r f4944a;

    /* renamed from: b */
    private AbstractC1401r f4945b;

    /* renamed from: b */
    private AbstractC1401r m6376b(RecyclerView.LayoutManager layoutManager) {
        AbstractC1401r rVar = this.f4945b;
        if (rVar == null || rVar.f4948a != layoutManager) {
            this.f4945b = AbstractC1401r.m6390a(layoutManager);
        }
        return this.f4945b;
    }

    @Override // androidx.recyclerview.widget.AbstractC1409v
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return m6373a(layoutManager, m6374a(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return m6373a(layoutManager, m6376b(layoutManager));
        }
        return null;
    }

    /* renamed from: a */
    private AbstractC1401r m6374a(RecyclerView.LayoutManager layoutManager) {
        AbstractC1401r rVar = this.f4944a;
        if (rVar == null || rVar.f4948a != layoutManager) {
            this.f4944a = AbstractC1401r.m6392b(layoutManager);
        }
        return this.f4944a;
    }

    @Override // androidx.recyclerview.widget.AbstractC1409v
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = m6371a(layoutManager, view, m6376b(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = m6371a(layoutManager, view, m6374a(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: a */
    private View m6373a(RecyclerView.LayoutManager layoutManager, AbstractC1401r rVar) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int c = rVar.mo7466c() + (rVar.mo7472f() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int abs = Math.abs((rVar.mo7461a(childAt) + (rVar.mo7471e(childAt) / 2)) - c);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: b */
    private float m6375b(RecyclerView.LayoutManager layoutManager, AbstractC1401r rVar) {
        int max;
        int childCount = layoutManager.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = layoutManager.getChildAt(i3);
            int position = layoutManager.getPosition(childAt);
            if (position != -1) {
                if (position < i) {
                    view = childAt;
                    i = position;
                }
                if (position > i2) {
                    view2 = childAt;
                    i2 = position;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(rVar.mo7465b(view), rVar.mo7465b(view2)) - Math.min(rVar.mo7461a(view), rVar.mo7461a(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
    }

    /* renamed from: a */
    private int m6371a(RecyclerView.LayoutManager layoutManager, View view, AbstractC1401r rVar) {
        return (rVar.mo7461a(view) + (rVar.mo7471e(view) / 2)) - (rVar.mo7466c() + (rVar.mo7472f() / 2));
    }

    @Override // androidx.recyclerview.widget.AbstractC1409v
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int itemCount;
        View findSnapView;
        int position;
        int i3;
        PointF computeScrollVectorForPosition;
        int i4;
        int i5;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.AbstractC1331b) || (itemCount = layoutManager.getItemCount()) == 0 || (findSnapView = findSnapView(layoutManager)) == null || (position = layoutManager.getPosition(findSnapView)) == -1 || (computeScrollVectorForPosition = ((RecyclerView.SmoothScroller.AbstractC1331b) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        int i6 = 0;
        if (layoutManager.canScrollHorizontally()) {
            i4 = m6372a(layoutManager, m6376b(layoutManager), i, 0);
            if (computeScrollVectorForPosition.x < BitmapDescriptorFactory.HUE_RED) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i5 = m6372a(layoutManager, m6374a(layoutManager), 0, i2);
            if (computeScrollVectorForPosition.y < BitmapDescriptorFactory.HUE_RED) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = position + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= itemCount ? i3 : i6;
    }

    /* renamed from: a */
    private int m6372a(RecyclerView.LayoutManager layoutManager, AbstractC1401r rVar, int i, int i2) {
        int i3;
        int[] calculateScrollDistance = calculateScrollDistance(i, i2);
        float b = m6375b(layoutManager, rVar);
        if (b <= BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        if (Math.abs(calculateScrollDistance[0]) > Math.abs(calculateScrollDistance[1])) {
            i3 = calculateScrollDistance[0];
        } else {
            i3 = calculateScrollDistance[1];
        }
        return Math.round(((float) i3) / b);
    }
}
