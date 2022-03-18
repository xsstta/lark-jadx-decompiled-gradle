package com.ss.android.vc.statistics.event2;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import com.ss.android.vc.statistics.p3183d.C63728b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.b.t */
public final class MeetingPopupEvent {

    /* renamed from: a */
    public static final Lazy f160853a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63719b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160854b = new Companion(null);

    /* renamed from: a */
    public static final MeetingPopupEvent m249838a() {
        return f160854b.mo220325a();
    }

    /* renamed from: a */
    public final void mo220318a(String str, String str2, VideoChat videoChat) {
        m249839a(this, str, str2, videoChat, null, 8, null);
    }

    /* renamed from: com.ss.android.vc.statistics.b.t$a */
    public static final class Companion {
        /* renamed from: a */
        public final MeetingPopupEvent mo220325a() {
            Lazy lazy = MeetingPopupEvent.f160853a;
            Companion aVar = MeetingPopupEvent.f160854b;
            return (MeetingPopupEvent) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo220322a(String str, String str2, boolean z, VideoChat videoChat) {
        JSONException e;
        JSONObject jSONObject = null;
        if (str2 != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("content", str2);
                    jSONObject2.put("if_self_unmute", z ? "true" : "false");
                    jSONObject = jSONObject2;
                } catch (JSONException e2) {
                    e = e2;
                    jSONObject = jSONObject2;
                    C60700b.m235851b("MeetingPopupEvent@", "[sendMuteAllClickEvent]", "exception = " + e.getMessage());
                    Unit unit = Unit.INSTANCE;
                    mo220321a(str, null, jSONObject, videoChat, null);
                }
            } catch (JSONException e3) {
                e = e3;
                C60700b.m235851b("MeetingPopupEvent@", "[sendMuteAllClickEvent]", "exception = " + e.getMessage());
                Unit unit2 = Unit.INSTANCE;
                mo220321a(str, null, jSONObject, videoChat, null);
            }
        }
        mo220321a(str, null, jSONObject, videoChat, null);
    }

    /* renamed from: com.ss.android.vc.statistics.b.t$b */
    static final class C63719b extends Lambda implements Function0<MeetingPopupEvent> {
        public static final C63719b INSTANCE = new C63719b();

        C63719b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MeetingPopupEvent invoke() {
            return new MeetingPopupEvent();
        }
    }

    /* renamed from: a */
    public final void mo220315a(C61303k kVar, String str) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(str, "content");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("content", str);
            C63728b.m249928a("vc_meeting_popup_view", jSONObject, kVar.mo212056e());
        } catch (JSONException unused) {
            C60871a.m236609a("MeetingPopupEvent@", "JSONException: eventKey = vc_meeting_popup_view," + "content = " + str);
        }
    }

    /* renamed from: a */
    public final void mo220317a(String str, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("content", str);
            C63728b.m249928a("vc_meeting_popup_view", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingPopupEvent@", "[sendViewEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo220323b(C61303k kVar, String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(str, "content");
        try {
            JSONObject jSONObject = new JSONObject();
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
            C63728b.m249928a("vc_meeting_popup_view", jSONObject, kVar.mo212056e());
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("JSONException: eventKey = vc_meeting_popup_view");
            sb.append(", content = ");
            sb.append(str);
            sb.append(", is_breakoutroom_start = ");
            AbsBreakoutRoomControl al3 = kVar.al();
            Intrinsics.checkExpressionValueIsNotNull(al3, "meeting.breakoutRoomControl");
            sb.append(al3.mo213181h());
            sb.append(", isInMainRoom = ");
            AbsBreakoutRoomControl al4 = kVar.al();
            Intrinsics.checkExpressionValueIsNotNull(al4, "meeting.breakoutRoomControl");
            sb.append(al4.mo213183j());
            C60871a.m236609a("MeetingPopupEvent@", sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo220316a(C61303k kVar, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(str, "content");
        Intrinsics.checkParameterIsNotNull(str2, "click");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", str2);
            jSONObject.put("content", str);
            C63728b.m249928a("vc_meeting_popup_click", jSONObject, kVar.mo212056e());
        } catch (JSONException unused) {
            C60871a.m236609a("MeetingPopupEvent@", "JSONException: eventKey = vc_meeting_popup_click," + "content = " + str + ", click = " + str2);
        }
    }

    /* renamed from: b */
    public final void mo220324b(String str, String str2, C61303k kVar) {
        String str3;
        if (kVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("click", str);
                jSONObject.put("content", "self_unmute");
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
                C63728b.m249928a("vc_meeting_popup_click", jSONObject, kVar.mo212056e());
            } catch (JSONException unused) {
                C60871a.m236609a("MeetingPopupEvent@", "[sendRaiseHandClickEvent] JSONException");
            }
        }
    }

    /* renamed from: a */
    public final void mo220320a(String str, String str2, C61303k kVar) {
        String str3;
        if (kVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("click", str);
                jSONObject.put("content", "waiting_room_remind");
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
                C63728b.m249928a("vc_meeting_popup_click", jSONObject, kVar.mo212056e());
            } catch (JSONException unused) {
                C60871a.m236609a("MeetingPopupEvent@", "[sendWaitingRoomRemindClickEvent] JSONException");
            }
        }
    }

    /* renamed from: a */
    public final void mo220319a(String str, String str2, VideoChat videoChat, String str3) {
        JSONException e;
        JSONObject jSONObject = null;
        if (str2 != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("content", str2);
                    jSONObject = jSONObject2;
                } catch (JSONException e2) {
                    e = e2;
                    jSONObject = jSONObject2;
                    C60700b.m235851b("MeetingPopupEvent@", "[sendDialogClickEvent]", "exception = " + e.getMessage());
                    Unit unit = Unit.INSTANCE;
                    mo220321a(str, str3, jSONObject, videoChat, null);
                }
            } catch (JSONException e3) {
                e = e3;
                C60700b.m235851b("MeetingPopupEvent@", "[sendDialogClickEvent]", "exception = " + e.getMessage());
                Unit unit2 = Unit.INSTANCE;
                mo220321a(str, str3, jSONObject, videoChat, null);
            }
        }
        mo220321a(str, str3, jSONObject, videoChat, null);
    }

    /* renamed from: a */
    public final void mo220321a(String str, String str2, JSONObject jSONObject, VideoChat videoChat, String str3) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("click", str);
            jSONObject.put("target", str2);
            jSONObject.put("env_id", str3);
            C63728b.m249928a("vc_meeting_popup_click", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingPopupEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m249839a(MeetingPopupEvent tVar, String str, String str2, VideoChat videoChat, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        tVar.mo220319a(str, str2, videoChat, str3);
    }
}
