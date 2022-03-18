package com.bytedance.monitor.util;

import android.os.Message;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.monitor.util.a */
public class C20164a {

    /* renamed from: a */
    public static Object f49271a;

    /* renamed from: b */
    public static Class f49272b;

    /* renamed from: c */
    private static Class f49273c;

    /* renamed from: d */
    private static Field f49274d;

    /* renamed from: e */
    private static Object f49275e;

    /* renamed from: f */
    private static Set<Integer> f49276f;

    /* renamed from: a */
    public static synchronized Class m73584a() {
        Class cls;
        synchronized (C20164a.class) {
            if (f49273c == null) {
                try {
                    f49273c = Class.forName("android.app.ActivityThread");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
            cls = f49273c;
        }
        return cls;
    }

    /* renamed from: b */
    public static synchronized Field m73586b() {
        Field field;
        synchronized (C20164a.class) {
            if (f49274d == null) {
                f49274d = C20169b.m73603a((Class<?>) m73584a(), "mH");
            }
            field = f49274d;
        }
        return field;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.Object m73587c() {
        /*
            java.lang.Class<com.bytedance.monitor.util.a> r0 = com.bytedance.monitor.util.C20164a.class
            monitor-enter(r0)
            java.lang.Object r1 = com.bytedance.monitor.util.C20164a.f49271a     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            if (r1 != 0) goto L_0x0016
            java.lang.Class r1 = m73584a()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            java.lang.String r2 = "currentActivityThread"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            java.lang.Object r1 = com.bytedance.monitor.util.C20174e.m73630a(r1, r2, r3)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            com.bytedance.monitor.util.C20164a.f49271a = r1     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
        L_0x0016:
            java.lang.Object r1 = com.bytedance.monitor.util.C20164a.f49271a     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.monitor.util.C20164a.m73587c():java.lang.Object");
    }

    /* renamed from: d */
    public static synchronized Object m73588d() {
        Object obj;
        synchronized (C20164a.class) {
            if (f49275e == null) {
                try {
                    f49275e = m73586b().get(m73587c());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            obj = f49275e;
        }
        return obj;
    }

    static {
        HashSet hashSet = new HashSet();
        f49276f = hashSet;
        hashSet.add(Integer.valueOf((int) SmEvents.EVENT_RE));
        f49276f.add(Integer.valueOf((int) SmEvents.EVENT_TO));
        f49276f.add(115);
        f49276f.add(Integer.valueOf((int) SmEvents.EVENT_RS));
        f49276f.add(Integer.valueOf((int) SmActions.ACTION_INIT_ENTRY));
        f49276f.add(Integer.valueOf((int) SmActions.ACTION_INIT_EXIT));
        f49276f.add(100);
        f49276f.add(159);
        f49276f.add(Integer.valueOf((int) SmActions.ACTION_CALLING_ENTRY));
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0055 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m73589e() {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.monitor.util.C20164a.m73589e():java.lang.Object");
    }

    /* renamed from: a */
    public static boolean m73585a(Message message) {
        if (message != null && f49276f.contains(Integer.valueOf(message.what))) {
            return true;
        }
        return false;
    }
}
