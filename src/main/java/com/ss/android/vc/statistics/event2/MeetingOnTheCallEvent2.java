package com.ss.android.vc.statistics.event2;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.module.base.util.DataAdapterUtil;
import com.ss.android.vc.meeting.module.bottombar.function.FunctionItem;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.follow.AbstractC61751a;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.p3151p.AbstractC62612a;
import com.ss.android.vc.meeting.module.sharebox.AbstractC63022a;
import com.ss.android.vc.statistics.p3183d.C63728b;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.b.q */
public final class MeetingOnTheCallEvent2 {

    /* renamed from: a */
    public static final Lazy f160845a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63715b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160846b = new Companion(null);

    /* renamed from: a */
    public static final MeetingOnTheCallEvent2 m249823a() {
        return f160846b.mo220311a();
    }

    /* renamed from: a */
    public final void mo220302a(C61303k kVar, String str, String str2) {
        m249824a(this, kVar, str, str2, null, null, null, 56, null);
    }

    /* renamed from: b */
    public final void mo220309b(C61303k kVar, String str) {
        m249824a(this, kVar, str, null, null, null, null, 60, null);
    }

    /* renamed from: com.ss.android.vc.statistics.b.q$a */
    public static final class Companion {
        /* renamed from: a */
        public final MeetingOnTheCallEvent2 mo220311a() {
            Lazy lazy = MeetingOnTheCallEvent2.f160845a;
            Companion aVar = MeetingOnTheCallEvent2.f160846b;
            return (MeetingOnTheCallEvent2) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private MeetingOnTheCallEvent2() {
    }

    /* renamed from: a */
    public final void mo220308a(boolean z, C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("option", z ? "open" : "close");
        m249824a(this, kVar, "cam", null, linkedHashMap, null, null, 48, null);
    }

    /* renamed from: com.ss.android.vc.statistics.b.q$b */
    static final class C63715b extends Lambda implements Function0<MeetingOnTheCallEvent2> {
        public static final C63715b INSTANCE = new C63715b();

        C63715b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MeetingOnTheCallEvent2 invoke() {
            return new MeetingOnTheCallEvent2(null);
        }
    }

    /* renamed from: com.ss.android.vc.statistics.b.q$c */
    public static final class RunnableC63716c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f160847a;

        /* renamed from: b */
        final /* synthetic */ boolean f160848b;

        /* renamed from: c */
        final /* synthetic */ VideoChat f160849c;

        RunnableC63716c(String str, boolean z, VideoChat videoChat) {
            this.f160847a = str;
            this.f160848b = z;
            this.f160849c = videoChat;
        }

        public final void run() {
            boolean z;
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(this.f160847a)) {
                    jSONObject.put("env_id", this.f160847a);
                }
                jSONObject.put("is_minimised", String.valueOf(this.f160848b));
                boolean e = LabsUtils.m242913e();
                int i = 1;
                if (!e) {
                    z = true;
                } else {
                    z = false;
                }
                jSONObject.put("is_disabled", String.valueOf(z));
                JSONObject jSONObject2 = new JSONObject();
                if (e) {
                    i = 0;
                }
                jSONObject2.put("effect", i);
                jSONObject.put("disabled_feature", jSONObject2);
                C63728b.m249928a("vc_meeting_onthecall_view", jSONObject, this.f160849c);
            } catch (JSONException e2) {
                C60700b.m235851b("MeetingOnTheCallEvent2@", "[sendPageViewEvent]", "exception = " + e2.getMessage());
            }
        }
    }

    public /* synthetic */ MeetingOnTheCallEvent2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public final void mo220310b(boolean z, C61303k kVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            str = "open";
        } else {
            str = "close";
        }
        linkedHashMap.put("option", str);
        m249824a(this, kVar, "mic", null, linkedHashMap, null, null, 48, null);
    }

    /* renamed from: a */
    public final void mo220301a(C61303k kVar, String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "clickName");
        if (kVar != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AbsBreakoutRoomControl al = kVar.al();
            Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
            linkedHashMap.put("is_breakoutroom_start", String.valueOf(al.mo213181h()));
            AbsBreakoutRoomControl al2 = kVar.al();
            Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
            if (al2.mo213182i()) {
                str2 = "inrooms";
            } else {
                str2 = "mainroom";
            }
            linkedHashMap.put("user_location", str2);
            m249824a(this, kVar, str, null, linkedHashMap, null, null, 48, null);
        }
    }

    /* renamed from: a */
    public final void mo220304a(FunctionItem.FunctionType functionType, C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(functionType, "functionType");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        String str = null;
        String str2 = null;
        switch (C63717r.f160850a[functionType.ordinal()]) {
            case 1:
                str2 = "vc_meeting_chat_send_message_view";
                str = "chat";
                break;
            case 2:
                str2 = "vc_meeting_popup_view";
                str = "record";
                break;
            case 3:
                str2 = "vc_meeting_subtitle_view";
                str = "subtitle";
                break;
            case 4:
                str2 = "vc_live_meeting_setting_view";
                str = "live";
                break;
            case 5:
                str2 = "none";
                str = "effect";
                break;
            case 6:
                str2 = "vc_meeting_phone_invite_view";
                str = "phone_invite";
                break;
            case 7:
                str2 = "vc_meeting_interpretation";
                str = "interpretation";
                break;
            case 8:
                str2 = "vc_meeting_setting_view";
                str = "setting";
                break;
        }
        if (str != null) {
            m249824a(this, kVar, str, str2, null, null, null, 56, null);
        }
    }

    /* renamed from: a */
    public final void mo220307a(String str, boolean z, VideoChat videoChat) {
        Intrinsics.checkParameterIsNotNull(videoChat, "videoChat");
        C60735ab.m236018e(new RunnableC63716c(str, z, videoChat));
    }

    /* renamed from: a */
    public final void mo220305a(String str, C61303k kVar, String str2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "optionName");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "another";
        }
        linkedHashMap.put("option", str);
        m249824a(this, kVar, "speaker", str2, linkedHashMap, null, null, 48, null);
    }

    /* renamed from: a */
    public final void mo220306a(String str, String str2, C61303k kVar) {
        String str3;
        String str4;
        AbsBreakoutRoomControl al;
        AbsBreakoutRoomControl al2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("click", str);
            jSONObject.put("target", str2);
            VideoChat videoChat = null;
            if (kVar == null || (al2 = kVar.al()) == null) {
                str3 = null;
            } else {
                str3 = String.valueOf(al2.mo213181h());
            }
            jSONObject.put("is_breakoutroom_start", str3);
            if (kVar == null || (al = kVar.al()) == null || !al.mo213182i()) {
                str4 = "mainroom";
            } else {
                str4 = "inrooms";
            }
            jSONObject.put("user_location", str4);
            if (kVar != null) {
                videoChat = kVar.mo212056e();
            }
            C63728b.m249928a("vc_meeting_onthecall_click", jSONObject, videoChat);
        } catch (JSONException unused) {
            C60700b.m235851b("MeetingOnTheCallEvent2@", "[sendLobbyClickEvent]", ApiHandler.API_CALLBACK_EXCEPTION);
        }
    }

    /* renamed from: a */
    public final void mo220303a(C61303k kVar, String str, String str2, Map<String, String> map, String str3, JSONObject jSONObject) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(str, "clickName");
        boolean z3 = false;
        if (kVar.mo212067p() == DisplayMode.FAST_ENTRY || kVar.mo212067p() == DisplayMode.WINDOW) {
            z = true;
        } else {
            z = false;
        }
        AbstractC62612a aj = kVar.aj();
        Intrinsics.checkExpressionValueIsNotNull(aj, "meeting.shareScreenControl");
        boolean a = aj.mo216408a();
        AbstractC63022a ak = kVar.ak();
        Intrinsics.checkExpressionValueIsNotNull(ak, "meeting.shareBoxControl");
        boolean a2 = a | ak.mo217754a() | kVar.ay().mo216074e() | kVar.mo212092J().mo212511H();
        AbstractC61751a ab = kVar.ab();
        Intrinsics.checkExpressionValueIsNotNull(ab, "meeting.followControl");
        boolean f = a2 | ab.mo213880f();
        boolean e = DataAdapterUtil.f154006a.mo212859e(kVar);
        try {
            JSONObject jSONObject2 = new JSONObject();
            String K = kVar.mo212093K();
            if (K != null) {
                if (K.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    jSONObject2.put("env_id", kVar.mo212093K());
                }
            }
            jSONObject2.put("is_sharing", String.valueOf(f));
            jSONObject2.put("is_minimised", String.valueOf(z));
            jSONObject2.put("is_more", String.valueOf(e));
            String str4 = str2;
            if (str4 == null || str4.length() == 0) {
                z3 = true;
            }
            if (z3) {
                str2 = "none";
            }
            jSONObject2.put("target", str2);
            jSONObject2.put("click", str);
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            if (str3 != null) {
                jSONObject2.put(str3, jSONObject);
            }
            C63728b.m249928a("vc_meeting_onthecall_click", jSONObject2, kVar.mo212056e());
        } catch (JSONException e2) {
            C60700b.m235851b("MeetingOnTheCallEvent2@", "[sendClickEvent]", "exception = " + e2.getMessage());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m249824a(MeetingOnTheCallEvent2 qVar, C61303k kVar, String str, String str2, Map map, String str3, JSONObject jSONObject, int i, Object obj) {
        String str4;
        Map map2;
        String str5;
        JSONObject jSONObject2;
        if ((i & 4) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i & 8) != 0) {
            map2 = null;
        } else {
            map2 = map;
        }
        if ((i & 16) != 0) {
            str5 = null;
        } else {
            str5 = str3;
        }
        if ((i & 32) != 0) {
            jSONObject2 = null;
        } else {
            jSONObject2 = jSONObject;
        }
        qVar.mo220303a(kVar, str, str4, map2, str5, jSONObject2);
    }
}
