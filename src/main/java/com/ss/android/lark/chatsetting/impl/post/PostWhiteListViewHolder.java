package com.ss.android.lark.chatsetting.impl.post;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.post.i */
public final class PostWhiteListViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final ImageView f90509a;

    /* renamed from: a */
    public final ImageView mo129180a() {
        return this.f90509a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PostWhiteListViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        View findViewById = view.findViewById(R.id.white_list_avatar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.white_list_avatar)");
        this.f90509a = (ImageView) findViewById;
    }
}
