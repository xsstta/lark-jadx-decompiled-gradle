package com.ss.android.lark.profile.func.v3.userprofile.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.appcompat.widget.AppCompatTextView;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.v3.userprofile.p2537d.C52743a;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001 B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u001cH\u0002R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u000f@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0011\u0010\u0012R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u00138F@FX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/view/CtaView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "Lcom/ss/android/lark/profile/func/v3/userprofile/view/CtaView$CtaStyle;", "ctaStyle", "getCtaStyle", "()Lcom/ss/android/lark/profile/func/v3/userprofile/view/CtaView$CtaStyle;", "setCtaStyle", "(Lcom/ss/android/lark/profile/func/v3/userprofile/view/CtaView$CtaStyle;)V", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "setIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "text", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "textView", "Landroidx/appcompat/widget/AppCompatTextView;", "setCtaIcon", "", "iconId", "", "setUpView", "CtaStyle", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CtaView extends FrameLayout {

    /* renamed from: a */
    private CtaStyle f130654a = CtaStyle.VERTICAL;

    /* renamed from: b */
    private Drawable f130655b;

    /* renamed from: c */
    private final AppCompatTextView f130656c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/view/CtaView$CtaStyle;", "", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum CtaStyle {
        HORIZONTAL,
        VERTICAL
    }

    public final CtaStyle getCtaStyle() {
        return this.f130654a;
    }

    public final CharSequence getText() {
        return this.f130656c.getText();
    }

    /* renamed from: a */
    private final void m204539a() {
        Drawable drawable = this.f130655b;
        if (drawable != null) {
            int i = C52872a.f130670a[this.f130654a.ordinal()];
            if (i == 1) {
                AppCompatTextView appCompatTextView = this.f130656c;
                appCompatTextView.setCompoundDrawables(null, drawable, null, null);
                appCompatTextView.setCompoundDrawablePadding(0);
                appCompatTextView.setTextSize(12.0f);
            } else if (i == 2) {
                AppCompatTextView appCompatTextView2 = this.f130656c;
                appCompatTextView2.setCompoundDrawables(drawable, null, null, null);
                appCompatTextView2.setCompoundDrawablePadding(C52743a.m204272a(6));
                appCompatTextView2.setTextSize(17.0f);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void setText(CharSequence charSequence) {
        this.f130656c.setText(charSequence);
    }

    public final void setCtaStyle(CtaStyle ctaStyle) {
        Intrinsics.checkParameterIsNotNull(ctaStyle, "value");
        if (ctaStyle != this.f130654a) {
            this.f130654a = ctaStyle;
            m204539a();
        }
    }

    private final void setIconDrawable(Drawable drawable) {
        this.f130655b = drawable;
        if (drawable != null) {
            drawable.mutate();
            drawable.setTintList(C0215a.m652a(getContext(), R.color.cta_icon_bg));
        }
    }

    public final void setCtaIcon(int i) {
        Drawable c = C57582a.m223614c(getContext(), i);
        c.setBounds(0, 0, C52743a.m204272a(22), C52743a.m204272a(22));
        setIconDrawable(c);
        m204539a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CtaView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setTextColor(C0215a.m652a(appCompatTextView.getContext(), R.color.cta_text_bg));
        appCompatTextView.setGravity(17);
        this.f130656c = appCompatTextView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(appCompatTextView, layoutParams);
        setPadding(C52743a.m204272a(6), C52743a.m204272a(5), C52743a.m204272a(6), C52743a.m204272a(5));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CtaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setTextColor(C0215a.m652a(appCompatTextView.getContext(), R.color.cta_text_bg));
        appCompatTextView.setGravity(17);
        this.f130656c = appCompatTextView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(appCompatTextView, layoutParams);
        setPadding(C52743a.m204272a(6), C52743a.m204272a(5), C52743a.m204272a(6), C52743a.m204272a(5));
    }
}
