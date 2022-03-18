package com.ss.android.lark.calendar.impl.rustadapter.push;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.calendar.v1.ChangedEventCollections;
import com.bytedance.lark.pb.calendar.v1.MeetingEventRef;
import com.bytedance.lark.pb.calendar.v1.PushCalendarBindGoogleNotification;
import com.bytedance.lark.pb.calendar.v1.PushCalendarEventChangedNotification;
import com.bytedance.lark.pb.calendar.v1.PushCalendarEventReminderResponse;
import com.bytedance.lark.pb.calendar.v1.PushCalendarEventSyncNotification;
import com.bytedance.lark.pb.calendar.v1.PushCalendarEventVideoMeetingChange;
import com.bytedance.lark.pb.calendar.v1.PushEventShareToChatNotification;
import com.bytedance.lark.pb.calendar.v1.PushExternalSyncNotification;
import com.bytedance.lark.pb.calendar.v1.PushMeetingMinuteEditors;
import com.bytedance.lark.pb.calendar.v1.PushMeetingNotification;
import com.bytedance.lark.pb.calendar.v1.PushReminderClosedNotification;
import com.bytedance.lark.pb.calendar.v1.PushRoomViewInstanceChangeNotification;
import com.bytedance.lark.pb.calendar.v1.PushScrollClosedNotification;
import com.bytedance.lark.pb.calendar.v1.ScrollType;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedIdType;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedVideoChatStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.LiveStatus;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.C32607n;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.C32608o;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.C32609u;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CreateEventShareToChatData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoEventVideoMeetingInfo;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVCMeetingAbbrInfo;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.EventChangeCollection;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OverallReminderData;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.videoconference.v1.AssociatedLiveStatus;
import com.ss.android.lark.pb.videoconference.v1.GetAssociatedVideoChatStatusResponse;
import com.ss.android.lark.pb.videoconference.v1.IDType;
import com.ss.android.lark.pb.videoconference.v1.VCMeetingAbbrInfo;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001!B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0018\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushProcess;", "", "()V", "command2PushListenerMap", "", "Lcom/bytedance/lark/pb/basic/v1/Command;", "Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushProcess$CalendarPushHandler;", "parsePush", "Lcom/alibaba/fastjson/JSONObject;", "cmd", "request", "", "pushAssociatedLiveStatusNotification", "payload", "pushAssociatedVCStatusNotification", "pushCalendarBindExchangeNotification", "pushCalendarBindGoogleNotification", "pushCalendarEventChanged", "pushCalendarEventReminder", "pushCalendarEventSync", "pushCalendarMeetingNotification", "pushCalendarReminderClosedNotification", "pushCreateEventShareToChatNotification", "pushMeetingMinuteEditorNotification", "pushRoomViewInstanceChangeNotification", "pushScrollClosedNotification", "pushVideoMeetingChangeNotification", "registerPushServiceListener", "", "command", "listener", "Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushHandleCallBack;", "unRegisterPushServiceListener", "CalendarPushHandler", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.b.b */
public final class CalendarPushProcess {

    /* renamed from: a */
    public static final CalendarPushProcess f83425a = new CalendarPushProcess();

    /* renamed from: b */
    private static Map<Command, CalendarPushHandler> f83426b = new HashMap();

    private CalendarPushProcess() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\b\u0010\f\u001a\u00020\nH\u0002J(\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushProcess$CalendarPushHandler;", "Lcom/ss/android/lark/sdk/PushDispatcher$ISdkPushListener;", "cmd", "Lcom/bytedance/lark/pb/basic/v1/Command;", "(Lcom/bytedance/lark/pb/basic/v1/Command;)V", "listeners", "", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushHandleCallBack;", "addListener", "", "listener", "checkListeners", "onPush", "request", "", "sid", "", "fromServerPipe", "", "offlinePush", "removeListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.b.b$a */
    public static final class CalendarPushHandler implements C53248k.AbstractC53250a {

        /* renamed from: a */
        public List<WeakReference<AbstractC32524a>> f83427a = new ArrayList();

        /* renamed from: b */
        private final Command f83428b;

        /* renamed from: a */
        private final void m124601a() {
            if (this.f83427a.size() == 0) {
                C53248k.m205912a().mo181696a(this.f83428b);
                CalendarPushProcess bVar = CalendarPushProcess.f83425a;
                CalendarPushProcess.f83426b.remove(this.f83428b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.b.b$a$a */
        static final class RunnableC32525a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ CalendarPushHandler f83429a;

            /* renamed from: b */
            final /* synthetic */ JSONObject f83430b;

            RunnableC32525a(CalendarPushHandler aVar, JSONObject jSONObject) {
                this.f83429a = aVar;
                this.f83430b = jSONObject;
            }

            public final void run() {
                for (WeakReference<AbstractC32524a> weakReference : this.f83429a.f83427a) {
                    AbstractC32524a aVar = weakReference.get();
                    if (aVar != null) {
                        aVar.onPush(this.f83430b);
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo118828a(AbstractC32524a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "listener");
            this.f83427a.add(new WeakReference<>(aVar));
        }

        public CalendarPushHandler(Command command) {
            Intrinsics.checkParameterIsNotNull(command, "cmd");
            this.f83428b = command;
        }

        /* renamed from: b */
        public final void mo118829b(AbstractC32524a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "listener");
            ArrayList arrayList = new ArrayList();
            for (T t : this.f83427a) {
                T t2 = t;
                boolean z = true;
                if (t2.get() == null || !(!Intrinsics.areEqual((AbstractC32524a) t2.get(), aVar))) {
                    z = false;
                }
                if (z) {
                    arrayList.add(t);
                }
            }
            this.f83427a = CollectionsKt.toMutableList((Collection) arrayList);
            m124601a();
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(bArr, "request");
            Intrinsics.checkParameterIsNotNull(str, "sid");
            JSONObject a = CalendarPushProcess.f83425a.mo118825a(this.f83428b, bArr);
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new RunnableC32525a(this, a));
        }
    }

    /* renamed from: c */
    private final JSONObject m124586c(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put((Object) "calendar_event_sync", (Object) PushCalendarEventSyncNotification.ADAPTER.decode(bArr).calendar_ids);
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
        return jSONObject;
    }

    /* renamed from: d */
    private final JSONObject m124587d(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            PushCalendarBindGoogleNotification decode = PushCalendarBindGoogleNotification.ADAPTER.decode(bArr);
            Boolean bool = decode.is_bound;
            String str = decode.external_account_email;
            jSONObject.put((Object) "bound", (Object) bool);
            jSONObject.put((Object) "account", (Object) str);
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
        return jSONObject;
    }

    /* renamed from: e */
    private final JSONObject m124588e(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = PushExternalSyncNotification.ADAPTER.decode(bArr).external_account_email;
            jSONObject.put((Object) "bound", (Object) true);
            jSONObject.put((Object) "account", (Object) str);
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
        return jSONObject;
    }

    /* renamed from: g */
    private final JSONObject m124590g(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            PushMeetingMinuteEditors decode = PushMeetingMinuteEditors.ADAPTER.decode(bArr);
            C32608o oVar = new C32608o();
            oVar.mo120140b(decode.chat_id);
            oVar.mo120137a(decode.expire_time);
            oVar.mo120138a(decode.meeting_minute_url);
            jSONObject.put((Object) "calendar_meeting_editing", (Object) oVar);
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
        return jSONObject;
    }

    /* renamed from: h */
    private final JSONObject m124591h(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            PushScrollClosedNotification decode = PushScrollClosedNotification.ADAPTER.decode(bArr);
            ScrollType scrollType = decode.scroll_type;
            Intrinsics.checkExpressionValueIsNotNull(scrollType, "response.scroll_type");
            jSONObject.put((Object) "calendar_scroll_type", (Object) com.ss.android.lark.calendar.impl.rustadapter.doentity.ScrollType.forNumber(scrollType.getValue()));
            jSONObject.put((Object) "calendar_chat_id", (Object) decode.chat_id);
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
        return jSONObject;
    }

    /* renamed from: m */
    private final JSONObject m124596m(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put((Object) "changed_resource", (Object) PushRoomViewInstanceChangeNotification.ADAPTER.decode(bArr));
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
        return jSONObject;
    }

    /* renamed from: n */
    private final JSONObject m124597n(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            ChangedEventCollections changedEventCollections = PushCalendarEventChangedNotification.ADAPTER.decode(bArr).changed_event_collections;
            Intrinsics.checkExpressionValueIsNotNull(changedEventCollections, "response.changed_event_collections");
            jSONObject.put((Object) "calendar_event_change_collections", (Object) new EventChangeCollection(changedEventCollections));
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    private final JSONObject m124585b(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            PushReminderClosedNotification decode = PushReminderClosedNotification.ADAPTER.decode(bArr);
            C32609u uVar = new C32609u();
            Long l = decode.start_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "response.start_time");
            uVar.mo120226b(l.longValue());
            uVar.mo120223a(decode.calendar_id);
            uVar.mo120227b(decode.key);
            Long l2 = decode.original_time;
            Intrinsics.checkExpressionValueIsNotNull(l2, "response.original_time");
            uVar.mo120222a(l2.longValue());
            Integer num = decode.minutes;
            Intrinsics.checkExpressionValueIsNotNull(num, "response.minutes");
            uVar.mo120221a(num.intValue());
            jSONObject.put((Object) "calendar_reminder_close", (Object) uVar);
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
        return jSONObject;
    }

    /* renamed from: f */
    private final JSONObject m124589f(byte[] bArr) {
        List<MeetingEventRef> list;
        JSONObject jSONObject = new JSONObject();
        try {
            PushMeetingNotification decode = PushMeetingNotification.ADAPTER.decode(bArr);
            ArrayList arrayList = new ArrayList();
            if (!(decode == null || (list = decode.meeting_event_refs) == null)) {
                for (MeetingEventRef meetingEventRef : list) {
                    if (meetingEventRef != null) {
                        C32607n nVar = new C32607n();
                        nVar.mo120133a(meetingEventRef.key);
                        nVar.mo120135b(meetingEventRef.meeting_id);
                        Long l = meetingEventRef.original_time;
                        Intrinsics.checkExpressionValueIsNotNull(l, "meeting.original_time");
                        nVar.mo120132a(l.longValue());
                        arrayList.add(nVar);
                    }
                }
            }
            jSONObject.put((Object) "calendar_meeting_event_ref", (Object) arrayList);
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
        return jSONObject;
    }

    /* renamed from: i */
    private final JSONObject m124592i(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            PushEventShareToChatNotification decode = PushEventShareToChatNotification.ADAPTER.decode(bArr);
            String str = decode.calendar_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "response.calendar_id");
            String str2 = decode.key;
            Intrinsics.checkExpressionValueIsNotNull(str2, "response.key");
            Long l = decode.original_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "response.original_time");
            long longValue = l.longValue();
            String str3 = decode.share_to_chat_id;
            Intrinsics.checkExpressionValueIsNotNull(str3, "response.share_to_chat_id");
            Boolean bool = decode.is_success;
            Intrinsics.checkExpressionValueIsNotNull(bool, "response.is_success");
            jSONObject.put((Object) "calendar_create_event_share_to_chat", (Object) new CreateEventShareToChatData(str, str2, longValue, str3, bool.booleanValue(), decode.failed_chat_name));
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
        return jSONObject;
    }

    /* renamed from: j */
    private final JSONObject m124593j(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            PushCalendarEventVideoMeetingChange decode = PushCalendarEventVideoMeetingChange.ADAPTER.decode(bArr);
            if (decode != null) {
                if (!CollectionUtils.isEmpty(decode.event_video_meeting_info)) {
                    List<PushCalendarEventVideoMeetingChange.EventVideoMeetingInfo> list = decode.event_video_meeting_info;
                    ArrayList arrayList = new ArrayList();
                    for (PushCalendarEventVideoMeetingChange.EventVideoMeetingInfo eventVideoMeetingInfo : list) {
                        if (eventVideoMeetingInfo == null) {
                            Intrinsics.throwNpe();
                        }
                        arrayList.add(new DoEventVideoMeetingInfo(eventVideoMeetingInfo));
                    }
                    jSONObject.put((Object) "calendar_event_video_meeting", (Object) arrayList);
                    return jSONObject;
                }
            }
            return jSONObject;
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* renamed from: k */
    private final JSONObject m124594k(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            GetAssociatedVideoChatStatusResponse decode = GetAssociatedVideoChatStatusResponse.ADAPTER.decode(bArr);
            VCMeetingAbbrInfo vCMeetingAbbrInfo = decode.meeting_info;
            if (vCMeetingAbbrInfo == null) {
                return jSONObject;
            }
            String str = decode.id;
            Intrinsics.checkExpressionValueIsNotNull(str, "response.id");
            AssociatedIdType.Companion aVar = AssociatedIdType.Companion;
            IDType iDType = decode.id_type;
            Intrinsics.checkExpressionValueIsNotNull(iDType, "response.id_type");
            AssociatedIdType b = aVar.mo114020b(iDType.getValue());
            Intrinsics.checkExpressionValueIsNotNull(vCMeetingAbbrInfo, "it");
            jSONObject.put((Object) "associated_video_meeting", (Object) new AssociatedVideoChatStatus(str, b, new DoVCMeetingAbbrInfo(vCMeetingAbbrInfo)));
            return jSONObject;
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* renamed from: l */
    private final JSONObject m124595l(byte[] bArr) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            AssociatedLiveStatus decode = AssociatedLiveStatus.ADAPTER.decode(bArr);
            JSONObject jSONObject2 = jSONObject;
            String str3 = decode.associated_event_id;
            if (str3 != null) {
                str = str3;
            } else {
                str = "";
            }
            String str4 = decode.live_id;
            if (str4 != null) {
                str2 = str4;
            } else {
                str2 = "";
            }
            LiveStatus.Companion aVar = LiveStatus.Companion;
            com.ss.android.lark.pb.videoconference.v1.LiveStatus liveStatus = decode.live_status;
            Intrinsics.checkExpressionValueIsNotNull(liveStatus, "response.live_status");
            LiveStatus a = aVar.mo114047a(liveStatus.getValue());
            Long l = decode.version;
            Intrinsics.checkExpressionValueIsNotNull(l, "response.version");
            jSONObject2.put((Object) "associated_live_status", (Object) new com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedLiveStatus(str, str2, a, l.longValue()));
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    private final JSONObject m124583a(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            PushCalendarEventReminderResponse decode = PushCalendarEventReminderResponse.ADAPTER.decode(bArr);
            OverallReminderData overallReminderData = new OverallReminderData();
            overallReminderData.setTitle(decode.title);
            overallReminderData.setEventId(decode.event_id);
            Long l = decode.start_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "response.start_time");
            overallReminderData.setStartTime(l.longValue());
            overallReminderData.setLocation(decode.location);
            overallReminderData.setMeetingRooms(decode.meeting_rooms);
            Long l2 = decode.end_time;
            Intrinsics.checkExpressionValueIsNotNull(l2, "response.end_time");
            overallReminderData.setEndTime(l2.longValue());
            overallReminderData.setCalendarId(decode.calendar_id);
            overallReminderData.setKey(decode.key);
            Long l3 = decode.original_time;
            Intrinsics.checkExpressionValueIsNotNull(l3, "response.original_time");
            overallReminderData.setOriginalTime(l3.longValue());
            Boolean bool = decode.is_all_day;
            Intrinsics.checkExpressionValueIsNotNull(bool, "response.is_all_day");
            overallReminderData.setIsAllDay(bool.booleanValue());
            Integer num = decode.minutes;
            Intrinsics.checkExpressionValueIsNotNull(num, "response.minutes");
            overallReminderData.setMinutes(num.intValue());
            overallReminderData.setMeetingRoomsDisabled(decode.is_meeting_rooms_disabled);
            jSONObject.put((Object) "calendar_overall_reminder", (Object) overallReminderData);
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final synchronized void mo118827b(Command command, AbstractC32524a aVar) {
        CalendarPushHandler aVar2;
        Intrinsics.checkParameterIsNotNull(command, "command");
        if (!(aVar == null || (aVar2 = f83426b.get(command)) == null)) {
            aVar2.mo118829b(aVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo118826a(Command command, AbstractC32524a aVar) {
        Intrinsics.checkParameterIsNotNull(command, "command");
        if (aVar != null) {
            CalendarPushHandler aVar2 = f83426b.get(command);
            if (aVar2 != null) {
                aVar2.mo118828a(aVar);
            } else {
                CalendarPushHandler aVar3 = new CalendarPushHandler(command);
                aVar3.mo118828a(aVar);
                f83426b.put(command, aVar3);
                C53248k.m205912a().mo181697a(command, aVar3);
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo118825a(Command command, byte[] bArr) {
        switch (C32526c.f83431a[command.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return new JSONObject();
            case 5:
                return m124583a(bArr);
            case 6:
                return m124585b(bArr);
            case 7:
                return m124586c(bArr);
            case 8:
                return m124587d(bArr);
            case 9:
                return m124588e(bArr);
            case 10:
                return m124597n(bArr);
            case 11:
                return m124589f(bArr);
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return m124590g(bArr);
            case 13:
                return m124591h(bArr);
            case 14:
                return m124592i(bArr);
            case 15:
                return m124593j(bArr);
            case 16:
                return m124594k(bArr);
            case 17:
                return m124595l(bArr);
            case 18:
                return m124596m(bArr);
            default:
                return new JSONObject();
        }
    }
}
