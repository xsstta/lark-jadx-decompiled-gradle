package com.ss.android.vc.statistics.event2;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006J8\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ$\u0010\u0010\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006J.\u0010\u0011\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0006¨\u0006\u0013"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingWaitingEvent;", "", "()V", "sendCameraClickEvent", "", "option", "", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "envId", "sendClickEvent", "click", "target", "extendJson", "Lorg/json/JSONObject;", "sendEnterLobbyEvent", "sendMicrophoneClickEvent", "sendSpeakerClickEvent", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.ac */
public final class MeetingWaitingEvent {

    /* renamed from: a */
    public static final Lazy f160807a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63701b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160808b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingWaitingEvent$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/statistics/event2/MeetingWaitingEvent;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/statistics/event2/MeetingWaitingEvent;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.ac$a */
    public static final class Companion {
        /* renamed from: a */
        public final MeetingWaitingEvent mo220235a() {
            Lazy lazy = MeetingWaitingEvent.f160807a;
            Companion aVar = MeetingWaitingEvent.f160808b;
            return (MeetingWaitingEvent) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/statistics/event2/MeetingWaitingEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.ac$b */
    static final class C63701b extends Lambda implements Function0<MeetingWaitingEvent> {
        public static final C63701b INSTANCE = new C63701b();

        C63701b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MeetingWaitingEvent invoke() {
            return new MeetingWaitingEvent();
        }
    }

    /* renamed from: a */
    public final void mo220230a(String str, VideoChat videoChat) {
        try {
            new JSONObject().put("env_id", str);
            C63728b.m249928a("vc_meeting_waiting_view", null, videoChat);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingWaitingEvent@", "[sendEnterLobbyEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo220234b(String str, VideoChat videoChat, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("option", str);
            mo220233a("mic", "none", jSONObject, videoChat, str2);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingWaitingEvent@", "[sendMicrophoneClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220231a(String str, VideoChat videoChat, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("option", str);
            mo220233a("camera", "none", jSONObject, videoChat, str2);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingWaitingEvent@", "[sendCameraClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d A[Catch:{ JSONException -> 0x0027 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo220232a(java.lang.String r7, com.ss.android.vc.entity.VideoChat r8, java.lang.String r9, java.lang.String r10) {
        /*
            r6 = this;
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r0 = "option"
            r3.put(r0, r7)     // Catch:{ JSONException -> 0x0027 }
            java.lang.String r1 = "speaker"
            r7 = r10
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ JSONException -> 0x0027 }
            if (r7 == 0) goto L_0x001a
            int r7 = r7.length()     // Catch:{ JSONException -> 0x0027 }
            if (r7 != 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r7 = 0
            goto L_0x001b
        L_0x001a:
            r7 = 1
        L_0x001b:
            if (r7 == 0) goto L_0x001f
            java.lang.String r10 = "none"
        L_0x001f:
            r2 = r10
            r0 = r6
            r4 = r8
            r5 = r9
            r0.mo220233a(r1, r2, r3, r4, r5)     // Catch:{ JSONException -> 0x0027 }
            goto L_0x0044
        L_0x0027:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "exception = "
            r8.append(r9)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "MeetingWaitingEvent@"
            java.lang.String r9 = "[sendSpeakerClickEvent]"
            com.ss.android.vc.common.p3077b.C60700b.m235851b(r8, r9, r7)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.statistics.event2.MeetingWaitingEvent.mo220232a(java.lang.String, com.ss.android.vc.entity.VideoChat, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo220233a(String str, String str2, JSONObject jSONObject, VideoChat videoChat, String str3) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("click", str);
            jSONObject.put("target", str2);
            jSONObject.put("env_id", str3);
            C63728b.m249928a("vc_meeting_waiting_click", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingWaitingEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
        }
    }
}
