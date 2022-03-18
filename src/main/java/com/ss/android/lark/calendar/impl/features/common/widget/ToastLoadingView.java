package com.ss.android.lark.calendar.impl.features.common.widget;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32659l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/ToastLoadingView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "loadingDrawable", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "value", "", "text", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "toastText", "Landroid/widget/TextView;", "onAttachedToWindow", "", "onDetachedFromWindow", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ToastLoadingView extends FrameLayout {

    /* renamed from: a */
    private final TextView f78734a;

    /* renamed from: b */
    private final CircularProgressDrawable f78735b;

    /* renamed from: c */
    private CharSequence f78736c;

    public ToastLoadingView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ToastLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final CharSequence getText() {
        return this.f78736c;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f78735b.start();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f78735b.stop();
    }

    public final void setText(CharSequence charSequence) {
        this.f78736c = charSequence;
        this.f78734a.setText(charSequence);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToastLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.calendar_view_toast_loading, this);
        setPadding(C32659l.m125335a((Number) 20), 0, C32659l.m125335a((Number) 20), 0);
        View findViewById = findViewById(R.id.ud_toast_text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.ud_toast_text)");
        this.f78734a = (TextView) findViewById;
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(context);
        circularProgressDrawable.mo7698a(1);
        circularProgressDrawable.mo7701a(UDColorUtils.getColor(context, R.color.static_white));
        circularProgressDrawable.mo7699a(Paint.Cap.ROUND);
        circularProgressDrawable.mo7694a((float) C32659l.m125335a((Number) 2));
        circularProgressDrawable.mo7703b((float) C32659l.m125335a((Number) 6));
        int a = (int) ((circularProgressDrawable.mo7693a() + circularProgressDrawable.mo7702b()) * ((float) 2));
        circularProgressDrawable.setBounds(0, 0, a, a);
        this.f78735b = circularProgressDrawable;
        ((ImageView) findViewById(R.id.ud_toast_icon)).setImageDrawable(circularProgressDrawable);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToastLoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
