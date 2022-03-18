package com.ss.android.lark.calendar.impl.features.calendarview.days;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.AbstractC30173d;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30166b;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30167c;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.days.DaysLayoutParam;
import com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DayRange;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DragDrawChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.AutoScroller;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.PiecesDragger;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30773d;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30774e;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.IOnAppendTimeSelected;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30745a;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30748b;
import com.ss.android.lark.calendar.impl.features.calendarview.days.gesture.ThreeDayMotionHandler;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.AllDayChipsLayer;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.DayChipsLayer;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.TimeLinesLayer;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.ChipsBitmapPool;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layoutmanager.AllDayLayoutManager;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layoutmanager.DateWeekHeaderManager;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layoutmanager.DayLayoutManager;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layoutmanager.TimeLineLayoutManager;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layoutmanager.ViewPagerHeaderManager;
import com.ss.android.lark.calendar.impl.features.calendarview.days.widget.DateWeekView;
import com.ss.android.lark.calendar.impl.features.calendarview.days.widget.ExpandArrowView;
import com.ss.android.lark.calendar.impl.features.calendarview.days.widget.dayheader.DayWeekIndicator;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.AllDayEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneEnterView;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.ICoordinateApi;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollAnimApi;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollViewListener;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.GeneralMotionHandler;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarMainHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32670u;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ]2\u00020\u0001:\u0001]B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010V\u001a\u00020WJ\u0016\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010/\u001a\u000200X\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000200X\u0004¢\u0006\u0002\n\u0000R\u0011\u00108\u001a\u000209¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u000e\u0010<\u001a\u00020=X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010@\u001a\u00020A¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u000e\u0010D\u001a\u00020EX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010F\u001a\u00020G¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020KX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001c\u0010P\u001a\u0004\u0018\u00010QX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006^"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysViewProvider;", "", "activity", "Landroid/app/Activity;", "numDays", "", "(Landroid/app/Activity;I)V", "allDayLayers", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/AllDayChipsLayer;", "getAllDayLayers", "()[Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/AllDayChipsLayer;", "[Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/AllDayChipsLayer;", "allDayLayoutManager", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/AllDayLayoutManager;", "getAllDayLayoutManager", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/AllDayLayoutManager;", "dateWeekViews", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/DateWeekView;", "getDateWeekViews", "()[Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/DateWeekView;", "setDateWeekViews", "([Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/DateWeekView;)V", "[Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/DateWeekView;", "dayLayers", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/DayChipsLayer;", "getDayLayers", "()[Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/DayChipsLayer;", "[Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/DayChipsLayer;", "dayLayoutManager", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/DayLayoutManager;", "getDayLayoutManager", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/DayLayoutManager;", "daysLayoutParam", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam;", "getDaysLayoutParam", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam;", "daysScrollView", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "getDaysScrollView", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "headerLayoutManager", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/DateWeekHeaderManager;", "getHeaderLayoutManager", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/DateWeekHeaderManager;", "setHeaderLayoutManager", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/DateWeekHeaderManager;)V", "mAllDayChipViewPool", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/EventChipViewPool;", "mAutoScroll", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/AutoScroller;", "mCoordinateApi", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/ICoordinateApi;", "mDayChipBitmapPool", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/ChipsBitmapPool;", "mDayChipViewPool", "mDragLayer", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/draglayer/ChipsDragLayer;", "getMDragLayer", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/draglayer/ChipsDragLayer;", "mDragger", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/PiecesDragger;", "mExpandArrow", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/ExpandArrowView;", "scrollAnimApi", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/IScrollAnimApi;", "getScrollAnimApi", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/IScrollAnimApi;", "timeLineShelterLayer", "Landroid/widget/FrameLayout;", "timeLinesLayer", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/TimeLinesLayer;", "getTimeLinesLayer", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/TimeLinesLayer;", "timeZoneView", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView;", "getTimeZoneView", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView;", "setTimeZoneView", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView;)V", "weekIndicator", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/dayheader/DayWeekIndicator;", "getWeekIndicator", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/dayheader/DayWeekIndicator;", "setWeekIndicator", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/dayheader/DayWeekIndicator;)V", "clear", "", "initListener", "viewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramViewData;", "viewAction", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramViewAction;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d */
public final class DaysViewProvider {

    /* renamed from: g */
    public static final Companion f77133g = new Companion(null);

    /* renamed from: a */
    public final ExpandArrowView f77134a;

    /* renamed from: b */
    public FrameLayout f77135b;

    /* renamed from: c */
    public AutoScroller f77136c;

    /* renamed from: d */
    public final C30166b f77137d;

    /* renamed from: e */
    public final ChipsBitmapPool f77138e;

    /* renamed from: f */
    public final Activity f77139f;

    /* renamed from: h */
    private final SnapScrollView f77140h;

    /* renamed from: i */
    private final IScrollAnimApi f77141i;

    /* renamed from: j */
    private final ICoordinateApi f77142j;

    /* renamed from: k */
    private final DaysLayoutParam f77143k;

    /* renamed from: l */
    private TimeZoneEnterView f77144l;

    /* renamed from: m */
    private DateWeekHeaderManager f77145m;

    /* renamed from: n */
    private DateWeekView[] f77146n;

    /* renamed from: o */
    private DayWeekIndicator f77147o;

    /* renamed from: p */
    private final AllDayChipsLayer[] f77148p;

    /* renamed from: q */
    private final AllDayLayoutManager f77149q;

    /* renamed from: r */
    private final DayChipsLayer[] f77150r;

    /* renamed from: s */
    private final DayLayoutManager f77151s;

    /* renamed from: t */
    private final TimeLinesLayer f77152t;

    /* renamed from: u */
    private final C30745a f77153u;

    /* renamed from: v */
    private PiecesDragger f77154v;

    /* renamed from: w */
    private final C30166b f77155w;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysViewProvider$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final SnapScrollView mo111094a() {
        return this.f77140h;
    }

    /* renamed from: b */
    public final IScrollAnimApi mo111096b() {
        return this.f77141i;
    }

    /* renamed from: c */
    public final DaysLayoutParam mo111097c() {
        return this.f77143k;
    }

    /* renamed from: d */
    public final TimeZoneEnterView mo111098d() {
        return this.f77144l;
    }

    /* renamed from: e */
    public final DateWeekView[] mo111099e() {
        return this.f77146n;
    }

    /* renamed from: f */
    public final DayWeekIndicator mo111100f() {
        return this.f77147o;
    }

    /* renamed from: g */
    public final AllDayChipsLayer[] mo111101g() {
        return this.f77148p;
    }

    /* renamed from: h */
    public final AllDayLayoutManager mo111102h() {
        return this.f77149q;
    }

    /* renamed from: i */
    public final DayChipsLayer[] mo111103i() {
        return this.f77150r;
    }

    /* renamed from: j */
    public final DayLayoutManager mo111104j() {
        return this.f77151s;
    }

    /* renamed from: k */
    public final TimeLinesLayer mo111105k() {
        return this.f77152t;
    }

    /* renamed from: l */
    public final C30745a mo111106l() {
        return this.f77153u;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/DaysViewProvider$initListener$10", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/dragdrop/IOnAppendTimeSelected;", "onSelectAppendTime", "", "startTime", "", "endTime", "onSelectCancel", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$e */
    public static final class C30731e implements IOnAppendTimeSelected {

        /* renamed from: a */
        final /* synthetic */ IDaysDiagramContract.IDaysDiagramViewAction f77165a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.IOnAppendTimeSelected
        /* renamed from: a */
        public void mo111115a() {
            this.f77165a.mo111012a();
        }

        C30731e(IDaysDiagramContract.IDaysDiagramViewAction bVar) {
            this.f77165a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.IOnAppendTimeSelected
        /* renamed from: a */
        public void mo111116a(long j, long j2) {
            this.f77165a.mo111017a(j, j2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J \u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/DaysViewProvider$initListener$6", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/dragdrop/IOnEventDrag;", "onEventDragEnd", "", "onEventDragStart", "onEventHandleDragMove", "index", "", "screenX", "screenY", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$k */
    public static final class C30737k implements AbstractC30773d {

        /* renamed from: a */
        final /* synthetic */ DaysViewProvider f77173a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30773d
        /* renamed from: b */
        public void mo111122b() {
            this.f77173a.f77136c.mo111140a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30773d
        /* renamed from: a */
        public void mo111120a() {
            this.f77173a.f77136c.mo111142a(new int[]{this.f77173a.mo111097c().mo110880g(), this.f77173a.mo111097c().mo110878e(), this.f77173a.mo111094a().getWidth(), DeviceUtils.getScreenHeight(this.f77173a.f77139f) - UIHelper.dp2px(40.0f)});
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30737k(DaysViewProvider dVar) {
            this.f77173a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30773d
        /* renamed from: a */
        public void mo111121a(int i, int i2, int i3) {
            this.f77173a.f77136c.mo111141a(i2, i3);
            if (!this.f77173a.f77136c.mo111144b(i2)) {
                this.f77173a.f77136c.mo111143a(i3);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/EventChipsGridLine;", "getGridLine"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$j */
    static final class C30736j implements C30748b.AbstractC30754a {

        /* renamed from: a */
        final /* synthetic */ DaysViewProvider f77172a;

        C30736j(DaysViewProvider dVar) {
            this.f77172a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30748b.AbstractC30754a
        /* renamed from: a */
        public final C30167c mo111119a() {
            return this.f77172a.mo111097c().mo110879f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/DaysViewProvider$mAllDayChipViewPool$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/SimpleViewPool$ViewFactory;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/EventChipView;", "createView", "defaultElements", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$o */
    public static final class C30741o implements AbstractC30173d.AbstractC30174a<EventChipView> {

        /* renamed from: a */
        final /* synthetic */ DaysViewProvider f77177a;

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.AbstractC30173d.AbstractC30174a
        /* renamed from: b */
        public int mo108749b() {
            return 10;
        }

        /* renamed from: a */
        public EventChipView mo108750c() {
            return new EventChipView(this.f77177a.f77139f, 0);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30741o(DaysViewProvider dVar) {
            this.f77177a = dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/DaysViewProvider$mDayChipBitmapPool$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/ChipsBitmapPool$BitmapFactory;", "create", "Landroid/graphics/Bitmap;", "width", "", "height", "maxCount", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$p */
    public static final class C30742p implements ChipsBitmapPool.BitmapFactory {

        /* renamed from: a */
        final /* synthetic */ DaysViewProvider f77178a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.ChipsBitmapPool.BitmapFactory
        /* renamed from: a */
        public int mo111128a() {
            return this.f77178a.mo111097c().mo110884k().mo110899a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30742p(DaysViewProvider dVar) {
            this.f77178a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.ChipsBitmapPool.BitmapFactory
        /* renamed from: a */
        public Bitmap mo111129a(int i, int i2) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Intrinsics.checkExpressionValueIsNotNull(createBitmap, "Bitmap.createBitmap(widt… Bitmap.Config.ARGB_8888)");
            return createBitmap;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/DaysViewProvider$mDayChipViewPool$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/SimpleViewPool$ViewFactory;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/EventChipView;", "createView", "defaultElements", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$q */
    public static final class C30743q implements AbstractC30173d.AbstractC30174a<EventChipView> {

        /* renamed from: a */
        final /* synthetic */ DaysViewProvider f77179a;

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.AbstractC30173d.AbstractC30174a
        /* renamed from: b */
        public int mo108749b() {
            return 60;
        }

        /* renamed from: a */
        public EventChipView mo108750c() {
            return new EventChipView(this.f77179a.f77139f, 0);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30743q(DaysViewProvider dVar) {
            this.f77179a = dVar;
        }
    }

    /* renamed from: m */
    public final void mo111107m() {
        this.f77137d.mo108791a();
        this.f77155w.mo108791a();
        this.f77138e.mo111340a();
        this.f77154v.mo111201c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/DaysViewProvider$initListener$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/IScrollViewListener;", "onMeasured", "", "width", "", "height", "onScrollX", "progress", "", "onSizeChanged", "oldWidth", "oldHeight", "updateLayoutParam", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$d */
    public static final class C30729d implements IScrollViewListener {

        /* renamed from: a */
        final /* synthetic */ DaysViewProvider f77161a;

        /* renamed from: b */
        final /* synthetic */ IDaysDiagramContract.IDaysDiagramViewAction f77162b;

        /* renamed from: c */
        final /* synthetic */ IDaysDiagramContract.IDaysDiagramViewData f77163c;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$d$a */
        public static final class RunnableC30730a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C30729d f77164a;

            RunnableC30730a(C30729d dVar) {
                this.f77164a = dVar;
            }

            public final void run() {
                this.f77164a.f77161a.f77138e.mo111341a(1, this.f77164a.f77161a.mo111097c().mo110876c(), this.f77164a.f77161a.mo111097c().mo110881h());
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollViewListener
        /* renamed from: a */
        public void mo111111a(float f) {
            this.f77162b.mo111013a(f);
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollViewListener
        /* renamed from: a */
        public void mo111112a(int i, int i2) {
            if (i != 0 && i2 != 0) {
                m114473b(i, i2);
            }
        }

        /* renamed from: b */
        private final void m114473b(int i, int i2) {
            boolean z;
            if (this.f77161a.mo111097c().mo110870a() == i || this.f77161a.mo111097c().mo110870a() != 0 || i == 0) {
                z = false;
            } else {
                z = true;
            }
            this.f77161a.mo111097c().mo110872a(i, i2);
            if (z) {
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                coreThreadPool.getCachedThreadPool().submit(new RunnableC30730a(this));
            }
            this.f77161a.mo111094a().setSnapWith(this.f77161a.mo111097c().mo110876c());
            for (DayChipsLayer dayChipsLayer : this.f77161a.mo111103i()) {
                dayChipsLayer.mo111304a(this.f77161a.mo111097c().mo110876c(), this.f77161a.mo111097c().mo110881h());
            }
            for (AllDayChipsLayer allDayChipsLayer : this.f77161a.mo111101g()) {
                allDayChipsLayer.mo111282a(this.f77161a.mo111097c().mo110876c(), this.f77161a.mo111097c().mo110880g(), this.f77161a.mo111097c().mo110870a());
            }
            Pair<Integer, Integer> q = this.f77161a.mo111097c().mo110890q();
            this.f77161a.mo111094a().mo113221a(q.getFirst().intValue(), q.getSecond().intValue());
        }

        C30729d(DaysViewProvider dVar, IDaysDiagramContract.IDaysDiagramViewAction bVar, IDaysDiagramContract.IDaysDiagramViewData dVar2) {
            this.f77161a = dVar;
            this.f77162b = bVar;
            this.f77163c = dVar2;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollViewListener
        /* renamed from: a */
        public void mo111113a(int i, int i2, int i3, int i4) {
            if (i != i3 && i3 != 0) {
                m114473b(i, i2);
                this.f77161a.mo111094a().getScrollAnimApi().mo113253d(this.f77163c.mo110929i() - this.f77163c.mo110930j());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0002¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/DaysViewProvider$initListener$9", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/dragdrop/IOnEventSelected;", "onEventCancel", "", "onEventSelect", "index", "", "beginPosition", "endPosition", "orderToFront", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$n */
    public static final class C30740n implements AbstractC30774e {

        /* renamed from: a */
        final /* synthetic */ DaysViewProvider f77176a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30774e
        /* renamed from: a */
        public void mo111125a() {
            this.f77176a.mo111096b().mo113249a(false);
            this.f77176a.mo111105k().mo111336b();
            for (DayChipsLayer dayChipsLayer : this.f77176a.mo111103i()) {
                dayChipsLayer.bringToFront();
            }
            m114490b();
            this.f77176a.mo111094a().invalidate();
        }

        /* renamed from: b */
        private final void m114490b() {
            this.f77176a.f77135b.bringToFront();
            for (AllDayChipsLayer allDayChipsLayer : this.f77176a.mo111101g()) {
                allDayChipsLayer.bringToFront();
            }
            DateWeekView[] e = this.f77176a.mo111099e();
            if (e != null) {
                for (DateWeekView dateWeekView : e) {
                    dateWeekView.bringToFront();
                }
            }
            DayWeekIndicator f = this.f77176a.mo111100f();
            if (f != null) {
                f.bringToFront();
            }
            this.f77176a.mo111098d().bringToFront();
            this.f77176a.f77134a.bringToFront();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30740n(DaysViewProvider dVar) {
            this.f77176a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30774e
        /* renamed from: a */
        public void mo111126a(int i, int i2, int i3) {
            this.f77176a.mo111096b().mo113249a(true);
            this.f77176a.mo111105k().mo111334a(i2);
            this.f77176a.mo111105k().mo111337b(i3);
            this.f77176a.mo111106l().bringToFront();
            m114490b();
            this.f77176a.mo111094a().invalidate();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/DaysViewProvider$initListener$13$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/AllDayChipsLayer$ClickChipListener;", "onEventChipClick", "", "viewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/AllDayEventChipViewData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$c */
    public static final class C30728c implements AllDayChipsLayer.ClickChipListener {

        /* renamed from: a */
        final /* synthetic */ DaysViewProvider f77159a;

        /* renamed from: b */
        final /* synthetic */ IDaysDiagramContract.IDaysDiagramViewAction f77160b;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layers.AllDayChipsLayer.ClickChipListener
        /* renamed from: a */
        public void mo111110a(AllDayEventChipViewData allDayEventChipViewData) {
            Intrinsics.checkParameterIsNotNull(allDayEventChipViewData, "viewData");
            Log.m165389i("DaysViewProvider", C32673y.m125378d("onAllDayChipClick"));
            this.f77160b.mo111018a(this.f77159a.f77139f, (EventChipViewData) allDayEventChipViewData, true);
        }

        C30728c(DaysViewProvider dVar, IDaysDiagramContract.IDaysDiagramViewAction bVar) {
            this.f77159a = dVar;
            this.f77160b = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onClickAppendView"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$m */
    static final class C30739m implements C30745a.AbstractC30746a {

        /* renamed from: a */
        final /* synthetic */ IDaysDiagramContract.IDaysDiagramViewAction f77175a;

        C30739m(IDaysDiagramContract.IDaysDiagramViewAction bVar) {
            this.f77175a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30745a.AbstractC30746a
        /* renamed from: a */
        public final void mo111124a(Intent intent) {
            Log.m165389i("DaysViewProvider", C32673y.m125378d("onClickAppendView"));
            IDaysDiagramContract.IDaysDiagramViewAction bVar = this.f77175a;
            Intrinsics.checkExpressionValueIsNotNull(intent, "it");
            bVar.mo111019a(intent);
            CalendarMainHitPoint.m124364a("quick_create_event", null, null, 6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/DaysViewProvider$initListener$3$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/DayChipsLayer$ChipClickedListener;", "onEventChipClick", "", "viewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DragDrawChipViewData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$b */
    public static final class C30727b implements DayChipsLayer.ChipClickedListener {

        /* renamed from: a */
        final /* synthetic */ DaysViewProvider f77157a;

        /* renamed from: b */
        final /* synthetic */ IDaysDiagramContract.IDaysDiagramViewAction f77158b;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layers.DayChipsLayer.ChipClickedListener
        /* renamed from: a */
        public void mo111109a(DragDrawChipViewData eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "viewData");
            Log.m165389i("DaysViewProvider", C32673y.m125378d("onDayChipClick"));
            this.f77158b.mo111018a(this.f77157a.f77139f, (EventChipViewData) eVar.mo110981n(), true);
        }

        C30727b(DaysViewProvider dVar, IDaysDiagramContract.IDaysDiagramViewAction bVar) {
            this.f77157a = dVar;
            this.f77158b = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/DaysViewProvider$initListener$4", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/DayLayoutManager$IDayLayerListener;", "onLayerNeedBindData", "", "layerDay", "", "onSelectDayChanged", "leftLayerDay", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$i */
    public static final class C30735i implements DayLayoutManager.IDayLayerListener {

        /* renamed from: a */
        final /* synthetic */ DaysViewProvider f77169a;

        /* renamed from: b */
        final /* synthetic */ IDaysDiagramContract.IDaysDiagramViewAction f77170b;

        /* renamed from: c */
        final /* synthetic */ IDaysDiagramContract.IDaysDiagramViewData f77171c;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layoutmanager.DayLayoutManager.IDayLayerListener
        /* renamed from: b */
        public void mo111086b(int i) {
            int b = this.f77169a.mo111096b().mo113250b();
            Log.m165389i("DaysViewProvider", C32673y.m125378d("onLayerNeedBindData layerDay = " + i + ' ' + b));
            if (b != 3) {
                this.f77170b.mo111014a(i);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layoutmanager.DayLayoutManager.IDayLayerListener
        /* renamed from: a */
        public void mo111085a(int i) {
            boolean z;
            int b = this.f77169a.mo111096b().mo113250b();
            Log.m165389i("DaysViewProvider", C32673y.m125378d("onSelectDayChanged = " + i + ' ' + b));
            if (b == 3 || b == 2) {
                z = true;
            } else {
                z = false;
            }
            if (b != 1) {
                this.f77170b.mo111016a(i, z);
            }
            if (b == 0) {
                DayWeekIndicator f = this.f77169a.mo111100f();
                if (f != null) {
                    f.setCurrentDay(this.f77171c.mo110930j());
                }
                DayWeekIndicator f2 = this.f77169a.mo111100f();
                if (f2 != null) {
                    f2.setSelectedDay(this.f77171c.mo110929i());
                }
            }
            CalendarDate calendarDate = new CalendarDate();
            calendarDate.setJulianDay(i);
            this.f77169a.mo111098d().mo112458a(calendarDate.getTimeInMilliSeconds());
        }

        C30735i(DaysViewProvider dVar, IDaysDiagramContract.IDaysDiagramViewAction bVar, IDaysDiagramContract.IDaysDiagramViewData dVar2) {
            this.f77169a = dVar;
            this.f77170b = bVar;
            this.f77171c = dVar2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/DaysViewProvider$initListener$12", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/AllDayLayoutManager$IAllDayLayerListener;", "onHeightChanged", "", "allDayHeight", "", "onLayerNeedBindData", "startDay", "endDay", "onRefreshLayout", "pageDayRange", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DayRange;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$g */
    public static final class C30733g implements AllDayLayoutManager.IAllDayLayerListener {

        /* renamed from: a */
        final /* synthetic */ DaysViewProvider f77167a;

        /* renamed from: b */
        final /* synthetic */ IDaysDiagramContract.IDaysDiagramViewAction f77168b;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layoutmanager.AllDayLayoutManager.IAllDayLayerListener
        /* renamed from: a */
        public void mo111068a(int i) {
            Log.m165389i("DaysViewProvider", C32673y.m125378d("onHeightChanged " + i));
            this.f77167a.mo111097c().mo110875b(i);
            Pair<Integer, Integer> q = this.f77167a.mo111097c().mo110890q();
            this.f77167a.mo111094a().mo113221a(q.getFirst().intValue(), q.getSecond().intValue());
            this.f77167a.mo111096b().mo113252c(0);
            this.f77167a.mo111094a().requestLayout();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layoutmanager.AllDayLayoutManager.IAllDayLayerListener
        /* renamed from: a */
        public void mo111070a(List<DayRange> list) {
            Intrinsics.checkParameterIsNotNull(list, "pageDayRange");
            Log.m165389i("DaysViewProvider", C32673y.m125378d("onRefreshLayout " + list.size()));
            LaunchPerfMonitor.m124430d("show_grid");
            this.f77168b.mo111021a(list);
        }

        C30733g(DaysViewProvider dVar, IDaysDiagramContract.IDaysDiagramViewAction bVar) {
            this.f77167a = dVar;
            this.f77168b = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layoutmanager.AllDayLayoutManager.IAllDayLayerListener
        /* renamed from: a */
        public void mo111069a(int i, int i2) {
            int b = this.f77167a.mo111096b().mo113250b();
            Log.m165389i("DaysViewProvider", C32673y.m125378d("onLayerNeedBindData " + i + ' ' + i2 + ' ' + b));
            if (b != 3) {
                this.f77168b.mo111015a(i, i2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$f */
    static final class View$OnTouchListenerC30732f implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ DaysViewProvider f77166a;

        View$OnTouchListenerC30732f(DaysViewProvider dVar) {
            this.f77166a = dVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f77166a.mo111106l().mo111147a();
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "afterDay", "", "<anonymous parameter 1>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$h */
    static final class C30734h extends Lambda implements Function2<Integer, Boolean, Unit> {
        final /* synthetic */ IDaysDiagramContract.IDaysDiagramViewAction $viewAction;
        final /* synthetic */ IDaysDiagramContract.IDaysDiagramViewData $viewData;
        final /* synthetic */ DaysViewProvider this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30734h(DaysViewProvider dVar, IDaysDiagramContract.IDaysDiagramViewAction bVar, IDaysDiagramContract.IDaysDiagramViewData dVar2) {
            super(2);
            this.this$0 = dVar;
            this.$viewAction = bVar;
            this.$viewData = dVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Integer num, Boolean bool) {
            invoke(num.intValue(), bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i, boolean z) {
            Log.m165389i("DaysViewProvider", C32673y.m125378d("onMoveToPage " + i));
            this.this$0.mo111106l().mo111147a();
            this.$viewAction.mo111016a(i, false);
            this.this$0.mo111096b().mo113247a(i - this.$viewData.mo110930j(), 1);
        }
    }

    /* renamed from: a */
    public final void mo111095a(IDaysDiagramContract.IDaysDiagramViewData dVar, IDaysDiagramContract.IDaysDiagramViewAction bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "viewData");
        Intrinsics.checkParameterIsNotNull(bVar, "viewAction");
        this.f77140h.setScrollListener(new C30729d(this, bVar, dVar));
        if (this.f77143k.mo110885l() == DaysLayoutParam.HeaderType.DATE_PAGER) {
            DayWeekIndicator dayWeekIndicator = this.f77147o;
            if (dayWeekIndicator != null) {
                CalendarSetting.DayOfWeek b = dVar.mo110921a().mo5927b();
                if (b == null) {
                    b = CalendarSetting.DayOfWeek.MONDAY;
                }
                dayWeekIndicator.setFirstDayOfWeek(b);
            }
            DayWeekIndicator dayWeekIndicator2 = this.f77147o;
            if (dayWeekIndicator2 != null) {
                dayWeekIndicator2.setShowLunarDay(Intrinsics.areEqual((Object) dVar.mo110922b().mo5927b(), (Object) true));
            }
            DayWeekIndicator dayWeekIndicator3 = this.f77147o;
            if (dayWeekIndicator3 != null) {
                dayWeekIndicator3.setDateChangeListener(new C30734h(this, bVar, dVar));
            }
            DayWeekIndicator dayWeekIndicator4 = this.f77147o;
            if (dayWeekIndicator4 != null) {
                dayWeekIndicator4.setCurrentDay(dVar.mo110930j());
            }
            DayWeekIndicator dayWeekIndicator5 = this.f77147o;
            if (dayWeekIndicator5 != null) {
                dayWeekIndicator5.setSelectedDay(dVar.mo110929i());
            }
        }
        for (DayChipsLayer dayChipsLayer : this.f77150r) {
            dayChipsLayer.setClickListener(new C30727b(this, bVar));
        }
        this.f77151s.mo111080a(new C30735i(this, bVar, dVar));
        this.f77153u.setLayoutComputer(new C30736j(this));
        this.f77153u.setEventDrag(new C30737k(this));
        this.f77153u.setOnSaveEventInstance(new C30738l(bVar));
        this.f77153u.setClickAppendViewListener(new C30739m(bVar));
        this.f77153u.setDragger(this.f77154v);
        this.f77153u.setEventOnSelected(new C30740n(this));
        this.f77153u.setAppendOnSelected(new C30731e(bVar));
        this.f77135b.setOnTouchListener(new View$OnTouchListenerC30732f(this));
        this.f77149q.mo111057a(new C30733g(this, bVar));
        for (AllDayChipsLayer allDayChipsLayer : this.f77148p) {
            allDayChipsLayer.setClickChipListener(new C30728c(this, bVar));
        }
        this.f77149q.mo111060a(dVar.mo110921a().mo5927b());
    }

    public DaysViewProvider(Activity activity, int i) {
        GeneralMotionHandler bVar;
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f77139f = activity;
        SnapScrollView snapScrollView = new SnapScrollView(activity, null, 0, 6, null);
        this.f77140h = snapScrollView;
        IScrollAnimApi scrollAnimApi = snapScrollView.getScrollAnimApi();
        this.f77141i = scrollAnimApi;
        ICoordinateApi coordinateApi = snapScrollView.getCoordinateApi();
        this.f77142j = coordinateApi;
        DaysLayoutParam daysLayoutParam = new DaysLayoutParam(i);
        this.f77143k = daysLayoutParam;
        View a = C32670u.m125364a(activity, R.layout.view_enter_time_zone, snapScrollView, false);
        if (a != null) {
            this.f77144l = (TimeZoneEnterView) a;
            this.f77149q = new AllDayLayoutManager(snapScrollView, daysLayoutParam);
            DayLayoutManager cVar = new DayLayoutManager(snapScrollView, daysLayoutParam);
            this.f77151s = cVar;
            TimeLinesLayer aVar = new TimeLinesLayer(i, daysLayoutParam);
            this.f77152t = aVar;
            C30745a aVar2 = new C30745a(activity);
            this.f77153u = aVar2;
            this.f77136c = new AutoScroller(coordinateApi, scrollAnimApi);
            this.f77155w = new C30166b(new C30741o(this));
            this.f77137d = new C30166b(new C30743q(this));
            this.f77138e = new ChipsBitmapPool(new C30742p(this));
            snapScrollView.setBackgroundColor(C57582a.m223616d(activity, R.color.cal_day_view_bg));
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().submit(new Runnable(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.days.DaysViewProvider.RunnableC307261 */

                /* renamed from: a */
                final /* synthetic */ DaysViewProvider f77156a;

                {
                    this.f77156a = r1;
                }

                public final void run() {
                    this.f77156a.f77137d.mo108792a(30);
                }
            });
            if (i != 1) {
                bVar = new ThreeDayMotionHandler(activity, coordinateApi);
            } else {
                bVar = new GeneralMotionHandler(activity, coordinateApi);
            }
            snapScrollView.setMotionHandler(bVar);
            TimeLineLayoutManager dVar = new TimeLineLayoutManager(snapScrollView, daysLayoutParam);
            dVar.mo111089a(aVar);
            snapScrollView.mo113224a(dVar);
            cVar.mo111081a(aVar2);
            Window window = activity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
            this.f77154v = new PiecesDragger(window);
            int a2 = daysLayoutParam.mo110884k().mo110899a();
            DayChipsLayer[] dayChipsLayerArr = new DayChipsLayer[a2];
            for (int i2 = 0; i2 < a2; i2++) {
                DayChipsLayer dayChipsLayer = new DayChipsLayer(this.f77139f, null, 0, 6, null);
                dayChipsLayer.setDragger(this.f77154v);
                dayChipsLayer.setChipPool(this.f77137d);
                dayChipsLayer.setBitmapPool(this.f77138e);
                dayChipsLayerArr[i2] = dayChipsLayer;
            }
            this.f77150r = dayChipsLayerArr;
            this.f77151s.mo111083a(dayChipsLayerArr);
            this.f77140h.mo113224a(this.f77151s);
            FrameLayout frameLayout = new FrameLayout(this.f77139f);
            this.f77135b = frameLayout;
            dVar.mo111088a(frameLayout);
            int a3 = this.f77143k.mo110883j().mo110891a();
            AllDayChipsLayer[] allDayChipsLayerArr = new AllDayChipsLayer[a3];
            for (int i3 = 0; i3 < a3; i3++) {
                AllDayChipsLayer allDayChipsLayer = new AllDayChipsLayer(this.f77139f, null, 0, 6, null);
                allDayChipsLayer.setChipViewPool(this.f77155w);
                allDayChipsLayerArr[i3] = allDayChipsLayer;
            }
            this.f77148p = allDayChipsLayerArr;
            this.f77149q.mo111062a(allDayChipsLayerArr);
            ExpandArrowView expandArrowView = new ExpandArrowView(this.f77139f, null, 0, 6, null);
            this.f77134a = expandArrowView;
            this.f77149q.mo111059a(expandArrowView);
            this.f77140h.mo113224a(this.f77149q);
            if (this.f77143k.mo110885l() == DaysLayoutParam.HeaderType.DATE_PAGER) {
                this.f77147o = new DayWeekIndicator(this.f77139f, null, 0, 6, null);
                ViewPagerHeaderManager eVar = new ViewPagerHeaderManager(this.f77140h, this.f77143k);
                eVar.mo111091a(this.f77147o);
                eVar.mo111092a(this.f77144l);
                DayWeekIndicator dayWeekIndicator = this.f77147o;
                if (dayWeekIndicator != null) {
                    dayWeekIndicator.setBackgroundColor(C32634ae.m125178a(R.color.bg_body));
                }
                this.f77140h.mo113224a(eVar);
            } else {
                int a4 = this.f77143k.mo110882i().mo110899a();
                DateWeekView[] dateWeekViewArr = new DateWeekView[a4];
                for (int i4 = 0; i4 < a4; i4++) {
                    dateWeekViewArr[i4] = new DateWeekView(this.f77139f, null, 0, 6, null);
                }
                this.f77146n = dateWeekViewArr;
                DateWeekHeaderManager bVar2 = new DateWeekHeaderManager(this.f77140h, this.f77143k);
                bVar2.mo111078a(this.f77146n);
                bVar2.mo111077a(this.f77144l);
                this.f77140h.mo113224a(bVar2);
                this.f77145m = bVar2;
            }
            this.f77144l.bringToFront();
            this.f77143k.mo110875b(this.f77149q.mo111051a());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneEnterView");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "kotlin.jvm.PlatformType", "startTime", "", "endTime", "onSaveNoRepeatEvent"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d$l */
    static final class C30738l implements C30745a.AbstractC30747b {

        /* renamed from: a */
        final /* synthetic */ IDaysDiagramContract.IDaysDiagramViewAction f77174a;

        C30738l(IDaysDiagramContract.IDaysDiagramViewAction bVar) {
            this.f77174a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30745a.AbstractC30747b
        /* renamed from: a */
        public final void mo111123a(CalendarEventInstance calendarEventInstance, long j, long j2) {
            if (calendarEventInstance != null) {
                Log.m165389i("DaysViewProvider", C32673y.m125378d("onSaveEventInstance"));
                this.f77174a.mo111020a(calendarEventInstance, j, j2);
            }
        }
    }
}
