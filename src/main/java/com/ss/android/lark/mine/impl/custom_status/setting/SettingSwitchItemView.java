package com.ss.android.lark.mine.impl.custom_status.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0006\u0010\u0014\u001a\u00020\rJ\u0006\u0010\u0015\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\rJ\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0006\u0010\u001a\u001a\u00020\u0018J\u0010\u0010\u001b\u001a\u00020\u00182\b\b\u0001\u0010\u001c\u001a\u00020\u0007J\u0010\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u000fJ\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u000fJ\u0010\u0010#\u001a\u00020\u00182\b\b\u0001\u0010\u001c\u001a\u00020\u0007J\u0010\u0010#\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/setting/SettingSwitchItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "hintText", "", "hintTextView", "Landroid/widget/TextView;", "switchChecked", "", "switchView", "Lcom/larksuite/component/universe_design/udswitch/UDSwitch;", "titleText", "titleTextView", "getHintTextView", "getSwitchView", "getTitleTextView", "init", "", "initAttr", "revertSwitch", "setHintText", "string", "setOnCheckedChangeListener", "listener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setSwitchChecked", "checked", "setSwitchCheckedIgnoreEvent", "setTitleText", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SettingSwitchItemView extends FrameLayout {

    /* renamed from: a */
    private TextView f115238a;

    /* renamed from: b */
    private TextView f115239b;

    /* renamed from: c */
    private UDSwitch f115240c;

    /* renamed from: d */
    private String f115241d;

    /* renamed from: e */
    private String f115242e;

    /* renamed from: f */
    private boolean f115243f;

    public SettingSwitchItemView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public SettingSwitchItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public SettingSwitchItemView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public final TextView getHintTextView() {
        TextView textView = this.f115239b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hintTextView");
        }
        return textView;
    }

    public final UDSwitch getSwitchView() {
        UDSwitch uDSwitch = this.f115240c;
        if (uDSwitch == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchView");
        }
        return uDSwitch;
    }

    public final TextView getTitleTextView() {
        TextView textView = this.f115238a;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleTextView");
        }
        return textView;
    }

    /* renamed from: a */
    public final void mo160715a() {
        UDSwitch uDSwitch = this.f115240c;
        if (uDSwitch == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchView");
        }
        UDSwitch uDSwitch2 = this.f115240c;
        if (uDSwitch2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchView");
        }
        uDSwitch.setCheckedIgnoreEvent(!uDSwitch2.isChecked());
    }

    public final void setHintText(int i) {
        setHintText(getContext().getString(i));
    }

    public final void setSwitchChecked(boolean z) {
        UDSwitch uDSwitch = this.f115240c;
        if (uDSwitch == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchView");
        }
        uDSwitch.setChecked(z);
    }

    public final void setSwitchCheckedIgnoreEvent(boolean z) {
        UDSwitch uDSwitch = this.f115240c;
        if (uDSwitch == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchView");
        }
        uDSwitch.setCheckedIgnoreEvent(z);
    }

    public final void setTitleText(int i) {
        setTitleText(getContext().getString(i));
    }

    public final void setHintText(String str) {
        TextView textView = this.f115239b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hintTextView");
        }
        textView.setText(str);
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        Intrinsics.checkParameterIsNotNull(onCheckedChangeListener, "listener");
        UDSwitch uDSwitch = this.f115240c;
        if (uDSwitch == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchView");
        }
        uDSwitch.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public final void setTitleText(String str) {
        TextView textView = this.f115238a;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleTextView");
        }
        textView.setText(str);
    }

    /* renamed from: b */
    private final void m180971b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.hint_text, R.attr.switch_checked, R.attr.title_text});
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…le.SettingSwitchItemView)");
        this.f115241d = obtainStyledAttributes.getString(2);
        this.f115242e = obtainStyledAttributes.getString(0);
        this.f115243f = obtainStyledAttributes.getBoolean(1, false);
        Unit unit = Unit.INSTANCE;
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private final void m180970a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            m180971b(context, attributeSet);
        }
        LayoutInflater.from(getContext()).inflate(R.layout.setting_switch_view, this);
        View findViewById = findViewById(R.id.setting_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.setting_title)");
        this.f115238a = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.setting_hint);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.setting_hint)");
        this.f115239b = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.setting_switch);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.setting_switch)");
        this.f115240c = (UDSwitch) findViewById3;
        setTitleText(this.f115241d);
        setHintText(this.f115242e);
        setSwitchChecked(this.f115243f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingSwitchItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m180970a(context, attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SettingSwitchItemView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
