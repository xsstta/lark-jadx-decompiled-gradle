package com.bytedance.ee.bear.widgets.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ee.bear.widgets.universedesign.SpaceShadowLayout;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/widgets/button/CommonEditButton;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "getCreateButton", "Landroidx/appcompat/widget/AppCompatImageView;", "setEnabled", "", "enabled", "", "setOnClickListener", "l", "Landroid/view/View$OnClickListener;", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CommonEditButton extends FrameLayout {

    /* renamed from: a */
    private HashMap f31860a;

    public CommonEditButton(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public CommonEditButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public CommonEditButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    /* renamed from: a */
    public View mo45296a(int i) {
        if (this.f31860a == null) {
            this.f31860a = new HashMap();
        }
        View view = (View) this.f31860a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f31860a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final AppCompatImageView getCreateButton() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo45296a(R.id.edit_button);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "edit_button");
        return appCompatImageView;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        ((AppCompatImageView) mo45296a(R.id.edit_button)).setOnClickListener(onClickListener);
    }

    public void setEnabled(boolean z) {
        int i;
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo45296a(R.id.edit_button);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "edit_button");
        appCompatImageView.setEnabled(z);
        if (z) {
            i = R.color.ud_shadow_s4_pri;
        } else {
            i = R.color.ud_shadow_s4;
        }
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ((SpaceShadowLayout) mo45296a(R.id.edit_button_shadow)).setShadowColor(context.getResources().getColor(i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonEditButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.facade_layout_edit_button, (ViewGroup) this, true);
        setVisibility(8);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommonEditButton(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
