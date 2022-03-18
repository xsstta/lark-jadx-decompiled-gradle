package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.flexbox.b */
public class C21536b {

    /* renamed from: a */
    int f52297a = Integer.MAX_VALUE;

    /* renamed from: b */
    int f52298b = Integer.MAX_VALUE;

    /* renamed from: c */
    int f52299c = Integer.MIN_VALUE;

    /* renamed from: d */
    int f52300d = Integer.MIN_VALUE;

    /* renamed from: e */
    int f52301e;

    /* renamed from: f */
    int f52302f;

    /* renamed from: g */
    int f52303g;

    /* renamed from: h */
    int f52304h;

    /* renamed from: i */
    int f52305i;

    /* renamed from: j */
    float f52306j;

    /* renamed from: k */
    float f52307k;

    /* renamed from: l */
    int f52308l;

    /* renamed from: m */
    int f52309m;

    /* renamed from: n */
    List<Integer> f52310n = new ArrayList();

    /* renamed from: o */
    int f52311o;

    /* renamed from: p */
    int f52312p;

    /* renamed from: a */
    public int mo72892a() {
        return this.f52303g;
    }

    /* renamed from: b */
    public int mo72894b() {
        return this.f52304h;
    }

    /* renamed from: c */
    public int mo72895c() {
        return this.f52304h - this.f52305i;
    }

    C21536b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo72893a(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f52297a = Math.min(this.f52297a, (view.getLeft() - flexItem.mo72802m()) - i);
        this.f52298b = Math.min(this.f52298b, (view.getTop() - flexItem.mo72803n()) - i2);
        this.f52299c = Math.max(this.f52299c, view.getRight() + flexItem.mo72804o() + i3);
        this.f52300d = Math.max(this.f52300d, view.getBottom() + flexItem.mo72805p() + i4);
    }
}
