package com.ss.android.lark.money.redpacket.record;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001e\u0010\u001a\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001e\u0010\u001d\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001e\u0010 \u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001e\u0010#\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R\u001e\u0010/\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u0010\u0010¨\u00062"}, d2 = {"Lcom/ss/android/lark/money/redpacket/record/RedPacketRecordHeader;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "avatarIV", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "getAvatarIV", "()Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "setAvatarIV", "(Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;)V", "expiredTV", "Landroid/widget/TextView;", "getExpiredTV", "()Landroid/widget/TextView;", "setExpiredTV", "(Landroid/widget/TextView;)V", "moneyLayout", "Landroid/view/ViewGroup;", "getMoneyLayout", "()Landroid/view/ViewGroup;", "setMoneyLayout", "(Landroid/view/ViewGroup;)V", "moneyTV", "getMoneyTV", "setMoneyTV", "recordDivider", "getRecordDivider", "setRecordDivider", "recordTV", "getRecordTV", "setRecordTV", "senderTv", "getSenderTv", "setSenderTv", "subjectTv", "getSubjectTv", "setSubjectTv", "withdrawIV", "Landroid/widget/ImageView;", "getWithdrawIV", "()Landroid/widget/ImageView;", "setWithdrawIV", "(Landroid/widget/ImageView;)V", "withdrawLayout", "getWithdrawLayout", "setWithdrawLayout", "withdrawTV", "getWithdrawTV", "setWithdrawTV", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class RedPacketRecordHeader extends RecyclerView.ViewHolder {
    @BindView(7082)
    public LKUIRoundedImageView2 avatarIV;
    @BindView(7095)
    public TextView expiredTV;
    @BindView(7098)
    public ViewGroup moneyLayout;
    @BindView(7099)
    public TextView moneyTV;
    @BindView(7102)
    public ViewGroup recordDivider;
    @BindView(7104)
    public TextView recordTV;
    @BindView(7105)
    public TextView senderTv;
    @BindView(7106)
    public TextView subjectTv;
    @BindView(7112)
    public ImageView withdrawIV;
    @BindView(7113)
    public ViewGroup withdrawLayout;
    @BindView(7114)
    public TextView withdrawTV;

    /* renamed from: a */
    public final LKUIRoundedImageView2 mo168557a() {
        LKUIRoundedImageView2 lKUIRoundedImageView2 = this.avatarIV;
        if (lKUIRoundedImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarIV");
        }
        return lKUIRoundedImageView2;
    }

    /* renamed from: b */
    public final TextView mo168558b() {
        TextView textView = this.senderTv;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("senderTv");
        }
        return textView;
    }

    /* renamed from: c */
    public final TextView mo168559c() {
        TextView textView = this.subjectTv;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subjectTv");
        }
        return textView;
    }

    /* renamed from: d */
    public final ViewGroup mo168560d() {
        ViewGroup viewGroup = this.moneyLayout;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moneyLayout");
        }
        return viewGroup;
    }

    /* renamed from: e */
    public final TextView mo168561e() {
        TextView textView = this.moneyTV;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moneyTV");
        }
        return textView;
    }

    /* renamed from: f */
    public final TextView mo168562f() {
        TextView textView = this.withdrawTV;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("withdrawTV");
        }
        return textView;
    }

    /* renamed from: g */
    public final ViewGroup mo168563g() {
        ViewGroup viewGroup = this.withdrawLayout;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("withdrawLayout");
        }
        return viewGroup;
    }

    /* renamed from: h */
    public final ImageView mo168564h() {
        ImageView imageView = this.withdrawIV;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("withdrawIV");
        }
        return imageView;
    }

    /* renamed from: i */
    public final TextView mo168565i() {
        TextView textView = this.expiredTV;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expiredTV");
        }
        return textView;
    }

    /* renamed from: j */
    public final ViewGroup mo168566j() {
        ViewGroup viewGroup = this.recordDivider;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordDivider");
        }
        return viewGroup;
    }

    /* renamed from: k */
    public final TextView mo168567k() {
        TextView textView = this.recordTV;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordTV");
        }
        return textView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RedPacketRecordHeader(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        ButterKnife.bind(this, view);
    }
}
