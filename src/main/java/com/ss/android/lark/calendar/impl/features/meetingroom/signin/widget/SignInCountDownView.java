package com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.utils.UIHelper;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 (2\u00020\u0001:\u0002()B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\nJ\b\u0010\u001f\u001a\u00020\u001dH\u0002J\u0016\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001bJ \u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001bH\u0002J\u0006\u0010'\u001a\u00020\u001dR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/widget/SignInCountDownView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "countDownListener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/widget/SignInCountDownView$CountDownListener;", "countDownRightCornerThreshold", "", "getCountDownRightCornerThreshold", "()F", "countDownViewCorner", "getCountDownViewCorner", "countPastColor", "getCountPastColor", "()I", "setCountPastColor", "(I)V", "mCountDownTimer", "Landroid/os/CountDownTimer;", "getDisplayTime", "", "time", "", "setCountDownListener", "", "listener", "setPastViewBackground", "start", "countDownSecond", "totalSecond", "startInternal", "millisInFuture", "countDownInterval", "totalMilliSeconds", "stop", "Companion", "CountDownListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SignInCountDownView extends RelativeLayout {

    /* renamed from: b */
    public static final Companion f82252b = new Companion(null);

    /* renamed from: a */
    public CountDownListener f82253a;

    /* renamed from: c */
    private int f82254c;

    /* renamed from: d */
    private final float f82255d;

    /* renamed from: e */
    private final float f82256e;

    /* renamed from: f */
    private CountDownTimer f82257f;

    /* renamed from: g */
    private HashMap f82258g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/widget/SignInCountDownView$CountDownListener;", "", "onFinished", "", "updateTimeStamp", "timeStamp", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.SignInCountDownView$b */
    public interface CountDownListener {
        /* renamed from: a */
        void mo117480a();

        /* renamed from: a */
        void mo117481a(long j);
    }

    public SignInCountDownView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SignInCountDownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo117491a(int i) {
        if (this.f82258g == null) {
            this.f82258g = new HashMap();
        }
        View view = (View) this.f82258g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f82258g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/widget/SignInCountDownView$Companion;", "", "()V", "BACKGROUND_CORNER", "", "COUNT_DOWN_VIEW_RIGHT_CORNER_THRESHOLD_DP", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.SignInCountDownView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final float getCountDownRightCornerThreshold() {
        return this.f82256e;
    }

    public final float getCountDownViewCorner() {
        return this.f82255d;
    }

    public final int getCountPastColor() {
        return this.f82254c;
    }

    /* renamed from: b */
    public final void mo117495b() {
        CountDownTimer countDownTimer = this.f82257f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f82257f = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/signin/widget/SignInCountDownView$startInternal$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.SignInCountDownView$c */
    public static final class CountDownTimerC32175c extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ SignInCountDownView f82259a;

        /* renamed from: b */
        final /* synthetic */ long f82260b;

        /* renamed from: c */
        final /* synthetic */ long f82261c;

        /* renamed from: d */
        final /* synthetic */ long f82262d;

        public void onFinish() {
            TextView textView = (TextView) this.f82259a.mo117491a(R.id.releaseTipTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "releaseTipTv");
            textView.setText(this.f82259a.mo117492a(0L));
            View a = this.f82259a.mo117491a(R.id.signInCountPastView);
            Intrinsics.checkExpressionValueIsNotNull(a, "signInCountPastView");
            a.setVisibility(8);
            CountDownListener bVar = this.f82259a.f82253a;
            if (bVar != null) {
                bVar.mo117480a();
            }
        }

        public void onTick(long j) {
            View a = this.f82259a.mo117491a(R.id.signInCountPastView);
            Intrinsics.checkExpressionValueIsNotNull(a, "signInCountPastView");
            a.setVisibility(0);
            long j2 = this.f82260b;
            int width = (int) (((float) this.f82259a.getWidth()) * (((float) (j2 - j)) / ((float) j2)));
            View a2 = this.f82259a.mo117491a(R.id.signInCountPastView);
            Intrinsics.checkExpressionValueIsNotNull(a2, "signInCountPastView");
            ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = width;
            }
            this.f82259a.mo117493a();
            TextView textView = (TextView) this.f82259a.mo117491a(R.id.releaseTipTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "releaseTipTv");
            textView.setText(this.f82259a.mo117492a(j));
            this.f82259a.requestLayout();
            CountDownListener bVar = this.f82259a.f82253a;
            if (bVar != null) {
                bVar.mo117481a(j / ((long) 60));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        CountDownTimerC32175c(SignInCountDownView signInCountDownView, long j, long j2, long j3, long j4, long j5) {
            super(j4, j5);
            this.f82259a = signInCountDownView;
            this.f82260b = j;
            this.f82261c = j2;
            this.f82262d = j3;
        }
    }

    /* renamed from: a */
    public final void mo117493a() {
        float f = this.f82255d;
        View a = mo117491a(R.id.signInCountPastView);
        Intrinsics.checkExpressionValueIsNotNull(a, "signInCountPastView");
        a.setBackground(ao.m125218a(this.f82254c, new float[]{0.0f, f, f, 0.0f}, 0, 0));
    }

    public final void setCountPastColor(int i) {
        this.f82254c = i;
    }

    public final void setCountDownListener(CountDownListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f82253a = bVar;
    }

    /* renamed from: a */
    public final String mo117492a(long j) {
        int a = C69029a.m265652a((((double) j) * 1.0d) / ((double) 1000));
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(a / 60), Integer.valueOf(a % 60)}, 2));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Calendar_MeetingRoom_ToBeReleased, "time", format);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…leased, \"time\", timeText)");
        return mustacheFormat;
    }

    /* renamed from: a */
    public final void mo117494a(long j, long j2) {
        mo117495b();
        long j3 = (long) 1000;
        m122617a(j * j3, 1000, j2 * j3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignInCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f82254c = C25653b.m91893a(C32634ae.m125178a(R.color.static_black), 0.1f);
        this.f82255d = (float) UIHelper.dp2px(8.0f);
        this.f82256e = (float) UIHelper.dp2px(3.0f);
        LayoutInflater.from(context).inflate(R.layout.meeting_room_sign_in_time_layout, this);
    }

    /* renamed from: a */
    private final void m122617a(long j, long j2, long j3) {
        if (j <= j3) {
            if (j <= 0) {
                CountDownListener bVar = this.f82253a;
                if (bVar != null) {
                    bVar.mo117480a();
                    return;
                }
                return;
            }
            this.f82257f = new CountDownTimerC32175c(this, j3, j, j2, j, j2).start();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SignInCountDownView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
