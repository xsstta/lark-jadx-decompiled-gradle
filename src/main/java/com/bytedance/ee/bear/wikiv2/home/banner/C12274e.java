package com.bytedance.ee.bear.wikiv2.home.banner;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1401r;
import androidx.recyclerview.widget.AbstractC1409v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ee.bear.wikiv2.home.banner.e */
public class C12274e extends AbstractC1409v {

    /* renamed from: a */
    private AbstractC1401r f32965a;

    /* renamed from: b */
    private int f32966b;

    /* renamed from: c */
    private int f32967c;

    /* renamed from: a */
    public void mo46841a(int i) {
        this.f32966b = i;
    }

    /* renamed from: b */
    public void mo46842b(int i) {
        this.f32967c = i;
    }

    @Override // androidx.recyclerview.widget.AbstractC1409v
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return m51085a(layoutManager, m51086a(layoutManager));
    }

    /* renamed from: a */
    private AbstractC1401r m51086a(RecyclerView.LayoutManager layoutManager) {
        if (this.f32965a == null) {
            this.f32965a = AbstractC1401r.m6390a(layoutManager);
        }
        return this.f32965a;
    }

    /* renamed from: a */
    private int m51083a(View view, AbstractC1401r rVar) {
        return rVar.mo7461a(view) - rVar.mo7466c();
    }

    @Override // androidx.recyclerview.widget.AbstractC1409v
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = m51083a(view, m51086a(layoutManager)) + this.f32966b;
        } else {
            iArr[0] = 0;
        }
        return iArr;
    }

    /* renamed from: a */
    private View m51085a(RecyclerView.LayoutManager layoutManager, AbstractC1401r rVar) {
        LinearLayoutManager linearLayoutManager;
        int findFirstVisibleItemPosition;
        if (!(layoutManager instanceof LinearLayoutManager) || (findFirstVisibleItemPosition = (linearLayoutManager = (LinearLayoutManager) layoutManager).findFirstVisibleItemPosition()) == -1 || linearLayoutManager.findLastCompletelyVisibleItemPosition() == layoutManager.getItemCount() - 1) {
            return null;
        }
        View findViewByPosition = layoutManager.findViewByPosition(findFirstVisibleItemPosition);
        if (rVar.mo7465b(findViewByPosition) < rVar.mo7471e(findViewByPosition) / 2 || rVar.mo7465b(findViewByPosition) <= 0) {
            return layoutManager.findViewByPosition(findFirstVisibleItemPosition + this.f32967c);
        }
        return findViewByPosition;
    }

    /* renamed from: b */
    private float m51087b(RecyclerView.LayoutManager layoutManager, AbstractC1401r rVar) {
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

    @Override // androidx.recyclerview.widget.AbstractC1409v
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int itemCount;
        int i3;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.AbstractC1331b) || (itemCount = layoutManager.getItemCount()) == 0 || m51085a(layoutManager, m51086a(layoutManager)) == null) {
            return -1;
        }
        int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        int i4 = itemCount - 1;
        PointF computeScrollVectorForPosition = ((RecyclerView.SmoothScroller.AbstractC1331b) layoutManager).computeScrollVectorForPosition(i4);
        if (computeScrollVectorForPosition == null) {
            return -1;
        }
        int i5 = 0;
        if (layoutManager.canScrollHorizontally()) {
            i3 = m51084a(layoutManager, m51086a(layoutManager), i, 0);
            C13479a.m54764b("WikiHomePageSpaceSnapHelper", "hDeltaJump " + i3);
            if (computeScrollVectorForPosition.x < BitmapDescriptorFactory.HUE_RED) {
                i3 = -i3;
            }
        } else {
            i3 = 0;
        }
        int i6 = i3 + findFirstVisibleItemPosition;
        if (i6 >= 0) {
            i5 = i6;
        }
        if (i5 < itemCount) {
            i4 = i5;
        }
        C13479a.m54764b("WikiHomePageSpaceSnapHelper", "current position " + findFirstVisibleItemPosition);
        return i4;
    }

    /* renamed from: a */
    private int m51084a(RecyclerView.LayoutManager layoutManager, AbstractC1401r rVar, int i, int i2) {
        double floor;
        int[] calculateScrollDistance = calculateScrollDistance(i, i2);
        float b = m51087b(layoutManager, rVar) / 2.0f;
        C13479a.m54764b("WikiHomePageSpaceSnapHelper", "estimateNextPositionDiffForFling   " + calculateScrollDistance[0] + "  " + b);
        if (b <= BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        int i3 = calculateScrollDistance[0];
        if (i3 > 0) {
            floor = Math.ceil((double) (((float) i3) / b));
        } else {
            floor = Math.floor((double) (((float) i3) / b));
        }
        return (int) floor;
    }
}
