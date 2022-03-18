package com.ss.android.lark.calendar.impl.features.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\b\u001a\u00020\u00002\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tJ\u0016\u0010\u000b\u001a\u00020\u00002\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tJ\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J \u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/recyclerview/BoundaryCallback;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "Ljava/lang/Runnable;", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroidx/recyclerview/widget/RecyclerView;)V", "lastDirection", "", "onReachEnd", "Lkotlin/Function0;", "", "onReachStart", "pending", "", "thresholdCount", "getThresholdCount", "()I", "setThresholdCount", "(I)V", "callback", "onScrollStateChanged", "recyclerView", "newState", "onScrolled", "dx", "dy", "run", "tryInvoke", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.b.b */
public final class BoundaryCallback extends RecyclerView.OnScrollListener implements Runnable {

    /* renamed from: a */
    private int f75572a = 5;

    /* renamed from: b */
    private Function0<Unit> f75573b;

    /* renamed from: c */
    private Function0<Unit> f75574c;

    /* renamed from: d */
    private boolean f75575d;

    /* renamed from: e */
    private int f75576e;

    /* renamed from: f */
    private final RecyclerView f75577f;

    /* renamed from: a */
    private final void m112256a() {
        if (!this.f75575d) {
            this.f75575d = true;
            this.f75577f.postDelayed(this, 100);
        }
    }

    public void run() {
        Function0<Unit> function0;
        Function0<Unit> function02;
        Function0<Unit> function03;
        this.f75575d = false;
        RecyclerView.Adapter adapter = this.f75577f.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            int childCount = this.f75577f.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                RecyclerView recyclerView = this.f75577f;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i3));
                if (childAdapterPosition < i) {
                    i = childAdapterPosition;
                }
                if (childAdapterPosition > i2) {
                    i2 = childAdapterPosition;
                }
            }
            int i4 = this.f75576e;
            if (i4 < 0) {
                if (i < this.f75572a && (function03 = this.f75573b) != null) {
                    function03.invoke();
                }
            } else if (i4 > 0) {
                if (i2 > itemCount - this.f75572a && (function02 = this.f75574c) != null) {
                    function02.invoke();
                }
            } else if (i4 == 0) {
                int i5 = this.f75572a;
                if (i2 > itemCount - i5) {
                    Function0<Unit> function04 = this.f75574c;
                    if (function04 != null) {
                        function04.invoke();
                    }
                } else if (i < i5 && (function0 = this.f75573b) != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* renamed from: a */
    public final BoundaryCallback mo109141a(Function0<Unit> function0) {
        this.f75573b = function0;
        return this;
    }

    /* renamed from: b */
    public final BoundaryCallback mo109142b(Function0<Unit> function0) {
        this.f75574c = function0;
        return this;
    }

    public BoundaryCallback(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "rv");
        this.f75577f = recyclerView;
        recyclerView.addOnScrollListener(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        this.f75576e = 0;
        m112256a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        if (i2 != 0) {
            i = i2;
        } else if (i == 0) {
            return;
        }
        this.f75576e = i;
        m112256a();
    }
}
