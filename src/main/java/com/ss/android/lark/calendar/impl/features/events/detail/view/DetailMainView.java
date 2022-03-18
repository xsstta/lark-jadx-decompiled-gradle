package com.ss.android.lark.calendar.impl.features.events.detail.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.AttendeeFragment;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.meetingroom.DetailResourceFragment;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.TransferChatterPickerFragment;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.TransferEventData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IDialogData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IFooterData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.share.EventShareDialog;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedLiveStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedVideoChatStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.EventScrollParentLayout;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.HeaderPanelBackground;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.utils.UIHelper;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002\u001c\"\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020%H\u0002J\b\u0010'\u001a\u00020%H\u0016J\b\u0010(\u001a\u00020%H\u0016J\b\u0010)\u001a\u00020%H\u0016J\b\u0010*\u001a\u00020\bH\u0016J\b\u0010+\u001a\u00020,H\u0002J\u0012\u0010-\u001a\u00020\u00102\b\b\u0002\u0010.\u001a\u00020/H\u0002J\u0012\u00100\u001a\u00020\u00102\b\b\u0002\u0010.\u001a\u00020/H\u0002J\u001a\u00101\u001a\u00020%2\b\u00102\u001a\u0004\u0018\u00010\u000e2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00103\u001a\u00020%H\u0016J\b\u00104\u001a\u00020%H\u0002J\b\u00105\u001a\u00020%H\u0016J\u0010\u00106\u001a\u00020%2\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020%H\u0016J\b\u0010:\u001a\u00020%H\u0016J\b\u0010;\u001a\u00020%H\u0016J\u0010\u0010<\u001a\u00020%2\u0006\u0010=\u001a\u00020>H\u0016J\u0018\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u0018H\u0016J\u0012\u0010B\u001a\u00020%2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\u0010\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u00020\u001aH\u0016J\b\u0010G\u001a\u00020%H\u0016J\b\u0010H\u001a\u00020%H\u0016J\b\u0010I\u001a\u00020%H\u0016J\b\u0010J\u001a\u00020%H\u0016J\b\u0010K\u001a\u00020%H\u0016J\u0010\u0010L\u001a\u00020%2\u0006\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u00020%H\u0016J\u0018\u0010P\u001a\u00020%2\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010RH\u0016J\b\u0010T\u001a\u00020%H\u0016J\b\u0010U\u001a\u00020%H\u0016J\"\u0010V\u001a\u00020%2\b\u00102\u001a\u0004\u0018\u00010\u000e2\u0006\u0010W\u001a\u00020/2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u0010X\u001a\u00020%2\u0006\u0010Y\u001a\u00020SH\u0016J\u0010\u0010Z\u001a\u00020%2\u0006\u0010[\u001a\u00020SH\u0016J\b\u0010\\\u001a\u00020%H\u0016J\b\u0010]\u001a\u00020%H\u0016J\b\u0010^\u001a\u00020%H\u0016J\u0010\u0010_\u001a\u00020%2\u0006\u0010`\u001a\u00020/H\u0016J\b\u0010a\u001a\u00020%H\u0016J\b\u0010b\u001a\u00020%H\u0016J\b\u0010c\u001a\u00020%H\u0016J \u0010d\u001a\u00020%2\u0006\u0010e\u001a\u00020S2\u0006\u0010f\u001a\u00020S2\u0006\u0010g\u001a\u00020hH\u0016J\u0010\u0010i\u001a\u00020%2\u0006\u0010j\u001a\u00020SH\u0016J\b\u0010k\u001a\u00020%H\u0016J\b\u0010l\u001a\u00020%H\u0016J\u0018\u0010m\u001a\u00020%2\u0006\u0010n\u001a\u00020\u00102\u0006\u0010o\u001a\u00020\u0010H\u0016J\u0010\u0010p\u001a\u00020%2\u0006\u0010n\u001a\u00020\u0010H\u0016J\u0010\u0010q\u001a\u00020%2\u0006\u0010n\u001a\u00020\u0010H\u0016J\u0010\u0010r\u001a\u00020%2\u0006\u0010s\u001a\u00020hH\u0016J\b\u0010t\u001a\u00020%H\u0016J\u0010\u0010u\u001a\u00020%2\u0006\u0010v\u001a\u00020\u0010H\u0016J\b\u0010w\u001a\u00020%H\u0016J\b\u0010x\u001a\u00020%H\u0016J\u0012\u0010y\u001a\u00020%2\b\u0010z\u001a\u0004\u0018\u00010{H\u0016J\b\u0010|\u001a\u00020%H\u0002J\u0012\u0010}\u001a\u00020%2\b\u0010z\u001a\u0004\u0018\u00010{H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u00020\"X\u0004¢\u0006\u0004\n\u0002\u0010#¨\u0006~"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/view/DetailMainView;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;", "mRootView", "Landroid/view/View;", "mViewDependency", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$ViewDependency;", "(Landroid/view/View;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$ViewDependency;)V", "mActivity", "Landroid/app/Activity;", "mAttendeeFragment", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/AttendeeFragment;", "mCommonDialog", "Lcom/ss/android/lark/calendar/impl/features/events/detail/view/CommonDialog;", "mCurrentFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "mEnterFragmentAnim", "", "mOutFragmentAnim", "mResourceFragment", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailResourceFragment;", "mScrollThreshold", "mTransferFragment", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferChatterPickerFragment;", "mViewAction", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailViewAction;", "mViewData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailViewData;", "resourceFragmentAction", "com/ss/android/lark/calendar/impl/features/events/detail/view/DetailMainView$resourceFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/view/DetailMainView$resourceFragmentAction$1;", "summeryFeedRange", "", "titleFeedRange", "transferFragmentAction", "com/ss/android/lark/calendar/impl/features/events/detail/view/DetailMainView$transferFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/view/DetailMainView$transferFragmentAction$1;", "backPressed", "", "checkUpdateResourceFragment", "create", "destroy", "finishActivity", "getActivity", "getAttendeeFragmentDependency", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/AttendeeFragment$OnAttendeeFragmentAction;", "getEnterFragmentAnim", "isVerticalOpen", "", "getOutFragmentAnim", "hideFragment", "fragment", "hideLaunchDetailView", "performanceMonitor", "refreshAttendeeNum", "refreshLiveStatusByVCPush", "associatedLiveStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedLiveStatus;", "refreshMeetingZone", "refreshTimeText", "refreshTitleActions", "refreshVideoStatusByVCPush", "associatedVideoChatStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedVideoChatStatus;", "setDependency", "vi", "vo", "setSavedInstanceState", "savedInstanceState", "Landroid/os/Bundle;", "setViewData", "viewData", "showAttendeeFragment", "showAttendeeListItem", "showCalendarItem", "showCreatorItem", "showDetailResourceFragment", "showEventShareDialog", "dependency", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareDialog$EventShareDependency;", "showEventShareImageDialog", "showEventView", "forbidItemName", "", "", "showExternalMinutesPermissionAlertDialog", "showFooter", "showFragment", "isFirstAdd", "showGroupRestrictionDialog", "message", "showInvalidEventErrorView", "errText", "showLaunchDetailView", "showLaunchErrorView", "showMeetingVideo", "showMeetingVideoStatus", "isLiving", "showNotCreateMeetingGroupOrMinuteDialog", "showNotJoinableDialog", "showOrganizerItem", "showRSVPCommentDialog", "invitorId", "invitorName", "rsvpStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "showRSVPCommentErrDialog", ApiHandler.API_CALLBACK_ERRMSG, "showRSVPCommentSucDialog", "showRequestDismiss", "showRequestErrToast", "tipType", "errCode", "showRequestSucToast", "showRequestToast", "showRsvpSpanMenu", "replyStatus", "showTimeLineShareDialog", "showToast", "resIds", "showTransferChatterPickerFragment", "showTransferRepeatEventDialog", "updateEventShareImageDialog", "bitmap", "Landroid/graphics/Bitmap;", "updateThresholdAfterLayout", "updateTimeLineShareDialog", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.b */
public final class DetailMainView implements ICalendarDetailContact.IDetailView {

    /* renamed from: a */
    public final Activity f79669a;

    /* renamed from: b */
    public ICalendarDetailContact.IDetailViewAction f79670b;

    /* renamed from: c */
    public final float f79671c = ((float) UIHelper.dp2px(30.0f));

    /* renamed from: d */
    public final float f79672d = ((float) UIHelper.dp2px(40.0f));

    /* renamed from: e */
    public final int f79673e = R.anim.slide_right_left;

    /* renamed from: f */
    public final int f79674f = R.anim.slide_left_right;

    /* renamed from: g */
    public int f79675g;

    /* renamed from: h */
    public View$OnClickListenerC31538b f79676h;

    /* renamed from: i */
    public AttendeeFragment f79677i;

    /* renamed from: j */
    public final View f79678j;

    /* renamed from: k */
    public final ICalendarDetailContact.ViewDependency f79679k;

    /* renamed from: l */
    private ICalendarDetailContact.IDetailViewData f79680l;

    /* renamed from: m */
    private final CommonDialog f79681m;

    /* renamed from: n */
    private DetailResourceFragment f79682n;

    /* renamed from: o */
    private TransferChatterPickerFragment f79683o;

    /* renamed from: p */
    private final C31447e f79684p = new C31447e(this);

    /* renamed from: q */
    private final C31449g f79685q = new C31449g(this);

    /* renamed from: b */
    private final int m118307b(boolean z) {
        return z ? R.anim.activity_enter_from_bottom : R.anim.slide_right_left;
    }

    /* renamed from: c */
    private final int m118308c(boolean z) {
        return z ? R.anim.activity_close_to_bottom : R.anim.slide_left_right;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: a */
    public Activity mo113492a() {
        return this.f79669a;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: a */
    public void mo113502a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "errText");
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f79678j.findViewById(R.id.launchLoadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "mRootView.launchLoadingView");
        boolean z = false;
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) this.f79678j.findViewById(R.id.launchLoadingView)).mo116405c();
        if (str.length() > 0) {
            z = true;
        }
        if (!z) {
            str = null;
        }
        if (str == null) {
            str = C32634ae.m125182b(R.string.Calendar_Common_FailedtoLoad1);
        }
        ((CalendarLoadingView) this.f79678j.findViewById(R.id.launchLoadingView)).setErrorText(str);
        ((CalendarLoadingView) this.f79678j.findViewById(R.id.launchLoadingView)).setErrorTipPanel(C32634ae.m125184d(R.drawable.illustration_empty_neutral_no_schedule));
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: a */
    public void mo113503a(String str, String str2, RSVPStatus rSVPStatus) {
        Intrinsics.checkParameterIsNotNull(str, "invitorId");
        Intrinsics.checkParameterIsNotNull(str2, "invitorName");
        Intrinsics.checkParameterIsNotNull(rSVPStatus, "rsvpStatus");
        this.f79681m.mo114109a(str, str2, rSVPStatus);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: a */
    public void mo113504a(List<String> list) {
        HeaderPanelBackground headerPanelBackground = (HeaderPanelBackground) this.f79678j.findViewById(R.id.headerBgView);
        ICalendarDetailContact.IDetailViewData dVar = this.f79680l;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        headerPanelBackground.setRectColor(dVar.mo113560b().mo113680a());
        ((EventTitleView) this.f79678j.findViewById(R.id.titleView)).mo114092a();
        ((EventTitleView) this.f79678j.findViewById(R.id.titleView)).mo114095b();
        ((EventHeaderView) this.f79678j.findViewById(R.id.headerView)).mo114077a();
        ((EventBodyView) this.f79678j.findViewById(R.id.bodyView)).mo114055a(list);
        C30022a.f74884c.mo108450a(new C31448f(this));
        m118301A();
        m118302B();
        m118303C();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: a */
    public void mo113505a(boolean z) {
        ((EventBodyView) this.f79678j.findViewById(R.id.bodyView)).mo114056a(z);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: a */
    public void mo113501a(AssociatedVideoChatStatus associatedVideoChatStatus) {
        Intrinsics.checkParameterIsNotNull(associatedVideoChatStatus, "associatedVideoChatStatus");
        ((EventBodyView) this.f79678j.findViewById(R.id.bodyView)).mo114053a(associatedVideoChatStatus);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: a */
    public void mo113500a(AssociatedLiveStatus associatedLiveStatus) {
        Intrinsics.checkParameterIsNotNull(associatedLiveStatus, "associatedLiveStatus");
        ((EventBodyView) this.f79678j.findViewById(R.id.bodyView)).mo114052a(associatedLiveStatus);
    }

    /* renamed from: a */
    public final void mo114122a(View$OnClickListenerC31538b bVar, boolean z) {
        this.f79679k.mo113371c(bVar, m118307b(z), m118308c(z));
        this.f79676h = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/DetailMainView$create$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/CalendarLoadingView$OnLoadingViewClickedListener;", "onTitleBarBackPressed", "", "onTryAgainClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.b$a */
    public static final class C31443a implements CalendarLoadingView.AbstractC31882a {

        /* renamed from: a */
        final /* synthetic */ DetailMainView f79686a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: b */
        public void mo110520b() {
            this.f79686a.mo113506b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: a */
        public void mo110519a() {
            DetailMainView.m118305a(this.f79686a).mo113557k();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31443a(DetailMainView bVar) {
            this.f79686a = bVar;
        }
    }

    /* renamed from: D */
    private final AttendeeFragment.OnAttendeeFragmentAction m118304D() {
        return new C31445c(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: b */
    public void mo113506b() {
        this.f79679k.mo113367a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: m */
    public void mo113522m() {
        this.f79681m.mo114116e();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: n */
    public void mo113523n() {
        this.f79681m.mo114110b();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: q */
    public void mo113526q() {
        this.f79681m.mo114101a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: s */
    public void mo113528s() {
        this.f79681m.mo114117f();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: t */
    public void mo113529t() {
        this.f79681m.mo114118g();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: u */
    public void mo113530u() {
        this.f79681m.mo114114c();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: v */
    public void mo113531v() {
        this.f79681m.mo114115d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/DetailMainView$resourceFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailResourceFragment$DetailResourceFragmentAction;", "onBackPressed", "", "onMeetingRoomInfoClicked", "calendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.b$e */
    public static final class C31447e implements DetailResourceFragment.DetailResourceFragmentAction {

        /* renamed from: a */
        final /* synthetic */ DetailMainView f79690a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.meetingroom.DetailResourceFragment.DetailResourceFragmentAction
        /* renamed from: a */
        public void mo113715a() {
            DetailMainView bVar = this.f79690a;
            bVar.mo114122a(bVar.f79676h, false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31447e(DetailMainView bVar) {
            this.f79690a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.meetingroom.DetailResourceFragment.DetailResourceFragmentAction
        /* renamed from: a */
        public void mo113716a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            DetailMainView.m118305a(this.f79690a).mo113549c(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/DetailMainView$transferFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferChatterPickerFragment$TransferFragmentAction;", "onFragmentFinish", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.b$g */
    public static final class C31449g implements TransferChatterPickerFragment.TransferFragmentAction {

        /* renamed from: a */
        final /* synthetic */ DetailMainView f79692a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.TransferChatterPickerFragment.TransferFragmentAction
        /* renamed from: a */
        public void mo113830a() {
            DetailMainView bVar = this.f79692a;
            bVar.mo114122a(bVar.f79676h, true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31449g(DetailMainView bVar) {
            this.f79692a = bVar;
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        ((EventBodyView) this.f79678j.findViewById(R.id.bodyView)).mo114050a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: f */
    public void mo113515f() {
        ((EventHeaderView) this.f79678j.findViewById(R.id.headerView)).mo114081b();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: g */
    public void mo113516g() {
        ((EventBodyView) this.f79678j.findViewById(R.id.bodyView)).mo114057b();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: h */
    public void mo113517h() {
        ((EventBodyView) this.f79678j.findViewById(R.id.bodyView)).mo114058c();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: i */
    public void mo113518i() {
        ((EventBodyView) this.f79678j.findViewById(R.id.bodyView)).mo114061e();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: j */
    public void mo113519j() {
        ((EventBodyView) this.f79678j.findViewById(R.id.bodyView)).mo114059d();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: k */
    public void mo113520k() {
        ((EventFooterView) this.f79678j.findViewById(R.id.footerView)).mo114070a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: l */
    public void mo113521l() {
        ((EventBodyView) this.f79678j.findViewById(R.id.bodyView)).mo114063g();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: r */
    public void mo113527r() {
        ((EventTitleView) this.f79678j.findViewById(R.id.titleView)).mo114095b();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: w */
    public void mo113532w() {
        ((EventHeaderView) this.f79678j.findViewById(R.id.headerView)).mo114083c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/DetailMainView$getAttendeeFragmentDependency$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/AttendeeFragment$OnAttendeeFragmentAction;", "onFragmentBackPressed", "", "onOpenProfilePageClicked", "attendeeCalendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.b$c */
    public static final class C31445c implements AttendeeFragment.OnAttendeeFragmentAction {

        /* renamed from: a */
        final /* synthetic */ DetailMainView f79688a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.AttendeeFragment.OnAttendeeFragmentAction
        /* renamed from: a */
        public void mo113727a() {
            this.f79688a.f79679k.mo113371c(this.f79688a.f79677i, this.f79688a.f79673e, this.f79688a.f79674f);
            this.f79688a.f79676h = null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31445c(DetailMainView bVar) {
            this.f79688a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.AttendeeFragment.OnAttendeeFragmentAction
        /* renamed from: a */
        public void mo113728a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "attendeeCalendarId");
            DetailMainView.m118305a(this.f79688a).mo113543a(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/DetailMainView$performanceMonitor$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.b$d */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC31446d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ DetailMainView f79689a;

        public void onGlobalLayout() {
            CalendarPerfMonitor.m124413a("key_perf_cal_event_show");
            this.f79689a.f79678j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC31446d(DetailMainView bVar) {
            this.f79689a = bVar;
        }
    }

    /* renamed from: A */
    private final void m118301A() {
        this.f79678j.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC31450h(this));
    }

    /* renamed from: B */
    private final void m118302B() {
        View$OnClickListenerC31538b bVar = this.f79676h;
        if (bVar instanceof DetailResourceFragment) {
            DetailResourceFragment cVar = (DetailResourceFragment) bVar;
            ICalendarDetailContact.IDetailViewData dVar = this.f79680l;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            cVar.mo113713a(dVar.mo113561c().mo113650b());
        }
    }

    /* renamed from: C */
    private final void m118303C() {
        this.f79678j.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC31446d(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: c */
    public void mo113510c() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f79678j.findViewById(R.id.launchLoadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "mRootView.launchLoadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) this.f79678j.findViewById(R.id.launchLoadingView)).mo116402a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: d */
    public void mo113513d() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f79678j.findViewById(R.id.launchLoadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "mRootView.launchLoadingView");
        calendarLoadingView.setVisibility(8);
        ((CalendarLoadingView) this.f79678j.findViewById(R.id.launchLoadingView)).mo116404b();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: p */
    public void mo113525p() {
        View$OnClickListenerC31538b bVar = this.f79676h;
        if (bVar == null) {
            this.f79679k.mo113367a();
        } else if (!bVar.mo113714e()) {
            View$OnClickListenerC31538b bVar2 = this.f79676h;
            if (bVar2 != null) {
                bVar2.mo113714e();
            }
            this.f79676h = null;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: x */
    public void mo113533x() {
        new C25639g(this.f79669a).mo89242c(C32634ae.m125182b(R.string.Calendar_Toast_PrivateEventUnableToShare)).mo89224a(R.id.lkui_dialog_btn_center, R.string.Calendar_Common_GotIt, (DialogInterface.OnClickListener) null).mo89239c();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: y */
    public void mo113534y() {
        boolean z;
        if (this.f79682n == null) {
            z = true;
        } else {
            z = false;
        }
        ICalendarDetailContact.IDetailViewData dVar = this.f79680l;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        List<IBodyData.IMeetingRoomData> b = dVar.mo113561c().mo113650b();
        DetailResourceFragment cVar = this.f79682n;
        if (cVar != null) {
            cVar.mo113713a(b);
        } else {
            this.f79682n = new DetailResourceFragment(b, this.f79684p);
        }
        m118306a((View$OnClickListenerC31538b) this.f79682n, z, false);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        ((CalendarLoadingView) this.f79678j.findViewById(R.id.launchLoadingView)).setOnLoadingViewClickedListener(new C31443a(this));
        ((CalendarLoadingView) this.f79678j.findViewById(R.id.launchLoadingView)).setTitleBarVisibility(0);
        ((EventScrollParentLayout) this.f79678j.findViewById(R.id.scrollingParent)).setOnScrollListener(new C31444b(this));
        ((EventScrollParentLayout) this.f79678j.findViewById(R.id.scrollingParent)).mo114153a();
        StatusBarUtil.setTransparentForImageView(this.f79669a, (EventTitleView) this.f79678j.findViewById(R.id.titleView));
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: e */
    public void mo113514e() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f79678j.findViewById(R.id.launchLoadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "mRootView.launchLoadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) this.f79678j.findViewById(R.id.launchLoadingView)).mo116405c();
        ((CalendarLoadingView) this.f79678j.findViewById(R.id.launchLoadingView)).setErrorText(C32634ae.m125182b(R.string.Calendar_Common_FailedtoLoad1));
        ((CalendarLoadingView) this.f79678j.findViewById(R.id.launchLoadingView)).setErrorTipPanel(C32634ae.m125184d(R.drawable.illustration_empty_negative_load_failed));
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: z */
    public void mo113535z() {
        boolean z;
        TransferChatterPickerFragment bVar = this.f79683o;
        if (bVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (bVar == null) {
            TransferChatterPickerFragment bVar2 = new TransferChatterPickerFragment();
            this.f79683o = bVar2;
            if (bVar2 != null) {
                bVar2.mo113823a(this.f79685q);
            }
            ICalendarDetailContact.IDetailViewData dVar = this.f79680l;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            TransferEventData l = dVar.mo113559a().mo113701l();
            TransferChatterPickerFragment bVar3 = this.f79683o;
            if (bVar3 != null) {
                bVar3.setArguments(TransferChatterPickerFragment.f79291a.mo113829a(l));
            }
            Unit unit = Unit.INSTANCE;
        }
        TransferChatterPickerFragment bVar4 = this.f79683o;
        if (bVar4 != null) {
            m118306a((View$OnClickListenerC31538b) bVar4, z, true);
            bVar4.mo113828d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/DetailMainView$updateThresholdAfterLayout$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.b$h */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC31450h implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ DetailMainView f79693a;

        public void onGlobalLayout() {
            this.f79693a.f79678j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            DetailMainView bVar = this.f79693a;
            EventHeaderView eventHeaderView = (EventHeaderView) bVar.f79678j.findViewById(R.id.headerView);
            Intrinsics.checkExpressionValueIsNotNull(eventHeaderView, "mRootView.headerView");
            bVar.f79675g = eventHeaderView.getMeasuredHeight();
            int a = C30022a.f74882a.utilsDependency().mo108192a(this.f79693a.f79669a);
            HeaderPanelBackground headerPanelBackground = (HeaderPanelBackground) this.f79693a.f79678j.findViewById(R.id.headerBgView);
            Intrinsics.checkExpressionValueIsNotNull(headerPanelBackground, "mRootView.headerBgView");
            ViewGroup.LayoutParams layoutParams = headerPanelBackground.getLayoutParams();
            int i = this.f79693a.f79675g;
            EventTitleView eventTitleView = (EventTitleView) this.f79693a.f79678j.findViewById(R.id.titleView);
            Intrinsics.checkExpressionValueIsNotNull(eventTitleView, "mRootView.titleView");
            layoutParams.height = i + eventTitleView.getMeasuredHeight() + a;
            HeaderPanelBackground headerPanelBackground2 = (HeaderPanelBackground) this.f79693a.f79678j.findViewById(R.id.headerBgView);
            Intrinsics.checkExpressionValueIsNotNull(headerPanelBackground2, "mRootView.headerBgView");
            headerPanelBackground2.setLayoutParams(layoutParams);
            ((EventScrollParentLayout) this.f79693a.f79678j.findViewById(R.id.scrollingParent)).mo114154a(this.f79693a.f79675g);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC31450h(DetailMainView bVar) {
            this.f79693a = bVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r0 != null) goto L_0x0085;
     */
    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo113524o() {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.detail.view.DetailMainView.mo113524o():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/DetailMainView$create$scrollListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/EventScrollParentLayout$OnScrollListener;", "onScrollChanged", "", "dy", "", "scrollY", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.b$b */
    public static final class C31444b implements EventScrollParentLayout.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ DetailMainView f79687a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31444b(DetailMainView bVar) {
            this.f79687a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.EventScrollParentLayout.OnScrollListener
        /* renamed from: a */
        public void mo114123a(int i, int i2) {
            if (this.f79687a.f79675g <= 0) {
                ((EventTitleView) this.f79687a.f79678j.findViewById(R.id.titleView)).mo114093a(BitmapDescriptorFactory.HUE_RED);
                ((EventHeaderView) this.f79687a.f79678j.findViewById(R.id.headerView)).mo114078a(1.0f);
                ((EventHeaderView) this.f79687a.f79678j.findViewById(R.id.headerView)).mo114082b(1.0f);
                ((EventHeaderView) this.f79687a.f79678j.findViewById(R.id.headerView)).mo114084c(1.0f);
                ((EventHeaderView) this.f79687a.f79678j.findViewById(R.id.headerView)).setMeetingContainerAlpha(1.0f);
                return;
            }
            float f = (float) i2;
            float f2 = f * 1.0f;
            ((EventHeaderView) this.f79687a.f79678j.findViewById(R.id.headerView)).mo114078a(Math.min(Math.max(1.0f - (f2 / this.f79687a.f79672d), (float) BitmapDescriptorFactory.HUE_RED), 1.0f));
            ((EventHeaderView) this.f79687a.f79678j.findViewById(R.id.headerView)).mo114082b(Math.min(Math.max(1.0f - (f2 / ((float) this.f79687a.f79675g)), (float) BitmapDescriptorFactory.HUE_RED), 1.0f));
            float min = Math.min(Math.max(1.0f - (f2 / ((float) this.f79687a.f79675g)), (float) BitmapDescriptorFactory.HUE_RED), 1.0f);
            ((EventHeaderView) this.f79687a.f79678j.findViewById(R.id.headerView)).mo114084c(min);
            ((EventHeaderView) this.f79687a.f79678j.findViewById(R.id.headerView)).setMeetingContainerAlpha(min);
            ((EventTitleView) this.f79687a.f79678j.findViewById(R.id.titleView)).mo114093a(Math.min(Math.max(((f - this.f79687a.f79672d) * 1.0f) / this.f79687a.f79671c, (float) BitmapDescriptorFactory.HUE_RED), 1.0f));
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: c */
    public void mo113511c(int i) {
        this.f79681m.mo114111b(i);
    }

    /* renamed from: a */
    public static final /* synthetic */ ICalendarDetailContact.IDetailViewAction m118305a(DetailMainView bVar) {
        ICalendarDetailContact.IDetailViewAction cVar = bVar.f79670b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        return cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.b$f */
    static final class C31448f implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ DetailMainView f79691a;

        C31448f(DetailMainView bVar) {
            this.f79691a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            ((EventBodyView) this.f79691a.f79678j.findViewById(R.id.bodyView)).mo114062f();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: b */
    public void mo113507b(int i) {
        this.f79681m.mo114102a(i);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: a */
    public void mo113493a(int i) {
        LKUIToast.show(this.f79669a, C32634ae.m125182b(i));
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: b */
    public void mo113508b(Bitmap bitmap) {
        this.f79681m.mo114112b(bitmap);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: c */
    public void mo113512c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        this.f79681m.mo114108a(str);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: a */
    public void mo113495a(Bitmap bitmap) {
        this.f79681m.mo114104a(bitmap);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: b */
    public void mo113509b(String str) {
        Intrinsics.checkParameterIsNotNull(str, ApiHandler.API_CALLBACK_ERRMSG);
        this.f79681m.mo114113b(str);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: a */
    public void mo113496a(Bundle bundle) {
        ((EventBodyView) this.f79678j.findViewById(R.id.bodyView)).setSavedInstanceState(bundle);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: a */
    public void mo113497a(ICalendarDetailContact.IDetailViewData dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "viewData");
        ICalendarDetailContact.IDetailViewAction cVar = this.f79670b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        mo109795a(dVar, cVar);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: a */
    public void mo113498a(RSVPStatus rSVPStatus) {
        Intrinsics.checkParameterIsNotNull(rSVPStatus, "replyStatus");
        this.f79681m.mo114105a(rSVPStatus);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: a */
    public void mo113499a(EventShareDialog.EventShareDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f79681m.mo114107a(bVar);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailView
    /* renamed from: a */
    public void mo113494a(int i, int i2) {
        this.f79681m.mo114103a(i, i2);
    }

    public DetailMainView(View view, ICalendarDetailContact.ViewDependency eVar) {
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(eVar, "mViewDependency");
        this.f79678j = view;
        this.f79679k = eVar;
        Activity b = eVar.mo113369b();
        this.f79669a = b;
        this.f79681m = new CommonDialog(b);
    }

    /* renamed from: a */
    public void mo109795a(ICalendarDetailContact.IDetailViewData dVar, ICalendarDetailContact.IDetailViewAction cVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "vi");
        Intrinsics.checkParameterIsNotNull(cVar, "vo");
        this.f79680l = dVar;
        this.f79670b = cVar;
        CommonDialog aVar = this.f79681m;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        IDialogData e = dVar.mo113563e();
        ICalendarDetailContact.IDetailViewAction cVar2 = this.f79670b;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        aVar.mo114106a(e, cVar2);
        EventTitleView eventTitleView = (EventTitleView) this.f79678j.findViewById(R.id.titleView);
        ICalendarDetailContact.IDetailViewData dVar2 = this.f79680l;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        ITitleData a = dVar2.mo113559a();
        ICalendarDetailContact.IDetailViewAction cVar3 = this.f79670b;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        eventTitleView.mo114094a(a, cVar3);
        EventHeaderView eventHeaderView = (EventHeaderView) this.f79678j.findViewById(R.id.headerView);
        ICalendarDetailContact.IDetailViewData dVar3 = this.f79680l;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        IHeaderData b = dVar3.mo113560b();
        ICalendarDetailContact.IDetailViewAction cVar4 = this.f79670b;
        if (cVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        eventHeaderView.mo114080a(b, cVar4);
        EventBodyView eventBodyView = (EventBodyView) this.f79678j.findViewById(R.id.bodyView);
        ICalendarDetailContact.IDetailViewData dVar4 = this.f79680l;
        if (dVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        IBodyData c = dVar4.mo113561c();
        ICalendarDetailContact.IDetailViewAction cVar5 = this.f79670b;
        if (cVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        eventBodyView.mo114051a(c, cVar5);
        EventFooterView eventFooterView = (EventFooterView) this.f79678j.findViewById(R.id.footerView);
        ICalendarDetailContact.IDetailViewData dVar5 = this.f79680l;
        if (dVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        IFooterData d = dVar5.mo113562d();
        ICalendarDetailContact.IDetailViewAction cVar6 = this.f79670b;
        if (cVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        eventFooterView.mo114071a(d, cVar6);
    }

    /* renamed from: a */
    private final void m118306a(View$OnClickListenerC31538b bVar, boolean z, boolean z2) {
        int b = m118307b(z2);
        int c = m118308c(z2);
        if (z) {
            this.f79679k.mo113370b(bVar, b, c);
        } else {
            this.f79679k.mo113368a(bVar, b, c);
        }
        this.f79676h = bVar;
    }
}
