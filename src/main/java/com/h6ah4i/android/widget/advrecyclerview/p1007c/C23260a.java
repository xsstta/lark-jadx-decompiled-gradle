package com.h6ah4i.android.widget.advrecyclerview.p1007c;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.c.a */
public class C23260a {

    /* renamed from: a */
    private RecyclerView.AbstractC1338g f57333a = new RecyclerView.AbstractC1338g() {
        /* class com.h6ah4i.android.widget.advrecyclerview.p1007c.C23260a.C232611 */

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
        /* renamed from: a */
        public void mo6561a(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
        /* renamed from: a */
        public boolean mo6562a(RecyclerView recyclerView, MotionEvent motionEvent) {
            return C23260a.this.mo80680a(recyclerView, motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
        /* renamed from: b */
        public void mo6563b(RecyclerView recyclerView, MotionEvent motionEvent) {
            C23260a.this.mo80681b(recyclerView, motionEvent);
        }
    };

    /* renamed from: b */
    private RecyclerView f57334b;

    /* renamed from: c */
    private boolean f57335c;

    /* renamed from: d */
    private int f57336d;

    /* renamed from: e */
    private int f57337e;

    /* renamed from: f */
    private int f57338f;

    /* renamed from: g */
    private boolean f57339g;

    /* renamed from: h */
    private boolean f57340h;

    /* renamed from: b */
    private void m84350b() {
        this.f57335c = false;
        this.f57336d = 0;
        this.f57337e = 0;
    }

    /* renamed from: a */
    public boolean mo80679a() {
        if (this.f57333a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo80682b(boolean z) {
        this.f57340h = z;
    }

    /* renamed from: a */
    private void m84349a(MotionEvent motionEvent) {
        int y = (int) (motionEvent.getY() + 0.5f);
        this.f57337e = y;
        this.f57336d = y;
        this.f57335c = false;
    }

    /* renamed from: a */
    public void mo80678a(boolean z) {
        if (this.f57339g != z) {
            this.f57339g = z;
            if (!z) {
                m84350b();
            }
        }
    }

    /* renamed from: a */
    public void mo80677a(RecyclerView recyclerView) {
        if (mo80679a()) {
            throw new IllegalStateException("Accessing released object");
        } else if (this.f57334b == null) {
            this.f57334b = recyclerView;
            recyclerView.addOnItemTouchListener(this.f57333a);
            this.f57338f = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
        } else {
            throw new IllegalStateException("RecyclerView instance has already been set");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo80681b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f57339g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1 || actionMasked == 3) {
                m84350b();
            }
        }
    }

    /* renamed from: c */
    private boolean m84351c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.f57335c) {
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f57337e = y;
            int i = y - this.f57336d;
            if (this.f57340h && Math.abs(i) > this.f57338f && recyclerView.isAnimating()) {
                this.f57335c = true;
            }
        }
        return this.f57335c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r0 != 3) goto L_0x0024;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo80680a(androidx.recyclerview.widget.RecyclerView r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.f57339g
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r6.getActionMasked()
            if (r0 == 0) goto L_0x0021
            r2 = 1
            if (r0 == r2) goto L_0x001d
            r3 = 2
            if (r0 == r3) goto L_0x0016
            r5 = 3
            if (r0 == r5) goto L_0x001d
            goto L_0x0024
        L_0x0016:
            boolean r5 = r4.m84351c(r5, r6)
            if (r5 == 0) goto L_0x0024
            return r2
        L_0x001d:
            r4.m84350b()
            goto L_0x0024
        L_0x0021:
            r4.m84349a(r6)
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.h6ah4i.android.widget.advrecyclerview.p1007c.C23260a.mo80680a(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }
}
