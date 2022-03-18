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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J8\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¨\u0006\u000f"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingCalEvent;", "", "()V", "sendCalendarPromptShowEvent", "", "sendClickEvent", "click", "", "target", "extendJson", "Lorg/json/JSONObject;", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "envId", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.f */
public final class MeetingCalEvent {

    /* renamed from: a */
    public static final Lazy f160828a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63709b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160829b = new Companion(null);

    /* renamed from: b */
    public static final MeetingCalEvent m249778b() {
        return f160829b.mo220270a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingCalEvent$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/statistics/event2/MeetingCalEvent;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/statistics/event2/MeetingCalEvent;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.f$a */
    public static final class Companion {
        /* renamed from: a */
        public final MeetingCalEvent mo220270a() {
            Lazy lazy = MeetingCalEvent.f160828a;
            Companion aVar = MeetingCalEvent.f160829b;
            return (MeetingCalEvent) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/statistics/event2/MeetingCalEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.f$b */
    static final class C63709b extends Lambda implements Function0<MeetingCalEvent> {
        public static final C63709b INSTANCE = new C63709b();

        C63709b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MeetingCalEvent invoke() {
            return new MeetingCalEvent();
        }
    }

    /* renamed from: a */
    public final void mo220268a() {
        C63728b.m249928a("vc_meeting_cal_view", null, null);
    }

    /* renamed from: a */
    public final void mo220269a(String str, String str2, JSONObject jSONObject, VideoChat videoChat, String str3) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("click", str);
            jSONObject.put("target", str2);
            jSONObject.put("env_id", str3);
            C63728b.m249928a("vc_meeting_cal_click", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingCalEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
        }
    }
}
