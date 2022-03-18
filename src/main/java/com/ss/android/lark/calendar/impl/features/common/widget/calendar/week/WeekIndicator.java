package com.ss.android.lark.calendar.impl.features.common.widget.calendar.week;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.widget.Vp2Helper;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32645b;
import com.ss.android.lark.calendar.impl.utils.C32647d;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001:B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0002J\u0018\u00105\u001a\u0002022\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0002J*\u00106\u001a\u0002022\u0012\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\n2\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0016@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020 @VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0011R\u000e\u0010'\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R$\u0010(\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013R\u001a\u0010+\u001a\u00020,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006;"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/week/WeekIndicator;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/base/BaseDateIndicator;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "allEventColors", "Landroid/util/SparseArray;", "", "currentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "value", "currentDay", "getCurrentDay", "()I", "setCurrentDay", "(I)V", "dayRender", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/week/WeekDayView;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "firstDayOfWeek", "getFirstDayOfWeek", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "setFirstDayOfWeek", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;)V", "helper", "Lcom/ss/android/lark/calendar/impl/features/common/widget/Vp2Helper;", "getHelper", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/Vp2Helper;", "", "isShowLunarDay", "()Z", "setShowLunarDay", "(Z)V", "rowHeight", "getRowHeight", "selectedDate", "selectedDay", "getSelectedDay", "setSelectedDay", "viewType", "", "getViewType", "()Ljava/lang/String;", "setViewType", "(Ljava/lang/String;)V", "onPageSelected", "", "oldPosition", "newPosition", "sendNavigationHitPoint", "updateDayEventColors", "eventColors", "startDay", "endDay", "WeekIndicatorAdapter", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class WeekIndicator extends BaseDateIndicator {

    /* renamed from: a */
    public final CalendarDate f78829a;

    /* renamed from: b */
    public final CalendarDate f78830b;

    /* renamed from: c */
    public final SparseArray<List<Integer>> f78831c;

    /* renamed from: d */
    public final C31191b f78832d;

    /* renamed from: e */
    private String f78833e;

    /* renamed from: f */
    private CalendarSetting.DayOfWeek f78834f;

    /* renamed from: g */
    private boolean f78835g;

    /* renamed from: h */
    private int f78836h;

    /* renamed from: i */
    private int f78837i;

    /* renamed from: j */
    private final Vp2Helper f78838j;

    public WeekIndicator(Context context) {
        this(context, null, 0, 6, null);
    }

    public WeekIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator
    /* renamed from: a */
    public boolean mo112898a() {
        return this.f78835g;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator
    public int getCurrentDay() {
        return this.f78836h;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator
    public CalendarSetting.DayOfWeek getFirstDayOfWeek() {
        return this.f78834f;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator
    public Vp2Helper getHelper() {
        return this.f78838j;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator
    public int getSelectedDay() {
        return this.f78837i;
    }

    public final String getViewType() {
        return this.f78833e;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator
    public int getRowHeight() {
        return this.f78832d.getCellViewHeight();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/week/WeekIndicator$WeekIndicatorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/base/BaseDateIndicator$SingleViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/base/IOnSelectChangeListener;", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/week/WeekIndicator;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCancelSelectState", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onSelectDateChanged", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "onSelectOtherMonth", "offset", "onUpdateSelectState", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.calendar.week.WeekIndicator$a */
    private final class WeekIndicatorAdapter extends RecyclerView.Adapter<BaseDateIndicator.SingleViewHolder> implements AbstractC31175e {
        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e
        /* renamed from: a */
        public void mo112939a() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e
        /* renamed from: a */
        public void mo112940a(int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 214748364;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e
        /* renamed from: b */
        public void mo112942b() {
            Vp2Helper.m116555a(WeekIndicator.this.getHelper(), 0, 1, null);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public WeekIndicatorAdapter() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e
        /* renamed from: a */
        public void mo112941a(CalendarDate calendarDate) {
            WeekIndicator weekIndicator = WeekIndicator.this;
            if (calendarDate != null) {
                weekIndicator.setSelectedDay(calendarDate.getJulianDay());
                Function2<Integer, Boolean, Unit> dateChangeListener = WeekIndicator.this.getDateChangeListener();
                if (dateChangeListener != null) {
                    dateChangeListener.invoke(Integer.valueOf(WeekIndicator.this.getSelectedDay()), true);
                }
            }
        }

        /* renamed from: a */
        public BaseDateIndicator.SingleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            C31192c cVar = new C31192c(viewGroup.getContext(), WeekIndicator.this.f78832d);
            cVar.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            cVar.setOnMonthDayViewSelectListener(this);
            return new BaseDateIndicator.SingleViewHolder(cVar);
        }

        /* renamed from: a */
        public void onBindViewHolder(BaseDateIndicator.SingleViewHolder aVar, int i) {
            Intrinsics.checkParameterIsNotNull(aVar, "holder");
            View a = aVar.mo112907a();
            if (!(a instanceof C31192c)) {
                a = null;
            }
            C31192c cVar = (C31192c) a;
            if (cVar != null) {
                CalendarDate julianDay = new CalendarDate(WeekIndicator.this.f78830b.getTimeZone()).setJulianDay(C32645b.m125236b(i, WeekIndicator.this.getFirstDayOfWeek()));
                cVar.setSeedDate(julianDay);
                cVar.setStartDate(C32647d.m125284d(julianDay, WeekIndicator.this.getFirstDayOfWeek()));
                cVar.setEndDate(C32647d.m125286e(julianDay, WeekIndicator.this.getFirstDayOfWeek()));
                cVar.setSelectDate(WeekIndicator.this.f78830b);
                cVar.setCurrentDate(WeekIndicator.this.f78829a);
                cVar.setDayEventColors(WeekIndicator.this.f78831c);
                cVar.mo113015a();
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator
    public void setCurrentDay(int i) {
        this.f78836h = i;
        this.f78829a.setJulianDay(i);
    }

    public final void setViewType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f78833e = str;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator
    public void setShowLunarDay(boolean z) {
        this.f78835g = z;
        this.f78832d.setShowLunarDay(z);
        Vp2Helper.m116555a(getHelper(), 0, 1, null);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator
    public void setFirstDayOfWeek(CalendarSetting.DayOfWeek dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "value");
        this.f78834f = dayOfWeek;
        getHelper().mo113134a(C32645b.m125230a(getSelectedDay(), dayOfWeek));
        Vp2Helper.m116555a(getHelper(), 0, 1, null);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator
    public void setSelectedDay(int i) {
        this.f78837i = i;
        this.f78830b.setJulianDay(i);
        getHelper().mo113134a(C32645b.m125230a(i, getFirstDayOfWeek()));
        Vp2Helper.m116555a(getHelper(), 0, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "oldPosition", "p2", "newPosition", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.calendar.week.WeekIndicator$b */
    static final /* synthetic */ class C31187b extends FunctionReference implements Function2<Integer, Integer, Unit> {
        C31187b(WeekIndicator weekIndicator) {
            super(2, weekIndicator);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "onPageSelected";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(WeekIndicator.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "onPageSelected(II)V";
        }

        public final void invoke(int i, int i2) {
            ((WeekIndicator) this.receiver).mo112997a(i, i2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Integer num, Integer num2) {
            invoke(num.intValue(), num2.intValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    private final void m116453b(int i, int i2) {
        String str;
        if (i2 > i) {
            str = "cal_widget_next";
        } else if (i2 < i) {
            str = "cal_widget_prev";
        } else {
            return;
        }
        GeneralHitPoint.m124209a("cal_widget", str, this.f78833e);
    }

    /* renamed from: a */
    public final void mo112997a(int i, int i2) {
        if (C32645b.m125230a(getSelectedDay(), getFirstDayOfWeek()) != i2) {
            setSelectedDay(C32645b.m125236b(i2, getFirstDayOfWeek()) + C32645b.m125239c(getSelectedDay(), getFirstDayOfWeek()));
            Function2<Integer, Boolean, Unit> dateChangeListener = getDateChangeListener();
            if (dateChangeListener != null) {
                dateChangeListener.invoke(Integer.valueOf(getSelectedDay()), false);
            }
        }
        m116453b(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WeekIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f78833e = "";
        this.f78834f = super.getFirstDayOfWeek();
        this.f78835g = super.mo112898a();
        CalendarDate calendarDate = new CalendarDate();
        this.f78829a = calendarDate;
        this.f78836h = calendarDate.getJulianDay();
        CalendarDate calendarDate2 = new CalendarDate();
        this.f78830b = calendarDate2;
        this.f78837i = calendarDate2.getJulianDay();
        this.f78838j = new Vp2Helper(new ViewPager2(context), new WeekIndicatorAdapter(), new C31187b(this));
        this.f78831c = new SparseArray<>();
        C31191b bVar = new C31191b(context, mo112898a());
        this.f78832d = bVar;
        getHelper().mo113134a(C32645b.m125230a(getSelectedDay(), getFirstDayOfWeek()));
        addView(getHelper().mo113133a(), new FrameLayout.LayoutParams(-1, -1));
        bVar.setDesktopWidth(C36512a.m144041a().mo134753a(ContainerType.Right).width());
        bVar.setTypeFace(Typeface.createFromAsset(context.getAssets(), "fonts/DINPro-Bold.ttf"));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WeekIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
