package com.larksuite.component.universe_design.timepicker.impl.action;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.timepicker.UDTimePicker;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerModel;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0007J\u0010\u0010\u001b\u001a\u00020\u00102\b\b\u0001\u0010\u001c\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010!\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\"\u001a\u00020\u00102\b\b\u0001\u0010\u001c\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010$\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0007J\u000e\u0010%\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015¨\u0006&"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/action/UDTimePickerActionView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getLeftActionView", "Landroid/widget/TextView;", "getRightActionView", "getTitleTextView", "getUDTimePicker", "Lcom/larksuite/component/universe_design/timepicker/UDTimePicker;", "setLeftActionViewClickListener", "", "onClickListener", "Landroid/view/View$OnClickListener;", "setLeftActionViewText", "text", "", "setLeftActionViewTextSize", "size", "", "setLeftActionViewVisibility", "visibility", "setLeftTextColor", "color", "setPickerMode", "pickerModel", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerModel;", "setRightActionViewClickListener", "setRightActionViewText", "setRightActionViewTextColor", "setRightActionViewTextSize", "setRightActionViewVisibility", "setTitleText", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UDTimePickerActionView extends LinearLayout {
    private HashMap _$_findViewCache;

    public UDTimePickerActionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public UDTimePickerActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final TextView getLeftActionView() {
        TextView textView = (TextView) _$_findCachedViewById(R.id.leftActionView);
        Intrinsics.checkExpressionValueIsNotNull(textView, "leftActionView");
        return textView;
    }

    public final TextView getRightActionView() {
        TextView textView = (TextView) _$_findCachedViewById(R.id.rightActionView);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rightActionView");
        return textView;
    }

    public final TextView getTitleTextView() {
        TextView textView = (TextView) _$_findCachedViewById(R.id.titleTextView);
        Intrinsics.checkExpressionValueIsNotNull(textView, "titleTextView");
        return textView;
    }

    public final UDTimePicker getUDTimePicker() {
        UDTimePicker uDTimePicker = (UDTimePicker) _$_findCachedViewById(R.id.timePicker);
        Intrinsics.checkExpressionValueIsNotNull(uDTimePicker, "timePicker");
        return uDTimePicker;
    }

    public final void setLeftActionViewTextSize(float f) {
        ((TextView) _$_findCachedViewById(R.id.leftActionView)).setTextSize(0, f);
    }

    public final void setLeftTextColor(int i) {
        ((TextView) _$_findCachedViewById(R.id.leftActionView)).setTextColor(i);
    }

    public final void setRightActionViewTextColor(int i) {
        ((TextView) _$_findCachedViewById(R.id.rightActionView)).setTextColor(i);
    }

    public final void setLeftActionViewClickListener(View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "onClickListener");
        ((TextView) _$_findCachedViewById(R.id.leftActionView)).setOnClickListener(onClickListener);
    }

    public final void setLeftActionViewText(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        TextView textView = (TextView) _$_findCachedViewById(R.id.leftActionView);
        Intrinsics.checkExpressionValueIsNotNull(textView, "leftActionView");
        textView.setText(charSequence);
    }

    public final void setLeftActionViewVisibility(int i) {
        TextView textView = (TextView) _$_findCachedViewById(R.id.leftActionView);
        Intrinsics.checkExpressionValueIsNotNull(textView, "leftActionView");
        textView.setVisibility(i);
    }

    public final void setPickerMode(PickerModel pickerModel) {
        Intrinsics.checkParameterIsNotNull(pickerModel, "pickerModel");
        ((UDTimePicker) _$_findCachedViewById(R.id.timePicker)).setPickerMode(pickerModel);
    }

    public final void setRightActionViewClickListener(View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "onClickListener");
        ((TextView) _$_findCachedViewById(R.id.rightActionView)).setOnClickListener(onClickListener);
    }

    public final void setRightActionViewText(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        TextView textView = (TextView) _$_findCachedViewById(R.id.rightActionView);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rightActionView");
        textView.setText(charSequence);
    }

    public final void setRightActionViewTextSize(float f) {
        TextView textView = (TextView) _$_findCachedViewById(R.id.rightActionView);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rightActionView");
        textView.setTextSize(f);
    }

    public final void setRightActionViewVisibility(int i) {
        TextView textView = (TextView) _$_findCachedViewById(R.id.rightActionView);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rightActionView");
        textView.setVisibility(i);
    }

    public final void setTitleText(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        TextView textView = (TextView) _$_findCachedViewById(R.id.titleTextView);
        Intrinsics.checkExpressionValueIsNotNull(textView, "titleTextView");
        textView.setText(charSequence);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDTimePickerActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.ud_timepicker_actionview, this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UDTimePickerActionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
