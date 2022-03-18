package com.ss.android.lark.mm.module.translate;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\tH&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mm/module/translate/RvHidingScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "()V", "HIDE_THRESHOLD", "", "controlsVisible", "", "scrolledDistance", "onHide", "", "onScrolled", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "onShow", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.b.g */
public abstract class RvHidingScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    private final int f115758a = C57582a.m223600a(20);

    /* renamed from: b */
    private int f115759b;

    /* renamed from: c */
    private boolean f115760c = true;

    /* renamed from: a */
    public abstract void mo161310a();

    /* renamed from: b */
    public abstract void mo161311b();

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        int i3 = this.f115759b;
        int i4 = this.f115758a;
        boolean z2 = true;
        if (i3 > i4 && this.f115760c) {
            mo161310a();
            this.f115760c = false;
            this.f115759b = 0;
        } else if (i3 < (-i4) && !this.f115760c) {
            mo161311b();
            this.f115760c = true;
            this.f115759b = 0;
        }
        boolean z3 = this.f115760c;
        if (!z3 || i2 <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z3 || i2 >= 0) {
            z2 = false;
        }
        if (z || z2) {
            this.f115759b += i2;
        }
    }
}
