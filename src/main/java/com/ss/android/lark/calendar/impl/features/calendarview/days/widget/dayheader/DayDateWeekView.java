package com.ss.android.lark.calendar.impl.features.calendarview.days.widget.dayheader;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0007J\u0010\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0007J\u0010\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/dayheader/DayDateWeekView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mDateDay", "Landroid/widget/TextView;", "mLunarDay", "mWeekDay", "setDateDay", "", "dateDay", "", "setDateDayBackground", "resId", "setDateDayTextColor", "textColor", "setLunarDay", "lunarDay", "setLunarDayTextColor", "setLunarDayVisibility", "visibility", "setWeekDay", "weekDay", "setWeekDayTextColor", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DayDateWeekView extends RelativeLayout {

    /* renamed from: a */
    private TextView f77421a;

    /* renamed from: b */
    private TextView f77422b;

    /* renamed from: c */
    private TextView f77423c;

    public DayDateWeekView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DayDateWeekView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setDateDay(String str) {
        this.f77422b.setText(str);
    }

    public final void setDateDayBackground(int i) {
        this.f77422b.setBackgroundResource(i);
    }

    public final void setDateDayTextColor(int i) {
        this.f77422b.setTextColor(i);
    }

    public final void setLunarDay(String str) {
        this.f77423c.setText(str);
    }

    public final void setLunarDayTextColor(int i) {
        this.f77423c.setTextColor(i);
    }

    public final void setLunarDayVisibility(int i) {
        this.f77423c.setVisibility(i);
    }

    public final void setWeekDay(String str) {
        this.f77421a.setText(str);
    }

    public final void setWeekDayTextColor(int i) {
        this.f77421a.setTextColor(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DayDateWeekView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f77421a = new TextView(context);
        this.f77422b = new TextView(context);
        this.f77423c = new TextView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = UIHelper.dp2px(2.5f);
        layoutParams.addRule(14, -1);
        this.f77421a.setId(R.id.one_day_header_week);
        this.f77421a.setEllipsize(TextUtils.TruncateAt.END);
        this.f77421a.setTextColor(C32634ae.m125178a(R.color.lkui_N400));
        this.f77421a.setTextSize(1, 12.0f);
        addView(this.f77421a, layoutParams);
        int dp2px = UIHelper.dp2px(32.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dp2px, dp2px);
        layoutParams2.topMargin = UIHelper.dp2px(1.5f);
        layoutParams2.addRule(3, this.f77421a.getId());
        layoutParams2.addRule(14, -1);
        layoutParams2.addRule(15, -1);
        this.f77422b.setId(R.id.one_day_header_date);
        this.f77422b.setTextColor(C32634ae.m125178a(R.color.lkui_N1000));
        this.f77422b.setTextSize(1, 18.0f);
        this.f77422b.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/DINPro-Bold.ttf"));
        this.f77422b.setGravity(1);
        addView(this.f77422b, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, UIHelper.dp2px(15.0f));
        layoutParams3.topMargin = UIHelper.dp2px(2.5f);
        layoutParams3.addRule(3, this.f77422b.getId());
        layoutParams3.addRule(14, -1);
        this.f77423c.setGravity(1);
        this.f77423c.setEllipsize(TextUtils.TruncateAt.END);
        this.f77423c.setTextColor(C32634ae.m125178a(R.color.lkui_N400));
        this.f77423c.setTextSize(1, 11.0f);
        this.f77423c.setVisibility(8);
        addView(this.f77423c, layoutParams3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DayDateWeekView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
