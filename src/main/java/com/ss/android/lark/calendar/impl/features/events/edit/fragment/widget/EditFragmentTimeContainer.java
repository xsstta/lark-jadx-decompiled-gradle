package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractView$OnTouchListenerC31108d;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.ITimeZoneChosenListener;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import java.util.HashMap;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 J2\u00020\u0001:\u0001JB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020)H\u0002J\b\u0010+\u001a\u00020)H\u0002J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0014J(\u0010/\u001a\u00020)2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007H\u0014J\u0006\u00104\u001a\u00020)J\u0006\u00105\u001a\u00020)J&\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\nJ\u0006\u0010;\u001a\u00020)J\u000e\u0010<\u001a\u00020)2\u0006\u00107\u001a\u00020\u0015J\u000e\u0010=\u001a\u00020)2\u0006\u0010>\u001a\u00020\u001fJ\u0006\u0010?\u001a\u00020)J\u000e\u0010@\u001a\u00020)2\u0006\u0010A\u001a\u00020BJ\u0006\u0010C\u001a\u00020)J\u0006\u0010D\u001a\u00020)J\u0006\u0010E\u001a\u00020)J\u0006\u0010F\u001a\u00020)J\b\u0010G\u001a\u00020)H\u0002J\u000e\u0010H\u001a\u00020)2\u0006\u0010I\u001a\u00020&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X.¢\u0006\u0004\n\u0002\u0010'¨\u0006K"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/EditFragmentTimeContainer;", "Landroid/widget/LinearLayout;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mCurrentTimeZone", "Ljava/util/TimeZone;", "mDivideBottomLocation", "", "mDivideTopLocation", "mDivideViewWidth", "mDividerCenterLocation", "mEndCalendar", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "mErrorTrapezoidPaint", "Landroid/graphics/Paint;", "mIsAllDay", "", "mIsEditable", "mLeftTrapezoidPath", "Landroid/graphics/Path;", "mRightTrapezoidPath", "mShowErrorBackground", "mShowLeftTrapezoid", "mShowRightTrapezoid", "mStartCalendar", "mTimeChosenListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/ITimeZoneChosenListener;", "mTrapezoidPaint", "mViewHeight", "mViewPaddingLeft", "mViewWidth", "mWeeks", "", "", "[Ljava/lang/String;", "endTimeViewClick", "", "initData", "initView", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "refreshEndTime", "refreshStartTime", "refreshTimeData", "isAllDay", "startCalendar", "endCalendar", "timeZone", "setEndTimeViewSelected", "setIsAllDay", "setOnTimeChosenListener", "listener", "setStartTimeViewSelected", "setTimeTypeface", "typeface", "Landroid/graphics/Typeface;", "showEndTimeCorrectTextColor", "showEndTimeErrorTextColor", "showErrorBackground", "showNormalBackground", "startTimeViewClick", "updateTimeZone", "timeZoneId", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EditFragmentTimeContainer extends LinearLayout {

    /* renamed from: g */
    public static final Companion f80953g = new Companion(null);

    /* renamed from: a */
    public int f80954a;

    /* renamed from: b */
    public int f80955b;

    /* renamed from: c */
    public float f80956c;

    /* renamed from: d */
    public float f80957d;

    /* renamed from: e */
    public float f80958e;

    /* renamed from: f */
    public boolean f80959f;

    /* renamed from: h */
    private final Paint f80960h;

    /* renamed from: i */
    private final Paint f80961i;

    /* renamed from: j */
    private Path f80962j;

    /* renamed from: k */
    private Path f80963k;

    /* renamed from: l */
    private int f80964l;

    /* renamed from: m */
    private int f80965m;

    /* renamed from: n */
    private boolean f80966n;

    /* renamed from: o */
    private boolean f80967o;

    /* renamed from: p */
    private boolean f80968p;

    /* renamed from: q */
    private ITimeZoneChosenListener f80969q;

    /* renamed from: r */
    private String[] f80970r;

    /* renamed from: s */
    private CalendarDate f80971s;

    /* renamed from: t */
    private CalendarDate f80972t;

    /* renamed from: u */
    private boolean f80973u;

    /* renamed from: v */
    private TimeZone f80974v;

    /* renamed from: w */
    private final Context f80975w;

    /* renamed from: x */
    private HashMap f80976x;

    public EditFragmentTimeContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public EditFragmentTimeContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo115946a(int i) {
        if (this.f80976x == null) {
            this.f80976x = new HashMap();
        }
        View view = (View) this.f80976x.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f80976x.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/EditFragmentTimeContainer$Companion;", "", "()V", "DIVIDE_WIDTH", "", "PADDING_LEFT", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.EditFragmentTimeContainer$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g */
    public final void mo115954g() {
        this.f80968p = true;
        invalidate();
    }

    /* renamed from: h */
    public final void mo115955h() {
        this.f80968p = false;
        invalidate();
    }

    /* renamed from: c */
    public final void mo115950c() {
        ITimeZoneChosenListener fVar = this.f80969q;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeChosenListener");
        }
        fVar.mo114312b();
    }

    /* renamed from: d */
    public final void mo115951d() {
        ITimeZoneChosenListener fVar = this.f80969q;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeChosenListener");
        }
        fVar.mo114311a();
    }

    /* renamed from: l */
    private final void m120711l() {
        LayoutInflater.from(this.f80975w).inflate(R.layout.view_choose_time_container, this);
        setOnTouchListener(new C31808b(this));
    }

    /* renamed from: k */
    private final void m120710k() {
        this.f80960h.setColor(this.f80975w.getResources().getColor(R.color.function_info_500));
        this.f80961i.setColor(this.f80975w.getResources().getColor(R.color.function_danger_500));
        this.f80955b = UIUtils.dp2px(this.f80975w, 12.0f);
        this.f80965m = UIUtils.dp2px(this.f80975w, 48.0f);
        String[] stringArray = this.f80975w.getResources().getStringArray(R.array.weeks_short);
        Intrinsics.checkExpressionValueIsNotNull(stringArray, "mContext.resources.getSt…rray(R.array.weeks_short)");
        this.f80970r = stringArray;
    }

    /* renamed from: i */
    public final void mo115956i() {
        ((TextView) mo115946a(R.id.tvEventEndTimeMain)).setTextColor(this.f80975w.getResources().getColor(R.color.function_danger_500));
        ((TextView) mo115946a(R.id.tvEventEndTimeMinor)).setTextColor(this.f80975w.getResources().getColor(R.color.function_danger_500));
        ((TextView) mo115946a(R.id.tvEventEndTimeExtra)).setTextColor(this.f80975w.getResources().getColor(R.color.function_danger_500));
    }

    /* renamed from: j */
    public final void mo115957j() {
        ((TextView) mo115946a(R.id.tvEventEndTimeMain)).setTextColor(this.f80975w.getResources().getColor(R.color.text_title));
        ((TextView) mo115946a(R.id.tvEventEndTimeMinor)).setTextColor(this.f80975w.getResources().getColor(R.color.text_placeholder));
        ((TextView) mo115946a(R.id.tvEventEndTimeExtra)).setTextColor(this.f80975w.getResources().getColor(R.color.text_placeholder));
    }

    /* renamed from: a */
    public final void mo115947a() {
        String str;
        String str2;
        String a = C32646c.m125255a(this.f80972t.getTimeInMilliSeconds(), this.f80974v, false);
        boolean z = true;
        if (this.f80973u) {
            str = C32646c.m125258a(this.f80972t, TimeZone.getDefault(), true);
            z = false;
        } else {
            int year = new CalendarDate(this.f80974v).getYear();
            if (this.f80971s.getYear() == this.f80972t.getYear() && year == this.f80972t.getYear()) {
                z = false;
            }
            str = C32646c.m125258a(this.f80972t, this.f80974v, z);
        }
        if (this.f80973u) {
            str2 = C32646c.m125253a(this.f80972t.getTimeInMilliSeconds(), TimeZone.getDefault());
        } else {
            str2 = C32646c.m125253a(this.f80972t.getTimeInMilliSeconds(), this.f80974v);
        }
        if (this.f80973u) {
            TextView textView = (TextView) mo115946a(R.id.tvEventEndTimeMain);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvEventEndTimeMain");
            textView.setText(str);
            TextView textView2 = (TextView) mo115946a(R.id.tvEventEndTimeMinor);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tvEventEndTimeMinor");
            textView2.setText(str2);
            TextView textView3 = (TextView) mo115946a(R.id.tvEventEndTimeExtra);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "tvEventEndTimeExtra");
            textView3.setVisibility(8);
            return;
        }
        TextView textView4 = (TextView) mo115946a(R.id.tvEventEndTimeMain);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "tvEventEndTimeMain");
        textView4.setText(a);
        TextView textView5 = (TextView) mo115946a(R.id.tvEventEndTimeMinor);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "tvEventEndTimeMinor");
        textView5.setText(str);
        if (z) {
            TextView textView6 = (TextView) mo115946a(R.id.tvEventEndTimeExtra);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "tvEventEndTimeExtra");
            textView6.setVisibility(8);
            return;
        }
        TextView textView7 = (TextView) mo115946a(R.id.tvEventEndTimeExtra);
        Intrinsics.checkExpressionValueIsNotNull(textView7, "tvEventEndTimeExtra");
        textView7.setText(str2);
        TextView textView8 = (TextView) mo115946a(R.id.tvEventEndTimeExtra);
        Intrinsics.checkExpressionValueIsNotNull(textView8, "tvEventEndTimeExtra");
        textView8.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo115949b() {
        String str;
        String str2;
        String a = C32646c.m125255a(this.f80971s.getTimeInMilliSeconds(), this.f80974v, false);
        boolean z = true;
        if (this.f80973u) {
            str = C32646c.m125258a(this.f80971s, TimeZone.getDefault(), true);
            Intrinsics.checkExpressionValueIsNotNull(str, "CalendarDateTimeShowUtil…eZone.getDefault(), true)");
            z = false;
        } else {
            int year = new CalendarDate(this.f80974v).getYear();
            if (this.f80971s.getYear() == this.f80972t.getYear() && year == this.f80971s.getYear()) {
                z = false;
            }
            str = C32646c.m125258a(this.f80971s, this.f80974v, z);
            Intrinsics.checkExpressionValueIsNotNull(str, "CalendarDateTimeShowUtil…Zone, isShowPartTimeYear)");
        }
        if (this.f80973u) {
            str2 = C32646c.m125253a(this.f80971s.getTimeInMilliSeconds(), TimeZone.getDefault());
        } else {
            str2 = C32646c.m125253a(this.f80971s.getTimeInMilliSeconds(), this.f80974v);
        }
        if (this.f80973u) {
            TextView textView = (TextView) mo115946a(R.id.tvEventStartTimeMain);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvEventStartTimeMain");
            textView.setText(str);
            TextView textView2 = (TextView) mo115946a(R.id.tvEventStartTimeMinor);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tvEventStartTimeMinor");
            textView2.setText(str2);
            TextView textView3 = (TextView) mo115946a(R.id.tvEventStartTimeExtra);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "tvEventStartTimeExtra");
            textView3.setVisibility(8);
            return;
        }
        TextView textView4 = (TextView) mo115946a(R.id.tvEventStartTimeMain);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "tvEventStartTimeMain");
        textView4.setText(a);
        TextView textView5 = (TextView) mo115946a(R.id.tvEventStartTimeMinor);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "tvEventStartTimeMinor");
        textView5.setText(str);
        if (z) {
            TextView textView6 = (TextView) mo115946a(R.id.tvEventStartTimeExtra);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "tvEventStartTimeExtra");
            textView6.setVisibility(8);
            return;
        }
        TextView textView7 = (TextView) mo115946a(R.id.tvEventStartTimeExtra);
        Intrinsics.checkExpressionValueIsNotNull(textView7, "tvEventStartTimeExtra");
        textView7.setText(str2);
        TextView textView8 = (TextView) mo115946a(R.id.tvEventStartTimeExtra);
        Intrinsics.checkExpressionValueIsNotNull(textView8, "tvEventStartTimeExtra");
        textView8.setVisibility(0);
    }

    /* renamed from: e */
    public final void mo115952e() {
        this.f80966n = true;
        this.f80967o = false;
        this.f80968p = false;
        invalidate();
        ((TextView) mo115946a(R.id.tvEventStartTimeMain)).setTextColor(this.f80975w.getResources().getColor(R.color.lkui_N00));
        ((TextView) mo115946a(R.id.tvEventStartTimeMinor)).setTextColor(this.f80975w.getResources().getColor(R.color.lkui_N00));
        ((TextView) mo115946a(R.id.tvEventStartTimeExtra)).setTextColor(this.f80975w.getResources().getColor(R.color.lkui_N00));
        ((TextView) mo115946a(R.id.tvEventEndTimeMain)).setTextColor(this.f80975w.getResources().getColor(R.color.text_title));
        ((TextView) mo115946a(R.id.tvEventEndTimeMinor)).setTextColor(this.f80975w.getResources().getColor(R.color.text_placeholder));
        ((TextView) mo115946a(R.id.tvEventEndTimeExtra)).setTextColor(this.f80975w.getResources().getColor(R.color.text_placeholder));
    }

    /* renamed from: f */
    public final void mo115953f() {
        this.f80967o = true;
        this.f80966n = false;
        this.f80968p = false;
        invalidate();
        ((TextView) mo115946a(R.id.tvEventStartTimeMain)).setTextColor(this.f80975w.getResources().getColor(R.color.text_title));
        ((TextView) mo115946a(R.id.tvEventStartTimeMinor)).setTextColor(this.f80975w.getResources().getColor(R.color.text_placeholder));
        ((TextView) mo115946a(R.id.tvEventStartTimeExtra)).setTextColor(this.f80975w.getResources().getColor(R.color.text_placeholder));
        ((TextView) mo115946a(R.id.tvEventEndTimeMain)).setTextColor(this.f80975w.getResources().getColor(R.color.lkui_N00));
        ((TextView) mo115946a(R.id.tvEventEndTimeMinor)).setTextColor(this.f80975w.getResources().getColor(R.color.lkui_N00));
        ((TextView) mo115946a(R.id.tvEventEndTimeExtra)).setTextColor(this.f80975w.getResources().getColor(R.color.lkui_N00));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/EditFragmentTimeContainer$initView$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/OnClickWithCoordinateListener;", "onClick", "", "view", "Landroid/view/View;", "upX", "", "upY", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.EditFragmentTimeContainer$b */
    public static final class C31808b extends AbstractView$OnTouchListenerC31108d {

        /* renamed from: a */
        final /* synthetic */ EditFragmentTimeContainer f80977a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31808b(EditFragmentTimeContainer editFragmentTimeContainer) {
            this.f80977a = editFragmentTimeContainer;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractView$OnTouchListenerC31108d
        /* renamed from: a */
        public void mo108680a(View view, float f, float f2) {
            boolean z;
            boolean z2;
            Intrinsics.checkParameterIsNotNull(view, "view");
            if (this.f80977a.f80959f) {
                double d = (((double) ((float) this.f80977a.f80954a)) / 2.0d) / ((double) ((float) this.f80977a.f80955b));
                boolean z3 = true;
                if (((double) (f2 / (f - this.f80977a.f80956c))) > d) {
                    z = true;
                } else {
                    z = false;
                }
                if ((((double) f2) - (((double) ((float) this.f80977a.f80954a)) / 2.0d)) / ((double) (this.f80977a.f80957d - f)) < d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (f <= this.f80977a.f80958e || f >= this.f80977a.f80957d) {
                    z3 = false;
                }
                if (f <= this.f80977a.f80958e || (z3 && z && z2)) {
                    this.f80977a.mo115951d();
                } else {
                    this.f80977a.mo115950c();
                }
            }
        }
    }

    public final void setOnTimeChosenListener(ITimeZoneChosenListener fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        this.f80969q = fVar;
    }

    public final void setIsAllDay(boolean z) {
        this.f80973u = z;
        mo115949b();
        mo115947a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        if (this.f80966n) {
            canvas.drawPath(this.f80962j, this.f80960h);
        } else if (this.f80967o) {
            if (this.f80968p) {
                canvas.drawPath(this.f80963k, this.f80961i);
            } else {
                canvas.drawPath(this.f80963k, this.f80960h);
            }
        }
        canvas.restore();
    }

    public final void setTimeTypeface(Typeface typeface) {
        Intrinsics.checkParameterIsNotNull(typeface, "typeface");
        TextView textView = (TextView) mo115946a(R.id.tvEventStartTimeMain);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvEventStartTimeMain");
        textView.setTypeface(typeface);
        TextView textView2 = (TextView) mo115946a(R.id.tvEventEndTimeMain);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvEventEndTimeMain");
        textView2.setTypeface(typeface);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditFragmentTimeContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f80975w = context;
        this.f80960h = new Paint();
        this.f80961i = new Paint();
        this.f80962j = new Path();
        this.f80963k = new Path();
        this.f80971s = new CalendarDate();
        this.f80972t = new CalendarDate();
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        this.f80974v = timeZone;
        this.f80959f = true;
        m120710k();
        m120711l();
    }

    /* renamed from: a */
    public final void mo115948a(boolean z, CalendarDate calendarDate, CalendarDate calendarDate2, TimeZone timeZone) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "startCalendar");
        Intrinsics.checkParameterIsNotNull(calendarDate2, "endCalendar");
        Intrinsics.checkParameterIsNotNull(timeZone, "timeZone");
        this.f80973u = z;
        this.f80971s = calendarDate;
        this.f80972t = calendarDate2;
        this.f80974v = timeZone;
        mo115949b();
        mo115947a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f80964l = i;
        this.f80954a = i2;
        float f = (float) ((i - this.f80955b) / 2);
        this.f80956c = f;
        this.f80957d = f + ((float) UIUtils.dp2px(this.f80975w, 12.0f));
        this.f80958e = this.f80956c;
        Path path = new Path();
        this.f80962j = path;
        path.lineTo(this.f80956c, BitmapDescriptorFactory.HUE_RED);
        this.f80962j.lineTo(this.f80957d, (float) (this.f80954a / 2));
        this.f80962j.lineTo(this.f80958e, (float) this.f80954a);
        this.f80962j.lineTo(BitmapDescriptorFactory.HUE_RED, (float) this.f80954a);
        this.f80962j.close();
        Path path2 = new Path();
        this.f80963k = path2;
        path2.moveTo(this.f80956c, BitmapDescriptorFactory.HUE_RED);
        this.f80963k.lineTo(this.f80957d, (float) (this.f80954a / 2));
        this.f80963k.lineTo(this.f80958e, (float) this.f80954a);
        this.f80963k.lineTo((float) this.f80964l, (float) this.f80954a);
        this.f80963k.lineTo((float) this.f80964l, BitmapDescriptorFactory.HUE_RED);
        this.f80963k.close();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditFragmentTimeContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
