package com.ss.android.vc.trace;

import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.p3182c.C63726b;
import com.ss.android.vcxp.C63791b;
import org.json.JSONException;
import org.json.JSONObject;

public class VCLauncherStatistics {

    /* renamed from: a */
    private static volatile long f160958a = 0;

    /* renamed from: b */
    private static volatile long f160959b = 0;

    /* renamed from: c */
    private static volatile SCENE f160960c = null;

    /* renamed from: d */
    private static volatile boolean f160961d = true;

    /* renamed from: b */
    public static void m250424b() {
        if (f160958a == 0 && f160959b > 0) {
            C60700b.m235851b("VCLauncherStatistics", "[resume]", "resume");
            f160958a = System.currentTimeMillis();
        }
    }

    /* renamed from: d */
    public static void m250426d() {
        f160959b = 0;
        f160958a = 0;
        f160960c = null;
        C60700b.m235851b("VCLauncherStatistics", "[abort]", "abort");
    }

    /* renamed from: a */
    public static void m250421a() {
        if (f160958a > 0) {
            f160959b += System.currentTimeMillis() - f160958a;
            if (f160959b == 0) {
                f160959b = 1;
            }
            f160958a = 0;
            C60700b.m235851b("VCLauncherStatistics", "[pause]", "time = " + f160959b);
        }
    }

    /* renamed from: c */
    public static void m250425c() throws Exception {
        boolean z;
        String str;
        String str2;
        if (f160958a > 0 && f160959b > 0 && f160960c != null) {
            f160959b += System.currentTimeMillis() - f160958a;
            if (f160959b < 20000) {
                C63784a.m250431d("[VideoChat_Launch_2]");
                C63784a.m250431d("[VideoChat_Launch]");
                C61303k kVar = (C61303k) MeetingManager.m238341a().mo211906j();
                m250422a(kVar);
                if (kVar != null) {
                    if (kVar.mo212057f() == VideoChat.Type.MEET) {
                        z = true;
                    } else {
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("type = ");
                    if (z) {
                        str = "meet";
                    } else {
                        str = "call";
                    }
                    sb.append(str);
                    sb.append(", scene = ");
                    sb.append(f160960c.name());
                    sb.append(", launchType = ");
                    if (f160961d) {
                        str2 = "cold";
                    } else {
                        str2 = "hot";
                    }
                    sb.append(str2);
                    sb.append(", time = ");
                    sb.append(f160959b);
                    C60700b.m235851b("VCLauncherStatistics", "[end]", sb.toString());
                }
            }
            f160959b = 0;
            f160958a = 0;
            f160960c = null;
        }
        f160961d = false;
    }

    /* renamed from: a */
    private static void m250422a(C61303k kVar) {
        String str;
        int i;
        if (ar.m236694a() != null && !C26284k.m95185a(ar.m236694a()) && !C26284k.m95186b(ar.m236694a()) && !DesktopUtil.m144307b()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("scene", f160960c.value);
                if (f160961d) {
                    str = "cold";
                } else {
                    str = "hot";
                }
                jSONObject.put("launch_type", str);
                jSONObject.put("durations", f160959b);
                if (C63791b.m250468b()) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("is_multi_process", i);
                if (kVar != null) {
                    C63726b.m249915a("vc_launch_monitor", jSONObject, kVar.mo212056e());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m250423a(SCENE scene) {
        C63784a.m250430c("[VideoChat_Launch]");
        C63784a.m250430c("[VideoChat_Launch_1]");
        f160960c = scene;
        C60700b.m235851b("VCLauncherStatistics", "[start]", "scene = " + scene.name());
        f160959b = 0;
        f160958a = System.currentTimeMillis();
    }

    public enum SCENE {
        LAUNCH("launch"),
        NORMAL_JOIN("normal_join"),
        ACCEPT("accept"),
        NUMBER_JOIN("number_join"),
        CALENDAR_JOIN("calendar_join"),
        GUEST_JOIN("guest_join"),
        BUSY_JOIN("busy_join");
        
        String value;

        private SCENE(String str) {
            this.value = str;
        }
    }
}
