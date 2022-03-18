package com.bytedance.platform.horae.p874a.p875a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.platform.horae.common.C20370a;
import com.bytedance.platform.horae.common.Logger;
import com.bytedance.platform.horae.p874a.C20345a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.platform.horae.a.a.a */
public class C20346a {

    /* renamed from: a */
    private static Set<Integer> f49647a = new HashSet();

    /* renamed from: b */
    private static Set<Integer> f49648b = new HashSet();

    /* renamed from: c */
    private static final Object f49649c = new Object();

    /* renamed from: d */
    private static Set<String> f49650d;

    /* renamed from: e */
    private static final Set<String> f49651e = new HashSet();

    /* renamed from: f */
    private static final Object f49652f = new Object();

    static {
        Set<Integer> set = f49647a;
        Integer valueOf = Integer.valueOf((int) SmEvents.EVENT_RE);
        set.add(valueOf);
        Set<Integer> set2 = f49647a;
        Integer valueOf2 = Integer.valueOf((int) SmEvents.EVENT_TO);
        set2.add(valueOf2);
        f49647a.add(115);
        Set<Integer> set3 = f49647a;
        Integer valueOf3 = Integer.valueOf((int) SmEvents.EVENT_RS);
        set3.add(valueOf3);
        Set<Integer> set4 = f49647a;
        Integer valueOf4 = Integer.valueOf((int) SmActions.ACTION_INIT_ENTRY);
        set4.add(valueOf4);
        Set<Integer> set5 = f49647a;
        Integer valueOf5 = Integer.valueOf((int) SmActions.ACTION_INIT_EXIT);
        set5.add(valueOf5);
        Set<Integer> set6 = f49647a;
        Integer valueOf6 = Integer.valueOf((int) SmActions.ACTION_CALLING_ENTRY);
        set6.add(valueOf6);
        f49648b.add(140);
        f49648b.add(118);
        f49648b.add(valueOf);
        f49648b.add(valueOf2);
        f49648b.add(115);
        f49648b.add(valueOf3);
        f49648b.add(valueOf4);
        f49648b.add(valueOf5);
        f49648b.add(valueOf6);
    }

    /* renamed from: a */
    public static void m74157a(Set<String> set) {
        f49650d = set;
    }

    /* renamed from: c */
    public static boolean m74159c(Message message) {
        if (message.getTarget() != C20370a.m74214d()) {
            return false;
        }
        return f49648b.contains(Integer.valueOf(message.what));
    }

    /* renamed from: a */
    public static void m74156a(Message message) {
        if (message != null) {
            Logger.m74201a("MessageHandleUtils", "Success handle delay message " + message.what + "!");
            Handler handler = (Handler) C20370a.m74214d();
            synchronized (f49649c) {
                message.arg2 = 1000089;
                handler.dispatchMessage(message);
            }
        }
    }

    /* renamed from: b */
    public static boolean m74158b(Message message) {
        if (message.getTarget() == C20370a.m74214d() && f49647a.contains(Integer.valueOf(message.what)) && !m74160d(message)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m74160d(Message message) {
        if (message != null) {
            Set<String> set = f49650d;
            boolean z = false;
            if (set == null || set.isEmpty()) {
                return false;
            }
            C20345a a = C20345a.m74155a(message);
            synchronized (f49652f) {
                if (message.what == 114 && f49650d.contains(a.f49641a)) {
                    f49651e.add(a.f49642b);
                }
                if (f49650d.contains(a.f49641a) || f49651e.contains(a.f49642b)) {
                    z = true;
                }
            }
            return z;
        }
        throw new RuntimeException("Argument can not be null");
    }
}
