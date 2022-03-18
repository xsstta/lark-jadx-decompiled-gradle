package com.bytedance.ee.bear.middleground.comment.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/adapter/InputViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "inputTv", "kotlin.jvm.PlatformType", "getInputTv", "()Landroid/view/View;", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.a */
public final class InputViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final View f24334a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InputViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f24334a = view.findViewById(R.id.whole_input_tv);
    }
}
