package com.ss.android.lark.calendar.impl.features.common.widget.calendar.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.calendar.impl.features.common.widget.Vp2Helper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001:\u00011B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR$\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eRL\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u001b@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u00020\"X¤\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R$\u0010%\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\fR\u0014\u0010+\u001a\u00020\u0007XD¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\fR\u0014\u0010-\u001a\u00020\u0007XD¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\fR\u001a\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010\u000e¨\u00062"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/base/BaseDateIndicator;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "currentDay", "getCurrentDay", "()I", "setCurrentDay", "(I)V", "dateChangeListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "selectedDay", "", "fromClick", "", "getDateChangeListener", "()Lkotlin/jvm/functions/Function2;", "setDateChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "firstDayOfWeek", "getFirstDayOfWeek", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "setFirstDayOfWeek", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;)V", "helper", "Lcom/ss/android/lark/calendar/impl/features/common/widget/Vp2Helper;", "getHelper", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/Vp2Helper;", "isShowLunarDay", "()Z", "setShowLunarDay", "(Z)V", "rowHeight", "getRowHeight", "rowIndex", "getRowIndex", "rowNum", "getRowNum", "getSelectedDay", "setSelectedDay", "SingleViewHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseDateIndicator extends FrameLayout {

    /* renamed from: a */
    private Function2<? super Integer, ? super Boolean, Unit> f78757a;

    /* renamed from: b */
    private CalendarSetting.DayOfWeek f78758b;

    /* renamed from: c */
    private boolean f78759c;

    /* renamed from: d */
    private int f78760d;

    /* renamed from: e */
    private int f78761e;

    /* renamed from: f */
    private final int f78762f;

    /* renamed from: g */
    private final int f78763g;

    public BaseDateIndicator(Context context) {
        this(context, null, 0, 6, null);
    }

    public BaseDateIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    public abstract Vp2Helper getHelper();

    /* access modifiers changed from: protected */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/base/BaseDateIndicator$SingleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "getV", "()Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.BaseDateIndicator$a */
    public static final class SingleViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final View f78764a;

        /* renamed from: a */
        public final View mo112907a() {
            return this.f78764a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SingleViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f78764a = view;
        }
    }

    /* renamed from: a */
    public boolean mo112898a() {
        return this.f78759c;
    }

    public int getCurrentDay() {
        return this.f78760d;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.k<? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.k<java.lang.Integer, java.lang.Boolean, kotlin.Unit> */
    public final Function2<Integer, Boolean, Unit> getDateChangeListener() {
        return this.f78757a;
    }

    public CalendarSetting.DayOfWeek getFirstDayOfWeek() {
        return this.f78758b;
    }

    public int getRowIndex() {
        return this.f78763g;
    }

    public int getRowNum() {
        return this.f78762f;
    }

    public int getSelectedDay() {
        return this.f78761e;
    }

    public int getRowHeight() {
        if (getRowNum() > 0) {
            return getHeight() / getRowNum();
        }
        return 0;
    }

    public final void setDateChangeListener(Function2<? super Integer, ? super Boolean, Unit> kVar) {
        this.f78757a = kVar;
    }

    public void setSelectedDay(int i) {
        this.f78761e = i;
    }

    public void setCurrentDay(int i) {
        this.f78760d = i;
        Vp2Helper.m116555a(getHelper(), 0, 1, null);
    }

    public void setShowLunarDay(boolean z) {
        this.f78759c = z;
        Vp2Helper.m116555a(getHelper(), 0, 1, null);
    }

    public void setFirstDayOfWeek(CalendarSetting.DayOfWeek dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "value");
        this.f78758b = dayOfWeek;
        Vp2Helper.m116555a(getHelper(), 0, 1, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseDateIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f78758b = CalendarSetting.DayOfWeek.SUNDAY;
        this.f78762f = 1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseDateIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
