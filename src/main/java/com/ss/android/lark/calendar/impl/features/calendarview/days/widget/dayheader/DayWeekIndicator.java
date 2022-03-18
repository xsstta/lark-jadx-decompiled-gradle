package com.ss.android.lark.calendar.impl.features.calendarview.days.widget.dayheader;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.ss.android.lark.calendar.impl.features.calendarview.days.widget.dayheader.DayHeaderPage;
import com.ss.android.lark.calendar.impl.features.common.widget.Vp2Helper;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32645b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0002R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/dayheader/DayWeekIndicator;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/base/BaseDateIndicator;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "firstDayOfWeek", "getFirstDayOfWeek", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "setFirstDayOfWeek", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;)V", "helper", "Lcom/ss/android/lark/calendar/impl/features/common/widget/Vp2Helper;", "getHelper", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/Vp2Helper;", "selectedDay", "getSelectedDay", "()I", "setSelectedDay", "(I)V", "onPageSelected", "", "oldPosition", "newPosition", "sendNavigationHitPoint", "DayWeekIndicatorAdapter", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DayWeekIndicator extends BaseDateIndicator {

    /* renamed from: a */
    private CalendarSetting.DayOfWeek f77431a;

    /* renamed from: b */
    private int f77432b;

    /* renamed from: c */
    private final Vp2Helper f77433c;

    public DayWeekIndicator(Context context) {
        this(context, null, 0, 6, null);
    }

    public DayWeekIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator
    public CalendarSetting.DayOfWeek getFirstDayOfWeek() {
        return this.f77431a;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator
    public Vp2Helper getHelper() {
        return this.f77433c;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator
    public int getSelectedDay() {
        return this.f77432b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/dayheader/DayWeekIndicator$DayWeekIndicatorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/base/BaseDateIndicator$SingleViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/dayheader/DayHeaderPage$OnHeaderItemClickedListener;", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/dayheader/DayWeekIndicator;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemClicked", "beforeDay", "afterDay", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.widget.dayheader.DayWeekIndicator$a */
    private final class DayWeekIndicatorAdapter extends RecyclerView.Adapter<BaseDateIndicator.SingleViewHolder> implements DayHeaderPage.OnHeaderItemClickedListener {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 214748364;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public DayWeekIndicatorAdapter() {
        }

        /* renamed from: a */
        public BaseDateIndicator.SingleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Context context = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
            DayHeaderPage dayHeaderPage = new DayHeaderPage(context, null, 0, 6, null);
            dayHeaderPage.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            dayHeaderPage.setItemClickedListener(this);
            return new BaseDateIndicator.SingleViewHolder(dayHeaderPage);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.widget.dayheader.DayHeaderPage.OnHeaderItemClickedListener
        /* renamed from: a */
        public void mo111401a(int i, int i2) {
            DayWeekIndicator.this.setSelectedDay(i2);
            Function2<Integer, Boolean, Unit> dateChangeListener = DayWeekIndicator.this.getDateChangeListener();
            if (dateChangeListener != null) {
                dateChangeListener.invoke(Integer.valueOf(DayWeekIndicator.this.getSelectedDay()), true);
            }
        }

        /* renamed from: a */
        public void onBindViewHolder(BaseDateIndicator.SingleViewHolder aVar, int i) {
            Intrinsics.checkParameterIsNotNull(aVar, "holder");
            View a = aVar.mo112907a();
            if (!(a instanceof DayHeaderPage)) {
                a = null;
            }
            DayHeaderPage dayHeaderPage = (DayHeaderPage) a;
            if (dayHeaderPage != null) {
                dayHeaderPage.setStartDay(C32645b.m125236b(i, DayWeekIndicator.this.getFirstDayOfWeek()));
                dayHeaderPage.setCurrentDay(DayWeekIndicator.this.getCurrentDay());
                dayHeaderPage.setSelectedDay(DayWeekIndicator.this.getSelectedDay());
                dayHeaderPage.mo111394a(DayWeekIndicator.this.mo112898a());
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator
    public void setSelectedDay(int i) {
        this.f77432b = i;
        getHelper().mo113134a(C32645b.m125230a(i, getFirstDayOfWeek()));
        Vp2Helper.m116555a(getHelper(), 0, 1, null);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator
    public void setFirstDayOfWeek(CalendarSetting.DayOfWeek dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "value");
        this.f77431a = dayOfWeek;
        getHelper().mo113134a(C32645b.m125230a(getSelectedDay(), dayOfWeek));
        Vp2Helper.m116555a(getHelper(), 0, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "oldPosition", "p2", "newPosition", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.widget.dayheader.DayWeekIndicator$b */
    static final /* synthetic */ class C30792b extends FunctionReference implements Function2<Integer, Integer, Unit> {
        C30792b(DayWeekIndicator dayWeekIndicator) {
            super(2, dayWeekIndicator);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "onPageSelected";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(DayWeekIndicator.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "onPageSelected(II)V";
        }

        public final void invoke(int i, int i2) {
            ((DayWeekIndicator) this.receiver).mo111403a(i, i2);
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
    private final void m114868b(int i, int i2) {
        String str;
        if (i2 > i) {
            str = "cal_widget_next";
        } else if (i2 < i) {
            str = "cal_widget_prev";
        } else {
            return;
        }
        GeneralHitPoint.m124209a("cal_widget", str, "day");
    }

    /* renamed from: a */
    public final void mo111403a(int i, int i2) {
        if (i2 != C32645b.m125230a(getSelectedDay(), getFirstDayOfWeek())) {
            setSelectedDay(C32645b.m125236b(i2, getFirstDayOfWeek()) + C32645b.m125239c(getSelectedDay(), getFirstDayOfWeek()));
            Function2<Integer, Boolean, Unit> dateChangeListener = getDateChangeListener();
            if (dateChangeListener != null) {
                dateChangeListener.invoke(Integer.valueOf(getSelectedDay()), false);
            }
        }
        m114868b(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DayWeekIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f77431a = super.getFirstDayOfWeek();
        this.f77432b = super.getSelectedDay();
        this.f77433c = new Vp2Helper(new ViewPager2(context), new DayWeekIndicatorAdapter(), new C30792b(this));
        addView(getHelper().mo113133a(), new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DayWeekIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
