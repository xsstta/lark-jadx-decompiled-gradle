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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001a\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ8\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingCallingEvent;", "", "()V", "sendCallCancel", "", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "envId", "", "sendCallingDisplayEvent", "sendClickEvent", "click", "target", "extendJson", "Lorg/json/JSONObject;", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.h */
public final class MeetingCallingEvent {

    /* renamed from: a */
    public static final Lazy f160832a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63711b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160833b = new Companion(null);

    /* renamed from: a */
    public static final MeetingCallingEvent m249787a() {
        return f160833b.mo220278a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingCallingEvent$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/statistics/event2/MeetingCallingEvent;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/statistics/event2/MeetingCallingEvent;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.h$a */
    public static final class Companion {
        /* renamed from: a */
        public final MeetingCallingEvent mo220278a() {
            Lazy lazy = MeetingCallingEvent.f160832a;
            Companion aVar = MeetingCallingEvent.f160833b;
            return (MeetingCallingEvent) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/statistics/event2/MeetingCallingEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.h$b */
    static final class C63711b extends Lambda implements Function0<MeetingCallingEvent> {
        public static final C63711b INSTANCE = new C63711b();

        C63711b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MeetingCallingEvent invoke() {
            return new MeetingCallingEvent();
        }
    }

    /* renamed from: b */
    public final void mo220277b(VideoChat videoChat, String str) {
        mo220276a("cancel", "none", null, videoChat, str);
    }

    /* renamed from: a */
    public final void mo220275a(VideoChat videoChat, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("env_id", str);
            C63728b.m249928a("vc_meeting_calling_view", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingCallingEvent@", "[sendCallingDisplayEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220276a(String str, String str2, JSONObject jSONObject, VideoChat videoChat, String str3) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("click", str);
            jSONObject.put("target", str2);
            jSONObject.put("env_id", str3);
            C63728b.m249928a("vc_meeting_calling_click", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingCallingEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
        }
    }
}
