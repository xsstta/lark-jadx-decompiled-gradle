package com.ss.android.vc.statistics.monitor;

import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener;
import com.ss.android.vc.statistics.p3182c.C63726b;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.monitor.b */
public class C63780b {

    /* renamed from: a */
    private static HashMap<String, Boolean> f160955a = new HashMap<>();

    /* renamed from: b */
    private static AtomicBoolean f160956b = new AtomicBoolean(false);

    /* renamed from: c */
    private static IMeetingsSizeChangeListener f160957c = new MeetingErrorMonitor$1();

    /* renamed from: a */
    public static void m250407a() {
        if (f160956b.compareAndSet(false, true)) {
            MeetingManager.m238341a().addMeetingsSizeChangeListener(f160957c);
        }
    }

    /* renamed from: b */
    public static void m250410b() {
        C60700b.m235851b("MeetingErrorMonitor", "[setMeetingCrashFlag]", "setMeetingCrashFlag");
        C57744a.m224104a().putBoolean("SP_KEY_MEETING_CRASH_FLAG", true);
    }

    /* renamed from: c */
    public static void m250412c() {
        C60700b.m235851b("MeetingErrorMonitor", "[clearMeetingCrashFlag]", "clearMeetingCrashFlag");
        C57744a.m224104a().putBoolean("SP_KEY_MEETING_CRASH_FLAG", false);
    }

    /* renamed from: d */
    public static void m250414d(VideoChat videoChat) {
        m250409a("crash", videoChat);
        C60700b.m235851b("MeetingErrorMonitor", "[sendMeetingCrashMonitor]", "true");
        C57744a.m224104a().putBoolean("SP_KEY_MEETING_CRASH_FLAG", false);
    }

    /* renamed from: a */
    public static void m250408a(VideoChat videoChat) {
        C60700b.m235851b("MeetingErrorMonitor", "[setMeetingOnTheCallFlag]", "setMeetingOnTheCallFlag");
        if (videoChat != null) {
            C57744a a = C57744a.m224104a();
            a.putBoolean("SP_KEY_MEETING_ON_THE_CALL_" + videoChat.getId(), true);
        }
    }

    /* renamed from: b */
    public static void m250411b(VideoChat videoChat) {
        C60700b.m235851b("MeetingErrorMonitor", "[clearMeetingOnTheCallFlag]", "clearMeetingOnTheCallFlag");
        if (videoChat != null) {
            C57744a a = C57744a.m224104a();
            a.putBoolean("SP_KEY_MEETING_ON_THE_CALL_" + videoChat.getId(), false);
        }
    }

    /* renamed from: c */
    public static boolean m250413c(VideoChat videoChat) {
        C60700b.m235851b("MeetingErrorMonitor", "[getMeetingOnTheCallFlag]", "getMeetingOnTheCallFlag");
        if (videoChat == null) {
            return false;
        }
        C57744a a = C57744a.m224104a();
        return a.getBoolean("SP_KEY_MEETING_ON_THE_CALL_" + videoChat.getId());
    }

    /* renamed from: a */
    public static void m250409a(String str, VideoChat videoChat) {
        if (videoChat != null) {
            Boolean bool = f160955a.get(videoChat.getId());
            if (bool == null || !bool.booleanValue()) {
                f160955a.put(videoChat.getId(), true);
            } else {
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_type_alarm", str);
            if (m250413c(videoChat)) {
                jSONObject.put("on_the_call", 1);
            } else {
                jSONObject.put("on_the_call", 0);
            }
            C63726b.m249918b("vcex_meeting_error", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
