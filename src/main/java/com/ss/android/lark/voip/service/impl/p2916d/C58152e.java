package com.ss.android.lark.voip.service.impl.p2916d;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.voip.service.impl.app.AbstractC58040c;
import com.ss.android.lark.voip.service.impl.app.C58076j;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;

/* renamed from: com.ss.android.lark.voip.service.impl.d.e */
public class C58152e {
    /* renamed from: a */
    public static String m225592a(int i) {
        switch (i) {
            case 1:
                return "userStartCall";
            case 2:
                return "noticeRinging";
            case 3:
                return "occupied";
            case 4:
                return "userAccept";
            case 5:
                return "userReject";
            case 6:
                return "userCancel";
            case 7:
                return "unAvailable";
            case 8:
                return "noticeOnthecall";
            case 9:
                return "noticeTerminated";
            case 10:
                return "lowVersion";
            case 11:
                return "userHangup";
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return "timing";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static String m225593a(AbstractC58040c cVar) {
        if (cVar instanceof C58076j.C58080d) {
            return "init";
        }
        if (cVar instanceof C58076j.C58089l) {
            return "waiting";
        }
        if (cVar instanceof C58076j.C58084h) {
            return "ringing";
        }
        if (cVar instanceof C58076j.C58082f) {
            return "occupied";
        }
        if (cVar instanceof C58076j.C58077a) {
            return "accepted";
        }
        if (cVar instanceof C58076j.C58083g) {
            return "onthecall";
        }
        if (cVar instanceof C58076j.C58087k) {
            return "timing";
        }
        if (cVar instanceof C58076j.C58086j) {
            return "terminated";
        }
        if (cVar instanceof C58076j.C58079c) {
            return "exit";
        }
        return "";
    }

    /* renamed from: a */
    public static void m225594a(AbstractC58040c cVar, int i, VoiceCall voiceCall) {
        String a = m225593a(cVar);
        String a2 = m225592a(i);
        if (a == null || a.isEmpty()) {
            Log.m165383e("StateMachineExceptionMonitor", "[monitor] fromState is null or empty. state = " + cVar);
        } else if (a2 == null || a2.isEmpty()) {
            Log.m165383e("StateMachineExceptionMonitor", "[monitor] input is null or empty. input = " + a2);
        } else if (voiceCall == null) {
            Log.m165383e("StateMachineExceptionMonitor", "[monitor] voiceCall is null");
        } else {
            String str = a + '_' + a2;
            Log.m165389i("StateMachineExceptionMonitor", "[monitor] content = " + str + ", state = " + cVar + ", event = " + i);
            VoipHitPoint.m225607a("voipex_statemachine_switch_fail", str, voiceCall);
        }
    }
}
