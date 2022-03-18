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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\n"}, d2 = {"Lcom/ss/android/vc/statistics/event/MeetingShareWindowEvent;", "", "()V", "sendViewEvent", "", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "envId", "", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.event.be */
public final class MeetingShareWindowEvent {

    /* renamed from: a */
    public static final Lazy f160897a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63748b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160898b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/event/MeetingShareWindowEvent$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/statistics/event/MeetingShareWindowEvent;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/statistics/event/MeetingShareWindowEvent;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.event.be$a */
    public static final class Companion {
        /* renamed from: a */
        public final MeetingShareWindowEvent mo220398a() {
            Lazy lazy = MeetingShareWindowEvent.f160897a;
            Companion aVar = MeetingShareWindowEvent.f160898b;
            return (MeetingShareWindowEvent) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/statistics/event/MeetingShareWindowEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.event.be$b */
    static final class C63748b extends Lambda implements Function0<MeetingShareWindowEvent> {
        public static final C63748b INSTANCE = new C63748b();

        C63748b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MeetingShareWindowEvent invoke() {
            return new MeetingShareWindowEvent();
        }
    }

    /* renamed from: a */
    public final void mo220397a(VideoChat videoChat, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("env_id", str);
            C63726b.m249915a("vc_meeting_sharewindow_view", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingShareWindowEvent@", "[sendViewEvent]", "exception: " + e.getMessage());
        }
    }
}
