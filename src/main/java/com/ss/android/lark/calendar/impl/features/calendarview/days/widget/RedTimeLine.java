package com.ss.android.lark.calendar.impl.features.calendarview.days.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.utils.UIHelper;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\b\u0010\u001c\u001a\u00020\u0018H\u0002J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\bH\u0002J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\bH\u0002J\b\u0010!\u001a\u00020\u0018H\u0002J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\bJ\u0010\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010&J\u000e\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/RedTimeLine;", "", "mTargetView", "Landroid/view/View;", "(Landroid/view/View;)V", "mCircleDrawable", "Landroid/graphics/drawable/Drawable;", "mCircleMarginTop", "", "mCircleSize", "mCurrentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "mDayWidth", "mHeightPerMinute", "", "mIsDraw", "", "mLastMinute", "mLineDrawable", "mLineHeight", "mRefreshTask", "Ljava/lang/Runnable;", "mTimeLineTopMargin", "destroy", "", "draw", "canvas", "Landroid/graphics/Canvas;", "forceInvalidate", "getHeightByMinute", "minute", "needUpdateTimeLine", "curMinute", "refreshRect", "setDayWidth", "dayWidth", "setTimeZone", "timeZoneId", "", "toggleDraw", "isDraw", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.widget.a */
public final class RedTimeLine {

    /* renamed from: b */
    public static final Companion f77406b = new Companion(null);

    /* renamed from: a */
    public final View f77407a;

    /* renamed from: c */
    private boolean f77408c;

    /* renamed from: d */
    private int f77409d;

    /* renamed from: e */
    private int f77410e;

    /* renamed from: f */
    private int f77411f;

    /* renamed from: g */
    private int f77412g;

    /* renamed from: h */
    private float f77413h;

    /* renamed from: i */
    private int f77414i;

    /* renamed from: j */
    private Drawable f77415j;

    /* renamed from: k */
    private Drawable f77416k;

    /* renamed from: l */
    private int f77417l = -99;

    /* renamed from: m */
    private CalendarDate f77418m;

    /* renamed from: n */
    private final Runnable f77419n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/RedTimeLine$Companion;", "", "()V", "INVALIDATE_LAST_TIME", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.widget.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo111380a() {
        UICallbackExecutor.removeCallbacks(this.f77419n);
    }

    /* renamed from: b */
    private final void m114856b() {
        if (this.f77408c) {
            this.f77417l = -99;
            this.f77407a.invalidate();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/widget/RedTimeLine$mRefreshTask$1", "Ljava/lang/Runnable;", "run", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.widget.a$b */
    public static final class RunnableC30790b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RedTimeLine f77420a;

        public void run() {
            this.f77420a.f77407a.invalidate();
            UICallbackExecutor.executeDelayed(this, 300000);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC30790b(RedTimeLine aVar) {
            this.f77420a = aVar;
        }
    }

    /* renamed from: c */
    private final void m114859c() {
        CalendarDate timeInMillis = this.f77418m.setTimeInMillis(System.currentTimeMillis());
        Intrinsics.checkExpressionValueIsNotNull(timeInMillis, "mCurrentDate.setTimeInMi…stem.currentTimeMillis())");
        int dayMinutes = timeInMillis.getDayMinutes();
        if (m114857b(dayMinutes)) {
            this.f77417l = dayMinutes;
            int c = (int) m114858c(dayMinutes);
            int i = c - this.f77412g;
            Drawable drawable = this.f77415j;
            int i2 = this.f77409d;
            drawable.setBounds(0, i, i2 + 0, i2 + i);
            this.f77416k.setBounds(0, c, this.f77414i + 0, this.f77410e + c);
        }
    }

    /* renamed from: a */
    public final void mo111381a(int i) {
        this.f77414i = i;
    }

    /* renamed from: c */
    private final float m114858c(int i) {
        return (((float) i) * this.f77413h) + ((float) this.f77411f);
    }

    /* renamed from: b */
    private final boolean m114857b(int i) {
        int i2 = this.f77417l;
        if (i - i2 >= 5 || i2 <= 0 || i < i2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo111382a(Canvas canvas) {
        if (canvas != null && this.f77408c) {
            m114859c();
            this.f77416k.draw(canvas);
            this.f77415j.draw(canvas);
        }
    }

    /* renamed from: a */
    public final void mo111383a(String str) {
        TimeZone timeZone;
        CalendarDate calendarDate;
        if (str != null) {
            TimeZone timeZone2 = this.f77418m.getTimeZone();
            Intrinsics.checkExpressionValueIsNotNull(timeZone2, "mCurrentDate.timeZone");
            if (!Intrinsics.areEqual(timeZone2.getID(), str)) {
                if (!TextUtils.isEmpty(str)) {
                    timeZone = TimeZone.getTimeZone(str);
                } else {
                    timeZone = TimeZone.getDefault();
                }
                if (timeZone == null) {
                    calendarDate = new CalendarDate();
                } else {
                    calendarDate = new CalendarDate(timeZone);
                }
                this.f77418m = calendarDate;
                m114856b();
            }
        }
    }

    /* renamed from: a */
    public final void mo111384a(boolean z) {
        if (z != this.f77408c) {
            this.f77408c = z;
            this.f77417l = -99;
            if (z) {
                UICallbackExecutor.removeCallbacks(this.f77419n);
                UICallbackExecutor.post(this.f77419n);
            } else {
                UICallbackExecutor.removeCallbacks(this.f77419n);
            }
            this.f77407a.invalidate();
        }
    }

    public RedTimeLine(View view) {
        Intrinsics.checkParameterIsNotNull(view, "mTargetView");
        this.f77407a = view;
        Drawable d = C32634ae.m125184d(R.drawable.current_time_line);
        if (d != null) {
            LayerDrawable layerDrawable = (LayerDrawable) d;
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.circle);
            Intrinsics.checkExpressionValueIsNotNull(findDrawableByLayerId, "layerDrawable.findDrawableByLayerId(R.id.circle)");
            this.f77415j = findDrawableByLayerId;
            Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.line);
            Intrinsics.checkExpressionValueIsNotNull(findDrawableByLayerId2, "layerDrawable.findDrawableByLayerId(R.id.line)");
            this.f77416k = findDrawableByLayerId2;
            this.f77409d = UIUtils.dp2px(view.getContext(), 7.0f);
            int dp2px = UIUtils.dp2px(view.getContext(), 1.0f);
            this.f77410e = dp2px;
            this.f77412g = (this.f77409d - dp2px) / 2;
            this.f77411f = UIUtils.dp2px(view.getContext(), 7.0f);
            this.f77413h = ((float) UIHelper.dp2px(50.0f)) / 60.0f;
            this.f77418m = new CalendarDate();
            this.f77419n = new RunnableC30790b(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
    }
}
