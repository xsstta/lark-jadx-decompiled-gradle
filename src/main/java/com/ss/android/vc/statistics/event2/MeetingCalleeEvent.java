package com.ss.android.vc.statistics.event2;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3183d.C63728b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006J:\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\"\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u0006¨\u0006\u0013"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingCalleeEvent;", "", "()V", "sendCallAccept", "", "click", "", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "envId", "sendClickEvent", "target", "extendJson", "Lorg/json/JSONObject;", "sendPageRinging", "sendRefuseRinging", "busyRing", "", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.g */
public final class MeetingCalleeEvent {

    /* renamed from: a */
    public static final Lazy f160830a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63710b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160831b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingCalleeEvent$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/statistics/event2/MeetingCalleeEvent;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/statistics/event2/MeetingCalleeEvent;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.g$a */
    public static final class Companion {
        /* renamed from: a */
        public final MeetingCalleeEvent mo220274a() {
            Lazy lazy = MeetingCalleeEvent.f160830a;
            Companion aVar = MeetingCalleeEvent.f160831b;
            return (MeetingCalleeEvent) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/statistics/event2/MeetingCalleeEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.g$b */
    static final class C63710b extends Lambda implements Function0<MeetingCalleeEvent> {
        public static final C63710b INSTANCE = new C63710b();

        C63710b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MeetingCalleeEvent invoke() {
            return new MeetingCalleeEvent();
        }
    }

    /* renamed from: a */
    public final void mo220271a(VideoChat videoChat, String str) {
        if (videoChat != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("env_id", str);
                if (videoChat.getType() == VideoChat.Type.CALL) {
                    C63728b.m249928a("vc_meeting_callee_view", jSONObject, videoChat);
                }
            } catch (JSONException e) {
                C60700b.m235851b("MeetingCalleeEvent@", "[sendPageRinging]", "exception = " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public final void mo220272a(VideoChat videoChat, boolean z, String str) {
        if (videoChat != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("env_id", str);
                }
                if (videoChat.getType() == VideoChat.Type.CALL) {
                    m249782a("refuse", "none", jSONObject, videoChat, str);
                }
            } catch (JSONException e) {
                C60700b.m235851b("MeetingCalleeEvent@", "[sendRefuseRinging]", "exception = " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public final void mo220273a(String str, VideoChat videoChat, String str2) {
        if (videoChat != null && videoChat.getType() == VideoChat.Type.CALL) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("env_id", str2);
                }
                m249782a(str, "none", jSONObject, videoChat, str2);
            } catch (JSONException e) {
                C60700b.m235851b("MeetingCalleeEvent@", "[sendCallAccept]", "exception = " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    private final void m249782a(String str, String str2, JSONObject jSONObject, VideoChat videoChat, String str3) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("click", str);
            jSONObject.put("target", str2);
            jSONObject.put("env_id", str3);
            C63728b.m249928a("vc_meeting_callee_click", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingCalleeEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
        }
    }
}
