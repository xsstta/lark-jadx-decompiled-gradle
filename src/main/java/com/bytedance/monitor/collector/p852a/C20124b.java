package com.bytedance.monitor.collector.p852a;

import android.os.Message;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.monitor.collector.a.b */
public class C20124b {

    /* renamed from: a */
    private static Set<Integer> f49112a;

    static {
        HashSet hashSet = new HashSet();
        f49112a = hashSet;
        hashSet.add(Integer.valueOf((int) SmEvents.EVENT_TO));
        f49112a.add(115);
        f49112a.add(Integer.valueOf((int) SmEvents.EVENT_RS));
        f49112a.add(Integer.valueOf((int) SmActions.ACTION_INIT_ENTRY));
        f49112a.add(Integer.valueOf((int) SmActions.ACTION_INIT_EXIT));
        f49112a.add(Integer.valueOf((int) SmActions.ACTION_CALLING_ENTRY));
    }

    /* renamed from: a */
    public static boolean m73450a(Message message) {
        return f49112a.contains(Integer.valueOf(message.what));
    }
}
