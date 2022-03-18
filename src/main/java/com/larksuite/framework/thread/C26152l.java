package com.larksuite.framework.thread;

import java.lang.reflect.Field;
import java.util.concurrent.FutureTask;

/* renamed from: com.larksuite.framework.thread.l */
class C26152l {

    /* renamed from: a */
    private static String f64587a = "callable";

    /* renamed from: b */
    private static String f64588b = "task";

    /* renamed from: c */
    private static volatile Field f64589c;

    /* renamed from: d */
    private static volatile Field f64590d;

    C26152l() {
    }

    /* renamed from: a */
    static boolean m94638a(Object obj) {
        return obj instanceof FutureTask;
    }

    /* renamed from: d */
    static boolean m94641d(Object obj) {
        return "java.util.concurrent.Executors$RunnableAdapter".equals(obj.getClass().getName());
    }

    /* renamed from: b */
    static Object m94639b(Object obj) {
        try {
            if (f64589c == null) {
                synchronized (C26152l.class) {
                    if (f64589c == null) {
                        f64589c = obj.getClass().getDeclaredField(f64587a);
                        f64589c.setAccessible(true);
                    }
                }
            }
            return f64589c.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    static Object m94642e(Object obj) {
        try {
            if (f64590d == null) {
                synchronized (C26152l.class) {
                    if (f64590d == null) {
                        f64590d = obj.getClass().getDeclaredField(f64588b);
                        f64590d.setAccessible(true);
                    }
                }
            }
            return f64590d.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m94637a(Class cls) {
        String name = cls.getName();
        if ("java.lang.Integer".equals(name) || "java.lang.Boolean".equals(name) || "java.lang.Long".equals(name) || "java.lang.Float".equals(name) || "java.lang.Double".equals(name) || "java.lang.String".equals(name) || "sun.misc.Unsafe".equals(name) || "bolts.TaskCompletionSource".equals(name) || "java.util.ArrayList".equals(name) || name.contains("android.os.Handler") || name.contains("com.bytedance.common.utility.collection.WeakHandler") || name.contains("java.util.concurrent.Executors$RunnableAdapter") || name.contains("bolts.Task") || cls.isPrimitive()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    static String m94640c(Object obj) {
        Object e;
        Object b;
        if (m94638a(obj) && (b = m94639b(obj)) != null) {
            obj = b;
        }
        if (m94641d(obj) && (e = m94642e(obj)) != null) {
            obj = e;
        }
        StringBuilder sb = new StringBuilder();
        if (!m94637a((Class) obj.getClass())) {
            String obj2 = obj.toString();
            int indexOf = obj2.indexOf("@");
            if (indexOf > 0) {
                obj2 = obj2.substring(0, indexOf);
            }
            sb.append(obj2);
        }
        String sb2 = sb.toString();
        try {
            return sb2.replaceAll("class ", "");
        } catch (Exception unused) {
            return sb2;
        }
    }
}
