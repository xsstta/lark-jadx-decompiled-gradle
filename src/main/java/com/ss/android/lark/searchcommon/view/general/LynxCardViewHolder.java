package com.ss.android.lark.searchcommon.view.general;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.searchcommon.view.general.lynx.LynxCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/general/LynxCardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "container", "Landroid/widget/FrameLayout;", "(Landroid/widget/FrameLayout;)V", "getContainer", "()Landroid/widget/FrameLayout;", "lynxCard", "Lcom/ss/android/lark/searchcommon/view/general/lynx/LynxCard;", "getLynxCard", "()Lcom/ss/android/lark/searchcommon/view/general/lynx/LynxCard;", "setLynxCard", "(Lcom/ss/android/lark/searchcommon/view/general/lynx/LynxCard;)V", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.general.a */
public final class LynxCardViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private LynxCard f133768a;

    /* renamed from: b */
    private final FrameLayout f133769b;

    /* renamed from: a */
    public final LynxCard mo184943a() {
        return this.f133768a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxCardViewHolder(FrameLayout frameLayout) {
        super(frameLayout);
        Intrinsics.checkParameterIsNotNull(frameLayout, "container");
        this.f133769b = frameLayout;
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        LynxCard fVar = new LynxCard(context);
        this.f133768a = fVar;
        frameLayout.addView(fVar.mo184975a(), new FrameLayout.LayoutParams(-1, -2));
    }
}
