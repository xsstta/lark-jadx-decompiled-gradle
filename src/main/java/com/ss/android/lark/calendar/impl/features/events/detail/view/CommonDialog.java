package com.ss.android.lark.calendar.impl.features.events.detail.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.Window;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IDialogData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.share.EventShareDialog;
import com.ss.android.lark.calendar.impl.features.events.detail.share.EventShareImageDialog;
import com.ss.android.lark.calendar.impl.features.events.detail.share.EventShareTimelineDialog;
import com.ss.android.lark.calendar.impl.features.events.detail.utils.ErrorTipsUtil;
import com.ss.android.lark.calendar.impl.features.events.detail.utils.RsvpUtil;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.ReplyMessageDialog;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogBuilder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogController;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.utils.LogMsgGenerator;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 =2\u00020\u0001:\u0001=B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0016\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0014J\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u0016J\u0006\u0010!\u001a\u00020\u0016J\u000e\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0016J\u001e\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020$J\u0006\u0010-\u001a\u00020\u0016J\u0006\u0010.\u001a\u00020\u0016J\u0016\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201J\u000e\u00103\u001a\u00020\u00162\u0006\u00100\u001a\u000201J\u000e\u00104\u001a\u00020\u00162\u0006\u00100\u001a\u000201J\u000e\u00105\u001a\u00020\u00162\u0006\u00106\u001a\u00020*J\u0006\u00107\u001a\u00020\u0016J\u0006\u00108\u001a\u00020\u0016J\u0010\u00109\u001a\u00020\u00162\b\u0010:\u001a\u0004\u0018\u00010;J\u0010\u0010<\u001a\u00020\u00162\b\u0010:\u001a\u0004\u0018\u00010;R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/view/CommonDialog;", "", "mActivity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "mDetailSpanMenu", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "mDialogData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IDialogData;", "mEventShareDialog", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareDialog;", "mEventShareImageDialog", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareImageDialog;", "mEventShareTimelineDialog", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareTimelineDialog;", "mRSVPCommentDialog", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/ReplyMessageDialog;", "mRequestToast", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "mViewAction", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailViewAction;", "dismiss", "", "dismissDialogIfShow", "dialog", "Landroid/app/Dialog;", "setDependency", "dialogData", "viewAction", "showEventShareDialog", "dependency", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareDialog$EventShareDependency;", "showEventShareImageDialog", "showExternalMinutesPermissionAlertDiaLog", "showGroupRestrictionDialog", "message", "", "showNotCreateMeetingGroupOrMinuteDialog", "showRSVPCommentDialog", "invitorId", "invitorName", "rsvpStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "showRSVPCommentErrDialog", ApiHandler.API_CALLBACK_ERRMSG, "showRSVPCommentSucDialog", "showRequestDismiss", "showRequestErrToast", "tipType", "", "errCode", "showRequestSucToast", "showRequestToast", "showRsvpSpanMenus", UpdateKey.STATUS, "showTimeLineShareDialog", "showTransferDialog", "updateEventShareImageDialog", "bitmap", "Landroid/graphics/Bitmap;", "updateTimeLineShareDialog", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.a */
public final class CommonDialog {

    /* renamed from: b */
    public static final Companion f79655b = new Companion(null);

    /* renamed from: a */
    public ICalendarDetailContact.IDetailViewAction f79656a;

    /* renamed from: c */
    private IDialogData f79657c;

    /* renamed from: d */
    private RequestLoadingDialog f79658d;

    /* renamed from: e */
    private ReplyMessageDialog f79659e;

    /* renamed from: f */
    private EventShareDialog f79660f;

    /* renamed from: g */
    private EventShareImageDialog f79661g;

    /* renamed from: h */
    private EventShareTimelineDialog f79662h;

    /* renamed from: i */
    private UDDialog f79663i;

    /* renamed from: j */
    private final Activity f79664j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/view/CommonDialog$Companion;", "", "()V", "JOIN_EVENT", "", "MEETING_MINUTE", "RSVP_EVENT", "SHARE_EVENT", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo114109a(String str, String str2, RSVPStatus rSVPStatus) {
        Intrinsics.checkParameterIsNotNull(str, "invitorId");
        Intrinsics.checkParameterIsNotNull(str2, "invitorName");
        Intrinsics.checkParameterIsNotNull(rSVPStatus, "rsvpStatus");
        if (this.f79659e == null) {
            this.f79659e = new ReplyMessageDialog(this.f79664j, R.style.ReplyMessageDialog);
        }
        ReplyMessageDialog fVar = this.f79659e;
        if (fVar != null) {
            fVar.mo114228b();
        }
        ReplyMessageDialog fVar2 = this.f79659e;
        if (fVar2 != null) {
            fVar2.mo114227a(str);
        }
        ReplyMessageDialog fVar3 = this.f79659e;
        if (fVar3 != null) {
            fVar3.mo114229b(str2);
        }
        ReplyMessageDialog fVar4 = this.f79659e;
        if (fVar4 != null) {
            fVar4.mo114224a(rSVPStatus);
        }
        ReplyMessageDialog fVar5 = this.f79659e;
        if (fVar5 != null) {
            fVar5.mo114225a(new C31440b(this));
        }
        ReplyMessageDialog fVar6 = this.f79659e;
        if (fVar6 != null) {
            fVar6.show();
        }
    }

    /* renamed from: e */
    public final void mo114116e() {
        RequestLoadingDialog requestLoadingDialog = this.f79658d;
        if (requestLoadingDialog != null) {
            requestLoadingDialog.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo114110b() {
        ReplyMessageDialog fVar;
        ReplyMessageDialog fVar2 = this.f79659e;
        if (fVar2 != null && fVar2.mo114233e() && (fVar = this.f79659e) != null) {
            fVar.mo114235g();
        }
    }

    /* renamed from: a */
    public final void mo114101a() {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f79664j).message(R.string.Calendar_Transfer_RepeatConfirm)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, new DialogInterface$OnClickListenerC31442d(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: f */
    public final void mo114117f() {
        if (UIUtils.isActivityRunning(this.f79664j)) {
            if (this.f79661g == null) {
                this.f79661g = new EventShareImageDialog(this.f79664j);
            }
            EventShareImageDialog cVar = this.f79661g;
            if (cVar != null) {
                cVar.mo113959a();
            }
            EventShareImageDialog cVar2 = this.f79661g;
            if (cVar2 != null) {
                cVar2.show();
            }
        }
    }

    /* renamed from: g */
    public final void mo114118g() {
        if (UIUtils.isActivityRunning(this.f79664j)) {
            if (this.f79662h == null) {
                this.f79662h = new EventShareTimelineDialog(this.f79664j);
            }
            EventShareTimelineDialog dVar = this.f79662h;
            if (dVar != null) {
                dVar.mo113966a();
            }
            EventShareTimelineDialog dVar2 = this.f79662h;
            if (dVar2 != null) {
                dVar2.show();
            }
        }
    }

    /* renamed from: c */
    public final void mo114114c() {
        IDialogData bVar = this.f79657c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialogData");
        }
        String a = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_MeetingMinutes_UnavailableDueToAdminPermissionSettings, "name", bVar.mo113675a());
        UDDialogBuilder eVar = new UDDialogBuilder(this.f79664j);
        Intrinsics.checkExpressionValueIsNotNull(a, "createErrTip");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.message(a)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_GotIt, (DialogInterface.OnClickListener) null)).messageTextSize(16)).cancelable(false)).cancelOnTouchOutside(false)).show();
    }

    /* renamed from: d */
    public final void mo114115d() {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f79664j).title(R.string.Calendar_Event_UnableCreateGroup)).message(R.string.Calendar_Event_UnableCreateNotes)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Event_GotIt, (DialogInterface.OnClickListener) null)).messageTextSize(14)).messageTextColor(R.color.text_caption)).messageGravity(3)).show();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/CommonDialog$showRSVPCommentDialog$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/ReplyMessageDialog$ReplyMessageListener;", "onClickEnableSendBt", "", Comment.f24093e, "", "inviterId", UpdateKey.STATUS, "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.a$b */
    public static final class C31440b implements ReplyMessageDialog.ReplyMessageListener {

        /* renamed from: a */
        final /* synthetic */ CommonDialog f79665a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31440b(CommonDialog aVar) {
            this.f79665a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.ReplyMessageDialog.ReplyMessageListener
        /* renamed from: a */
        public void mo114119a(String str, String str2, RSVPStatus rSVPStatus) {
            Intrinsics.checkParameterIsNotNull(str, Comment.f24093e);
            Intrinsics.checkParameterIsNotNull(str2, "inviterId");
            Intrinsics.checkParameterIsNotNull(rSVPStatus, UpdateKey.STATUS);
            CommonDialog.m118280a(this.f79665a).mo113542a(rSVPStatus, str, str2);
            GeneralHitPoint.m124270r("event_detail");
        }
    }

    public CommonDialog(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "mActivity");
        this.f79664j = activity;
    }

    /* renamed from: a */
    public static final /* synthetic */ ICalendarDetailContact.IDetailViewAction m118280a(CommonDialog aVar) {
        ICalendarDetailContact.IDetailViewAction cVar = aVar.f79656a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        return cVar;
    }

    /* renamed from: b */
    public final void mo114113b(String str) {
        Intrinsics.checkParameterIsNotNull(str, ApiHandler.API_CALLBACK_ERRMSG);
        ReplyMessageDialog fVar = this.f79659e;
        if (fVar != null) {
            fVar.mo114231c(str);
        }
    }

    /* renamed from: a */
    public final void mo114104a(Bitmap bitmap) {
        EventShareImageDialog cVar;
        EventShareImageDialog cVar2 = this.f79661g;
        if (cVar2 != null && cVar2 != null && cVar2.isShowing() && (cVar = this.f79661g) != null) {
            cVar.mo113960a(bitmap);
        }
    }

    /* renamed from: b */
    public final void mo114111b(int i) {
        if (i == 1) {
            RequestLoadingDialog requestLoadingDialog = this.f79658d;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.mo112593d(R.string.Calendar_Share_SucTip);
            }
        } else if (i == 2) {
            RequestLoadingDialog requestLoadingDialog2 = this.f79658d;
            if (requestLoadingDialog2 != null) {
                requestLoadingDialog2.mo112593d(R.string.Calendar_Share_JoinSucTip);
            }
        } else if (i == 3) {
            RequestLoadingDialog requestLoadingDialog3 = this.f79658d;
            if (requestLoadingDialog3 != null) {
                requestLoadingDialog3.mo112593d(R.string.Calendar_Detail_ResponseSuccessed);
            }
        } else if (i != 4) {
            RequestLoadingDialog requestLoadingDialog4 = this.f79658d;
            if (requestLoadingDialog4 != null) {
                requestLoadingDialog4.dismiss();
            }
        } else {
            RequestLoadingDialog requestLoadingDialog5 = this.f79658d;
            if (requestLoadingDialog5 != null) {
                requestLoadingDialog5.dismiss();
            }
        }
    }

    /* renamed from: a */
    public final void mo114102a(int i) {
        RequestLoadingDialog requestLoadingDialog;
        Window window;
        RequestLoadingDialog requestLoadingDialog2 = this.f79658d;
        if (requestLoadingDialog2 != null) {
            requestLoadingDialog2.dismiss();
        }
        this.f79658d = new RequestLoadingDialog(this.f79664j);
        int i2 = R.string.Calendar_Toast_ReplyingMobile;
        if (i == 1) {
            i2 = R.string.Calendar_Share_Sharing;
        } else if (i == 2) {
            i2 = R.string.Calendar_Share_Joining;
        } else if (i != 3 && i == 4) {
            i2 = R.string.Calendar_Edit_FindTimeLoading;
        }
        ReplyMessageDialog fVar = this.f79659e;
        if (!(fVar == null || !fVar.isShowing() || (requestLoadingDialog = this.f79658d) == null || (window = requestLoadingDialog.getWindow()) == null)) {
            window.setFlags(131072, 131072);
        }
        RequestLoadingDialog requestLoadingDialog3 = this.f79658d;
        if (requestLoadingDialog3 != null) {
            requestLoadingDialog3.mo112585a(i2);
        }
    }

    /* renamed from: b */
    public final void mo114112b(Bitmap bitmap) {
        EventShareTimelineDialog dVar;
        EventShareTimelineDialog dVar2 = this.f79662h;
        if (dVar2 != null && dVar2 != null && dVar2.isShowing() && (dVar = this.f79662h) != null) {
            dVar.mo113969b(bitmap);
        }
    }

    /* renamed from: a */
    public final void mo114105a(RSVPStatus rSVPStatus) {
        Intrinsics.checkParameterIsNotNull(rSVPStatus, UpdateKey.STATUS);
        ArrayList arrayList = new ArrayList();
        arrayList.add(RsvpUtil.f79159a.mo113582b(rSVPStatus, CalendarEvent.Span.THIS_EVENT));
        arrayList.add(RsvpUtil.f79159a.mo113582b(rSVPStatus, CalendarEvent.Span.ALL_EVENTS));
        this.f79663i = ((SpanListDialogBuilder) new SpanListDialogBuilder(this.f79664j).mo116008a(arrayList).mo116007a(new C31441c(this, rSVPStatus)).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: a */
    public final void mo114107a(EventShareDialog.EventShareDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        if (UIUtils.isActivityRunning(this.f79664j)) {
            if (this.f79660f == null) {
                this.f79660f = new EventShareDialog(this.f79664j, bVar);
            }
            EventShareDialog bVar2 = this.f79660f;
            if (bVar2 != null) {
                bVar2.show();
            }
        }
    }

    /* renamed from: a */
    public final void mo114108a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f79664j).title(R.string.Calendar_Share_RestrictionTitle)).message(str)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_OK, (DialogInterface.OnClickListener) null)).messageTextSize(14)).messageTextColor(R.color.text_caption)).cancelOnTouchOutside(false)).cancelable(false)).show();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/CommonDialog$showRsvpSpanMenus$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogController$OnItemClickListener;", "onItemClick", "", "span", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "isChecked", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.a$c */
    public static final class C31441c implements SpanListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonDialog f79666a;

        /* renamed from: b */
        final /* synthetic */ RSVPStatus f79667b;

        C31441c(CommonDialog aVar, RSVPStatus rSVPStatus) {
            this.f79666a = aVar;
            this.f79667b = rSVPStatus;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogController.OnItemClickListener
        /* renamed from: a */
        public void mo109576a(CalendarEvent.Span span, boolean z) {
            if (span != null) {
                Log.m165389i("CommonDialog", LogMsgGenerator.f83821a.mo120363a(this.f79667b, span));
                CommonDialog.m118280a(this.f79666a).mo113541a(this.f79667b, span);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.a$d */
    public static final class DialogInterface$OnClickListenerC31442d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonDialog f79668a;

        DialogInterface$OnClickListenerC31442d(CommonDialog aVar) {
            this.f79668a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            CommonDialog.m118280a(this.f79668a).mo113552f();
        }
    }

    /* renamed from: a */
    public final void mo114103a(int i, int i2) {
        if (i == 1) {
            RequestLoadingDialog requestLoadingDialog = this.f79658d;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.mo112592c(ErrorTipsUtil.f79158a.mo113577a(i2));
            }
        } else if (i == 2) {
            RequestLoadingDialog requestLoadingDialog2 = this.f79658d;
            if (requestLoadingDialog2 != null) {
                requestLoadingDialog2.mo112592c(ErrorTipsUtil.f79158a.mo113578b(i2));
            }
        } else if (i == 3) {
            RequestLoadingDialog requestLoadingDialog3 = this.f79658d;
            if (requestLoadingDialog3 != null) {
                requestLoadingDialog3.mo112592c(R.string.Calendar_Share_RestrictionTitle);
            }
        } else if (i != 4) {
            RequestLoadingDialog requestLoadingDialog4 = this.f79658d;
            if (requestLoadingDialog4 != null) {
                requestLoadingDialog4.dismiss();
            }
        } else {
            RequestLoadingDialog requestLoadingDialog5 = this.f79658d;
            if (requestLoadingDialog5 != null) {
                requestLoadingDialog5.dismiss();
            }
        }
    }

    /* renamed from: a */
    public final void mo114106a(IDialogData bVar, ICalendarDetailContact.IDetailViewAction cVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dialogData");
        Intrinsics.checkParameterIsNotNull(cVar, "viewAction");
        this.f79657c = bVar;
        this.f79656a = cVar;
    }
}
