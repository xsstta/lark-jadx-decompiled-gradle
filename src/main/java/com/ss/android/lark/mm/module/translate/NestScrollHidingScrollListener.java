package com.ss.android.lark.mm.module.translate;

import androidx.core.widget.NestedScrollView;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH&J2\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\tH&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mm/module/translate/NestScrollHidingScrollListener;", "Landroidx/core/widget/NestedScrollView$OnScrollChangeListener;", "()V", "HIDE_THRESHOLD", "", "controlsVisible", "", "scrolledDistance", "onHide", "", "onScrollChange", "v", "Landroidx/core/widget/NestedScrollView;", "scrollX", "scrollY", "oldScrollX", "oldScrollY", "onShow", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.b.f */
public abstract class NestScrollHidingScrollListener implements NestedScrollView.AbstractC0934b {

    /* renamed from: a */
    private final int f115755a = C57582a.m223600a(20);

    /* renamed from: b */
    private int f115756b;

    /* renamed from: c */
    private boolean f115757c = true;

    /* renamed from: a */
    public abstract void mo161308a();

    /* renamed from: b */
    public abstract void mo161309b();

    @Override // androidx.core.widget.NestedScrollView.AbstractC0934b
    /* renamed from: a */
    public void mo742a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        boolean z;
        int i5 = i2 - i4;
        int i6 = this.f115756b;
        int i7 = this.f115755a;
        boolean z2 = true;
        if (i6 > i7 && this.f115757c) {
            mo161308a();
            this.f115757c = false;
            this.f115756b = 0;
        } else if (i6 < (-i7) && !this.f115757c) {
            mo161309b();
            this.f115757c = true;
            this.f115756b = 0;
        }
        boolean z3 = this.f115757c;
        if (!z3 || i5 <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z3 || i5 >= 0) {
            z2 = false;
        }
        if (z || z2) {
            this.f115756b += i5;
        }
    }
}
