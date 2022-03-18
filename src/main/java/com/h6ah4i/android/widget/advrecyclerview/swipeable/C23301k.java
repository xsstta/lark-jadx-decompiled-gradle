package com.h6ah4i.android.widget.advrecyclerview.swipeable;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.swipeable.k */
class C23301k {

    /* renamed from: a */
    private static final Interpolator f57461a = new animationInterpolatorC23295e(0.15f);

    /* renamed from: b */
    private final int f57462b;

    /* renamed from: c */
    private final boolean f57463c;

    /* renamed from: d */
    private C23289c f57464d;

    /* renamed from: e */
    private RecyclerView.ViewHolder f57465e;

    /* renamed from: f */
    private View f57466f;

    /* renamed from: g */
    private int f57467g;

    /* renamed from: h */
    private int f57468h;

    /* renamed from: i */
    private int f57469i;

    /* renamed from: j */
    private int f57470j;

    /* renamed from: k */
    private int f57471k;

    /* renamed from: l */
    private float f57472l = m84621a(this.f57471k);

    /* renamed from: m */
    private float f57473m;

    /* renamed from: n */
    private int f57474n;

    /* renamed from: o */
    private int f57475o;

    /* renamed from: p */
    private float f57476p;

    /* renamed from: q */
    private int f57477q;

    /* renamed from: r */
    private int f57478r;

    /* renamed from: a */
    private static float m84621a(int i) {
        return i != 0 ? 1.0f / ((float) i) : BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: b */
    public void mo80863b() {
        this.f57464d = null;
        this.f57465e = null;
        this.f57474n = 0;
        this.f57475o = 0;
        this.f57471k = 0;
        this.f57472l = BitmapDescriptorFactory.HUE_RED;
        this.f57473m = BitmapDescriptorFactory.HUE_RED;
        this.f57467g = 0;
        this.f57468h = 0;
        this.f57469i = 0;
        this.f57470j = 0;
        this.f57476p = BitmapDescriptorFactory.HUE_RED;
        this.f57477q = 0;
        this.f57478r = 0;
        this.f57466f = null;
    }

    /* renamed from: a */
    public void mo80861a() {
        int i = (int) (this.f57465e.itemView.getResources().getDisplayMetrics().density * 48.0f);
        int max = Math.max(0, this.f57471k - i);
        int max2 = Math.max(0, this.f57462b - i);
        this.f57477q = m84622b(this.f57464d.mo80815c(this.f57465e), -max, max);
        this.f57478r = m84622b(this.f57464d.mo80817d(this.f57465e), -max2, max2);
    }

    /* renamed from: b */
    private static int m84622b(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: a */
    public void mo80862a(int i, int i2, int i3) {
        int i4;
        int i5;
        float f;
        int i6;
        if (this.f57474n != i2 || this.f57475o != i3) {
            this.f57474n = i2;
            this.f57475o = i3;
            boolean z = this.f57463c;
            if (z) {
                i4 = i2 + this.f57477q;
            } else {
                i4 = this.f57478r + i3;
            }
            if (z) {
                i5 = this.f57471k;
            } else {
                i5 = this.f57462b;
            }
            if (z) {
                f = this.f57472l;
            } else {
                f = this.f57473m;
            }
            if (z) {
                if (i4 > 0) {
                    i6 = this.f57469i;
                } else {
                    i6 = this.f57467g;
                }
            } else if (i4 > 0) {
                i6 = this.f57470j;
            } else {
                i6 = this.f57468h;
            }
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (i6 == 1) {
                f2 = Math.signum((float) i4) * f57461a.getInterpolation(((float) Math.min(Math.abs(i4), i5)) * f);
            } else if (i6 == 2) {
                f2 = Math.min(Math.max(((float) i4) * f, -1.0f), 1.0f);
            }
            this.f57464d.mo80803a(this.f57465e, i, this.f57476p, f2, true, this.f57463c, false, true);
            this.f57476p = f2;
        }
    }

    public C23301k(C23289c cVar, RecyclerView.ViewHolder viewHolder, int i, boolean z) {
        this.f57464d = cVar;
        this.f57465e = viewHolder;
        this.f57467g = C23296f.m84566a(i);
        this.f57468h = C23296f.m84567b(i);
        this.f57469i = C23296f.m84568c(i);
        this.f57470j = C23296f.m84569d(i);
        this.f57463c = z;
        View a = C23300j.m84619a(viewHolder);
        this.f57466f = a;
        this.f57471k = a.getWidth();
        int height = this.f57466f.getHeight();
        this.f57462b = height;
        this.f57473m = m84621a(height);
    }
}
