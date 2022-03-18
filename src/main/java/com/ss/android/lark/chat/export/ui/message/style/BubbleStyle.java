package com.ss.android.lark.chat.export.ui.message.style;

import android.view.View;
import java.lang.ref.WeakReference;

public class BubbleStyle {

    /* renamed from: a */
    private static final BubbleStyle f87988a = new BubbleStyle();

    /* renamed from: b */
    private int f87989b;

    /* renamed from: c */
    private int[] f87990c;

    /* renamed from: d */
    private WeakReference<View> f87991d;

    /* renamed from: e */
    private int f87992e = -1;

    /* renamed from: f */
    private int f87993f = -1;

    /* renamed from: g */
    private int f87994g;

    /* renamed from: h */
    private int f87995h;

    /* renamed from: i */
    private boolean f87996i;

    public @interface ColorType {
    }

    /* renamed from: a */
    public int mo126140a() {
        return this.f87995h;
    }

    /* renamed from: c */
    public int mo126148c() {
        return this.f87994g;
    }

    /* renamed from: f */
    public boolean mo126152f() {
        return this.f87996i;
    }

    /* renamed from: b */
    public int[] mo126147b() {
        return this.f87990c;
    }

    private BubbleStyle() {
    }

    /* renamed from: e */
    public View mo126151e() {
        return this.f87991d.get();
    }

    /* renamed from: g */
    private void m131965g() {
        this.f87991d = null;
        this.f87989b = 0;
        this.f87994g = 0;
        mo126146b(0);
        mo126149c(0);
        mo126142a(-1, -1);
        this.f87996i = false;
    }

    /* renamed from: d */
    public int[] mo126150d() {
        int i = this.f87992e;
        if (i == -1 && this.f87993f == -1) {
            return null;
        }
        return new int[]{i, this.f87993f};
    }

    /* renamed from: b */
    public void mo126146b(int i) {
        this.f87995h = i;
    }

    /* renamed from: a */
    public void mo126141a(int i) {
        this.f87994g = i;
    }

    /* renamed from: c */
    public void mo126149c(int i) {
        this.f87990c = new int[]{i, i, i, i};
    }

    /* renamed from: a */
    public void mo126143a(View view) {
        this.f87991d = new WeakReference<>(view);
    }

    /* renamed from: a */
    public void mo126144a(boolean z) {
        this.f87996i = z;
    }

    /* renamed from: a */
    public void mo126145a(int[] iArr) {
        if (iArr == null || iArr.length != 4) {
            mo126149c(0);
        } else {
            this.f87990c = iArr;
        }
    }

    /* renamed from: a */
    public void mo126142a(int i, int i2) {
        this.f87992e = i;
        this.f87993f = i2;
    }

    /* renamed from: a */
    public static BubbleStyle m131963a(int i, View view, int i2) {
        BubbleStyle bubbleStyle = f87988a;
        bubbleStyle.m131965g();
        bubbleStyle.mo126141a(i);
        bubbleStyle.mo126143a(view);
        bubbleStyle.mo126149c(i2);
        return bubbleStyle;
    }

    /* renamed from: a */
    public static BubbleStyle m131964a(int i, View view, int[] iArr) {
        BubbleStyle bubbleStyle = f87988a;
        bubbleStyle.m131965g();
        bubbleStyle.mo126141a(i);
        bubbleStyle.mo126143a(view);
        bubbleStyle.mo126145a(iArr);
        return bubbleStyle;
    }
}
