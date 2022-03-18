package com.ss.android.lark.calendar.impl.features.events.detail.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.lark.pb.basic.v1.Command;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.ICallback;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.C26256ah;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.aq;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.api.entity.CalendarPstnDetailInfo;
import com.ss.android.lark.calendar.impl.features.common.helper.CalendarLogHelper;
import com.ss.android.lark.calendar.impl.features.common.p1498d.C31129b;
import com.ss.android.lark.calendar.impl.features.common.screenshot.ScreenShotProcess;
import com.ss.android.lark.calendar.impl.features.events.detail.CalendarEventType;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailActivity;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailSource;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.VideoMeetingVisibility;
import com.ss.android.lark.calendar.impl.features.events.detail.presenter.auxpresenter.EventChangeAuxPresenter;
import com.ss.android.lark.calendar.impl.features.events.detail.process.MeetingGroupOpenProcess;
import com.ss.android.lark.calendar.impl.features.events.detail.process.VideoMeetingHandleProcess;
import com.ss.android.lark.calendar.impl.features.events.detail.share.EventShareDialog;
import com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareType;
import com.ss.android.lark.calendar.impl.features.events.detail.utils.RsvpUtil;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedLiveStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedVideoChatStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import com.ss.android.lark.calendar.impl.features.events.edit.EditActivityEntrance;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.process.IDeleteProcessListener;
import com.ss.android.lark.calendar.impl.features.events.edit.operation.DeleteProcess;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileActivityEntrance;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar;
import com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable.AppreciableHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfoMonitor;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.PerfHelper;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32491i;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.C32607n;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventShareLink;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoEventVideoMeetingInfo;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.EventInviteOperator;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OptimisticReplyCalendarEventInvitationResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.ShareFailedChat;
import com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.impl.rustadapter.push.CalendarPushProcess;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.LogMsgGenerator;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30043e;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsResponse;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

public abstract class BaseDetailPresenter extends BasePresenterCalendar<ICalendarDetailContact.IDetailModel, ICalendarDetailContact.IDetailView, ICalendarDetailContact.IDetailViewData, ICalendarDetailContact.IDetailViewAction> {

    /* renamed from: g */
    public static final Companion f79314g = new Companion(null);

    /* renamed from: a */
    private boolean f79315a = true;

    /* renamed from: b */
    private AbstractC32524a f79316b;

    /* renamed from: c */
    protected AbstractC32594f f79317c;

    /* renamed from: d */
    protected AbstractC32595g f79318d;

    /* renamed from: e */
    public VideoMeetingHandleProcess f79319e;

    /* renamed from: f */
    public MeetingGroupOpenProcess f79320f;

    /* renamed from: h */
    private AbstractC30037ag.AbstractC30038a f79321h;

    /* renamed from: i */
    private AbstractC32524a f79322i;

    /* renamed from: j */
    private AbstractC32524a f79323j;

    /* renamed from: k */
    private DeleteProcess f79324k;

    /* renamed from: l */
    private AbstractC32524a f79325l;

    /* renamed from: m */
    private final Lazy f79326m = LazyKt.lazy(C31334b.INSTANCE);

    /* renamed from: n */
    private final Lazy f79327n;

    /* renamed from: o */
    private final Lazy f79328o;

    /* renamed from: c */
    private final AbstractC30043e mo113897c() {
        return (AbstractC30043e) this.f79326m.getValue();
    }

    /* renamed from: v */
    private final EventChangeAuxPresenter m117878v() {
        return (EventChangeAuxPresenter) this.f79327n.getValue();
    }

    /* renamed from: w */
    private final ScreenShotProcess m117879w() {
        return (ScreenShotProcess) this.f79328o.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo113839a();

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo113873a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "actionSrc");
            CalendarPerfMonitor.m124415a("key_perf_cal_event_show", "perf_cal_event_show", "action_source", str, "view_type", PerfHelper.m124435a());
        }

        /* renamed from: a */
        public final void mo113872a(Context context, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(bundle, "bundle");
            int i = bundle.getInt("enterDetailSource");
            if (i == EventDetailSource.FROM_BOT.getValue() || i == EventDetailSource.FROM_SHARE_EVENT.getValue() || i == EventDetailSource.FROM_CALENDAR_GENERAL_BOT.getValue() || i == EventDetailSource.FROM_RSVP_COMMENT_BOT.getValue()) {
                AppreciableHitPoint.f83321a.mo118699o();
            } else {
                AppreciableHitPoint.f83321a.mo118695k();
            }
            C30022a.f74882a.appRouter().mo108210a(EventDetailActivity.class).mo108151a(bundle).mo108156b(context);
        }
    }

    /* renamed from: a */
    public final boolean mo113850a(String str) {
        SchemaHelper.Companion aVar = SchemaHelper.f83746a;
        CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
        String c2 = aVar.mo120316c(str, c != null ? c.getCalendarSchemaCollection() : null);
        if (!(c2.length() > 0)) {
            return false;
        }
        mo113897c().mo108211a(((ICalendarDetailContact.IDetailView) mo118651s()).mo113492a(), c2);
        return true;
    }

    /* renamed from: a */
    public final void mo113846a(CalendarEvent calendarEvent) {
        C30022a.f74882a.oldModuleDependency().mo108284a(((ICalendarDetailContact.IDetailView) mo118651s()).mo113492a(), new CalendarEvent(((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c(), true), ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113443z(), 4);
        GeneralHitPoint.m124189a(((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c(), ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113443z());
    }

    /* renamed from: a */
    public final void mo113849a(boolean z) {
        if (z) {
            ((ICalendarDetailContact.IDetailView) mo118651s()).mo113510c();
        }
        mo113839a();
    }

    /* renamed from: a */
    public final void mo113847a(CalendarEvent calendarEvent, boolean z) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "sdkEvent");
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("BaseDetailPresenter", C32673y.m125376b(valueOf, "getServerEventIfNeed", "ser_ids", calendarEvent.getServerId()));
        if (C26256ah.m95011a(calendarEvent.getServerId()) > 0 || z) {
            UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C31347n(this, valueOf, "getServerEventIfNeed"));
            AbstractC32594f fVar = this.f79317c;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCalendarEventService");
            }
            fVar.mo118873a(CollectionsKt.listOf(calendarEvent.getServerId()), true, (IGetDataCallback<List<CalendarEvent>>) wrapAndAddGetDataCallback);
        }
    }

    /* renamed from: a */
    public final void mo113845a(RSVPStatus rSVPStatus, CalendarEvent.Span span, String str, String str2) {
        CalendarEventInstance i;
        long j;
        Intrinsics.checkParameterIsNotNull(rSVPStatus, UpdateKey.STATUS);
        Intrinsics.checkParameterIsNotNull(span, "span");
        Intrinsics.checkParameterIsNotNull(str, Comment.f24093e);
        Intrinsics.checkParameterIsNotNull(str2, "inviterId");
        CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
        if (c != null && (i = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113426i()) != null) {
            CalendarEventAttendee.Status a = RsvpUtil.f79159a.mo113580a(rSVPStatus);
            if (span == CalendarEvent.Span.THIS_EVENT && c.getOriginalTime() == 0) {
                j = i.getStartTime();
            } else {
                j = c.getOriginalTime();
            }
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("BaseDetailPresenter", C32673y.m125376b(valueOf, "optimisticReplyCalendarEventInvitationWithComment", "calendar_id", c.getCalendarId(), "key", c.getKey(), "original_time", String.valueOf(j), "reply_status", a.toString()));
            UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C31356w(this, valueOf, "optimisticReplyCalendarEventInvitationWithComment"));
            AppreciableHitPoint.f83321a.mo118705u();
            AbstractC32594f fVar = this.f79317c;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCalendarEventService");
            }
            fVar.mo118862a(c.getCalendarId(), c.getKey(), j, a, span, "", true, str, str2, wrapAndAddGetDataCallback);
        }
    }

    /* renamed from: a */
    public final void mo113844a(RSVPStatus rSVPStatus, CalendarEvent.Span span) {
        CalendarEventInstance i;
        long j;
        Intrinsics.checkParameterIsNotNull(rSVPStatus, UpdateKey.STATUS);
        Intrinsics.checkParameterIsNotNull(span, "span");
        CalendarPerfMonitor.m124415a("key_rsvp_event", "cal_perf_common", "scene_type", "rsvp_event", "extra_name", "event_detail");
        AppreciableHitPoint.f83321a.mo118705u();
        CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
        if (c != null && (i = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113426i()) != null) {
            ((ICalendarDetailContact.IDetailView) mo118651s()).mo113507b(3);
            CalendarEventAttendee.Status a = RsvpUtil.f79159a.mo113580a(rSVPStatus);
            m117872a(c, a);
            CalendarPerfoMonitor.m124406a(CalendarPerfoMonitor.EventType.PERF_CAL_REPLY, span);
            if (span == CalendarEvent.Span.THIS_EVENT && c.getOriginalTime() == 0) {
                j = i.getStartTime();
            } else {
                j = c.getOriginalTime();
            }
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("BaseDetailPresenter", C32673y.m125376b(valueOf, "optimisticReplyCalendarEventInvitation", "calendar_id", c.getCalendarId(), "key", c.getKey(), "original_time", String.valueOf(j), "reply_status", a.toString()));
            UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C31355v(this, valueOf, "optimisticReplyCalendarEventInvitation"));
            AbstractC32594f fVar = this.f79317c;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCalendarEventService");
            }
            fVar.mo118862a(c.getCalendarId(), c.getKey(), j, a, span, ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113431n(), true, "", "", wrapAndAddGetDataCallback);
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$i */
    public static final class C31341i implements ICalendarDetailContact.IDetailViewAction {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79347a;

        /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$i$a */
        public static final class C31342a implements MeetingGroupOpenProcess.IMeetingProcessListener {

            /* renamed from: a */
            final /* synthetic */ C31341i f79348a;

            @Override // com.ss.android.lark.calendar.impl.features.events.detail.process.MeetingGroupOpenProcess.IMeetingProcessListener
            /* renamed from: a */
            public void mo113456a() {
                this.f79348a.f79347a.mo113839a();
            }

            @Override // com.ss.android.lark.calendar.impl.features.events.detail.process.MeetingGroupOpenProcess.IMeetingProcessListener
            /* renamed from: c */
            public void mo113458c() {
                ((ICalendarDetailContact.IDetailView) this.f79348a.f79347a.mo118651s()).mo113531v();
            }

            @Override // com.ss.android.lark.calendar.impl.features.events.detail.process.MeetingGroupOpenProcess.IMeetingProcessListener
            /* renamed from: b */
            public void mo113457b() {
                CalendarEvent c = ((ICalendarDetailContact.IDetailModel) this.f79348a.f79347a.mo118652t()).mo113417c();
                if (c != null) {
                    c.setType(CalendarEvent.Type.MEETING);
                }
                ((ICalendarDetailContact.IDetailView) this.f79348a.f79347a.mo118651s()).mo113532w();
            }

            C31342a(C31341i iVar) {
                this.f79348a = iVar;
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: k */
        public void mo113557k() {
            this.f79347a.mo113839a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: h */
        public void mo113554h() {
            ((ICalendarDetailContact.IDetailView) this.f79347a.mo118651s()).mo113524o();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: l */
        public void mo113558l() {
            ((ICalendarDetailContact.IDetailView) this.f79347a.mo118651s()).mo113534y();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: c */
        public void mo113548c() {
            if (!this.f79347a.mo113850a("DeleteIcon")) {
                this.f79347a.mo113867o();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: d */
        public void mo113550d() {
            if (!this.f79347a.mo113850a("ReportIcon")) {
                C30022a.f74882a.browserModuleDependency().mo108212b(((ICalendarDetailContact.IDetailView) this.f79347a.mo118651s()).mo113492a(), ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113394C());
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: e */
        public void mo113551e() {
            if (!this.f79347a.mo113850a("TransferIcon")) {
                if (((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113441x() || ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113442y()) {
                    ((ICalendarDetailContact.IDetailView) this.f79347a.mo118651s()).mo113526q();
                } else {
                    mo113552f();
                }
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: g */
        public void mo113553g() {
            this.f79347a.mo113870q();
            GeneralHitPoint.m124197a("event_detail", ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113417c(), ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113431n());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: j */
        public void mo113556j() {
            if (!this.f79347a.mo113850a("MeetingMinutesIcon")) {
                if (((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113398G()) {
                    this.f79347a.mo113869p();
                } else {
                    ((ICalendarDetailContact.IDetailView) this.f79347a.mo118651s()).mo113531v();
                }
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: a */
        public void mo113536a() {
            CalendarEvent c;
            if (this.f79347a.mo113850a("ForwardIcon") || (c = ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113417c()) == null) {
                return;
            }
            if (c.getVisibility() == CalendarEvent.Visibility.PRIVATE) {
                ((ICalendarDetailContact.IDetailView) this.f79347a.mo118651s()).mo113533x();
            } else if (!C30022a.f74883b.mo112699g()) {
                this.f79347a.mo113846a(c);
            } else {
                this.f79347a.mo113859g();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: b */
        public void mo113545b() {
            CalendarEvent c;
            CalendarEventInstance i;
            Calendar.Type type;
            if (!this.f79347a.mo113850a("EditIcon") && (c = ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113417c()) != null && (i = ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113426i()) != null) {
                Calendar j = ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113427j();
                if (j != null) {
                    type = j.getType();
                } else {
                    type = null;
                }
                GeneralHitPoint.m124207a("event_detail", "edit", c, type, (String) null, 16, (Object) null);
                EditActivityEntrance.f79940a.mo114668a(((ICalendarDetailContact.IDetailView) this.f79347a.mo118651s()).mo113492a(), i, c, 1);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: f */
        public void mo113552f() {
            if (C30022a.f74883b.mo112689C()) {
                ((ICalendarDetailContact.IDetailView) this.f79347a.mo118651s()).mo113535z();
                return;
            }
            C30022a.f74882a.oldModuleDependency().mo108286b(((ICalendarDetailContact.IDetailView) this.f79347a.mo118651s()).mo113492a(), new CalendarEvent(((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113417c(), true), ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113443z(), 5);
            GeneralHitPoint.m124189a(((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113417c(), ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113443z());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: i */
        public void mo113555i() {
            CalendarEvent c;
            if (!this.f79347a.mo113850a("MeetingChatIcon") && (c = ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113417c()) != null) {
                if (this.f79347a.f79320f == null) {
                    BaseDetailPresenter baseDetailPresenter = this.f79347a;
                    baseDetailPresenter.f79320f = new MeetingGroupOpenProcess(((ICalendarDetailContact.IDetailView) baseDetailPresenter.mo118651s()).mo113492a(), c);
                    MeetingGroupOpenProcess aVar = this.f79347a.f79320f;
                    if (aVar != null) {
                        aVar.mo113445a(new C31342a(this));
                    }
                }
                MeetingGroupOpenProcess aVar2 = this.f79347a.f79320f;
                if (aVar2 != null) {
                    aVar2.mo113446a(c);
                }
            }
        }

        C31341i(BaseDetailPresenter baseDetailPresenter) {
            this.f79347a = baseDetailPresenter;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: b */
        public void mo113547b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "token");
            C30022a.f74882a.browserModuleDependency().mo108214d(((ICalendarDetailContact.IDetailView) this.f79347a.mo118651s()).mo113492a(), str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: c */
        public void mo113549c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "resourceCalendarId");
            if (C30022a.f74883b.mo112709q()) {
                MeetingRoomProfileActivityEntrance.f82147a.mo117232a(((ICalendarDetailContact.IDetailView) this.f79347a.mo118651s()).mo113492a(), str);
                GeneralHitPoint.m124201a("event_detail", (String) null, 2, (Object) null);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: b */
        public void mo113546b(RSVPStatus rSVPStatus) {
            Intrinsics.checkParameterIsNotNull(rSVPStatus, "replyStatus");
            int i = C31365b.f79401a[rSVPStatus.ordinal()];
            if (i == 1) {
                CalendarEventHitPoint.m124344a(((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113395D(), ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113397F(), "accept", (String) null, (String) null, 24, (Object) null);
            } else if (i == 2) {
                CalendarEventHitPoint.m124344a(((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113395D(), ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113397F(), "reject", (String) null, (String) null, 24, (Object) null);
            } else if (i == 3) {
                CalendarEventHitPoint.m124344a(((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113395D(), ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113397F(), "not_determined", (String) null, (String) null, 24, (Object) null);
            }
            if (!((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113442y() && !((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113441x()) {
                Log.m165389i("BaseDetailPresenter", LogMsgGenerator.f83821a.mo120363a(rSVPStatus, CalendarEvent.Span.NONE_SPAN));
                this.f79347a.mo113844a(rSVPStatus, CalendarEvent.Span.NONE_SPAN);
            } else if (((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113434q()) {
                ((ICalendarDetailContact.IDetailView) this.f79347a.mo118651s()).mo113498a(rSVPStatus);
            } else {
                Log.m165389i("BaseDetailPresenter", LogMsgGenerator.f83821a.mo120363a(rSVPStatus, CalendarEvent.Span.THIS_EVENT));
                this.f79347a.mo113844a(rSVPStatus, CalendarEvent.Span.THIS_EVENT);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: a */
        public void mo113540a(RSVPStatus rSVPStatus) {
            String str;
            EventInviteOperator userInviteOperator;
            String userInviteOperatorLocalizedName;
            EventInviteOperator userInviteOperator2;
            Intrinsics.checkParameterIsNotNull(rSVPStatus, "replyStatus");
            if (!this.f79347a.mo113850a("RsvpReply")) {
                CalendarEventHitPoint.m124344a(((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113395D(), ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113397F(), "reply", (String) null, (String) null, 24, (Object) null);
                CalendarEvent c = ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113417c();
                String str2 = "";
                if (c == null || (userInviteOperator2 = c.getUserInviteOperator()) == null || (str = userInviteOperator2.getUserInviteOperatorId()) == null) {
                    str = str2;
                }
                CalendarEvent c2 = ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113417c();
                if (!(c2 == null || (userInviteOperator = c2.getUserInviteOperator()) == null || (userInviteOperatorLocalizedName = userInviteOperator.getUserInviteOperatorLocalizedName()) == null)) {
                    str2 = userInviteOperatorLocalizedName;
                }
                if (TextUtils.isEmpty(str)) {
                    ((ICalendarDetailContact.IDetailView) this.f79347a.mo118651s()).mo113493a(R.string.Calendar_Detail_NoNetwork);
                } else {
                    ((ICalendarDetailContact.IDetailView) this.f79347a.mo118651s()).mo113503a(str, str2, rSVPStatus);
                }
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: a */
        public void mo113543a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "attendeeCalendarId");
            this.f79347a.mo113852b(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: a */
        public void mo113541a(RSVPStatus rSVPStatus, CalendarEvent.Span span) {
            Intrinsics.checkParameterIsNotNull(rSVPStatus, "replyStatus");
            Intrinsics.checkParameterIsNotNull(span, "span");
            this.f79347a.mo113844a(rSVPStatus, span);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: a */
        public void mo113539a(Context context, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "meetingId");
            GeneralHitPoint.m124183a(((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113400a());
            C30022a.f74882a.vchatDependency().mo108203b(context, str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: a */
        public void mo113542a(RSVPStatus rSVPStatus, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(rSVPStatus, "replyStatus");
            Intrinsics.checkParameterIsNotNull(str, Comment.f24093e);
            Intrinsics.checkParameterIsNotNull(str2, "inviterId");
            if (((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113442y() || ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113441x()) {
                this.f79347a.mo113845a(rSVPStatus, CalendarEvent.Span.THIS_EVENT, str, str2);
            } else {
                this.f79347a.mo113845a(rSVPStatus, CalendarEvent.Span.NONE_SPAN, str, str2);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: a */
        public void mo113544a(String str, double d, double d2) {
            Intrinsics.checkParameterIsNotNull(str, "location");
            C30022a.f74882a.locationDependency().mo108268a(((ICalendarDetailContact.IDetailView) this.f79347a.mo118651s()).mo113492a(), str, d, d2, 15);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: a */
        public void mo113538a(Context context, VideoType videoType, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(videoType, "videoType");
            Intrinsics.checkParameterIsNotNull(str, "meetingId");
            Intrinsics.checkParameterIsNotNull(str2, "meetingUrl");
            this.f79347a.mo113841a(context, videoType, str, str2);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewAction
        /* renamed from: a */
        public void mo113537a(Context context, VideoType videoType, String str, GetAdminSettingsResponse getAdminSettingsResponse) {
            String str2;
            DoVideoMeeting videoMeeting;
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(videoType, "videoType");
            Intrinsics.checkParameterIsNotNull(str, "meetingUrl");
            if (videoType == VideoType.GOOGLE_VIDEO_CONFERENCE) {
                try {
                    AbstractC30043e browserModuleDependency = C30022a.f74882a.browserModuleDependency();
                    CalendarEvent c = ((ICalendarDetailContact.IDetailModel) this.f79347a.mo118652t()).mo113417c();
                    if (c == null || (videoMeeting = c.getVideoMeeting()) == null) {
                        str2 = null;
                    } else {
                        str2 = videoMeeting.getGoogleMorePhoneNumberUrl();
                    }
                    browserModuleDependency.mo108211a(context, str2);
                } catch (Exception unused) {
                    Log.m165383e("BaseDetailPresenter", "video url open error");
                }
            } else {
                C30022a.f74882a.vchatDependency().mo108201a(getAdminSettingsResponse, str);
            }
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$aa */
    public static final class C31333aa implements EventShareDialog.EventShareDependency {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79329a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.share.Interface.InnerShareDependency
        /* renamed from: f */
        public void mo113880f() {
            this.f79329a.mo113860h();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.share.Interface.InnerShareDependency
        /* renamed from: g */
        public void mo113881g() {
            this.f79329a.mo113861i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.share.EventShareDialog.EventShareDependency
        /* renamed from: b */
        public String mo113876b() {
            return ((ICalendarDetailContact.IDetailModel) this.f79329a.mo118652t()).mo113436s();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.share.EventShareDialog.EventShareDependency
        /* renamed from: c */
        public String mo113877c() {
            return ((ICalendarDetailContact.IDetailModel) this.f79329a.mo118652t()).mo113435r();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.share.EventShareDialog.EventShareDependency
        /* renamed from: d */
        public String mo113878d() {
            return ((ICalendarDetailContact.IDetailModel) this.f79329a.mo118652t()).mo113437t();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.share.Interface.InnerShareDependency
        /* renamed from: a */
        public void mo113874a() {
            CalendarEvent c = ((ICalendarDetailContact.IDetailModel) this.f79329a.mo118652t()).mo113417c();
            if (c != null) {
                this.f79329a.mo113846a(c);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.share.EventShareDialog.EventShareDependency
        /* renamed from: e */
        public String mo113879e() {
            String a;
            CalendarEventInstance i = ((ICalendarDetailContact.IDetailModel) this.f79329a.mo118652t()).mo113426i();
            if (i == null || (a = C32646c.m125261a(i)) == null) {
                return "";
            }
            return a;
        }

        C31333aa(BaseDetailPresenter baseDetailPresenter) {
            this.f79329a = baseDetailPresenter;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.share.EventShareDialog.EventShareDependency
        /* renamed from: a */
        public void mo113875a(ShareType shareType) {
            CalendarEvent c;
            Intrinsics.checkParameterIsNotNull(shareType, "shareType");
            if (shareType != ShareType.LARK && (c = ((ICalendarDetailContact.IDetailModel) this.f79329a.mo118652t()).mo113417c()) != null) {
                GeneralHitPoint.m124186a(c, shareType, "");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$b */
    public static final class C31334b extends Lambda implements Function0<AbstractC30043e> {
        public static final C31334b INSTANCE = new C31334b();

        C31334b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC30043e invoke() {
            return C30022a.f74882a.browserModuleDependency();
        }
    }

    /* renamed from: e */
    public final void mo113857e() {
        m117868I();
        mo113848a((List<String>) null);
    }

    /* renamed from: f */
    public ICalendarDetailContact.IDetailViewAction mo109713b() {
        return new C31341i(this);
    }

    /* renamed from: l */
    public final void mo113864l() {
        m117879w().mo112739b();
    }

    /* renamed from: r */
    public final C31129b.AbstractC31130a mo113871r() {
        return new C31340h(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$o */
    public static final class C31348o extends Lambda implements Function0<EventChangeAuxPresenter> {
        final /* synthetic */ ICalendarDetailContact.IDetailModel $model;
        final /* synthetic */ ICalendarDetailContact.IDetailView $view;
        final /* synthetic */ BaseDetailPresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31348o(BaseDetailPresenter baseDetailPresenter, ICalendarDetailContact.IDetailView bVar, ICalendarDetailContact.IDetailModel aVar) {
            super(0);
            this.this$0 = baseDetailPresenter;
            this.$view = bVar;
            this.$model = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final EventChangeAuxPresenter invoke() {
            return new EventChangeAuxPresenter(this.$view, this.$model, this.this$0.mo118653u());
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$u */
    public static final class C31354u implements AbstractC30037ag.AbstractC30038a {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79369a;

        C31354u(BaseDetailPresenter baseDetailPresenter) {
            this.f79369a = baseDetailPresenter;
        }

        @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag.AbstractC30038a
        /* renamed from: a */
        public final void mo108191a() {
            ((ICalendarDetailContact.IDetailView) this.f79369a.mo118651s()).mo113515f();
        }
    }

    /* renamed from: E */
    private final void m117864E() {
        if (this.f79321h != null) {
            C30022a.f74882a.timeFormatDependency().mo108190b(this.f79321h);
        }
    }

    /* renamed from: F */
    private final void m117865F() {
        if (this.f79316b != null) {
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_MEETING_NOTIFICATION, this.f79316b);
        }
    }

    /* renamed from: G */
    private final void m117866G() {
        if (this.f79322i != null) {
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_EVENT_VIDEO_MEETING_CHANGE, this.f79322i);
        }
    }

    /* renamed from: H */
    private final void m117867H() {
        if (this.f79323j != null) {
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_ASSOCIATED_VC_STATUS, this.f79323j);
        }
    }

    /* renamed from: K */
    private final void m117870K() {
        if (this.f79325l != null) {
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_ASSOCIATED_LIVE_STATUS, this.f79325l);
        }
    }

    /* renamed from: d */
    public final AbstractC32594f mo113856d() {
        AbstractC32594f fVar = this.f79317c;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCalendarEventService");
        }
        return fVar;
    }

    /* renamed from: j */
    public final void mo113862j() {
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113525p();
    }

    /* renamed from: k */
    public final void mo113863k() {
        VideoMeetingHandleProcess cVar = this.f79319e;
        if (cVar != null) {
            cVar.mo113465a();
        }
        m117879w().mo112738a();
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$e */
    public static final class C31337e implements VideoMeetingHandleProcess.IVideoProcessListener {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79340a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.process.VideoMeetingHandleProcess.IVideoProcessListener
        /* renamed from: a */
        public void mo113480a() {
            ((ICalendarDetailContact.IDetailModel) this.f79340a.mo118652t()).mo113418c(Long.valueOf(System.currentTimeMillis()));
        }

        C31337e(BaseDetailPresenter baseDetailPresenter) {
            this.f79340a = baseDetailPresenter;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.process.VideoMeetingHandleProcess.IVideoProcessListener
        /* renamed from: a */
        public void mo113483a(Long l) {
            ((ICalendarDetailContact.IDetailModel) this.f79340a.mo118652t()).mo113415b(l);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.process.VideoMeetingHandleProcess.IVideoProcessListener
        /* renamed from: b */
        public void mo113485b(Long l) {
            ((ICalendarDetailContact.IDetailModel) this.f79340a.mo118652t()).mo113411a(l);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.process.VideoMeetingHandleProcess.IVideoProcessListener
        /* renamed from: a */
        public void mo113481a(CalendarPstnDetailInfo aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "pstnInfo");
            ((ICalendarDetailContact.IDetailModel) this.f79340a.mo118652t()).mo113401a(aVar);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.process.VideoMeetingHandleProcess.IVideoProcessListener
        /* renamed from: a */
        public void mo113482a(VideoMeetingVisibility videoMeetingVisibility) {
            Intrinsics.checkParameterIsNotNull(videoMeetingVisibility, "videoVisibility");
            ((ICalendarDetailContact.IDetailModel) this.f79340a.mo118652t()).mo113404a(videoMeetingVisibility);
            ((ICalendarDetailContact.IDetailView) this.f79340a.mo118651s()).mo113521l();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.process.VideoMeetingHandleProcess.IVideoProcessListener
        /* renamed from: a */
        public void mo113484a(boolean z) {
            ((ICalendarDetailContact.IDetailView) this.f79340a.mo118651s()).mo113505a(z);
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$f */
    public static final class C31338f implements IDeleteProcessListener {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79341a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.IDeleteProcessListener
        /* renamed from: a */
        public void mo113884a() {
            AppreciableHitPoint.f83321a.mo118704t();
            CalendarHitPoint.m124141i("more");
            ((ICalendarDetailContact.IDetailView) this.f79341a.mo118651s()).mo113506b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.IDeleteProcessListener
        /* renamed from: b */
        public void mo113885b() {
            AppreciableHitPoint.f83321a.mo118682c(null);
            CalendarHitPoint.m124141i("more");
            ((ICalendarDetailContact.IDetailView) this.f79341a.mo118651s()).mo113493a(R.string.Calendar_Common_DeleteFailedTip);
        }

        C31338f(BaseDetailPresenter baseDetailPresenter) {
            this.f79341a = baseDetailPresenter;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$p */
    public static final class C31349p extends Lambda implements Function0<ScreenShotProcess> {
        final /* synthetic */ ICalendarDetailContact.IDetailView $view;
        final /* synthetic */ BaseDetailPresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31349p(BaseDetailPresenter baseDetailPresenter, ICalendarDetailContact.IDetailView bVar) {
            super(0);
            this.this$0 = baseDetailPresenter;
            this.$view = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ScreenShotProcess invoke() {
            return new ScreenShotProcess(this.$view.mo113492a(), this.this$0.mo113871r());
        }
    }

    /* renamed from: A */
    private final void m117860A() {
        this.f79322i = new C31353t(this);
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_EVENT_VIDEO_MEETING_CHANGE, this.f79322i);
    }

    /* renamed from: B */
    private final void m117861B() {
        this.f79323j = new C31351r(this);
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_ASSOCIATED_VC_STATUS, this.f79323j);
    }

    /* renamed from: C */
    private final void m117862C() {
        this.f79325l = new C31350q(this);
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_ASSOCIATED_LIVE_STATUS, this.f79325l);
    }

    /* renamed from: D */
    private final void m117863D() {
        m117865F();
        m117864E();
        m117866G();
        m117867H();
        m117870K();
        m117878v().mo113901b();
        m117879w().mo112739b();
    }

    /* renamed from: J */
    private final void m117869J() {
        CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
        if (c != null) {
            mo113854c(c);
            VideoMeetingHandleProcess cVar = this.f79319e;
            if (cVar != null) {
                cVar.mo113467a(c);
            }
        }
    }

    /* renamed from: x */
    private final void m117880x() {
        m117881y();
        m117882z();
        m117860A();
        m117861B();
        m117862C();
        m117878v().mo113900a();
    }

    /* renamed from: y */
    private final void m117881y() {
        this.f79316b = new C31352s(this);
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_MEETING_NOTIFICATION, this.f79316b);
    }

    /* renamed from: z */
    private final void m117882z() {
        this.f79321h = new C31354u(this);
        C30022a.f74882a.timeFormatDependency().mo108188a(this.f79321h);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f79315a = false;
        VideoMeetingHandleProcess cVar = this.f79319e;
        if (cVar != null) {
            cVar.mo113471b();
        }
        MeetingGroupOpenProcess aVar = this.f79320f;
        if (aVar != null) {
            aVar.mo113444a();
        }
        EventBus.getDefault().unregister(this);
        m117863D();
    }

    /* renamed from: g */
    public final void mo113859g() {
        m117874a(false, (IGetDataCallback<CalendarEventShareLink>) null);
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113499a(new C31333aa(this));
    }

    /* renamed from: h */
    public final void mo113860h() {
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113528s();
        m117874a(true, (IGetDataCallback<CalendarEventShareLink>) mo118653u().wrapAndAddGetDataCallback(new C31358y(this)));
    }

    /* renamed from: i */
    public final void mo113861i() {
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113529t();
        m117874a(true, (IGetDataCallback<CalendarEventShareLink>) mo118653u().wrapAndAddGetDataCallback(new C31359z(this)));
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f79315a = true;
        C32583e a = C32583e.m124816a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarService.getInstance()");
        this.f79318d = a;
        C32533b a2 = C32533b.m124620a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarEventService.getInstance()");
        this.f79317c = a2;
        m117880x();
        EventBus.getDefault().register(this);
    }

    /* renamed from: m */
    public final void mo113865m() {
        CalendarEventType calendarEventType = CalendarEventType.NOT_JOIN_EVENT;
        if (calendarEventType != ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113414b()) {
            ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113402a(calendarEventType);
            ((ICalendarDetailContact.IDetailView) mo118651s()).mo113497a((ICalendarDetailContact.IDetailViewData) ((ICalendarDetailContact.IDetailModel) mo118652t()).mo109793f());
        }
    }

    /* renamed from: I */
    private final void m117868I() {
        CalendarEventType calendarEventType;
        CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
        if (c != null) {
            if (c.getDisplayType() == CalendarEvent.DisplayType.LIMITED) {
                calendarEventType = CalendarEventType.LIMITED_EVENT;
            } else if (c.getSource() == CalendarEvent.Source.EXCHANGE || c.getSource() == CalendarEvent.Source.GOOGLE) {
                calendarEventType = CalendarEventType.THIRD_PARTY_EVENT;
            } else if (c.getSource() == CalendarEvent.Source.ANDROID) {
                calendarEventType = CalendarEventType.LOCAL_EVENT;
            } else {
                calendarEventType = CalendarEventType.NORMAL_EVENT;
            }
            if (((ICalendarDetailContact.IDetailModel) mo118652t()).mo113414b() != calendarEventType) {
                ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113402a(calendarEventType);
                ((ICalendarDetailContact.IDetailView) mo118651s()).mo113497a((ICalendarDetailContact.IDetailViewData) ((ICalendarDetailContact.IDetailModel) mo118652t()).mo109793f());
            }
        }
    }

    /* renamed from: n */
    public final void mo113866n() {
        if (((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c() == null) {
            ((ICalendarDetailContact.IDetailView) mo118651s()).mo113514e();
        } else if (!NetworkUtils.isNetworkAvailable(((ICalendarDetailContact.IDetailView) mo118651s()).mo113492a())) {
            ((ICalendarDetailContact.IDetailView) mo118651s()).mo113493a(R.string.Calendar_Toast_Disconnected);
        } else {
            ((ICalendarDetailContact.IDetailView) mo118651s()).mo113493a(R.string.Calendar_Common_FailedtoLoad2);
        }
    }

    /* renamed from: o */
    public final void mo113867o() {
        if (this.f79324k == null) {
            DeleteProcess aVar = new DeleteProcess(((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c());
            this.f79324k = aVar;
            if (aVar != null) {
                aVar.mo114681a("event_detail");
            }
            DeleteProcess aVar2 = this.f79324k;
            if (aVar2 != null) {
                aVar2.mo114675a(new C31338f(this));
            }
        }
        DeleteProcess aVar3 = this.f79324k;
        if (aVar3 != null) {
            aVar3.mo114680a(((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c(), ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113426i(), mo118653u(), ((ICalendarDetailContact.IDetailView) mo118651s()).mo113492a());
        }
    }

    /* renamed from: p */
    public final void mo113869p() {
        String str;
        CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
        if (c != null) {
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("BaseDetailPresenter", C32673y.m125376b(valueOf, "createMeetingMinuteByEvent", "calendar_id", c.getCalendarId(), "key", c.getKey(), "original_time", String.valueOf(c.getOriginalTime())));
            ((ICalendarDetailContact.IDetailView) mo118651s()).mo113507b(4);
            CalendarEvent c2 = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
            if (c2 != null) {
                str = c2.getMeetingMinuteUrl();
            } else {
                str = null;
            }
            UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C31336d(this, valueOf, "createMeetingMinuteByEvent", c, !TextUtils.isEmpty(str)));
            AppreciableHitPoint.f83321a.mo118671A();
            AbstractC32594f fVar = this.f79317c;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCalendarEventService");
            }
            fVar.mo118886e(c.getCalendarId(), c.getKey(), c.getOriginalTime(), wrapAndAddGetDataCallback);
        }
    }

    /* renamed from: q */
    public final void mo113870q() {
        String str;
        CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
        if (c != null) {
            ((ICalendarDetailContact.IDetailView) mo118651s()).mo113507b(2);
            String valueOf = String.valueOf(new Date().getTime());
            String[] strArr = new String[8];
            strArr[0] = "key";
            strArr[1] = c.getKey();
            strArr[2] = "calendar_id";
            strArr[3] = c.getCalendarId();
            strArr[4] = "original_time";
            strArr[5] = String.valueOf(c.getOriginalTime());
            strArr[6] = "message_id";
            String n = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113431n();
            if (n == null) {
                n = "";
            }
            strArr[7] = n;
            Log.m165389i("BaseDetailPresenter", C32673y.m125376b(valueOf, "joinCalendarEvent", strArr));
            UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C31343j(this, valueOf, "joinCalendarEvent"));
            AbstractC32594f fVar = this.f79317c;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCalendarEventService");
            }
            String calendarId = c.getCalendarId();
            String key = c.getKey();
            long originalTime = c.getOriginalTime();
            String n2 = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113431n();
            if (n2 != null) {
                str = n2;
            } else {
                str = "";
            }
            fVar.mo118879b(calendarId, key, originalTime, str, ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113432o(), wrapAndAddGetDataCallback);
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$y */
    public static final class C31358y implements IGetDataCallback<CalendarEventShareLink> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79380a;

        C31358y(BaseDetailPresenter baseDetailPresenter) {
            this.f79380a = baseDetailPresenter;
        }

        /* renamed from: a */
        public void onSuccess(CalendarEventShareLink aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "calendarEventShareLink");
            ((ICalendarDetailContact.IDetailView) this.f79380a.mo118651s()).mo113495a(aVar.mo120040c());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((ICalendarDetailContact.IDetailView) this.f79380a.mo118651s()).mo113495a((Bitmap) null);
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$z */
    public static final class C31359z implements IGetDataCallback<CalendarEventShareLink> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79381a;

        C31359z(BaseDetailPresenter baseDetailPresenter) {
            this.f79381a = baseDetailPresenter;
        }

        /* renamed from: a */
        public void onSuccess(CalendarEventShareLink aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "calendarEventShareLink");
            ((ICalendarDetailContact.IDetailView) this.f79381a.mo118651s()).mo113508b(aVar.mo120040c());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((ICalendarDetailContact.IDetailView) this.f79381a.mo118651s()).mo113508b((Bitmap) null);
        }
    }

    /* renamed from: a */
    public void mo113848a(List<String> list) {
        m117876d(list);
    }

    /* renamed from: a */
    public final void mo113843a(Bundle bundle) {
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113496a(bundle);
    }

    public final void onQuitMeetingEvent(C32491i iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "event");
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113506b();
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$c */
    public static final class C31335c implements IGetDataCallback<DoVideoMeeting> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79330a;

        /* renamed from: b */
        final /* synthetic */ String f79331b;

        /* renamed from: c */
        final /* synthetic */ String f79332c;

        /* renamed from: d */
        final /* synthetic */ CalendarEvent f79333d;

        /* renamed from: e */
        final /* synthetic */ List f79334e;

        /* renamed from: a */
        public void onSuccess(DoVideoMeeting doVideoMeeting) {
            Log.m165389i("BaseDetailPresenter", C32673y.m125373a(this.f79331b, this.f79332c, new String[0]));
            this.f79333d.setVideoMeeting(doVideoMeeting);
            this.f79330a.mo113848a(this.f79334e);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("BaseDetailPresenter", C32673y.m125370a(this.f79331b, this.f79332c, errorResult));
            this.f79330a.mo113848a(this.f79334e);
        }

        C31335c(BaseDetailPresenter baseDetailPresenter, String str, String str2, CalendarEvent calendarEvent, List list) {
            this.f79330a = baseDetailPresenter;
            this.f79331b = str;
            this.f79332c = str2;
            this.f79333d = calendarEvent;
            this.f79334e = list;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$g */
    public static final class C31339g implements IGetDataCallback<CalendarEventShareLink> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79342a;

        /* renamed from: b */
        final /* synthetic */ String f79343b;

        /* renamed from: c */
        final /* synthetic */ String f79344c;

        /* renamed from: d */
        final /* synthetic */ IGetDataCallback f79345d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback iGetDataCallback = this.f79345d;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
            Log.m165389i("BaseDetailPresenter", C32673y.m125370a(this.f79343b, this.f79344c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(CalendarEventShareLink aVar) {
            if (aVar != null) {
                if (!TextUtils.isEmpty(aVar.mo120038b())) {
                    ((ICalendarDetailContact.IDetailModel) this.f79342a.mo118652t()).mo113423e(aVar.mo120038b());
                }
                if (!TextUtils.isEmpty(aVar.mo120035a())) {
                    ((ICalendarDetailContact.IDetailModel) this.f79342a.mo118652t()).mo113421d(aVar.mo120035a());
                }
                Log.m165389i("BaseDetailPresenter", C32673y.m125373a(this.f79343b, this.f79344c, "suc getCalendarEventShareLink"));
                IGetDataCallback iGetDataCallback = this.f79345d;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(aVar);
                }
            }
        }

        C31339g(BaseDetailPresenter baseDetailPresenter, String str, String str2, IGetDataCallback iGetDataCallback) {
            this.f79342a = baseDetailPresenter;
            this.f79343b = str;
            this.f79344c = str2;
            this.f79345d = iGetDataCallback;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$k */
    public static final class C31344k implements IGetDataCallback<List<? extends Calendar>> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79352a;

        /* renamed from: b */
        final /* synthetic */ String f79353b;

        /* renamed from: c */
        final /* synthetic */ String f79354c;

        /* renamed from: d */
        final /* synthetic */ List f79355d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("BaseDetailPresenter", C32673y.m125370a(this.f79353b, this.f79354c, errorResult));
            this.f79352a.mo113855c(this.f79355d);
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Calendar> list) {
            int i;
            if (list != null) {
                i = list.size();
            } else {
                i = -1;
            }
            boolean z = true;
            Log.m165389i("BaseDetailPresenter", C32673y.m125373a(this.f79353b, this.f79354c, "calendars_size", String.valueOf(i)));
            List<? extends Calendar> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                z = false;
            }
            if (!z) {
                ((ICalendarDetailContact.IDetailModel) this.f79352a.mo118652t()).mo113405a((Calendar) list.get(0));
            }
            this.f79352a.mo113855c(this.f79355d);
        }

        C31344k(BaseDetailPresenter baseDetailPresenter, String str, String str2, List list) {
            this.f79352a = baseDetailPresenter;
            this.f79353b = str;
            this.f79354c = str2;
            this.f79355d = list;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$m */
    public static final class C31346m implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79359a;

        /* renamed from: b */
        final /* synthetic */ String f79360b;

        /* renamed from: c */
        final /* synthetic */ String f79361c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((ICalendarDetailContact.IDetailModel) this.f79359a.mo118652t()).mo113413a(false);
            Log.m165383e("BaseDetailPresenter", C32673y.m125370a(this.f79360b, this.f79361c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            ((ICalendarDetailContact.IDetailModel) this.f79359a.mo118652t()).mo113413a(true);
            Log.m165389i("BaseDetailPresenter", C32673y.m125373a(this.f79360b, this.f79361c, "exceptional_event_has_repeat_event", "true"));
        }

        C31346m(BaseDetailPresenter baseDetailPresenter, String str, String str2) {
            this.f79359a = baseDetailPresenter;
            this.f79360b = str;
            this.f79361c = str2;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$n */
    public static final class C31347n implements IGetDataCallback<List<? extends CalendarEvent>> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79362a;

        /* renamed from: b */
        final /* synthetic */ String f79363b;

        /* renamed from: c */
        final /* synthetic */ String f79364c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f79362a.mo113866n();
            Log.m165383e("BaseDetailPresenter", C32673y.m125370a(this.f79363b, this.f79364c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(List<? extends CalendarEvent> list) {
            int i;
            if (list != null) {
                i = list.size();
            } else {
                i = -1;
            }
            boolean z = true;
            Log.m165389i("BaseDetailPresenter", C32673y.m125373a(this.f79363b, this.f79364c, "calendar_events_size", String.valueOf(i)));
            List<? extends CalendarEvent> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                z = false;
            }
            if (z) {
                Log.m165383e("BaseDetailPresenter", C32673y.m125378d("server event is null"));
                return;
            }
            BaseDetailPresenter baseDetailPresenter = this.f79362a;
            List<String> a = baseDetailPresenter.mo113838a(((ICalendarDetailContact.IDetailModel) baseDetailPresenter.mo118652t()).mo113417c(), (CalendarEvent) list.get(0));
            ((ICalendarDetailContact.IDetailModel) this.f79362a.mo118652t()).mo113406a((CalendarEvent) list.get(0));
            this.f79362a.mo113853b(a);
        }

        C31347n(BaseDetailPresenter baseDetailPresenter, String str, String str2) {
            this.f79362a = baseDetailPresenter;
            this.f79363b = str;
            this.f79364c = str2;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$j */
    public static final class C31343j implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79349a;

        /* renamed from: b */
        final /* synthetic */ String f79350b;

        /* renamed from: c */
        final /* synthetic */ String f79351c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("BaseDetailPresenter", C32673y.m125370a(this.f79350b, this.f79351c, errorResult));
            ((ICalendarDetailContact.IDetailView) this.f79349a.mo118651s()).mo113494a(2, errorResult.getErrorCode());
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            String str;
            if (calendarEvent == null) {
                str = "event=null";
            } else {
                str = calendarEvent.getKey();
            }
            Log.m165389i("BaseDetailPresenter", C32673y.m125373a(this.f79350b, this.f79351c, "key", str));
            CalendarHitPoint.m124138h();
            ((ICalendarDetailContact.IDetailView) this.f79349a.mo118651s()).mo113511c(2);
            ICalendarDetailContact.IDetailModel aVar = (ICalendarDetailContact.IDetailModel) this.f79349a.mo118652t();
            if (calendarEvent != null) {
                aVar.mo113406a(calendarEvent);
                ((ICalendarDetailContact.IDetailModel) this.f79349a.mo118652t()).mo113407a(calendarEvent, false);
                this.f79349a.mo113857e();
                BaseDetailPresenter.m117871a(this.f79349a, calendarEvent, false, 2, null);
            }
        }

        C31343j(BaseDetailPresenter baseDetailPresenter, String str, String str2) {
            this.f79349a = baseDetailPresenter;
            this.f79350b = str;
            this.f79351c = str2;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$l */
    public static final class C31345l implements IGetDataCallback<Map<String, ? extends AbstractC30026d>> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79356a;

        /* renamed from: b */
        final /* synthetic */ String f79357b;

        /* renamed from: c */
        final /* synthetic */ String f79358c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("BaseDetailPresenter", C32673y.m125370a(this.f79357b, this.f79358c, errorResult));
            ((ICalendarDetailContact.IDetailView) this.f79356a.mo118651s()).mo113493a(R.string.Calendar_Common_NoCantacFound);
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends AbstractC30026d> map) {
            String str;
            if (map == null || (str = String.valueOf(map.size())) == null) {
                str = "null";
            }
            boolean z = true;
            Log.m165389i("BaseDetailPresenter", C32673y.m125373a(this.f79357b, this.f79358c, "chatters_size", str));
            if (map != null && !map.isEmpty()) {
                z = false;
            }
            if (z) {
                ((ICalendarDetailContact.IDetailView) this.f79356a.mo118651s()).mo113493a(R.string.Calendar_Common_NoCantacFound);
                return;
            }
            GeneralHitPoint.m124264o("event_detail");
            C30022a.f74882a.oldModuleDependency().mo108283a(((ICalendarDetailContact.IDetailView) this.f79356a.mo118651s()).mo113492a(), (AbstractC30026d) new ArrayList(map.values()).get(0), ((ICalendarDetailContact.IDetailModel) this.f79356a.mo118652t()).mo113437t(), ((ICalendarDetailContact.IDetailModel) this.f79356a.mo118652t()).mo113395D());
        }

        C31345l(BaseDetailPresenter baseDetailPresenter, String str, String str2) {
            this.f79356a = baseDetailPresenter;
            this.f79357b = str;
            this.f79358c = str2;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$q */
    public static final class C31350q implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79365a;

        C31350q(BaseDetailPresenter baseDetailPresenter) {
            this.f79365a = baseDetailPresenter;
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("BaseDetailPresenter", C32673y.m125374b("pushAssociatedLiveStatus"));
            Object obj = jSONObject.get("associated_live_status");
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "data[CalendarPushConstan…alendarPushHandleCallBack");
                VideoMeetingHandleProcess cVar = this.f79365a.f79319e;
                if (cVar != null) {
                    cVar.mo113476f();
                }
                if (obj instanceof AssociatedLiveStatus) {
                    ((ICalendarDetailContact.IDetailView) this.f79365a.mo118651s()).mo113500a((AssociatedLiveStatus) obj);
                }
            }
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$r */
    public static final class C31351r implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79366a;

        C31351r(BaseDetailPresenter baseDetailPresenter) {
            this.f79366a = baseDetailPresenter;
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("BaseDetailPresenter", C32673y.m125374b("pushAssociatedVCStatus"));
            Object obj = jSONObject.get("associated_video_meeting");
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "data.get(CalendarPushCon…alendarPushHandleCallBack");
                VideoMeetingHandleProcess cVar = this.f79366a.f79319e;
                if (cVar != null) {
                    cVar.mo113474d();
                }
                if (obj instanceof AssociatedVideoChatStatus) {
                    ((ICalendarDetailContact.IDetailView) this.f79366a.mo118651s()).mo113501a((AssociatedVideoChatStatus) obj);
                }
            }
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$v */
    public static final class C31355v implements IGetDataCallback<OptimisticReplyCalendarEventInvitationResponse> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79370a;

        /* renamed from: b */
        final /* synthetic */ String f79371b;

        /* renamed from: c */
        final /* synthetic */ String f79372c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            AppreciableHitPoint.f83321a.mo118684d(errorResult);
            Log.m165383e("BaseDetailPresenter", C32673y.m125370a(this.f79371b, this.f79372c, errorResult));
            CalendarPerfMonitor.m124417b("key_rsvp_event");
            ((ICalendarDetailContact.IDetailView) this.f79370a.mo118651s()).mo113494a(3, errorResult.getErrorCode());
        }

        /* renamed from: a */
        public void onSuccess(OptimisticReplyCalendarEventInvitationResponse sVar) {
            CalendarEvent calendarEvent;
            Log.m165389i("BaseDetailPresenter", C32673y.m125373a(this.f79371b, this.f79372c, new String[0]));
            if (sVar != null) {
                calendarEvent = sVar.mo120208a();
            } else {
                calendarEvent = null;
            }
            if (calendarEvent == null) {
                onError(new ErrorResult("event null"));
                return;
            }
            ((ICalendarDetailContact.IDetailModel) this.f79370a.mo118652t()).mo113407a(calendarEvent, true);
            AppreciableHitPoint.f83321a.mo118706v();
            CalendarPerfMonitor.m124413a("key_rsvp_event");
            ((ICalendarDetailContact.IDetailView) this.f79370a.mo118651s()).mo113511c(3);
            this.f79370a.mo113857e();
            EventBus.getDefault().trigger(new C32493l());
            CalendarPerfoMonitor.m124404a(CalendarPerfoMonitor.EventType.PERF_CAL_REPLY);
        }

        C31355v(BaseDetailPresenter baseDetailPresenter, String str, String str2) {
            this.f79370a = baseDetailPresenter;
            this.f79371b = str;
            this.f79372c = str2;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$x */
    public static final class C31357x implements IGetDataCallback<List<? extends ShareFailedChat>> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79376a;

        /* renamed from: b */
        final /* synthetic */ String f79377b;

        /* renamed from: c */
        final /* synthetic */ String f79378c;

        /* renamed from: d */
        final /* synthetic */ CalendarEvent f79379d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("BaseDetailPresenter", C32673y.m125370a(this.f79377b, this.f79378c, errorResult));
            ((ICalendarDetailContact.IDetailView) this.f79376a.mo118651s()).mo113494a(1, errorResult.getErrorCode());
            AppreciableHitPoint.f83321a.mo118680b(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(List<ShareFailedChat> list) {
            boolean z;
            String str;
            boolean z2 = false;
            Log.m165389i("BaseDetailPresenter", C32673y.m125373a(this.f79377b, this.f79378c, new String[0]));
            AppreciableHitPoint.f83321a.mo118702r();
            CalendarHitPoint.m124136g();
            if (this.f79379d.getType() == CalendarEvent.Type.MEETING) {
                CalendarHitPoint.m124118a(CalendarEvent.Span.ALL_EVENTS.getNumber());
            }
            ((ICalendarDetailContact.IDetailView) this.f79376a.mo118651s()).mo113527r();
            StringBuilder sb = new StringBuilder();
            List<ShareFailedChat> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ((ICalendarDetailContact.IDetailView) this.f79376a.mo118651s()).mo113511c(1);
                return;
            }
            ((ICalendarDetailContact.IDetailView) this.f79376a.mo118651s()).mo113522m();
            AbstractC30052p languageDependency = C30022a.f74882a.languageDependency();
            Intrinsics.checkExpressionValueIsNotNull(languageDependency, "CalendarDependencyHolder…ency.languageDependency()");
            if (languageDependency.mo108250c()) {
                str = ", ";
            } else {
                str = "，";
            }
            for (ShareFailedChat xVar : list) {
                if (xVar.mo120244a() == 4042) {
                    if (z2) {
                        sb.append(str);
                    }
                    sb.append(xVar.mo120245b());
                    z2 = true;
                }
            }
            if (z2) {
                String a = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Share_RestrictionContent, "group_name", sb.toString());
                Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDependencyHolder…rictionGroups.toString())");
                ((ICalendarDetailContact.IDetailView) this.f79376a.mo118651s()).mo113512c(a);
            }
        }

        C31357x(BaseDetailPresenter baseDetailPresenter, String str, String str2, CalendarEvent calendarEvent) {
            this.f79376a = baseDetailPresenter;
            this.f79377b = str;
            this.f79378c = str2;
            this.f79379d = calendarEvent;
        }
    }

    /* renamed from: e */
    private final void m117877e(List<String> list) {
        boolean z;
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (String str : list) {
                GeneralHitPoint.m124186a(((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c(), ShareType.LARK, str);
            }
        }
    }

    /* renamed from: c */
    public final void mo113854c(CalendarEvent calendarEvent) {
        if (this.f79319e == null) {
            VideoMeetingHandleProcess cVar = new VideoMeetingHandleProcess(((ICalendarDetailContact.IDetailView) mo118651s()).mo113492a(), calendarEvent, ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113426i());
            this.f79319e = cVar;
            if (cVar != null) {
                cVar.mo113466a(new C31337e(this));
            }
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$d */
    public static final class C31336d implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79335a;

        /* renamed from: b */
        final /* synthetic */ String f79336b;

        /* renamed from: c */
        final /* synthetic */ String f79337c;

        /* renamed from: d */
        final /* synthetic */ CalendarEvent f79338d;

        /* renamed from: e */
        final /* synthetic */ boolean f79339e;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("BaseDetailPresenter", C32673y.m125370a(this.f79336b, this.f79337c, errorResult));
            this.f79338d.setMeetingMinuteUrl("");
            AppreciableHitPoint.f83321a.mo118690g(errorResult);
            ((ICalendarDetailContact.IDetailView) this.f79335a.mo118651s()).mo113494a(4, 0);
            if (errorResult.getErrorCode() == 10008) {
                ((ICalendarDetailContact.IDetailView) this.f79335a.mo118651s()).mo113493a(R.string.Calendar_Detail_NoNetwork);
            } else if (errorResult.getErrorCode() == 8020) {
                ((ICalendarDetailContact.IDetailView) this.f79335a.mo118651s()).mo113530u();
            } else {
                ((ICalendarDetailContact.IDetailView) this.f79335a.mo118651s()).mo113493a(R.string.Calendar_Common_FailedtoLoad2);
            }
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            String str2;
            Log.m165389i("BaseDetailPresenter", C32673y.m125373a(this.f79336b, this.f79337c, new String[0]));
            ((ICalendarDetailContact.IDetailView) this.f79335a.mo118651s()).mo113511c(4);
            AppreciableHitPoint.f83321a.mo118672B();
            AbstractC30043e browserModuleDependency = C30022a.f74882a.browserModuleDependency();
            Activity a = ((ICalendarDetailContact.IDetailView) this.f79335a.mo118651s()).mo113492a();
            String str3 = "";
            if (str != null) {
                str2 = str;
            } else {
                str2 = str3;
            }
            browserModuleDependency.mo108213c(a, str2);
            CalendarEvent calendarEvent = this.f79338d;
            if (str != null) {
                str3 = str;
            }
            calendarEvent.setMeetingMinuteUrl(str3);
            GeneralHitPoint.m124188a(((ICalendarDetailContact.IDetailModel) this.f79335a.mo118652t()).mo113417c(), "event_detail", str, this.f79339e);
            String meetingMinuteUrl = this.f79338d.getMeetingMinuteUrl();
            Intrinsics.checkExpressionValueIsNotNull(meetingMinuteUrl, "event.meetingMinuteUrl");
            List split$default = StringsKt.split$default((CharSequence) meetingMinuteUrl, new String[]{"/"}, false, 0, 6, (Object) null);
            if (split$default.size() > 4) {
                CalendarEventHitPoint.m124343a(((ICalendarDetailContact.IDetailModel) this.f79335a.mo118652t()).mo113395D(), ((ICalendarDetailContact.IDetailModel) this.f79335a.mo118652t()).mo113397F(), "create_meeting_minutes", (String) split$default.get(4), (String) split$default.get(3));
            }
        }

        C31336d(BaseDetailPresenter baseDetailPresenter, String str, String str2, CalendarEvent calendarEvent, boolean z) {
            this.f79335a = baseDetailPresenter;
            this.f79336b = str;
            this.f79337c = str2;
            this.f79338d = calendarEvent;
            this.f79339e = z;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$s */
    public static final class C31352s implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79367a;

        C31352s(BaseDetailPresenter baseDetailPresenter) {
            this.f79367a = baseDetailPresenter;
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("BaseDetailPresenter", C32673y.m125374b("push meeting notification"));
            try {
                ArrayList<C32607n> arrayList = (ArrayList) jSONObject.get("calendar_meeting_event_ref");
                CalendarEvent c = ((ICalendarDetailContact.IDetailModel) this.f79367a.mo118652t()).mo113417c();
                if (!(c == null || arrayList == null)) {
                    for (C32607n nVar : arrayList) {
                        if (TextUtils.isEmpty(nVar.mo120131a()) && nVar.mo120134b() == c.getOriginalTime() && Intrinsics.areEqual(nVar.mo120131a(), c.getKey())) {
                            c.setType(CalendarEvent.Type.MEETING);
                        }
                    }
                }
            } catch (Exception unused) {
                Log.m165383e("BaseDetailPresenter", C32673y.m125374b("push meeting notification err!"));
            }
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$w */
    public static final class C31356w implements IGetDataCallback<OptimisticReplyCalendarEventInvitationResponse> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79373a;

        /* renamed from: b */
        final /* synthetic */ String f79374b;

        /* renamed from: c */
        final /* synthetic */ String f79375c;

        /* renamed from: a */
        public void onSuccess(OptimisticReplyCalendarEventInvitationResponse sVar) {
            CalendarEvent calendarEvent;
            Log.m165389i("BaseDetailPresenter", C32673y.m125373a(this.f79374b, this.f79375c, new String[0]));
            ((ICalendarDetailContact.IDetailView) this.f79373a.mo118651s()).mo113523n();
            if (sVar != null) {
                calendarEvent = sVar.mo120208a();
            } else {
                calendarEvent = null;
            }
            if (calendarEvent == null) {
                onError(new ErrorResult("event null"));
                return;
            }
            ((ICalendarDetailContact.IDetailModel) this.f79373a.mo118652t()).mo113407a(calendarEvent, true);
            this.f79373a.mo113857e();
            if (!TextUtils.isEmpty(sVar.mo120209b())) {
                C30022a.f74882a.chatModuleDependency().mo108222a(((ICalendarDetailContact.IDetailView) this.f79373a.mo118651s()).mo113492a(), sVar.mo120209b());
            }
            EventBus.getDefault().trigger(new C32493l());
            AppreciableHitPoint.f83321a.mo118706v();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            String str;
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("BaseDetailPresenter", C32673y.m125370a(this.f79374b, this.f79375c, errorResult));
            if (errorResult.getErrorCode() == 8016) {
                str = C32634ae.m125182b(R.string.Calendar_Detail_ReplyRSVPResigned);
            } else if (errorResult.getErrorCode() == 8031) {
                str = C32634ae.m125182b(R.string.Calendar_Detail_ReplyRSVPNotFriend);
            } else {
                str = C32634ae.m125182b(R.string.Calendar_Share_RestrictionTitle);
            }
            AppreciableHitPoint.f83321a.mo118706v();
            Intrinsics.checkExpressionValueIsNotNull(str, ApiHandler.API_CALLBACK_ERRMSG);
            ((ICalendarDetailContact.IDetailView) this.f79373a.mo118651s()).mo113509b(str);
        }

        C31356w(BaseDetailPresenter baseDetailPresenter, String str, String str2) {
            this.f79373a = baseDetailPresenter;
            this.f79374b = str;
            this.f79375c = str2;
        }
    }

    /* renamed from: d */
    private final void m117876d(List<String> list) {
        CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
        if (c != null) {
            String calendarId = c.getCalendarId();
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("BaseDetailPresenter", C32673y.m125376b(valueOf, "getCalendarById", "calendar_ids", calendarId));
            UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C31344k(this, valueOf, "getCalendarById", list));
            AbstractC32595g gVar = this.f79318d;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCalendarService");
            }
            gVar.mo119039a(CollectionsKt.listOf(calendarId), wrapAndAddGetDataCallback);
        }
    }

    /* renamed from: b */
    public final void mo113851b(CalendarEvent calendarEvent) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "sdkEvent");
        if (!TextUtils.isEmpty(calendarEvent.getCalendarId()) && !TextUtils.isEmpty(calendarEvent.getKey())) {
            String l = Long.toString(new Date().getTime());
            Log.m165389i("BaseDetailPresenter", C32673y.m125376b(l, "loadExceptionalHasRepeat", new String[0]));
            C31346m mVar = new C31346m(this, l, "loadExceptionalHasRepeat");
            AbstractC32594f fVar = this.f79317c;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCalendarEventService");
            }
            fVar.mo118878b(calendarEvent.getCalendarId(), calendarEvent.getKey(), 0, mVar);
        }
    }

    /* renamed from: c */
    public final void mo113855c(List<String> list) {
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113513d();
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113504a(list);
        m117869J();
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113516g();
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113517h();
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113518i();
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113519j();
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113520k();
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$t */
    public static final class C31353t implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79368a;

        C31353t(BaseDetailPresenter baseDetailPresenter) {
            this.f79368a = baseDetailPresenter;
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("BaseDetailPresenter", C32673y.m125374b("pushEventMeetingChangeNotification"));
            Object obj = jSONObject.get("calendar_event_video_meeting");
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "data.get(CalendarPushCon…alendarPushHandleCallBack");
                if (obj != null) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (!CollectionUtils.isEmpty(arrayList)) {
                        DoVideoMeeting doVideoMeeting = null;
                        CalendarEvent c = ((ICalendarDetailContact.IDetailModel) this.f79368a.mo118652t()).mo113417c();
                        if (c != null) {
                            DoVideoMeeting videoMeeting = c.getVideoMeeting();
                            if (videoMeeting == null || videoMeeting.getMeetingType() == VideoType.VCHAT) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    DoEventVideoMeetingInfo doEventVideoMeetingInfo = (DoEventVideoMeetingInfo) it.next();
                                    if (TextUtils.equals(doEventVideoMeetingInfo.getCalendarId(), c.getCalendarId()) && TextUtils.equals(doEventVideoMeetingInfo.getKey(), c.getKey()) && doEventVideoMeetingInfo.getOriginalTime() == c.getOriginalTime() && doEventVideoMeetingInfo.getVideoMeeting() != null) {
                                        doVideoMeeting = doEventVideoMeetingInfo.getVideoMeeting();
                                    }
                                }
                                if (doVideoMeeting != null) {
                                    c.setVideoMeeting(doVideoMeeting);
                                    this.f79368a.mo113854c(c);
                                    VideoMeetingHandleProcess cVar = this.f79368a.f79319e;
                                    if (cVar != null) {
                                        cVar.mo113467a(c);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.lark.calendar.impl.rustadapter.doentity.DoEventVideoMeetingInfo> /* = java.util.ArrayList<com.ss.android.lark.calendar.impl.rustadapter.doentity.DoEventVideoMeetingInfo> */");
            }
        }
    }

    /* renamed from: b */
    public final void mo113852b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "attendeeCalendarId");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("BaseDetailPresenter", C32673y.m125376b(valueOf, "loadChatterByAttendeeId", "calendar_ids", str));
        C32583e.m124816a().mo119042b(arrayList, mo118653u().wrapAndAddGetDataCallback(new C31345l(this, valueOf, "loadChatterByAttendeeId")));
    }

    /* renamed from: b */
    public final void mo113853b(List<String> list) {
        String str;
        if (((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c() == null) {
            mo113848a(list);
            return;
        }
        CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
        if (c != null) {
            if (c.getVideoMeeting() != null) {
                DoVideoMeeting videoMeeting = c.getVideoMeeting();
                if (videoMeeting != null) {
                    str = videoMeeting.getId();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    mo113848a(list);
                    return;
                }
            }
            DoVideoMeeting videoMeeting2 = c.getVideoMeeting();
            if (videoMeeting2 == null || videoMeeting2.getMeetingType() == VideoType.VCHAT || videoMeeting2.getMeetingType() == VideoType.LARK_LIVE_HOST) {
                String valueOf = String.valueOf(new Date().getTime());
                Log.m165389i("BaseDetailPresenter", C32673y.m125376b(valueOf, "getEventVideoMeeting", new String[0]));
                UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C31335c(this, valueOf, "getEventVideoMeeting", c, list));
                CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
                String calendarId = c.getCalendarId();
                Intrinsics.checkExpressionValueIsNotNull(calendarId, "event.calendarId");
                String key = c.getKey();
                Intrinsics.checkExpressionValueIsNotNull(key, "event.key");
                long originalTime = c.getOriginalTime();
                Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiGetDataCallback");
                aVar.mo118938a(calendarId, key, originalTime, true, (IGetDataCallback<DoVideoMeeting>) wrapAndAddGetDataCallback);
                return;
            }
            mo113848a(list);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r2 != null) goto L_0x0068;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo113842a(android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter.mo113842a(android.content.Intent):void");
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter$h */
    public static final class C31340h implements C31129b.AbstractC31130a {

        /* renamed from: a */
        final /* synthetic */ BaseDetailPresenter f79346a;

        C31340h(BaseDetailPresenter baseDetailPresenter) {
            this.f79346a = baseDetailPresenter;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.p1498d.C31129b.AbstractC31130a
        /* renamed from: a */
        public final void mo112737a(String str, long j) {
            CalendarEvent c = ((ICalendarDetailContact.IDetailModel) this.f79346a.mo118652t()).mo113417c();
            if (c != null) {
                CalendarLogHelper.f78612a.mo112731a(c, ((ICalendarDetailContact.IDetailModel) this.f79346a.mo118652t()).mo113396E(), "event_detail");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseDetailPresenter(ICalendarDetailContact.IDetailView bVar, ICalendarDetailContact.IDetailModel aVar) {
        super(bVar, aVar);
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        this.f79327n = LazyKt.lazy(new C31348o(this, bVar, aVar));
        this.f79328o = LazyKt.lazy(new C31349p(this, bVar));
    }

    /* renamed from: a */
    private final void m117872a(CalendarEvent calendarEvent, CalendarEventAttendee.Status status) {
        String str;
        int i = C31365b.f79402b[status.ordinal()];
        if (i == 1) {
            str = "acpt";
        } else if (i == 2) {
            str = "decl";
        } else if (i != 3) {
            str = "";
        } else {
            str = "mayb";
        }
        if (!TextUtils.isEmpty(str)) {
            GeneralHitPoint.m124198a("event_detail", status, "no_value", calendarEvent);
        }
    }

    /* renamed from: a */
    private final void m117874a(boolean z, IGetDataCallback<CalendarEventShareLink> iGetDataCallback) {
        String str;
        String str2;
        CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
        if (c != null) {
            C31339g gVar = new C31339g(this, Long.toString(new Date().getTime()), "getCalendarEventShareLinkRequest", iGetDataCallback);
            CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
            String calendarId = c.getCalendarId();
            if (calendarId != null) {
                str = calendarId;
            } else {
                str = "";
            }
            String key = c.getKey();
            if (key != null) {
                str2 = key;
            } else {
                str2 = "";
            }
            long originalTime = c.getOriginalTime();
            ICallback wrapAndAddCallback = mo118653u().wrapAndAddCallback(gVar);
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddCallback, "callbackManager.wrapAndAddCallback(callback)");
            aVar.mo118953b(str, str2, originalTime, z, (IGetDataCallback) wrapAndAddCallback);
        }
    }

    /* renamed from: a */
    private final void m117873a(List<String> list, boolean z) {
        String str;
        CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
        if (c != null) {
            long originalTime = c.getOriginalTime();
            ((ICalendarDetailContact.IDetailView) mo118651s()).mo113507b(1);
            String valueOf = String.valueOf(new Date().getTime());
            if (list == null || (str = String.valueOf(list.size())) == null) {
                str = "chatIds=null";
            }
            Log.m165389i("BaseDetailPresenter", C32673y.m125376b(valueOf, "shareCalendarEvent", "calendar_id", c.getCalendarId(), "key", c.getKey(), "original_time", String.valueOf(originalTime), "chat_ids_size", str));
            UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C31357x(this, valueOf, "shareCalendarEvent", c));
            AbstractC32594f fVar = this.f79317c;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCalendarEventService");
            }
            fVar.mo118870a(c.getCalendarId(), c.getKey(), originalTime, list, wrapAndAddGetDataCallback);
            AppreciableHitPoint.f83321a.mo118701q();
        }
    }

    /* renamed from: a */
    public final List<String> mo113838a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2) {
        ArrayList arrayList = new ArrayList();
        if (calendarEvent == null || calendarEvent2 == null) {
            return arrayList;
        }
        if (Intrinsics.areEqual(calendarEvent.getDescription(), calendarEvent2.getDescription()) && Intrinsics.areEqual(calendarEvent.getDocsDescription(), calendarEvent2.getDocsDescription())) {
            arrayList.add("event_description");
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo113840a(int i, int i2, Intent intent) {
        ArrayList<String> arrayList;
        if (i2 == 2) {
            ((ICalendarDetailContact.IDetailView) mo118651s()).mo113506b();
        } else if (i2 == 3) {
            mo113842a(intent);
        } else if (i2 == 4) {
            if (intent != null) {
                arrayList = intent.getStringArrayListExtra("shareCalendarEventResult");
            } else {
                arrayList = null;
            }
            boolean z = false;
            if (intent != null) {
                z = intent.getBooleanExtra("shareCalendarEventExternalAlert", false);
            }
            if (arrayList != null && arrayList.size() != 0) {
                ArrayList<String> arrayList2 = arrayList;
                m117873a(arrayList2, z);
                m117877e(arrayList2);
            }
        }
    }

    /* renamed from: a */
    public final void mo113841a(Context context, VideoType videoType, String str, String str2) {
        boolean z;
        CalendarEventInstance i;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(videoType, "videoType");
        Intrinsics.checkParameterIsNotNull(str, "meetingId");
        Intrinsics.checkParameterIsNotNull(str2, "meetingUrl");
        if (videoType != VideoType.NO_VIDEO_MEETING) {
            if (videoType != VideoType.UNKNOWN_VIDEO_MEETING_TYPE || !TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                z = false;
            } else {
                z = true;
            }
            if (videoType == VideoType.VCHAT || z) {
                CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
                if (c != null && (i = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113426i()) != null) {
                    mo113854c(c);
                    VideoMeetingHandleProcess cVar = this.f79319e;
                    if (cVar != null) {
                        String summary = c.getSummary();
                        Intrinsics.checkExpressionValueIsNotNull(summary, "event.summary");
                        cVar.mo113468a(summary, i.getStartTime(), i.getEndTime());
                    }
                }
            } else if (TextUtils.isEmpty(str2)) {
            } else {
                if (videoType == VideoType.OTHER && !aq.m95060c(str2)) {
                    return;
                }
                if (videoType != VideoType.GOOGLE_VIDEO_CONFERENCE || !aq.m95060c(str2)) {
                    try {
                        C30022a.f74882a.browserModuleDependency().mo108211a(context, str2);
                    } catch (Exception unused) {
                        Log.m165383e("BaseDetailPresenter", "video url open error");
                    }
                } else {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                }
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m117871a(BaseDetailPresenter baseDetailPresenter, CalendarEvent calendarEvent, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            baseDetailPresenter.mo113847a(calendarEvent, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadServerEventIfNeed");
    }
}
