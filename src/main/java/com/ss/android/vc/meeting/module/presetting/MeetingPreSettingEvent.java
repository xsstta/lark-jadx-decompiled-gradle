package com.ss.android.vc.meeting.module.presetting;

import com.google.firebase.messaging.Constants;
import com.ss.android.vc.statistics.C63685a;
import org.json.JSONException;
import org.json.JSONObject;

public class MeetingPreSettingEvent {

    public enum SecurityLevel {
        ANYONE,
        ORGANIZERCOMPANY,
        EVENTGUEST
    }

    /* renamed from: a */
    public static void m245024a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            C63685a.m249653a("vc_pre_setting_page", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.presetting.MeetingPreSettingEvent$1 */
    static /* synthetic */ class C626241 {

        /* renamed from: a */
        static final /* synthetic */ int[] f157666a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.meeting.module.presetting.MeetingPreSettingEvent$SecurityLevel[] r0 = com.ss.android.vc.meeting.module.presetting.MeetingPreSettingEvent.SecurityLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.presetting.MeetingPreSettingEvent.C626241.f157666a = r0
                com.ss.android.vc.meeting.module.presetting.MeetingPreSettingEvent$SecurityLevel r1 = com.ss.android.vc.meeting.module.presetting.MeetingPreSettingEvent.SecurityLevel.ANYONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.presetting.MeetingPreSettingEvent.C626241.f157666a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.presetting.MeetingPreSettingEvent$SecurityLevel r1 = com.ss.android.vc.meeting.module.presetting.MeetingPreSettingEvent.SecurityLevel.ORGANIZERCOMPANY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.presetting.MeetingPreSettingEvent.C626241.f157666a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.module.presetting.MeetingPreSettingEvent$SecurityLevel r1 = com.ss.android.vc.meeting.module.presetting.MeetingPreSettingEvent.SecurityLevel.EVENTGUEST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.presetting.MeetingPreSettingEvent.C626241.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m245028a(boolean z, String str) {
        String str2;
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        m245026a("click_auto_mute", str2, str);
    }

    /* renamed from: b */
    public static void m245029b(boolean z, String str) {
        String str2;
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        m245026a("click_auto_record", str2, str);
    }

    /* renamed from: c */
    public static void m245030c(boolean z, String str) {
        String str2;
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        m245026a("click_enable_pre_waitingroom", str2, str);
    }

    /* renamed from: d */
    public static void m245031d(boolean z, String str) {
        String str2;
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        m245026a("click_permit_join_before_owner", str2, str);
    }

    /* renamed from: a */
    public static void m245025a(SecurityLevel securityLevel, String str) {
        String str2;
        int i = C626241.f157666a[securityLevel.ordinal()];
        if (i == 1) {
            str2 = "anyone";
        } else if (i == 2) {
            str2 = "organizer_company";
        } else if (i != 3) {
            str2 = "";
        } else {
            str2 = "event_guest";
        }
        m245026a("change_permission", str2, str);
    }

    /* renamed from: a */
    private static void m245026a(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            jSONObject.put("action_status", str2);
            jSONObject.put("unique_id", str3);
            C63685a.m249653a("vc_pre_setting_page", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m245027a(boolean z, SecurityLevel securityLevel, boolean z2, boolean z3, boolean z4) {
        String str;
        String str2;
        String str3;
        if (securityLevel != null) {
            String str4 = "";
            try {
                int i = C626241.f157666a[securityLevel.ordinal()];
                if (i == 1) {
                    str4 = "anyone";
                } else if (i == 2) {
                    str4 = "organizer_company";
                } else if (i == 3) {
                    str4 = "event_guest";
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", "click_back");
                String str5 = "1";
                if (z) {
                    str = str5;
                } else {
                    str = "0";
                }
                jSONObject.put("is_auto_mute_clicked", str);
                jSONObject.put("permission", str4);
                if (z2) {
                    str2 = str5;
                } else {
                    str2 = "0";
                }
                jSONObject.put("is_prewaitingroom_enabled", str2);
                if (z3) {
                    str3 = str5;
                } else {
                    str3 = "0";
                }
                jSONObject.put("is_join_before_owner_clicked", str3);
                if (!z4) {
                    str5 = "0";
                }
                jSONObject.put("is_auto_record_clicked", str5);
                C63685a.m249653a("vc_pre_setting_page", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
