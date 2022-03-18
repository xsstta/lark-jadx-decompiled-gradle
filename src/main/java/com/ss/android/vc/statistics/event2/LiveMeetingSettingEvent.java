package com.ss.android.vc.statistics.event2;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.livestream.LiveInfo;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.livestream.AbstractC62011a;
import com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J$\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nJG\u0010\u000f\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n¨\u0006\u0019"}, d2 = {"Lcom/ss/android/vc/statistics/event2/LiveMeetingSettingEvent;", "", "()V", "sendEvent", "", "eventName", "", "jsonObject", "Lorg/json/JSONObject;", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "sendLiveConfirmClickEvent", "click", "target", "sendLiveConfirmViewEvent", "sendUpStreamClickEvent", "changePermission", "Lcom/ss/android/vc/entity/InMeetingData$LiveMeetingData$Privilege;", "liveStreamLayout", "Lcom/ss/android/vc/meeting/module/livestream/view/LiveLayoutStyleView$Style;", "chatEnable", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/vc/entity/InMeetingData$LiveMeetingData$Privilege;Lcom/ss/android/vc/meeting/module/livestream/view/LiveLayoutStyleView$Style;Ljava/lang/Boolean;Lcom/ss/android/vc/entity/VideoChat;)V", "sendViewEvent", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.b */
public final class LiveMeetingSettingEvent {

    /* renamed from: a */
    public static final Lazy f160821a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63706b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160822b = new Companion(null);

    /* renamed from: a */
    public static final LiveMeetingSettingEvent m249762a() {
        return f160822b.mo220259a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/event2/LiveMeetingSettingEvent$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/statistics/event2/LiveMeetingSettingEvent;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/statistics/event2/LiveMeetingSettingEvent;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.b$a */
    public static final class Companion {
        /* renamed from: a */
        public final LiveMeetingSettingEvent mo220259a() {
            Lazy lazy = LiveMeetingSettingEvent.f160821a;
            Companion aVar = LiveMeetingSettingEvent.f160822b;
            return (LiveMeetingSettingEvent) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/statistics/event2/LiveMeetingSettingEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.b$b */
    static final class C63706b extends Lambda implements Function0<LiveMeetingSettingEvent> {
        public static final C63706b INSTANCE = new C63706b();

        C63706b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LiveMeetingSettingEvent invoke() {
            return new LiveMeetingSettingEvent();
        }
    }

    /* renamed from: a */
    public final void mo220255a(VideoChat videoChat) {
        Intrinsics.checkParameterIsNotNull(videoChat, "videoChat");
        m249763a("vc_live_meeting_setting_view", (JSONObject) null, videoChat);
    }

    /* renamed from: b */
    public final void mo220258b(VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("content", "end_meeting_live");
            m249763a("vc_live_confirm_view", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235851b("LiveMeetingSettingEvent@", "[sendLiveConfirmViewEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220257a(String str, String str2, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str != null) {
                jSONObject.put("click", str);
            }
            if (str2 != null) {
                jSONObject.put("target", str2);
            }
            jSONObject.put("content", "end_meeting_live");
            m249763a("vc_live_confirm_click", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235851b("LiveMeetingSettingEvent@", "[sendLiveConfirmClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    private final void m249763a(String str, JSONObject jSONObject, VideoChat videoChat) {
        AbstractC62011a am;
        LiveInfo c;
        String str2;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        MeetingManager a = MeetingManager.m238341a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MeetingManager.getInstance()");
        AbstractC61294b j = a.mo211906j();
        if (!(j instanceof C61303k)) {
            j = null;
        }
        C61303k kVar = (C61303k) j;
        if (!(kVar == null || (am = kVar.am()) == null || (c = am.mo214677c()) == null)) {
            jSONObject.put("live_id", c.mo209952j());
            jSONObject.put("live_status", c.mo209943b() ? 1 : 0);
            if (c.mo209943b()) {
                str2 = c.mo209953k();
            } else {
                str2 = "null";
            }
            jSONObject.put("live_session_id", str2);
            jSONObject.put("live_session_type", "real");
        }
        C63728b.m249928a(str, jSONObject, videoChat);
    }

    /* renamed from: a */
    public final void mo220256a(String str, String str2, InMeetingData.LiveMeetingData.Privilege privilege, LiveLayoutStyleView.Style style, Boolean bool, VideoChat videoChat) {
        String str3;
        String str4;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("click", str);
            jSONObject.put("target", str2);
            String str5 = "none";
            if (privilege != null) {
                int i = C63707c.f160823a[privilege.ordinal()];
                if (i == 1) {
                    str4 = "anyone";
                } else if (i != 2) {
                    str4 = str5;
                } else {
                    str4 = "organizer_company";
                }
                jSONObject.put("change_permission", str4);
            }
            if (style != null) {
                int i2 = C63707c.f160824b[style.ordinal()];
                if (i2 == 1) {
                    str5 = "full_screen";
                } else if (i2 == 2) {
                    str5 = "gallery";
                } else if (i2 == 3) {
                    str5 = "sidebar";
                }
                jSONObject.put("livestream_layout", str5);
            }
            if (bool != null) {
                if (bool.booleanValue()) {
                    str3 = "True";
                } else {
                    str3 = "False";
                }
                jSONObject.put("is_enable_live_chat", str3);
            }
            m249763a("vc_live_meeting_setting_click", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235851b("LiveMeetingSettingEvent@", "[sendUpStreamClickEvent]", "exception = " + e.getMessage());
        }
    }
}
