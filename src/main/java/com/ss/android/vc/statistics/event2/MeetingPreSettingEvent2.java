package com.ss.android.vc.statistics.event2;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.presetting.MeetingPreSettingEvent;
import com.ss.android.vc.statistics.p3183d.C63728b;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingPreSettingEvent2;", "", "()V", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.v */
public final class MeetingPreSettingEvent2 {

    /* renamed from: a */
    public static final Companion f160857a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final String m249875a(MeetingPreSettingEvent.SecurityLevel securityLevel) {
        return f160857a.mo220345a(securityLevel);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m249876a(String str) {
        f160857a.mo220346a(str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m249877a(String str, String str2, String str3, JSONObject jSONObject, VideoChat videoChat, String str4) {
        f160857a.mo220347a(str, str2, str3, jSONObject, videoChat, str4);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m249878a(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, JSONObject jSONObject, VideoChat videoChat, String str4) {
        f160857a.mo220348a(str, str2, str3, z, z2, z3, z4, jSONObject, videoChat, str4);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007JD\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007Jd\u0010\u0013\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingPreSettingEvent2$Companion;", "", "()V", "TAG", "", "getSecurityStr", "level", "Lcom/ss/android/vc/meeting/module/presetting/MeetingPreSettingEvent$SecurityLevel;", "sendClickEvent", "", "click", "target", "isClilcked", "extendJson", "Lorg/json/JSONObject;", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "envId", "sendPageViewEvent", "sendPreSettingConfirmEvent", "permession", "waitRoom", "", "preJoin", "autoMute", "autoRecord", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.v$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo220345a(MeetingPreSettingEvent.SecurityLevel securityLevel) {
            if (securityLevel != null) {
                int i = C63721w.f160858a[securityLevel.ordinal()];
                if (i == 1) {
                    return "anyone";
                }
                if (i == 2) {
                    return "organizer_company";
                }
                if (i != 3) {
                    return "";
                }
                return "event_guest";
            }
            return "";
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo220346a(String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("env_id", str);
                }
                C63728b.m249928a("vc_meeting_pre_setting_view", jSONObject, null);
            } catch (JSONException e) {
                C60700b.m235851b("MeetingPreSettingEvent2@", "[sendPageViewEvent]", "exception = " + e.getMessage());
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo220347a(String str, String str2, String str3, JSONObject jSONObject, VideoChat videoChat, String str4) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("click", str);
                jSONObject.put("target", str2);
                jSONObject.put("env_id", str4);
                jSONObject.put("is_clicked", str3);
                C63728b.m249928a("vc_meeting_pre_setting_click", jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235851b("MeetingPreSettingEvent2@", "[sendClickEvent]", "exception = " + e.getMessage());
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo220348a(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, JSONObject jSONObject, VideoChat videoChat, String str4) {
            String str5;
            String str6;
            String str7;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("click", str);
                jSONObject.put("target", str2);
                jSONObject.put("is_change_permission", str3);
                String str8 = "true";
                if (z) {
                    str5 = str8;
                } else {
                    str5 = "false";
                }
                jSONObject.put("is_enable_pre_waitingroom", str5);
                if (z2) {
                    str6 = str8;
                } else {
                    str6 = "false";
                }
                jSONObject.put("is_permit_join_before_owner", str6);
                if (z3) {
                    str7 = str8;
                } else {
                    str7 = "false";
                }
                jSONObject.put("is_auto_mute", str7);
                if (!z4) {
                    str8 = "false";
                }
                jSONObject.put("is_auto_record", str8);
                jSONObject.put("env_id", str4);
                C63728b.m249928a("vc_meeting_pre_setting_click", jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235851b("MeetingPreSettingEvent2@", "[sendPreSettingConfirmEvent]", "exception = " + e.getMessage());
            }
        }
    }
}
