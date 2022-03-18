package com.ss.android.vc.statistics.monitor;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.statemachine.AbstractC61338d;
import com.ss.android.vc.meeting.framework.statemachine.C61355p;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.monitor.d */
public class C63782d {
    /* renamed from: a */
    public static String m250416a(int i) {
        if (i == 100) {
            return "userStartCall";
        }
        if (i == 101) {
            return "userReject";
        }
        if (i == 103) {
            return "userHangup";
        }
        if (i == 104) {
            return "userCancel";
        }
        if (i == 113) {
            return "createVideoChatError";
        }
        if (i == 114) {
            return "timeout";
        }
        if (i == 116) {
            return "createVideoChatSuccess";
        }
        if (i == 203) {
            return "pushHeartbeatStop";
        }
        if (i == 205) {
            return "pushHeartbeatDisconnected";
        }
        switch (i) {
            case 108:
                return "noticeCalling";
            case SmEvents.EVENT_NR:
                return "noticeRinging";
            case SmEvents.EVENT_NO:
                return "noticeOnthecall";
            case SmEvents.EVENT_NT:
                return "noticeTerminated";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static String m250417a(AbstractC61338d dVar) {
        if (dVar instanceof C61355p.C61358c) {
            return "idle";
        }
        if (dVar instanceof C61355p.C61357b) {
            return "calling";
        }
        if (dVar instanceof C61355p.C61361f) {
            return "ringing";
        }
        if (dVar instanceof C61355p.C61360e) {
            return "onthecall";
        }
        return "";
    }

    /* renamed from: a */
    private static boolean m250419a(AbstractC61338d dVar, int i) {
        boolean z = dVar instanceof C61355p.C61359d;
        if (z && i == 203) {
            return true;
        }
        if (z && i == 205) {
            return true;
        }
        if ((dVar instanceof C61355p.C61357b) && i == 108) {
            return true;
        }
        if (!(dVar instanceof C61355p.C61361f) || i != 109) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m250418a(AbstractC61338d dVar, int i, VideoChat videoChat) {
        try {
            String a = m250417a(dVar);
            String a2 = m250416a(i);
            if (a != null) {
                if (!a.isEmpty()) {
                    if (a2 != null) {
                        if (!a2.isEmpty()) {
                            if (m250419a(dVar, i)) {
                                C60700b.m235864f("StateMachineExceptionMonitor", "[monitor3]", " state = " + a + ", input = " + i);
                                return;
                            }
                            String str = a + '_' + a2;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("route_alarm", str);
                            C60700b.m235851b("StateMachineExceptionMonitor", "[monitor4]", " content = " + str + ", state = " + a + ", event = " + i);
                            C63726b.m249918b("vcex_statemachine_switch_fail", jSONObject, videoChat);
                            return;
                        }
                    }
                    C60700b.m235864f("StateMachineExceptionMonitor", "[monitor2]", " input is null or empty. input = " + i);
                    return;
                }
            }
            C60700b.m235864f("StateMachineExceptionMonitor", "[monitor]", " fromState is null or empty. state = " + dVar);
        } catch (JSONException e) {
            C60700b.m235864f("StateMachineExceptionMonitor", "[monitor5]", " exception = " + e);
        }
    }
}
