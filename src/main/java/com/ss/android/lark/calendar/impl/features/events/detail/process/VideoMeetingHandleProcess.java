package com.ss.android.lark.calendar.impl.features.events.detail.process;

import android.app.Activity;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.api.entity.CalendarPstnDetailInfo;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.VideoMeetingVisibility;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable.AppreciableHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarServerService;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30040ai;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.videochat.CalendarVideoChatStatus;
import com.ss.android.lark.pb.videoconference.v1.AssociatedLiveStatus;
import com.ss.android.lark.pb.videoconference.v1.LiveStatus;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 22\u00020\u0001:\u000223B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u001a\u001a\u00020\u0013J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\u0006\u0010\u001c\u001a\u00020\u0013J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\u0006\u0010\u001e\u001a\u00020\u0013J \u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0013H\u0002J\b\u0010#\u001a\u00020\fH\u0002J\b\u0010$\u001a\u00020\fH\u0002J\b\u0010%\u001a\u00020\fH\u0002J\u0006\u0010&\u001a\u00020\u0013J\u000e\u0010'\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010(\u001a\u00020\u00132\b\u0010)\u001a\u0004\u0018\u00010\u00152\u0006\u0010*\u001a\u00020\fH\u0002J\u000e\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\fJ\b\u0010-\u001a\u00020\u0013H\u0002J\b\u0010.\u001a\u00020\u0013H\u0002J\u0010\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u000201H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/process/VideoMeetingHandleProcess;", "", "activity", "Landroid/app/Activity;", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "eventInstance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "(Landroid/app/Activity;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;)V", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "canRenewVideoMeetingNumber", "", "hasVideoMeetingStatus", "videoDialog", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "videoListener", "Lcom/ss/android/lark/calendar/impl/features/events/detail/process/VideoMeetingHandleProcess$IVideoProcessListener;", "checkAndEnterVideoMeeting", "", "summary", "", "startTime", "", "endTime", "checkAndShowVideoMeeting", "checkHostLiveStatus", "checkVCUrlContainerVisibility", "checkVideoMeetingStatus", "createPstnCopyInfo", "destory", "enterVideoMeeting", "getVCUrlContainerVisibility", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/VideoMeetingVisibility;", "googleEventSetVideoMeetingPstnInfo", "isVideoMeetingExpired", "isVideoMeetingNumberExist", "isVideoMeetingVisiblity", "resume", "setVideoListener", "setVideoMeetingPstnInfo", "tenantId", "isLiving", "showEnterMeetingResultDialog", "isSuccess", "showEnteringMeetingDialog", "showVideoMeetingExpiredToast", "startCheckByType", "initialType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/VideoType;", "Companion", "IVideoProcessListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.c */
public final class VideoMeetingHandleProcess {

    /* renamed from: e */
    public static final Companion f79124e = new Companion(null);

    /* renamed from: a */
    public boolean f79125a;

    /* renamed from: b */
    public IVideoProcessListener f79126b;

    /* renamed from: c */
    public final Activity f79127c;

    /* renamed from: d */
    public CalendarEvent f79128d;

    /* renamed from: f */
    private final CallbackManager f79129f = new CallbackManager();

    /* renamed from: g */
    private RequestLoadingDialog f79130g;

    /* renamed from: h */
    private boolean f79131h;

    /* renamed from: i */
    private CalendarEventInstance f79132i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0003H&J\u0017\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/process/VideoMeetingHandleProcess$IVideoProcessListener;", "", "setVideoDueTime", "", "dueTime", "", "(Ljava/lang/Long;)V", "setVideoDueTimeClientRequestStartTime", "setVideoDueTimeServerRequestTime", "time", "setVideoLiving", "living", "", "setVideoPstnInfo", "pstnInfo", "Lcom/ss/android/lark/calendar/api/entity/CalendarPstnDetailInfo;", "setVideoVisibility", "videoVisibility", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/VideoMeetingVisibility;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.c$b */
    public interface IVideoProcessListener {
        /* renamed from: a */
        void mo113480a();

        /* renamed from: a */
        void mo113481a(CalendarPstnDetailInfo aVar);

        /* renamed from: a */
        void mo113482a(VideoMeetingVisibility videoMeetingVisibility);

        /* renamed from: a */
        void mo113483a(Long l);

        /* renamed from: a */
        void mo113484a(boolean z);

        /* renamed from: b */
        void mo113485b(Long l);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/process/VideoMeetingHandleProcess$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo113465a() {
        if (this.f79131h) {
            mo113474d();
        }
    }

    /* renamed from: b */
    public final void mo113471b() {
        this.f79129f.cancelCallbacks();
    }

    /* renamed from: e */
    public final void mo113475e() {
        LKUIToast.show(this.f79127c, (int) R.string.Calendar_VideoMeeting_VCLinkExpired);
    }

    /* renamed from: m */
    private final void m116965m() {
        RequestLoadingDialog requestLoadingDialog = new RequestLoadingDialog(this.f79127c);
        this.f79130g = requestLoadingDialog;
        if (requestLoadingDialog != null) {
            requestLoadingDialog.mo112585a(R.string.Calendar_Toast_Entering);
        }
    }

    /* renamed from: h */
    public final boolean mo113478h() {
        Boolean bool;
        DoVideoMeeting videoMeeting = this.f79128d.getVideoMeeting();
        if (videoMeeting != null) {
            bool = videoMeeting.isExpired();
        } else {
            bool = null;
        }
        return Intrinsics.areEqual((Object) bool, (Object) true);
    }

    /* renamed from: i */
    public final boolean mo113479i() {
        String str;
        DoVideoMeeting videoMeeting = this.f79128d.getVideoMeeting();
        if (videoMeeting != null) {
            str = videoMeeting.getId();
        } else {
            str = null;
        }
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: j */
    private final void m116962j() {
        UIGetDataCallback wrapAndAddGetDataCallback = this.f79129f.wrapAndAddGetDataCallback(new C31250e(this));
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        String calendarId = this.f79128d.getCalendarId();
        Intrinsics.checkExpressionValueIsNotNull(calendarId, "event.calendarId");
        String key = this.f79128d.getKey();
        Intrinsics.checkExpressionValueIsNotNull(key, "event.key");
        long originalTime = this.f79128d.getOriginalTime();
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
        aVar.mo118936a(calendarId, key, originalTime, wrapAndAddGetDataCallback);
    }

    /* renamed from: k */
    private final void m116963k() {
        String str;
        String l = m116964l();
        DoVideoMeeting videoMeeting = this.f79128d.getVideoMeeting();
        if (videoMeeting != null) {
            str = videoMeeting.getGooglePhoneNumber();
        } else {
            str = null;
        }
        CalendarPstnDetailInfo aVar = new CalendarPstnDetailInfo(true, l, str, null);
        IVideoProcessListener bVar = this.f79126b;
        if (bVar != null) {
            bVar.mo113481a(aVar);
        }
        IVideoProcessListener bVar2 = this.f79126b;
        if (bVar2 != null) {
            bVar2.mo113484a(false);
        }
    }

    /* renamed from: g */
    public final boolean mo113477g() {
        String str;
        DoVideoMeeting videoMeeting = this.f79128d.getVideoMeeting();
        Boolean bool = null;
        if (videoMeeting != null) {
            str = videoMeeting.getId();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            DoVideoMeeting videoMeeting2 = this.f79128d.getVideoMeeting();
            if (videoMeeting2 != null) {
                bool = videoMeeting2.isExpired();
            }
            if ((!Intrinsics.areEqual((Object) bool, (Object) true)) || this.f79125a) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final VideoMeetingVisibility mo113473c() {
        String str;
        DoVideoMeeting videoMeeting = this.f79128d.getVideoMeeting();
        Boolean bool = null;
        if (videoMeeting != null) {
            str = videoMeeting.getId();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            DoVideoMeeting videoMeeting2 = this.f79128d.getVideoMeeting();
            if (videoMeeting2 != null) {
                bool = videoMeeting2.isExpired();
            }
            if (!Intrinsics.areEqual((Object) bool, (Object) true) || this.f79125a) {
                return VideoMeetingVisibility.VISIBLE;
            }
            return VideoMeetingVisibility.DISABLE;
        } else if (this.f79125a) {
            return VideoMeetingVisibility.VISIBLE;
        } else {
            return VideoMeetingVisibility.DISABLE;
        }
    }

    /* renamed from: f */
    public final void mo113476f() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("VideoMeetingHandleProcess", C32673y.m125376b(valueOf, "getAssociatedLiveStatusWithEventId", new String[0]));
        C31249d dVar = new C31249d(this, valueOf, "getAssociatedLiveStatusWithEventId");
        String str = this.f79128d.getKey() + "_" + this.f79128d.getOriginalTime();
        Intrinsics.checkExpressionValueIsNotNull(str, "StringBuilder().append(e…)\n            .toString()");
        IVideoProcessListener bVar = this.f79126b;
        if (bVar != null) {
            bVar.mo113480a();
        }
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        UIGetDataCallback wrapAndAddGetDataCallback = this.f79129f.wrapAndAddGetDataCallback(dVar);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callback)");
        aVar.mo118965e(str, wrapAndAddGetDataCallback);
    }

    /* renamed from: d */
    public final void mo113474d() {
        String str;
        VideoType videoType;
        this.f79131h = true;
        DoVideoMeeting videoMeeting = this.f79128d.getVideoMeeting();
        String str2 = null;
        if (videoMeeting != null) {
            str = videoMeeting.getId();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            DoVideoMeeting videoMeeting2 = this.f79128d.getVideoMeeting();
            if (videoMeeting2 != null) {
                videoType = videoMeeting2.getMeetingType();
            } else {
                videoType = null;
            }
            if (videoType == VideoType.VCHAT) {
                String valueOf = String.valueOf(new Date().getTime());
                Log.m165389i("VideoMeetingHandleProcess", C32673y.m125376b(valueOf, "getVideoMeetingStatus", new String[0]));
                UIGetDataCallback wrapAndAddGetDataCallback = this.f79129f.wrapAndAddGetDataCallback(new C31251f(this, valueOf, "getVideoMeetingStatus"));
                DoVideoMeeting videoMeeting3 = this.f79128d.getVideoMeeting();
                if (videoMeeting3 != null) {
                    str2 = videoMeeting3.getId();
                }
                if (str2 != null) {
                    IVideoProcessListener bVar = this.f79126b;
                    if (bVar != null) {
                        bVar.mo113480a();
                    }
                    String str3 = str2;
                    if (!TextUtils.isEmpty(str3) && TextUtils.isDigitsOnly(str3)) {
                        long parseLong = Long.parseLong(str2);
                        CalendarEvent.Source source = this.f79128d.getSource();
                        Intrinsics.checkExpressionValueIsNotNull(source, "event.source");
                        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
                        CalendarServerService.m124812a(parseLong, source, wrapAndAddGetDataCallback);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        Log.m165389i("VideoMeetingHandleProcess", C32673y.m125377c("id is null or is not vchat"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0138  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m116964l() {
        /*
        // Method dump skipped, instructions count: 362
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.detail.process.VideoMeetingHandleProcess.m116964l():java.lang.String");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/process/VideoMeetingHandleProcess$checkVCUrlContainerVisibility$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "canRenewNumber", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.c$e */
    public static final class C31250e implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ VideoMeetingHandleProcess f79140a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31250e(VideoMeetingHandleProcess cVar) {
            this.f79140a = cVar;
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            this.f79140a.f79125a = Intrinsics.areEqual((Object) bool, (Object) true);
            IVideoProcessListener bVar = this.f79140a.f79126b;
            if (bVar != null) {
                bVar.mo113482a(this.f79140a.mo113473c());
            }
            if (this.f79140a.mo113477g()) {
                this.f79140a.mo113474d();
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f79140a.f79125a = false;
            IVideoProcessListener bVar = this.f79140a.f79126b;
            if (bVar != null) {
                bVar.mo113482a(this.f79140a.mo113473c());
            }
            if (this.f79140a.mo113477g()) {
                this.f79140a.mo113474d();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/process/VideoMeetingHandleProcess$checkAndEnterVideoMeeting$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "canRenewVideoMeetingNumber", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.c$c */
    public static final class C31248c implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ VideoMeetingHandleProcess f79133a;

        /* renamed from: b */
        final /* synthetic */ String f79134b;

        /* renamed from: c */
        final /* synthetic */ long f79135c;

        /* renamed from: d */
        final /* synthetic */ long f79136d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f79133a.mo113475e();
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            if ((this.f79133a.mo113478h() || !this.f79133a.mo113479i()) && Intrinsics.areEqual((Object) bool, (Object) false)) {
                this.f79133a.mo113475e();
            } else {
                this.f79133a.mo113472b(this.f79134b, this.f79135c, this.f79136d);
            }
        }

        C31248c(VideoMeetingHandleProcess cVar, String str, long j, long j2) {
            this.f79133a = cVar;
            this.f79134b = str;
            this.f79135c = j;
            this.f79136d = j2;
        }
    }

    /* renamed from: a */
    public final void mo113466a(IVideoProcessListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "videoListener");
        this.f79126b = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/process/VideoMeetingHandleProcess$checkHostLiveStatus$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/videoconference/v1/AssociatedLiveStatus;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "associatedLiveStatus", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.c$d */
    public static final class C31249d implements IGetDataCallback<AssociatedLiveStatus> {

        /* renamed from: a */
        final /* synthetic */ VideoMeetingHandleProcess f79137a;

        /* renamed from: b */
        final /* synthetic */ String f79138b;

        /* renamed from: c */
        final /* synthetic */ String f79139c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("VideoMeetingHandleProcess", C32673y.m125370a(this.f79138b, this.f79139c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(AssociatedLiveStatus associatedLiveStatus) {
            boolean z;
            Long l;
            LiveStatus liveStatus;
            IVideoProcessListener bVar;
            Long l2;
            LiveStatus liveStatus2;
            String str = this.f79138b;
            String str2 = this.f79139c;
            String[] strArr = new String[2];
            boolean z2 = false;
            strArr[0] = "isLive";
            if (associatedLiveStatus == null || (liveStatus2 = associatedLiveStatus.live_status) == null || liveStatus2.getValue() != com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.LiveStatus.LIVING.getNumber()) {
                z = false;
            } else {
                z = true;
            }
            strArr[1] = String.valueOf(z);
            Log.m165389i("VideoMeetingHandleProcess", C32673y.m125373a(str, str2, strArr));
            IVideoProcessListener bVar2 = this.f79137a.f79126b;
            Long l3 = null;
            if (bVar2 != null) {
                if (associatedLiveStatus != null) {
                    l2 = associatedLiveStatus.live_duration;
                } else {
                    l2 = null;
                }
                bVar2.mo113483a(l2);
            }
            if (associatedLiveStatus != null) {
                l = associatedLiveStatus.req_begin_time;
            } else {
                l = null;
            }
            if (associatedLiveStatus != null) {
                l3 = associatedLiveStatus.req_end_time;
            }
            if (!(l == null || l3 == null || (bVar = this.f79137a.f79126b) == null)) {
                bVar.mo113485b(Long.valueOf(l3.longValue() - l.longValue()));
            }
            IVideoProcessListener bVar3 = this.f79137a.f79126b;
            if (bVar3 != null) {
                if (!(associatedLiveStatus == null || (liveStatus = associatedLiveStatus.live_status) == null || liveStatus.getValue() != com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.LiveStatus.LIVING.getNumber())) {
                    z2 = true;
                }
                bVar3.mo113484a(z2);
            }
        }

        C31249d(VideoMeetingHandleProcess cVar, String str, String str2) {
            this.f79137a = cVar;
            this.f79138b = str;
            this.f79139c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/process/VideoMeetingHandleProcess$checkVideoMeetingStatus$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/videochat/CalendarVideoChatStatus;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "videoChatStatus", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.c$f */
    public static final class C31251f implements IGetDataCallback<CalendarVideoChatStatus> {

        /* renamed from: a */
        final /* synthetic */ VideoMeetingHandleProcess f79141a;

        /* renamed from: b */
        final /* synthetic */ String f79142b;

        /* renamed from: c */
        final /* synthetic */ String f79143c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            Log.m165383e("VideoMeetingHandleProcess", C32673y.m125370a(this.f79142b, this.f79143c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(CalendarVideoChatStatus calendarVideoChatStatus) {
            CalendarVideoChatStatus.Status status;
            Long l;
            Long l2;
            String str;
            Long l3;
            IVideoProcessListener bVar;
            Long l4;
            boolean z = false;
            Log.m165389i("VideoMeetingHandleProcess", C32673y.m125373a(this.f79142b, this.f79143c, new String[0]));
            Long l5 = null;
            if (calendarVideoChatStatus != null) {
                status = calendarVideoChatStatus.mstatus;
            } else {
                status = null;
            }
            if (status == CalendarVideoChatStatus.Status.STATUS_LIVE) {
                z = true;
            }
            if (calendarVideoChatStatus != null) {
                l = calendarVideoChatStatus.mrequest_begin_time;
            } else {
                l = null;
            }
            if (calendarVideoChatStatus != null) {
                l2 = calendarVideoChatStatus.mrequest_end_time;
            } else {
                l2 = null;
            }
            IVideoProcessListener bVar2 = this.f79141a.f79126b;
            if (bVar2 != null) {
                if (calendarVideoChatStatus != null) {
                    l4 = calendarVideoChatStatus.mmeeting_duration;
                } else {
                    l4 = null;
                }
                bVar2.mo113483a(l4);
            }
            if (!(l2 == null || l == null || (bVar = this.f79141a.f79126b) == null)) {
                bVar.mo113485b(Long.valueOf(l2.longValue() - l.longValue()));
            }
            if (this.f79141a.f79128d.getSource() == CalendarEvent.Source.PEOPLE) {
                if (calendarVideoChatStatus != null) {
                    l3 = calendarVideoChatStatus.mtenant_id;
                } else {
                    l3 = null;
                }
                str = String.valueOf(l3);
            } else {
                CalendarEventAttendee organizer = this.f79141a.f79128d.getOrganizer();
                if (organizer == null || (str = organizer.getTenantId()) == null) {
                    CalendarEventAttendee creator = this.f79141a.f79128d.getCreator();
                    if (creator != null) {
                        str = creator.getTenantId();
                    } else {
                        str = null;
                    }
                }
            }
            if (str == null) {
                if (calendarVideoChatStatus != null) {
                    l5 = calendarVideoChatStatus.mtenant_id;
                }
                str = String.valueOf(l5);
            }
            this.f79141a.mo113469a(str, z);
        }

        C31251f(VideoMeetingHandleProcess cVar, String str, String str2) {
            this.f79141a = cVar;
            this.f79142b = str;
            this.f79143c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/process/VideoMeetingHandleProcess$enterVideoMeeting$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "doVideoMeeting", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.c$g */
    public static final class C31252g implements IGetDataCallback<DoVideoMeeting> {

        /* renamed from: a */
        final /* synthetic */ VideoMeetingHandleProcess f79144a;

        /* renamed from: b */
        final /* synthetic */ String f79145b;

        /* renamed from: c */
        final /* synthetic */ long f79146c;

        /* renamed from: d */
        final /* synthetic */ long f79147d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            AppreciableHitPoint.f83321a.mo118686e(errorResult);
            this.f79144a.mo113470a(false);
        }

        /* renamed from: a */
        public void onSuccess(DoVideoMeeting doVideoMeeting) {
            if (doVideoMeeting == null || doVideoMeeting.isExpired().booleanValue()) {
                this.f79144a.mo113470a(false);
                AppreciableHitPoint.f83321a.mo118686e(null);
                return;
            }
            this.f79144a.mo113470a(true);
            AppreciableHitPoint.f83321a.mo118708x();
            if (this.f79144a.f79128d.getSource() != CalendarEvent.Source.PEOPLE) {
                C30022a.f74882a.vchatDependency().mo108200a(this.f79144a.f79127c, doVideoMeeting.getId(), this.f79145b);
            } else {
                C30022a.f74882a.vchatDependency().mo108199a(this.f79144a.f79127c, doVideoMeeting.getId());
            }
            long j = (long) 1000;
            CalendarHitPoint.m124119a((System.currentTimeMillis() / j) - this.f79146c, this.f79147d - (System.currentTimeMillis() / j));
        }

        C31252g(VideoMeetingHandleProcess cVar, String str, long j, long j2) {
            this.f79144a = cVar;
            this.f79145b = str;
            this.f79146c = j;
            this.f79147d = j2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/process/VideoMeetingHandleProcess$setVideoMeetingPstnInfo$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/api/entity/CalendarPstnDetailInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.c$h */
    public static final class C31253h implements IGetDataCallback<CalendarPstnDetailInfo> {

        /* renamed from: a */
        final /* synthetic */ VideoMeetingHandleProcess f79148a;

        /* renamed from: b */
        final /* synthetic */ boolean f79149b;

        /* renamed from: a */
        public void onSuccess(CalendarPstnDetailInfo aVar) {
            IVideoProcessListener bVar;
            if (!(aVar == null || (bVar = this.f79148a.f79126b) == null)) {
                bVar.mo113481a(aVar);
            }
            IVideoProcessListener bVar2 = this.f79148a.f79126b;
            if (bVar2 != null) {
                bVar2.mo113484a(this.f79149b);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("VideoMeetingHandleProcess", C32673y.m125377c("id is null or is not pstninfo"));
            IVideoProcessListener bVar = this.f79148a.f79126b;
            if (bVar != null) {
                bVar.mo113484a(this.f79149b);
            }
        }

        C31253h(VideoMeetingHandleProcess cVar, boolean z) {
            this.f79148a = cVar;
            this.f79149b = z;
        }
    }

    /* renamed from: a */
    public final void mo113470a(boolean z) {
        if (z) {
            RequestLoadingDialog requestLoadingDialog = this.f79130g;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.dismiss();
            }
        } else {
            RequestLoadingDialog requestLoadingDialog2 = this.f79130g;
            if (requestLoadingDialog2 != null) {
                requestLoadingDialog2.mo112592c(R.string.Calendar_Toast_Retry);
            }
        }
        this.f79130g = null;
    }

    /* renamed from: a */
    private final void m116961a(VideoType videoType) {
        VideoType a = VideoType.Companion.mo114049a(videoType.getNumber());
        if (!C30022a.f74883b.mo112704l() && videoType == VideoType.LARK_LIVE_HOST) {
            a = VideoType.UNKNOWN_VIDEO_MEETING_TYPE;
        }
        switch (C31254d.f79150a[a.ordinal()]) {
            case 1:
                IVideoProcessListener bVar = this.f79126b;
                if (bVar != null) {
                    bVar.mo113482a(VideoMeetingVisibility.VISIBLE);
                }
                IVideoProcessListener bVar2 = this.f79126b;
                if (bVar2 != null) {
                    bVar2.mo113484a(false);
                }
                m116963k();
                return;
            case 2:
            case 3:
                IVideoProcessListener bVar3 = this.f79126b;
                if (bVar3 != null) {
                    bVar3.mo113482a(VideoMeetingVisibility.VISIBLE);
                }
                IVideoProcessListener bVar4 = this.f79126b;
                if (bVar4 != null) {
                    bVar4.mo113484a(false);
                    return;
                }
                return;
            case 4:
                IVideoProcessListener bVar5 = this.f79126b;
                if (bVar5 != null) {
                    bVar5.mo113482a(VideoMeetingVisibility.INVISIBLE);
                    return;
                }
                return;
            case 5:
                m116962j();
                return;
            case 6:
                IVideoProcessListener bVar6 = this.f79126b;
                if (bVar6 != null) {
                    bVar6.mo113482a(VideoMeetingVisibility.VISIBLE);
                }
                mo113476f();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo113467a(CalendarEvent calendarEvent) {
        boolean z;
        VideoType videoType;
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        this.f79128d = calendarEvent;
        if (!C30022a.f74885d.mo112719a() || !calendarEvent.getCalendarEventDisplayInfo().isVideoMeetingBtnShow() || !SchemaHelper.f83746a.mo120313a("MeetingVideo", calendarEvent.getCalendarSchemaCollection()) || !C30022a.f74886e.mo112721a()) {
            IVideoProcessListener bVar = this.f79126b;
            if (bVar != null) {
                bVar.mo113482a(VideoMeetingVisibility.INVISIBLE);
                return;
            }
            return;
        }
        DoVideoMeeting videoMeeting = calendarEvent.getVideoMeeting();
        if (videoMeeting == null || (videoMeeting.getMeetingType() == VideoType.UNKNOWN_VIDEO_MEETING_TYPE && TextUtils.isEmpty(videoMeeting.getId()) && TextUtils.isEmpty(videoMeeting.getMeetingUrl()))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            videoType = VideoType.VCHAT;
        } else if (videoMeeting == null || (videoType = videoMeeting.getMeetingType()) == null) {
            videoType = VideoType.VCHAT;
        }
        m116961a(videoType);
    }

    /* renamed from: a */
    public final void mo113469a(String str, boolean z) {
        String str2;
        String str3;
        String str4;
        DoVideoMeeting videoMeeting = this.f79128d.getVideoMeeting();
        AbstractC30040ai vchatDependency = C30022a.f74882a.vchatDependency();
        if (videoMeeting != null) {
            str2 = videoMeeting.getId();
        } else {
            str2 = null;
        }
        AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
        String a = loginDependency.mo108269a();
        String summary = this.f79128d.getSummary();
        if (videoMeeting != null) {
            str3 = videoMeeting.getMeetingUrl();
        } else {
            str3 = null;
        }
        CalendarEvent.Source source = this.f79128d.getSource();
        CalendarEventInstance calendarEventInstance = this.f79132i;
        if (calendarEventInstance == null || (str4 = C32646c.m125261a(calendarEventInstance)) == null) {
            str4 = "";
        }
        vchatDependency.mo108202a(str2, a, summary, "", str3, str, source, str4, new C31253h(this, z));
    }

    public VideoMeetingHandleProcess(Activity activity, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        this.f79127c = activity;
        this.f79128d = calendarEvent;
        this.f79132i = calendarEventInstance;
    }

    /* renamed from: b */
    public final void mo113472b(String str, long j, long j2) {
        m116965m();
        AppreciableHitPoint.f83321a.mo118707w();
        UIGetDataCallback wrapAndAddGetDataCallback = this.f79129f.wrapAndAddGetDataCallback(new C31252g(this, str, j, j2));
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        String calendarId = this.f79128d.getCalendarId();
        Intrinsics.checkExpressionValueIsNotNull(calendarId, "event.calendarId");
        String key = this.f79128d.getKey();
        Intrinsics.checkExpressionValueIsNotNull(key, "event.key");
        long originalTime = this.f79128d.getOriginalTime();
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiGetDataCallback");
        aVar.mo118938a(calendarId, key, originalTime, true, (IGetDataCallback<DoVideoMeeting>) wrapAndAddGetDataCallback);
    }

    /* renamed from: a */
    public final void mo113468a(String str, long j, long j2) {
        Intrinsics.checkParameterIsNotNull(str, "summary");
        UIGetDataCallback wrapAndAddGetDataCallback = this.f79129f.wrapAndAddGetDataCallback(new C31248c(this, str, j, j2));
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        String calendarId = this.f79128d.getCalendarId();
        Intrinsics.checkExpressionValueIsNotNull(calendarId, "event.calendarId");
        String key = this.f79128d.getKey();
        Intrinsics.checkExpressionValueIsNotNull(key, "event.key");
        long originalTime = this.f79128d.getOriginalTime();
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
        aVar.mo118936a(calendarId, key, originalTime, wrapAndAddGetDataCallback);
    }
}
