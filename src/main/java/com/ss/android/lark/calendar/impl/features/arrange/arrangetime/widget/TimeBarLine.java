package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.TimeLinesLayer;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.data.ChooseTimeLineData;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.model.WorkHourUnit;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSpan;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0010\u0018\u0000 92\u00020\u0001:\u00019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002J \u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002J\u000e\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001f2\u0006\u0010 \u001a\u00020\tH\u0002¢\u0006\u0002\u0010!J \u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u000bH\u0002J\u0006\u0010'\u001a\u00020\tJ\u0018\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0002J \u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020*2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002J\u0010\u0010.\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u000e\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\tJ\u000e\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u00020\tJ\u0016\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\tJ\u001e\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\tJ\u001e\u00107\u001a\u00020\u00132\u0016\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/TimeBarLine;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/TimeLinesLayer;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attendeeSize", "", "showTimeBar", "", "showTimeLine", "showWorkHour", "workHourLists", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/model/WorkHourUnit;", "Lkotlin/collections/ArrayList;", "drawChooseTime", "", "canvas", "Landroid/graphics/Canvas;", "chooseTimeLineData", "", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/data/ChooseTimeLineData;", "drawTimeLines", "drawWorkTimeShadow", "getChooseTimeLineData", "getDayMinutes", "selectedPos", "getHourAndUnit", "", "y", "(I)[Ljava/lang/Integer;", "getShowText", "", "hour", "timeUnitNum", "isNeedCurrentTime", "getViewHeight", "isHourTextOverlap", "curMinuteYOffset", "", "chooseTimeYOffset", "isOverlapTimeText", "hourTextBaseY", "onDraw", "refreshShadowToLeft", "targetIndex", "setAttendeeSize", "size", "setChoosePos", "startPos", "endPos", "timeUnit", "setWorkHourList", "workHourList", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TimeBarLine extends TimeLinesLayer {

    /* renamed from: z */
    public static final Companion f75536z = new Companion(null);

    /* renamed from: A */
    private boolean f75537A;

    /* renamed from: B */
    private boolean f75538B;

    /* renamed from: C */
    private boolean f75539C;

    /* renamed from: D */
    private ArrayList<WorkHourUnit> f75540D;

    /* renamed from: E */
    private int f75541E;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/TimeBarLine$Companion;", "", "()V", "TIME_UNIT_15", "", "TIME_UNIT_5", "WHOLE_DAY_MINUTE", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TimeBarLine$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getViewHeight() {
        return this.f75242h;
    }

    private final List<ChooseTimeLineData> getChooseTimeLineData() {
        if (this.f75256v < 0 || this.f75257w <= 0) {
            return null;
        }
        float f = (((float) this.f75237c) / 60.0f) * ((float) this.f75253s);
        int intValue = m112214c(this.f75256v)[0].intValue();
        int intValue2 = m112214c(this.f75256v)[1].intValue();
        float f2 = this.f75252r + ((float) (this.f75237c * intValue)) + (((float) intValue2) * f);
        int intValue3 = m112214c(this.f75257w)[0].intValue();
        int intValue4 = m112214c(this.f75257w)[1].intValue();
        float f3 = this.f75252r + ((float) (this.f75237c * intValue3)) + (((float) intValue4) * f);
        int b = this.f75258x.mo108776b(60) - this.f75258x.mo108776b(45);
        if (f3 - f2 < ((float) b)) {
            float f4 = (f3 + f2) / ((float) 2);
            float f5 = (float) (b / 2);
            f2 = f4 - f5;
            f3 = f4 + f5;
        }
        return CollectionsKt.mutableListOf(new ChooseTimeLineData(intValue, intValue2, f2), new ChooseTimeLineData(intValue3, intValue4, f3));
    }

    public final void setAttendeeSize(int i) {
        this.f75541E = i;
    }

    public final void setWorkHourList(ArrayList<WorkHourUnit> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "workHourList");
        this.f75540D = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TimeBarLine(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.TimeLinesLayer
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (this.f75539C) {
            m112209a(canvas);
        }
        List<ChooseTimeLineData> chooseTimeLineData = getChooseTimeLineData();
        m112210a(canvas, chooseTimeLineData);
        m112213b(canvas, chooseTimeLineData);
    }

    /* renamed from: c */
    private final Integer[] m112214c(int i) {
        int a = this.f75258x.mo108770a(i);
        int i2 = a / 3600;
        int i3 = ((a % 3600) / 60) / this.f75253s;
        if (this.f75253s * i3 >= 60) {
            i2++;
            i3 = 0;
        }
        return new Integer[]{Integer.valueOf(i2), Integer.valueOf(i3)};
    }

    /* renamed from: b */
    public final void mo109095b(int i) {
        if (!(CollectionUtils.isEmpty(this.f75540D) || this.f75541E == 0)) {
            for (T t : this.f75540D) {
                if (t.mo108990a() < i) {
                    t.mo108991a(t.mo108990a() + 1);
                } else if (t.mo108990a() == i) {
                    t.mo108991a(0);
                }
            }
            invalidate();
        }
    }

    /* renamed from: a */
    public final int mo109092a(int i) {
        int i2 = this.f75258x.mo108771a(BitmapDescriptorFactory.HUE_RED, (float) i).top;
        return (m112214c(i2)[0].intValue() * 60) + (m112214c(i2)[1].intValue() * this.f75253s);
    }

    /* renamed from: a */
    private final void m112209a(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        if (!(CollectionUtils.isEmpty(this.f75540D) || this.f75541E == 0)) {
            float f = ((float) this.f75243i) / ((float) this.f75541E);
            int size = this.f75540D.size();
            for (int i5 = 0; i5 < size; i5++) {
                ArrayList<CalendarWorkHourSpan> b = this.f75540D.get(i5).mo108993b();
                if (CollectionUtils.isEmpty(b)) {
                    canvas.drawRect(((float) this.f75238d) + (((float) this.f75540D.get(i5).mo108990a()) * f), BitmapDescriptorFactory.HUE_RED, ((float) this.f75238d) + (((float) (this.f75540D.get(i5).mo108990a() + 1)) * f), ((float) CalendarWorkHourUtil.f83805a) * ((float) this.f75242h), this.f75249o);
                } else if (b.size() == 1) {
                    int startMinute = b.get(0).getStartMinute();
                    int endMinute = b.get(0).getEndMinute();
                    float f2 = (float) CalendarWorkHourUtil.f83805a;
                    canvas.drawRect(((float) this.f75238d) + (((float) this.f75540D.get(i5).mo108990a()) * f), BitmapDescriptorFactory.HUE_RED, ((float) this.f75238d) + (((float) (this.f75540D.get(i5).mo108990a() + 1)) * f), (((float) startMinute) / f2) * ((float) this.f75242h), this.f75249o);
                    canvas.drawRect(((float) this.f75238d) + (((float) this.f75540D.get(i5).mo108990a()) * f), (((float) endMinute) / f2) * ((float) this.f75242h), ((float) this.f75238d) + (((float) (this.f75540D.get(i5).mo108990a() + 1)) * f), (float) this.f75242h, this.f75249o);
                } else {
                    if (b.get(0).getStartMinute() < b.get(1).getStartMinute()) {
                        i3 = b.get(0).getStartMinute();
                        i2 = b.get(0).getEndMinute();
                        i = b.get(1).getStartMinute();
                        i4 = b.get(1).getEndMinute();
                    } else {
                        i3 = b.get(1).getStartMinute();
                        i2 = b.get(1).getEndMinute();
                        i = b.get(0).getStartMinute();
                        i4 = b.get(0).getEndMinute();
                    }
                    float f3 = (float) CalendarWorkHourUtil.f83805a;
                    canvas.drawRect(((float) this.f75238d) + (((float) this.f75540D.get(i5).mo108990a()) * f), BitmapDescriptorFactory.HUE_RED, ((float) this.f75238d) + (((float) (this.f75540D.get(i5).mo108990a() + 1)) * f), (((float) i3) / f3) * ((float) this.f75242h), this.f75249o);
                    canvas.drawRect(((float) this.f75238d) + (((float) this.f75540D.get(i5).mo108990a()) * f), (((float) i2) / f3) * ((float) this.f75242h), ((float) this.f75238d) + (((float) (this.f75540D.get(i5).mo108990a() + 1)) * f), (((float) i) / f3) * ((float) this.f75242h), this.f75249o);
                    canvas.drawRect(((float) this.f75238d) + (((float) this.f75540D.get(i5).mo108990a()) * f), (((float) i4) / f3) * ((float) this.f75242h), ((float) this.f75238d) + (((float) (this.f75540D.get(i5).mo108990a() + 1)) * f), (float) this.f75242h, this.f75249o);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo109093a(int i, int i2) {
        mo109094a(i, i2, 15);
    }

    /* renamed from: a */
    private final boolean m112211a(float f, float f2) {
        if (f2 < ((float) 0) || Math.abs(f - f2) >= this.f75241g) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m112212a(float f, List<ChooseTimeLineData> list) {
        boolean z;
        List<ChooseTimeLineData> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || list.size() < 2) {
            return false;
        }
        if (m112211a(f, list.get(0).mo108918c()) || m112211a(f, list.get(1).mo108918c())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeBarLine(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f75537A = true;
        this.f75538B = true;
        this.f75539C = true;
        this.f75540D = new ArrayList<>();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.showTimeBar, R.attr.showTimeLine, R.attr.showWorkHour});
            Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr… R.styleable.TimeBarLine)");
            this.f75537A = obtainStyledAttributes.getBoolean(0, true);
            this.f75538B = obtainStyledAttributes.getBoolean(1, true);
            this.f75539C = obtainStyledAttributes.getBoolean(2, true);
        }
        if (!this.f75537A) {
            this.f75238d = 0;
        }
    }

    /* renamed from: b */
    private final void m112213b(Canvas canvas, List<ChooseTimeLineData> list) {
        int i = TimeLinesLayer.f75236b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f75537A && !m112212a(this.f75252r + ((float) (this.f75237c * i2)), list)) {
                canvas.drawText(TimeLinesLayer.f75235a[i2], (float) (this.f75238d / 2), this.f75252r + ((float) (this.f75237c * i2)), this.f75246l);
            }
            if (this.f75538B) {
                int i3 = this.f75244j;
                for (int i4 = 0; i4 < i3; i4++) {
                    float f = (float) (this.f75238d + this.f75239e + (this.f75243i * i4));
                    float f2 = this.f75251q + ((float) (this.f75237c * i2));
                    canvas.drawLine(f, f2, (((float) this.f75243i) + f) - ((float) this.f75239e), f2, this.f75245k);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m112210a(Canvas canvas, List<ChooseTimeLineData> list) {
        boolean z;
        List<ChooseTimeLineData> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && list.size() >= 2) {
            ChooseTimeLineData bVar = list.get(0);
            ChooseTimeLineData bVar2 = list.get(1);
            String a = m112208a(bVar.mo108916a(), bVar.mo108917b(), false);
            String a2 = m112208a(bVar2.mo108916a(), bVar2.mo108917b(), true);
            canvas.drawText(a, (float) (this.f75238d / 2), bVar.mo108918c(), this.f75248n);
            canvas.drawText(a2, (float) (this.f75238d / 2), bVar2.mo108918c(), this.f75248n);
        }
    }

    /* renamed from: a */
    private final String m112208a(int i, int i2, boolean z) {
        CalendarDate calendarDate = this.f75259y;
        Intrinsics.checkExpressionValueIsNotNull(calendarDate, "mTimeShowDate");
        calendarDate.setHour(i);
        CalendarDate calendarDate2 = this.f75259y;
        Intrinsics.checkExpressionValueIsNotNull(calendarDate2, "mTimeShowDate");
        calendarDate2.setMinute(i2 * this.f75253s);
        if (z) {
            CalendarDate calendarDate3 = this.f75259y;
            Intrinsics.checkExpressionValueIsNotNull(calendarDate3, "mTimeShowDate");
            String b = C32646c.m125270b(calendarDate3.getTimeInMilliSeconds(), TimeZone.getDefault(), true);
            Intrinsics.checkExpressionValueIsNotNull(b, "CalendarDateTimeShowUtil…eZone.getDefault(), true)");
            return b;
        }
        CalendarDate calendarDate4 = this.f75259y;
        Intrinsics.checkExpressionValueIsNotNull(calendarDate4, "mTimeShowDate");
        String a = C32646c.m125255a(calendarDate4.getTimeInMilliSeconds(), TimeZone.getDefault(), true);
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDateTimeShowUtil…eZone.getDefault(), true)");
        return a;
    }

    /* renamed from: a */
    public final void mo109094a(int i, int i2, int i3) {
        this.f75253s = i3;
        if (i3 >= 15) {
            this.f75256v = this.f75258x.mo108771a(BitmapDescriptorFactory.HUE_RED, (float) i).top;
            this.f75257w = this.f75258x.mo108771a(BitmapDescriptorFactory.HUE_RED, (float) i2).top;
        } else {
            this.f75256v = i;
            this.f75257w = i2;
        }
        invalidate();
    }
}
