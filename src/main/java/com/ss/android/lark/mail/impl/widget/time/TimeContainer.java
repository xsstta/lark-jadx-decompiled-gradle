package com.ss.android.lark.mail.impl.widget.time;

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
import com.ss.android.lark.mail.impl.utils.C43760c;
import java.util.HashMap;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 K2\u00020\u0001:\u0001KB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020*H\u0002J\b\u0010,\u001a\u00020*H\u0002J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/H\u0014J(\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0014J\u0006\u00105\u001a\u00020*J\u0006\u00106\u001a\u00020*J&\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\nJ\u0006\u0010<\u001a\u00020*J\u000e\u0010=\u001a\u00020*2\u0006\u00108\u001a\u00020\u0015J\u000e\u0010>\u001a\u00020*2\u0006\u0010?\u001a\u00020#J\u0006\u0010@\u001a\u00020*J\u000e\u0010A\u001a\u00020*2\u0006\u0010B\u001a\u00020CJ\u0006\u0010D\u001a\u00020*J\u0006\u0010E\u001a\u00020*J\u0006\u0010F\u001a\u00020*J\u0006\u0010G\u001a\u00020*J\b\u0010H\u001a\u00020*H\u0002J\u000e\u0010I\u001a\u00020*2\u0006\u0010J\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX.¢\u0006\u0004\n\u0002\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX.¢\u0006\u0004\n\u0002\u0010\u001c¨\u0006L"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/TimeContainer;", "Landroid/widget/LinearLayout;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mCurrentTimeZone", "Ljava/util/TimeZone;", "mDivideBottomLocation", "", "mDivideTopLocation", "mDivideViewWidth", "mDividerCenterLocation", "mEndCalendar", "Lcom/ss/android/lark/mail/impl/widget/time/CalendarDate;", "mErrorTrapezoidPaint", "Landroid/graphics/Paint;", "mIsAllDay", "", "mIsEditable", "mLeftTrapezoidPath", "Landroid/graphics/Path;", "mMonths", "", "", "[Ljava/lang/String;", "mRightTrapezoidPath", "mShowErrorBackground", "mShowLeftTrapezoid", "mShowRightTrapezoid", "mStartCalendar", "mTimeChosenListener", "Lcom/ss/android/lark/mail/impl/widget/time/ITimeChosenListener;", "mTrapezoidPaint", "mViewHeight", "mViewPaddingLeft", "mViewWidth", "mWeeks", "endTimeViewClick", "", "initData", "initView", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "refreshEndTime", "refreshStartTime", "refreshTimeData", "isAllDay", "startCalendar", "endCalendar", "timeZone", "setEndTimeViewSelected", "setIsAllDay", "setOnTimeChosenListener", "listener", "setStartTimeViewSelected", "setTimeTypeface", "typeface", "Landroid/graphics/Typeface;", "showEndTimeCorrectTextColor", "showEndTimeErrorTextColor", "showErrorBackground", "showNormalBackground", "startTimeViewClick", "updateTimeZone", "timeZoneId", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TimeContainer extends LinearLayout {

    /* renamed from: g */
    public static final Companion f111855g = new Companion(null);

    /* renamed from: a */
    public int f111856a;

    /* renamed from: b */
    public int f111857b;

    /* renamed from: c */
    public float f111858c;

    /* renamed from: d */
    public float f111859d;

    /* renamed from: e */
    public float f111860e;

    /* renamed from: f */
    public boolean f111861f;

    /* renamed from: h */
    private final Paint f111862h;

    /* renamed from: i */
    private final Paint f111863i;

    /* renamed from: j */
    private Path f111864j;

    /* renamed from: k */
    private Path f111865k;

    /* renamed from: l */
    private int f111866l;

    /* renamed from: m */
    private int f111867m;

    /* renamed from: n */
    private boolean f111868n;

    /* renamed from: o */
    private boolean f111869o;

    /* renamed from: p */
    private boolean f111870p;

    /* renamed from: q */
    private ITimeChosenListener f111871q;

    /* renamed from: r */
    private String[] f111872r;

    /* renamed from: s */
    private String[] f111873s;

    /* renamed from: t */
    private CalendarDate f111874t;

    /* renamed from: u */
    private CalendarDate f111875u;

    /* renamed from: v */
    private boolean f111876v;

    /* renamed from: w */
    private TimeZone f111877w;

    /* renamed from: x */
    private final Context f111878x;

    /* renamed from: y */
    private HashMap f111879y;

    public TimeContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public TimeContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo156808a(int i) {
        if (this.f111879y == null) {
            this.f111879y = new HashMap();
        }
        View view = (View) this.f111879y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f111879y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/TimeContainer$Companion;", "", "()V", "DIVIDE_WIDTH", "", "PADDING_LEFT", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.TimeContainer$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g */
    public final void mo156816g() {
        this.f111870p = true;
        invalidate();
    }

    /* renamed from: h */
    public final void mo156817h() {
        this.f111870p = false;
        invalidate();
    }

    /* renamed from: c */
    public final void mo156812c() {
        ITimeChosenListener mVar = this.f111871q;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeChosenListener");
        }
        mVar.mo156911a();
    }

    /* renamed from: d */
    public final void mo156813d() {
        ITimeChosenListener mVar = this.f111871q;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeChosenListener");
        }
        mVar.mo156912b();
    }

    /* renamed from: l */
    private final void m174561l() {
        LayoutInflater.from(this.f111878x).inflate(R.layout.mail_view_choose_time_container, this);
        setOnTouchListener(new C44073b(this));
    }

    /* renamed from: k */
    private final void m174560k() {
        this.f111862h.setColor(this.f111878x.getResources().getColor(R.color.primary_pri_500));
        this.f111863i.setColor(this.f111878x.getResources().getColor(R.color.function_danger_600));
        this.f111857b = UIUtils.dp2px(this.f111878x, 12.0f);
        this.f111867m = UIUtils.dp2px(this.f111878x, 48.0f);
        String[] stringArray = this.f111878x.getResources().getStringArray(R.array.mail_weeks);
        Intrinsics.checkExpressionValueIsNotNull(stringArray, "mContext.resources.getSt…Array(R.array.mail_weeks)");
        this.f111872r = stringArray;
        String[] stringArray2 = this.f111878x.getResources().getStringArray(R.array.mail_MonthNumAbbr);
        Intrinsics.checkExpressionValueIsNotNull(stringArray2, "mContext.resources.getSt….array.mail_MonthNumAbbr)");
        this.f111873s = stringArray2;
        this.f111862h.setAntiAlias(true);
        this.f111863i.setAntiAlias(true);
    }

    /* renamed from: i */
    public final void mo156818i() {
        ((TextView) mo156808a(R.id.tvEventEndTimeMain)).setTextColor(this.f111878x.getResources().getColor(R.color.function_danger_500));
        ((TextView) mo156808a(R.id.tvEventEndTimeMinor)).setTextColor(this.f111878x.getResources().getColor(R.color.function_danger_500));
        ((TextView) mo156808a(R.id.tvEventEndTimeExtra)).setTextColor(this.f111878x.getResources().getColor(R.color.function_danger_500));
    }

    /* renamed from: j */
    public final void mo156819j() {
        ((TextView) mo156808a(R.id.tvEventEndTimeMain)).setTextColor(this.f111878x.getResources().getColor(R.color.text_title));
        ((TextView) mo156808a(R.id.tvEventEndTimeMinor)).setTextColor(this.f111878x.getResources().getColor(R.color.text_placeholder));
        ((TextView) mo156808a(R.id.tvEventEndTimeExtra)).setTextColor(this.f111878x.getResources().getColor(R.color.text_placeholder));
    }

    /* renamed from: a */
    public final void mo156809a() {
        String str;
        String str2;
        String a = C43760c.m173466a(this.f111875u.getTimeInMilliSeconds(), this.f111877w, false);
        boolean z = true;
        if (this.f111876v) {
            str = C43760c.m173468a(this.f111875u, TimeZone.getDefault(), true);
        } else {
            if (this.f111874t.getYear() >= this.f111875u.getYear()) {
                z = false;
            }
            str = C43760c.m173468a(this.f111875u, this.f111877w, z);
        }
        if (this.f111876v) {
            str2 = C43760c.m173465a(this.f111875u.getTimeInMilliSeconds(), TimeZone.getDefault());
        } else {
            str2 = C43760c.m173465a(this.f111875u.getTimeInMilliSeconds(), this.f111877w);
        }
        if (this.f111876v) {
            TextView textView = (TextView) mo156808a(R.id.tvEventEndTimeMain);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvEventEndTimeMain");
            textView.setText(str);
            TextView textView2 = (TextView) mo156808a(R.id.tvEventEndTimeMinor);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tvEventEndTimeMinor");
            textView2.setText(str2);
            TextView textView3 = (TextView) mo156808a(R.id.tvEventEndTimeExtra);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "tvEventEndTimeExtra");
            textView3.setVisibility(8);
            return;
        }
        TextView textView4 = (TextView) mo156808a(R.id.tvEventEndTimeMain);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "tvEventEndTimeMain");
        textView4.setText(a);
        TextView textView5 = (TextView) mo156808a(R.id.tvEventEndTimeMinor);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "tvEventEndTimeMinor");
        textView5.setText(str);
        TextView textView6 = (TextView) mo156808a(R.id.tvEventEndTimeExtra);
        Intrinsics.checkExpressionValueIsNotNull(textView6, "tvEventEndTimeExtra");
        textView6.setText(str2);
        TextView textView7 = (TextView) mo156808a(R.id.tvEventEndTimeExtra);
        Intrinsics.checkExpressionValueIsNotNull(textView7, "tvEventEndTimeExtra");
        textView7.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo156811b() {
        String str;
        String str2;
        String a = C43760c.m173466a(this.f111874t.getTimeInMilliSeconds(), this.f111877w, false);
        boolean z = true;
        if (this.f111876v) {
            str = C43760c.m173468a(this.f111874t, TimeZone.getDefault(), true);
            Intrinsics.checkExpressionValueIsNotNull(str, "CalendarDateTimeShowUtil…eZone.getDefault(), true)");
        } else {
            if (this.f111874t.getYear() >= this.f111875u.getYear()) {
                z = false;
            }
            str = C43760c.m173468a(this.f111874t, this.f111877w, z);
            Intrinsics.checkExpressionValueIsNotNull(str, "CalendarDateTimeShowUtil…rentTimeZone, isShowYear)");
        }
        if (this.f111876v) {
            str2 = C43760c.m173465a(this.f111874t.getTimeInMilliSeconds(), TimeZone.getDefault());
        } else {
            str2 = C43760c.m173465a(this.f111874t.getTimeInMilliSeconds(), this.f111877w);
        }
        if (this.f111876v) {
            TextView textView = (TextView) mo156808a(R.id.tvEventStartTimeMain);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvEventStartTimeMain");
            textView.setText(str);
            TextView textView2 = (TextView) mo156808a(R.id.tvEventStartTimeMinor);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tvEventStartTimeMinor");
            textView2.setText(str2);
            TextView textView3 = (TextView) mo156808a(R.id.tvEventStartTimeExtra);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "tvEventStartTimeExtra");
            textView3.setVisibility(8);
            return;
        }
        TextView textView4 = (TextView) mo156808a(R.id.tvEventStartTimeMain);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "tvEventStartTimeMain");
        textView4.setText(a);
        TextView textView5 = (TextView) mo156808a(R.id.tvEventStartTimeMinor);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "tvEventStartTimeMinor");
        textView5.setText(str);
        TextView textView6 = (TextView) mo156808a(R.id.tvEventStartTimeExtra);
        Intrinsics.checkExpressionValueIsNotNull(textView6, "tvEventStartTimeExtra");
        textView6.setText(str2);
        TextView textView7 = (TextView) mo156808a(R.id.tvEventStartTimeExtra);
        Intrinsics.checkExpressionValueIsNotNull(textView7, "tvEventStartTimeExtra");
        textView7.setVisibility(0);
    }

    /* renamed from: e */
    public final void mo156814e() {
        this.f111868n = true;
        this.f111869o = false;
        this.f111870p = false;
        invalidate();
        ((TextView) mo156808a(R.id.tvEventStartTimeMain)).setTextColor(this.f111878x.getResources().getColor(R.color.static_white));
        ((TextView) mo156808a(R.id.tvEventStartTimeMinor)).setTextColor(this.f111878x.getResources().getColor(R.color.static_white));
        ((TextView) mo156808a(R.id.tvEventStartTimeExtra)).setTextColor(this.f111878x.getResources().getColor(R.color.static_white));
        ((TextView) mo156808a(R.id.tvEventEndTimeMain)).setTextColor(this.f111878x.getResources().getColor(R.color.text_title));
        ((TextView) mo156808a(R.id.tvEventEndTimeMinor)).setTextColor(this.f111878x.getResources().getColor(R.color.text_placeholder));
        ((TextView) mo156808a(R.id.tvEventEndTimeExtra)).setTextColor(this.f111878x.getResources().getColor(R.color.text_placeholder));
    }

    /* renamed from: f */
    public final void mo156815f() {
        this.f111869o = true;
        this.f111868n = false;
        this.f111870p = false;
        invalidate();
        ((TextView) mo156808a(R.id.tvEventStartTimeMain)).setTextColor(this.f111878x.getResources().getColor(R.color.text_title));
        ((TextView) mo156808a(R.id.tvEventStartTimeMinor)).setTextColor(this.f111878x.getResources().getColor(R.color.text_placeholder));
        ((TextView) mo156808a(R.id.tvEventStartTimeExtra)).setTextColor(this.f111878x.getResources().getColor(R.color.text_placeholder));
        ((TextView) mo156808a(R.id.tvEventEndTimeMain)).setTextColor(this.f111878x.getResources().getColor(R.color.static_white));
        ((TextView) mo156808a(R.id.tvEventEndTimeMinor)).setTextColor(this.f111878x.getResources().getColor(R.color.static_white));
        ((TextView) mo156808a(R.id.tvEventEndTimeExtra)).setTextColor(this.f111878x.getResources().getColor(R.color.static_white));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014¨\u0006\t"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/TimeContainer$initView$1", "Lcom/ss/android/lark/mail/impl/widget/time/OnClickWithCoordinateListener;", "onClick", "", "view", "Landroid/view/View;", "upX", "", "upY", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.TimeContainer$b */
    public static final class C44073b extends AbstractView$OnTouchListenerC44133o {

        /* renamed from: a */
        final /* synthetic */ TimeContainer f111880a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44073b(TimeContainer timeContainer) {
            this.f111880a = timeContainer;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.mail.impl.widget.time.AbstractView$OnTouchListenerC44133o
        /* renamed from: a */
        public void mo156802a(View view, float f, float f2) {
            boolean z;
            boolean z2;
            Intrinsics.checkParameterIsNotNull(view, "view");
            if (this.f111880a.f111861f) {
                double d = (((double) ((float) this.f111880a.f111856a)) / 2.0d) / ((double) ((float) this.f111880a.f111857b));
                boolean z3 = true;
                if (((double) (f2 / (f - this.f111880a.f111858c))) > d) {
                    z = true;
                } else {
                    z = false;
                }
                if ((((double) f2) - (((double) ((float) this.f111880a.f111856a)) / 2.0d)) / ((double) (this.f111880a.f111859d - f)) < d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (f <= this.f111880a.f111860e || f >= this.f111880a.f111859d) {
                    z3 = false;
                }
                if (f <= this.f111880a.f111860e || (z3 && z && z2)) {
                    this.f111880a.mo156813d();
                } else {
                    this.f111880a.mo156812c();
                }
            }
        }
    }

    public final void setOnTimeChosenListener(ITimeChosenListener mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "listener");
        this.f111871q = mVar;
    }

    public final void setIsAllDay(boolean z) {
        this.f111876v = z;
        mo156811b();
        mo156809a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        if (this.f111868n) {
            canvas.drawPath(this.f111864j, this.f111862h);
        } else if (this.f111869o) {
            if (this.f111870p) {
                canvas.drawPath(this.f111865k, this.f111863i);
            } else {
                canvas.drawPath(this.f111865k, this.f111862h);
            }
        }
        canvas.restore();
    }

    public final void setTimeTypeface(Typeface typeface) {
        Intrinsics.checkParameterIsNotNull(typeface, "typeface");
        TextView textView = (TextView) mo156808a(R.id.tvEventStartTimeMain);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvEventStartTimeMain");
        textView.setTypeface(typeface);
        TextView textView2 = (TextView) mo156808a(R.id.tvEventEndTimeMain);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvEventEndTimeMain");
        textView2.setTypeface(typeface);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f111878x = context;
        this.f111862h = new Paint();
        this.f111863i = new Paint();
        this.f111864j = new Path();
        this.f111865k = new Path();
        this.f111874t = new CalendarDate();
        this.f111875u = new CalendarDate();
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        this.f111877w = timeZone;
        this.f111861f = true;
        m174560k();
        m174561l();
    }

    /* renamed from: a */
    public final void mo156810a(boolean z, CalendarDate calendarDate, CalendarDate calendarDate2, TimeZone timeZone) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "startCalendar");
        Intrinsics.checkParameterIsNotNull(calendarDate2, "endCalendar");
        Intrinsics.checkParameterIsNotNull(timeZone, "timeZone");
        this.f111876v = z;
        this.f111874t = calendarDate;
        this.f111875u = calendarDate2;
        this.f111877w = timeZone;
        mo156811b();
        mo156809a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f111866l = i;
        this.f111856a = i2;
        float f = (float) ((i - this.f111857b) / 2);
        this.f111858c = f;
        this.f111859d = f + ((float) UIUtils.dp2px(this.f111878x, 12.0f));
        this.f111860e = this.f111858c;
        Path path = new Path();
        this.f111864j = path;
        path.lineTo(this.f111858c, BitmapDescriptorFactory.HUE_RED);
        this.f111864j.lineTo(this.f111859d, (float) (this.f111856a / 2));
        this.f111864j.lineTo(this.f111860e, (float) this.f111856a);
        this.f111864j.lineTo(BitmapDescriptorFactory.HUE_RED, (float) this.f111856a);
        this.f111864j.close();
        Path path2 = new Path();
        this.f111865k = path2;
        path2.moveTo(this.f111858c, BitmapDescriptorFactory.HUE_RED);
        this.f111865k.lineTo(this.f111859d, (float) (this.f111856a / 2));
        this.f111865k.lineTo(this.f111860e, (float) this.f111856a);
        this.f111865k.lineTo((float) this.f111866l, (float) this.f111856a);
        this.f111865k.lineTo((float) this.f111866l, BitmapDescriptorFactory.HUE_RED);
        this.f111865k.close();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TimeContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
