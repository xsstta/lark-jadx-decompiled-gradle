package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.larksuite.framework.ui.dragger.C26213k;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.EventChipsDragLayer;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30165a;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30167c;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.CurrentTimeLine;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.EventChipsViewLayer;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TimeBarLine;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.features.common.widget.scrollview.OverScrollView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\u0018\u0000 E2\u00020\u0001:\u0001EB7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ8\u0010\"\u001a4\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0011j\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015`\u0016J\u0006\u0010#\u001a\u00020\u0007J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020)J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\rH\u0002J\u0010\u0010.\u001a\u00020+2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0006\u0010/\u001a\u00020\u001dJ(\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020\r2\u0006\u00104\u001a\u00020\rH\u0014J\u0006\u00105\u001a\u00020+J\u000e\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020\u0007J\u0018\u00108\u001a\u00020+2\u0006\u00109\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u001dH\u0002J@\u0010;\u001a\u00020+28\u0010<\u001a4\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0011j\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015`\u0016J\u000e\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020\u0007J\u0006\u0010?\u001a\u00020+J\u0010\u0010@\u001a\u00020+2\b\u0010A\u001a\u0004\u0018\u00010 J\b\u0010B\u001a\u00020+H\u0002J\u000e\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020\u0012R\u000e\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000RJ\u0010\u0010\u001a>\u0012\u0004\u0012\u00020\u0012\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00150\u0011j\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015`\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookPageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "dragger", "Lcom/larksuite/framework/ui/dragger/Dragger;", "date", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "onEventPageDrag", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$OnEventDrag;", "viewDependency", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ViewDependency;", "columnNum", "", "(Landroid/content/Context;Lcom/larksuite/framework/ui/dragger/Dragger;Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$OnEventDrag;Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ViewDependency;I)V", "mBaseDate", "mCenterPageChipViewData", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "mColumnNum", "mCurrentDate", "mDragger", "mEventChipsGridLine", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/EventChipsGridLine;", "mLoadSuccess", "", "mOnEventPageDrag", "mTimeSelectListener", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$TimeSelectedListener;", "mViewDependency", "getChipViewData", "getDate", "getEventChipsDragLayer", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/dragdrop/EventChipsDragLayer;", "getEventChipsLayer", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/EventChipsViewLayer;", "getScrollView", "Lcom/ss/android/lark/calendar/impl/features/common/widget/scrollview/OverScrollView;", "initGridLine", "", "width", "height", "initView", "isLoadSuccess", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "refreshTimeFormat", "scrollPositionByTime", "timeStamp", "scrollToPosition", "position", "smoothScroll", "setChipViewData", "chipViewData", "setDate", "newDate", "setLoadError", "setTimeSelectedListener", "listener", "showCurrentTimeLineIfNeed", "updateTimeZone", "timeZoneId", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.a */
public final class LookPageView extends FrameLayout {

    /* renamed from: d */
    public static final Companion f75332d = new Companion(null);

    /* renamed from: a */
    public CalendarDate f75333a;

    /* renamed from: b */
    public final ILookContract.OnEventDrag f75334b;

    /* renamed from: c */
    public ILookContract.TimeSelectedListener f75335c;

    /* renamed from: e */
    private boolean f75336e;

    /* renamed from: f */
    private CalendarDate f75337f = new CalendarDate();

    /* renamed from: g */
    private final C26213k f75338g;

    /* renamed from: h */
    private final ILookContract.ViewDependency f75339h;

    /* renamed from: i */
    private HashMap<String, ArrayList<DayEventChipViewData>> f75340i = new HashMap<>();

    /* renamed from: j */
    private C30167c f75341j;

    /* renamed from: k */
    private int f75342k;

    /* renamed from: l */
    private HashMap f75343l;

    /* renamed from: a */
    public View mo108809a(int i) {
        if (this.f75343l == null) {
            this.f75343l = new HashMap();
        }
        View view = (View) this.f75343l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f75343l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookPageView$Companion;", "", "()V", "COL_CHIP", "", "COL_LINE", "MTROOM_COL_NUM", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final boolean mo108813b() {
        return this.f75336e;
    }

    public final HashMap<String, ArrayList<DayEventChipViewData>> getChipViewData() {
        return this.f75340i;
    }

    public final CalendarDate getDate() {
        return this.f75333a;
    }

    /* renamed from: a */
    public final void mo108810a() {
        this.f75336e = false;
        this.f75340i = new HashMap<>();
    }

    public final EventChipsDragLayer getEventChipsDragLayer() {
        EventChipsDragLayer eventChipsDragLayer = (EventChipsDragLayer) mo108809a(R.id.chipsDragLayer);
        Intrinsics.checkExpressionValueIsNotNull(eventChipsDragLayer, "chipsDragLayer");
        return eventChipsDragLayer;
    }

    public final EventChipsViewLayer getEventChipsLayer() {
        EventChipsViewLayer eventChipsViewLayer = (EventChipsViewLayer) mo108809a(R.id.chipsLayer);
        Intrinsics.checkExpressionValueIsNotNull(eventChipsViewLayer, "chipsLayer");
        return eventChipsViewLayer;
    }

    public final OverScrollView getScrollView() {
        OverScrollView overScrollView = (OverScrollView) mo108809a(R.id.lookScrollView);
        Intrinsics.checkExpressionValueIsNotNull(overScrollView, "lookScrollView");
        return overScrollView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J \u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookPageView$initView$mOnEventDrag$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$OnEventDrag;", "mAutoScroll", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/AutoScroller;", "onEventDragEnd", "", "onEventDragStart", "onEventHandleDragMove", "index", "", "screenX", "screenY", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.a$b */
    public static final class C30176b implements ILookContract.OnEventDrag {

        /* renamed from: a */
        final /* synthetic */ LookPageView f75344a;

        /* renamed from: b */
        private C30165a f75345b;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30655a
        /* renamed from: a */
        public void mo108701a() {
            this.f75344a.f75334b.mo108701a();
            ((OverScrollView) this.f75344a.mo108809a(R.id.lookScrollView)).mo113348b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30655a
        /* renamed from: b */
        public void mo108703b() {
            this.f75344a.f75334b.mo108703b();
            ((OverScrollView) this.f75344a.mo108809a(R.id.lookScrollView)).mo113346a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30176b(LookPageView aVar) {
            this.f75344a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30655a
        /* renamed from: a */
        public void mo108702a(int i, int i2, int i3) {
            this.f75344a.f75334b.mo108702a(i, i2, i3);
            if (this.f75345b == null) {
                this.f75345b = new C30165a((OverScrollView) this.f75344a.mo108809a(R.id.lookScrollView));
            }
            C30165a aVar = this.f75345b;
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo108766a(i3);
            C30165a aVar2 = this.f75345b;
            if (aVar2 == null) {
                Intrinsics.throwNpe();
            }
            aVar2.mo108767b(i3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookPageView$initView$mOnEventSelected$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDaysContract$OnEventSelected;", "onEventCancel", "", "onEventSelect", "index", "", "beginPosition", "endPosition", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.a$c */
    public static final class C30177c implements CalendarDaysContract.AbstractC30656b {

        /* renamed from: a */
        final /* synthetic */ LookPageView f75346a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30656b
        /* renamed from: a */
        public void mo108688a() {
            ((TimeBarLine) this.f75346a.mo108809a(R.id.timeLineLayer)).mo108754b();
            ILookContract.TimeSelectedListener dVar = this.f75346a.f75335c;
            if (dVar != null) {
                dVar.mo108552a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30177c(LookPageView aVar) {
            this.f75346a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30656b
        /* renamed from: a */
        public void mo108689a(int i, int i2, int i3) {
            ((TimeBarLine) this.f75346a.mo108809a(R.id.timeLineLayer)).mo109093a(i2, i3);
            int a = ((TimeBarLine) this.f75346a.mo108809a(R.id.timeLineLayer)).mo109092a(i2);
            int a2 = ((TimeBarLine) this.f75346a.mo108809a(R.id.timeLineLayer)).mo109092a(i3);
            CalendarDate calendarDate = new CalendarDate(this.f75346a.f75333a, this.f75346a.f75333a.getTimeZone());
            calendarDate.setDayMinutes(a);
            CalendarDate calendarDate2 = new CalendarDate(this.f75346a.f75333a, this.f75346a.f75333a.getTimeZone());
            calendarDate2.setDayMinutes(a2);
            ILookContract.TimeSelectedListener dVar = this.f75346a.f75335c;
            if (dVar != null) {
                dVar.mo108553a(calendarDate.getTimeInSeconds(), calendarDate2.getTimeInSeconds());
            }
            GeneralHitPoint.m124273t();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookPageView$scrollToPosition$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.a$d */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC30178d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ LookPageView f75347a;

        /* renamed from: b */
        final /* synthetic */ ViewTreeObserver f75348b;

        /* renamed from: c */
        final /* synthetic */ boolean f75349c;

        /* renamed from: d */
        final /* synthetic */ int f75350d;

        public void onGlobalLayout() {
            this.f75348b.removeOnGlobalLayoutListener(this);
            if (this.f75349c) {
                ((OverScrollView) this.f75347a.mo108809a(R.id.lookScrollView)).smoothScrollTo(0, this.f75350d);
            } else {
                ((OverScrollView) this.f75347a.mo108809a(R.id.lookScrollView)).mo113347a(0, this.f75350d);
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC30178d(LookPageView aVar, ViewTreeObserver viewTreeObserver, boolean z, int i) {
            this.f75347a = aVar;
            this.f75348b = viewTreeObserver;
            this.f75349c = z;
            this.f75350d = i;
        }
    }

    /* renamed from: c */
    public final void mo108814c() {
        ((TimeBarLine) mo108809a(R.id.timeLineLayer)).mo108753a();
        m111825a(getWidth(), getHeight());
        ((TimeBarLine) mo108809a(R.id.timeLineLayer)).invalidate();
    }

    /* renamed from: d */
    private final void m111828d() {
        if (this.f75337f.sameDay(this.f75333a)) {
            CurrentTimeLine currentTimeLine = (CurrentTimeLine) mo108809a(R.id.currentTimeLine);
            Intrinsics.checkExpressionValueIsNotNull(currentTimeLine, "currentTimeLine");
            currentTimeLine.setVisibility(0);
            ((TimeBarLine) mo108809a(R.id.timeLineLayer)).mo108755c();
            return;
        }
        CurrentTimeLine currentTimeLine2 = (CurrentTimeLine) mo108809a(R.id.currentTimeLine);
        Intrinsics.checkExpressionValueIsNotNull(currentTimeLine2, "currentTimeLine");
        currentTimeLine2.setVisibility(8);
        ((TimeBarLine) mo108809a(R.id.timeLineLayer)).mo108756d();
    }

    public final void setTimeSelectedListener(ILookContract.TimeSelectedListener dVar) {
        this.f75335c = dVar;
    }

    public final void setChipViewData(HashMap<String, ArrayList<DayEventChipViewData>> hashMap) {
        Intrinsics.checkParameterIsNotNull(hashMap, "chipViewData");
        this.f75336e = true;
        this.f75340i = hashMap;
    }

    public final void setDate(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "newDate");
        CalendarDate calendarDate2 = new CalendarDate(calendarDate, this.f75333a.getTimeZone());
        this.f75333a = calendarDate2;
        calendarDate2.setSecond(0);
        ((EventChipsDragLayer) mo108809a(R.id.chipsDragLayer)).setDate(calendarDate);
        m111828d();
    }

    /* renamed from: a */
    private final void m111827a(Context context) {
        this.f75339h.mo108518a(this, LayoutInflater.from(context).inflate(R.layout.page_arrange_look_events, this));
        OverScrollView overScrollView = (OverScrollView) mo108809a(R.id.lookScrollView);
        Intrinsics.checkExpressionValueIsNotNull(overScrollView, "lookScrollView");
        overScrollView.setOverScrollMode(2);
        C30177c cVar = new C30177c(this);
        C30176b bVar = new C30176b(this);
        ((EventChipsDragLayer) mo108809a(R.id.chipsDragLayer)).setEventOnSelected(cVar);
        ((EventChipsDragLayer) mo108809a(R.id.chipsDragLayer)).setEventDrag(bVar);
        ((EventChipsDragLayer) mo108809a(R.id.chipsDragLayer)).setDragger(this.f75338g);
        ((EventChipsDragLayer) mo108809a(R.id.chipsDragLayer)).setEventChipsLayer((EventChipsViewLayer) mo108809a(R.id.chipsLayer));
        ((EventChipsDragLayer) mo108809a(R.id.chipsDragLayer)).setViewDependency(this.f75339h);
        ((EventChipsDragLayer) mo108809a(R.id.chipsDragLayer)).setDate(this.f75333a);
        ((EventChipsDragLayer) mo108809a(R.id.chipsDragLayer)).setAppendDragType(2);
        ((CurrentTimeLine) mo108809a(R.id.currentTimeLine)).mo108727a(this.f75333a);
        ((EventChipsViewLayer) mo108809a(R.id.chipsLayer)).setDragger(this.f75338g);
        ((EventChipsViewLayer) mo108809a(R.id.chipsLayer)).setViewDependency(this.f75339h);
        ((TimeBarLine) mo108809a(R.id.timeLineLayer)).setNumDays(1);
        m111828d();
    }

    /* renamed from: a */
    public final void mo108811a(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "timeStamp");
        C30167c cVar = this.f75341j;
        if (cVar != null) {
            int hour = (calendarDate.getHour() * 60) + calendarDate.getMinute();
            int i = cVar.mo108774a(0, hour, hour + 60).top;
            TimeBarLine timeBarLine = (TimeBarLine) mo108809a(R.id.timeLineLayer);
            Intrinsics.checkExpressionValueIsNotNull(timeBarLine, "timeLineLayer");
            m111826a(i - (((int) timeBarLine.getTextBaseLine()) + (getHeight() / 4)), false);
        }
    }

    /* renamed from: a */
    public final void mo108812a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        if (!TextUtils.isEmpty(str)) {
            TimeZone timeZone = TimeZone.getTimeZone(str);
            this.f75337f = new CalendarDate(timeZone);
            ((CurrentTimeLine) mo108809a(R.id.currentTimeLine)).mo108728a(str);
            this.f75333a = new CalendarDate(this.f75333a, timeZone);
            m111828d();
        }
    }

    /* renamed from: a */
    private final void m111826a(int i, boolean z) {
        OverScrollView overScrollView = (OverScrollView) mo108809a(R.id.lookScrollView);
        Intrinsics.checkExpressionValueIsNotNull(overScrollView, "lookScrollView");
        int topOverScrollDistance = i - overScrollView.getTopOverScrollDistance();
        OverScrollView overScrollView2 = (OverScrollView) mo108809a(R.id.lookScrollView);
        Intrinsics.checkExpressionValueIsNotNull(overScrollView2, "lookScrollView");
        int max = Math.max(topOverScrollDistance, -overScrollView2.getTopOverScrollDistance());
        OverScrollView overScrollView3 = (OverScrollView) mo108809a(R.id.lookScrollView);
        Intrinsics.checkExpressionValueIsNotNull(overScrollView3, "lookScrollView");
        if (overScrollView3.getHeight() <= 0) {
            OverScrollView overScrollView4 = (OverScrollView) mo108809a(R.id.lookScrollView);
            Intrinsics.checkExpressionValueIsNotNull(overScrollView4, "lookScrollView");
            ViewTreeObserver viewTreeObserver = overScrollView4.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC30178d(this, viewTreeObserver, z, max));
        } else if (z) {
            ((OverScrollView) mo108809a(R.id.lookScrollView)).smoothScrollTo(0, max);
        } else {
            ((OverScrollView) mo108809a(R.id.lookScrollView)).mo113347a(0, max);
        }
    }

    /* renamed from: a */
    private final void m111825a(int i, int i2) {
        C30167c.C30168a aVar = new C30167c.C30168a();
        C30167c a = aVar.mo108787g(1).mo108782b(i2).mo108780a(i).mo108786f(UIUtils.dp2px(getContext(), 0.5f)).mo108785e(UIUtils.dp2px(getContext(), 5.0f)).mo108783c(UIUtils.dp2px(getContext(), 56.0f)).mo108784d(UIUtils.dp2px(getContext(), 7.0f)).mo108788h(UIUtils.dp2px(getContext(), 50.0f)).mo108789i(UIUtils.dp2px(getContext(), 1.0f)).mo108781a();
        this.f75341j = a;
        ((EventChipsDragLayer) mo108809a(R.id.chipsDragLayer)).setEventChipsGridLine(a);
        ((TimeBarLine) mo108809a(R.id.timeLineLayer)).setEventChipsGridLine(a);
        ((CurrentTimeLine) mo108809a(R.id.currentTimeLine)).setEventChipsGridLine(a);
        ((EventChipsViewLayer) mo108809a(R.id.chipsLayer)).setEventChipsGridLine(aVar.mo108787g(this.f75342k).mo108781a());
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m111825a(i, i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LookPageView(Context context, C26213k kVar, CalendarDate calendarDate, ILookContract.OnEventDrag cVar, ILookContract.ViewDependency eVar, int i) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(kVar, "dragger");
        Intrinsics.checkParameterIsNotNull(calendarDate, "date");
        Intrinsics.checkParameterIsNotNull(cVar, "onEventPageDrag");
        Intrinsics.checkParameterIsNotNull(eVar, "viewDependency");
        this.f75338g = kVar;
        this.f75339h = eVar;
        this.f75334b = cVar;
        this.f75342k = i;
        CalendarDate calendarDate2 = new CalendarDate(calendarDate);
        this.f75333a = calendarDate2;
        calendarDate2.setSecond(0);
        m111827a(context);
    }
}
