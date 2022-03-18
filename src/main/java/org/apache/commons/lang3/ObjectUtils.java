package org.apache.commons.lang3;

import java.io.Serializable;

public class ObjectUtils {

    /* renamed from: a */
    public static final Null f174611a = new Null();

    /* renamed from: a */
    public static <T> T m268051a(T t, T t2) {
        return t != null ? t : t2;
    }

    public static class Null implements Serializable {
        private static final long serialVersionUID = 7092611880189329093L;

        Null() {
        }

        private Object readResolve() {
            return ObjectUtils.f174611a;
        }
    }

    /* renamed from: a */
    public static String m268052a(Object obj) {
        if (obj == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m268054a(sb, obj);
        return sb.toString();
    }

    /* renamed from: c */
    public static boolean m268056c(Object obj, Object obj2) {
        return !m268055b(obj, obj2);
    }

    /* renamed from: b */
    public static boolean m268055b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static void m268053a(StringBuffer stringBuffer, Object obj) {
        C69882g.m268177a(obj, "Cannot get the toString of a null identity", new Object[0]);
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append('@');
        stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    /* renamed from: a */
    public static void m268054a(StringBuilder sb, Object obj) {
        C69882g.m268177a(obj, "Cannot get the toString of a null identity", new Object[0]);
        sb.append(obj.getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
