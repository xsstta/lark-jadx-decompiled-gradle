package com.ss.android.lark.profile.func.user_profile.header.cta;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/cta/CtaViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "iconIv", "Landroid/widget/ImageView;", "getIconIv", "()Landroid/widget/ImageView;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.header.cta.c */
public final class CtaViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final ImageView f130213a;

    /* renamed from: a */
    public final ImageView mo179830a() {
        return this.f130213a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CtaViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        ImageView imageView = (ImageView) view.findViewById(R.id.mCtaIconIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.mCtaIconIv");
        this.f130213a = imageView;
    }
}
