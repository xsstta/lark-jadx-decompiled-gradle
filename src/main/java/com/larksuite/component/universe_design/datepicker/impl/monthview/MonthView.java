package com.larksuite.component.universe_design.datepicker.impl.monthview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.larksuite.component.universe_design.datepicker.impl.data.BaseDay;
import com.larksuite.component.universe_design.datepicker.impl.data.CalendarAttr;
import com.larksuite.component.universe_design.datepicker.impl.data.MonthShowMode;
import com.larksuite.component.universe_design.datepicker.impl.data.Week;
import com.larksuite.component.universe_design.datepicker.impl.listener.IDayRender;
import com.larksuite.component.universe_design.datepicker.impl.listener.OnMonthDayViewSelectListener;
import com.larksuite.component.universe_design.util.CalendarDate;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 O2\u00020\u0001:\u0001OB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020 H\u0002J\b\u00104\u001a\u00020 H\u0002J\u0006\u00105\u001a\u00020#J\u0006\u00106\u001a\u00020#J\u0010\u00107\u001a\u0002002\u0006\u00101\u001a\u000202H\u0014J\u0018\u00108\u001a\u0002002\u0006\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020#H\u0002J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0016J\u0006\u0010?\u001a\u000200J\u000e\u0010@\u001a\u0002002\u0006\u0010A\u001a\u00020\u0006J\u000e\u0010B\u001a\u0002002\u0006\u0010C\u001a\u00020\u0012J\u000e\u0010D\u001a\u0002002\u0006\u0010E\u001a\u00020\u001aJ\u000e\u0010F\u001a\u0002002\u0006\u0010G\u001a\u00020 J\u000e\u0010H\u001a\u0002002\u0006\u0010I\u001a\u00020\u0018J\u000e\u0010J\u001a\u0002002\u0006\u0010A\u001a\u00020\u0006J\u000e\u0010K\u001a\u0002002\u0006\u0010A\u001a\u00020\u0006J\u000e\u0010L\u001a\u0002002\u0006\u0010M\u001a\u00020NR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\b\"\u0004\b&\u0010\nR\u001a\u0010'\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\nR\u000e\u0010*\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,X\u000e¢\u0006\u0004\n\u0002\u0010.¨\u0006P"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/monthview/MonthView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mCurrentDate", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "getMCurrentDate", "()Lcom/larksuite/component/universe_design/util/CalendarDate;", "setMCurrentDate", "(Lcom/larksuite/component/universe_design/util/CalendarDate;)V", "mDayRender", "Lcom/larksuite/component/universe_design/datepicker/impl/listener/IDayRender;", "getMDayRender", "()Lcom/larksuite/component/universe_design/datepicker/impl/listener/IDayRender;", "setMDayRender", "(Lcom/larksuite/component/universe_design/datepicker/impl/listener/IDayRender;)V", "mFirstWeekDay", "Lcom/larksuite/component/universe_design/util/CalendarDate$DayOfWeek;", "getMFirstWeekDay", "()Lcom/larksuite/component/universe_design/util/CalendarDate$DayOfWeek;", "setMFirstWeekDay", "(Lcom/larksuite/component/universe_design/util/CalendarDate$DayOfWeek;)V", "mMonthDayViewSelectListener", "Lcom/larksuite/component/universe_design/datepicker/impl/listener/OnMonthDayViewSelectListener;", "mMonthShowMode", "Lcom/larksuite/component/universe_design/datepicker/impl/data/MonthShowMode;", "getMMonthShowMode", "()Lcom/larksuite/component/universe_design/datepicker/impl/data/MonthShowMode;", "setMMonthShowMode", "(Lcom/larksuite/component/universe_design/datepicker/impl/data/MonthShowMode;)V", "mPosX", "", "mPosY", "mRowNum", "", "mSeedDate", "getMSeedDate", "setMSeedDate", "mSelectDate", "getMSelectDate", "setMSelectDate", "mTouchSlop", "mWeeks", "", "Lcom/larksuite/component/universe_design/datepicker/impl/data/Week;", "[Lcom/larksuite/component/universe_design/datepicker/impl/data/Week;", "drawMonthDate", "", "canvas", "Landroid/graphics/Canvas;", "getCellHeight", "getCellWidth", "getCurrentHeight", "getRowNum", "onDraw", "onSelectDateChanged", "col", "row", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "refreshView", "setCurrentDate", "date", "setFirstWeekDay", "firstWeekDay", "setMonthShowMode", "monthShowMode", "setMonthTextSize", "textSize", "setOnMonthDayViewSelectListener", "monthDayViewSelectListener", "setSeedDate", "setSelectDate", "setTypeFace", "typeFace", "Landroid/graphics/Typeface;", "Companion", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.datepicker.impl.b.c */
public class MonthView extends View {

    /* renamed from: a */
    public static final Companion f63211a = new Companion(null);

    /* renamed from: b */
    private CalendarDate f63212b = new CalendarDate();

    /* renamed from: c */
    private CalendarDate.DayOfWeek f63213c = CalendarDate.DayOfWeek.SUNDAY;

    /* renamed from: d */
    private CalendarDate f63214d = new CalendarDate();

    /* renamed from: e */
    private CalendarDate f63215e = new CalendarDate();

    /* renamed from: f */
    private MonthShowMode f63216f = MonthShowMode.AUTO_HEIGHT;

    /* renamed from: g */
    private Week[] f63217g = new Week[6];

    /* renamed from: h */
    private int f63218h;

    /* renamed from: i */
    private float f63219i;

    /* renamed from: j */
    private float f63220j;

    /* renamed from: k */
    private OnMonthDayViewSelectListener f63221k;

    /* renamed from: l */
    private int f63222l;

    /* renamed from: m */
    private IDayRender f63223m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/monthview/MonthView$Companion;", "", "()V", "DEFAULT_ITEM_HEIGHT", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.datepicker.impl.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final CalendarDate getMCurrentDate() {
        return this.f63214d;
    }

    public final IDayRender getMDayRender() {
        return this.f63223m;
    }

    public final CalendarDate.DayOfWeek getMFirstWeekDay() {
        return this.f63213c;
    }

    public final MonthShowMode getMMonthShowMode() {
        return this.f63216f;
    }

    public final CalendarDate getMSeedDate() {
        return this.f63212b;
    }

    public final CalendarDate getMSelectDate() {
        return this.f63215e;
    }

    public final int getRowNum() {
        return this.f63218h;
    }

    private final float getCellHeight() {
        return (float) this.f63223m.mo90473a();
    }

    private final float getCellWidth() {
        return ((float) getMeasuredWidth()) / ((float) 7);
    }

    /* renamed from: a */
    public final void mo90478a() {
        this.f63218h = MonthRenderDataProvider.f63210a.mo90477a(this.f63217g, this.f63212b, this.f63214d, this.f63215e, this.f63213c, this.f63216f);
        invalidate();
    }

    public final int getCurrentHeight() {
        if (this.f63216f == MonthShowMode.FIXED_SIX_ROW) {
            return this.f63223m.mo90473a() * 6;
        }
        return this.f63218h * this.f63223m.mo90473a();
    }

    public final void setCurrentDate(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "date");
        this.f63214d = calendarDate;
    }

    public final void setFirstWeekDay(CalendarDate.DayOfWeek dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "firstWeekDay");
        this.f63213c = dayOfWeek;
    }

    public final void setMCurrentDate(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "<set-?>");
        this.f63214d = calendarDate;
    }

    public final void setMDayRender(IDayRender aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        this.f63223m = aVar;
    }

    public final void setMFirstWeekDay(CalendarDate.DayOfWeek dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "<set-?>");
        this.f63213c = dayOfWeek;
    }

    public final void setMMonthShowMode(MonthShowMode monthShowMode) {
        Intrinsics.checkParameterIsNotNull(monthShowMode, "<set-?>");
        this.f63216f = monthShowMode;
    }

    public final void setMSeedDate(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "<set-?>");
        this.f63212b = calendarDate;
    }

    public final void setMSelectDate(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "<set-?>");
        this.f63215e = calendarDate;
    }

    public final void setMonthShowMode(MonthShowMode monthShowMode) {
        Intrinsics.checkParameterIsNotNull(monthShowMode, "monthShowMode");
        this.f63216f = monthShowMode;
    }

    public final void setOnMonthDayViewSelectListener(OnMonthDayViewSelectListener eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "monthDayViewSelectListener");
        this.f63221k = eVar;
    }

    public final void setSeedDate(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "date");
        this.f63212b = calendarDate;
    }

    public final void setSelectDate(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "date");
        this.f63215e = calendarDate;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        m92663a(canvas);
    }

    public final void setMonthTextSize(float f) {
        this.f63223m.mo90474a(f);
        invalidate();
    }

    public final void setTypeFace(Typeface typeface) {
        Intrinsics.checkParameterIsNotNull(typeface, "typeFace");
        this.f63223m.mo90476a(typeface);
        invalidate();
    }

    /* renamed from: a */
    private final void m92663a(Canvas canvas) {
        for (int i = 0; i < this.f63218h; i++) {
            Week bVar = this.f63217g[i];
            if (bVar != null) {
                for (int i2 = 0; i2 < 7; i2++) {
                    BaseDay aVar = bVar.mo90522a()[i2];
                    if (aVar != null) {
                        this.f63223m.mo90475a(canvas, aVar);
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonthView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Intrinsics.checkExpressionValueIsNotNull(viewConfiguration, "ViewConfiguration.get(context)");
        this.f63222l = viewConfiguration.getScaledTouchSlop();
        this.f63223m = new MonthDayRender(context, (int) UDDimenUtils.m93307a(context, 42.0f));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f63219i = motionEvent.getX();
            this.f63220j = motionEvent.getY();
        } else if (action == 1) {
            float x = motionEvent.getX() - this.f63219i;
            float y = motionEvent.getY() - this.f63220j;
            if (Math.abs(x) < ((float) this.f63222l) && Math.abs(y) < ((float) this.f63222l)) {
                m92662a((int) (this.f63219i / getCellWidth()), (int) (this.f63220j / getCellHeight()));
            }
        }
        return true;
    }

    /* renamed from: a */
    private final void m92662a(int i, int i2) {
        Week bVar;
        BaseDay[] a;
        BaseDay aVar;
        if (i < 7 && i2 < this.f63218h && (bVar = this.f63217g[i2]) != null && (a = bVar.mo90522a()) != null && (aVar = a[i]) != null) {
            CalendarDate c = aVar.mo90517c();
            this.f63215e = c;
            OnMonthDayViewSelectListener eVar = this.f63221k;
            if (eVar != null) {
                eVar.mo90472a(c);
            }
            if (aVar.mo90518d().mo90508c() == CalendarAttr.MonthState.LAST_MONTH) {
                OnMonthDayViewSelectListener eVar2 = this.f63221k;
                if (eVar2 != null) {
                    eVar2.mo90471a(-1);
                }
            } else if (aVar.mo90518d().mo90508c() == CalendarAttr.MonthState.NEXT_MONTH) {
                OnMonthDayViewSelectListener eVar3 = this.f63221k;
                if (eVar3 != null) {
                    eVar3.mo90471a(1);
                }
            } else {
                OnMonthDayViewSelectListener eVar4 = this.f63221k;
                if (eVar4 != null) {
                    eVar4.mo90470a();
                }
            }
        }
    }
}
