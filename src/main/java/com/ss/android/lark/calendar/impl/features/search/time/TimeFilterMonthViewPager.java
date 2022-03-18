package com.ss.android.lark.calendar.impl.features.search.time;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31109e;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.AbstractC31169a;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.InfiniteViewPager;
import com.ss.android.lark.calendar.impl.features.search.time.TimeFilterAttr;
import com.ss.android.lark.calendar.impl.utils.C32647d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J6\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0012H\u0002J\u000e\u0010\"\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0018J\u000e\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0012J\u000e\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterMonthViewPager;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitepager/InfiniteViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "centerView", "Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterMonthView;", "getCenterView", "()Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterMonthView;", "leftView", "getLeftView", "mViewPageListener", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/IOnViewPageListener;", "rightView", "getRightView", "rowNum", "", "getRowNum", "()I", "refreshOptionalTimeView", "", "startTime", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "startTimeNoLimit", "", "endTime", "endTimeNoLimit", "selectDate", "selectTimeType", "Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterAttr$SelectTimeType;", "refreshPage", "pageIndex", "refreshView", "scrollToPage", "offset", "setViewPageListener", "viewPageListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TimeFilterMonthViewPager extends InfiniteViewPager {

    /* renamed from: a */
    public AbstractC31169a f82909a;

    public TimeFilterMonthViewPager(Context context) {
        this(context, null, 2, null);
    }

    public final int getRowNum() {
        TimeFilterMonthView centerView = getCenterView();
        if (centerView != null) {
            return centerView.getRowNum();
        }
        return 0;
    }

    private final TimeFilterMonthView getCenterView() {
        TimeFilterMonthViewAdapter dVar = (TimeFilterMonthViewAdapter) getAdapter();
        if (dVar != null) {
            return (TimeFilterMonthView) dVar.mo113215d(1);
        }
        return null;
    }

    private final TimeFilterMonthView getLeftView() {
        TimeFilterMonthViewAdapter dVar = (TimeFilterMonthViewAdapter) getAdapter();
        if (dVar != null) {
            return (TimeFilterMonthView) dVar.mo113215d(0);
        }
        return null;
    }

    private final TimeFilterMonthView getRightView() {
        TimeFilterMonthViewAdapter dVar = (TimeFilterMonthViewAdapter) getAdapter();
        if (dVar != null) {
            return (TimeFilterMonthView) dVar.mo113215d(2);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onSmoothScrollFinish"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.TimeFilterMonthViewPager$a */
    public static final class C32361a implements AbstractC31109e {

        /* renamed from: a */
        final /* synthetic */ TimeFilterMonthViewPager f82911a;

        /* renamed from: b */
        final /* synthetic */ int f82912b;

        C32361a(TimeFilterMonthViewPager timeFilterMonthViewPager, int i) {
            this.f82911a = timeFilterMonthViewPager;
            this.f82912b = i;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31109e
        /* renamed from: a */
        public final void mo111736a() {
            AbstractC31169a aVar;
            this.f82911a.mo118222b(0);
            this.f82911a.mo118222b(2);
            int i = this.f82912b;
            if (i < 0) {
                AbstractC31169a aVar2 = this.f82911a.f82909a;
                if (aVar2 != null) {
                    aVar2.mo111724a();
                }
            } else if (i > 0 && (aVar = this.f82911a.f82909a) != null) {
                aVar.mo111726b();
            }
        }
    }

    public final void setViewPageListener(AbstractC31169a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewPageListener");
        this.f82909a = aVar;
    }

    /* renamed from: b */
    public final void mo118222b(int i) {
        TimeFilterMonthViewAdapter dVar = (TimeFilterMonthViewAdapter) getAdapter();
        if (dVar != null) {
            dVar.mo118238c(i);
        }
    }

    /* renamed from: a */
    public final void mo118219a(int i) {
        int i2;
        if (i > 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        mo113203a(i2, false);
        setOnSmoothScrollFinishListener(new C32361a(this, i));
    }

    /* renamed from: a */
    public final void mo118220a(CalendarDate calendarDate) {
        CalendarDate calendarDate2;
        Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
        TimeFilterMonthView centerView = getCenterView();
        if (centerView != null) {
            calendarDate2 = centerView.getSelectDate();
        } else {
            calendarDate2 = null;
        }
        int monthDiff = calendarDate.monthDiff(calendarDate2);
        if (monthDiff > 0) {
            TimeFilterMonthView rightView = getRightView();
            if (rightView != null) {
                rightView.setSelectDate(calendarDate);
            }
            TimeFilterMonthView rightView2 = getRightView();
            if (rightView2 != null) {
                rightView2.mo112973b();
            }
            mo118219a(monthDiff);
        } else if (monthDiff < 0) {
            TimeFilterMonthView leftView = getLeftView();
            if (leftView != null) {
                leftView.setSelectDate(calendarDate);
            }
            TimeFilterMonthView leftView2 = getLeftView();
            if (leftView2 != null) {
                leftView2.mo112973b();
            }
            mo118219a(monthDiff);
        } else {
            TimeFilterMonthView centerView2 = getCenterView();
            if (centerView2 != null) {
                centerView2.setSelectDate(calendarDate);
            }
            TimeFilterMonthView centerView3 = getCenterView();
            if (centerView3 != null) {
                centerView3.mo112973b();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeFilterMonthViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setWillNotDraw(false);
        setOffscreenPageLimit(3);
        mo113204a(new AbstractC31110f<TimeFilterMonthView>(this) {
            /* class com.ss.android.lark.calendar.impl.features.search.time.TimeFilterMonthViewPager.C323601 */

            /* renamed from: a */
            final /* synthetic */ TimeFilterMonthViewPager f82910a;

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f
            /* renamed from: a */
            public void mo108576a() {
            }

            /* renamed from: a */
            public void mo108578a(TimeFilterMonthView cVar, TimeFilterMonthView cVar2) {
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f
            /* renamed from: b */
            public void mo112084b(int i) {
            }

            /* renamed from: b */
            public void mo108581b(TimeFilterMonthView cVar, TimeFilterMonthView cVar2) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f82910a = r1;
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f
            /* renamed from: a */
            public void mo108577a(int i) {
                TimeFilterMonthView cVar;
                TimeFilterMonthView cVar2;
                CalendarDate calendarDate;
                CalendarDate calendarDate2;
                TimeFilterMonthViewAdapter dVar = (TimeFilterMonthViewAdapter) this.f82910a.getAdapter();
                CalendarDate calendarDate3 = null;
                if (dVar != null) {
                    cVar = (TimeFilterMonthView) dVar.mo113215d(0);
                } else {
                    cVar = null;
                }
                if (dVar != null) {
                    cVar2 = (TimeFilterMonthView) dVar.mo113215d(2);
                } else {
                    cVar2 = null;
                }
                if (i == 0) {
                    if (dVar != null) {
                        calendarDate = dVar.mo118237c();
                    } else {
                        calendarDate = null;
                    }
                    if (this.f82910a.f82909a != null) {
                        AbstractC31169a aVar = this.f82910a.f82909a;
                        if (aVar != null) {
                            aVar.mo111725a(calendarDate);
                        }
                        AbstractC31169a aVar2 = this.f82910a.f82909a;
                        if (aVar2 != null) {
                            aVar2.mo111726b();
                        }
                    }
                    if (dVar != null) {
                        calendarDate3 = dVar.mo118237c();
                    }
                    if (cVar2 != null) {
                        cVar2.setSeedDate(calendarDate3);
                        cVar2.setStartDate(C32647d.m125279b(calendarDate3));
                        cVar2.setEndDate(C32647d.m125281c(calendarDate3));
                    }
                    if (dVar != null) {
                        dVar.mo118240e();
                    }
                } else if (i == 1) {
                    if (dVar != null) {
                        calendarDate2 = dVar.mo118236b();
                    } else {
                        calendarDate2 = null;
                    }
                    if (this.f82910a.f82909a != null) {
                        AbstractC31169a aVar3 = this.f82910a.f82909a;
                        if (aVar3 != null) {
                            aVar3.mo111725a(calendarDate2);
                        }
                        AbstractC31169a aVar4 = this.f82910a.f82909a;
                        if (aVar4 != null) {
                            aVar4.mo111724a();
                        }
                    }
                    if (dVar != null) {
                        calendarDate3 = dVar.mo118236b();
                    }
                    if (cVar != null) {
                        cVar.setSeedDate(calendarDate3);
                        cVar.setStartDate(C32647d.m125279b(calendarDate3));
                        cVar.setEndDate(C32647d.m125281c(calendarDate3));
                    }
                    if (dVar != null) {
                        dVar.mo118240e();
                    }
                }
            }
        });
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TimeFilterMonthViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: a */
    public final void mo118221a(CalendarDate calendarDate, boolean z, CalendarDate calendarDate2, boolean z2, CalendarDate calendarDate3, TimeFilterAttr.SelectTimeType selectTimeType) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "startTime");
        Intrinsics.checkParameterIsNotNull(calendarDate2, "endTime");
        Intrinsics.checkParameterIsNotNull(calendarDate3, "selectDate");
        Intrinsics.checkParameterIsNotNull(selectTimeType, "selectTimeType");
        TimeFilterMonthView rightView = getRightView();
        if (rightView != null) {
            rightView.setSelectDate(calendarDate3);
        }
        TimeFilterMonthView leftView = getLeftView();
        if (leftView != null) {
            leftView.setSelectDate(calendarDate3);
        }
        TimeFilterMonthView centerView = getCenterView();
        if (centerView != null) {
            centerView.setSelectDate(calendarDate3);
        }
        TimeFilterMonthView rightView2 = getRightView();
        if (rightView2 != null) {
            rightView2.mo118232a(calendarDate, z, calendarDate2, z2, selectTimeType);
        }
        TimeFilterMonthView leftView2 = getLeftView();
        if (leftView2 != null) {
            leftView2.mo118232a(calendarDate, z, calendarDate2, z2, selectTimeType);
        }
        TimeFilterMonthView centerView2 = getCenterView();
        if (centerView2 != null) {
            centerView2.mo118232a(calendarDate, z, calendarDate2, z2, selectTimeType);
        }
    }
}
