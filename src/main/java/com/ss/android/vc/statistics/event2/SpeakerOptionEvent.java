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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006J$\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/statistics/event2/SpeakerOptionEvent;", "", "()V", "sendClickEvent", "", "location", "", "click", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "envId", "sendPageViewEvent", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.af */
public final class SpeakerOptionEvent {

    /* renamed from: a */
    public static final Lazy f160812a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63704b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160813b = new Companion(null);

    /* renamed from: a */
    public static final SpeakerOptionEvent m249735a() {
        return f160813b.mo220241a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/event2/SpeakerOptionEvent$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/statistics/event2/SpeakerOptionEvent;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/statistics/event2/SpeakerOptionEvent;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.af$a */
    public static final class Companion {
        /* renamed from: a */
        public final SpeakerOptionEvent mo220241a() {
            Lazy lazy = SpeakerOptionEvent.f160812a;
            Companion aVar = SpeakerOptionEvent.f160813b;
            return (SpeakerOptionEvent) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private SpeakerOptionEvent() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/statistics/event2/SpeakerOptionEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.af$b */
    static final class C63704b extends Lambda implements Function0<SpeakerOptionEvent> {
        public static final C63704b INSTANCE = new C63704b();

        C63704b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SpeakerOptionEvent invoke() {
            return new SpeakerOptionEvent(null);
        }
    }

    public /* synthetic */ SpeakerOptionEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final void mo220239a(String str, String str2, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("env_id", str);
            }
            jSONObject.put("location", str2);
            C63728b.m249928a("vc_minutes_rematch_speakers_view", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235851b("SpeakerOptionEvent@", "[sendPageViewEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220240a(String str, String str2, VideoChat videoChat, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("click", str2);
            jSONObject.put("location", str);
            jSONObject.put("target", "none");
            jSONObject.put("env_id", str3);
            C63728b.m249928a("vc_meeting_loudspeaker_click", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235851b("SpeakerOptionEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
        }
    }
}
