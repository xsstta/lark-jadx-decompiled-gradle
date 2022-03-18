package com.ss.android.vc.statistics.event2;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3183d.C63728b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.b.aa */
public final class MeetingSharingRoomEvent {

    /* renamed from: a */
    public static final Lazy f160803a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63699b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160804b = new Companion(null);

    /* renamed from: com.ss.android.vc.statistics.b.aa$a */
    public static final class Companion {
        /* renamed from: a */
        public final MeetingSharingRoomEvent mo220226a() {
            Lazy lazy = MeetingSharingRoomEvent.f160803a;
            Companion aVar = MeetingSharingRoomEvent.f160804b;
            return (MeetingSharingRoomEvent) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private MeetingSharingRoomEvent() {
    }

    /* renamed from: com.ss.android.vc.statistics.b.aa$b */
    static final class C63699b extends Lambda implements Function0<MeetingSharingRoomEvent> {
        public static final C63699b INSTANCE = new C63699b();

        C63699b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MeetingSharingRoomEvent invoke() {
            return new MeetingSharingRoomEvent(null);
        }
    }

    public /* synthetic */ MeetingSharingRoomEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final void mo220224a(String str, VideoChat videoChat) {
        Intrinsics.checkParameterIsNotNull(str, "envId");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("env_id", str);
            C63728b.m249928a("vc_meeting_sharing_room_view", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingSharingRoomEvent@", "[sendViewEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220225a(String str, String str2, VideoChat videoChat) {
        Intrinsics.checkParameterIsNotNull(str, "envId");
        Intrinsics.checkParameterIsNotNull(str2, "click");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("env_id", str);
            jSONObject.put("click", str2);
            C63728b.m249928a("vc_meeting_sharing_room_click", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingSharingRoomEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m249717a(MeetingSharingRoomEvent aaVar, String str, VideoChat videoChat, int i, Object obj) {
        if ((i & 2) != 0) {
            videoChat = null;
        }
        aaVar.mo220224a(str, videoChat);
    }

    /* renamed from: a */
    public static /* synthetic */ void m249718a(MeetingSharingRoomEvent aaVar, String str, String str2, VideoChat videoChat, int i, Object obj) {
        if ((i & 4) != 0) {
            videoChat = null;
        }
        aaVar.mo220225a(str, str2, videoChat);
    }
}
