package com.ss.android.lark.search.impl.binder.listeners;

import android.view.View;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/search/impl/binder/listeners/OnSearchSingleClickListener;", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "clickListener", "Landroid/view/View$OnClickListener;", "(Landroid/view/View$OnClickListener;)V", "onSingleClick", "", "view", "Landroid/view/View;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.binder.c.a */
public final class OnSearchSingleClickListener extends OnSingleClickListener {

    /* renamed from: a */
    private final View.OnClickListener f131869a;

    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
    public void onSingleClick(View view) {
        this.f131869a.onClick(view);
    }

    public OnSearchSingleClickListener(View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
        this.f131869a = onClickListener;
    }
}
