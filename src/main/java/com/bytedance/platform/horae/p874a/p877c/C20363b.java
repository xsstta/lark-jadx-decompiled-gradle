package com.bytedance.platform.horae.p874a.p877c;

import android.os.Handler;
import android.os.Message;
import com.bytedance.platform.horae.common.C20370a;
import com.bytedance.platform.horae.common.Logger;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.platform.horae.a.c.b */
public class C20363b {

    /* renamed from: a */
    private static Set<Integer> f49700a;

    static {
        HashSet hashSet = new HashSet();
        f49700a = hashSet;
        hashSet.add(Integer.valueOf((int) SmEvents.EVENT_RE));
        f49700a.add(Integer.valueOf((int) SmEvents.EVENT_TO));
        f49700a.add(115);
        f49700a.add(Integer.valueOf((int) SmEvents.EVENT_RS));
        f49700a.add(Integer.valueOf((int) SmActions.ACTION_INIT_ENTRY));
        f49700a.add(Integer.valueOf((int) SmActions.ACTION_INIT_EXIT));
        f49700a.add(Integer.valueOf((int) SmActions.ACTION_CALLING_ENTRY));
    }

    /* renamed from: b */
    public static boolean m74186b(Message message) {
        if (message.getTarget() != C20370a.m74214d()) {
            return false;
        }
        return f49700a.contains(Integer.valueOf(message.what));
    }

    /* renamed from: a */
    public static void m74185a(Message message) {
        if (message != null) {
            Logger.m74201a("MessageHandleUtils", "Success handle delay message " + message.what + "!");
            ((Handler) C20370a.m74214d()).dispatchMessage(message);
        }
    }
}
