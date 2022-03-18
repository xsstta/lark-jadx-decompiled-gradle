package com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.ISelectTimeZoneChangeListener;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneEnterView;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneSelectorDialog;
import com.ss.android.lark.calendar.impl.features.events.edit.C31534a;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.attendeeDialog.AttendeeDisplayDialog;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.attendeeLocalTimeAdapter.AttendeeLocalTimeData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.attendeeLocalTimeAdapter.AttendeeTimeZoneAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.EditFragmentTimeContainer;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.ITimeZoneChosenListener;
import com.ss.android.lark.calendar.impl.features.events.edit.utils.EventTimeZoneUtils;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31910b;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.C31897a;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.C31912c;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseViewCalendar;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.UserAttendeeBaseInfo;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001e\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00018B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\rH\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020\u001bH\u0002J\b\u0010&\u001a\u00020\u001bH\u0016J\b\u0010'\u001a\u00020\u001bH\u0016J\b\u0010(\u001a\u00020\u001bH\u0016J\b\u0010)\u001a\u00020\u001bH\u0002J\b\u0010*\u001a\u00020\u001bH\u0016J\b\u0010+\u001a\u00020\u001bH\u0016J\b\u0010,\u001a\u00020\u001bH\u0016J\b\u0010-\u001a\u00020\u001bH\u0016J\b\u0010.\u001a\u00020\u001bH\u0016J\b\u0010/\u001a\u00020\u001bH\u0016J\b\u00100\u001a\u00020\u001bH\u0016J\b\u00101\u001a\u00020\u001bH\u0016J\b\u00102\u001a\u00020\u001bH\u0016J\b\u00103\u001a\u00020\u001bH\u0002J\b\u00104\u001a\u00020\u001bH\u0016J\b\u00105\u001a\u00020\u001bH\u0002J\b\u00106\u001a\u00020\u001bH\u0002J\b\u00107\u001a\u00020\u001bH\u0002R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00069"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeView;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BaseViewCalendar;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeViewAction;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeViewApi;", "mRootView", "Landroid/view/View;", "mViewDependency", "Lcom/ss/android/lark/calendar/impl/features/events/edit/BaseFragmentView$ViewDependency;", "(Landroid/view/View;Lcom/ss/android/lark/calendar/impl/features/events/edit/BaseFragmentView$ViewDependency;)V", "mAllDayWheelTime", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/pickerview/AllDayWheelTime;", "mContext", "Landroid/content/Context;", "mHourMinuteWheelTime", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/pickerview/HourMinuteWheelTime;", "mOnTimeChosenCallBack", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/pickerview/BaseWheelView$IOnTimeChosen;", "getMRootView", "()Landroid/view/View;", "mScrollableDialog", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeDialog/AttendeeDisplayDialog;", "mTimeZoneAttendeeAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeLocalTimeAdapter/AttendeeTimeZoneAdapter;", "getMViewDependency", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/BaseFragmentView$ViewDependency;", "create", "", "getContext", "hideAttendeeRecycleView", "hideTimeZoneContainer", "initAttendeeRecycleView", "initListener", "initTimeShowContent", "initTimeWheelView", "initTitleBar", "initView", "refreshAllDayWheelsData", "refreshAttendeeRecycleView", "refreshEndErrorState", "refreshErrorState", "refreshHourMinuteWheelsData", "refreshPickerViewData", "refreshStartErrorState", "refreshTimeContainerData", "refreshTimeContainerSelectedState", "refreshTimeWheelViewData", "refreshTimeWheelViewVisibility", "refreshTimeWheelsOnTimeFormatChange", "refreshTimeZoneContainer", "refreshWholeEditTimeView", "showAttendeeRecycleView", "showEndTimeInvalidDialog", "showTimeZoneContainer", "showWheelViewErrorColor", "showWheelViewNormalColor", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.d */
public final class EditMultiTimeView extends BaseViewCalendar<EditMultiTimeContract.IEditMultiTimeViewData, EditMultiTimeContract.IEditMultiTimeViewAction> implements EditMultiTimeContract.IEditMultiTimeViewApi {

    /* renamed from: c */
    public static final Companion f80552c = new Companion(null);

    /* renamed from: a */
    public Context f80553a;

    /* renamed from: b */
    public AttendeeDisplayDialog f80554b;

    /* renamed from: d */
    private C31897a f80555d;

    /* renamed from: e */
    private C31912c f80556e;

    /* renamed from: f */
    private AttendeeTimeZoneAdapter f80557f = new AttendeeTimeZoneAdapter();

    /* renamed from: g */
    private final AbstractC31910b.AbstractC31911a f80558g = new C31687h(this);

    /* renamed from: h */
    private final View f80559h;

    /* renamed from: i */
    private final C31534a.AbstractC31535a f80560i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeView$Companion;", "", "()V", "WHEEL_VIEW_VISIBLE_SIZE", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: o */
    public Context mo115411o() {
        return this.f80553a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeView$initListener$3", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/ITimeZoneChosenListener;", "onChooseEndTime", "", "onChooseStartTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.d$e */
    public static final class C31684e implements ITimeZoneChosenListener {

        /* renamed from: a */
        final /* synthetic */ EditMultiTimeView f80565a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.ITimeZoneChosenListener
        /* renamed from: a */
        public void mo114311a() {
            ((EditMultiTimeContract.IEditMultiTimeViewAction) this.f80565a.mo118655q()).mo115395e();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.ITimeZoneChosenListener
        /* renamed from: b */
        public void mo114312b() {
            ((EditMultiTimeContract.IEditMultiTimeViewAction) this.f80565a.mo118655q()).mo115396f();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31684e(EditMultiTimeView dVar) {
            this.f80565a = dVar;
        }
    }

    /* renamed from: r */
    private final void m119948r() {
        m119951u();
        m119952v();
        m119950t();
        m119949s();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseViewCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m119948r();
        m119953w();
    }

    /* renamed from: t */
    private final void m119950t() {
        Typeface a = this.f80560i.mo114596a();
        Intrinsics.checkExpressionValueIsNotNull(a, "mViewDependency.dinAlternateBoldTypeface");
        ((EditFragmentTimeContainer) this.f80559h.findViewById(R.id.editFragmentTimeContainer)).setTimeTypeface(a);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: f */
    public void mo115402f() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115421j()) {
            mo115400d();
        } else {
            mo115401e();
        }
    }

    /* renamed from: A */
    private final void m119944A() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115421j()) {
            C31897a aVar = this.f80555d;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
            }
            aVar.mo116498a(((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115413b());
            return;
        }
        C31897a aVar2 = this.f80555d;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
        }
        aVar2.mo116498a(((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115416e());
    }

    /* renamed from: B */
    private final void m119945B() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115421j()) {
            C31912c cVar = this.f80556e;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
            }
            cVar.mo116498a(((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115414c());
            return;
        }
        C31912c cVar2 = this.f80556e;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        cVar2.mo116498a(((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115415d());
    }

    /* renamed from: C */
    private final void m119946C() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115412a()) {
            C31897a aVar = this.f80555d;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
            }
            aVar.mo116500c();
            return;
        }
        C31912c cVar = this.f80556e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        cVar.mo116526c();
    }

    /* renamed from: D */
    private final void m119947D() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115412a()) {
            C31897a aVar = this.f80555d;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
            }
            aVar.mo116501d();
            return;
        }
        C31912c cVar = this.f80556e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        cVar.mo116527d();
    }

    /* renamed from: w */
    private final void m119953w() {
        ((UDSwitch) this.f80559h.findViewById(R.id.allDaySwitchView)).setOnCheckedChangeListener(new C31681c(this));
        ((RelativeLayout) this.f80559h.findViewById(R.id.timeZoneContainer)).setOnClickListener(new View$OnClickListenerC31682d(this));
        ((EditFragmentTimeContainer) this.f80559h.findViewById(R.id.editFragmentTimeContainer)).setOnTimeChosenListener(new C31684e(this));
    }

    /* renamed from: x */
    private final void m119954x() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f80559h.findViewById(R.id.timeZoneContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.timeZoneContainer");
        relativeLayout.setVisibility(8);
        View findViewById = this.f80559h.findViewById(R.id.timeZoneContainerDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.timeZoneContainerDivider");
        findViewById.setVisibility(8);
    }

    /* renamed from: y */
    private final void m119955y() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f80559h.findViewById(R.id.timeZoneContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.timeZoneContainer");
        relativeLayout.setVisibility(0);
        View findViewById = this.f80559h.findViewById(R.id.timeZoneContainerDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.timeZoneContainerDivider");
        findViewById.setVisibility(0);
    }

    /* renamed from: z */
    private final void m119956z() {
        TextView textView = (TextView) this.f80559h.findViewById(R.id.timeZoneTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.timeZoneTitle");
        textView.setVisibility(0);
        View findViewById = this.f80559h.findViewById(R.id.timeZoneTitleBottomDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.timeZoneTitleBottomDivider");
        findViewById.setVisibility(0);
        RecyclerView recyclerView = (RecyclerView) this.f80559h.findViewById(R.id.timeZoneAttendeeRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.timeZoneAttendeeRv");
        recyclerView.setVisibility(0);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: a */
    public void mo115397a() {
        mo115407k();
        mo115399c();
        mo115404h();
        mo115405i();
        ((UDSwitch) this.f80559h.findViewById(R.id.allDaySwitchView)).setCheckedIgnoreEvent(((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115412a());
        mo115406j();
        mo115398b();
        mo115402f();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: b */
    public void mo115398b() {
        List<AttendeeLocalTimeData> i = ((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115420i();
        if (CollectionUtils.isEmpty(i)) {
            mo115408l();
            return;
        }
        m119956z();
        this.f80557f.mo115457a(i);
        this.f80557f.notifyDataSetChanged();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: d */
    public void mo115400d() {
        m119947D();
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115417f()) {
            ((EditFragmentTimeContainer) this.f80559h.findViewById(R.id.editFragmentTimeContainer)).mo115956i();
        } else {
            ((EditFragmentTimeContainer) this.f80559h.findViewById(R.id.editFragmentTimeContainer)).mo115957j();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: e */
    public void mo115401e() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115417f()) {
            ((EditFragmentTimeContainer) this.f80559h.findViewById(R.id.editFragmentTimeContainer)).mo115954g();
            m119946C();
            return;
        }
        ((EditFragmentTimeContainer) this.f80559h.findViewById(R.id.editFragmentTimeContainer)).mo115955h();
        m119947D();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: i */
    public void mo115405i() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115412a()) {
            m119944A();
            C31897a aVar = this.f80555d;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
            }
            aVar.mo116501d();
            return;
        }
        m119945B();
        C31912c cVar = this.f80556e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        cVar.mo116527d();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: k */
    public void mo115407k() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115421j()) {
            ((EditFragmentTimeContainer) this.f80559h.findViewById(R.id.editFragmentTimeContainer)).mo115952e();
        } else {
            ((EditFragmentTimeContainer) this.f80559h.findViewById(R.id.editFragmentTimeContainer)).mo115953f();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: l */
    public void mo115408l() {
        TextView textView = (TextView) this.f80559h.findViewById(R.id.timeZoneTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.timeZoneTitle");
        textView.setVisibility(8);
        View findViewById = this.f80559h.findViewById(R.id.timeZoneTitleBottomDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.timeZoneTitleBottomDivider");
        findViewById.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) this.f80559h.findViewById(R.id.timeZoneAttendeeRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.timeZoneAttendeeRv");
        recyclerView.setVisibility(8);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: m */
    public void mo115409m() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115412a()) {
            C31897a aVar = this.f80555d;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
            }
            aVar.mo116502e();
            return;
        }
        C31912c cVar = this.f80556e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        cVar.mo116522a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: n */
    public void mo115410n() {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f80553a).title(R.string.Calendar_Common_Notice)).message(R.string.Calendar_Edit_InvalidEndTime)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: s */
    private final void m119949s() {
        RecyclerView recyclerView = (RecyclerView) this.f80559h.findViewById(R.id.timeZoneAttendeeRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.timeZoneAttendeeRv");
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f80553a));
        RecyclerView recyclerView2 = (RecyclerView) this.f80559h.findViewById(R.id.timeZoneAttendeeRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "mRootView.timeZoneAttendeeRv");
        recyclerView2.setAdapter(this.f80557f);
        RecyclerView recyclerView3 = (RecyclerView) this.f80559h.findViewById(R.id.timeZoneAttendeeRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "mRootView.timeZoneAttendeeRv");
        RecyclerView.ItemAnimator itemAnimator = recyclerView3.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            this.f80557f.mo115456a(new C31680b(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
    }

    /* renamed from: u */
    private final void m119951u() {
        CommonTitleBar commonTitleBar = (CommonTitleBar) this.f80559h.findViewById(R.id.editFragmentTitleBar);
        commonTitleBar.setLeftImageDrawable(null);
        commonTitleBar.setLeftText(R.string.Calendar_Common_Cancel);
        ((CommonTitleBar) this.f80559h.findViewById(R.id.editFragmentTitleBar)).setLeftClickListener(new View$OnClickListenerC31685f(this));
        ((CommonTitleBar) this.f80559h.findViewById(R.id.editFragmentTitleBar)).addAction(new C31686g(this, C32634ae.m125182b(R.string.Calendar_Common_Done), R.color.primary_pri_500));
        ((CommonTitleBar) this.f80559h.findViewById(R.id.editFragmentTitleBar)).setDividerVisible(false);
    }

    /* renamed from: v */
    private final void m119952v() {
        C31897a aVar = new C31897a(this.f80553a, (FrameLayout) this.f80559h.findViewById(R.id.timePickerContainer), this.f80558g);
        this.f80555d = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
        }
        aVar.mo116496a(7);
        FrameLayout frameLayout = (FrameLayout) this.f80559h.findViewById(R.id.timePickerContainer);
        C31897a aVar2 = this.f80555d;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
        }
        frameLayout.addView(aVar2.mo116499b(), 0);
        C31897a aVar3 = this.f80555d;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
        }
        View b = aVar3.mo116499b();
        Intrinsics.checkExpressionValueIsNotNull(b, "mAllDayWheelTime.contentView");
        b.setVisibility(4);
        C31912c cVar = new C31912c(this.f80553a, (FrameLayout) this.f80559h.findViewById(R.id.timePickerContainer), this.f80558g);
        this.f80556e = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        cVar.mo116523a(7);
        FrameLayout frameLayout2 = (FrameLayout) this.f80559h.findViewById(R.id.timePickerContainer);
        C31912c cVar2 = this.f80556e;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        frameLayout2.addView(cVar2.mo116528e(), 0);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: c */
    public void mo115399c() {
        CalendarDate calendarDate;
        CalendarDate calendarDate2;
        boolean a = ((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115412a();
        EditMultiTimeContract.IEditMultiTimeViewData dVar = (EditMultiTimeContract.IEditMultiTimeViewData) mo118654p();
        if (a) {
            calendarDate = dVar.mo115413b();
        } else {
            calendarDate = dVar.mo115414c();
        }
        EditMultiTimeContract.IEditMultiTimeViewData dVar2 = (EditMultiTimeContract.IEditMultiTimeViewData) mo118654p();
        if (a) {
            calendarDate2 = dVar2.mo115416e();
        } else {
            calendarDate2 = dVar2.mo115415d();
        }
        ((EditFragmentTimeContainer) this.f80559h.findViewById(R.id.editFragmentTimeContainer)).mo115948a(a, calendarDate, calendarDate2, ((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115418g());
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: g */
    public void mo115403g() {
        FrameLayout frameLayout = (FrameLayout) this.f80559h.findViewById(R.id.timePickerContainer);
        C31912c cVar = this.f80556e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        frameLayout.removeView(cVar.mo116528e());
        this.f80556e = new C31912c(this.f80553a, (FrameLayout) this.f80559h.findViewById(R.id.timePickerContainer), this.f80558g);
        FrameLayout frameLayout2 = (FrameLayout) this.f80559h.findViewById(R.id.timePickerContainer);
        C31912c cVar2 = this.f80556e;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        frameLayout2.addView(cVar2.mo116528e(), 0);
        mo115405i();
        mo115402f();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: h */
    public void mo115404h() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115412a()) {
            C31897a aVar = this.f80555d;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
            }
            View b = aVar.mo116499b();
            Intrinsics.checkExpressionValueIsNotNull(b, "mAllDayWheelTime.contentView");
            b.setVisibility(0);
            C31912c cVar = this.f80556e;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
            }
            View e = cVar.mo116528e();
            Intrinsics.checkExpressionValueIsNotNull(e, "mHourMinuteWheelTime.contentView");
            e.setVisibility(4);
            return;
        }
        C31897a aVar2 = this.f80555d;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
        }
        View b2 = aVar2.mo116499b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "mAllDayWheelTime.contentView");
        b2.setVisibility(4);
        C31912c cVar2 = this.f80556e;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        View e2 = cVar2.mo116528e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "mHourMinuteWheelTime.contentView");
        e2.setVisibility(0);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: j */
    public void mo115406j() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115412a() || !C30022a.f74883b.mo112695c()) {
            m119954x();
            return;
        }
        m119955y();
        TextView textView = (TextView) this.f80559h.findViewById(R.id.currentTimeZoneName);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.currentTimeZoneName");
        textView.setText(EventTimeZoneUtils.f80188a.mo114871a(((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115418g(), new Date(((EditMultiTimeContract.IEditMultiTimeViewData) mo118654p()).mo115414c().getTimeInMilliSeconds())));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeView$initAttendeeRecycleView$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeLocalTimeAdapter/AttendeeTimeZoneAdapter$GuestsItemClickListener;", "onClickLocalTimeItem", "", "attendeeList", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/UserAttendeeBaseInfo;", "localTimeString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.d$b */
    public static final class C31680b implements AttendeeTimeZoneAdapter.GuestsItemClickListener {

        /* renamed from: a */
        final /* synthetic */ EditMultiTimeView f80561a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31680b(EditMultiTimeView dVar) {
            this.f80561a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.attendeeLocalTimeAdapter.AttendeeTimeZoneAdapter.GuestsItemClickListener
        /* renamed from: a */
        public void mo115458a(List<UserAttendeeBaseInfo> list, String str) {
            Intrinsics.checkParameterIsNotNull(list, "attendeeList");
            Intrinsics.checkParameterIsNotNull(str, "localTimeString");
            if (!CollectionUtils.isEmpty(list)) {
                GeneralHitPoint.m124269r();
                if (this.f80561a.f80554b == null) {
                    this.f80561a.f80554b = new AttendeeDisplayDialog(this.f80561a.f80553a, R.style.ReplyMessageDialog);
                }
                AttendeeDisplayDialog bVar = this.f80561a.f80554b;
                if (bVar != null) {
                    bVar.mo115428a(list);
                }
                AttendeeDisplayDialog bVar2 = this.f80561a.f80554b;
                if (bVar2 != null) {
                    bVar2.mo115427a(str);
                }
                AttendeeDisplayDialog bVar3 = this.f80561a.f80554b;
                if (bVar3 != null) {
                    bVar3.show();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.d$f */
    public static final class View$OnClickListenerC31685f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditMultiTimeView f80566a;

        View$OnClickListenerC31685f(EditMultiTimeView dVar) {
            this.f80566a = dVar;
        }

        public final void onClick(View view) {
            ((EditMultiTimeContract.IEditMultiTimeViewAction) this.f80566a.mo118655q()).mo115392b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeView$initTitleBar$3", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.d$g */
    public static final class C31686g extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ EditMultiTimeView f80567a;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            ((EditMultiTimeContract.IEditMultiTimeViewAction) this.f80567a.mo118655q()).mo115389a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31686g(EditMultiTimeView dVar, String str, int i) {
            super(str, i);
            this.f80567a = dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "calendar", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "kotlin.jvm.PlatformType", "onRefreshCalendar"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.d$h */
    static final class C31687h implements AbstractC31910b.AbstractC31911a {

        /* renamed from: a */
        final /* synthetic */ EditMultiTimeView f80568a;

        C31687h(EditMultiTimeView dVar) {
            this.f80568a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31910b.AbstractC31911a
        /* renamed from: a */
        public final void mo115475a(CalendarDate calendarDate) {
            ((EditMultiTimeContract.IEditMultiTimeViewAction) this.f80568a.mo118655q()).mo115390a(new CalendarDate(calendarDate, ((EditMultiTimeContract.IEditMultiTimeViewData) this.f80568a.mo118654p()).mo115418g()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.d$d */
    public static final class View$OnClickListenerC31682d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditMultiTimeView f80563a;

        View$OnClickListenerC31682d(EditMultiTimeView dVar) {
            this.f80563a = dVar;
        }

        public final void onClick(View view) {
            TimeZoneSelectorDialog fVar = new TimeZoneSelectorDialog(this.f80563a.f80553a, R.style.CalendarTransparentDialog, TimeZoneEnterView.Source.EDIT_EVENT, ((EditMultiTimeContract.IEditMultiTimeViewData) this.f80563a.mo118654p()).mo115419h());
            fVar.mo112543a(new ISelectTimeZoneChangeListener(this) {
                /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeView.View$OnClickListenerC31682d.C316831 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC31682d f80564a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f80564a = r1;
                }

                @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ISelectTimeZoneChangeListener
                /* renamed from: a */
                public void mo108585a(String str) {
                    Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
                    ((EditMultiTimeContract.IEditMultiTimeViewAction) this.f80564a.f80563a.mo118655q()).mo115391a(str);
                }
            });
            fVar.show();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.d$c */
    public static final class C31681c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ EditMultiTimeView f80562a;

        C31681c(EditMultiTimeView dVar) {
            this.f80562a = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                ((EditMultiTimeContract.IEditMultiTimeViewAction) this.f80562a.mo118655q()).mo115393c();
            } else {
                ((EditMultiTimeContract.IEditMultiTimeViewAction) this.f80562a.mo118655q()).mo115394d();
            }
        }
    }

    public EditMultiTimeView(View view, C31534a.AbstractC31535a aVar) {
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(aVar, "mViewDependency");
        this.f80559h = view;
        this.f80560i = aVar;
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "mRootView.context");
        this.f80553a = context;
    }
}
