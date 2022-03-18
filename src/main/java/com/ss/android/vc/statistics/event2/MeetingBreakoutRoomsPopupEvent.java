package com.ss.android.vc.statistics.event2;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.statistics.p3183d.C63728b;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002JG\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011JQ\u0010\u0012\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0014J$\u0010\u0015\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0016\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006¨\u0006\u0018"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingBreakoutRoomsPopupEvent;", "", "()V", "sendAskForHelpClickEvent", "", "click", "", "option", "target", "isBreakoutRoom", "", "isLocalOpen", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ss/android/vc/entity/VideoChat;)V", "sendLeaveInTransferPageClickEvent", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "sendLeaveRoomClickEvent", "content", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ss/android/vc/entity/VideoChat;)V", "sendLeaveRoomRemindClickEvent", "sendViewEvent", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.e */
public final class MeetingBreakoutRoomsPopupEvent {

    /* renamed from: a */
    public static final Lazy f160826a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63708b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160827b = new Companion(null);

    /* renamed from: a */
    public static final MeetingBreakoutRoomsPopupEvent m249771a() {
        return f160827b.mo220267a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingBreakoutRoomsPopupEvent$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/statistics/event2/MeetingBreakoutRoomsPopupEvent;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/statistics/event2/MeetingBreakoutRoomsPopupEvent;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.e$a */
    public static final class Companion {
        /* renamed from: a */
        public final MeetingBreakoutRoomsPopupEvent mo220267a() {
            Lazy lazy = MeetingBreakoutRoomsPopupEvent.f160826a;
            Companion aVar = MeetingBreakoutRoomsPopupEvent.f160827b;
            return (MeetingBreakoutRoomsPopupEvent) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/statistics/event2/MeetingBreakoutRoomsPopupEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.e$b */
    static final class C63708b extends Lambda implements Function0<MeetingBreakoutRoomsPopupEvent> {
        public static final C63708b INSTANCE = new C63708b();

        C63708b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MeetingBreakoutRoomsPopupEvent invoke() {
            return new MeetingBreakoutRoomsPopupEvent();
        }
    }

    /* renamed from: a */
    public final void mo220262a(C61303k kVar) {
        String str;
        if (kVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("click", "leave_meeting");
                jSONObject.put("content", "join_room_transfer");
                AbsBreakoutRoomControl al = kVar.al();
                Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
                jSONObject.put("is_breakoutroom_start", String.valueOf(al.mo213181h()));
                AbsBreakoutRoomControl al2 = kVar.al();
                Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
                if (al2.mo213182i()) {
                    str = "inrooms";
                } else {
                    str = "mainroom";
                }
                jSONObject.put("user_location", str);
                C63728b.m249928a("vc_meeting_breakoutrooms_popup_click", jSONObject, kVar.mo212056e());
            } catch (JSONException unused) {
                C60700b.m235851b("MeetingBreakoutRoomsPopupEvent@", "[sendJoinRoomTransferClickEvent]", ApiHandler.API_CALLBACK_EXCEPTION);
            }
        }
    }

    /* renamed from: a */
    public final void mo220263a(C61303k kVar, String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(str, "content");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("env_id", kVar.mo212093K());
            jSONObject.put("content", str);
            AbsBreakoutRoomControl al = kVar.al();
            Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
            jSONObject.put("is_breakoutroom_start", String.valueOf(al.mo213181h()));
            AbsBreakoutRoomControl al2 = kVar.al();
            Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
            if (al2.mo213182i()) {
                str2 = "inrooms";
            } else {
                str2 = "mainroom";
            }
            jSONObject.put("user_location", str2);
            C63728b.m249928a("vc_meeting_breakoutrooms_popup_view", jSONObject, kVar.mo212056e());
        } catch (JSONException e) {
            C60700b.m235851b("MeetingBreakoutRoomsPopupEvent@", "[sendViewEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220264a(String str, String str2, C61303k kVar) {
        String str3;
        if (kVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("click", str);
                jSONObject.put("content", "leave_countdown");
                jSONObject.put("target", str2);
                AbsBreakoutRoomControl al = kVar.al();
                Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
                jSONObject.put("is_breakoutroom_start", String.valueOf(al.mo213181h()));
                AbsBreakoutRoomControl al2 = kVar.al();
                Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
                if (al2.mo213182i()) {
                    str3 = "inrooms";
                } else {
                    str3 = "mainroom";
                }
                jSONObject.put("user_location", str3);
                C63728b.m249928a("vc_meeting_breakoutrooms_popup_click", jSONObject, kVar.mo212056e());
            } catch (JSONException unused) {
                C60700b.m235851b("MeetingBreakoutRoomsPopupEvent@", "[sendLeaveRoomClickEvent]", ApiHandler.API_CALLBACK_EXCEPTION);
            }
        }
    }

    /* renamed from: a */
    public final void mo220265a(String str, String str2, String str3, Boolean bool, Boolean bool2, VideoChat videoChat) {
        String str4;
        String str5;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("click", str);
            jSONObject.put("option", str2);
            jSONObject.put("target", str3);
            jSONObject.put("content", "ask_for_help");
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                str4 = "true";
            } else {
                str4 = "false";
            }
            jSONObject.put("is_breakoutroom_start", str4);
            if (Intrinsics.areEqual((Object) bool2, (Object) true)) {
                str5 = "inrooms";
            } else {
                str5 = "mainroom";
            }
            jSONObject.put("user_location", str5);
            C63728b.m249928a("vc_meeting_breakoutrooms_popup_click", jSONObject, videoChat);
        } catch (JSONException unused) {
            C60700b.m235851b("MeetingBreakoutRoomsPopupEvent@", "[sendLeaveRoomClickEvent]", ApiHandler.API_CALLBACK_EXCEPTION);
        }
    }

    /* renamed from: a */
    public final void mo220266a(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, VideoChat videoChat) {
        boolean z;
        String str5;
        String str6;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("click", str);
            jSONObject.put("content", str2);
            jSONObject.put("target", str3);
            jSONObject.put("option", str4);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            if (z) {
                str5 = "true";
            } else {
                str5 = "false";
            }
            jSONObject.put("is_breakoutroom_start", str5);
            if (Intrinsics.areEqual((Object) bool2, (Object) true)) {
                str6 = "inrooms";
            } else {
                str6 = "mainroom";
            }
            jSONObject.put("user_location", str6);
            C63728b.m249928a("vc_meeting_breakoutrooms_popup_click", jSONObject, videoChat);
        } catch (JSONException unused) {
            C60700b.m235851b("MeetingBreakoutRoomsPopupEvent@", "[sendLeaveRoomClickEvent]", ApiHandler.API_CALLBACK_EXCEPTION);
        }
    }
}
