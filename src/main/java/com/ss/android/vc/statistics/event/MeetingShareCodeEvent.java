package com.ss.android.vc.statistics.event;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3183d.C63728b;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/statistics/event/MeetingShareCodeEvent;", "", "()V", "sendClickEvent", "", "click", "", "target", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "envId", "sendViewEvent", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.event.bc */
public final class MeetingShareCodeEvent {

    /* renamed from: a */
    public static final Lazy f160893a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63746b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160894b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/event/MeetingShareCodeEvent$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/statistics/event/MeetingShareCodeEvent;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/statistics/event/MeetingShareCodeEvent;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.event.bc$a */
    public static final class Companion {
        /* renamed from: a */
        public final MeetingShareCodeEvent mo220394a() {
            Lazy lazy = MeetingShareCodeEvent.f160893a;
            Companion aVar = MeetingShareCodeEvent.f160894b;
            return (MeetingShareCodeEvent) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/statistics/event/MeetingShareCodeEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.event.bc$b */
    static final class C63746b extends Lambda implements Function0<MeetingShareCodeEvent> {
        public static final C63746b INSTANCE = new C63746b();

        C63746b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MeetingShareCodeEvent invoke() {
            return new MeetingShareCodeEvent();
        }
    }

    /* renamed from: a */
    public final void mo220392a(VideoChat videoChat, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("env_id", str);
            C63728b.m249928a("vc_meeting_sharecode_view", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingShareCodeEvent@", "[sendViewEvent]", "exception: " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220393a(String str, String str2, VideoChat videoChat, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "click");
        Intrinsics.checkParameterIsNotNull(str2, "target");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", str);
            jSONObject.put("target", str2);
            jSONObject.put("env_id", str3);
            C63728b.m249928a("vc_meeting_sharecode_click", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingShareCodeEvent@", "[sendClickEvent]", "exception: " + e.getMessage());
        }
    }
}
