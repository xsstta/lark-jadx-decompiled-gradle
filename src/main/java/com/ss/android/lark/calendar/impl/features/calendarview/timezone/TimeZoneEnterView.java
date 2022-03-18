package com.ss.android.lark.calendar.impl.features.calendarview.timezone;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.TimeZoneUtils;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 22\u00020\u0001:\u000223B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u001a\u001a\u00020\u0011J\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015J\b\u0010 \u001a\u00020\u001eH\u0014J\u0012\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001eH\u0002J\u0010\u0010%\u001a\u00020\u001e2\b\u0010&\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\fJ\b\u0010)\u001a\u00020\u001eH\u0002J\b\u0010*\u001a\u00020\u001eH\u0002J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\tH\u0016J\u000e\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u0011J\u0010\u0010/\u001a\u00020\u001e2\b\u00100\u001a\u0004\u0018\u000101R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mIsShowSelectedToast", "", "mNeedModifyForDesktop", "mSelectTimeZoneChangeListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ISelectTimeZoneChangeListener;", "mSelectedDateInMillis", "", "mShowTzRunnable", "Ljava/lang/Runnable;", "mSource", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView$Source;", "mTimeZone", "Ljava/util/TimeZone;", "mTimeZoneDialog", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneBaseDialog;", "getSelectedDateInMillis", "getTimeZoneTextView", "Landroid/view/View;", "initView", "", ShareHitPoint.f121868c, "onDetachedFromWindow", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "openTimezoneDialog", "setSelectTimeZoneChangeListener", "selectTimeZonChangeListener", "setShowSelectedToast", "isShow", "setTimeZone", "setTimeZoneText", "setVisibility", "visibility", "updateOffsetByDate", "timeInMillis", "updateTimeZone", "timeZoneId", "", "Companion", "Source", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TimeZoneEnterView extends LinearLayout {

    /* renamed from: b */
    public static final Companion f78355b = new Companion(null);

    /* renamed from: a */
    public TimeZone f78356a;

    /* renamed from: c */
    private Source f78357c;

    /* renamed from: d */
    private TimeZoneBaseDialog f78358d;

    /* renamed from: e */
    private ISelectTimeZoneChangeListener f78359e;

    /* renamed from: f */
    private Runnable f78360f;

    /* renamed from: g */
    private long f78361g;

    /* renamed from: h */
    private boolean f78362h;

    /* renamed from: i */
    private boolean f78363i;

    /* renamed from: j */
    private HashMap f78364j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView$Source;", "", "(Ljava/lang/String;I)V", "THREE_DAY", "ONE_DAY", "PROFILE_BUSY", "ARRANGE_BUSY", "EDIT_EVENT", "CHAT_BUSY", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Source {
        THREE_DAY,
        ONE_DAY,
        PROFILE_BUSY,
        ARRANGE_BUSY,
        EDIT_EVENT,
        CHAT_BUSY
    }

    /* renamed from: a */
    public View mo112456a(int i) {
        if (this.f78364j == null) {
            this.f78364j = new HashMap();
        }
        View view = (View) this.f78364j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f78364j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView$Companion;", "", "()V", "NEED_SPLIT_LEN", "", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneEnterView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final long getSelectedDateInMillis() {
        return this.f78361g;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f78360f;
        if (runnable != null) {
            UICallbackExecutor.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneEnterView$d */
    public static final class RunnableC31070d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TimeZoneEnterView f78367a;

        RunnableC31070d(TimeZoneEnterView timeZoneEnterView) {
            this.f78367a = timeZoneEnterView;
        }

        public final void run() {
            this.f78367a.mo112461b();
            this.f78367a.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneEnterView.RunnableC31070d.View$OnClickListenerC310711 */

                /* renamed from: a */
                final /* synthetic */ RunnableC31070d f78368a;

                {
                    this.f78368a = r1;
                }

                public final void onClick(View view) {
                    this.f78368a.f78367a.mo112462c();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo112457a() {
        Runnable runnable = this.f78360f;
        if (runnable != null) {
            UICallbackExecutor.removeCallbacks(runnable);
        }
        RunnableC31070d dVar = new RunnableC31070d(this);
        this.f78360f = dVar;
        UICallbackExecutor.post(dVar);
    }

    public final View getTimeZoneTextView() {
        TextView textView = (TextView) mo112456a(R.id.timeZoneTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "timeZoneTV");
        return textView;
    }

    /* renamed from: b */
    public final void mo112461b() {
        int i;
        float f;
        long j = this.f78361g;
        if (j == 0) {
            i = this.f78356a.getRawOffset();
        } else {
            i = this.f78356a.getOffset(j);
        }
        String a = TimeZoneUtils.m125207a(TimeZoneUtils.m125206a(TimeZoneUtils.m125205a(i / 1000)), 9);
        TextView textView = (TextView) mo112456a(R.id.timeZoneTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "timeZoneTV");
        textView.setText(a);
        TextView textView2 = (TextView) mo112456a(R.id.timeZoneTV);
        if (a.length() > 6) {
            f = 9.0f;
        } else {
            f = 11.0f;
        }
        textView2.setTextSize(1, f);
        requestLayout();
    }

    /* renamed from: c */
    public final void mo112462c() {
        TimeZoneBaseDialog cVar = this.f78358d;
        if (cVar != null) {
            cVar.dismiss();
        }
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Source source = this.f78357c;
        String id = this.f78356a.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "mTimeZone.id");
        TimeZoneSelectorDialog fVar = new TimeZoneSelectorDialog(context, R.style.CalendarTransparentDialog, source, id);
        this.f78358d = fVar;
        if (fVar != null) {
            fVar.mo112544a(this.f78362h);
        }
        TimeZoneBaseDialog cVar2 = this.f78358d;
        if (cVar2 != null) {
            cVar2.mo112543a(this.f78359e);
        }
        TimeZoneBaseDialog cVar3 = this.f78358d;
        if (cVar3 != null) {
            cVar3.mo112543a(new C31069c(this));
        }
        TimeZoneBaseDialog cVar4 = this.f78358d;
        if (cVar4 != null) {
            cVar4.show();
        }
    }

    public final void setSelectTimeZoneChangeListener(ISelectTimeZoneChangeListener aVar) {
        this.f78359e = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView$openTimezoneDialog$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ISelectTimeZoneChangeListener;", "onTimeZoneChanged", "", "timeZoneId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneEnterView$c */
    public static final class C31069c implements ISelectTimeZoneChangeListener {

        /* renamed from: a */
        final /* synthetic */ TimeZoneEnterView f78366a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31069c(TimeZoneEnterView timeZoneEnterView) {
            this.f78366a = timeZoneEnterView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ISelectTimeZoneChangeListener
        /* renamed from: a */
        public void mo108585a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
            if (!TextUtils.isEmpty(str)) {
                TimeZoneEnterView timeZoneEnterView = this.f78366a;
                TimeZone timeZone = TimeZone.getTimeZone(str);
                Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getTimeZone(timeZoneId)");
                timeZoneEnterView.f78356a = timeZone;
            }
            this.f78366a.mo112457a();
        }
    }

    /* renamed from: a */
    public final void mo112458a(long j) {
        this.f78361g = j;
        mo112461b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TimeZoneEnterView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setShowSelectedToast(boolean z) {
        this.f78362h = z;
        TimeZoneBaseDialog cVar = this.f78358d;
        if (cVar != null) {
            cVar.mo112544a(z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneEnterView$b */
    public static final class C31068b implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ TimeZoneEnterView f78365a;

        C31068b(TimeZoneEnterView timeZoneEnterView) {
            this.f78365a = timeZoneEnterView;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            TimeZoneEnterView timeZoneEnterView = this.f78365a;
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "it");
            TimeZone safeMobileNormalViewTimezone = calendarSetting.getSafeMobileNormalViewTimezone();
            Intrinsics.checkExpressionValueIsNotNull(safeMobileNormalViewTimezone, "it.safeMobileNormalViewTimezone");
            timeZoneEnterView.f78356a = safeMobileNormalViewTimezone;
            this.f78365a.mo112457a();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        TextView textView = (TextView) mo112456a(R.id.timeZoneTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "timeZoneTV");
        textView.setVisibility(i);
        ImageView imageView = (ImageView) mo112456a(R.id.switchIcon);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "switchIcon");
        imageView.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo112459a(Source source) {
        Intrinsics.checkParameterIsNotNull(source, ShareHitPoint.f121868c);
        this.f78357c = source;
        switch (C31080e.f78401a[source.ordinal()]) {
            case 1:
            case 2:
                this.f78363i = true;
                C30022a.f74884c.mo108450a(new C31068b(this));
                return;
            case 3:
            case 4:
            case 5:
                this.f78363i = false;
                mo112457a();
                return;
            case 6:
                this.f78363i = true;
                mo112457a();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo112460a(String str) {
        if (!TextUtils.isEmpty(str)) {
            TimeZone timeZone = TimeZone.getTimeZone(str);
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getTimeZone(timeZoneId)");
            this.f78356a = timeZone;
        }
        mo112457a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TimeZoneEnterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeZoneEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f78357c = Source.THREE_DAY;
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        this.f78356a = timeZone;
        this.f78362h = true;
    }
}
