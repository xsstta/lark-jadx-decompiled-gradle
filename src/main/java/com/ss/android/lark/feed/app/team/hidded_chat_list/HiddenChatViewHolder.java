package com.ss.android.lark.feed.app.team.hidded_chat_list;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.h6ah4i.android.widget.advrecyclerview.utils.AbstractC23303b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020\u0003H\u0016J \u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006+"}, d2 = {"Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatViewHolder;", "Lcom/h6ah4i/android/widget/advrecyclerview/utils/AbstractSwipeableItemViewHolder;", "contentView", "Landroid/view/View;", "(Landroid/view/View;)V", "atView", "Lcom/larksuite/component/ui/avatar/v2/LarkAvatarView;", "getAtView", "()Lcom/larksuite/component/ui/avatar/v2/LarkAvatarView;", "badgeView", "Lcom/larksuite/component/ui/imageview/LKUIBadgeView;", "getBadgeView", "()Lcom/larksuite/component/ui/imageview/LKUIBadgeView;", "chatInfoContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getChatInfoContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "chatNameView", "Landroid/widget/TextView;", "getChatNameView", "()Landroid/widget/TextView;", "secretIconView", "Landroid/widget/ImageView;", "getSecretIconView", "()Landroid/widget/ImageView;", "showChatActionView", "Landroid/widget/LinearLayout;", "getShowChatActionView", "()Landroid/widget/LinearLayout;", "slideActionContainer", "Landroid/widget/FrameLayout;", "getSlideActionContainer", "()Landroid/widget/FrameLayout;", "calculateMaxSwipeAmount", "", "getSwipeableContainerView", "onSlideAmountUpdated", "horizontalAmount", "", "verticalAmount", "isSwiping", "", "onSwipingToLeft", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.c */
public final class HiddenChatViewHolder extends AbstractC23303b {

    /* renamed from: a */
    private final FrameLayout f97176a;

    /* renamed from: b */
    private final LinearLayout f97177b;

    /* renamed from: c */
    private final ConstraintLayout f97178c;

    /* renamed from: d */
    private final TextView f97179d;

    /* renamed from: e */
    private final ImageView f97180e;

    /* renamed from: f */
    private final LarkAvatarView f97181f;

    /* renamed from: g */
    private final LKUIBadgeView f97182g;

    /* renamed from: l */
    public final FrameLayout mo138808l() {
        return this.f97176a;
    }

    /* renamed from: m */
    public final LinearLayout mo138809m() {
        return this.f97177b;
    }

    /* renamed from: n */
    public final ConstraintLayout mo138810n() {
        return this.f97178c;
    }

    /* renamed from: o */
    public final TextView mo138811o() {
        return this.f97179d;
    }

    /* renamed from: p */
    public final ImageView mo138812p() {
        return this.f97180e;
    }

    /* renamed from: q */
    public final LarkAvatarView mo138813q() {
        return this.f97181f;
    }

    /* renamed from: r */
    public final LKUIBadgeView mo138814r() {
        return this.f97182g;
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23298h
    /* renamed from: k */
    public View mo80851k() {
        return this.f97178c;
    }

    /* renamed from: s */
    public final void mo138815s() {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        mo80866c(-(((float) this.f97177b.getMeasuredWidth()) / ((float) DeviceUtils.getScreenWidth(view.getContext()))));
    }

    /* renamed from: e */
    private final void m149109e(float f) {
        float g = f / mo80847g();
        float f2 = (float) 1;
        if (g <= f2 && g >= ((float) 0)) {
            this.f97177b.setTranslationX(((float) this.f97177b.getMeasuredWidth()) * (f2 - g));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HiddenChatViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "contentView");
        View findViewById = view.findViewById(R.id.slide_action_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "contentView.findViewById…d.slide_action_container)");
        this.f97176a = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.show_chat_action);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "contentView.findViewById(R.id.show_chat_action)");
        this.f97177b = (LinearLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.chat_info_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "contentView.findViewById(R.id.chat_info_container)");
        this.f97178c = (ConstraintLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.chat_name);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "contentView.findViewById(R.id.chat_name)");
        this.f97179d = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.secret_icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "contentView.findViewById(R.id.secret_icon)");
        this.f97180e = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.at_avatar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "contentView.findViewById(R.id.at_avatar)");
        this.f97181f = (LarkAvatarView) findViewById6;
        View findViewById7 = view.findViewById(R.id.chat_badge);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "contentView.findViewById(R.id.chat_badge)");
        this.f97182g = (LKUIBadgeView) findViewById7;
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.utils.AbstractC23303b, com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23298h
    /* renamed from: a */
    public void mo80836a(float f, float f2, boolean z) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            m149109e(f);
        }
    }
}
