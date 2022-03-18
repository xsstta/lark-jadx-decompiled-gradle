package com.ss.android.lark.calendar.impl.features.calendarview.room.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.OneInstance;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 82\u00020\u0001:\u00018B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010.\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010/\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0012\u00100\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0018\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007H\u0014J\u001c\u00104\u001a\u00020*2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b062\u0006\u00107\u001a\u00020\u0007R\u0014\u0010\t\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R+\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010!\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\f¨\u00069"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/widget/TimeBarView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "eightHourOffSet", "", "getEightHourOffSet", "()F", "mBarHeight", "mBarHourPaint", "Landroid/graphics/Paint;", "mCurrentDay", "mDataDay", "mHourGapPaint", "mHourGapWidth", "mRedLinePaint", "mRedLinePath", "Landroid/graphics/Path;", "mRefreshTask", "Ljava/lang/Runnable;", "mTimeRangeData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneInstance;", "Lkotlin/collections/ArrayList;", "getMTimeRangeData", "()Ljava/util/ArrayList;", "mTimeRangeData$delegate", "Lkotlin/Lazy;", "mTimeRangePaint", "mTimeTextPaint", "mTimeTextSize", "mTimeTextTopMargin", "mViewHeight", "mViewWidth", "perMinuteWidth", "getPerMinuteWidth", "drawBarRect", "", "canvas", "Landroid/graphics/Canvas;", "drawBusyRanges", "drawRedLine", "drawTimeText", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "refreshRanges", "ranges", "", "dataDay", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TimeBarView extends View {

    /* renamed from: a */
    public static final Companion f78336a = new Companion(null);

    /* renamed from: r */
    private static final List<String> f78337r = CollectionsKt.listOf((Object[]) new String[]{"10", "12", "14", "16", "18", "20", "22"});

    /* renamed from: b */
    private final float f78338b;

    /* renamed from: c */
    private final int f78339c;

    /* renamed from: d */
    private final float f78340d;

    /* renamed from: e */
    private float f78341e;

    /* renamed from: f */
    private float f78342f;

    /* renamed from: g */
    private float f78343g;

    /* renamed from: h */
    private final Paint f78344h;

    /* renamed from: i */
    private final Paint f78345i;

    /* renamed from: j */
    private final Paint f78346j;

    /* renamed from: k */
    private final Paint f78347k;

    /* renamed from: l */
    private final Paint f78348l;

    /* renamed from: m */
    private final Path f78349m;

    /* renamed from: n */
    private final Lazy f78350n;

    /* renamed from: o */
    private int f78351o;

    /* renamed from: p */
    private int f78352p;

    /* renamed from: q */
    private final Runnable f78353q;

    public TimeBarView(Context context) {
        this(context, null, 0, 6, null);
    }

    public TimeBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final ArrayList<OneInstance> getMTimeRangeData() {
        return (ArrayList) this.f78350n.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/widget/TimeBarView$Companion;", "", "()V", "MINUTES_EIGHT_HOUR", "", "MINUTES_ONE_DAY", "MINUTES_TWO_HOUR", "TIME_TEXT", "", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.widget.TimeBarView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/room/widget/TimeBarView$mRefreshTask$1", "Ljava/lang/Runnable;", "run", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.widget.TimeBarView$b */
    public static final class RunnableC31066b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TimeBarView f78354a;

        public void run() {
            this.f78354a.invalidate();
            UICallbackExecutor.executeDelayed(this, 300000);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC31066b(TimeBarView timeBarView) {
            this.f78354a = timeBarView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneInstance;", "Lkotlin/collections/ArrayList;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.widget.TimeBarView$c */
    static final class C31067c extends Lambda implements Function0<ArrayList<OneInstance>> {
        public static final C31067c INSTANCE = new C31067c();

        C31067c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<OneInstance> invoke() {
            return new ArrayList<>();
        }
    }

    private final float getEightHourOffSet() {
        if (this.f78341e == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return (((float) 480) * getPerMinuteWidth()) + (((float) 4) * this.f78340d);
    }

    private final float getPerMinuteWidth() {
        float f = this.f78341e;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return (f - (((float) f78337r.size()) * this.f78340d)) / ((float) 960);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            m115895a(canvas);
            m115896b(canvas);
            m115897c(canvas);
            m115898d(canvas);
        }
    }

    /* renamed from: a */
    private final void m115895a(Canvas canvas) {
        float f = this.f78341e;
        List<String> list = f78337r;
        float size = (f - (((float) list.size()) * this.f78340d)) / ((float) (list.size() + 1));
        int size2 = list.size();
        if (size2 >= 0) {
            int i = 0;
            while (true) {
                float f2 = ((float) 0) + (((float) i) * size) + (((float) (i - 1)) * this.f78340d);
                if (i != 0) {
                    canvas.drawRect(new RectF(f2, BitmapDescriptorFactory.HUE_RED, this.f78340d + f2, this.f78343g), this.f78344h);
                }
                float f3 = f2 + this.f78340d;
                canvas.drawRect(new RectF(f3, BitmapDescriptorFactory.HUE_RED, f3 + size, this.f78343g), this.f78345i);
                if (i != size2) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private final void m115896b(Canvas canvas) {
        float f = this.f78341e;
        List<String> list = f78337r;
        float size = f / ((float) (list.size() + 1));
        float f2 = this.f78343g + ((float) this.f78339c);
        Iterator<T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            canvas.drawText(it.next(), ((float) i) * size, Math.abs(this.f78346j.ascent() + this.f78346j.descent()) + f2, this.f78346j);
        }
    }

    /* renamed from: c */
    private final void m115897c(Canvas canvas) {
        for (T t : getMTimeRangeData()) {
            float a = (((float) t.mo112386a()) * getPerMinuteWidth()) + (((float) (t.mo112386a() / SmEvents.EVENT_NW)) * this.f78340d);
            float b = (((float) t.mo112387b()) * getPerMinuteWidth()) + (((float) (t.mo112387b() / SmEvents.EVENT_NW)) * this.f78340d);
            this.f78347k.setColor(t.mo112388c());
            canvas.drawRect(new RectF(a - getEightHourOffSet(), BitmapDescriptorFactory.HUE_RED, b - getEightHourOffSet(), this.f78343g), this.f78347k);
        }
    }

    /* renamed from: d */
    private final void m115898d(Canvas canvas) {
        if (this.f78352p == this.f78351o) {
            CalendarDate timeInMillis = new CalendarDate().setTimeInMillis(System.currentTimeMillis());
            Intrinsics.checkExpressionValueIsNotNull(timeInMillis, "CalendarDate().setTimeIn…stem.currentTimeMillis())");
            int dayMinutes = timeInMillis.getDayMinutes();
            float perMinuteWidth = ((((float) dayMinutes) * getPerMinuteWidth()) + (((float) (dayMinutes / SmEvents.EVENT_NW)) * this.f78340d)) - getEightHourOffSet();
            this.f78349m.reset();
            this.f78349m.moveTo(perMinuteWidth, BitmapDescriptorFactory.HUE_RED);
            this.f78349m.lineTo(perMinuteWidth, this.f78343g);
            canvas.drawPath(this.f78349m, this.f78348l);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f78341e = (float) View.MeasureSpec.getSize(i);
        float size = (float) View.MeasureSpec.getSize(i2);
        this.f78342f = size;
        this.f78343g = (size - this.f78338b) - ((float) this.f78339c);
    }

    /* renamed from: a */
    public final void mo112452a(List<OneInstance> list, int i) {
        Intrinsics.checkParameterIsNotNull(list, "ranges");
        getMTimeRangeData().clear();
        getMTimeRangeData().addAll(list);
        this.f78351o = i;
        this.f78352p = new CalendarDate().getJulianDay();
        invalidate();
        UICallbackExecutor.removeCallbacks(this.f78353q);
        UICallbackExecutor.post(this.f78353q);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        float dp2px = (float) UIHelper.dp2px(12.0f);
        this.f78338b = dp2px;
        this.f78339c = UIHelper.dp2px(4.0f);
        float dp2px2 = (float) UIHelper.dp2px(1.0f);
        this.f78340d = dp2px2;
        Paint paint = new Paint();
        this.f78344h = paint;
        Paint paint2 = new Paint();
        this.f78345i = paint2;
        Paint paint3 = new Paint();
        this.f78346j = paint3;
        Paint paint4 = new Paint();
        this.f78347k = paint4;
        Paint paint5 = new Paint();
        this.f78348l = paint5;
        this.f78349m = new Path();
        this.f78350n = LazyKt.lazy(C31067c.INSTANCE);
        this.f78351o = new CalendarDate().getJulianDay();
        this.f78352p = new CalendarDate().getJulianDay();
        this.f78353q = new RunnableC31066b(this);
        setWillNotDraw(false);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(UIHelper.getColor(R.color.ud_N00));
        paint.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(UIHelper.getColor(R.color.ud_N100));
        paint2.setAntiAlias(true);
        paint3.setColor(C32634ae.m125178a(R.color.ud_N500));
        paint3.setTextSize(dp2px);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setAntiAlias(true);
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(C32634ae.m125178a(R.color.ud_N200));
        paint4.setAntiAlias(true);
        paint5.reset();
        paint5.setAntiAlias(true);
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeWidth(dp2px2);
        paint5.setColor(C32634ae.m125178a(R.color.ud_R500));
        paint5.setPathEffect(new DashPathEffect(new float[]{5.0f, 5.0f, 5.0f, 5.0f}, 2.0f));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TimeBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
