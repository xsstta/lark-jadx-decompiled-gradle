package com.ss.android.vc.statistics.event;

import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class aq {
    /* renamed from: a */
    public static void m250043a(String str, String str2, String str3, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str3);
            jSONObject.put("from_source", str2);
            C63726b.m249915a(str, jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m250041a(String str, Long l, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            jSONObject.put("is_live", l);
            C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m250040a(String str, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            C63726b.m249915a("vc_begin_live_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m250042a(String str, Long l, JSONObject jSONObject, VideoChat videoChat) {
        try {
            jSONObject.put("action_name", str);
            jSONObject.put("live_id", l);
            C63726b.m249915a("vc_live_setting_page", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.ss.android.vc.statistics.event.aq$1 */
    static /* synthetic */ class C637411 {

        /* renamed from: a */
        static final /* synthetic */ int[] f160883a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView$Style[] r0 = com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView.Style.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.statistics.event.aq.C637411.f160883a = r0
                com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView$Style r1 = com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView.Style.LIST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.statistics.event.aq.C637411.f160883a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView$Style r1 = com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView.Style.GALLERY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.statistics.event.aq.C637411.f160883a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView$Style r1 = com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView.Style.FULLSCREEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.statistics.event.aq.C637411.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m250031a(VideoChat videoChat) {
        m250040a("refuse", videoChat);
    }

    /* renamed from: b */
    public static void m250044b(VideoChat videoChat) {
        m250040a("agree", videoChat);
    }

    /* renamed from: c */
    public static void m250047c(VideoChat videoChat) {
        m250046b("confirm", videoChat);
    }

    /* renamed from: d */
    public static void m250049d(VideoChat videoChat) {
        m250046b("cancel", videoChat);
    }

    /* renamed from: b */
    public static void m250045b(Long l, VideoChat videoChat) {
        m250041a("ask_host_to_livestream", l, videoChat);
    }

    /* renamed from: c */
    public static void m250048c(Long l, VideoChat videoChat) {
        m250042a("end_live", l, new JSONObject(), videoChat);
    }

    /* renamed from: b */
    private static void m250046b(String str, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            C63726b.m249915a("vc_end_live_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250038a(VideoChat videoChat, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", "live_request_reconfirm");
            jSONObject.put("action_name", str);
            C63726b.m249915a("vc_meeting_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250039a(Long l, VideoChat videoChat) {
        m250041a("live", l, videoChat);
    }

    /* renamed from: a */
    public static void m250033a(VideoChat videoChat, Long l, boolean z) {
        m250036a(videoChat, l, z, "copy_livestreaminglink");
    }

    /* renamed from: a */
    public static void m250034a(VideoChat videoChat, Long l, boolean z, InMeetingData.LiveMeetingData.Privilege privilege) {
        String str;
        if (privilege == InMeetingData.LiveMeetingData.Privilege.EMPLOYEE) {
            str = "inside_user";
        } else {
            str = "all_user";
        }
        m250036a(videoChat, l, z, str);
    }

    /* renamed from: a */
    public static void m250035a(VideoChat videoChat, Long l, boolean z, LiveLayoutStyleView.Style style) {
        String str;
        if (style.equals(LiveLayoutStyleView.Style.LIST)) {
            str = "sidebar";
        } else if (style.equals(LiveLayoutStyleView.Style.GALLERY)) {
            str = "gallery";
        } else {
            str = "full_screen";
        }
        m250036a(videoChat, l, z, str);
    }

    /* renamed from: a */
    public static void m250036a(VideoChat videoChat, Long l, boolean z, String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_live", i);
            m250042a(str, l, jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250037a(VideoChat videoChat, Long l, boolean z, boolean z2) {
        String str;
        if (z2) {
            str = "enable_live_chat_for_viewers";
        } else {
            str = "disable_live_chat_for_viewers";
        }
        m250036a(videoChat, l, z, str);
    }

    /* renamed from: a */
    public static void m250032a(VideoChat videoChat, Long l, InMeetingData.LiveMeetingData.Privilege privilege, LiveLayoutStyleView.Style style, boolean z) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            jSONObject.put("is_live", 0);
            if (privilege.equals(InMeetingData.LiveMeetingData.Privilege.ANONYMOUS)) {
                str = "all_user";
            } else {
                str = "inside_user";
            }
            jSONObject.put("live_range", str);
            if (z) {
                i = 1;
            }
            jSONObject.put("enable_live_chat_for_viewers", i);
            int i2 = C637411.f160883a[style.ordinal()];
            if (i2 == 1) {
                jSONObject.put("livestream_layout", "sidebar");
            } else if (i2 == 2) {
                jSONObject.put("livestream_layout", "gallery");
            } else if (i2 == 3) {
                jSONObject.put("livestream_layout", "full_screen");
            }
            m250042a("begin_live", l, jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
