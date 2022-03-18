package com.bytedance.crash.p218b;

import android.app.ActivityManager;

/* renamed from: com.bytedance.crash.b.a */
class C3692a {
    /* renamed from: a */
    static String m15205a(ActivityManager.ProcessErrorStateInfo processErrorStateInfo) {
        return "|------------- processErrorStateInfo--------------|\ncondition: " + processErrorStateInfo.condition + "\nprocessName: " + processErrorStateInfo.processName + "\npid: " + processErrorStateInfo.pid + "\nuid: " + processErrorStateInfo.uid + "\ntag: " + processErrorStateInfo.tag + "\nshortMsg : " + processErrorStateInfo.shortMsg + "\nlongMsg : " + processErrorStateInfo.longMsg + "\n-----------------------end----------------------------";
    }

    /* renamed from: a */
    static boolean m15206a(ActivityManager.ProcessErrorStateInfo processErrorStateInfo, ActivityManager.ProcessErrorStateInfo processErrorStateInfo2) {
        if (!String.valueOf(processErrorStateInfo.condition).equals(String.valueOf(processErrorStateInfo2.condition)) || !String.valueOf(processErrorStateInfo.processName).equals(String.valueOf(processErrorStateInfo2.processName)) || !String.valueOf(processErrorStateInfo.pid).equals(String.valueOf(processErrorStateInfo2.pid)) || !String.valueOf(processErrorStateInfo.uid).equals(String.valueOf(processErrorStateInfo2.uid)) || !String.valueOf(processErrorStateInfo.tag).equals(String.valueOf(processErrorStateInfo2.tag)) || !String.valueOf(processErrorStateInfo.shortMsg).equals(String.valueOf(processErrorStateInfo2.shortMsg)) || !String.valueOf(processErrorStateInfo.longMsg).equals(String.valueOf(processErrorStateInfo2.longMsg))) {
            return false;
        }
        return true;
    }
}
