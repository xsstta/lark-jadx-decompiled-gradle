package com.ss.android.lark.mail.impl.widget.time;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.utils.C43760c;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J(\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0014J\u0006\u0010&\u001a\u00020\u001dJ\u0006\u0010'\u001a\u00020\u001dJ\u0006\u0010(\u001a\u00020\u001dJ\u0006\u0010)\u001a\u00020\u001dJ\u000e\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0019J\u000e\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u0017J\u000e\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u00020\u001dJ\b\u00102\u001a\u00020\u001dH\u0002J\u000e\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X.¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X.¢\u0006\u0004\n\u0002\u0010\u0014¨\u00065"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/MultiTimeContainer;", "Landroid/widget/LinearLayout;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mCurrentTimeZone", "Ljava/util/TimeZone;", "mDeviceWidth", "mEndCalendar", "Lcom/ss/android/lark/mail/impl/widget/time/CalendarDate;", "mIsAllDay", "", "mIsEditable", "mMonths", "", "", "[Ljava/lang/String;", "mStartCalendar", "mTimeChosenListener", "Lcom/ss/android/lark/mail/impl/widget/time/ITimeZoneChosenListener;", "mTimeData", "Lcom/ss/android/lark/mail/impl/widget/time/TimeData;", "mTimeZoneId", "mWeeks", "checkShowTimeZoneContainer", "", "endTimeViewClick", "initData", "initView", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "refreshEndTime", "refreshStartTime", "refreshTimeZoneView", "refreshWholeView", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setOnTimeChosenListener", "listener", "setTimeTypeface", "typeface", "Landroid/graphics/Typeface;", "setTimeUnEditable", "startTimeViewClick", "updateCurrentTimeZoneData", "timeZoneId", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MultiTimeContainer extends LinearLayout {

    /* renamed from: a */
    public boolean f111839a;

    /* renamed from: b */
    public int f111840b;

    /* renamed from: c */
    private String[] f111841c;

    /* renamed from: d */
    private String[] f111842d;

    /* renamed from: e */
    private TimeData f111843e;

    /* renamed from: f */
    private CalendarDate f111844f;

    /* renamed from: g */
    private CalendarDate f111845g;

    /* renamed from: h */
    private boolean f111846h;

    /* renamed from: i */
    private TimeZone f111847i;

    /* renamed from: j */
    private String f111848j;

    /* renamed from: k */
    private AbstractC44132n f111849k;

    /* renamed from: l */
    private final Context f111850l;

    /* renamed from: m */
    private HashMap f111851m;

    public MultiTimeContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public MultiTimeContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo156790a(int i) {
        if (this.f111851m == null) {
            this.f111851m = new HashMap();
        }
        View view = (View) this.f111851m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f111851m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo156791a() {
        AbstractC44132n nVar = this.f111849k;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeChosenListener");
        }
        nVar.mo155319b();
    }

    /* renamed from: b */
    public final void mo156793b() {
        AbstractC44132n nVar = this.f111849k;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeChosenListener");
        }
        nVar.mo155318a();
    }

    /* renamed from: c */
    public final void mo156794c() {
        mo156797f();
        mo156796e();
        mo156795d();
    }

    /* renamed from: g */
    private final void m174546g() {
        LayoutInflater.from(this.f111850l).inflate(R.layout.mail_view_event_time_container_fg, this);
        setOnTouchListener(new C44070a(this));
    }

    /* renamed from: i */
    private final void m174548i() {
        LinearLayout linearLayout = (LinearLayout) mo156790a(R.id.timeZoneWarn);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "timeZoneWarn");
        linearLayout.setVisibility(8);
    }

    /* renamed from: h */
    private final void m174547h() {
        String[] stringArray = this.f111850l.getResources().getStringArray(R.array.mail_weeks);
        Intrinsics.checkExpressionValueIsNotNull(stringArray, "mContext.resources.getSt…Array(R.array.mail_weeks)");
        this.f111841c = stringArray;
        String[] stringArray2 = this.f111850l.getResources().getStringArray(R.array.mail_MonthNumAbbr);
        Intrinsics.checkExpressionValueIsNotNull(stringArray2, "mContext.resources.getSt….array.mail_MonthNumAbbr)");
        this.f111842d = stringArray2;
    }

    /* renamed from: d */
    public final void mo156795d() {
        if (this.f111846h) {
            View a = mo156790a(R.id.timeDivider);
            Intrinsics.checkExpressionValueIsNotNull(a, "timeDivider");
            a.setVisibility(8);
            TextView textView = (TextView) mo156790a(R.id.timeZoneTextView);
            Intrinsics.checkExpressionValueIsNotNull(textView, "timeZoneTextView");
            textView.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) mo156790a(R.id.timeZoneWarn);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "timeZoneWarn");
            linearLayout.setVisibility(8);
            return;
        }
        View a2 = mo156790a(R.id.timeDivider);
        Intrinsics.checkExpressionValueIsNotNull(a2, "timeDivider");
        a2.setVisibility(0);
        TextView textView2 = (TextView) mo156790a(R.id.timeZoneTextView);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "timeZoneTextView");
        textView2.setVisibility(0);
        TextView textView3 = (TextView) mo156790a(R.id.timeZoneTextView);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "timeZoneTextView");
        textView3.setText(C43760c.m173469a(this.f111847i, new Date(this.f111844f.getTimeInMilliSeconds())));
        m174548i();
    }

    /* renamed from: e */
    public final void mo156796e() {
        String str;
        String str2;
        String a = C43760c.m173466a(this.f111845g.getTimeInMilliSeconds(), this.f111847i, false);
        boolean z = true;
        if (this.f111846h) {
            str = C43760c.m173468a(this.f111845g, TimeZone.getDefault(), true);
            Intrinsics.checkExpressionValueIsNotNull(str, "CalendarDateTimeShowUtil…eZone.getDefault(), true)");
        } else {
            if (this.f111844f.getYear() >= this.f111845g.getYear()) {
                z = false;
            }
            str = C43760c.m173468a(this.f111845g, this.f111847i, z);
            Intrinsics.checkExpressionValueIsNotNull(str, "CalendarDateTimeShowUtil…rentTimeZone, isShowYear)");
        }
        if (this.f111846h) {
            str2 = C43760c.m173465a(this.f111845g.getTimeInMilliSeconds(), TimeZone.getDefault());
            Intrinsics.checkExpressionValueIsNotNull(str2, "CalendarDateTimeShowUtil…s, TimeZone.getDefault())");
        } else {
            str2 = C43760c.m173465a(this.f111845g.getTimeInMilliSeconds(), this.f111847i);
            Intrinsics.checkExpressionValueIsNotNull(str2, "CalendarDateTimeShowUtil…econds, mCurrentTimeZone)");
        }
        if (this.f111846h) {
            TextView textView = (TextView) mo156790a(R.id.tvEventEndTimeMain);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvEventEndTimeMain");
            textView.setText(str);
            TextView textView2 = (TextView) mo156790a(R.id.tvEventEndTimeMinor);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tvEventEndTimeMinor");
            textView2.setText(str2);
            TextView textView3 = (TextView) mo156790a(R.id.tvEventEndTimeExtra);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "tvEventEndTimeExtra");
            textView3.setVisibility(8);
            return;
        }
        TextView textView4 = (TextView) mo156790a(R.id.tvEventEndTimeMain);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "tvEventEndTimeMain");
        textView4.setText(a);
        TextView textView5 = (TextView) mo156790a(R.id.tvEventEndTimeMinor);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "tvEventEndTimeMinor");
        textView5.setText(str);
        TextView textView6 = (TextView) mo156790a(R.id.tvEventEndTimeExtra);
        Intrinsics.checkExpressionValueIsNotNull(textView6, "tvEventEndTimeExtra");
        textView6.setText(str2);
        TextView textView7 = (TextView) mo156790a(R.id.tvEventEndTimeExtra);
        Intrinsics.checkExpressionValueIsNotNull(textView7, "tvEventEndTimeExtra");
        textView7.setVisibility(0);
    }

    /* renamed from: f */
    public final void mo156797f() {
        String str;
        String str2;
        String a = C43760c.m173466a(this.f111844f.getTimeInMilliSeconds(), this.f111847i, false);
        boolean z = true;
        if (this.f111846h) {
            str = C43760c.m173468a(this.f111844f, TimeZone.getDefault(), true);
            Intrinsics.checkExpressionValueIsNotNull(str, "CalendarDateTimeShowUtil…eZone.getDefault(), true)");
        } else {
            if (this.f111844f.getYear() >= this.f111845g.getYear()) {
                z = false;
            }
            str = C43760c.m173468a(this.f111844f, this.f111847i, z);
            Intrinsics.checkExpressionValueIsNotNull(str, "CalendarDateTimeShowUtil…rentTimeZone, isShowYear)");
        }
        if (this.f111846h) {
            str2 = C43760c.m173465a(this.f111844f.getTimeInMilliSeconds(), TimeZone.getDefault());
            Intrinsics.checkExpressionValueIsNotNull(str2, "CalendarDateTimeShowUtil…s, TimeZone.getDefault())");
        } else {
            str2 = C43760c.m173465a(this.f111844f.getTimeInMilliSeconds(), this.f111847i);
            Intrinsics.checkExpressionValueIsNotNull(str2, "CalendarDateTimeShowUtil…econds, mCurrentTimeZone)");
        }
        if (this.f111846h) {
            TextView textView = (TextView) mo156790a(R.id.tvEventStartTimeMain);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvEventStartTimeMain");
            textView.setText(str);
            TextView textView2 = (TextView) mo156790a(R.id.tvEventStartTimeMinor);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tvEventStartTimeMinor");
            textView2.setText(str2);
            TextView textView3 = (TextView) mo156790a(R.id.tvEventStartTimeExtra);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "tvEventStartTimeExtra");
            textView3.setVisibility(8);
            return;
        }
        TextView textView4 = (TextView) mo156790a(R.id.tvEventStartTimeMain);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "tvEventStartTimeMain");
        textView4.setText(a);
        TextView textView5 = (TextView) mo156790a(R.id.tvEventStartTimeMinor);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "tvEventStartTimeMinor");
        textView5.setText(str);
        TextView textView6 = (TextView) mo156790a(R.id.tvEventStartTimeExtra);
        Intrinsics.checkExpressionValueIsNotNull(textView6, "tvEventStartTimeExtra");
        textView6.setText(str2);
        TextView textView7 = (TextView) mo156790a(R.id.tvEventStartTimeExtra);
        Intrinsics.checkExpressionValueIsNotNull(textView7, "tvEventStartTimeExtra");
        textView7.setVisibility(0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014¨\u0006\t"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/MultiTimeContainer$initView$1", "Lcom/ss/android/lark/mail/impl/widget/time/OnClickWithCoordinateListener;", "onClick", "", "view", "Landroid/view/View;", "upX", "", "upY", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.MultiTimeContainer$a */
    public static final class C44070a extends AbstractView$OnTouchListenerC44133o {

        /* renamed from: a */
        final /* synthetic */ MultiTimeContainer f111852a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44070a(MultiTimeContainer multiTimeContainer) {
            this.f111852a = multiTimeContainer;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.mail.impl.widget.time.AbstractView$OnTouchListenerC44133o
        /* renamed from: a */
        public void mo156802a(View view, float f, float f2) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            if (!this.f111852a.f111839a) {
                return;
            }
            if (f <= ((float) (this.f111852a.f111840b / 2))) {
                this.f111852a.mo156791a();
            } else {
                this.f111852a.mo156793b();
            }
        }
    }

    public final void setOnTimeChosenListener(AbstractC44132n nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "listener");
        this.f111849k = nVar;
    }

    /* renamed from: a */
    public final void mo156792a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        if (!TextUtils.isEmpty(str)) {
            TimeZone timeZone = TimeZone.getTimeZone(str);
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getTimeZone(timeZoneId)");
            this.f111847i = timeZone;
        }
    }

    public final void setData(TimeData timeData) {
        Intrinsics.checkParameterIsNotNull(timeData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f111843e = timeData;
        this.f111844f.setTimeInSeconds(timeData.getStartTime());
        this.f111845g.setTimeInSeconds(timeData.getEndTime());
        this.f111846h = timeData.isAllDay();
        String timeZoneId = timeData.getTimeZoneId();
        this.f111848j = timeZoneId;
        mo156792a(timeZoneId);
        this.f111844f.setTimeZone(this.f111847i);
        this.f111845g.setTimeZone(this.f111847i);
    }

    public final void setTimeTypeface(Typeface typeface) {
        Intrinsics.checkParameterIsNotNull(typeface, "typeface");
        TextView textView = (TextView) mo156790a(R.id.tvEventStartTimeMain);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvEventStartTimeMain");
        textView.setTypeface(typeface);
        TextView textView2 = (TextView) mo156790a(R.id.tvEventEndTimeMain);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvEventEndTimeMain");
        textView2.setTypeface(typeface);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTimeContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f111850l = context;
        this.f111844f = new CalendarDate();
        this.f111845g = new CalendarDate();
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        this.f111847i = timeZone;
        this.f111848j = "";
        this.f111839a = true;
        m174546g();
        m174547h();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f111840b = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiTimeContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
