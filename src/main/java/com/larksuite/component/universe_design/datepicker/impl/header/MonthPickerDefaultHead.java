package com.larksuite.component.universe_design.datepicker.impl.header;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/header/MonthPickerDefaultHead;", "Landroid/widget/RelativeLayout;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getAttrs", "()Landroid/util/AttributeSet;", "setAttrs", "(Landroid/util/AttributeSet;)V", "mMonthPickerActionListener", "Lcom/larksuite/component/universe_design/datepicker/impl/header/MonthPickerDefaultHead$MonthPickerActionListener;", "setMonthPickerActionListener", "", "listener", "setMonthText", "monthText", "", "setMonthTextSize", "textSize", "", "setTypeFace", "typeFace", "Landroid/graphics/Typeface;", "MonthPickerActionListener", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MonthPickerDefaultHead extends RelativeLayout {

    /* renamed from: a */
    public MonthPickerActionListener f63233a;

    /* renamed from: b */
    private AttributeSet f63234b;

    /* renamed from: c */
    private HashMap f63235c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/header/MonthPickerDefaultHead$MonthPickerActionListener;", "", "onClickLeftArrow", "", "onClickRightArrow", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.datepicker.impl.header.MonthPickerDefaultHead$a */
    public interface MonthPickerActionListener {
        /* renamed from: a */
        void mo90436a();

        /* renamed from: b */
        void mo90437b();
    }

    public MonthPickerDefaultHead(Context context) {
        this(context, null, 0, 6, null);
    }

    public MonthPickerDefaultHead(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo90526a(int i) {
        if (this.f63235c == null) {
            this.f63235c = new HashMap();
        }
        View view = (View) this.f63235c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f63235c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final AttributeSet getAttrs() {
        return this.f63234b;
    }

    public final void setAttrs(AttributeSet attributeSet) {
        this.f63234b = attributeSet;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.datepicker.impl.header.MonthPickerDefaultHead$b */
    static final class View$OnClickListenerC25740b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MonthPickerDefaultHead f63236a;

        View$OnClickListenerC25740b(MonthPickerDefaultHead monthPickerDefaultHead) {
            this.f63236a = monthPickerDefaultHead;
        }

        public final void onClick(View view) {
            MonthPickerActionListener aVar = this.f63236a.f63233a;
            if (aVar != null) {
                aVar.mo90436a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.datepicker.impl.header.MonthPickerDefaultHead$c */
    static final class View$OnClickListenerC25741c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MonthPickerDefaultHead f63237a;

        View$OnClickListenerC25741c(MonthPickerDefaultHead monthPickerDefaultHead) {
            this.f63237a = monthPickerDefaultHead;
        }

        public final void onClick(View view) {
            MonthPickerActionListener aVar = this.f63237a.f63233a;
            if (aVar != null) {
                aVar.mo90437b();
            }
        }
    }

    public final void setMonthTextSize(float f) {
        ((TextView) mo90526a(R.id.monthTextView)).setTextSize(0, f);
    }

    public final void setMonthText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "monthText");
        TextView textView = (TextView) mo90526a(R.id.monthTextView);
        Intrinsics.checkExpressionValueIsNotNull(textView, "monthTextView");
        textView.setText(str);
    }

    public final void setTypeFace(Typeface typeface) {
        Intrinsics.checkParameterIsNotNull(typeface, "typeFace");
        TextView textView = (TextView) mo90526a(R.id.monthTextView);
        Intrinsics.checkExpressionValueIsNotNull(textView, "monthTextView");
        textView.setTypeface(typeface);
    }

    public final void setMonthPickerActionListener(MonthPickerActionListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f63233a = aVar;
        ((ImageView) mo90526a(R.id.leftArrowImageView)).setOnClickListener(new View$OnClickListenerC25740b(this));
        ((ImageView) mo90526a(R.id.rightArrowImageView)).setOnClickListener(new View$OnClickListenerC25741c(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonthPickerDefaultHead(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f63234b = attributeSet;
        LayoutInflater.from(context).inflate(R.layout.ud_datepicker_default_head, (ViewGroup) this, true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MonthPickerDefaultHead(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
