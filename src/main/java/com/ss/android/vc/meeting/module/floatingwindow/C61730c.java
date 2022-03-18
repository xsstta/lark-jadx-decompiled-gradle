package com.ss.android.vc.meeting.module.floatingwindow;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Build;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vcxp.C63791b;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.floatingwindow.c */
public class C61730c {
    /* renamed from: a */
    private static boolean m240978a(String str) {
        ActivityManager.RunningTaskInfo runningTaskInfo;
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) ar.m236694a().getSystemService("activity")).getRunningTasks(1);
        if (runningTasks.size() == 0 || (runningTaskInfo = runningTasks.get(0)) == null || runningTaskInfo.topActivity == null) {
            return false;
        }
        return runningTaskInfo.topActivity.getClassName().startsWith(str);
    }

    /* renamed from: a */
    public static boolean m240977a(Activity activity, C61303k kVar) {
        if (kVar != null && kVar.aE().mo208293c() && ByteRTCMeetingActivity.m244029A() && activity != null) {
            ByteRTCMeetingActivity.m244035a(false);
            return true;
        } else if (!C60773o.m236120a(activity)) {
            return false;
        } else {
            if (C63791b.m250468b() && Build.VERSION.SDK_INT >= 29) {
                return !m240978a("com.ss.android.vc");
            }
            if (kVar != null && kVar.aE().mo208293c()) {
                return true;
            }
            Activity c = VCAppLifeCycle.m236256c();
            if (c == null || c.getClass().getName().startsWith("com.ss.android.vc") || VideoChatModule.getDependency().isPhotoPickActivity(c)) {
                return false;
            }
            return true;
        }
    }
}
