package com.ss.android.lark.calendar.impl.features.arrange.arrangelook;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerAdapter;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.ui.dragger.C26213k;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.AttendeeInfoView;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.LookFooterMessageView;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.LookPageView;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.LookViewAdapter;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.LookViewPager;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.model.WorkHourUnit;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TimeBarLine;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TouchListenerLinearLayout;
import com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.ISelectTimeZoneChangeListener;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneEnterView;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31111g;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.C31112h;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.C31115j;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.SerialLoadingDialog;
import com.ss.android.lark.calendar.impl.features.common.widget.guide.CalendarGuideManager;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.ParamStoreData;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.ProfileFreeBusyHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSpan;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ$\u0010&\u001a\u00020'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010)\u001a\u00020\"H\u0016J \u0010*\u001a\u00020'2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020,0\rj\b\u0012\u0004\u0012\u00020,`-H\u0016JJ\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020028\u00101\u001a4\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\r02j\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002030\rj\b\u0012\u0004\u0012\u000203`-`4H\u0016JR\u00105\u001a\u00020'2\u0006\u0010/\u001a\u0002002\u0006\u00106\u001a\u00020\u000b28\u00101\u001a4\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\r02j\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002030\rj\b\u0012\u0004\u0012\u000203`-`4H\u0016J\u0010\u00107\u001a\u00020'2\u0006\u00108\u001a\u00020\u0010H\u0002J\b\u00109\u001a\u00020'H\u0016Jr\u0010:\u001a\u00020'2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<2.\u0010>\u001a*\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\r02j\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\r`42\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0002J\b\u0010?\u001a\u00020'H\u0016J\b\u0010@\u001a\u000200H\u0016J\b\u0010A\u001a\u000200H\u0016J\b\u0010B\u001a\u000200H\u0016J \u0010C\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u00102\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020FH\u0002J\b\u0010H\u001a\u00020'H\u0016J\b\u0010I\u001a\u00020'H\u0016J\b\u0010J\u001a\u00020'H\u0002J\b\u0010K\u001a\u00020'H\u0002J\b\u0010L\u001a\u00020'H\u0002J \u0010M\u001a\u00020\u00152\u0006\u0010N\u001a\u0002032\u0006\u0010O\u001a\u00020<2\u0006\u0010P\u001a\u00020<H\u0002J\u0010\u0010Q\u001a\u00020'2\u0006\u0010/\u001a\u000200H\u0016J\b\u0010R\u001a\u00020'H\u0016J\u0010\u0010S\u001a\u00020'2\u0006\u0010T\u001a\u00020\u001fH\u0016J\b\u0010U\u001a\u00020'H\u0016J\b\u0010V\u001a\u00020'H\u0002J8\u0010W\u001a\u00020'2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020%0\n2\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010)\u001a\u00020\"H\u0016R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n #*\u0004\u0018\u00010\"0\"X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020%0\nX\u000e¢\u0006\u0002\n\u0000¨\u0006Z"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookView;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookView;", "rootView", "Landroid/view/View;", "dragger", "Lcom/larksuite/framework/ui/dragger/Dragger;", "viewDependency", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ViewDependency;", "(Landroid/view/View;Lcom/larksuite/framework/ui/dragger/Dragger;Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ViewDependency;)V", "mAttendeeTimezoneMap", "", "", "mBothConflictList", "Ljava/util/ArrayList;", "mBusyList", "mCenterPageDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "mContext", "Landroid/content/Context;", "mDragger", "mIsFirstEnter", "", "mLoadingToast", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/SerialLoadingDialog;", "mOutWorkHourList", "mPageViewAdapter", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookViewAdapter;", "mRootView", "mScrollChangeObserver", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/ScrollChangeObserver;", "mViewDelegate", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookView$ViewDelegate;", "mViewDependency", "mViewTimeZone", "Ljava/util/TimeZone;", "kotlin.jvm.PlatformType", "mWorkHourMap", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSetting;", "bindAttendeeTimeZone", "", "attendeeTimeZone", "viewTimeZone", "bindAttendeesInfo", "attendeeList", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "Lkotlin/collections/ArrayList;", "bindEventChipView", "page", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookPageView;", "chipViewData", "Ljava/util/HashMap;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "Lkotlin/collections/HashMap;", "bindMtRoomEventChipView", "mtRoomCalendarId", "bindTitleDate", "selectDate", "create", "createAttendeeConflictList", "startTime", "", "endTime", "eventChipViewDataMap", "destroy", "getCenterPage", "getLeftPage", "getRightPage", "hasOutWorkHour", "startDate", "startMinute", "", "endMinute", "hideAttendeeInfo", "hideAttendeeTip", "initArrangeMonthView", "initAttendeeChipContainer", "initEventViewPager", "isBusyWithEventChip", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "correctStartTime", "correctEndTime", "loadEventError", "refreshTimeFormat", "setViewDelegate", "viewDelegate", "showLoadingToast", "showTimeZoneByFg", "showWorkHourShadow", "workHourMap", "timeZoneMap", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.d */
public final class LookView implements ILookContract.ILookView {

    /* renamed from: a */
    public final View f75089a;

    /* renamed from: b */
    public boolean f75090b = true;

    /* renamed from: c */
    public CalendarDate f75091c = new CalendarDate();

    /* renamed from: d */
    public final ILookContract.ViewDependency f75092d;

    /* renamed from: e */
    public final C31112h f75093e;

    /* renamed from: f */
    public SerialLoadingDialog f75094f;

    /* renamed from: g */
    public ILookContract.ILookView.ViewDelegate f75095g;

    /* renamed from: h */
    public LookViewAdapter f75096h;

    /* renamed from: i */
    public ArrayList<String> f75097i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<String> f75098j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<String> f75099k = new ArrayList<>();

    /* renamed from: l */
    public TimeZone f75100l = TimeZone.getDefault();

    /* renamed from: m */
    private final Context f75101m;

    /* renamed from: n */
    private final C26213k f75102n;

    /* renamed from: o */
    private Map<String, CalendarWorkHourSetting> f75103o = new HashMap();

    /* renamed from: p */
    private Map<String, String> f75104p = new HashMap();

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView
    /* renamed from: a */
    public void mo108536a(ArrayList<AbstractC30095b> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "attendeeList");
        ((AttendeeInfoView) this.f75089a.findViewById(R.id.attendeeContainer)).mo108799a(arrayList);
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView
    /* renamed from: a */
    public void mo108538a(Map<String, String> map, TimeZone timeZone) {
        Intrinsics.checkParameterIsNotNull(map, "attendeeTimeZone");
        Intrinsics.checkParameterIsNotNull(timeZone, "viewTimeZone");
        ((AttendeeInfoView) this.f75089a.findViewById(R.id.attendeeContainer)).mo108801a(map);
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView
    /* renamed from: a */
    public void mo108537a(Map<String, CalendarWorkHourSetting> map, Map<String, String> map2, TimeZone timeZone) {
        Intrinsics.checkParameterIsNotNull(map, "workHourMap");
        Intrinsics.checkParameterIsNotNull(map2, "timeZoneMap");
        Intrinsics.checkParameterIsNotNull(timeZone, "viewTimeZone");
        this.f75103o = map;
        this.f75104p = map2;
        ((LookViewPager) this.f75089a.findViewById(R.id.lookEventViewPager)).post(new RunnableC30121j(this, map, map2, timeZone));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookView$initEventViewPager$pageChangeListener$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/SimpleOnViewPagerChange;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookPageView;", "afterPageRotateChange", "", "rotateOperation", "", "willMoveToCenterPage", "willMoveToFollowingPage", "from", "to", "willMoveToPreviousPage", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.d$f */
    public static final class C30117f extends C31115j<LookPageView> {

        /* renamed from: a */
        final /* synthetic */ LookView f75117a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.C31115j, com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f
        /* renamed from: a */
        public void mo108576a() {
            LookView.m111488a(this.f75117a).mo108549d();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30117f(LookView dVar) {
            this.f75117a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.C31115j, com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f
        /* renamed from: a */
        public void mo108577a(int i) {
            this.f75117a.f75094f.dismiss();
            ((TimeZoneEnterView) this.f75117a.f75089a.findViewById(R.id.timeZoneEnterview)).setShowSelectedToast(true);
            LookView.m111491b(this.f75117a).mo108830b().getEventChipsDragLayer().mo108590b();
            if (i == 0) {
                GeneralHitPoint.m124209a("free_busy_viewer", "next", "");
                LookView dVar = this.f75117a;
                CalendarDate addDay = dVar.f75091c.addDay(1);
                Intrinsics.checkExpressionValueIsNotNull(addDay, "mCenterPageDate.addDay(1)");
                dVar.f75091c = addDay;
                LookView dVar2 = this.f75117a;
                dVar2.mo108568a(dVar2.f75091c);
                LookView.m111491b(this.f75117a).mo108827a(this.f75117a.f75091c);
                LookView.m111488a(this.f75117a).mo108547b();
                ((TitleTimeBar) this.f75117a.f75089a.findViewById(R.id.titleBar)).setSelectDate(new CalendarDate(this.f75117a.f75091c));
            } else if (i == 1) {
                GeneralHitPoint.m124209a("free_busy_viewer", "prev", "");
                LookView dVar3 = this.f75117a;
                CalendarDate addDay2 = dVar3.f75091c.addDay(-1);
                Intrinsics.checkExpressionValueIsNotNull(addDay2, "mCenterPageDate.addDay(-1)");
                dVar3.f75091c = addDay2;
                LookView dVar4 = this.f75117a;
                dVar4.mo108568a(dVar4.f75091c);
                LookView.m111491b(this.f75117a).mo108827a(this.f75117a.f75091c);
                LookView.m111488a(this.f75117a).mo108548c();
                ((TitleTimeBar) this.f75117a.f75089a.findViewById(R.id.titleBar)).setSelectDate(new CalendarDate(this.f75117a.f75091c));
            }
            if (LookView.m111488a(this.f75117a).mo108551f()) {
                ProfileFreeBusyHitPoint.m124403a("day_change");
            }
        }

        /* renamed from: b */
        public void mo108582b(LookPageView aVar, LookPageView aVar2) {
            Intrinsics.checkParameterIsNotNull(aVar, "from");
            Intrinsics.checkParameterIsNotNull(aVar2, "to");
            aVar.getEventChipsDragLayer().mo108589a(aVar2.getEventChipsDragLayer());
        }

        /* renamed from: a */
        public void mo108579a(LookPageView aVar, LookPageView aVar2) {
            Intrinsics.checkParameterIsNotNull(aVar, "from");
            Intrinsics.checkParameterIsNotNull(aVar2, "to");
            aVar.getEventChipsDragLayer().mo108589a(aVar2.getEventChipsDragLayer());
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView
    /* renamed from: c */
    public LookPageView mo108540c() {
        LookViewAdapter bVar = this.f75096h;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViewAdapter");
        }
        return bVar.mo108832c();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView
    /* renamed from: d */
    public LookPageView mo108541d() {
        LookViewAdapter bVar = this.f75096h;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViewAdapter");
        }
        return bVar.mo108830b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.d$a */
    static final class RunnableC30110a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LookView f75105a;

        /* renamed from: b */
        final /* synthetic */ LookPageView f75106b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f75107c;

        RunnableC30110a(LookView dVar, LookPageView aVar, ArrayList arrayList) {
            this.f75105a = dVar;
            this.f75106b = aVar;
            this.f75107c = arrayList;
        }

        public final void run() {
            this.f75106b.getEventChipsLayer().mo108741a(this.f75107c);
            this.f75106b.getEventChipsLayer().post(new Runnable(this) {
                /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.LookView.RunnableC30110a.RunnableC301111 */

                /* renamed from: a */
                final /* synthetic */ RunnableC30110a f75108a;

                {
                    this.f75108a = r1;
                }

                public final void run() {
                    this.f75108a.f75106b.getEventChipsLayer().mo108742b(this.f75108a.f75107c);
                    if (this.f75108a.f75105a.f75091c.sameDay(this.f75108a.f75106b.getDate())) {
                        if (this.f75108a.f75105a.f75090b) {
                            LookView.m111491b(this.f75108a.f75105a).mo108830b().mo108811a(this.f75108a.f75105a.f75091c);
                            this.f75108a.f75105a.f75090b = false;
                            CalendarPerfMonitor.m124413a("key_freebusy_view");
                        }
                        this.f75108a.f75105a.f75094f.dismiss();
                        ((TimeZoneEnterView) this.f75108a.f75105a.f75089a.findViewById(R.id.timeZoneEnterview)).setShowSelectedToast(true);
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.d$b */
    static final class RunnableC30112b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LookView f75109a;

        /* renamed from: b */
        final /* synthetic */ LookPageView f75110b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f75111c;

        RunnableC30112b(LookView dVar, LookPageView aVar, ArrayList arrayList) {
            this.f75109a = dVar;
            this.f75110b = aVar;
            this.f75111c = arrayList;
        }

        public final void run() {
            this.f75110b.getEventChipsLayer().mo108741a(this.f75111c);
            this.f75110b.getEventChipsLayer().post(new Runnable(this) {
                /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.LookView.RunnableC30112b.RunnableC301131 */

                /* renamed from: a */
                final /* synthetic */ RunnableC30112b f75112a;

                {
                    this.f75112a = r1;
                }

                public final void run() {
                    this.f75112a.f75110b.getEventChipsLayer().mo108742b(this.f75112a.f75111c);
                    if (this.f75112a.f75109a.f75091c.sameDay(this.f75112a.f75110b.getDate())) {
                        if (this.f75112a.f75109a.f75090b) {
                            LookView.m111491b(this.f75112a.f75109a).mo108830b().mo108811a(this.f75112a.f75109a.f75091c);
                            this.f75112a.f75109a.f75090b = false;
                            CalendarPerfMonitor.m124413a("key_freebusy_view");
                        }
                        this.f75112a.f75109a.f75094f.dismiss();
                    }
                }
            });
        }
    }

    /* renamed from: j */
    private final void m111494j() {
        ((TouchListenerLinearLayout) this.f75089a.findViewById(R.id.attendeeChipContainer)).setTouchListener(new C30116e(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView
    /* renamed from: a */
    public void mo108532a() {
        ((TimeZoneEnterView) this.f75089a.findViewById(R.id.timeZoneEnterview)).setShowSelectedToast(false);
        this.f75094f.mo112585a(R.string.Calendar_Edit_FindTimeLoading);
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView
    /* renamed from: b */
    public LookPageView mo108539b() {
        LookViewAdapter bVar = this.f75096h;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViewAdapter");
        }
        return bVar.mo108834d();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView
    /* renamed from: f */
    public void mo108543f() {
        LinearLayout linearLayout = (LinearLayout) this.f75089a.findViewById(R.id.attendeeInfoContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mRootView.attendeeInfoContainer");
        linearLayout.setVisibility(8);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        ((TimeZoneEnterView) this.f75089a.findViewById(R.id.timeZoneEnterview)).setShowSelectedToast(false);
        this.f75094f.mo112585a(R.string.Calendar_Edit_FindTimeLoading);
        m111493i();
        m111495k();
        m111494j();
        m111492h();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView
    /* renamed from: g */
    public void mo108544g() {
        LookFooterMessageView lookFooterMessageView = (LookFooterMessageView) this.f75089a.findViewById(R.id.lookFooterMessageView);
        Intrinsics.checkExpressionValueIsNotNull(lookFooterMessageView, "mRootView.lookFooterMessageView");
        lookFooterMessageView.setVisibility(8);
        View findViewById = this.f75089a.findViewById(R.id.footerShadow);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.footerShadow");
        findViewById.setVisibility(8);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookView$initEventViewPager$timeSelectListener$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$TimeSelectedListener;", "onTimeSelectCancel", "", "onTimeSelected", "startTime", "", "endTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.d$g */
    public static final class C30118g implements ILookContract.TimeSelectedListener {

        /* renamed from: a */
        final /* synthetic */ LookView f75118a;

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.TimeSelectedListener
        /* renamed from: a */
        public void mo108552a() {
            ((AttendeeInfoView) this.f75118a.f75089a.findViewById(R.id.attendeeContainer)).mo108797a();
            ((AttendeeInfoView) this.f75118a.f75089a.findViewById(R.id.attendeeContainer)).mo108803c();
            LookFooterMessageView lookFooterMessageView = (LookFooterMessageView) this.f75118a.f75089a.findViewById(R.id.lookFooterMessageView);
            Intrinsics.checkExpressionValueIsNotNull(lookFooterMessageView, "mRootView.lookFooterMessageView");
            lookFooterMessageView.setVisibility(8);
            View findViewById = this.f75118a.f75089a.findViewById(R.id.footerShadow);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.footerShadow");
            findViewById.setVisibility(8);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30118g(LookView dVar) {
            this.f75118a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.TimeSelectedListener
        /* renamed from: a */
        public void mo108553a(long j, long j2) {
            boolean z;
            if (LookView.m111488a(this.f75118a).mo108551f()) {
                ((AttendeeInfoView) this.f75118a.f75089a.findViewById(R.id.attendeeContainer)).mo108798a(j);
                HashMap<String, ArrayList<DayEventChipViewData>> chipViewData = LookView.m111491b(this.f75118a).mo108830b().getChipViewData();
                LookView dVar = this.f75118a;
                dVar.mo108566a(j, j2, chipViewData, dVar.f75097i, this.f75118a.f75098j, this.f75118a.f75099k);
                ((AttendeeInfoView) this.f75118a.f75089a.findViewById(R.id.attendeeContainer)).mo108800a(this.f75118a.f75097i, this.f75118a.f75098j, this.f75118a.f75099k);
                if (this.f75118a.f75097i.size() == 0 && this.f75118a.f75098j.size() == 0 && this.f75118a.f75099k.size() == 0) {
                    LookFooterMessageView lookFooterMessageView = (LookFooterMessageView) this.f75118a.f75089a.findViewById(R.id.lookFooterMessageView);
                    Intrinsics.checkExpressionValueIsNotNull(lookFooterMessageView, "mRootView.lookFooterMessageView");
                    lookFooterMessageView.setVisibility(8);
                    View findViewById = this.f75118a.f75089a.findViewById(R.id.footerShadow);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.footerShadow");
                    findViewById.setVisibility(8);
                } else {
                    if (this.f75118a.f75098j.size() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f75118a.f75092d.mo108519a(z);
                    LookFooterMessageView lookFooterMessageView2 = (LookFooterMessageView) this.f75118a.f75089a.findViewById(R.id.lookFooterMessageView);
                    Intrinsics.checkExpressionValueIsNotNull(lookFooterMessageView2, "mRootView.lookFooterMessageView");
                    lookFooterMessageView2.setVisibility(0);
                    View findViewById2 = this.f75118a.f75089a.findViewById(R.id.footerShadow);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.footerShadow");
                    findViewById2.setVisibility(0);
                    ((LookFooterMessageView) this.f75118a.f75089a.findViewById(R.id.lookFooterMessageView)).mo108806a(this.f75118a.f75097i, this.f75118a.f75098j, this.f75118a.f75099k);
                }
                ParamStoreData.f83351a.mo118742a(this.f75118a.f75097i.size(), this.f75118a.f75098j.size(), this.f75118a.f75099k.size());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onFinishInflatePages"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.d$h */
    public static final class C30119h implements AbstractC31111g {

        /* renamed from: a */
        final /* synthetic */ LookView f75119a;

        C30119h(LookView dVar) {
            this.f75119a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31111g
        /* renamed from: a */
        public final void mo108584a() {
            LookView.m111488a(this.f75119a).mo108550e();
            LookView dVar = this.f75119a;
            dVar.mo108568a(dVar.f75091c);
            int count = LookView.m111491b(this.f75119a).getCount();
            for (int i = 0; i < count; i++) {
                View d = LookView.m111491b(this.f75119a).mo113215d(i);
                if (d != null) {
                    this.f75119a.f75093e.mo112681a(((LookPageView) d).getScrollView());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.LookPageView");
                }
            }
        }
    }

    /* renamed from: k */
    private final void m111495k() {
        ((TitleTimeBar) this.f75089a.findViewById(R.id.titleBar)).setDateChangeListener(new C30115d(this));
        ILookContract.ILookView.ViewDelegate aVar = this.f75095g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        if (!aVar.mo108551f()) {
            ((TitleTimeBar) this.f75089a.findViewById(R.id.titleBar)).mo109104c();
            ((TitleTimeBar) this.f75089a.findViewById(R.id.titleBar)).setMonthViewTopMargin(BitmapDescriptorFactory.HUE_RED);
            return;
        }
        ((TitleTimeBar) this.f75089a.findViewById(R.id.titleBar)).mo109103b();
        ((TitleTimeBar) this.f75089a.findViewById(R.id.titleBar)).setMonthViewTopMargin(13.0f);
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView
    /* renamed from: e */
    public void mo108542e() {
        LookViewAdapter bVar = this.f75096h;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViewAdapter");
        }
        if (bVar != null) {
            ILookContract.ILookView.ViewDelegate aVar = this.f75095g;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            aVar.mo108545a();
            LookViewAdapter bVar2 = this.f75096h;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPageViewAdapter");
            }
            bVar2.mo108830b().mo108814c();
            LookViewAdapter bVar3 = this.f75096h;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPageViewAdapter");
            }
            bVar3.mo108834d().mo108814c();
            LookViewAdapter bVar4 = this.f75096h;
            if (bVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPageViewAdapter");
            }
            bVar4.mo108832c().mo108814c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.d$j */
    static final class RunnableC30121j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LookView f75121a;

        /* renamed from: b */
        final /* synthetic */ Map f75122b;

        /* renamed from: c */
        final /* synthetic */ Map f75123c;

        /* renamed from: d */
        final /* synthetic */ TimeZone f75124d;

        RunnableC30121j(LookView dVar, Map map, Map map2, TimeZone timeZone) {
            this.f75121a = dVar;
            this.f75122b = map;
            this.f75123c = map2;
            this.f75124d = timeZone;
        }

        public final void run() {
            TimeZone timeZone;
            LookViewPager lookViewPager = (LookViewPager) this.f75121a.f75089a.findViewById(R.id.lookEventViewPager);
            Intrinsics.checkExpressionValueIsNotNull(lookViewPager, "mRootView.lookEventViewPager");
            PagerAdapter adapter = lookViewPager.getAdapter();
            if (adapter != null) {
                LookViewAdapter bVar = (LookViewAdapter) adapter;
                for (int i = 0; i <= 2; i++) {
                    LookPageView c = bVar.mo108833c(i);
                    ArrayList<WorkHourUnit> arrayList = new ArrayList<>();
                    ArrayList<String> attendeeOrder = ((AttendeeInfoView) this.f75121a.f75089a.findViewById(R.id.attendeeContainer)).getAttendeeOrder();
                    for (Map.Entry entry : this.f75122b.entrySet()) {
                        if (((CalendarWorkHourSetting) entry.getValue()).isEnable()) {
                            WorkHourUnit bVar2 = new WorkHourUnit();
                            int size = attendeeOrder.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    break;
                                } else if (attendeeOrder.get(i2).equals(entry.getKey())) {
                                    bVar2.mo108991a(i2);
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            if (TextUtils.isEmpty((CharSequence) this.f75123c.get(entry.getKey()))) {
                                timeZone = TimeZone.getDefault();
                            } else {
                                timeZone = TimeZone.getTimeZone((String) this.f75123c.get(entry.getKey()));
                            }
                            Intrinsics.checkExpressionValueIsNotNull(timeZone, "timeZone");
                            bVar2.mo108992a(CalendarWorkHourUtil.f83806b.mo120357a(c.getDate(), (CalendarWorkHourSetting) entry.getValue(), timeZone, this.f75124d));
                            arrayList.add(bVar2);
                        }
                    }
                    ((TimeBarLine) c.mo108809a(R.id.timeLineLayer)).setWorkHourList(arrayList);
                    ((TimeBarLine) c.mo108809a(R.id.timeLineLayer)).setAttendeeSize(attendeeOrder.size());
                    ((TimeBarLine) c.mo108809a(R.id.timeLineLayer)).invalidate();
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.LookViewAdapter");
        }
    }

    /* renamed from: h */
    private final void m111492h() {
        if (C30022a.f74883b.mo112695c()) {
            ((TimeZoneEnterView) this.f75089a.findViewById(R.id.timeZoneEnterview)).mo112459a(TimeZoneEnterView.Source.PROFILE_BUSY);
            ((TimeZoneEnterView) this.f75089a.findViewById(R.id.timeZoneEnterview)).setSelectTimeZoneChangeListener(new C30120i(this));
            TimeZoneEnterView timeZoneEnterView = (TimeZoneEnterView) this.f75089a.findViewById(R.id.timeZoneEnterview);
            Intrinsics.checkExpressionValueIsNotNull(timeZoneEnterView, "mRootView.timeZoneEnterview");
            timeZoneEnterView.setVisibility(0);
            CalendarGuideManager aVar = CalendarGuideManager.f78922a;
            Context context = this.f75101m;
            if (context != null) {
                aVar.mo113187a((Activity) context, ((TimeZoneEnterView) this.f75089a.findViewById(R.id.timeZoneEnterview)).getTimeZoneTextView());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        int dp2px = UIUtils.dp2px(this.f75089a.getContext(), 40.0f);
        AttendeeInfoView attendeeInfoView = (AttendeeInfoView) this.f75089a.findViewById(R.id.attendeeContainer);
        Intrinsics.checkExpressionValueIsNotNull(attendeeInfoView, "mRootView.attendeeContainer");
        ViewGroup.LayoutParams layoutParams = attendeeInfoView.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = dp2px;
            AttendeeInfoView attendeeInfoView2 = (AttendeeInfoView) this.f75089a.findViewById(R.id.attendeeContainer);
            Intrinsics.checkExpressionValueIsNotNull(attendeeInfoView2, "mRootView.attendeeContainer");
            attendeeInfoView2.setLayoutParams(layoutParams2);
            TimeZoneEnterView timeZoneEnterView2 = (TimeZoneEnterView) this.f75089a.findViewById(R.id.timeZoneEnterview);
            Intrinsics.checkExpressionValueIsNotNull(timeZoneEnterView2, "mRootView.timeZoneEnterview");
            timeZoneEnterView2.setVisibility(8);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: i */
    private final void m111493i() {
        int i;
        C30117f fVar = new C30117f(this);
        C30119h hVar = new C30119h(this);
        C30118g gVar = new C30118g(this);
        ILookContract.ILookView.ViewDelegate aVar = this.f75095g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        if (aVar.mo108551f()) {
            i = 2;
        } else {
            i = 1;
        }
        Context context = this.f75089a.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "mRootView.context");
        CalendarDate calendarDate = this.f75091c;
        C26213k kVar = this.f75102n;
        LookViewPager lookViewPager = (LookViewPager) this.f75089a.findViewById(R.id.lookEventViewPager);
        Intrinsics.checkExpressionValueIsNotNull(lookViewPager, "mRootView.lookEventViewPager");
        this.f75096h = new LookViewAdapter(context, calendarDate, kVar, lookViewPager, this.f75092d, gVar, i);
        ((LookViewPager) this.f75089a.findViewById(R.id.lookEventViewPager)).mo113204a(fVar);
        LookViewAdapter bVar = this.f75096h;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViewAdapter");
        }
        bVar.mo108829a(hVar);
        LookViewPager lookViewPager2 = (LookViewPager) this.f75089a.findViewById(R.id.lookEventViewPager);
        Intrinsics.checkExpressionValueIsNotNull(lookViewPager2, "mRootView.lookEventViewPager");
        LookViewAdapter bVar2 = this.f75096h;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViewAdapter");
        }
        lookViewPager2.setAdapter(bVar2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookView$initArrangeMonthView$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/TitleTimeBar$OnTitleChangeListener;", "onAddAttendeeClick", "", "onDateChanged", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.d$d */
    public static final class C30115d implements TitleTimeBar.OnTitleChangeListener {

        /* renamed from: a */
        final /* synthetic */ LookView f75115a;

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar.OnTitleChangeListener
        /* renamed from: a */
        public void mo108573a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30115d(LookView dVar) {
            this.f75115a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar.OnTitleChangeListener
        /* renamed from: a */
        public void mo108574a(CalendarDate calendarDate) {
            int i;
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            int dayDiff = calendarDate.dayDiff(this.f75115a.f75091c);
            if (dayDiff != 0) {
                if (dayDiff > 0) {
                    i = 2;
                } else {
                    i = 0;
                }
                this.f75115a.mo108568a(calendarDate);
                LookView.m111491b(this.f75115a).mo108828a(new CalendarDate(calendarDate, this.f75115a.f75100l), i);
                LookView.m111488a(this.f75115a).mo108545a();
                LookView.m111491b(this.f75115a).mo108826a();
                ((LookViewPager) this.f75115a.f75089a.findViewById(R.id.lookEventViewPager)).mo113203a(i, false);
                if (LookView.m111488a(this.f75115a).mo108551f()) {
                    ProfileFreeBusyHitPoint.m124403a("day_change");
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookView$initAttendeeChipContainer$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/TouchListenerLinearLayout$TouchListener;", "onTouch", "", "ev", "Landroid/view/MotionEvent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.d$e */
    public static final class C30116e implements TouchListenerLinearLayout.TouchListener {

        /* renamed from: a */
        final /* synthetic */ LookView f75116a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30116e(LookView dVar) {
            this.f75116a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TouchListenerLinearLayout.TouchListener
        /* renamed from: a */
        public void mo108575a(MotionEvent motionEvent) {
            Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
            ((TitleTimeBar) this.f75116a.f75089a.findViewById(R.id.titleBar)).mo109105d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookView$showTimeZoneByFg$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ISelectTimeZoneChangeListener;", "onTimeZoneChanged", "", "timeZoneId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.d$i */
    public static final class C30120i implements ISelectTimeZoneChangeListener {

        /* renamed from: a */
        final /* synthetic */ LookView f75120a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30120i(LookView dVar) {
            this.f75120a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ISelectTimeZoneChangeListener
        /* renamed from: a */
        public void mo108585a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
            if (!TextUtils.isEmpty(str)) {
                this.f75120a.f75100l = TimeZone.getTimeZone(str);
                LookView.m111488a(this.f75120a).mo108546a(str);
                LookView dVar = this.f75120a;
                dVar.mo108568a(new CalendarDate(dVar.f75091c));
            }
        }
    }

    /* renamed from: a */
    public void setViewDelegate(ILookContract.ILookView.ViewDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f75095g = aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ ILookContract.ILookView.ViewDelegate m111488a(LookView dVar) {
        ILookContract.ILookView.ViewDelegate aVar = dVar.f75095g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ LookViewAdapter m111491b(LookView dVar) {
        LookViewAdapter bVar = dVar.f75096h;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViewAdapter");
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "setting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.d$c */
    public static final class C30114c implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ LookView f75113a;

        /* renamed from: b */
        final /* synthetic */ CalendarDate f75114b;

        C30114c(LookView dVar, CalendarDate calendarDate) {
            this.f75113a = dVar;
            this.f75114b = calendarDate;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "setting");
            CalendarDate moveThisDateToDayEnd = new CalendarDate(this.f75114b, calendarSetting.getSafeMobileNormalViewTimezone()).moveThisDateToDayEnd();
            Intrinsics.checkExpressionValueIsNotNull(moveThisDateToDayEnd, "timeZoneDate.moveThisDateToDayEnd()");
            ((TimeZoneEnterView) this.f75113a.f75089a.findViewById(R.id.timeZoneEnterview)).mo112458a(moveThisDateToDayEnd.getTimeInMilliSeconds());
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView
    /* renamed from: a */
    public void mo108533a(LookPageView aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "page");
        if (this.f75091c.sameDay(aVar.getDate())) {
            if (this.f75090b) {
                LookViewAdapter bVar = this.f75096h;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPageViewAdapter");
                }
                bVar.mo108830b().mo108811a(this.f75091c);
                this.f75090b = false;
            }
            this.f75094f.mo112592c(R.string.Calendar_Common_FailedToLoad);
            ((TimeZoneEnterView) this.f75089a.findViewById(R.id.timeZoneEnterview)).setShowSelectedToast(true);
        }
        aVar.mo108810a();
    }

    /* renamed from: a */
    public final void mo108568a(CalendarDate calendarDate) {
        this.f75091c = calendarDate;
        calendarDate.setSecond(0);
        long timeInMilliSeconds = calendarDate.getTimeInMilliSeconds();
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String a = C32646c.m125252a(timeInMilliSeconds, timeZone.getID());
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDateTimeShowUtil…TimeZone.getDefault().id)");
        ((TitleTimeBar) this.f75089a.findViewById(R.id.titleBar)).setTitleText(a);
        C30022a.f74884c.mo108450a(new C30114c(this, calendarDate));
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView
    /* renamed from: a */
    public void mo108535a(LookPageView aVar, HashMap<String, ArrayList<DayEventChipViewData>> hashMap) {
        Intrinsics.checkParameterIsNotNull(aVar, "page");
        Intrinsics.checkParameterIsNotNull(hashMap, "chipViewData");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = ((AttendeeInfoView) this.f75089a.findViewById(R.id.attendeeContainer)).getAttendeeOrder().iterator();
        while (it.hasNext()) {
            ArrayList<DayEventChipViewData> arrayList2 = hashMap.get(it.next());
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
            }
            Intrinsics.checkExpressionValueIsNotNull(arrayList2, "chipViewData.get(calenda…t<DayEventChipViewData>()");
            arrayList.add(arrayList2);
        }
        aVar.setChipViewData(hashMap);
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC30110a(this, aVar, arrayList));
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView
    /* renamed from: a */
    public void mo108534a(LookPageView aVar, String str, HashMap<String, ArrayList<DayEventChipViewData>> hashMap) {
        Intrinsics.checkParameterIsNotNull(aVar, "page");
        Intrinsics.checkParameterIsNotNull(str, "mtRoomCalendarId");
        Intrinsics.checkParameterIsNotNull(hashMap, "chipViewData");
        ArrayList arrayList = new ArrayList();
        ArrayList<DayEventChipViewData> arrayList2 = hashMap.get(str);
        if (arrayList2 != null) {
            arrayList.add(arrayList2);
        }
        aVar.setChipViewData(hashMap);
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC30112b(this, aVar, arrayList));
    }

    public LookView(View view, C26213k kVar, ILookContract.ViewDependency eVar) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(kVar, "dragger");
        Intrinsics.checkParameterIsNotNull(eVar, "viewDependency");
        this.f75089a = view;
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "mRootView.context");
        this.f75101m = context;
        this.f75102n = kVar;
        this.f75092d = eVar;
        this.f75093e = new C31112h();
        this.f75091c.setSecond(0);
        if (context != null) {
            SerialLoadingDialog iVar = new SerialLoadingDialog((Activity) context);
            this.f75094f = iVar;
            iVar.mo112594e(SmActions.ACTION_ONTHECALL_EXIT);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: a */
    private final boolean m111490a(DayEventChipViewData dayEventChipViewData, long j, long j2) {
        long j3;
        long j4;
        if (dayEventChipViewData.isAllDay()) {
            long j5 = (long) 1000;
            j4 = dayEventChipViewData.getStartTime() - ((long) (TimeZone.getDefault().getOffset(dayEventChipViewData.getStartTime() * j5) / 1000));
            j3 = dayEventChipViewData.getEndTime() - ((long) (TimeZone.getDefault().getOffset(dayEventChipViewData.getEndTime() * j5) / 1000));
        } else {
            j4 = dayEventChipViewData.getStartTime();
            j3 = dayEventChipViewData.getEndTime();
        }
        if (j2 <= j4 || j >= j3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m111489a(CalendarDate calendarDate, int i, int i2) {
        TimeZone timeZone;
        boolean z = false;
        for (Map.Entry<String, CalendarWorkHourSetting> entry : this.f75103o.entrySet()) {
            if (TextUtils.isEmpty(this.f75104p.get(entry.getKey()))) {
                timeZone = TimeZone.getDefault();
            } else {
                timeZone = TimeZone.getTimeZone(this.f75104p.get(entry.getKey()));
            }
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "attendeeTimeZone");
            TimeZone timeZone2 = this.f75100l;
            Intrinsics.checkExpressionValueIsNotNull(timeZone2, "mViewTimeZone");
            ArrayList<CalendarWorkHourSpan> a = CalendarWorkHourUtil.f83806b.mo120357a(calendarDate, entry.getValue(), timeZone, timeZone2);
            boolean z2 = !entry.getValue().isEnable();
            int size = a.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                if (i >= a.get(i3).getStartMinute() && i2 <= a.get(i3).getEndMinute()) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (!z2) {
                this.f75098j.add(entry.getKey());
                z = true;
            }
        }
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r23v0, resolved type: java.util.ArrayList<java.lang.String> */
    /* JADX DEBUG: Multi-variable search result rejected for r25v0, resolved type: java.util.ArrayList<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo108566a(long j, long j2, HashMap<String, ArrayList<DayEventChipViewData>> hashMap, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
        long j3 = (j / 60) * 60;
        long j4 = (j2 / 60) * 60;
        if (j3 <= j4 && !CollectionUtils.isEmpty(hashMap)) {
            CalendarDate calendarDate = new CalendarDate(this.f75100l);
            long j5 = (long) 1000;
            calendarDate.setTimeInMillis(j3 * j5);
            int hour = (calendarDate.getHour() * 60) + calendarDate.getMinute();
            CalendarDate calendarDate2 = new CalendarDate(this.f75100l);
            calendarDate2.setTimeInMillis(j5 * j4);
            int hour2 = (calendarDate2.getHour() * 60) + calendarDate2.getMinute();
            if (hour2 == 0 && hour > 0) {
                hour2 = CalendarWorkHourUtil.f83805a;
            }
            if (m111489a(calendarDate, hour, hour2)) {
                Set<Map.Entry<String, ArrayList<DayEventChipViewData>>> entrySet = hashMap.entrySet();
                Intrinsics.checkExpressionValueIsNotNull(entrySet, "eventChipViewDataMap.entries");
                for (T t : entrySet) {
                    Iterator it = ((ArrayList) t.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        DayEventChipViewData dayEventChipViewData = (DayEventChipViewData) it.next();
                        Intrinsics.checkExpressionValueIsNotNull(dayEventChipViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        if (m111490a(dayEventChipViewData, j3, j4)) {
                            if (arrayList2.contains(t.getKey())) {
                                arrayList2.remove(t.getKey());
                                arrayList3.add(t.getKey());
                            } else {
                                arrayList.add(t.getKey());
                            }
                        }
                    }
                }
                return;
            }
            Set<Map.Entry<String, ArrayList<DayEventChipViewData>>> entrySet2 = hashMap.entrySet();
            Intrinsics.checkExpressionValueIsNotNull(entrySet2, "eventChipViewDataMap.entries");
            for (T t2 : entrySet2) {
                Iterator it2 = ((ArrayList) t2.getValue()).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    DayEventChipViewData dayEventChipViewData2 = (DayEventChipViewData) it2.next();
                    Intrinsics.checkExpressionValueIsNotNull(dayEventChipViewData2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (m111490a(dayEventChipViewData2, j3, j4)) {
                        arrayList.add(t2.getKey());
                        break;
                    }
                }
            }
        }
    }
}
