package com.ss.android.lark.calendar.impl.features.meetingroom.signin;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.calendar.v1.InstanceCheckInInfo;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.adapter.ContactAdapter;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.InactiveReason;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.MeetingRoomSignInState;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.helper.SignInStateHelper;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.MtRoomSignInStateView;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.SignInCountDownView;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseViewCalendar;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.StatusBarUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u0012\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\b\u0010#\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020\u0015H\u0002J\u0012\u0010%\u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\b\u0010&\u001a\u00020\u0015H\u0002J\b\u0010'\u001a\u00020\u0015H\u0002J\u0012\u0010(\u001a\u00020\u00152\b\u0010)\u001a\u0004\u0018\u00010\"H\u0002J\b\u0010*\u001a\u00020\u0015H\u0002J\b\u0010+\u001a\u00020\u0015H\u0002J\b\u0010,\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020\u0015H\u0016J\u0010\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0015H\u0016J\b\u00102\u001a\u00020\u0015H\u0002J\b\u00103\u001a\u00020\u0015H\u0002J\b\u00104\u001a\u00020\u0015H\u0016J\b\u00105\u001a\u00020\u0015H\u0016J\b\u00106\u001a\u00020\u0015H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u00067"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/MeetingRoomSignInView;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BaseViewCalendar;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IViewData;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IViewAction;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IMtRoomSignInViewApi;", "rootView", "Landroid/view/View;", "activity", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "(Landroid/view/View;Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;)V", "getActivity", "()Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "contactAdapter", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/adapter/ContactAdapter;", "getContactAdapter", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/adapter/ContactAdapter;", "setContactAdapter", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/adapter/ContactAdapter;)V", "getRootView", "()Landroid/view/View;", "create", "", "hideLoading", "hideNextCheckInTip", "initLoadingView", "initNextContainer", "initSignInContainer", "initStateContainer", "initTextSize", "initTitleBar", "initView", "refreshAllView", "refreshBlockContainer", "signInState", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/MeetingRoomSignInState;", "refreshNextContainerWhenDisable", "refreshNextInactiveInstance", "refreshNextShow", "refreshNextTipContainer", "refreshResourceInfoContainer", "refreshSignBackground", "currentSignInState", "refreshSignInContainer", "setBookContainer", "setWindowConfig", "showFirstActiveToast", "showLoadError", "errText", "", "showLoading", "showNextAlreadyCheckInTip", "showNextNotCheckInTip", "showSignInErrorToast", "showSignInSuccessToast", "stopCountDown", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.g */
public final class MeetingRoomSignInView extends BaseViewCalendar<IMtRoomSignInContract.IViewData, IMtRoomSignInContract.IViewAction> implements IMtRoomSignInContract.IMtRoomSignInViewApi {

    /* renamed from: a */
    private ContactAdapter f82233a;

    /* renamed from: b */
    private final View f82234b;

    /* renamed from: c */
    private final CalendarBaseActivity f82235c;

    /* renamed from: h */
    public final View mo117468h() {
        return this.f82234b;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseViewCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m122561i();
        m122562j();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/signin/MeetingRoomSignInView$initLoadingView$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/CalendarLoadingView$OnLoadingViewClickedListener;", "onTitleBarBackPressed", "", "onTryAgainClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.g$a */
    public static final class C32165a implements CalendarLoadingView.AbstractC31882a {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSignInView f82236a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: a */
        public void mo110519a() {
            ((IMtRoomSignInContract.IViewAction) this.f82236a.mo118655q()).mo117378g();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: b */
        public void mo110520b() {
            ((IMtRoomSignInContract.IViewAction) this.f82236a.mo118655q()).mo117374c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32165a(MeetingRoomSignInView gVar) {
            this.f82236a = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016¨\u0006\u0014"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/signin/MeetingRoomSignInView$initStateContainer$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/widget/MtRoomSignInStateView$SignInViewDependency;", "getBlocker", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "state", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/MeetingRoomSignInState;", "getCanUserBlockResource", "", "getIdleTimeString", "", "getInactiveReason", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/InactiveReason;", "getInactiveReasonString", "inactiveReason", "getInstanceTimeText", "isSignInInstanceStarted", "onAvatarClicked", "", BottomDialog.f17198f, "onBlockTvClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.g$c */
    public static final class C32167c implements MtRoomSignInStateView.SignInViewDependency {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSignInView f82238a;

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.MtRoomSignInStateView.SignInViewDependency
        /* renamed from: a */
        public boolean mo117473a() {
            return ((IMtRoomSignInContract.IViewData) this.f82238a.mo118654p()).mo117394o();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.MtRoomSignInStateView.SignInViewDependency
        /* renamed from: b */
        public InactiveReason mo117474b() {
            return ((IMtRoomSignInContract.IViewData) this.f82238a.mo118654p()).mo117393n();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.MtRoomSignInStateView.SignInViewDependency
        /* renamed from: c */
        public void mo117476c() {
            ((IMtRoomSignInContract.IViewAction) this.f82238a.mo118655q()).mo117375d();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.MtRoomSignInStateView.SignInViewDependency
        /* renamed from: d */
        public boolean mo117477d() {
            return ((IMtRoomSignInContract.IViewData) this.f82238a.mo118654p()).mo117395p();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32167c(MeetingRoomSignInView gVar) {
            this.f82238a = gVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.MtRoomSignInStateView.SignInViewDependency
        /* renamed from: a */
        public CalendarEventCreator mo117470a(MeetingRoomSignInState meetingRoomSignInState) {
            if (meetingRoomSignInState == MeetingRoomSignInState.NEED_CHECK_IN) {
                return ((IMtRoomSignInContract.IViewData) this.f82238a.mo118654p()).mo117388i();
            }
            return ((IMtRoomSignInContract.IViewData) this.f82238a.mo118654p()).mo117384e();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.MtRoomSignInStateView.SignInViewDependency
        /* renamed from: a */
        public String mo117471a(InactiveReason inactiveReason) {
            Intrinsics.checkParameterIsNotNull(inactiveReason, "inactiveReason");
            return ((IMtRoomSignInContract.IViewData) this.f82238a.mo118654p()).mo117380a(inactiveReason);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.MtRoomSignInStateView.SignInViewDependency
        /* renamed from: b */
        public String mo117475b(MeetingRoomSignInState meetingRoomSignInState) {
            if (meetingRoomSignInState == MeetingRoomSignInState.NEED_CHECK_IN) {
                return ((IMtRoomSignInContract.IViewData) this.f82238a.mo118654p()).mo117387h();
            }
            if (meetingRoomSignInState == MeetingRoomSignInState.IDLE) {
                return ((IMtRoomSignInContract.IViewData) this.f82238a.mo118654p()).mo117402w();
            }
            return ((IMtRoomSignInContract.IViewData) this.f82238a.mo118654p()).mo117383d();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.MtRoomSignInStateView.SignInViewDependency
        /* renamed from: a */
        public void mo117472a(String str) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            ((IMtRoomSignInContract.IViewAction) this.f82238a.mo118655q()).mo117372a(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/signin/MeetingRoomSignInView$refreshSignInContainer$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/widget/SignInCountDownView$CountDownListener;", "onFinished", "", "updateTimeStamp", "timeStamp", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.g$f */
    public static final class C32170f implements SignInCountDownView.CountDownListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSignInView f82242a;

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.SignInCountDownView.CountDownListener
        /* renamed from: a */
        public void mo117480a() {
            ((IMtRoomSignInContract.IViewAction) this.f82242a.mo118655q()).mo117377f();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32170f(MeetingRoomSignInView gVar) {
            this.f82242a = gVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.SignInCountDownView.CountDownListener
        /* renamed from: a */
        public void mo117481a(long j) {
            if (((IMtRoomSignInContract.IViewData) this.f82242a.mo118654p()).mo117379a() == MeetingRoomSignInState.NEED_CHECK_IN) {
                ((MtRoomSignInStateView) this.f82242a.mo117468h().findViewById(R.id.currentStatusContainer)).mo117486b();
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInViewApi
    /* renamed from: b */
    public void mo117365b() {
        ((SignInCountDownView) this.f82234b.findViewById(R.id.timeCountDownView)).mo117495b();
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInViewApi
    /* renamed from: d */
    public void mo117367d() {
        LKUIToast.show(this.f82235c, (int) R.string.Calendar_MeetingRoom_FailedToCheckIn);
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInViewApi
    /* renamed from: e */
    public void mo117368e() {
        LKUIToast.show(this.f82235c, (int) R.string.Calendar_MeetingRoom_QRCodeActivated);
    }

    /* renamed from: A */
    private final void m122557A() {
        ((RelativeLayout) this.f82234b.findViewById(R.id.meetingRoomBlockTipContainer)).setOnClickListener(new View$OnClickListenerC32171g(this));
    }

    /* renamed from: j */
    private final void m122562j() {
        m122563k();
        m122575y();
        m122576z();
        m122557A();
        m122571u();
        m122572v();
        m122573w();
    }

    /* renamed from: k */
    private final void m122563k() {
        ((CommonTitleBar) this.f82234b.findViewById(R.id.titleBar)).setLeftImageResource(R.drawable.ud_icon_close_outlined, R.color.static_white);
    }

    /* renamed from: u */
    private final void m122571u() {
        ((MtRoomSignInStateView) this.f82234b.findViewById(R.id.currentStatusContainer)).setSignInViewDependency(new C32167c(this));
    }

    /* renamed from: z */
    private final void m122576z() {
        ((TextView) this.f82234b.findViewById(R.id.signInActionTv)).setOnClickListener(new View$OnClickListenerC32166b(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInViewApi
    /* renamed from: f */
    public void mo117369f() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f82234b.findViewById(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "rootView.loadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) this.f82234b.findViewById(R.id.loadingView)).mo116402a();
    }

    /* renamed from: i */
    private final void m122561i() {
        CalendarBaseActivity calendarBaseActivity = this.f82235c;
        RomUtils.m94941b(calendarBaseActivity, calendarBaseActivity.getWindow());
        StatusBarUtil.setTranslucentForImageView(this.f82235c, 0, (CommonTitleBar) this.f82234b.findViewById(R.id.titleBar), (CommonTitleBar) this.f82234b.findViewById(R.id.title_bar));
    }

    /* renamed from: r */
    private final void m122568r() {
        TextView textView = (TextView) this.f82234b.findViewById(R.id.nextSignInTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.nextSignInTipTv");
        textView.setVisibility(8);
        ImageView imageView = (ImageView) this.f82234b.findViewById(R.id.nextMeetingSignTipIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.nextMeetingSignTipIv");
        imageView.setVisibility(8);
        TextView textView2 = (TextView) this.f82234b.findViewById(R.id.nextSignInActionTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.nextSignInActionTv");
        textView2.setVisibility(8);
    }

    /* renamed from: v */
    private final void m122572v() {
        Drawable mutate;
        TextView textView = (TextView) this.f82234b.findViewById(R.id.nextSignInActionTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.nextSignInActionTv");
        Drawable background = textView.getBackground();
        if (!(background instanceof GradientDrawable)) {
            background = null;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (gradientDrawable != null && (mutate = gradientDrawable.mutate()) != null) {
            mutate.setAlpha(51);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInViewApi
    /* renamed from: a */
    public void mo117363a() {
        MeetingRoomSignInState a = ((IMtRoomSignInContract.IViewData) mo118654p()).mo117379a();
        m122558a(a);
        m122574x();
        ((MtRoomSignInStateView) this.f82234b.findViewById(R.id.currentStatusContainer)).mo117485a(a);
        m122559b(a);
        m122560c(a);
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInViewApi
    /* renamed from: c */
    public void mo117366c() {
        CalendarBaseActivity calendarBaseActivity = this.f82235c;
        new UDToast.Builder(this.f82235c).mo91641a(UDIconUtils.getIconDrawable(calendarBaseActivity, (int) R.drawable.ud_icon_yes_outlined, UDColorUtils.getColor(calendarBaseActivity, R.color.static_white))).mo91637a(R.string.Calendar_MeetingRoom_CheckedIn).mo91655j().show();
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInViewApi
    /* renamed from: g */
    public void mo117370g() {
        ((CalendarLoadingView) this.f82234b.findViewById(R.id.loadingView)).mo116404b();
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f82234b.findViewById(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "rootView.loadingView");
        calendarLoadingView.setVisibility(8);
    }

    /* renamed from: n */
    private final void m122566n() {
        TextView textView = (TextView) this.f82234b.findViewById(R.id.nextSignInTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.nextSignInTipTv");
        textView.setVisibility(0);
        ImageView imageView = (ImageView) this.f82234b.findViewById(R.id.nextMeetingSignTipIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.nextMeetingSignTipIv");
        imageView.setVisibility(0);
        TextView textView2 = (TextView) this.f82234b.findViewById(R.id.nextSignInActionTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.nextSignInActionTv");
        textView2.setVisibility(0);
        TextView textView3 = (TextView) this.f82234b.findViewById(R.id.nextSignInActionTv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "rootView.nextSignInActionTv");
        textView3.setText(C32634ae.m125182b(R.string.Calendar_MeetingRoom_WaitForCheckInButton));
        TextView textView4 = (TextView) this.f82234b.findViewById(R.id.nextSignInTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "rootView.nextSignInTipTv");
        textView4.setText(C32634ae.m125180a(R.plurals.Calendar_MeetingRoom_CheckInDescription, (int) (((IMtRoomSignInContract.IViewData) mo118654p()).mo117396q() / ((long) 60))));
    }

    /* renamed from: o */
    private final void m122567o() {
        TextView textView = (TextView) this.f82234b.findViewById(R.id.nextSignInTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.nextSignInTipTv");
        textView.setVisibility(8);
        ImageView imageView = (ImageView) this.f82234b.findViewById(R.id.nextMeetingSignTipIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.nextMeetingSignTipIv");
        imageView.setVisibility(8);
        TextView textView2 = (TextView) this.f82234b.findViewById(R.id.nextSignInActionTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.nextSignInActionTv");
        textView2.setVisibility(0);
        TextView textView3 = (TextView) this.f82234b.findViewById(R.id.nextSignInActionTv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "rootView.nextSignInActionTv");
        textView3.setText(C32634ae.m125182b(R.string.Calendar_MeetingRoom_CheckedInTip));
    }

    /* renamed from: w */
    private final void m122573w() {
        TextView textView = (TextView) this.f82234b.findViewById(R.id.meetingRoomName);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.meetingRoomName");
        TextPaint paint = textView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        TextView textView2 = (TextView) this.f82234b.findViewById(R.id.inactiveMeetingTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.inactiveMeetingTimeTv");
        TextPaint paint2 = textView2.getPaint();
        if (paint2 != null) {
            paint2.setFakeBoldText(true);
        }
        TextView textView3 = (TextView) this.f82234b.findViewById(R.id.blockTipBottomTv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "rootView.blockTipBottomTv");
        TextPaint paint3 = textView3.getPaint();
        if (paint3 != null) {
            paint3.setFakeBoldText(true);
        }
    }

    /* renamed from: x */
    private final void m122574x() {
        TextView textView = (TextView) this.f82234b.findViewById(R.id.meetingRoomName);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.meetingRoomName");
        textView.setText(((IMtRoomSignInContract.IViewData) mo118654p()).mo117381b());
        TextView textView2 = (TextView) this.f82234b.findViewById(R.id.meetingRoomBuildingTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.meetingRoomBuildingTv");
        textView2.setText(((IMtRoomSignInContract.IViewData) mo118654p()).mo117382c());
        ((RelativeLayout) this.f82234b.findViewById(R.id.meetingBaseInfoContainer)).setOnClickListener(new View$OnClickListenerC32169e(this));
    }

    /* renamed from: y */
    private final void m122575y() {
        ((CalendarLoadingView) this.f82234b.findViewById(R.id.loadingView)).setTitleBarVisibility(0);
        ((CalendarLoadingView) this.f82234b.findViewById(R.id.loadingView)).setTitleLeftImageResource(R.drawable.ic_svg_titlebar_close);
        ((CalendarLoadingView) this.f82234b.findViewById(R.id.loadingView)).setTitleBarText(C32634ae.m125182b(R.string.Calendar_MeetingRoom_MeetingRoomCheckIn));
        ((CalendarLoadingView) this.f82234b.findViewById(R.id.loadingView)).setOnLoadingViewClickedListener(new C32165a(this));
    }

    /* renamed from: l */
    private final void m122564l() {
        View findViewById = this.f82234b.findViewById(R.id.nextTipRootContainer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.nextTipRootContainer");
        findViewById.setVisibility(8);
        View findViewById2 = this.f82234b.findViewById(R.id.inactiveTipRootContainer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.inactiveTipRootContainer");
        findViewById2.setVisibility(8);
        RelativeLayout relativeLayout = (RelativeLayout) this.f82234b.findViewById(R.id.signInRootContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.signInRootContainer");
        relativeLayout.setVisibility(0);
        TextView textView = (TextView) this.f82234b.findViewById(R.id.releaseAfterTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.releaseAfterTipTv");
        textView.setText(C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_MeetingRoom_ReleasedDescription, "time", String.valueOf(((IMtRoomSignInContract.IViewData) mo118654p()).mo117397r() / ((long) 60))));
        ((SignInCountDownView) this.f82234b.findViewById(R.id.timeCountDownView)).setCountDownListener(new C32170f(this));
        ((SignInCountDownView) this.f82234b.findViewById(R.id.timeCountDownView)).mo117494a(((IMtRoomSignInContract.IViewData) mo118654p()).mo117400u(), ((IMtRoomSignInContract.IViewData) mo118654p()).mo117396q() + ((IMtRoomSignInContract.IViewData) mo118654p()).mo117397r());
    }

    /* renamed from: m */
    private final void m122565m() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f82234b.findViewById(R.id.signInRootContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.signInRootContainer");
        relativeLayout.setVisibility(8);
        if (!((IMtRoomSignInContract.IViewData) mo118654p()).mo117390k()) {
            View findViewById = this.f82234b.findViewById(R.id.nextTipRootContainer);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.nextTipRootContainer");
            findViewById.setVisibility(8);
            View findViewById2 = this.f82234b.findViewById(R.id.inactiveTipRootContainer);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.inactiveTipRootContainer");
            findViewById2.setVisibility(8);
        } else if (((IMtRoomSignInContract.IViewData) mo118654p()).mo117391l()) {
            m122569s();
        } else {
            View findViewById3 = this.f82234b.findViewById(R.id.inactiveTipRootContainer);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.inactiveTipRootContainer");
            findViewById3.setVisibility(8);
            View findViewById4 = this.f82234b.findViewById(R.id.nextTipRootContainer);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.nextTipRootContainer");
            findViewById4.setVisibility(0);
            TextView textView = (TextView) this.f82234b.findViewById(R.id.nextMeetingTimeTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.nextMeetingTimeTv");
            textView.setText(((IMtRoomSignInContract.IViewData) mo118654p()).mo117385f());
            CalendarEventCreator g = ((IMtRoomSignInContract.IViewData) mo118654p()).mo117386g();
            SelectableRoundedImageView selectableRoundedImageView = (SelectableRoundedImageView) this.f82234b.findViewById(R.id.nextBlockerAvatarIv);
            Intrinsics.checkExpressionValueIsNotNull(selectableRoundedImageView, "rootView.nextBlockerAvatarIv");
            TextView textView2 = (TextView) this.f82234b.findViewById(R.id.nextBlockerNameTv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.nextBlockerNameTv");
            SignInStateHelper.f82200a.mo117411a(this.f82235c, g, selectableRoundedImageView, textView2);
            ((SelectableRoundedImageView) this.f82234b.findViewById(R.id.nextBlockerAvatarIv)).setOnClickListener(new View$OnClickListenerC32168d(this, g));
            InstanceCheckInInfo.CheckInType j = ((IMtRoomSignInContract.IViewData) mo118654p()).mo117389j();
            if (j != null) {
                int i = C32172h.f82246c[j.ordinal()];
                if (i == 1) {
                    m122566n();
                    return;
                } else if (i == 2) {
                    m122567o();
                    return;
                }
            }
            m122568r();
        }
    }

    /* renamed from: s */
    private final void m122569s() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f82234b.findViewById(R.id.signInRootContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.signInRootContainer");
        relativeLayout.setVisibility(8);
        View findViewById = this.f82234b.findViewById(R.id.nextTipRootContainer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.nextTipRootContainer");
        findViewById.setVisibility(8);
        View findViewById2 = this.f82234b.findViewById(R.id.inactiveTipRootContainer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.inactiveTipRootContainer");
        findViewById2.setVisibility(0);
        TextView textView = (TextView) this.f82234b.findViewById(R.id.inactiveMeetingTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.inactiveMeetingTimeTv");
        textView.setVisibility(0);
        TextView textView2 = (TextView) this.f82234b.findViewById(R.id.inactiveTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.inactiveTipTv");
        textView2.setVisibility(0);
        RecyclerView recyclerView = (RecyclerView) this.f82234b.findViewById(R.id.inactiveContactRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.inactiveContactRv");
        recyclerView.setVisibility(8);
        TextView textView3 = (TextView) this.f82234b.findViewById(R.id.inactiveMeetingTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "rootView.inactiveMeetingTitle");
        textView3.setText(C32634ae.m125182b(R.string.Calendar_MeetingRoom_NextPeriodNotAvailableCopy));
        TextView textView4 = (TextView) this.f82234b.findViewById(R.id.inactiveMeetingTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "rootView.inactiveMeetingTimeTv");
        textView4.setText(((IMtRoomSignInContract.IViewData) mo118654p()).mo117385f());
        TextView textView5 = (TextView) this.f82234b.findViewById(R.id.inactiveTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "rootView.inactiveTipTv");
        textView5.setText(((IMtRoomSignInContract.IViewData) mo118654p()).mo117392m());
    }

    /* renamed from: t */
    private final void m122570t() {
        boolean z;
        RelativeLayout relativeLayout = (RelativeLayout) this.f82234b.findViewById(R.id.signInRootContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.signInRootContainer");
        relativeLayout.setVisibility(8);
        View findViewById = this.f82234b.findViewById(R.id.nextTipRootContainer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.nextTipRootContainer");
        findViewById.setVisibility(8);
        List<CalendarEventCreator> v = ((IMtRoomSignInContract.IViewData) mo118654p()).mo117401v();
        List<CalendarEventCreator> list = v;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || ((IMtRoomSignInContract.IViewData) mo118654p()).mo117393n() != InactiveReason.DURING_REQUISITION) {
            View findViewById2 = this.f82234b.findViewById(R.id.inactiveTipRootContainer);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.inactiveTipRootContainer");
            findViewById2.setVisibility(8);
            return;
        }
        View findViewById3 = this.f82234b.findViewById(R.id.inactiveTipRootContainer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.inactiveTipRootContainer");
        findViewById3.setVisibility(0);
        TextView textView = (TextView) this.f82234b.findViewById(R.id.inactiveMeetingTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.inactiveMeetingTitle");
        textView.setText(C32634ae.m125182b(R.string.Calendar_Detail_Contacts));
        TextView textView2 = (TextView) this.f82234b.findViewById(R.id.inactiveTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.inactiveTipTv");
        textView2.setVisibility(8);
        TextView textView3 = (TextView) this.f82234b.findViewById(R.id.inactiveMeetingTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "rootView.inactiveMeetingTimeTv");
        textView3.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) this.f82234b.findViewById(R.id.inactiveContactRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.inactiveContactRv");
        recyclerView.setVisibility(0);
        this.f82233a = new ContactAdapter();
        RecyclerView recyclerView2 = (RecyclerView) this.f82234b.findViewById(R.id.inactiveContactRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.inactiveContactRv");
        recyclerView2.setAdapter(this.f82233a);
        RecyclerView recyclerView3 = (RecyclerView) this.f82234b.findViewById(R.id.inactiveContactRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rootView.inactiveContactRv");
        recyclerView3.setLayoutManager(new LinearLayoutManager(this.f82235c));
        ContactAdapter aVar = this.f82233a;
        if (aVar != null) {
            aVar.mo117405a(v);
        }
        ContactAdapter aVar2 = this.f82233a;
        if (aVar2 != null) {
            aVar2.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.g$b */
    public static final class View$OnClickListenerC32166b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSignInView f82237a;

        View$OnClickListenerC32166b(MeetingRoomSignInView gVar) {
            this.f82237a = gVar;
        }

        public final void onClick(View view) {
            ((IMtRoomSignInContract.IViewAction) this.f82237a.mo118655q()).mo117376e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.g$e */
    public static final class View$OnClickListenerC32169e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSignInView f82241a;

        View$OnClickListenerC32169e(MeetingRoomSignInView gVar) {
            this.f82241a = gVar;
        }

        public final void onClick(View view) {
            ((IMtRoomSignInContract.IViewAction) this.f82241a.mo118655q()).mo117371a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.g$g */
    public static final class View$OnClickListenerC32171g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSignInView f82243a;

        View$OnClickListenerC32171g(MeetingRoomSignInView gVar) {
            this.f82243a = gVar;
        }

        public final void onClick(View view) {
            ((IMtRoomSignInContract.IViewAction) this.f82243a.mo118655q()).mo117373b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.g$d */
    public static final class View$OnClickListenerC32168d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSignInView f82239a;

        /* renamed from: b */
        final /* synthetic */ CalendarEventCreator f82240b;

        View$OnClickListenerC32168d(MeetingRoomSignInView gVar, CalendarEventCreator calendarEventCreator) {
            this.f82239a = gVar;
            this.f82240b = calendarEventCreator;
        }

        public final void onClick(View view) {
            String str;
            IMtRoomSignInContract.IViewAction cVar = (IMtRoomSignInContract.IViewAction) this.f82239a.mo118655q();
            CalendarEventCreator calendarEventCreator = this.f82240b;
            if (calendarEventCreator == null || (str = calendarEventCreator.getChatterId()) == null) {
                str = "";
            }
            cVar.mo117372a(str);
        }
    }

    /* renamed from: b */
    private final void m122559b(MeetingRoomSignInState meetingRoomSignInState) {
        ((SignInCountDownView) this.f82234b.findViewById(R.id.timeCountDownView)).mo117495b();
        if (meetingRoomSignInState != null) {
            int i = C32172h.f82245b[meetingRoomSignInState.ordinal()];
            if (i == 1) {
                m122564l();
            } else if (i == 2 || i == 3) {
                m122565m();
            } else if (i == 4) {
                m122570t();
            }
        }
    }

    /* renamed from: a */
    private final void m122558a(MeetingRoomSignInState meetingRoomSignInState) {
        int i;
        int i2;
        if (meetingRoomSignInState != null) {
            int i3 = C32172h.f82244a[meetingRoomSignInState.ordinal()];
            if (i3 == 1) {
                i = C32634ae.m125178a(R.color.cal_token_signin_bg_free);
            } else if (i3 == 2) {
                i = C32634ae.m125178a(R.color.cal_token_signin_bg_using);
            } else if (i3 == 3) {
                i = C32634ae.m125178a(R.color.cal_token_signin_bg_process);
            } else if (i3 == 4) {
                i = C32634ae.m125178a(R.color.ud_N600);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (meetingRoomSignInState == MeetingRoomSignInState.IN_USE) {
                i2 = (int) 229.5d;
            } else {
                i2 = 255;
            }
            ScrollView scrollView = (ScrollView) this.f82234b.findViewById(R.id.signInRootView);
            Intrinsics.checkExpressionValueIsNotNull(scrollView, "rootView.signInRootView");
            Drawable background = scrollView.getBackground();
            if (!(background instanceof ColorDrawable)) {
                background = null;
            }
            ColorDrawable colorDrawable = (ColorDrawable) background;
            if (colorDrawable != null) {
                colorDrawable.setColor(i);
                colorDrawable.setAlpha(i2);
            }
        }
    }

    /* renamed from: c */
    private final void m122560c(MeetingRoomSignInState meetingRoomSignInState) {
        if (!((IMtRoomSignInContract.IViewData) mo118654p()).mo117398s() || meetingRoomSignInState == null || !((IMtRoomSignInContract.IViewData) mo118654p()).mo117395p() || ((IMtRoomSignInContract.IViewData) mo118654p()).mo117399t()) {
            RelativeLayout relativeLayout = (RelativeLayout) this.f82234b.findViewById(R.id.meetingRoomBlockTipContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.meetingRoomBlockTipContainer");
            relativeLayout.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f82234b.findViewById(R.id.meetingRoomBlockTipContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "rootView.meetingRoomBlockTipContainer");
        relativeLayout2.setVisibility(0);
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInViewApi
    /* renamed from: a */
    public void mo117364a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "errText");
        ((CalendarLoadingView) this.f82234b.findViewById(R.id.loadingView)).setErrorText(str);
        ((CalendarLoadingView) this.f82234b.findViewById(R.id.loadingView)).mo116405c();
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f82234b.findViewById(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "rootView.loadingView");
        calendarLoadingView.setVisibility(0);
    }

    public MeetingRoomSignInView(View view, CalendarBaseActivity calendarBaseActivity) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(calendarBaseActivity, "activity");
        this.f82234b = view;
        this.f82235c = calendarBaseActivity;
    }
}
