package com.ss.android.lark.mail.impl.p2171h.p2176d;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.apm.trace.p155a.C3069b;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42341b;

/* renamed from: com.ss.android.lark.mail.impl.h.d.b */
public class C42349b extends C42341b {

    /* renamed from: a */
    private C3069b f107803a;

    /* renamed from: b */
    private C3069b f107804b;

    /* renamed from: c */
    private boolean f107805c;

    /* renamed from: d */
    private int f107806d;

    /* renamed from: e */
    private int f107807e;

    /* renamed from: f */
    private boolean f107808f;

    /* renamed from: g */
    private boolean f107809g;

    /* renamed from: c */
    private void m169107c(String str) {
        if (this.f107803a == null) {
            this.f107803a = new C3069b(str + "_udscroll");
        }
        if (this.f107804b == null) {
            this.f107804b = new C3069b(str + "_lrscroll");
        }
    }

    /* renamed from: b */
    public void mo152460b(String str) {
        this.f107803a = new C3069b(str + "_udscroll");
        this.f107804b = new C3069b(str + "_lrscroll");
    }

    /* renamed from: a */
    public void mo152457a(int i, String str) {
        m169107c(str);
        if (i == 1) {
            if (!this.f107809g) {
                this.f107809g = true;
                this.f107804b.mo12923a();
            }
        } else if (this.f107809g) {
            this.f107809g = false;
            this.f107804b.mo12926b();
        }
    }

    /* renamed from: a */
    public void mo152459a(View view, MotionEvent motionEvent, String str) {
        m169107c(str);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f107808f = true;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f107808f = false;
            if ((this.f107807e <= 3 || !view.canScrollVertically(1) || !view.canScrollVertically(-1)) && this.f107805c) {
                this.f107805c = false;
                this.f107803a.mo12926b();
            }
        }
    }

    /* renamed from: a */
    public void mo152458a(View view, int i, int i2, int i3, int i4, String str) {
        m169107c(str);
        if (i2 != this.f107806d) {
            this.f107806d = i2;
            if (!this.f107805c && this.f107808f) {
                this.f107805c = true;
                this.f107803a.mo12923a();
            }
        }
        int abs = Math.abs(i2 - i4);
        this.f107807e = abs;
        if ((abs <= 3 || !view.canScrollVertically(1) || !view.canScrollVertically(-1)) && !this.f107808f && this.f107805c) {
            this.f107805c = false;
            this.f107803a.mo12926b();
        }
    }
}
