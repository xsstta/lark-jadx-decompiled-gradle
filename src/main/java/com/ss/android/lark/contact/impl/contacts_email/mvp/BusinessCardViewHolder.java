package com.ss.android.lark.contact.impl.contacts_email.mvp;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.blockit.hashtag.widget.SwipeLayout;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 ¨\u0006$"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "businessCardView", "Landroid/view/View;", "(Landroid/view/View;)V", "cardWrapper", "getCardWrapper", "()Landroid/view/View;", "setCardWrapper", "checkBox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "getCheckBox", "()Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "setCheckBox", "(Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;)V", "deleteView", "Landroid/widget/TextView;", "driver", "getDriver", "setDriver", "slRoot", "Lcom/larksuite/component/blockit/hashtag/widget/SwipeLayout;", "userAvatarView", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "getUserAvatarView", "()Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "setUserAvatarView", "(Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;)V", "userNameView", "getUserNameView", "()Landroid/widget/TextView;", "setUserNameView", "(Landroid/widget/TextView;)V", "userSubTitleView", "getUserSubTitleView", "setUserSubTitleView", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BusinessCardViewHolder extends RecyclerView.ViewHolder {
    @BindView(7012)
    public View cardWrapper;
    @BindView(8034)
    public UDCheckBox checkBox;
    @BindView(8304)
    public TextView deleteView;
    @BindView(6975)
    public View driver;
    @BindView(8102)
    public SwipeLayout slRoot;
    @BindView(7464)
    public LKUIRoundedImageView userAvatarView;
    @BindView(8342)
    public TextView userNameView;
    @BindView(8338)
    public TextView userSubTitleView;

    /* renamed from: a */
    public final View mo131141a() {
        View view = this.cardWrapper;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardWrapper");
        }
        return view;
    }

    /* renamed from: b */
    public final LKUIRoundedImageView mo131142b() {
        LKUIRoundedImageView lKUIRoundedImageView = this.userAvatarView;
        if (lKUIRoundedImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userAvatarView");
        }
        return lKUIRoundedImageView;
    }

    /* renamed from: c */
    public final TextView mo131143c() {
        TextView textView = this.userNameView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userNameView");
        }
        return textView;
    }

    /* renamed from: d */
    public final TextView mo131144d() {
        TextView textView = this.userSubTitleView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userSubTitleView");
        }
        return textView;
    }

    /* renamed from: e */
    public final UDCheckBox mo131145e() {
        UDCheckBox uDCheckBox = this.checkBox;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBox");
        }
        return uDCheckBox;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessCardViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "businessCardView");
        ButterKnife.bind(this, view);
    }
}
