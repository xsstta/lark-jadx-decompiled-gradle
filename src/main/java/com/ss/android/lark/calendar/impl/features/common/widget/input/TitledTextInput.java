package com.ss.android.lark.calendar.impl.features.common.widget.input;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.edittext.UDEditText;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J*\u0010\u0019\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u0004\u0018\u00010\u001aJ*\u0010\u001f\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u001aJ\u0018\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\bJ\u0010\u0010(\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010*\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010\u001aJ\b\u0010,\u001a\u00020\u0011H\u0002J\u001a\u0010-\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00110\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006."}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/input/TitledTextInput;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/text/TextWatcher;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "editText", "Lcom/larksuite/component/universe_design/edittext/UDEditText;", "getEditText", "()Lcom/larksuite/component/universe_design/edittext/UDEditText;", "minShowCount", "textChanged", "Lkotlin/Function1;", "", "titleText", "Landroid/widget/TextView;", "getTitleText", "()Landroid/widget/TextView;", "afterTextChanged", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "getText", "onTextChanged", "before", "setEditable", "isEditable", "", "setHint", "hint", "setShowCount", "maxCount", "setText", "text", "setTitle", "title", "updateCount", "whenTextChanged", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TitledTextInput extends ConstraintLayout implements TextWatcher {

    /* renamed from: a */
    private final TextView f79050a;

    /* renamed from: b */
    private final UDEditText f79051b;

    /* renamed from: c */
    private int f79052c;

    /* renamed from: d */
    private Function1<? super TitledTextInput, Unit> f79053d;

    public TitledTextInput(Context context) {
        this(context, null, 0, 6, null);
    }

    public TitledTextInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final UDEditText getEditText() {
        return this.f79051b;
    }

    public final TextView getTitleText() {
        return this.f79050a;
    }

    public final CharSequence getText() {
        return this.f79051b.getText();
    }

    /* renamed from: a */
    private final void m116800a() {
        int i;
        CharSequence text = getText();
        boolean z = false;
        if (text != null) {
            i = text.length();
        } else {
            i = 0;
        }
        boolean o = this.f79051b.mo90937o();
        UDEditText uDEditText = this.f79051b;
        if (i >= this.f79052c) {
            z = true;
        }
        uDEditText.mo90928b(z);
        if (!o && i > this.f79051b.getCounterMaxLength()) {
            UDEditText uDEditText2 = this.f79051b;
            uDEditText2.setText(uDEditText2.getText());
        }
    }

    /* renamed from: a */
    public final TitledTextInput mo113336a(Function1<? super TitledTextInput, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "textChanged");
        this.f79053d = function1;
        return this;
    }

    public void afterTextChanged(Editable editable) {
        m116800a();
        Function1<? super TitledTextInput, Unit> function1 = this.f79053d;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    /* renamed from: a */
    public final TitledTextInput mo113335a(CharSequence charSequence) {
        if (!Intrinsics.areEqual(this.f79050a.getText(), charSequence)) {
            this.f79050a.setText(charSequence);
        }
        return this;
    }

    /* renamed from: b */
    public final TitledTextInput mo113339b(CharSequence charSequence) {
        if (!Intrinsics.areEqual(this.f79051b.getHint(), charSequence)) {
            this.f79051b.setHint(charSequence);
        }
        return this;
    }

    /* renamed from: c */
    public final TitledTextInput mo113341c(CharSequence charSequence) {
        if (!Intrinsics.areEqual(this.f79051b.getText(), charSequence)) {
            this.f79051b.setText(charSequence);
            m116800a();
        }
        return this;
    }

    /* renamed from: a */
    public final TitledTextInput mo113337a(boolean z) {
        if (z) {
            TextView textView = this.f79050a;
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            textView.setTextColor(UDColorUtils.getColor(context, R.color.text_title));
            UDEditText uDEditText = this.f79051b;
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            uDEditText.setTextColor(UDColorUtils.getColor(context2, R.color.text_title));
            UDEditText uDEditText2 = this.f79051b;
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            uDEditText2.setHintTextColor(UDColorUtils.getColor(context3, R.color.text_placeholder));
        } else {
            TextView textView2 = this.f79050a;
            Context context4 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "context");
            textView2.setTextColor(UDColorUtils.getColor(context4, R.color.text_disable));
            UDEditText uDEditText3 = this.f79051b;
            Context context5 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context5, "context");
            uDEditText3.setTextColor(UDColorUtils.getColor(context5, R.color.text_disable));
            UDEditText uDEditText4 = this.f79051b;
            Context context6 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context6, "context");
            uDEditText4.setHintTextColor(UDColorUtils.getColor(context6, R.color.text_disable));
        }
        this.f79051b.setFocusable(z);
        this.f79051b.setFocusableInTouchMode(z);
        return this;
    }

    /* renamed from: a */
    public final TitledTextInput mo113334a(int i, int i2) {
        this.f79051b.mo90924a(i);
        this.f79052c = i2;
        m116800a();
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TitledTextInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        View.inflate(context, R.layout.calendar_widget_titled_text_input, this);
        View findViewById = findViewById(R.id.title_text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.title_text)");
        this.f79050a = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.edit_text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.edit_text)");
        UDEditText uDEditText = (UDEditText) findViewById2;
        this.f79051b = uDEditText;
        uDEditText.addTextChangedListener(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TitledTextInput(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
