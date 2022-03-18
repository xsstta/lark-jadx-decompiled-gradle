package com.ss.android.vc.statistics.event;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006J6\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/vc/statistics/event/MeetingEntryEvent2;", "", "()V", "sendClickEvent", "", "click", "", "target", "extendJson", "Lorg/json/JSONObject;", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "envId", "sendMeetingEntranceEvent", "inMeeting", "", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.event.ak */
public final class MeetingEntryEvent2 {

    /* renamed from: a */
    public static final Lazy f160881a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63740b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160882b = new Companion(null);

    /* renamed from: a */
    public static final MeetingEntryEvent2 m250016a() {
        return f160882b.mo220391a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/event/MeetingEntryEvent2$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/statistics/event/MeetingEntryEvent2;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/statistics/event/MeetingEntryEvent2;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.event.ak$a */
    public static final class Companion {
        /* renamed from: a */
        public final MeetingEntryEvent2 mo220391a() {
            Lazy lazy = MeetingEntryEvent2.f160881a;
            Companion aVar = MeetingEntryEvent2.f160882b;
            return (MeetingEntryEvent2) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/statistics/event/MeetingEntryEvent2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.event.ak$b */
    static final class C63740b extends Lambda implements Function0<MeetingEntryEvent2> {
        public static final C63740b INSTANCE = new C63740b();

        C63740b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MeetingEntryEvent2 invoke() {
            return new MeetingEntryEvent2();
        }
    }

    /* renamed from: a */
    public final void mo220389a(String str, String str2, JSONObject jSONObject, VideoChat videoChat, String str3) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("click", str);
            jSONObject.put("target", str2);
            jSONObject.put("env_id", str3);
            C63726b.m249915a("vc_meeting_entry_click", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingEntryEvent2@", "[sendClickEvent]", "exception: " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220390a(String str, String str2, boolean z, VideoChat videoChat, String str3) {
        String str4;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str4 = "true";
            } else {
                str4 = "false";
            }
            jSONObject.put("during_meeting", str4);
            mo220389a(str, str2, jSONObject, videoChat, str3);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingEntryEvent2@", "[sendMeetingEntranceEvent]", "exception: " + e.getMessage());
        }
    }
}
