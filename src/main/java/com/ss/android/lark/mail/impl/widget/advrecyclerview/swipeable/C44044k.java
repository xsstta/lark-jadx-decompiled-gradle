package com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.k */
public class C44044k {

    /* renamed from: a */
    private static final Interpolator f111783a = new animationInterpolatorC44038e(0.15f);

    /* renamed from: b */
    private final int f111784b;

    /* renamed from: c */
    private final boolean f111785c;

    /* renamed from: d */
    private C44032c f111786d;

    /* renamed from: e */
    private RecyclerView.ViewHolder f111787e;

    /* renamed from: f */
    private View f111788f;

    /* renamed from: g */
    private int f111789g;

    /* renamed from: h */
    private int f111790h;

    /* renamed from: i */
    private int f111791i;

    /* renamed from: j */
    private int f111792j;

    /* renamed from: k */
    private int f111793k;

    /* renamed from: l */
    private float f111794l = m174472a(this.f111793k);

    /* renamed from: m */
    private float f111795m;

    /* renamed from: n */
    private int f111796n;

    /* renamed from: o */
    private int f111797o;

    /* renamed from: p */
    private float f111798p;

    /* renamed from: q */
    private int f111799q;

    /* renamed from: r */
    private int f111800r;

    /* renamed from: a */
    private static float m174472a(int i) {
        return i != 0 ? 1.0f / ((float) i) : BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: b */
    public void mo156720b() {
        this.f111786d = null;
        this.f111787e = null;
        this.f111796n = 0;
        this.f111797o = 0;
        this.f111793k = 0;
        this.f111794l = BitmapDescriptorFactory.HUE_RED;
        this.f111795m = BitmapDescriptorFactory.HUE_RED;
        this.f111789g = 0;
        this.f111790h = 0;
        this.f111791i = 0;
        this.f111792j = 0;
        this.f111798p = BitmapDescriptorFactory.HUE_RED;
        this.f111799q = 0;
        this.f111800r = 0;
        this.f111788f = null;
    }

    /* renamed from: a */
    public void mo156718a() {
        int i = (int) (this.f111787e.itemView.getResources().getDisplayMetrics().density * 48.0f);
        int max = Math.max(0, this.f111793k - i);
        int max2 = Math.max(0, this.f111784b - i);
        this.f111799q = m174473b(this.f111786d.mo156678c(this.f111787e), -max, max);
        this.f111800r = m174473b(this.f111786d.mo156680d(this.f111787e), -max2, max2);
    }

    /* renamed from: b */
    private static int m174473b(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: a */
    public void mo156719a(int i, int i2, int i3) {
        int i4;
        int i5;
        float f;
        int i6;
        if (this.f111796n != i2 || this.f111797o != i3) {
            this.f111796n = i2;
            this.f111797o = i3;
            boolean z = this.f111785c;
            if (z) {
                i4 = i2 + this.f111799q;
            } else {
                i4 = this.f111800r + i3;
            }
            if (z) {
                i5 = this.f111793k;
            } else {
                i5 = this.f111784b;
            }
            if (z) {
                f = this.f111794l;
            } else {
                f = this.f111795m;
            }
            if (z) {
                if (i4 > 0) {
                    i6 = this.f111791i;
                } else {
                    i6 = this.f111789g;
                }
            } else if (i4 > 0) {
                i6 = this.f111792j;
            } else {
                i6 = this.f111790h;
            }
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (i6 == 1) {
                f2 = Math.signum((float) i4) * f111783a.getInterpolation(((float) Math.min(Math.abs(i4), i5)) * f);
            } else if (i6 == 2) {
                f2 = Math.min(Math.max(((float) i4) * f, -1.0f), 1.0f);
            }
            this.f111786d.mo156664a(this.f111787e, i, this.f111798p, f2, true, this.f111785c, false, true);
            this.f111798p = f2;
        }
    }

    public C44044k(C44032c cVar, RecyclerView.ViewHolder viewHolder, int i, boolean z) {
        this.f111786d = cVar;
        this.f111787e = viewHolder;
        this.f111789g = C44039f.m174419a(i);
        this.f111790h = C44039f.m174420b(i);
        this.f111791i = C44039f.m174421c(i);
        this.f111792j = C44039f.m174422d(i);
        this.f111785c = z;
        View a = C44043j.m174470a(viewHolder);
        this.f111788f = a;
        this.f111793k = a.getWidth();
        int height = this.f111788f.getHeight();
        this.f111784b = height;
        this.f111795m = m174472a(height);
    }
}
