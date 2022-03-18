package com.larksuite.component.universe_design.datepicker.impl.infinite;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\rR\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/infinite/InfinitePageView;", "", "context", "Landroid/content/Context;", "childView", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "<set-?>", "getChildView", "()Landroid/view/View;", "mParent", "Landroid/widget/FrameLayout;", "addChildView", "", "view", "getParentView", "removeChildFromParent", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.datepicker.impl.infinite.a */
public final class InfinitePageView {

    /* renamed from: a */
    private final FrameLayout f63246a;

    /* renamed from: b */
    private View f63247b;

    /* renamed from: a */
    public final View mo90541a() {
        return this.f63247b;
    }

    /* renamed from: b */
    public final void mo90543b() {
        this.f63246a.removeAllViews();
    }

    /* renamed from: c */
    public final View mo90544c() {
        return this.f63246a;
    }

    /* renamed from: a */
    public final void mo90542a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f63247b = view;
        this.f63246a.addView(view);
    }

    public InfinitePageView(Context context, View view) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "childView");
        FrameLayout frameLayout = new FrameLayout(context);
        this.f63246a = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f63247b = view;
        mo90542a(view);
    }
}
