package com.ss.android.lark.mm.module.podcast.subtitle;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.d */
public class C46789d extends RecyclerView.SmoothScroller {

    /* renamed from: a */
    protected final LinearInterpolator f117757a = new LinearInterpolator();

    /* renamed from: b */
    protected final LinearInterpolator f117758b = new LinearInterpolator();

    /* renamed from: c */
    protected PointF f117759c;

    /* renamed from: d */
    protected int f117760d = 0;

    /* renamed from: e */
    protected int f117761e = 0;

    /* renamed from: f */
    private final float f117762f;

    /* renamed from: a */
    private int m185426a(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStart() {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStop() {
        this.f117761e = 0;
        this.f117760d = 0;
        this.f117759c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo164409a() {
        PointF pointF = this.f117759c;
        if (pointF == null || pointF.x == BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        if (this.f117759c.x > BitmapDescriptorFactory.HUE_RED) {
            return 1;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo164414b() {
        PointF pointF = this.f117759c;
        if (pointF == null || pointF.y == BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        if (this.f117759c.y > BitmapDescriptorFactory.HUE_RED) {
            return 1;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo164408a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo164415b(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * this.f117762f));
    }

    public C46789d(Context context) {
        this.f117762f = mo164408a(context.getResources().getDisplayMetrics());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo164410a(int i) {
        return (int) Math.ceil(((double) mo164415b(i)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo164413a(RecyclerView.SmoothScroller.C1330a aVar) {
        PointF computeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
        if (computeScrollVectorForPosition == null || (computeScrollVectorForPosition.x == BitmapDescriptorFactory.HUE_RED && computeScrollVectorForPosition.y == BitmapDescriptorFactory.HUE_RED)) {
            aVar.mo7145a(getTargetPosition());
            stop();
            return;
        }
        normalize(computeScrollVectorForPosition);
        this.f117759c = computeScrollVectorForPosition;
        this.f117760d = (int) (computeScrollVectorForPosition.x * 10000.0f);
        this.f117761e = (int) (computeScrollVectorForPosition.y * 10000.0f);
        aVar.mo7146a((int) (((float) this.f117760d) * 1.2f), (int) (((float) this.f117761e) * 1.2f), (int) (((float) mo164415b(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)) * 1.2f), this.f117757a);
    }

    /* renamed from: b */
    public int mo164416b(View view, int i) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return mo164411a(layoutManager.getDecoratedLeft(view) - layoutParams.leftMargin, layoutManager.getDecoratedRight(view) + layoutParams.rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), i);
    }

    /* renamed from: a */
    public int mo164412a(View view, int i) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return mo164411a(layoutManager.getDecoratedTop(view) - layoutParams.topMargin, layoutManager.getDecoratedBottom(view) + layoutParams.bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.C1330a aVar) {
        int b = mo164416b(view, mo164409a());
        int a = mo164412a(view, mo164414b());
        int a2 = mo164410a((int) Math.sqrt((double) ((b * b) + (a * a))));
        if (a2 > 0) {
            aVar.mo7146a(-b, -a, a2, this.f117758b);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onSeekTargetStep(int i, int i2, RecyclerView.State state, RecyclerView.SmoothScroller.C1330a aVar) {
        if (getChildCount() == 0) {
            stop();
            return;
        }
        this.f117760d = m185426a(this.f117760d, i);
        int a = m185426a(this.f117761e, i2);
        this.f117761e = a;
        if (this.f117760d == 0 && a == 0) {
            mo164413a(aVar);
        }
    }

    /* renamed from: a */
    public int mo164411a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }
}
