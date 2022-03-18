package com.ss.android.lark.chatsetting.impl.group.ownership.applicant;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "additionalComments", "Landroid/widget/TextView;", "getAdditionalComments", "()Landroid/widget/TextView;", "avatorIv", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "getAvatorIv", "()Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "closeBtn", "getCloseBtn", "()Landroid/view/View;", "doneBtn", "getDoneBtn", "joinWayTv", "getJoinWayTv", "nameTv", "getNameTv", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.h */
public final class ApplicantViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final LKUIRoundedImageView f89608a;

    /* renamed from: b */
    private final TextView f89609b;

    /* renamed from: c */
    private final TextView f89610c;

    /* renamed from: d */
    private final View f89611d;

    /* renamed from: e */
    private final View f89612e;

    /* renamed from: f */
    private final TextView f89613f;

    /* renamed from: a */
    public final LKUIRoundedImageView mo128140a() {
        return this.f89608a;
    }

    /* renamed from: b */
    public final TextView mo128141b() {
        return this.f89609b;
    }

    /* renamed from: c */
    public final TextView mo128142c() {
        return this.f89610c;
    }

    /* renamed from: d */
    public final View mo128143d() {
        return this.f89611d;
    }

    /* renamed from: e */
    public final View mo128144e() {
        return this.f89612e;
    }

    /* renamed from: f */
    public final TextView mo128145f() {
        return this.f89613f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApplicantViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        View findViewById = view.findViewById(R.id.mAvatorIv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.mAvatorIv)");
        this.f89608a = (LKUIRoundedImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.mNameTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.mNameTv)");
        this.f89609b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.mJoinWayTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.mJoinWayTv)");
        this.f89610c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.mDoneBtn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.mDoneBtn)");
        this.f89611d = findViewById4;
        View findViewById5 = view.findViewById(R.id.mCloseBtn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.mCloseBtn)");
        this.f89612e = findViewById5;
        View findViewById6 = view.findViewById(R.id.mAdditionalComments);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "itemView.findViewById(R.id.mAdditionalComments)");
        this.f89613f = (TextView) findViewById6;
    }
}
