package com.bytedance.ee.bear.bitable.card.view.record;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/record/PlaceholderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "getRootView", "()Landroid/view/View;", "setHeight", "", "height", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.a.g */
public final class PlaceholderViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final View f13394a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlaceholderViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f13394a = view;
    }

    /* renamed from: a */
    public final void mo17930a(int i) {
        ViewGroup.LayoutParams layoutParams = this.f13394a.getLayoutParams();
        layoutParams.height = i;
        this.f13394a.setLayoutParams(layoutParams);
    }
}
