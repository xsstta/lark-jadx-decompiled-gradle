package com.ss.android.lark.searchcommon.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0012R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/AvatarItemViewWithMask;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "item", "Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView;", "getItem", "()Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView;", "setItem", "(Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView;)V", "shadow", "Landroid/view/View;", "hideShadow", "", "showDivider", "", "showShadow", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AvatarItemViewWithMask extends RelativeLayout {

    /* renamed from: a */
    private View f133418a;

    /* renamed from: b */
    private AvatarItemView f133419b;

    public AvatarItemViewWithMask(Context context) {
        this(context, null, 0, 6, null);
    }

    public AvatarItemViewWithMask(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final AvatarItemView getItem() {
        return this.f133419b;
    }

    /* renamed from: a */
    public final void mo184573a() {
        this.f133418a.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo184575b() {
        this.f133418a.setVisibility(8);
    }

    public final void setItem(AvatarItemView avatarItemView) {
        Intrinsics.checkParameterIsNotNull(avatarItemView, "<set-?>");
        this.f133419b = avatarItemView;
    }

    /* renamed from: a */
    public final void mo184574a(boolean z) {
        this.f133419b.mo184680b(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarItemViewWithMask(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        AvatarItemView avatarItemView = new AvatarItemView(context, null, 0, null, 14, null);
        this.f133419b = avatarItemView;
        avatarItemView.setId(R.id.avatar_item);
        this.f133419b.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        addView(this.f133419b);
        View view = new View(context);
        this.f133418a = view;
        view.setBackgroundColor(context.getResources().getColor(R.color.avatar_item_mask));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(18, this.f133419b.getId());
        layoutParams.addRule(19, this.f133419b.getId());
        layoutParams.addRule(6, this.f133419b.getId());
        layoutParams.addRule(8, this.f133419b.getId());
        this.f133418a.setLayoutParams(layoutParams);
        addView(this.f133418a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvatarItemViewWithMask(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
