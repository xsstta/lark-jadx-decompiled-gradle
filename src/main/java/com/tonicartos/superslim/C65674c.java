package com.tonicartos.superslim;

import android.text.TextUtils;
import android.view.View;
import com.tonicartos.superslim.LayoutManager;

/* renamed from: com.tonicartos.superslim.c */
public class C65674c {

    /* renamed from: a */
    public final int f165460a;

    /* renamed from: b */
    public final boolean f165461b;

    /* renamed from: c */
    public final int f165462c;

    /* renamed from: d */
    public final String f165463d;

    /* renamed from: e */
    public final int f165464e;

    /* renamed from: f */
    public final int f165465f;

    /* renamed from: g */
    public final int f165466g;

    /* renamed from: h */
    public final int f165467h;

    /* renamed from: i */
    public final int f165468i;

    /* renamed from: j */
    final int f165469j;

    /* renamed from: k */
    final int f165470k;

    /* renamed from: l */
    LayoutManager.LayoutParams f165471l;

    /* renamed from: a */
    public int mo229909a() {
        return this.f165470k + this.f165469j;
    }

    /* renamed from: a */
    public boolean mo229910a(LayoutManager.LayoutParams layoutParams) {
        if (layoutParams.f165449h == this.f165464e || TextUtils.equals(layoutParams.f165448g, this.f165463d)) {
            return true;
        }
        return false;
    }

    public C65674c(LayoutManager layoutManager, View view) {
        int paddingStart = layoutManager.getPaddingStart();
        int paddingEnd = layoutManager.getPaddingEnd();
        LayoutManager.LayoutParams layoutParams = (LayoutManager.LayoutParams) view.getLayoutParams();
        this.f165471l = layoutParams;
        if (layoutParams.f165442a) {
            int decoratedMeasuredWidth = layoutManager.getDecoratedMeasuredWidth(view);
            this.f165465f = decoratedMeasuredWidth;
            int decoratedMeasuredHeight = layoutManager.getDecoratedMeasuredHeight(view);
            this.f165466g = decoratedMeasuredHeight;
            if (!this.f165471l.mo229892f() || this.f165471l.mo229893g()) {
                this.f165462c = decoratedMeasuredHeight;
            } else {
                this.f165462c = 0;
            }
            if (!this.f165471l.f165446e) {
                this.f165469j = this.f165471l.f165445d;
            } else if (!this.f165471l.mo229894h() || this.f165471l.mo229893g()) {
                this.f165469j = 0;
            } else {
                this.f165469j = decoratedMeasuredWidth;
            }
            if (!this.f165471l.f165447f) {
                this.f165470k = this.f165471l.f165444c;
            } else if (!this.f165471l.mo229891e() || this.f165471l.mo229893g()) {
                this.f165470k = 0;
            } else {
                this.f165470k = decoratedMeasuredWidth;
            }
        } else {
            this.f165462c = 0;
            this.f165466g = 0;
            this.f165465f = 0;
            this.f165469j = this.f165471l.f165445d;
            this.f165470k = this.f165471l.f165444c;
        }
        this.f165467h = this.f165470k + paddingEnd;
        this.f165468i = this.f165469j + paddingStart;
        this.f165461b = this.f165471l.f165442a;
        this.f165460a = this.f165471l.mo229890d();
        this.f165463d = this.f165471l.f165448g;
        this.f165464e = this.f165471l.f165449h;
    }
}
