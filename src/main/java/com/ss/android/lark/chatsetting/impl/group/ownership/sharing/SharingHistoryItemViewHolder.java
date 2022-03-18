package com.ss.android.lark.chatsetting.impl.group.ownership.sharing;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0014\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\u0016\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\u0018\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\u001a\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "avatarView", "Landroid/widget/ImageView;", "getAvatarView", "()Landroid/widget/ImageView;", "checkBox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "getCheckBox", "()Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "deactivatedTv", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getDeactivatedTv", "()Landroid/widget/TextView;", "docIcon", "getDocIcon", "nameTv", "getNameTv", "targetTv", "getTargetTv", "timeTv", "getTimeTv", "waysTv", "getWaysTv", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.h */
public final class SharingHistoryItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final UDCheckBox f89883a;

    /* renamed from: b */
    private final ImageView f89884b;

    /* renamed from: c */
    private final TextView f89885c;

    /* renamed from: d */
    private final TextView f89886d;

    /* renamed from: e */
    private final TextView f89887e;

    /* renamed from: f */
    private final TextView f89888f;

    /* renamed from: g */
    private final TextView f89889g;

    /* renamed from: h */
    private final ImageView f89890h;

    /* renamed from: a */
    public final UDCheckBox mo128476a() {
        return this.f89883a;
    }

    /* renamed from: b */
    public final ImageView mo128477b() {
        return this.f89884b;
    }

    /* renamed from: c */
    public final TextView mo128478c() {
        return this.f89885c;
    }

    /* renamed from: d */
    public final TextView mo128479d() {
        return this.f89886d;
    }

    /* renamed from: e */
    public final TextView mo128480e() {
        return this.f89887e;
    }

    /* renamed from: f */
    public final TextView mo128481f() {
        return this.f89888f;
    }

    /* renamed from: g */
    public final TextView mo128482g() {
        return this.f89889g;
    }

    /* renamed from: h */
    public final ImageView mo128483h() {
        return this.f89890h;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharingHistoryItemViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        UDCheckBox uDCheckBox = (UDCheckBox) view.findViewById(R.id.checkbox);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "itemView.checkbox");
        this.f89883a = uDCheckBox;
        LKUIRoundedImageView lKUIRoundedImageView = (LKUIRoundedImageView) view.findViewById(R.id.avator);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView, "itemView.avator");
        this.f89884b = lKUIRoundedImageView;
        this.f89885c = (TextView) view.findViewById(R.id.name_tv);
        this.f89886d = (TextView) view.findViewById(R.id.ways);
        this.f89887e = (TextView) view.findViewById(R.id.target_tv);
        this.f89888f = (TextView) view.findViewById(R.id.time_tv);
        this.f89889g = (TextView) view.findViewById(R.id.deactivated_tv);
        this.f89890h = (ImageView) view.findViewById(R.id.docIcon);
    }
}
