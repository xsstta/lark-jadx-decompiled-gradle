package com.ss.android.lark.mail.impl.widget.time.multitimezone;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.utils.C43762e;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.widget.time.AbstractC44081c;
import com.ss.android.lark.mail.impl.widget.time.C44076b;
import com.ss.android.lark.mail.impl.widget.time.C44093i;
import com.ss.android.lark.mail.impl.widget.time.CalendarDate;
import com.ss.android.lark.mail.impl.widget.time.ITimeChosenListener;
import com.ss.android.lark.mail.impl.widget.time.SwitchView;
import com.ss.android.lark.mail.impl.widget.time.TimeContainer;
import com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract;
import com.ss.android.lark.mail.impl.widget.time.mvp.BaseViewCalendar;
import com.ss.android.lark.mail.impl.widget.time.p2230a.C44074a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d*\u0001\u0015\u0018\u0000 F2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001FB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\"H\u0016J\b\u0010,\u001a\u00020\"H\u0002J\b\u0010-\u001a\u00020\"H\u0002J\b\u0010.\u001a\u00020\"H\u0002J\b\u0010/\u001a\u00020\"H\u0002J\b\u00100\u001a\u00020\"H\u0002J\b\u00101\u001a\u00020\"H\u0002J\b\u00102\u001a\u00020\"H\u0002J\b\u00103\u001a\u00020\"H\u0016J\b\u00104\u001a\u00020\"H\u0016J\b\u00105\u001a\u00020\"H\u0002J\b\u00106\u001a\u00020\"H\u0016J\b\u00107\u001a\u00020\"H\u0016J\b\u00108\u001a\u00020\"H\u0016J\b\u00109\u001a\u00020\"H\u0016J\b\u0010:\u001a\u00020\"H\u0016J\b\u0010;\u001a\u00020\"H\u0016J\b\u0010<\u001a\u00020\"H\u0016J\b\u0010=\u001a\u00020\"H\u0016J\b\u0010>\u001a\u00020\"H\u0016J\u0010\u0010?\u001a\u00020\"2\u0006\u0010@\u001a\u00020&H\u0016J\b\u0010A\u001a\u00020\"H\u0002J\b\u0010B\u001a\u00020\"H\u0002J\b\u0010C\u001a\u00020\"H\u0002J\b\u0010D\u001a\u00020\"H\u0002J\b\u0010E\u001a\u00020\"H\u0002R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u000e\u0010\r\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001a\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006G"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeView;", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/BaseViewCalendar;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeViewData;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeViewAction;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeViewApi;", "mRootView", "Landroid/view/View;", "mViewDependency", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/BaseFragmentView$ViewDependency;", "(Landroid/view/View;Lcom/ss/android/lark/mail/impl/widget/time/mvp/BaseFragmentView$ViewDependency;)V", "is24HourClock", "", "()Z", "isEnabledSave", "mAllDayWheelTime", "Lcom/ss/android/lark/mail/impl/widget/time/AllDayWheelTime;", "mContext", "Landroid/content/Context;", "mHourMinuteWheelTime", "Lcom/ss/android/lark/mail/impl/widget/time/HourMinuteWheelTime;", "mOnTimeChangeCallBack", "com/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeView$mOnTimeChangeCallBack$1", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeView$mOnTimeChangeCallBack$1;", "mOnTimeChosenCallBack", "Lcom/ss/android/lark/mail/impl/widget/time/BaseWheelView$IOnTimeChosen;", "getMRootView", "()Landroid/view/View;", "mSaveBtn", "getMSaveBtn", "setMSaveBtn", "(Landroid/view/View;)V", "getMViewDependency", "()Lcom/ss/android/lark/mail/impl/widget/time/mvp/BaseFragmentView$ViewDependency;", "create", "", "getRightActionText", "", "getTimeZoneDisplayName", "", "timeZone", "Ljava/util/TimeZone;", "date", "Ljava/util/Date;", "hideAttendeeRecycleView", "hideTimeZoneContainer", "initListener", "initTimeShowContent", "initTimeWheelView", "initTitleBar", "initView", "refreshAllDayWheelsData", "refreshEndErrorState", "refreshErrorState", "refreshHourMinuteWheelsData", "refreshPickerViewData", "refreshStartErrorState", "refreshTimeContainerData", "refreshTimeContainerSelectedState", "refreshTimeWheelViewData", "refreshTimeWheelViewVisibility", "refreshTimeWheelsOnTimeFormatChange", "refreshTimeZoneContainer", "refreshWholeEditTimeView", "showEndTimeInvalidDialog", "content", "showTimeZoneContainer", "showWheelViewDisableColor", "showWheelViewErrorColor", "showWheelViewNormalColor", "smoothToCurrentTime", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.e */
public final class EditMultiTimeView extends BaseViewCalendar<EditMultiTimeContract.IEditMultiTimeViewData, EditMultiTimeContract.IEditMultiTimeViewAction> implements EditMultiTimeContract.IEditMultiTimeViewApi {

    /* renamed from: e */
    public static final Companion f112015e = new Companion(null);

    /* renamed from: a */
    public Context f112016a;

    /* renamed from: b */
    public boolean f112017b = true;

    /* renamed from: c */
    public C44076b f112018c;

    /* renamed from: d */
    public C44093i f112019d;

    /* renamed from: f */
    private View f112020f;

    /* renamed from: g */
    private final boolean f112021g;

    /* renamed from: h */
    private final AbstractC44081c.AbstractC44083b f112022h = new C44116i(this);

    /* renamed from: i */
    private final C44115h f112023i = new C44115h(this);

    /* renamed from: j */
    private final View f112024j;

    /* renamed from: k */
    private final C44074a.AbstractC44075a f112025k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeView$Companion;", "", "()V", "WHEEL_VIEW_VISIBLE_SIZE", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeView$mOnTimeChangeCallBack$1", "Lcom/ss/android/lark/mail/impl/widget/time/BaseWheelView$IOnTimeChange;", "onTimeChange", "", "chooseDate", "Lcom/ss/android/lark/mail/impl/widget/time/CalendarDate;", "onTimeChangeStart", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.e$h */
    public static final class C44115h implements AbstractC44081c.AbstractC44082a {

        /* renamed from: a */
        final /* synthetic */ EditMultiTimeView f112033a;

        @Override // com.ss.android.lark.mail.impl.widget.time.AbstractC44081c.AbstractC44082a
        /* renamed from: a */
        public void mo156875a() {
            this.f112033a.f112017b = false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44115h(EditMultiTimeView eVar) {
            this.f112033a = eVar;
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.AbstractC44081c.AbstractC44082a
        /* renamed from: a */
        public void mo156876a(CalendarDate calendarDate) {
            if (calendarDate != null) {
                ((EditMultiTimeContract.IEditMultiTimeViewAction) this.f112033a.mo156857n()).mo156980a(calendarDate);
                if (((EditMultiTimeContract.IEditMultiTimeViewData) this.f112033a.mo156856m()).mo156999a()) {
                    EditMultiTimeView.m174813a(this.f112033a).mo156868e();
                } else {
                    EditMultiTimeView.m174815b(this.f112033a).mo156906e();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/widget/time/CalendarDate;", "getCurrentDate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.e$e */
    public static final class C44112e implements C44093i.AbstractC44096a {

        /* renamed from: a */
        final /* synthetic */ EditMultiTimeView f112030a;

        C44112e(EditMultiTimeView eVar) {
            this.f112030a = eVar;
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.C44093i.AbstractC44096a
        /* renamed from: a */
        public final CalendarDate mo156909a() {
            return ((EditMultiTimeContract.IEditMultiTimeViewData) this.f112030a.mo156856m()).mo157006h();
        }
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.mvp.BaseViewCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m174816o();
        m174821t();
    }

    /* renamed from: r */
    private final int m174819r() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157009k() == 2) {
            return R.string.Calendar_Common_Confirm;
        }
        return R.string.Calendar_Common_Save;
    }

    /* renamed from: y */
    private final void m174826y() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo156999a()) {
            C44076b bVar = this.f112018c;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
            }
            bVar.mo156866c();
        }
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: e */
    public void mo156992e() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157009k() == 0) {
            mo156990c();
        } else {
            mo156991d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeView$initListener$3", "Lcom/ss/android/lark/mail/impl/widget/time/ITimeChosenListener;", "onChooseEndTime", "", "onChooseStartTime", "onStartChooseTimeFragment", "updateIsChooseStartTime", "isChosenStart", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.e$d */
    public static final class C44111d implements ITimeChosenListener {

        /* renamed from: a */
        final /* synthetic */ EditMultiTimeView f112029a;

        @Override // com.ss.android.lark.mail.impl.widget.time.ITimeChosenListener
        /* renamed from: a */
        public void mo156911a() {
            if (((EditMultiTimeContract.IEditMultiTimeViewData) this.f112029a.mo156856m()).mo156999a() && ((EditMultiTimeContract.IEditMultiTimeViewData) this.f112029a.mo156856m()).mo157009k() != 1) {
                EditMultiTimeView.m174813a(this.f112029a).mo156870g();
            }
            ((EditMultiTimeContract.IEditMultiTimeViewAction) this.f112029a.mo156857n()).mo156986f();
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.ITimeChosenListener
        /* renamed from: b */
        public void mo156912b() {
            if (((EditMultiTimeContract.IEditMultiTimeViewData) this.f112029a.mo156856m()).mo156999a() && ((EditMultiTimeContract.IEditMultiTimeViewData) this.f112029a.mo156856m()).mo157009k() != 0) {
                EditMultiTimeView.m174813a(this.f112029a).mo156870g();
            }
            ((EditMultiTimeContract.IEditMultiTimeViewAction) this.f112029a.mo156857n()).mo156985e();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44111d(EditMultiTimeView eVar) {
            this.f112029a = eVar;
        }
    }

    /* renamed from: A */
    private final void m174812A() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo156999a()) {
            C44076b bVar = this.f112018c;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
            }
            bVar.mo156869f();
            return;
        }
        C44093i iVar = this.f112019d;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        iVar.mo156907f();
    }

    /* renamed from: o */
    private final void m174816o() {
        m174818q();
        m174820s();
        m174817p();
        m174822u();
        mo156997j();
        RelativeLayout relativeLayout = (RelativeLayout) this.f112024j.findViewById(R.id.editFragmentAllDayLayout);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.editFragmentAllDayLayout");
        relativeLayout.setVisibility(8);
    }

    /* renamed from: u */
    private final void m174822u() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f112024j.findViewById(R.id.timeZoneContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.timeZoneContainer");
        relativeLayout.setVisibility(8);
        View findViewById = this.f112024j.findViewById(R.id.timeZoneContainerDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.timeZoneContainerDivider");
        findViewById.setVisibility(8);
    }

    /* renamed from: v */
    private final void m174823v() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f112024j.findViewById(R.id.timeZoneContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.timeZoneContainer");
        relativeLayout.setVisibility(0);
        View findViewById = this.f112024j.findViewById(R.id.timeZoneContainerDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.timeZoneContainerDivider");
        findViewById.setVisibility(0);
    }

    /* renamed from: w */
    private final void m174824w() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157009k() == 0) {
            C44076b bVar = this.f112018c;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
            }
            bVar.mo156865b(((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157000b());
            return;
        }
        C44076b bVar2 = this.f112018c;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
        }
        bVar2.mo156865b(((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157003e());
    }

    /* renamed from: z */
    private final void m174827z() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo156999a()) {
            C44076b bVar = this.f112018c;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
            }
            bVar.mo156867d();
            return;
        }
        C44093i iVar = this.f112019d;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        iVar.mo156905d();
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: a */
    public void mo156987a() {
        mo156996i();
        mo156989b();
        mo156993f();
        mo156994g();
        ((SwitchView) this.f112024j.findViewById(R.id.allDaySwitchView)).setCheckedImmediatelyNoEvent(((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo156999a());
        mo156995h();
        mo156992e();
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: c */
    public void mo156990c() {
        m174812A();
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157004f()) {
            ((TimeContainer) this.f112024j.findViewById(R.id.eventTimeContainer)).mo156818i();
        } else {
            ((TimeContainer) this.f112024j.findViewById(R.id.eventTimeContainer)).mo156819j();
        }
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: i */
    public void mo156996i() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157009k() == 0) {
            ((TimeContainer) this.f112024j.findViewById(R.id.eventTimeContainer)).mo156814e();
        } else {
            ((TimeContainer) this.f112024j.findViewById(R.id.eventTimeContainer)).mo156815f();
        }
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: j */
    public void mo156997j() {
        TextView textView = (TextView) this.f112024j.findViewById(R.id.timeZoneTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.timeZoneTitle");
        textView.setVisibility(8);
        View findViewById = this.f112024j.findViewById(R.id.timeZoneTitleBottomDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.timeZoneTitleBottomDivider");
        findViewById.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) this.f112024j.findViewById(R.id.timeZoneAttendeeRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.timeZoneAttendeeRv");
        recyclerView.setVisibility(8);
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: k */
    public void mo156998k() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo156999a()) {
            C44076b bVar = this.f112018c;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
            }
            bVar.mo156871h();
            return;
        }
        C44093i iVar = this.f112019d;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        iVar.mo156898a();
    }

    /* renamed from: l */
    public final void mo157016l() {
        CalendarDate h = ((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157006h();
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo156999a()) {
            C44076b bVar = this.f112018c;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
            }
            bVar.mo156862a(h);
            return;
        }
        C44093i iVar = this.f112019d;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        iVar.mo156900a(h);
    }

    /* renamed from: p */
    private final void m174817p() {
        Typeface a = this.f112025k.mo156851a();
        Intrinsics.checkExpressionValueIsNotNull(a, "mViewDependency.dinAlternateBoldTypeface");
        ((TimeContainer) this.f112024j.findViewById(R.id.eventTimeContainer)).setTimeTypeface(a);
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157009k() == 2) {
            TimeContainer timeContainer = (TimeContainer) this.f112024j.findViewById(R.id.eventTimeContainer);
            Intrinsics.checkExpressionValueIsNotNull(timeContainer, "mRootView.eventTimeContainer");
            timeContainer.setVisibility(8);
            View findViewById = this.f112024j.findViewById(R.id.eventTimeContainerDivider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.eventTimeContainerDivider");
            findViewById.setVisibility(8);
            return;
        }
        TimeContainer timeContainer2 = (TimeContainer) this.f112024j.findViewById(R.id.eventTimeContainer);
        Intrinsics.checkExpressionValueIsNotNull(timeContainer2, "mRootView.eventTimeContainer");
        timeContainer2.setVisibility(0);
        View findViewById2 = this.f112024j.findViewById(R.id.eventTimeContainerDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.eventTimeContainerDivider");
        findViewById2.setVisibility(0);
    }

    /* renamed from: q */
    private final void m174818q() {
        ((CommonTitleBar) this.f112024j.findViewById(R.id.editFragmentTitleBar)).setLeftImageResource(R.drawable.ic_svg_titlebar_close);
        ((CommonTitleBar) this.f112024j.findViewById(R.id.editFragmentTitleBar)).setLeftClickListener(new View$OnClickListenerC44113f(this));
        C44114g gVar = new C44114g(this, C43819s.m173684a(m174819r()), R.color.mail_item_select_text_color, 16);
        ((CommonTitleBar) this.f112024j.findViewById(R.id.editFragmentTitleBar)).addAction(gVar);
        this.f112020f = ((CommonTitleBar) this.f112024j.findViewById(R.id.editFragmentTitleBar)).getViewByAction(gVar);
        ((CommonTitleBar) this.f112024j.findViewById(R.id.editFragmentTitleBar)).setDividerVisible(false);
        ((CommonTitleBar) this.f112024j.findViewById(R.id.editFragmentTitleBar)).setSubTitleColor(UIUtils.getColor(this.f112016a, R.color.lkui_N500));
    }

    /* renamed from: t */
    private final void m174821t() {
        ((SwitchView) this.f112024j.findViewById(R.id.allDaySwitchView)).setOnStateChangedListener(new C44108b(this));
        ((RelativeLayout) this.f112024j.findViewById(R.id.timeZoneContainer)).setOnClickListener(new C44109c(this));
        ((TimeContainer) this.f112024j.findViewById(R.id.eventTimeContainer)).setOnTimeChosenListener(new C44111d(this));
        C44093i iVar = this.f112019d;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        iVar.f111954b = new C44112e(this);
    }

    /* renamed from: x */
    private final void m174825x() {
        C44093i iVar = this.f112019d;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        iVar.mo156902a(((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157007i());
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157009k() == 0) {
            C44093i iVar2 = this.f112019d;
            if (iVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
            }
            iVar2.mo156865b(((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157001c());
            return;
        }
        C44093i iVar3 = this.f112019d;
        if (iVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        iVar3.mo156865b(((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157002d());
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: d */
    public void mo156991d() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157004f()) {
            ((TimeContainer) this.f112024j.findViewById(R.id.eventTimeContainer)).mo156816g();
            m174826y();
        } else if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157005g()) {
            ((TimeContainer) this.f112024j.findViewById(R.id.eventTimeContainer)).mo156817h();
            m174827z();
        } else {
            ((TimeContainer) this.f112024j.findViewById(R.id.eventTimeContainer)).mo156817h();
            m174812A();
        }
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: f */
    public void mo156993f() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo156999a()) {
            C44076b bVar = this.f112018c;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
            }
            View b = bVar.mo156864b();
            Intrinsics.checkExpressionValueIsNotNull(b, "mAllDayWheelTime.contentView");
            b.setVisibility(0);
            C44093i iVar = this.f112019d;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
            }
            View g = iVar.mo156908g();
            Intrinsics.checkExpressionValueIsNotNull(g, "mHourMinuteWheelTime.contentView");
            g.setVisibility(4);
            return;
        }
        C44076b bVar2 = this.f112018c;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
        }
        View b2 = bVar2.mo156864b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "mAllDayWheelTime.contentView");
        b2.setVisibility(4);
        C44093i iVar2 = this.f112019d;
        if (iVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        View g2 = iVar2.mo156908g();
        Intrinsics.checkExpressionValueIsNotNull(g2, "mHourMinuteWheelTime.contentView");
        g2.setVisibility(0);
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: g */
    public void mo156994g() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo156999a()) {
            m174824w();
            if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157004f()) {
                C44076b bVar = this.f112018c;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
                }
                bVar.mo156866c();
            } else if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157005g()) {
                C44076b bVar2 = this.f112018c;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
                }
                bVar2.mo156867d();
            } else {
                C44076b bVar3 = this.f112018c;
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
                }
                bVar3.mo156869f();
            }
        } else {
            m174825x();
            if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157005g()) {
                C44093i iVar = this.f112019d;
                if (iVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
                }
                iVar.mo156905d();
                return;
            }
            C44093i iVar2 = this.f112019d;
            if (iVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
            }
            iVar2.mo156907f();
        }
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: h */
    public void mo156995h() {
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo156999a()) {
            m174822u();
            return;
        }
        ((TextView) this.f112024j.findViewById(R.id.currentTimeZoneName)).setText(m174814a(((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157007i(), new Date(((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157002d().getTimeInMilliSeconds())));
        m174823v();
    }

    /* renamed from: s */
    private final void m174820s() {
        C44076b bVar = new C44076b(this.f112016a, (FrameLayout) this.f112024j.findViewById(R.id.timePickerContainer), this.f112022h);
        this.f112018c = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
        }
        bVar.mo156860a(7);
        FrameLayout frameLayout = (FrameLayout) this.f112024j.findViewById(R.id.timePickerContainer);
        C44076b bVar2 = this.f112018c;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
        }
        frameLayout.addView(bVar2.mo156864b(), 0);
        C44076b bVar3 = this.f112018c;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
        }
        View b = bVar3.mo156864b();
        Intrinsics.checkExpressionValueIsNotNull(b, "mAllDayWheelTime.contentView");
        b.setVisibility(4);
        C44093i iVar = new C44093i(this.f112016a, (FrameLayout) this.f112024j.findViewById(R.id.timePickerContainer), this.f112022h);
        this.f112019d = iVar;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        iVar.mo156899a(7);
        FrameLayout frameLayout2 = (FrameLayout) this.f112024j.findViewById(R.id.timePickerContainer);
        C44093i iVar2 = this.f112019d;
        if (iVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        frameLayout2.addView(iVar2.mo156908g(), 0);
        C44076b bVar4 = this.f112018c;
        if (bVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
        }
        bVar4.mo156863a(this.f112023i);
        C44093i iVar3 = this.f112019d;
        if (iVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        iVar3.mo156901a(this.f112023i);
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: b */
    public void mo156989b() {
        CalendarDate calendarDate;
        CalendarDate calendarDate2;
        boolean a = ((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo156999a();
        EditMultiTimeContract.IEditMultiTimeViewData dVar = (EditMultiTimeContract.IEditMultiTimeViewData) mo156856m();
        if (a) {
            calendarDate = dVar.mo157000b();
        } else {
            calendarDate = dVar.mo157001c();
        }
        EditMultiTimeContract.IEditMultiTimeViewData dVar2 = (EditMultiTimeContract.IEditMultiTimeViewData) mo156856m();
        if (a) {
            calendarDate2 = dVar2.mo157003e();
        } else {
            calendarDate2 = dVar2.mo157002d();
        }
        ((TimeContainer) this.f112024j.findViewById(R.id.eventTimeContainer)).mo156810a(a, calendarDate, calendarDate2, ((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157007i());
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157009k() != 2) {
            return;
        }
        if (((EditMultiTimeContract.IEditMultiTimeViewData) mo156856m()).mo157004f()) {
            ((CommonTitleBar) this.f112024j.findViewById(R.id.editFragmentTitleBar)).setTitle(C43819s.m173684a((int) R.string.Mail_SendLater_ScheduleSend));
            return;
        }
        ((CommonTitleBar) this.f112024j.findViewById(R.id.editFragmentTitleBar)).setTitle(C43819s.m173684a((int) R.string.Mail_SendLater_ScheduleSend) + "\n" + C43762e.m173476a(new Date(calendarDate2.getTimeInSeconds() * ((long) 1000)), this.f112021g, true));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeView$initListener$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.e$c */
    public static final class C44109c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ EditMultiTimeView f112027a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeView$initListener$2$onSingleClick$1", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ISelectTimeZoneChangeListener;", "onTimeZoneChanged", "", "timeZoneId", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.e$c$a */
        public static final class C44110a implements AbstractC44117f {

            /* renamed from: a */
            final /* synthetic */ C44109c f112028a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C44110a(C44109c cVar) {
                this.f112028a = cVar;
            }

            @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.AbstractC44117f
            /* renamed from: a */
            public void mo157017a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
                ((EditMultiTimeContract.IEditMultiTimeViewAction) this.f112028a.f112027a.mo156857n()).mo156981a(str);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44109c(EditMultiTimeView eVar) {
            this.f112027a = eVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            TimeZoneSelectorDialog jVar = new TimeZoneSelectorDialog(this.f112027a.f112016a, R.style.MailSelectTimeZoneDialog, "EDIT_EVENT", ((EditMultiTimeContract.IEditMultiTimeViewData) this.f112027a.mo156856m()).mo157008j());
            jVar.mo157039a(new C44110a(this));
            jVar.show();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeView$initListener$1", "Lcom/ss/android/lark/mail/impl/widget/time/SwitchView$OnStateChangedListener;", "toggleToOff", "", "view", "Lcom/ss/android/lark/mail/impl/widget/time/SwitchView;", "toggleToOn", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.e$b */
    public static final class C44108b implements SwitchView.AbstractC44072a {

        /* renamed from: a */
        final /* synthetic */ EditMultiTimeView f112026a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44108b(EditMultiTimeView eVar) {
            this.f112026a = eVar;
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.SwitchView.AbstractC44072a
        /* renamed from: a */
        public void mo156806a(SwitchView switchView) {
            Intrinsics.checkParameterIsNotNull(switchView, "view");
            ((EditMultiTimeContract.IEditMultiTimeViewAction) this.f112026a.mo156857n()).mo156983c();
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.SwitchView.AbstractC44072a
        /* renamed from: b */
        public void mo156807b(SwitchView switchView) {
            Intrinsics.checkParameterIsNotNull(switchView, "view");
            ((EditMultiTimeContract.IEditMultiTimeViewAction) this.f112026a.mo156857n()).mo156984d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.e$f */
    public static final class View$OnClickListenerC44113f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditMultiTimeView f112031a;

        View$OnClickListenerC44113f(EditMultiTimeView eVar) {
            this.f112031a = eVar;
        }

        public final void onClick(View view) {
            ((EditMultiTimeContract.IEditMultiTimeViewAction) this.f112031a.mo156857n()).mo156982b();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C44076b m174813a(EditMultiTimeView eVar) {
        C44076b bVar = eVar.f112018c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAllDayWheelTime");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ C44093i m174815b(EditMultiTimeView eVar) {
        C44093i iVar = eVar.f112019d;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHourMinuteWheelTime");
        }
        return iVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeView$initTitleBar$action$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.e$g */
    public static final class C44114g extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ EditMultiTimeView f112032a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            if (this.f112032a.f112017b) {
                ((EditMultiTimeContract.IEditMultiTimeViewAction) this.f112032a.mo156857n()).mo156979a();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44114g(EditMultiTimeView eVar, String str, int i, int i2) {
            super(str, i, i2);
            this.f112032a = eVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "calendar", "Lcom/ss/android/lark/mail/impl/widget/time/CalendarDate;", "kotlin.jvm.PlatformType", "onRefreshCalendar"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.e$i */
    static final class C44116i implements AbstractC44081c.AbstractC44083b {

        /* renamed from: a */
        final /* synthetic */ EditMultiTimeView f112034a;

        C44116i(EditMultiTimeView eVar) {
            this.f112034a = eVar;
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.AbstractC44081c.AbstractC44083b
        /* renamed from: a */
        public final void mo156877a(CalendarDate calendarDate) {
            Intrinsics.checkExpressionValueIsNotNull(calendarDate, "calendar");
            ((EditMultiTimeContract.IEditMultiTimeViewAction) this.f112034a.mo156857n()).mo156980a(calendarDate);
            if (((EditMultiTimeContract.IEditMultiTimeViewData) this.f112034a.mo156856m()).mo157005g()) {
                this.f112034a.mo157016l();
            } else {
                this.f112034a.f112017b = true;
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewApi
    /* renamed from: a */
    public void mo156988a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        UDDialogBuilder eVar = new UDDialogBuilder(this.f112016a);
        String string = UIHelper.getString(R.string.Calendar_Alert_Tips);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Calendar_Alert_Tips)");
        String string2 = UIHelper.getString(R.string.Calendar_Common_Confirm);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.str….Calendar_Common_Confirm)");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(string)).message(str)).addActionButton(R.id.ud_dialog_btn_primary, string2, (DialogInterface.OnClickListener) null)).autoDismiss(true)).show();
    }

    /* renamed from: a */
    private final String m174814a(TimeZone timeZone, Date date) {
        if (timeZone.inDaylightTime(date)) {
            String displayName = timeZone.getDisplayName(true, 1);
            Intrinsics.checkExpressionValueIsNotNull(displayName, "timeZone.getDisplayName(true, 1)");
            return displayName;
        }
        String displayName2 = timeZone.getDisplayName();
        Intrinsics.checkExpressionValueIsNotNull(displayName2, "timeZone.getDisplayName()");
        return displayName2;
    }

    public EditMultiTimeView(View view, C44074a.AbstractC44075a aVar) {
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(aVar, "mViewDependency");
        this.f112024j = view;
        this.f112025k = aVar;
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "mRootView.context");
        this.f112016a = context;
        AbstractC41849c a = C41816b.m166115a();
        Intrinsics.checkExpressionValueIsNotNull(a, "Host.get()");
        AbstractC41849c.AbstractC41867r F = a.mo150116F();
        Intrinsics.checkExpressionValueIsNotNull(F, "Host.get().settingDependency");
        this.f112021g = F.mo150192b();
    }
}
