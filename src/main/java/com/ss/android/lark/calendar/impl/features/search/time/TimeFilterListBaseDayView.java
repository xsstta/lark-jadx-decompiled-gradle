package com.ss.android.lark.calendar.impl.features.search.time;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31172b;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.C31185a;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.CalendarAttr;
import com.ss.android.lark.calendar.impl.utils.ao;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\b&\u0018\u0000 *2\u00020\u0001:\u0001*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH$J@\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\"H\u0002J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\fH\u0004J&\u0010%\u001a\u00020\u00142\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\"2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H$J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\fH\u0016J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0010H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterListBaseDayView;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/base/BaseDayView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mDateTv", "Landroid/widget/TextView;", "getMDateTv", "()Landroid/widget/TextView;", "setMDateTv", "(Landroid/widget/TextView;)V", "mDesktopWidth", "", "mDotContainer", "Landroid/widget/LinearLayout;", "mTypeFace", "Landroid/graphics/Typeface;", "getCellViewHeight", "getCellViewWidth", "refreshContent", "", "renderDate", "monthState", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/viewdata/CalendarAttr$MonthState;", "selectState", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/viewdata/CalendarAttr$SelectState;", "dateState", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/viewdata/CalendarAttr$DateState;", "optionalState", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/viewdata/CalendarAttr$OptionalState;", "renderDay", "date", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "dotColors", "", "renderDot", "color", "renderEventDot", "setDesktopWidth", "width", "setTypeFace", "typeFace", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.time.a */
public abstract class TimeFilterListBaseDayView extends AbstractC31172b {

    /* renamed from: d */
    public static final Companion f82913d = new Companion(null);

    /* renamed from: e */
    private TextView f82914e;

    /* renamed from: f */
    private LinearLayout f82915f;

    /* renamed from: g */
    private Typeface f82916g;

    /* renamed from: h */
    private int f82917h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo118228a(CalendarAttr.MonthState monthState, CalendarAttr.SelectState selectState, CalendarAttr.DateState dateState, CalendarAttr.OptionalState optionalState);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo118229a(List<Integer> list, CalendarAttr.DateState dateState, CalendarAttr.MonthState monthState);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterListBaseDayView$Companion;", "", "()V", "CELL_HEIGHT", "", "DOT_ALPHA", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final TextView getMDateTv() {
        return this.f82914e;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31174d
    public int getCellViewHeight() {
        return UIUtils.dp2px(getContext(), (float) 36);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31174d
    public int getCellViewWidth() {
        Resources resources = getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        return resources.getDisplayMetrics().widthPixels / 7;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31172b
    /* renamed from: a */
    public void mo112924a() {
        C31185a aVar = this.f78785a;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "mDay");
        CalendarDate e = aVar.mo112992e();
        Intrinsics.checkExpressionValueIsNotNull(e, "mDay.date");
        C31185a aVar2 = this.f78785a;
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "mDay");
        CalendarAttr.SelectState a = aVar2.mo112982a();
        Intrinsics.checkExpressionValueIsNotNull(a, "mDay.selectState");
        C31185a aVar3 = this.f78785a;
        Intrinsics.checkExpressionValueIsNotNull(aVar3, "mDay");
        CalendarAttr.DateState b = aVar3.mo112989b();
        Intrinsics.checkExpressionValueIsNotNull(b, "mDay.dateState");
        C31185a aVar4 = this.f78785a;
        Intrinsics.checkExpressionValueIsNotNull(aVar4, "mDay");
        CalendarAttr.MonthState c = aVar4.mo112990c();
        Intrinsics.checkExpressionValueIsNotNull(c, "mDay.monthState");
        C31185a aVar5 = this.f78785a;
        Intrinsics.checkExpressionValueIsNotNull(aVar5, "mDay");
        CalendarAttr.OptionalState d = aVar5.mo112991d();
        Intrinsics.checkExpressionValueIsNotNull(d, "mDay.optionalState");
        C31185a aVar6 = this.f78785a;
        Intrinsics.checkExpressionValueIsNotNull(aVar6, "mDay");
        m123528a(e, a, b, c, d, aVar6.mo112995h());
        super.mo112924a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31174d
    public void setDesktopWidth(int i) {
        this.f82917h = i;
    }

    /* access modifiers changed from: protected */
    public final void setMDateTv(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "<set-?>");
        this.f82914e = textView;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31174d
    public void setTypeFace(Typeface typeface) {
        Intrinsics.checkParameterIsNotNull(typeface, "typeFace");
        this.f82916g = typeface;
        this.f82914e.setTypeface(typeface);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeFilterListBaseDayView(Context context) {
        super(context, R.layout.search_time_filter_list_day);
        Intrinsics.checkParameterIsNotNull(context, "context");
        View findViewById = findViewById(R.id.date_day);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.date_day)");
        this.f82914e = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.dot_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.dot_container)");
        this.f82915f = (LinearLayout) findViewById2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo118227a(int i) {
        GradientDrawable a = ao.m125221a(i, 0, 0);
        ImageView imageView = new ImageView(getContext());
        imageView.setBackground(a);
        float f = (float) 4;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(UIUtils.dp2px(getContext(), f), UIUtils.dp2px(getContext(), f));
        layoutParams.gravity = 1;
        layoutParams.setMargins(UIUtils.dp2px(getContext(), 1.0f), 0, UIUtils.dp2px(getContext(), 1.0f), 0);
        this.f82915f.addView(imageView, layoutParams);
    }

    /* renamed from: a */
    private final void m123528a(CalendarDate calendarDate, CalendarAttr.SelectState selectState, CalendarAttr.DateState dateState, CalendarAttr.MonthState monthState, CalendarAttr.OptionalState optionalState, List<Integer> list) {
        this.f82914e.setText(String.valueOf(calendarDate.getMonthDay()));
        mo118228a(monthState, selectState, dateState, optionalState);
        if (!CollectionUtils.isNotEmpty(list) || selectState != CalendarAttr.SelectState.UN_SELECT) {
            this.f82915f.setVisibility(4);
            return;
        }
        this.f82915f.setVisibility(0);
        this.f82915f.removeAllViews();
        if (list != null) {
            mo118229a(list, dateState, monthState);
        }
    }
}
