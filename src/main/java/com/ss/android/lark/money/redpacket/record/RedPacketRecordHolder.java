package com.ss.android.lark.money.redpacket.record;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0004R\u001e\u0010\u0018\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/money/redpacket/record/RedPacketRecordHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mAvatarIV", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "getMAvatarIV", "()Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "setMAvatarIV", "(Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;)V", "mGrabAmountTV", "Landroid/widget/TextView;", "getMGrabAmountTV", "()Landroid/widget/TextView;", "setMGrabAmountTV", "(Landroid/widget/TextView;)V", "mGrabTimeTV", "getMGrabTimeTV", "setMGrabTimeTV", "mLuckyLayout", "getMLuckyLayout", "()Landroid/view/View;", "setMLuckyLayout", "mUserNameTV", "getMUserNameTV", "setMUserNameTV", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class RedPacketRecordHolder extends RecyclerView.ViewHolder {
    @BindView(7062)
    public LKUIRoundedImageView mAvatarIV;
    @BindView(7061)
    public TextView mGrabAmountTV;
    @BindView(7067)
    public TextView mGrabTimeTV;
    @BindView(7065)
    public View mLuckyLayout;
    @BindView(7068)
    public TextView mUserNameTV;

    /* renamed from: a */
    public final TextView mo168568a() {
        TextView textView = this.mUserNameTV;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserNameTV");
        }
        return textView;
    }

    /* renamed from: b */
    public final TextView mo168569b() {
        TextView textView = this.mGrabTimeTV;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGrabTimeTV");
        }
        return textView;
    }

    /* renamed from: c */
    public final LKUIRoundedImageView mo168570c() {
        LKUIRoundedImageView lKUIRoundedImageView = this.mAvatarIV;
        if (lKUIRoundedImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvatarIV");
        }
        return lKUIRoundedImageView;
    }

    /* renamed from: d */
    public final TextView mo168571d() {
        TextView textView = this.mGrabAmountTV;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGrabAmountTV");
        }
        return textView;
    }

    /* renamed from: e */
    public final View mo168572e() {
        View view = this.mLuckyLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLuckyLayout");
        }
        return view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RedPacketRecordHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        ButterKnife.bind(this, view);
    }
}
