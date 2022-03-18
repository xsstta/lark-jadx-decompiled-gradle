package com.ss.android.lark.calendar.impl.features.events.edit.container;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractView$OnTouchListenerC31108d;
import com.ss.android.lark.calendar.impl.features.events.edit.data.TimeData;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.ITimeZoneChosenListener;
import com.ss.android.lark.calendar.impl.features.events.edit.utils.EventTimeZoneUtils;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J(\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0014J\u0006\u0010&\u001a\u00020\u001dJ\u0006\u0010'\u001a\u00020\u001dJ\u0006\u0010(\u001a\u00020\u001dJ\u0006\u0010)\u001a\u00020\u001dJ\u000e\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0015J\u000e\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u0013J\u000e\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u00020\u001dJ\b\u00102\u001a\u00020\u001dH\u0002J\u000e\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aX.¢\u0006\u0004\n\u0002\u0010\u001b¨\u00065"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/container/MultiTimeContainer;", "Landroid/widget/LinearLayout;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mCurrentTimeZone", "Ljava/util/TimeZone;", "mDeviceWidth", "mEndCalendar", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "mIsAllDay", "", "mIsEditable", "mStartCalendar", "mTimeChosenListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/ITimeZoneChosenListener;", "mTimeData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/TimeData;", "mTimeZoneId", "", "mViewHeight", "mWeeks", "", "[Ljava/lang/String;", "checkShowTimeZoneContainer", "", "endTimeViewClick", "initData", "initView", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "refreshEndTime", "refreshStartTime", "refreshTimeZoneView", "refreshWholeView", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setOnTimeChosenListener", "listener", "setTimeTypeface", "typeface", "Landroid/graphics/Typeface;", "setTimeUnEditable", "startTimeViewClick", "updateCurrentTimeZoneData", "timeZoneId", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MultiTimeContainer extends LinearLayout {

    /* renamed from: a */
    public boolean f80131a;

    /* renamed from: b */
    public int f80132b;

    /* renamed from: c */
    public int f80133c;

    /* renamed from: d */
    private String[] f80134d;

    /* renamed from: e */
    private TimeData f80135e;

    /* renamed from: f */
    private CalendarDate f80136f;

    /* renamed from: g */
    private CalendarDate f80137g;

    /* renamed from: h */
    private boolean f80138h;

    /* renamed from: i */
    private TimeZone f80139i;

    /* renamed from: j */
    private String f80140j;

    /* renamed from: k */
    private ITimeZoneChosenListener f80141k;

    /* renamed from: l */
    private final Context f80142l;

    /* renamed from: m */
    private HashMap f80143m;

    public MultiTimeContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public MultiTimeContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo114797a(int i) {
        if (this.f80143m == null) {
            this.f80143m = new HashMap();
        }
        View view = (View) this.f80143m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f80143m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo114798a() {
        ITimeZoneChosenListener fVar = this.f80141k;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeChosenListener");
        }
        fVar.mo114311a();
    }

    /* renamed from: b */
    public final void mo114800b() {
        ITimeZoneChosenListener fVar = this.f80141k;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeChosenListener");
        }
        fVar.mo114312b();
    }

    /* renamed from: c */
    public final void mo114801c() {
        mo114804f();
        mo114803e();
        mo114802d();
    }

    /* renamed from: h */
    private final void m119145h() {
        LayoutInflater.from(this.f80142l).inflate(R.layout.view_event_time_container_fg, this);
        setOnTouchListener(new C31602a(this));
    }

    /* renamed from: i */
    private final void m119146i() {
        String[] stringArray = this.f80142l.getResources().getStringArray(R.array.weeks_short);
        Intrinsics.checkExpressionValueIsNotNull(stringArray, "mContext.resources.getSt…rray(R.array.weeks_short)");
        this.f80134d = stringArray;
    }

    /* renamed from: j */
    private final void m119147j() {
        boolean z;
        TimeData timeData = this.f80135e;
        if (timeData != null) {
            z = timeData.isGuestInDifferentLocalTime();
        } else {
            z = false;
        }
        if (!this.f80131a || !z) {
            LinearLayout linearLayout = (LinearLayout) mo114797a(R.id.timeZoneWarn);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "timeZoneWarn");
            linearLayout.setVisibility(8);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) mo114797a(R.id.timeZoneWarn);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "timeZoneWarn");
        linearLayout2.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo114802d() {
        if (this.f80138h) {
            View a = mo114797a(R.id.timeDivider);
            Intrinsics.checkExpressionValueIsNotNull(a, "timeDivider");
            a.setVisibility(8);
            TextView textView = (TextView) mo114797a(R.id.timeZoneTextView);
            Intrinsics.checkExpressionValueIsNotNull(textView, "timeZoneTextView");
            textView.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) mo114797a(R.id.timeZoneWarn);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "timeZoneWarn");
            linearLayout.setVisibility(8);
            return;
        }
        View a2 = mo114797a(R.id.timeDivider);
        Intrinsics.checkExpressionValueIsNotNull(a2, "timeDivider");
        a2.setVisibility(0);
        TextView textView2 = (TextView) mo114797a(R.id.timeZoneTextView);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "timeZoneTextView");
        textView2.setVisibility(0);
        TextView textView3 = (TextView) mo114797a(R.id.timeZoneTextView);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "timeZoneTextView");
        textView3.setText(EventTimeZoneUtils.f80188a.mo114871a(this.f80139i, new Date(this.f80136f.getTimeInMilliSeconds())));
        m119147j();
    }

    /* renamed from: e */
    public final void mo114803e() {
        String str;
        String str2;
        String a = C32646c.m125255a(this.f80137g.getTimeInMilliSeconds(), this.f80139i, false);
        boolean z = true;
        if (this.f80138h) {
            str = C32646c.m125258a(this.f80137g, TimeZone.getDefault(), true);
            Intrinsics.checkExpressionValueIsNotNull(str, "CalendarDateTimeShowUtil…eZone.getDefault(), true)");
            z = false;
        } else {
            int year = new CalendarDate(this.f80139i).getYear();
            if (this.f80136f.getYear() == this.f80137g.getYear() && year == this.f80137g.getYear()) {
                z = false;
            }
            str = C32646c.m125258a(this.f80137g, this.f80139i, z);
            Intrinsics.checkExpressionValueIsNotNull(str, "CalendarDateTimeShowUtil…Zone, isShowPartTimeYear)");
        }
        if (this.f80138h) {
            str2 = C32646c.m125253a(this.f80137g.getTimeInMilliSeconds(), TimeZone.getDefault());
            Intrinsics.checkExpressionValueIsNotNull(str2, "CalendarDateTimeShowUtil…s, TimeZone.getDefault())");
        } else {
            str2 = C32646c.m125253a(this.f80137g.getTimeInMilliSeconds(), this.f80139i);
            Intrinsics.checkExpressionValueIsNotNull(str2, "CalendarDateTimeShowUtil…econds, mCurrentTimeZone)");
        }
        if (this.f80138h) {
            TextView textView = (TextView) mo114797a(R.id.tvEventEndTimeMain);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvEventEndTimeMain");
            textView.setText(str);
            TextView textView2 = (TextView) mo114797a(R.id.tvEventEndTimeMinor);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tvEventEndTimeMinor");
            textView2.setText(str2);
            TextView textView3 = (TextView) mo114797a(R.id.tvEventEndTimeExtra);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "tvEventEndTimeExtra");
            textView3.setVisibility(8);
            return;
        }
        TextView textView4 = (TextView) mo114797a(R.id.tvEventEndTimeMain);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "tvEventEndTimeMain");
        textView4.setText(a);
        TextView textView5 = (TextView) mo114797a(R.id.tvEventEndTimeMinor);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "tvEventEndTimeMinor");
        textView5.setText(str);
        if (z) {
            TextView textView6 = (TextView) mo114797a(R.id.tvEventEndTimeExtra);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "tvEventEndTimeExtra");
            textView6.setVisibility(8);
            return;
        }
        TextView textView7 = (TextView) mo114797a(R.id.tvEventEndTimeExtra);
        Intrinsics.checkExpressionValueIsNotNull(textView7, "tvEventEndTimeExtra");
        textView7.setText(str2);
        TextView textView8 = (TextView) mo114797a(R.id.tvEventEndTimeExtra);
        Intrinsics.checkExpressionValueIsNotNull(textView8, "tvEventEndTimeExtra");
        textView8.setVisibility(0);
    }

    /* renamed from: f */
    public final void mo114804f() {
        String str;
        String str2;
        String a = C32646c.m125255a(this.f80136f.getTimeInMilliSeconds(), this.f80139i, false);
        boolean z = true;
        if (this.f80138h) {
            str = C32646c.m125258a(this.f80136f, TimeZone.getDefault(), true);
            Intrinsics.checkExpressionValueIsNotNull(str, "CalendarDateTimeShowUtil…eZone.getDefault(), true)");
            z = false;
        } else {
            int year = new CalendarDate(this.f80139i).getYear();
            if (this.f80136f.getYear() == this.f80137g.getYear() && year == this.f80136f.getYear()) {
                z = false;
            }
            str = C32646c.m125258a(this.f80136f, this.f80139i, z);
            Intrinsics.checkExpressionValueIsNotNull(str, "CalendarDateTimeShowUtil…Zone, isShowPartTimeYear)");
        }
        if (this.f80138h) {
            str2 = C32646c.m125253a(this.f80136f.getTimeInMilliSeconds(), TimeZone.getDefault());
            Intrinsics.checkExpressionValueIsNotNull(str2, "CalendarDateTimeShowUtil…s, TimeZone.getDefault())");
        } else {
            str2 = C32646c.m125253a(this.f80136f.getTimeInMilliSeconds(), this.f80139i);
            Intrinsics.checkExpressionValueIsNotNull(str2, "CalendarDateTimeShowUtil…econds, mCurrentTimeZone)");
        }
        if (this.f80138h) {
            TextView textView = (TextView) mo114797a(R.id.tvEventStartTimeMain);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvEventStartTimeMain");
            textView.setText(str);
            TextView textView2 = (TextView) mo114797a(R.id.tvEventStartTimeMinor);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tvEventStartTimeMinor");
            textView2.setText(str2);
            TextView textView3 = (TextView) mo114797a(R.id.tvEventStartTimeExtra);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "tvEventStartTimeExtra");
            textView3.setVisibility(8);
            return;
        }
        TextView textView4 = (TextView) mo114797a(R.id.tvEventStartTimeMain);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "tvEventStartTimeMain");
        textView4.setText(a);
        TextView textView5 = (TextView) mo114797a(R.id.tvEventStartTimeMinor);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "tvEventStartTimeMinor");
        textView5.setText(str);
        if (z) {
            TextView textView6 = (TextView) mo114797a(R.id.tvEventStartTimeExtra);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "tvEventStartTimeExtra");
            textView6.setVisibility(8);
            return;
        }
        TextView textView7 = (TextView) mo114797a(R.id.tvEventStartTimeExtra);
        Intrinsics.checkExpressionValueIsNotNull(textView7, "tvEventStartTimeExtra");
        textView7.setText(str2);
        TextView textView8 = (TextView) mo114797a(R.id.tvEventStartTimeExtra);
        Intrinsics.checkExpressionValueIsNotNull(textView8, "tvEventStartTimeExtra");
        textView8.setVisibility(0);
    }

    /* renamed from: g */
    public final void mo114805g() {
        this.f80131a = false;
        ((TextView) mo114797a(R.id.tvEventStartTimeMain)).setTextColor(this.f80142l.getResources().getColor(R.color.text_placeholder));
        ((TextView) mo114797a(R.id.tvEventStartTimeMinor)).setTextColor(this.f80142l.getResources().getColor(R.color.text_placeholder));
        ((TextView) mo114797a(R.id.tvEventStartTimeExtra)).setTextColor(this.f80142l.getResources().getColor(R.color.text_placeholder));
        ((TextView) mo114797a(R.id.tvEventEndTimeMain)).setTextColor(this.f80142l.getResources().getColor(R.color.text_placeholder));
        ((TextView) mo114797a(R.id.tvEventEndTimeMinor)).setTextColor(this.f80142l.getResources().getColor(R.color.text_placeholder));
        ((TextView) mo114797a(R.id.tvEventEndTimeExtra)).setTextColor(this.f80142l.getResources().getColor(R.color.text_placeholder));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/container/MultiTimeContainer$initView$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/OnClickWithCoordinateListener;", "onClick", "", "view", "Landroid/view/View;", "upX", "", "upY", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.MultiTimeContainer$a */
    public static final class C31602a extends AbstractView$OnTouchListenerC31108d {

        /* renamed from: a */
        final /* synthetic */ MultiTimeContainer f80144a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31602a(MultiTimeContainer multiTimeContainer) {
            this.f80144a = multiTimeContainer;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractView$OnTouchListenerC31108d
        /* renamed from: a */
        public void mo108680a(View view, float f, float f2) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            if (this.f80144a.f80131a) {
                RelativeLayout relativeLayout = (RelativeLayout) this.f80144a.mo114797a(R.id.timeContainer);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "timeContainer");
                if (f2 > ((float) relativeLayout.getMeasuredHeight()) && f2 <= ((float) this.f80144a.f80133c)) {
                    this.f80144a.mo114798a();
                } else if (f <= ((float) (this.f80144a.f80132b / 2))) {
                    this.f80144a.mo114798a();
                } else {
                    this.f80144a.mo114800b();
                }
                LinearLayout linearLayout = (LinearLayout) this.f80144a.mo114797a(R.id.timeZoneWarn);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "timeZoneWarn");
                if (linearLayout.getVisibility() == 0) {
                    GeneralHitPoint.m124267q();
                }
            }
        }
    }

    public final void setOnTimeChosenListener(ITimeZoneChosenListener fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        this.f80141k = fVar;
    }

    /* renamed from: a */
    public final void mo114799a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        if (!TextUtils.isEmpty(str)) {
            TimeZone timeZone = TimeZone.getTimeZone(str);
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getTimeZone(timeZoneId)");
            this.f80139i = timeZone;
        }
    }

    public final void setData(TimeData timeData) {
        Intrinsics.checkParameterIsNotNull(timeData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f80135e = timeData;
        this.f80136f.setTimeInSeconds(timeData.getStartTime());
        this.f80137g.setTimeInSeconds(timeData.getEndTime());
        this.f80138h = timeData.isAllDay();
        String timeZoneId = timeData.getTimeZoneId();
        this.f80140j = timeZoneId;
        mo114799a(timeZoneId);
        this.f80136f.setTimeZone(this.f80139i);
        this.f80137g.setTimeZone(this.f80139i);
    }

    public final void setTimeTypeface(Typeface typeface) {
        Intrinsics.checkParameterIsNotNull(typeface, "typeface");
        TextView textView = (TextView) mo114797a(R.id.tvEventStartTimeMain);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvEventStartTimeMain");
        textView.setTypeface(typeface);
        TextView textView2 = (TextView) mo114797a(R.id.tvEventEndTimeMain);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvEventEndTimeMain");
        textView2.setTypeface(typeface);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTimeContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f80142l = context;
        this.f80136f = new CalendarDate();
        this.f80137g = new CalendarDate();
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        this.f80139i = timeZone;
        this.f80140j = "";
        this.f80131a = true;
        m119145h();
        m119146i();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f80132b = i;
        this.f80133c = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiTimeContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
