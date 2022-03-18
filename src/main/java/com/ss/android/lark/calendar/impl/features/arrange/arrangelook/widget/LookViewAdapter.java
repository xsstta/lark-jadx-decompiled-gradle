package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget;

import android.content.Context;
import android.view.View;
import com.larksuite.framework.ui.dragger.C26213k;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31111g;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.AbstractC31218b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B?\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J\u0006\u0010\u001f\u001a\u00020\u001bJ\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J\u000e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u000fJ\u0006\u0010%\u001a\u00020!J\u0010\u0010&\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J\u000e\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u0005J\u0016\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u000fR\u000e\u0010\u0011\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookViewAdapter;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitepager/InfinitePagerAdapter;", "context", "Landroid/content/Context;", "date", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "dragger", "Lcom/larksuite/framework/ui/dragger/Dragger;", "eventDrag", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$OnEventDrag;", "viewDependency", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ViewDependency;", "timeSelectedListener", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$TimeSelectedListener;", "columnNum", "", "(Landroid/content/Context;Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;Lcom/larksuite/framework/ui/dragger/Dragger;Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$OnEventDrag;Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ViewDependency;Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$TimeSelectedListener;I)V", "mColumnNum", "mCurCenterDate", "mCurInflatePageCount", "mDragger", "mOnEventDrag", "mTimeSelectListener", "mViewDependency", "mViewPagerInflateListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/OnViewPagerInflated;", "addViewPagerInflateListener", "", "listener", "afterInstantiateItem", "position", "cleanAppendChipView", "getCurrentPage", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookPageView;", "getFollowingPage", "getPageByIndex", "pageIndex", "getPreviousPage", "onInstantiateItem", "Landroid/view/View;", "setThreePageDate", "selectedDate", "selectedPageIndex", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.b */
public final class LookViewAdapter extends AbstractC31218b {

    /* renamed from: a */
    private CalendarDate f75351a;

    /* renamed from: d */
    private final C26213k f75352d;

    /* renamed from: e */
    private int f75353e = 0;

    /* renamed from: f */
    private final ILookContract.ViewDependency f75354f;

    /* renamed from: g */
    private final ILookContract.TimeSelectedListener f75355g;

    /* renamed from: h */
    private final ILookContract.OnEventDrag f75356h;

    /* renamed from: i */
    private AbstractC31111g f75357i;

    /* renamed from: j */
    private int f75358j;

    /* renamed from: b */
    public final LookPageView mo108830b() {
        View d = mo113215d(1);
        Intrinsics.checkExpressionValueIsNotNull(d, "getPageView(InfinitePage…ter.PAGE_POSITION_CENTER)");
        return (LookPageView) d;
    }

    /* renamed from: c */
    public final LookPageView mo108832c() {
        View d = mo113215d(2);
        Intrinsics.checkExpressionValueIsNotNull(d, "getPageView(InfinitePage…pter.PAGE_POSITION_RIGHT)");
        return (LookPageView) d;
    }

    /* renamed from: d */
    public final LookPageView mo108834d() {
        View d = mo113215d(0);
        Intrinsics.checkExpressionValueIsNotNull(d, "getPageView(InfinitePage…apter.PAGE_POSITION_LEFT)");
        return (LookPageView) d;
    }

    /* renamed from: a */
    public final void mo108826a() {
        mo108834d().getEventChipsDragLayer().mo108591c();
        mo108830b().getEventChipsDragLayer().mo108591c();
        mo108832c().getEventChipsDragLayer().mo108591c();
    }

    /* renamed from: a */
    public final void mo108829a(AbstractC31111g gVar) {
        this.f75357i = gVar;
    }

    /* renamed from: a */
    public final void mo108827a(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "selectedDate");
        mo108828a(calendarDate, 1);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.AbstractC31218b
    /* renamed from: b */
    public void mo108831b(int i) {
        AbstractC31111g gVar;
        int i2 = this.f75353e + 1;
        this.f75353e = i2;
        if (i2 == 3 && (gVar = this.f75357i) != null) {
            gVar.mo108584a();
        }
    }

    /* renamed from: c */
    public final LookPageView mo108833c(int i) {
        View d = mo113215d(i);
        Intrinsics.checkExpressionValueIsNotNull(d, "getPageView(pageIndex)");
        return (LookPageView) d;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.AbstractC31218b
    /* renamed from: a */
    public View mo108825a(int i) {
        Context context = this.f78951b;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        LookPageView aVar = new LookPageView(context, this.f75352d, this.f75351a, this.f75356h, this.f75354f, this.f75358j);
        aVar.setTimeSelectedListener(this.f75355g);
        if (i == 0) {
            CalendarDate addDay = this.f75351a.addDay(-1);
            Intrinsics.checkExpressionValueIsNotNull(addDay, "leftBaseDate");
            aVar.setDate(addDay);
        } else if (i == 1) {
            aVar.setDate(this.f75351a);
        } else if (i == 2) {
            CalendarDate addDay2 = this.f75351a.addDay(1);
            Intrinsics.checkExpressionValueIsNotNull(addDay2, "rightBaseDate");
            aVar.setDate(addDay2);
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo108828a(CalendarDate calendarDate, int i) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "selectedDate");
        this.f75351a = calendarDate;
        if (i == 0) {
            mo108834d().setDate(calendarDate);
            LookPageView b = mo108830b();
            CalendarDate addDay = calendarDate.addDay(1);
            Intrinsics.checkExpressionValueIsNotNull(addDay, "selectedDate.addDay(1)");
            b.setDate(addDay);
            LookPageView c = mo108832c();
            CalendarDate addDay2 = calendarDate.addDay(-1);
            Intrinsics.checkExpressionValueIsNotNull(addDay2, "selectedDate.addDay(-1)");
            c.setDate(addDay2);
        } else if (i != 2) {
            LookPageView d = mo108834d();
            CalendarDate addDay3 = calendarDate.addDay(-1);
            Intrinsics.checkExpressionValueIsNotNull(addDay3, "selectedDate.addDay(-1)");
            d.setDate(addDay3);
            mo108830b().setDate(calendarDate);
            LookPageView c2 = mo108832c();
            CalendarDate addDay4 = calendarDate.addDay(1);
            Intrinsics.checkExpressionValueIsNotNull(addDay4, "selectedDate.addDay(1)");
            c2.setDate(addDay4);
        } else {
            LookPageView d2 = mo108834d();
            CalendarDate addDay5 = calendarDate.addDay(1);
            Intrinsics.checkExpressionValueIsNotNull(addDay5, "selectedDate.addDay(1)");
            d2.setDate(addDay5);
            LookPageView b2 = mo108830b();
            CalendarDate addDay6 = calendarDate.addDay(-1);
            Intrinsics.checkExpressionValueIsNotNull(addDay6, "selectedDate.addDay(-1)");
            b2.setDate(addDay6);
            mo108832c().setDate(calendarDate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LookViewAdapter(Context context, CalendarDate calendarDate, C26213k kVar, ILookContract.OnEventDrag cVar, ILookContract.ViewDependency eVar, ILookContract.TimeSelectedListener dVar, int i) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(calendarDate, "date");
        Intrinsics.checkParameterIsNotNull(kVar, "dragger");
        Intrinsics.checkParameterIsNotNull(cVar, "eventDrag");
        Intrinsics.checkParameterIsNotNull(eVar, "viewDependency");
        Intrinsics.checkParameterIsNotNull(dVar, "timeSelectedListener");
        this.f75351a = calendarDate;
        this.f75352d = kVar;
        this.f75356h = cVar;
        this.f75354f = eVar;
        this.f75355g = dVar;
        this.f75358j = i;
        mo113216h();
    }
}
