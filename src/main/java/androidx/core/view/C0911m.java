package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.core.view.m */
public class C0911m {

    /* renamed from: a */
    private int f3463a;

    /* renamed from: b */
    private int f3464b;

    /* renamed from: a */
    public int mo4707a() {
        return this.f3463a | this.f3464b;
    }

    public C0911m(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public void mo4708a(View view) {
        mo4709a(view, 0);
    }

    /* renamed from: a */
    public void mo4709a(View view, int i) {
        if (i == 1) {
            this.f3464b = 0;
        } else {
            this.f3463a = 0;
        }
    }

    /* renamed from: a */
    public void mo4710a(View view, View view2, int i) {
        mo4711a(view, view2, i, 0);
    }

    /* renamed from: a */
    public void mo4711a(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f3464b = i;
        } else {
            this.f3463a = i;
        }
    }
}
