package com.ss.android.lark.calendar.impl.features.arrange.arrangetime;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.ui.dragger.C26213k;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.EventChipsDragLayer;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30167c;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.CurrentTimeLine;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.EventChipsViewLayer;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.model.ArrangeConflictUnit;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.model.WorkHourUnit;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoContainer;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.FooterMessageView;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.OverHorizScrollView;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.OverScrollObserver;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.SmoothScrollView;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TimeBarLine;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TouchListenerFrameLayout;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TouchListenerLinearLayout;
import com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.ISelectTimeZoneChangeListener;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneEnterView;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.common.widget.guide.CalendarGuideManager;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSetting;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 c2\u00020\u0001:\u0001cB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0016J\u0016\u0010\"\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0016J,\u0010&\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0(2\u0006\u0010 \u001a\u00020!H\u0016J2\u0010*\u001a\u00020\u001c2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020)0$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020)0$2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020)0$H\u0016J8\u0010.\u001a\u00020\u001c2.\u0010/\u001a*\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u0002010$00j\u0014\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u0002010$`2H\u0016J\u0010\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u000205H\u0016J\u0018\u00106\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00107\u001a\u00020)H\u0016J\u0010\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020)H\u0016J\b\u0010:\u001a\u00020\u001cH\u0016J\b\u0010;\u001a\u00020\u001cH\u0016J\b\u0010<\u001a\u00020\u001cH\u0016J\u0010\u0010=\u001a\u00020\n2\u0006\u0010>\u001a\u00020\nH\u0002J\b\u0010?\u001a\u00020\u001cH\u0016J\b\u0010@\u001a\u00020\u001cH\u0002J\b\u0010A\u001a\u00020\u001cH\u0002J\b\u0010B\u001a\u00020\u001cH\u0002J\b\u0010C\u001a\u00020\u001cH\u0002J\u0006\u0010D\u001a\u00020\u001cJ\b\u0010E\u001a\u00020\u0007H\u0002J\u0010\u0010F\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\nH\u0002J\b\u0010G\u001a\u00020\u001cH\u0002J\u0010\u0010H\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\nH\u0002J\u0016\u0010I\u001a\u00020\u001c2\u0006\u0010J\u001a\u00020\n2\u0006\u0010K\u001a\u00020\nJ\b\u0010L\u001a\u00020\u001cH\u0016J\b\u0010M\u001a\u00020\u001cH\u0002J\u0010\u0010N\u001a\u00020\u001c2\u0006\u0010O\u001a\u00020\u0007H\u0016J\u0010\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020\u0007H\u0016J\b\u0010R\u001a\u00020\u001cH\u0016J\u0010\u0010S\u001a\u00020\u001c2\u0006\u0010T\u001a\u00020\u001aH\u0016J\b\u0010U\u001a\u00020\u001cH\u0016J\b\u0010V\u001a\u00020\u001cH\u0016J\u0018\u0010W\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010X\u001a\u00020!H\u0002J\b\u0010Y\u001a\u00020\u001cH\u0016J\b\u0010Z\u001a\u00020\u001cH\u0016J\b\u0010[\u001a\u00020\u001cH\u0016J\b\u0010\\\u001a\u00020\u001cH\u0016J\b\u0010]\u001a\u00020\u001cH\u0002J8\u0010^\u001a\u00020\u001c2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020`0(2\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0(2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010b\u001a\u00020\u001cH\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000¨\u0006d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeView;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeView;", "rootView", "Landroid/view/View;", "dragger", "Lcom/larksuite/framework/ui/dragger/Dragger;", "sourceFromChat", "", "(Landroid/view/View;Lcom/larksuite/framework/ui/dragger/Dragger;Z)V", "mAttendeeNum", "", "mContentScreenWidth", "mContext", "Landroid/content/Context;", "mDragger", "mGridLine", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/EventChipsGridLine;", "mHasOutWorkHourAttendee", "mIsAlwaysShowFooter", "mLoadingToast", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "mMinColumnWidth", "mNeedScrollToCurrent", "mRootView", "mSourceFromChat", "mViewDelegate", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeView$ViewDelegate;", "bindArrangeTime", "", "startTime", "", "endTime", "viewTimeZone", "Ljava/util/TimeZone;", "bindAvatarNameInfo", "attendeeList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "bindAvatarTimezone", "attendeeTimezone", "", "", "bindBusyAttendee", "busyCalendarIds", "outWorkHourCalendarIds", "bothConflictCalendarIds", "bindEventChipView", "chipViewData", "Ljava/util/HashMap;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "Lkotlin/collections/HashMap;", "bindFreeBusyResult", "conflictResult", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/model/ArrangeConflictUnit;", "bindTitleBar", "viewTimeZoneId", "bindViewTimeZone", "timeZoneId", "clearAllEventChip", "create", "destroy", "getContentWidth", "attendeeNum", "hideFinishedBtn", "hideFooterAndBusyIcon", "initArrangeMonthView", "initGridLine", "initListener", "initView", "isShowTimeZoneEnterView", "reAdjustGridLine", "reAdjustTimeBarWidth", "reAdjustView", "refreshDayMinutes", "startDayMinutes", "endDayMinutes", "refreshTimeFormat", "scrollToSelectTime", "setAlwaysShowChipAndFooter", "alwaysShow", "setIsAnimOnClickAppendChip", "isAnim", "setTitleLeftIconAsCross", "setViewDelegate", "viewDelegate", "showAddGroupChatterIcon", "showAppendChip", "showCurRedLineIfNeed", "selectedTimeZone", "showLoading", "showLoadingError", "showNoAttendees", "showTimeChip", "showTimeZoneByFg", "showWorkHourShadow", "workHourMap", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSetting;", "attendeeTimeZoneMap", "updateContentScreenWidth", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.e */
public final class ArrangeView implements ArrangeContract.IArrangeView {

    /* renamed from: f */
    public static final Companion f75416f = new Companion(null);

    /* renamed from: a */
    public final View f75417a;

    /* renamed from: b */
    public boolean f75418b;

    /* renamed from: c */
    public boolean f75419c = true;

    /* renamed from: d */
    public ArrangeContract.IArrangeView.ViewDelegate f75420d;

    /* renamed from: e */
    public RequestLoadingDialog f75421e;

    /* renamed from: g */
    private final Context f75422g;

    /* renamed from: h */
    private final C26213k f75423h;

    /* renamed from: i */
    private int f75424i;

    /* renamed from: j */
    private int f75425j = 1;

    /* renamed from: k */
    private final int f75426k;

    /* renamed from: l */
    private boolean f75427l = true;

    /* renamed from: m */
    private boolean f75428m;

    /* renamed from: n */
    private C30167c f75429n;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeView$Companion;", "", "()V", "HIGHER_TOAST_HEIGHT", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: a */
    public void mo108878a(ArrayList<AbstractC30095b> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "attendeeList");
        if (arrayList.isEmpty()) {
            mo108891i();
            return;
        }
        if (this.f75425j <= 0) {
            this.f75425j = 1;
        }
        int size = arrayList.size();
        this.f75425j = size;
        m112036a(size);
        m112039b(this.f75425j);
        ((AttendeeInfoContainer) this.f75417a.findViewById(R.id.attendeeContainer)).mo109000b();
        int c = m112040c(this.f75425j) / this.f75425j;
        Iterator<AbstractC30095b> it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC30095b next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "attendee");
            ((AttendeeInfoContainer) this.f75417a.findViewById(R.id.attendeeContainer)).mo108998a(next, c);
        }
        ((AttendeeInfoContainer) this.f75417a.findViewById(R.id.attendeeContainer)).setToLeftListener(new C30196b(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: a */
    public void mo108877a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        ((TimeZoneEnterView) this.f75417a.findViewById(R.id.timeZoneEnterview)).mo112460a(str);
        ((CurrentTimeLine) this.f75417a.findViewById(R.id.currentTimeLine)).mo108728a(str);
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: a */
    public void mo108880a(HashMap<String, ArrayList<DayEventChipViewData>> hashMap) {
        Intrinsics.checkParameterIsNotNull(hashMap, "chipViewData");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = ((AttendeeInfoContainer) this.f75417a.findViewById(R.id.attendeeContainer)).getAllAttendeeCalendarId().iterator();
        while (it.hasNext()) {
            ArrayList<DayEventChipViewData> arrayList2 = hashMap.get(it.next());
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
            }
            Intrinsics.checkExpressionValueIsNotNull(arrayList2, "chipViewData[calendarId]…t<DayEventChipViewData>()");
            arrayList.add(arrayList2);
        }
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC30197c(this, arrayList));
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: a */
    public void mo108879a(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        Intrinsics.checkParameterIsNotNull(arrayList, "busyCalendarIds");
        Intrinsics.checkParameterIsNotNull(arrayList2, "outWorkHourCalendarIds");
        Intrinsics.checkParameterIsNotNull(arrayList3, "bothConflictCalendarIds");
        ((AttendeeInfoContainer) this.f75417a.findViewById(R.id.attendeeContainer)).mo108999a(arrayList, arrayList2, arrayList3);
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: a */
    public void mo108881a(Map<String, CalendarWorkHourSetting> map, Map<String, String> map2, TimeZone timeZone) {
        Intrinsics.checkParameterIsNotNull(map, "workHourMap");
        Intrinsics.checkParameterIsNotNull(map2, "attendeeTimeZoneMap");
        Intrinsics.checkParameterIsNotNull(timeZone, "viewTimeZone");
        ((TimeBarLine) this.f75417a.findViewById(R.id.timeLineLayer)).post(new RunnableC30206k(this, map, map2, timeZone));
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: a */
    public void mo108882a(boolean z) {
        this.f75419c = z;
        ((ChipDragHandleLayer) this.f75417a.findViewById(R.id.chipDragHandleLayer)).setChipAwaysShow(this.f75419c);
        if (!this.f75419c) {
            FooterMessageView footerMessageView = (FooterMessageView) this.f75417a.findViewById(R.id.footerMessageView);
            Intrinsics.checkExpressionValueIsNotNull(footerMessageView, "mRootView.footerMessageView");
            footerMessageView.setVisibility(8);
            return;
        }
        FooterMessageView footerMessageView2 = (FooterMessageView) this.f75417a.findViewById(R.id.footerMessageView);
        Intrinsics.checkExpressionValueIsNotNull(footerMessageView2, "mRootView.footerMessageView");
        footerMessageView2.setVisibility(0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016J(\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016¨\u0006\u0011"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeView$initListener$actionListener$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/ChipDragHandleLayer$OnActionListener;", "onAppendClick", "", "onChipHandleGone", "onChipHandleVisible", "onClick", "startPos", "", "endPos", "startDayMinutes", "endDayMinutes", "onClickPos", "clickScrollY", "onDragging", "onEndDrag", "onStartDrag", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.e$h */
    public static final class C30203h implements ChipDragHandleLayer.OnActionListener {

        /* renamed from: a */
        final /* synthetic */ ArrangeView f75438a;

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer.OnActionListener
        /* renamed from: d */
        public void mo108966d() {
            this.f75438a.mo108953l();
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer.OnActionListener
        /* renamed from: c */
        public void mo108965c() {
            ArrangeView.m112035a(this.f75438a).mo108903g();
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer.OnActionListener
        /* renamed from: a */
        public void mo108960a() {
            ((SmoothScrollView) this.f75438a.f75417a.findViewById(R.id.contentScrollView)).mo109089c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer.OnActionListener
        /* renamed from: b */
        public void mo108963b() {
            ((SmoothScrollView) this.f75438a.f75417a.findViewById(R.id.contentScrollView)).mo109086b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer.OnActionListener
        /* renamed from: e */
        public void mo108967e() {
            if (!this.f75438a.f75419c) {
                FooterMessageView footerMessageView = (FooterMessageView) this.f75438a.f75417a.findViewById(R.id.footerMessageView);
                Intrinsics.checkExpressionValueIsNotNull(footerMessageView, "mRootView.footerMessageView");
                footerMessageView.setVisibility(0);
                ArrangeView.m112035a(this.f75438a).mo108904h();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30203h(ArrangeView eVar) {
            this.f75438a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer.OnActionListener
        /* renamed from: a */
        public void mo108961a(int i) {
            FooterMessageView footerMessageView = (FooterMessageView) this.f75438a.f75417a.findViewById(R.id.footerMessageView);
            Intrinsics.checkExpressionValueIsNotNull(footerMessageView, "mRootView.footerMessageView");
            if (footerMessageView.getVisibility() == 0) {
                ((SmoothScrollView) this.f75438a.f75417a.findViewById(R.id.contentScrollView)).mo109084a(i, 0);
                return;
            }
            FooterMessageView footerMessageView2 = (FooterMessageView) this.f75438a.f75417a.findViewById(R.id.footerMessageView);
            Intrinsics.checkExpressionValueIsNotNull(footerMessageView2, "mRootView.footerMessageView");
            ((SmoothScrollView) this.f75438a.f75417a.findViewById(R.id.contentScrollView)).mo109084a(i, footerMessageView2.getHeight());
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer.OnActionListener
        /* renamed from: a */
        public void mo108962a(int i, int i2, int i3, int i4) {
            ((TimeBarLine) this.f75438a.f75417a.findViewById(R.id.timeBar)).mo109094a(i, i2, ArrangeView.m112035a(this.f75438a).mo108905i());
            this.f75438a.mo108950a(i3, i4);
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer.OnActionListener
        /* renamed from: b */
        public void mo108964b(int i, int i2, int i3, int i4) {
            ((TimeBarLine) this.f75438a.f75417a.findViewById(R.id.timeBar)).mo109094a(i, i2, 15);
            this.f75438a.mo108950a(i3, i4);
        }
    }

    /* renamed from: o */
    private final void m112043o() {
        m112036a(this.f75425j);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeView$initArrangeMonthView$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/TitleTimeBar$OnTitleChangeListener;", "onAddAttendeeClick", "", "onDateChanged", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.e$d */
    public static final class C30199d implements TitleTimeBar.OnTitleChangeListener {

        /* renamed from: a */
        final /* synthetic */ ArrangeView f75434a;

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar.OnTitleChangeListener
        /* renamed from: a */
        public void mo108573a() {
            GeneralHitPoint.m124253j();
            ArrangeView.m112035a(this.f75434a).mo108902f();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30199d(ArrangeView eVar) {
            this.f75434a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar.OnTitleChangeListener
        /* renamed from: a */
        public void mo108574a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            ArrangeView.m112035a(this.f75434a).mo108896a(calendarDate);
            ArrangeView.m112035a(this.f75434a).mo108900d();
            ((TimeZoneEnterView) this.f75434a.f75417a.findViewById(R.id.timeZoneEnterview)).setShowSelectedToast(false);
            ArrangeView.m112038b(this.f75434a).mo112585a(R.string.Calendar_Edit_FindTimeLoading);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeView$showNoAttendees$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/AttendeeInfoContainer$ToLeftListener;", "onClickAdd", "", "onToLeft", "targetIndex", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.e$i */
    public static final class C30204i implements AttendeeInfoContainer.ToLeftListener {

        /* renamed from: a */
        final /* synthetic */ ArrangeView f75439a;

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoContainer.ToLeftListener
        /* renamed from: a */
        public void mo108955a(int i) {
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoContainer.ToLeftListener
        /* renamed from: a */
        public void mo108954a() {
            GeneralHitPoint.m124255k();
            ArrangeView.m112035a(this.f75439a).mo108902f();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30204i(ArrangeView eVar) {
            this.f75439a = eVar;
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m112043o();
        mo108952k();
        m112046r();
        m112041m();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: d */
    public void mo108886d() {
        ((ChipDragHandleLayer) this.f75417a.findViewById(R.id.chipDragHandleLayer)).mo109033b();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: e */
    public void mo108887e() {
        ((ChipDragHandleLayer) this.f75417a.findViewById(R.id.chipDragHandleLayer)).mo109026a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: f */
    public void mo108888f() {
        ((TitleTimeBar) this.f75417a.findViewById(R.id.titleBar)).mo109106e();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: j */
    public void mo108892j() {
        ((FooterMessageView) this.f75417a.findViewById(R.id.footerMessageView)).mo109058a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeView$initListener$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/FooterMessageView$OnClickListener;", "onFinishClick", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.e$e */
    public static final class C30200e implements FooterMessageView.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ArrangeView f75435a;

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.FooterMessageView.OnClickListener
        /* renamed from: a */
        public void mo108958a() {
            if (this.f75435a.f75418b) {
                CalendarHitPoint.m124111M();
            }
            ArrangeView.m112035a(this.f75435a).mo108893a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30200e(ArrangeView eVar) {
            this.f75435a = eVar;
        }
    }

    /* renamed from: p */
    private final void m112044p() {
        ((TitleTimeBar) this.f75417a.findViewById(R.id.titleBar)).setDateChangeListener(new C30199d(this));
    }

    /* renamed from: t */
    private final void m112048t() {
        this.f75424i = DeviceUtils.getScreenWidth(this.f75422g) - UIUtils.dp2px(this.f75422g, 56.0f);
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: a */
    public void mo108872a() {
        ((TitleTimeBar) this.f75417a.findViewById(R.id.titleBar)).mo109103b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.e$c */
    static final class RunnableC30197c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrangeView f75431a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f75432b;

        RunnableC30197c(ArrangeView eVar, ArrayList arrayList) {
            this.f75431a = eVar;
            this.f75432b = arrayList;
        }

        public final void run() {
            ((EventChipsViewLayer) this.f75431a.f75417a.findViewById(R.id.chipsLayer)).mo108741a(this.f75432b);
            ((EventChipsViewLayer) this.f75431a.f75417a.findViewById(R.id.chipsLayer)).post(new Runnable(this) {
                /* class com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeView.RunnableC30197c.RunnableC301981 */

                /* renamed from: a */
                final /* synthetic */ RunnableC30197c f75433a;

                {
                    this.f75433a = r1;
                }

                public final void run() {
                    ((EventChipsViewLayer) this.f75433a.f75431a.f75417a.findViewById(R.id.chipsLayer)).mo108742b(this.f75433a.f75432b);
                    if (!ArrangeView.m112035a(this.f75433a.f75431a).mo108901e()) {
                        ArrangeView.m112038b(this.f75433a.f75431a).dismiss();
                        ((TimeZoneEnterView) this.f75433a.f75431a.f75417a.findViewById(R.id.timeZoneEnterview)).setShowSelectedToast(true);
                    }
                    ((ChipDragHandleLayer) this.f75433a.f75431a.f75417a.findViewById(R.id.chipDragHandleLayer)).mo109038e();
                    CalendarPerfMonitor.m124413a("key_freebusy_view");
                }
            });
        }
    }

    /* renamed from: n */
    private final boolean m112042n() {
        if (C30022a.f74883b.mo112695c()) {
            return true;
        }
        ArrangeContract.IArrangeView.ViewDelegate aVar = this.f75420d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        String id = aVar.mo108906j().getID();
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        if (!Intrinsics.areEqual(id, timeZone.getID())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: c */
    public void mo108885c() {
        ((TimeBarLine) this.f75417a.findViewById(R.id.timeBar)).mo108753a();
        TimeBarLine timeBarLine = (TimeBarLine) this.f75417a.findViewById(R.id.timeBar);
        C30167c cVar = this.f75429n;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridLine");
        }
        timeBarLine.setEventChipsGridLine(cVar);
        ((TimeBarLine) this.f75417a.findViewById(R.id.timeBar)).invalidate();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: g */
    public void mo108889g() {
        ((TimeZoneEnterView) this.f75417a.findViewById(R.id.timeZoneEnterview)).setShowSelectedToast(false);
        RequestLoadingDialog requestLoadingDialog = this.f75421e;
        if (requestLoadingDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingToast");
        }
        requestLoadingDialog.mo112585a(R.string.Calendar_Edit_FindTimeLoading);
        RequestLoadingDialog requestLoadingDialog2 = this.f75421e;
        if (requestLoadingDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingToast");
        }
        requestLoadingDialog2.show();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: h */
    public void mo108890h() {
        ((EventChipsViewLayer) this.f75417a.findViewById(R.id.chipsLayer)).mo108736a();
        ((TimeBarLine) this.f75417a.findViewById(R.id.timeLineLayer)).setAttendeeSize(0);
        ((TimeBarLine) this.f75417a.findViewById(R.id.timeLineLayer)).invalidate();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: i */
    public void mo108891i() {
        this.f75425j = 0;
        m112036a(1);
        m112039b(1);
        ((AttendeeInfoContainer) this.f75417a.findViewById(R.id.attendeeContainer)).mo109000b();
        ((AttendeeInfoContainer) this.f75417a.findViewById(R.id.attendeeContainer)).mo108996a(m112040c(1));
        ((AttendeeInfoContainer) this.f75417a.findViewById(R.id.attendeeContainer)).setToLeftListener(new C30204i(this));
        mo108890h();
    }

    /* renamed from: q */
    private final void m112045q() {
        int i;
        if (m112042n()) {
            i = 0;
        } else {
            i = UIUtils.dp2px(this.f75422g, 56.0f);
        }
        OverHorizScrollView overHorizScrollView = (OverHorizScrollView) this.f75417a.findViewById(R.id.headerScrollView);
        Intrinsics.checkExpressionValueIsNotNull(overHorizScrollView, "mRootView.headerScrollView");
        ViewGroup.LayoutParams layoutParams = overHorizScrollView.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = i;
            OverHorizScrollView overHorizScrollView2 = (OverHorizScrollView) this.f75417a.findViewById(R.id.headerScrollView);
            Intrinsics.checkExpressionValueIsNotNull(overHorizScrollView2, "mRootView.headerScrollView");
            overHorizScrollView2.setLayoutParams(layoutParams2);
            ((ChipDragHandleLayer) this.f75417a.findViewById(R.id.chipDragHandleLayer)).setChipWidth(this.f75424i);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: r */
    private final void m112046r() {
        ((ChipDragHandleLayer) this.f75417a.findViewById(R.id.chipDragHandleLayer)).setActionListener(new C30203h(this));
        ((FooterMessageView) this.f75417a.findViewById(R.id.footerMessageView)).setClickListener(new C30200e(this));
        ((TouchListenerFrameLayout) this.f75417a.findViewById(R.id.arrangeActivityRoot)).setTouchListener(new C30201f(this));
        ((TouchListenerLinearLayout) this.f75417a.findViewById(R.id.attendeeChipContainer)).setTouchListener(new C30202g(this));
    }

    /* renamed from: s */
    private final void m112047s() {
        SmoothScrollView smoothScrollView = (SmoothScrollView) this.f75417a.findViewById(R.id.contentScrollView);
        Intrinsics.checkExpressionValueIsNotNull(smoothScrollView, "mRootView.contentScrollView");
        ((SmoothScrollView) this.f75417a.findViewById(R.id.contentScrollView)).scrollTo(0, ((((ChipDragHandleLayer) this.f75417a.findViewById(R.id.chipDragHandleLayer)).getStartPos() + ((ChipDragHandleLayer) this.f75417a.findViewById(R.id.chipDragHandleLayer)).getEndPos()) / 2) - (smoothScrollView.getHeight() / 2));
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: b */
    public void mo108883b() {
        RequestLoadingDialog requestLoadingDialog = this.f75421e;
        if (requestLoadingDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingToast");
        }
        requestLoadingDialog.mo112592c(R.string.Calendar_Common_FailedToLoad);
        RequestLoadingDialog requestLoadingDialog2 = this.f75421e;
        if (requestLoadingDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingToast");
        }
        requestLoadingDialog2.show();
        ((TimeZoneEnterView) this.f75417a.findViewById(R.id.timeZoneEnterview)).setShowSelectedToast(true);
        ((ChipDragHandleLayer) this.f75417a.findViewById(R.id.chipDragHandleLayer)).mo109038e();
    }

    /* renamed from: l */
    public final void mo108953l() {
        if (!this.f75419c) {
            ((TimeBarLine) this.f75417a.findViewById(R.id.timeBar)).mo108754b();
            FooterMessageView footerMessageView = (FooterMessageView) this.f75417a.findViewById(R.id.footerMessageView);
            Intrinsics.checkExpressionValueIsNotNull(footerMessageView, "mRootView.footerMessageView");
            footerMessageView.setVisibility(8);
            ((AttendeeInfoContainer) this.f75417a.findViewById(R.id.attendeeContainer)).mo109002d();
            ((AttendeeInfoContainer) this.f75417a.findViewById(R.id.attendeeContainer)).mo109001c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.e$k */
    static final class RunnableC30206k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrangeView f75441a;

        /* renamed from: b */
        final /* synthetic */ Map f75442b;

        /* renamed from: c */
        final /* synthetic */ Map f75443c;

        /* renamed from: d */
        final /* synthetic */ TimeZone f75444d;

        RunnableC30206k(ArrangeView eVar, Map map, Map map2, TimeZone timeZone) {
            this.f75441a = eVar;
            this.f75442b = map;
            this.f75443c = map2;
            this.f75444d = timeZone;
        }

        public final void run() {
            TimeZone timeZone;
            CalendarDate calendarDate;
            ArrayList<WorkHourUnit> arrayList = new ArrayList<>();
            ArrayList<String> allAttendeeCalendarId = ((AttendeeInfoContainer) this.f75441a.f75417a.findViewById(R.id.attendeeContainer)).getAllAttendeeCalendarId();
            for (Map.Entry entry : this.f75442b.entrySet()) {
                if (((CalendarWorkHourSetting) entry.getValue()).isEnable()) {
                    WorkHourUnit bVar = new WorkHourUnit();
                    int i = 0;
                    int size = allAttendeeCalendarId.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (allAttendeeCalendarId.get(i).equals(entry.getKey())) {
                            bVar.mo108991a(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (TextUtils.isEmpty((CharSequence) this.f75443c.get(entry.getKey()))) {
                        timeZone = TimeZone.getDefault();
                    } else {
                        timeZone = TimeZone.getTimeZone((String) this.f75443c.get(entry.getKey()));
                    }
                    CalendarWorkHourUtil.Companion aVar = CalendarWorkHourUtil.f83806b;
                    ArrangeContract.IArrangeView.ViewDelegate a = ArrangeView.m112035a(this.f75441a);
                    if (a != null) {
                        calendarDate = a.mo108898b();
                    } else {
                        calendarDate = null;
                    }
                    Intrinsics.checkExpressionValueIsNotNull(timeZone, "attendeeTimeZone");
                    bVar.mo108992a(aVar.mo120357a(calendarDate, (CalendarWorkHourSetting) entry.getValue(), timeZone, this.f75444d));
                    arrayList.add(bVar);
                }
            }
            ((TimeBarLine) this.f75441a.f75417a.findViewById(R.id.timeLineLayer)).setWorkHourList(arrayList);
            ((TimeBarLine) this.f75441a.f75417a.findViewById(R.id.timeLineLayer)).setAttendeeSize(allAttendeeCalendarId.size());
            ((TimeBarLine) this.f75441a.f75417a.findViewById(R.id.timeLineLayer)).invalidate();
        }
    }

    /* renamed from: m */
    private final void m112041m() {
        boolean c = C30022a.f74883b.mo112695c();
        ArrangeContract.IArrangeView.ViewDelegate aVar = this.f75420d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        String id = aVar.mo108906j().getID();
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        boolean areEqual = Intrinsics.areEqual(id, timeZone.getID());
        if (c || !areEqual) {
            if (this.f75428m) {
                ((TimeZoneEnterView) this.f75417a.findViewById(R.id.timeZoneEnterview)).mo112459a(TimeZoneEnterView.Source.CHAT_BUSY);
            } else {
                ((TimeZoneEnterView) this.f75417a.findViewById(R.id.timeZoneEnterview)).mo112459a(TimeZoneEnterView.Source.ARRANGE_BUSY);
            }
            TimeZoneEnterView timeZoneEnterView = (TimeZoneEnterView) this.f75417a.findViewById(R.id.timeZoneEnterview);
            Intrinsics.checkExpressionValueIsNotNull(timeZoneEnterView, "mRootView.timeZoneEnterview");
            timeZoneEnterView.setVisibility(0);
            if (c) {
                ((TimeZoneEnterView) this.f75417a.findViewById(R.id.timeZoneEnterview)).setSelectTimeZoneChangeListener(new C30205j(this));
                CalendarGuideManager aVar2 = CalendarGuideManager.f78922a;
                Context context = this.f75422g;
                if (context != null) {
                    aVar2.mo113187a((Activity) context, ((TimeZoneEnterView) this.f75417a.findViewById(R.id.timeZoneEnterview)).getTimeZoneTextView());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
            return;
        }
        TimeZoneEnterView timeZoneEnterView2 = (TimeZoneEnterView) this.f75417a.findViewById(R.id.timeZoneEnterview);
        Intrinsics.checkExpressionValueIsNotNull(timeZoneEnterView2, "mRootView.timeZoneEnterview");
        timeZoneEnterView2.setVisibility(8);
    }

    /* renamed from: k */
    public final void mo108952k() {
        m112039b(this.f75425j);
        m112045q();
        ((TimeBarLine) this.f75417a.findViewById(R.id.timeLineLayer)).setNumDays(1);
        TimeBarLine timeBarLine = (TimeBarLine) this.f75417a.findViewById(R.id.timeBar);
        ArrangeContract.IArrangeView.ViewDelegate aVar = this.f75420d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        timeBarLine.setTimeUnit(aVar.mo108905i());
        ((EventChipsViewLayer) this.f75417a.findViewById(R.id.chipsLayer)).setDate(new CalendarDate());
        ((EventChipsDragLayer) this.f75417a.findViewById(R.id.chipsDragLayer)).setDate(new CalendarDate());
        ((EventChipsDragLayer) this.f75417a.findViewById(R.id.chipsDragLayer)).setEventChipsLayer((EventChipsViewLayer) this.f75417a.findViewById(R.id.chipsLayer));
        ((EventChipsDragLayer) this.f75417a.findViewById(R.id.chipsDragLayer)).mo108592d();
        OverScrollObserver cVar = new OverScrollObserver();
        OverHorizScrollView overHorizScrollView = (OverHorizScrollView) this.f75417a.findViewById(R.id.headerScrollView);
        Intrinsics.checkExpressionValueIsNotNull(overHorizScrollView, "mRootView.headerScrollView");
        cVar.mo109126a(overHorizScrollView);
        OverHorizScrollView overHorizScrollView2 = (OverHorizScrollView) this.f75417a.findViewById(R.id.contentHorizScrollView);
        Intrinsics.checkExpressionValueIsNotNull(overHorizScrollView2, "mRootView.contentHorizScrollView");
        cVar.mo109126a(overHorizScrollView2);
        C26213k kVar = this.f75423h;
        if (kVar != null) {
            ((ChipDragHandleLayer) this.f75417a.findViewById(R.id.chipDragHandleLayer)).setDragger(kVar);
        }
        ((TimeZoneEnterView) this.f75417a.findViewById(R.id.timeZoneEnterview)).setShowSelectedToast(false);
        Context context = this.f75422g;
        if (context != null) {
            RequestLoadingDialog requestLoadingDialog = new RequestLoadingDialog((Activity) context);
            this.f75421e = requestLoadingDialog;
            if (requestLoadingDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingToast");
            }
            requestLoadingDialog.mo112590b();
            RequestLoadingDialog requestLoadingDialog2 = this.f75421e;
            if (requestLoadingDialog2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingToast");
            }
            requestLoadingDialog2.mo112585a(R.string.Calendar_Edit_FindTimeLoading);
            m112044p();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeView$bindAvatarNameInfo$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/AttendeeInfoContainer$ToLeftListener;", "onClickAdd", "", "onToLeft", "targetIndex", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.e$b */
    public static final class C30196b implements AttendeeInfoContainer.ToLeftListener {

        /* renamed from: a */
        final /* synthetic */ ArrangeView f75430a;

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoContainer.ToLeftListener
        /* renamed from: a */
        public void mo108954a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30196b(ArrangeView eVar) {
            this.f75430a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoContainer.ToLeftListener
        /* renamed from: a */
        public void mo108955a(int i) {
            CalendarHitPoint.m124102D();
            GeneralHitPoint.m124192a("left");
            ((EventChipsViewLayer) this.f75430a.f75417a.findViewById(R.id.chipsLayer)).mo108737a(i);
            ((TimeBarLine) this.f75430a.f75417a.findViewById(R.id.timeLineLayer)).mo109095b(i);
            ArrangeView.m112035a(this.f75430a).mo108894a(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeView$initListener$2", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/TouchListenerFrameLayout$TouchListener;", "onTouch", "", "ev", "Landroid/view/MotionEvent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.e$f */
    public static final class C30201f implements TouchListenerFrameLayout.TouchListener {

        /* renamed from: a */
        final /* synthetic */ ArrangeView f75436a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30201f(ArrangeView eVar) {
            this.f75436a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TouchListenerFrameLayout.TouchListener
        /* renamed from: a */
        public void mo108959a(MotionEvent motionEvent) {
            Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
            ((AttendeeInfoContainer) this.f75436a.f75417a.findViewById(R.id.attendeeContainer)).mo108995a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeView$initListener$3", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/TouchListenerLinearLayout$TouchListener;", "onTouch", "", "ev", "Landroid/view/MotionEvent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.e$g */
    public static final class C30202g implements TouchListenerLinearLayout.TouchListener {

        /* renamed from: a */
        final /* synthetic */ ArrangeView f75437a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30202g(ArrangeView eVar) {
            this.f75437a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TouchListenerLinearLayout.TouchListener
        /* renamed from: a */
        public void mo108575a(MotionEvent motionEvent) {
            Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
            ((TitleTimeBar) this.f75437a.f75417a.findViewById(R.id.titleBar)).mo109105d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeView$showTimeZoneByFg$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ISelectTimeZoneChangeListener;", "onTimeZoneChanged", "", "timeZoneId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.e$j */
    public static final class C30205j implements ISelectTimeZoneChangeListener {

        /* renamed from: a */
        final /* synthetic */ ArrangeView f75440a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30205j(ArrangeView eVar) {
            this.f75440a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ISelectTimeZoneChangeListener
        /* renamed from: a */
        public void mo108585a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
            if (!TextUtils.isEmpty(str)) {
                ((CurrentTimeLine) this.f75440a.f75417a.findViewById(R.id.currentTimeLine)).mo108728a(str);
                CalendarDate b = ArrangeView.m112035a(this.f75440a).mo108898b();
                CalendarDate c = ArrangeView.m112035a(this.f75440a).mo108899c();
                this.f75440a.mo108953l();
                TimeZone timeZone = TimeZone.getTimeZone(str);
                ArrangeView eVar = this.f75440a;
                long timeInSeconds = b.getTimeInSeconds();
                long timeInSeconds2 = c.getTimeInSeconds();
                Intrinsics.checkExpressionValueIsNotNull(timeZone, "timeZone");
                eVar.mo108873a(timeInSeconds, timeInSeconds2, timeZone);
                ((ChipDragHandleLayer) this.f75440a.f75417a.findViewById(R.id.chipDragHandleLayer)).mo109039f();
                ArrangeView.m112035a(this.f75440a).mo108897a(str);
            }
        }
    }

    /* renamed from: a */
    public void setViewDelegate(ArrangeContract.IArrangeView.ViewDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f75420d = aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ ArrangeContract.IArrangeView.ViewDelegate m112035a(ArrangeView eVar) {
        ArrangeContract.IArrangeView.ViewDelegate aVar = eVar.f75420d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ RequestLoadingDialog m112038b(ArrangeView eVar) {
        RequestLoadingDialog requestLoadingDialog = eVar.f75421e;
        if (requestLoadingDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingToast");
        }
        return requestLoadingDialog;
    }

    /* renamed from: c */
    private final int m112040c(int i) {
        int i2;
        if (i <= 0) {
            i2 = 1;
        } else {
            i2 = i;
        }
        return i * Math.max(this.f75424i / i2, this.f75426k);
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: b */
    public void mo108884b(boolean z) {
        ((ChipDragHandleLayer) this.f75417a.findViewById(R.id.chipDragHandleLayer)).setAnimOnClickAppendChip(z);
    }

    /* renamed from: b */
    private final void m112039b(int i) {
        EventChipsViewLayer eventChipsViewLayer = (EventChipsViewLayer) this.f75417a.findViewById(R.id.chipsLayer);
        Intrinsics.checkExpressionValueIsNotNull(eventChipsViewLayer, "mRootView.chipsLayer");
        eventChipsViewLayer.getLayoutParams().width = m112040c(i);
        ((EventChipsViewLayer) this.f75417a.findViewById(R.id.chipsLayer)).setNumDays(i);
    }

    /* renamed from: a */
    private final void m112036a(int i) {
        int viewHeight = ((TimeBarLine) this.f75417a.findViewById(R.id.timeBar)).getViewHeight();
        int c = m112040c(i);
        C30167c.C30168a aVar = new C30167c.C30168a();
        C30167c a = aVar.mo108787g(i).mo108782b(viewHeight).mo108780a(c).mo108786f(UIUtils.dp2px(this.f75422g, 0.5f)).mo108785e(UIUtils.dp2px(this.f75422g, 5.0f)).mo108784d(UIUtils.dp2px(this.f75422g, 7.0f)).mo108788h(UIUtils.dp2px(this.f75422g, 50.0f)).mo108789i(UIUtils.dp2px(this.f75422g, 1.0f)).mo108781a();
        Intrinsics.checkExpressionValueIsNotNull(a, "eventChipsGridLine");
        this.f75429n = a;
        ((EventChipsViewLayer) this.f75417a.findViewById(R.id.chipsLayer)).setEventChipsGridLine(a);
        ((EventChipsDragLayer) this.f75417a.findViewById(R.id.chipsDragLayer)).setEventChipsGridLine(a);
        ((ChipDragHandleLayer) this.f75417a.findViewById(R.id.chipDragHandleLayer)).setGridLine(a);
        ((TimeBarLine) this.f75417a.findViewById(R.id.timeBar)).setEventChipsGridLine(a);
        ((CurrentTimeLine) this.f75417a.findViewById(R.id.currentTimeLine)).setEventChipsGridLine(aVar.mo108787g(1).mo108781a());
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: a */
    public void mo108876a(ArrangeConflictUnit arrangeConflictUnit) {
        Intrinsics.checkParameterIsNotNull(arrangeConflictUnit, "conflictResult");
        this.f75418b = arrangeConflictUnit.isShowInWorkHourFormat();
        ((FooterMessageView) this.f75417a.findViewById(R.id.footerMessageView)).mo109059a(arrangeConflictUnit);
    }

    /* renamed from: a */
    private final void m112037a(long j, TimeZone timeZone) {
        CalendarDate calendarDate = new CalendarDate(timeZone);
        calendarDate.setTimeInSeconds(j);
        if (new CalendarDate(timeZone).getJulianDay() == calendarDate.getJulianDay()) {
            CurrentTimeLine currentTimeLine = (CurrentTimeLine) this.f75417a.findViewById(R.id.currentTimeLine);
            Intrinsics.checkExpressionValueIsNotNull(currentTimeLine, "mRootView.currentTimeLine");
            currentTimeLine.setVisibility(0);
            return;
        }
        CurrentTimeLine currentTimeLine2 = (CurrentTimeLine) this.f75417a.findViewById(R.id.currentTimeLine);
        Intrinsics.checkExpressionValueIsNotNull(currentTimeLine2, "mRootView.currentTimeLine");
        currentTimeLine2.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo108950a(int i, int i2) {
        ArrangeContract.IArrangeView.ViewDelegate aVar = this.f75420d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo108895a(i, i2);
        ArrangeContract.IArrangeView.ViewDelegate aVar2 = this.f75420d;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        CalendarDate b = aVar2.mo108898b();
        ArrangeContract.IArrangeView.ViewDelegate aVar3 = this.f75420d;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        ((FooterMessageView) this.f75417a.findViewById(R.id.footerMessageView)).mo109060a(b, aVar3.mo108899c());
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: a */
    public void mo108874a(long j, String str) {
        Intrinsics.checkParameterIsNotNull(str, "viewTimeZoneId");
        long j2 = j * ((long) 1000);
        String a = C32646c.m125252a(j2, str);
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDateTimeShowUtil…e * 1000, viewTimeZoneId)");
        ((TitleTimeBar) this.f75417a.findViewById(R.id.titleBar)).setTitleText(a);
        TitleTimeBar titleTimeBar = (TitleTimeBar) this.f75417a.findViewById(R.id.titleBar);
        ArrangeContract.IArrangeView.ViewDelegate aVar = this.f75420d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        titleTimeBar.setSelectDate(new CalendarDate(aVar.mo108898b()));
        ((TimeZoneEnterView) this.f75417a.findViewById(R.id.timeZoneEnterview)).mo112458a(j2);
    }

    public ArrangeView(View view, C26213k kVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f75417a = view;
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        this.f75422g = context;
        this.f75423h = kVar;
        this.f75428m = z;
        m112048t();
        ((ChipDragHandleLayer) view.findViewById(R.id.chipDragHandleLayer)).mo109035c();
        this.f75426k = UIUtils.dp2px(context, 75.0f);
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: a */
    public void mo108873a(long j, long j2, TimeZone timeZone) {
        Intrinsics.checkParameterIsNotNull(timeZone, "viewTimeZone");
        m112037a(j, timeZone);
        ArrangeContract.IArrangeView.ViewDelegate aVar = this.f75420d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        CalendarDate b = aVar.mo108898b();
        ArrangeContract.IArrangeView.ViewDelegate aVar2 = this.f75420d;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        CalendarDate c = aVar2.mo108899c();
        ((ChipDragHandleLayer) this.f75417a.findViewById(R.id.chipDragHandleLayer)).mo109027a(b.getDayMinutes(), c.getDayMinutes() + ((c.getJulianDay() - b.getJulianDay()) * 24 * 60));
        ((FooterMessageView) this.f75417a.findViewById(R.id.footerMessageView)).mo109060a(b, c);
        int startPos = ((ChipDragHandleLayer) this.f75417a.findViewById(R.id.chipDragHandleLayer)).getStartPos();
        int endPos = ((ChipDragHandleLayer) this.f75417a.findViewById(R.id.chipDragHandleLayer)).getEndPos();
        if (!this.f75419c) {
            ((TimeBarLine) this.f75417a.findViewById(R.id.timeBar)).mo108754b();
            FooterMessageView footerMessageView = (FooterMessageView) this.f75417a.findViewById(R.id.footerMessageView);
            Intrinsics.checkExpressionValueIsNotNull(footerMessageView, "mRootView.footerMessageView");
            footerMessageView.setVisibility(8);
        } else {
            TimeBarLine timeBarLine = (TimeBarLine) this.f75417a.findViewById(R.id.timeBar);
            ArrangeContract.IArrangeView.ViewDelegate aVar3 = this.f75420d;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            timeBarLine.mo109094a(startPos, endPos, aVar3.mo108905i());
        }
        if (this.f75427l) {
            m112047s();
            this.f75427l = false;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView
    /* renamed from: a */
    public void mo108875a(long j, Map<String, String> map, TimeZone timeZone) {
        Intrinsics.checkParameterIsNotNull(map, "attendeeTimezone");
        Intrinsics.checkParameterIsNotNull(timeZone, "viewTimeZone");
        ((AttendeeInfoContainer) this.f75417a.findViewById(R.id.attendeeContainer)).mo108997a(j, map);
    }
}
