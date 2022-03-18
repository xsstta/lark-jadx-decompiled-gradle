package com.ss.android.lark.calendar.impl.features.search.time;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.search.time.TimeFilterAttr;
import com.ss.android.lark.calendar.impl.features.search.time.TimeFilterMonthContainer;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001+B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\u0016\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u001e\u001a\u00020\u0013H\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0002J\b\u0010 \u001a\u00020\u0013H\u0016J\b\u0010!\u001a\u00020\u0013H\u0002J\b\u0010\"\u001a\u00020\u0013H\u0002J\b\u0010#\u001a\u00020\u0013H\u0002J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010%\u001a\u00020\u0013H\u0002J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u001aH\u0002J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u0010H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/time/TimeSelectDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "context", "Landroid/content/Context;", "delegate", "Lcom/ss/android/lark/calendar/impl/features/search/time/TimeSelectDialog$Delegate;", "(Landroid/content/Context;Lcom/ss/android/lark/calendar/impl/features/search/time/TimeSelectDialog$Delegate;)V", "getDelegate", "()Lcom/ss/android/lark/calendar/impl/features/search/time/TimeSelectDialog$Delegate;", "endTime", "", "mCheckedChangeListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "mCurrSelectedTimeType", "Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterAttr$SelectTimeType;", "mCurrentSelectedDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "startTime", "initCurrentSelectedDate", "", "initListener", "initMonthView", "initTimeLabel", "initTitleBar", "initView", "isTimeNoLimit", "", "time", "setEndTimeSelectedTextColor", "setSelectTime", "setStartTimeSelectedTextColor", "setWindowConfig", "show", "showEndTimeSelectedView", "showStartTimeSelectedView", "updateCurrentMonth", "updateEndTimeView", "updateMonthOptionalView", "updateNoLimitCheckBox", "isNoLimit", "updateStartTimeView", "updateTimeView", "selectDate", "Delegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.time.e */
public final class TimeSelectDialog extends BaseDialog {

    /* renamed from: a */
    public long f82928a = -1;

    /* renamed from: b */
    public long f82929b = -1;

    /* renamed from: c */
    public TimeFilterAttr.SelectTimeType f82930c = TimeFilterAttr.SelectTimeType.START_TIME;

    /* renamed from: d */
    public CalendarDate f82931d = new CalendarDate();

    /* renamed from: e */
    private CompoundButton.OnCheckedChangeListener f82932e;

    /* renamed from: f */
    private final Delegate f82933f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/time/TimeSelectDialog$Delegate;", "", "onSavePressed", "", "startTime", "", "endTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.e$a */
    public interface Delegate {
        /* renamed from: a */
        void mo117987a(long j, long j2);
    }

    /* renamed from: a */
    public final boolean mo118245a(long j) {
        return j == -1;
    }

    /* renamed from: e */
    public final Delegate mo118249e() {
        return this.f82933f;
    }

    /* renamed from: f */
    private final void m123560f() {
        m123566l();
        m123565k();
        m123564j();
        m123561g();
    }

    /* renamed from: j */
    private final void m123564j() {
        ((TimeFilterMonthContainer) findViewById(R.id.mMonthViewContainer)).mo118212a(this.f82931d);
        mo118248d();
    }

    /* renamed from: k */
    private final void m123565k() {
        TextView textView = (TextView) findViewById(R.id.mStartTimeTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mStartTimeTV");
        textView.setText(C32634ae.m125182b(R.string.Lark_Search_AnyTime));
        TextView textView2 = (TextView) findViewById(R.id.mEndTimeTV);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "mEndTimeTV");
        textView2.setText(C32634ae.m125182b(R.string.Lark_Search_AnyTime));
    }

    /* renamed from: m */
    private final void m123567m() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = DeviceUtils.getScreenWidth(getContext());
            attributes.height = -2;
            attributes.softInputMode = 16;
            window.setAttributes(attributes);
            window.setDimAmount(0.3f);
            window.setWindowAnimations(R.style.AnimBottomInBottomOut);
        }
    }

    /* renamed from: n */
    private final void m123568n() {
        CalendarDate calendarDate;
        if (this.f82928a == -1) {
            calendarDate = new CalendarDate();
        } else {
            calendarDate = new CalendarDate(new Date(this.f82928a * ((long) 1000)));
        }
        this.f82931d = calendarDate;
    }

    /* renamed from: a */
    public final void mo118241a() {
        long j = (long) 1000;
        ((TimeFilterMonthContainer) findViewById(R.id.mMonthViewContainer)).mo118213a(new CalendarDate(new Date(this.f82928a * j)), mo118245a(this.f82928a), new CalendarDate(new Date(this.f82929b * j)), mo118245a(this.f82929b), this.f82931d, this.f82930c);
    }

    /* renamed from: b */
    public final void mo118246b() {
        this.f82930c = TimeFilterAttr.SelectTimeType.START_TIME;
        m123562h();
        ((CommonTitleBar) findViewById(R.id.mTitleBar)).setTitle(C32634ae.m125182b(R.string.Lark_Search_SelectStartTime));
        ((LinearLayout) findViewById(R.id.mStartTimeLayout)).setBackgroundResource(R.drawable.calendar_bg_start_time_btn_pressed);
        ((LinearLayout) findViewById(R.id.mEndTimeLayout)).setBackgroundResource(R.drawable.calendar_bg_end_time_btn);
    }

    /* renamed from: c */
    public final void mo118247c() {
        this.f82930c = TimeFilterAttr.SelectTimeType.END_TIME;
        m123563i();
        ((CommonTitleBar) findViewById(R.id.mTitleBar)).setTitle(C32634ae.m125182b(R.string.Lark_Search_SelectEndTime));
        ((LinearLayout) findViewById(R.id.mStartTimeLayout)).setBackgroundResource(R.drawable.calendar_bg_start_time_btn);
        ((LinearLayout) findViewById(R.id.mEndTimeLayout)).setBackgroundResource(R.drawable.calendar_bg_end_time_btn_pressed);
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void show() {
        super.show();
        this.f82930c = TimeFilterAttr.SelectTimeType.START_TIME;
        m123568n();
        mo118246b();
        m123558b(this.f82928a);
        m123559c(this.f82929b);
        CheckBox checkBox = (CheckBox) findViewById(R.id.mTimeSelectNoLimitCB);
        Intrinsics.checkExpressionValueIsNotNull(checkBox, "mTimeSelectNoLimitCB");
        checkBox.setChecked(mo118245a(this.f82928a));
        ((CheckBox) findViewById(R.id.mTimeSelectNoLimitCB)).setOnCheckedChangeListener(this.f82932e);
        m123564j();
        mo118241a();
    }

    /* renamed from: g */
    private final void m123561g() {
        ((LinearLayout) findViewById(R.id.mStartTimeLayout)).setOnClickListener(new View$OnClickListenerC32363b(this));
        ((LinearLayout) findViewById(R.id.mEndTimeLayout)).setOnClickListener(new View$OnClickListenerC32364c(this));
        ((ImageView) findViewById(R.id.mLastMonthBtnIV)).setOnClickListener(new View$OnClickListenerC32365d(this));
        ((ImageView) findViewById(R.id.mNextMonthBtnIV)).setOnClickListener(new View$OnClickListenerC32366e(this));
        ((TimeFilterMonthContainer) findViewById(R.id.mMonthViewContainer)).setChangeListener(new C32367f(this));
        ((RelativeLayout) findViewById(R.id.mTimeSelectNoLimitRL)).setOnClickListener(new View$OnClickListenerC32368g(this));
        this.f82932e = new C32369h(this);
    }

    /* renamed from: h */
    private final void m123562h() {
        ((TextView) findViewById(R.id.mStartTimeLabelTV)).setTextColor(UIUtils.getColor(getContext(), R.color.static_white));
        ((TextView) findViewById(R.id.mStartTimeTV)).setTextColor(UIUtils.getColor(getContext(), R.color.static_white));
        ((TextView) findViewById(R.id.mEndTimeLabelTV)).setTextColor(UIUtils.getColor(getContext(), R.color.text_caption));
        ((TextView) findViewById(R.id.mEndTimeTV)).setTextColor(UIUtils.getColor(getContext(), R.color.text_title));
    }

    /* renamed from: i */
    private final void m123563i() {
        ((TextView) findViewById(R.id.mStartTimeLabelTV)).setTextColor(UIUtils.getColor(getContext(), R.color.text_caption));
        ((TextView) findViewById(R.id.mStartTimeTV)).setTextColor(UIUtils.getColor(getContext(), R.color.text_title));
        ((TextView) findViewById(R.id.mEndTimeLabelTV)).setTextColor(UIUtils.getColor(getContext(), R.color.static_white));
        ((TextView) findViewById(R.id.mEndTimeTV)).setTextColor(UIUtils.getColor(getContext(), R.color.static_white));
    }

    /* renamed from: l */
    private final void m123566l() {
        ((CommonTitleBar) findViewById(R.id.mTitleBar)).setTitle(C32634ae.m125182b(R.string.Lark_Search_SelectStartTime));
        ((CommonTitleBar) findViewById(R.id.mTitleBar)).setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        ((CommonTitleBar) findViewById(R.id.mTitleBar)).setLeftClickListener(new View$OnClickListenerC32370i(this));
        ((CommonTitleBar) findViewById(R.id.mTitleBar)).addAction(new C32371j(this, C32634ae.m125182b(R.string.Calendar_Common_Done), R.color.primary_pri_500));
    }

    /* renamed from: d */
    public final void mo118248d() {
        CalendarDate currSelectedDate = ((TimeFilterMonthContainer) findViewById(R.id.mMonthViewContainer)).getCurrSelectedDate();
        TextView textView = (TextView) findViewById(R.id.mCurrentMonthTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mCurrentMonthTV");
        Context a = C32634ae.m125179a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ResUtil.getAppContext()");
        Date date = currSelectedDate.getDate();
        Intrinsics.checkExpressionValueIsNotNull(date, "currSelectedDate.date");
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
        DatePreciseness datePreciseness = DatePreciseness.MONTH;
        textView.setText(TimeFormatUtils.m219289e(a, date, new Options(id, DisplayPattern.ABSOLUTE, LengthType.LONG, datePreciseness, null, false, false, false, false, 496, null)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/time/TimeSelectDialog$initListener$5", "Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterMonthContainer$MonthViewChangeListener;", "onDateChange", "", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "actionType", "Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterAttr$MonthChangeAction;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.e$f */
    public static final class C32367f implements TimeFilterMonthContainer.MonthViewChangeListener {

        /* renamed from: a */
        final /* synthetic */ TimeSelectDialog f82938a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32367f(TimeSelectDialog eVar) {
            this.f82938a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.time.TimeFilterMonthContainer.MonthViewChangeListener
        /* renamed from: a */
        public void mo118218a(CalendarDate calendarDate, TimeFilterAttr.MonthChangeAction monthChangeAction) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            Intrinsics.checkParameterIsNotNull(monthChangeAction, "actionType");
            this.f82938a.mo118241a();
            this.f82938a.mo118248d();
            if (monthChangeAction == TimeFilterAttr.MonthChangeAction.SELECT_DATE) {
                CheckBox checkBox = (CheckBox) this.f82938a.findViewById(R.id.mTimeSelectNoLimitCB);
                Intrinsics.checkExpressionValueIsNotNull(checkBox, "mTimeSelectNoLimitCB");
                if (checkBox.isChecked()) {
                    ((CheckBox) this.f82938a.findViewById(R.id.mTimeSelectNoLimitCB)).toggle();
                }
                this.f82938a.f82931d = calendarDate;
                this.f82938a.mo118243a(calendarDate);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.e$i */
    public static final class View$OnClickListenerC32370i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeSelectDialog f82941a;

        View$OnClickListenerC32370i(TimeSelectDialog eVar) {
            this.f82941a = eVar;
        }

        public final void onClick(View view) {
            this.f82941a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.e$g */
    public static final class View$OnClickListenerC32368g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeSelectDialog f82939a;

        View$OnClickListenerC32368g(TimeSelectDialog eVar) {
            this.f82939a = eVar;
        }

        public final void onClick(View view) {
            ((CheckBox) this.f82939a.findViewById(R.id.mTimeSelectNoLimitCB)).toggle();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.e$b */
    public static final class View$OnClickListenerC32363b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeSelectDialog f82934a;

        View$OnClickListenerC32363b(TimeSelectDialog eVar) {
            this.f82934a = eVar;
        }

        public final void onClick(View view) {
            if (this.f82934a.f82930c != TimeFilterAttr.SelectTimeType.START_TIME) {
                this.f82934a.mo118246b();
                TimeSelectDialog eVar = this.f82934a;
                eVar.mo118244a(eVar.mo118245a(eVar.f82928a));
                this.f82934a.mo118241a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.e$c */
    public static final class View$OnClickListenerC32364c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeSelectDialog f82935a;

        View$OnClickListenerC32364c(TimeSelectDialog eVar) {
            this.f82935a = eVar;
        }

        public final void onClick(View view) {
            if (this.f82935a.f82930c != TimeFilterAttr.SelectTimeType.END_TIME) {
                this.f82935a.mo118247c();
                TimeSelectDialog eVar = this.f82935a;
                eVar.mo118244a(eVar.mo118245a(eVar.f82929b));
                this.f82935a.mo118241a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.e$d */
    public static final class View$OnClickListenerC32365d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeSelectDialog f82936a;

        View$OnClickListenerC32365d(TimeSelectDialog eVar) {
            this.f82936a = eVar;
        }

        public final void onClick(View view) {
            ((TimeFilterMonthContainer) this.f82936a.findViewById(R.id.mMonthViewContainer)).mo118210a();
            this.f82936a.mo118248d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.e$e */
    public static final class View$OnClickListenerC32366e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeSelectDialog f82937a;

        View$OnClickListenerC32366e(TimeSelectDialog eVar) {
            this.f82937a = eVar;
        }

        public final void onClick(View view) {
            ((TimeFilterMonthContainer) this.f82937a.findViewById(R.id.mMonthViewContainer)).mo118215b();
            this.f82937a.mo118248d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/time/TimeSelectDialog$initTitleBar$2", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.e$j */
    public static final class C32371j extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ TimeSelectDialog f82942a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            this.f82942a.dismiss();
            this.f82942a.mo118249e().mo117987a(this.f82942a.f82928a, this.f82942a.f82929b);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32371j(TimeSelectDialog eVar, String str, int i) {
            super(str, i);
            this.f82942a = eVar;
        }
    }

    /* renamed from: a */
    public final void mo118244a(boolean z) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.mTimeSelectNoLimitCB);
        Intrinsics.checkExpressionValueIsNotNull(checkBox, "mTimeSelectNoLimitCB");
        checkBox.setChecked(z);
    }

    /* renamed from: b */
    private final void m123558b(long j) {
        if (mo118245a(j)) {
            TextView textView = (TextView) findViewById(R.id.mStartTimeTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "mStartTimeTV");
            textView.setText(C32634ae.m125182b(R.string.Lark_Search_AnyTime));
            return;
        }
        TextView textView2 = (TextView) findViewById(R.id.mStartTimeTV);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "mStartTimeTV");
        Context a = C32634ae.m125179a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ResUtil.getAppContext()");
        Date date = new Date(((long) 1000) * j);
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
        DatePreciseness datePreciseness = DatePreciseness.DAY;
        textView2.setText(TimeFormatUtils.m219289e(a, date, new Options(id, DisplayPattern.ABSOLUTE, LengthType.LONG, datePreciseness, null, false, false, false, false, 496, null)));
    }

    /* renamed from: c */
    private final void m123559c(long j) {
        if (mo118245a(j)) {
            TextView textView = (TextView) findViewById(R.id.mEndTimeTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "mEndTimeTV");
            textView.setText(C32634ae.m125182b(R.string.Lark_Search_AnyTime));
            return;
        }
        TextView textView2 = (TextView) findViewById(R.id.mEndTimeTV);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "mEndTimeTV");
        Context a = C32634ae.m125179a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ResUtil.getAppContext()");
        Date date = new Date(((long) 1000) * j);
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
        DatePreciseness datePreciseness = DatePreciseness.DAY;
        textView2.setText(TimeFormatUtils.m219289e(a, date, new Options(id, DisplayPattern.ABSOLUTE, LengthType.LONG, datePreciseness, null, false, false, false, false, 496, null)));
    }

    /* renamed from: a */
    public final void mo118243a(CalendarDate calendarDate) {
        if (this.f82930c == TimeFilterAttr.SelectTimeType.START_TIME) {
            CalendarDate moveToDayStart = calendarDate.moveToDayStart();
            Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "selectDate.moveToDayStart()");
            long timeInMilliSeconds = moveToDayStart.getTimeInMilliSeconds() / ((long) 1000);
            this.f82928a = timeInMilliSeconds;
            m123558b(timeInMilliSeconds);
            return;
        }
        CalendarDate moveToDayEnd = calendarDate.moveToDayEnd();
        Intrinsics.checkExpressionValueIsNotNull(moveToDayEnd, "selectDate.moveToDayEnd()");
        long timeInMilliSeconds2 = moveToDayEnd.getTimeInMilliSeconds() / ((long) 1000);
        this.f82929b = timeInMilliSeconds2;
        m123559c(timeInMilliSeconds2);
    }

    /* renamed from: a */
    public final void mo118242a(long j, long j2) {
        this.f82928a = j;
        this.f82929b = j2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeSelectDialog(Context context, Delegate aVar) {
        super(context, R.style.CommonDialog);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.f82933f = aVar;
        setContentView(LayoutInflater.from(context).inflate(R.layout.calendar_dialog_search_time_filter, (ViewGroup) null));
        m123567m();
        m123560f();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.e$h */
    public static final class C32369h implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ TimeSelectDialog f82940a;

        C32369h(TimeSelectDialog eVar) {
            this.f82940a = eVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (this.f82940a.f82930c == TimeFilterAttr.SelectTimeType.START_TIME && this.f82940a.f82928a != -1 && z) {
                TextView textView = (TextView) this.f82940a.findViewById(R.id.mStartTimeTV);
                Intrinsics.checkExpressionValueIsNotNull(textView, "mStartTimeTV");
                textView.setText(C32634ae.m125182b(R.string.Lark_Search_AnyTime));
                this.f82940a.f82928a = -1;
            } else if (this.f82940a.f82930c == TimeFilterAttr.SelectTimeType.END_TIME && this.f82940a.f82929b != -1 && z) {
                TextView textView2 = (TextView) this.f82940a.findViewById(R.id.mEndTimeTV);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "mEndTimeTV");
                textView2.setText(C32634ae.m125182b(R.string.Lark_Search_AnyTime));
                this.f82940a.f82929b = -1;
            }
        }
    }
}
