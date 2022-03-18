package com.bytedance.platform.horae.common;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.platform.horae.common.a */
public class C20370a {

    /* renamed from: a */
    private static Class f49721a;

    /* renamed from: b */
    private static Field f49722b;

    /* renamed from: c */
    private static Object f49723c;

    /* renamed from: d */
    private static Object f49724d;

    /* renamed from: e */
    private static Set<Integer> f49725e;

    /* renamed from: a */
    public static synchronized Class m74211a() {
        Class cls;
        synchronized (C20370a.class) {
            if (f49721a == null) {
                try {
                    f49721a = Class.forName("android.app.ActivityThread");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
            cls = f49721a;
        }
        return cls;
    }

    /* renamed from: b */
    public static synchronized Field m74212b() {
        Field field;
        synchronized (C20370a.class) {
            if (f49722b == null) {
                f49722b = C20373d.m74219a(m74211a(), "mH");
            }
            field = f49722b;
        }
        return field;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.Object m74213c() {
        /*
            java.lang.Class<com.bytedance.platform.horae.common.a> r0 = com.bytedance.platform.horae.common.C20370a.class
            monitor-enter(r0)
            java.lang.Object r1 = com.bytedance.platform.horae.common.C20370a.f49723c     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            if (r1 != 0) goto L_0x0016
            java.lang.Class r1 = m74211a()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            java.lang.String r2 = "currentActivityThread"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            java.lang.Object r1 = com.bytedance.platform.horae.common.C20376g.m74226a(r1, r2, r3)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            com.bytedance.platform.horae.common.C20370a.f49723c = r1     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
        L_0x0016:
            java.lang.Object r1 = com.bytedance.platform.horae.common.C20370a.f49723c     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            monitor-exit(r0)
            return r1
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x001d:
            r1 = 0
            monitor-exit(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.platform.horae.common.C20370a.m74213c():java.lang.Object");
    }

    /* renamed from: d */
    public static synchronized Object m74214d() {
        Object obj;
        synchronized (C20370a.class) {
            if (f49724d == null) {
                try {
                    f49724d = m74212b().get(m74213c());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            obj = f49724d;
        }
        return obj;
    }

    static {
        HashSet hashSet = new HashSet();
        f49725e = hashSet;
        hashSet.add(Integer.valueOf((int) SmEvents.EVENT_RE));
        f49725e.add(Integer.valueOf((int) SmEvents.EVENT_TO));
        f49725e.add(115);
        f49725e.add(Integer.valueOf((int) SmEvents.EVENT_RS));
        f49725e.add(Integer.valueOf((int) SmActions.ACTION_INIT_ENTRY));
        f49725e.add(Integer.valueOf((int) SmActions.ACTION_INIT_EXIT));
        f49725e.add(100);
        f49725e.add(159);
        f49725e.add(Integer.valueOf((int) SmActions.ACTION_CALLING_ENTRY));
    }
}
