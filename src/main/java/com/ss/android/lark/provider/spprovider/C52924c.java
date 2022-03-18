package com.ss.android.lark.provider.spprovider;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sp.AbstractC54924a;
import java.util.Map;

/* renamed from: com.ss.android.lark.provider.spprovider.c */
class C52924c {

    /* renamed from: a */
    private static AbstractC54924a f130775a;

    /* renamed from: a */
    static void m204890a() {
        m204898c().cleanSharedPreference();
    }

    /* renamed from: c */
    private static AbstractC54924a m204898c() {
        if (f130775a == null) {
            f130775a = C52923b.m204883a();
        }
        return f130775a;
    }

    /* renamed from: b */
    static Map<String, ?> m204895b() {
        return m204898c().getAll();
    }

    /* renamed from: b */
    static void m204896b(String str) {
        AbstractC54924a c = m204898c();
        if (c != null) {
            c.remove(str);
        }
    }

    /* renamed from: a */
    static boolean m204892a(String str) {
        AbstractC54924a c = m204898c();
        if (c == null) {
            return false;
        }
        return c.contains(str);
    }

    /* renamed from: a */
    static float m204886a(String str, float f) {
        AbstractC54924a c = m204898c();
        if (c == null) {
            return f;
        }
        return c.getFloat(str, f);
    }

    /* renamed from: b */
    public static String m204894b(String str, String str2) {
        AbstractC54924a c = m204898c();
        if (c == null) {
            return str2;
        }
        return c.getString(str, str2);
    }

    /* renamed from: a */
    static int m204887a(String str, int i) {
        AbstractC54924a c = m204898c();
        if (c == null) {
            return i;
        }
        return c.getInt(str);
    }

    /* renamed from: a */
    static long m204888a(String str, long j) {
        AbstractC54924a c = m204898c();
        if (c == null) {
            return j;
        }
        return c.getLong(str);
    }

    /* renamed from: a */
    static String m204889a(String str, String str2) {
        Object c = m204899c(str, str2);
        return c + "";
    }

    /* renamed from: c */
    private static Object m204899c(String str, String str2) {
        if (!m204892a(str)) {
            return null;
        }
        if (str2.equalsIgnoreCase("string")) {
            return m204894b(str, null);
        }
        if (str2.equalsIgnoreCase("boolean")) {
            return Boolean.valueOf(m204893a(str, false));
        }
        if (str2.equalsIgnoreCase("int")) {
            return Integer.valueOf(m204887a(str, 0));
        }
        if (str2.equalsIgnoreCase("long")) {
            return Long.valueOf(m204888a(str, 0L));
        }
        if (str2.equalsIgnoreCase("float")) {
            return Float.valueOf(m204886a(str, (float) BitmapDescriptorFactory.HUE_RED));
        }
        if (str2.equalsIgnoreCase("string_set")) {
            return m204894b(str, null);
        }
        return null;
    }

    /* renamed from: a */
    static boolean m204893a(String str, boolean z) {
        AbstractC54924a c = m204898c();
        if (c == null) {
            return z;
        }
        return c.getBoolean(str, z);
    }

    /* renamed from: b */
    private static <T> void m204897b(String str, String str2, T t) {
        Log.m165383e("SPHelperImpl", "save error name = " + str + ", type = " + str2 + ", t = " + ((Object) t));
    }

    /* renamed from: a */
    static synchronized <T> void m204891a(String str, String str2, T t) {
        synchronized (C52924c.class) {
            AbstractC54924a c = m204898c();
            if (c != null) {
                if (str2 == null) {
                    m204897b(str, str2, t);
                    return;
                }
                char c2 = 65535;
                switch (str2.hashCode()) {
                    case -891985903:
                        if (str2.equals("string")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 104431:
                        if (str2.equals("int")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 3327612:
                        if (str2.equals("long")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 64711720:
                        if (str2.equals("boolean")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 97526364:
                        if (str2.equals("float")) {
                            c2 = 4;
                            break;
                        }
                        break;
                }
                if (c2 != 0) {
                    if (c2 != 1) {
                        if (c2 != 2) {
                            if (c2 != 3) {
                                if (c2 == 4) {
                                    if (t instanceof Float) {
                                        c.putFloat(str, t.floatValue());
                                    } else {
                                        m204897b(str, str2, t);
                                    }
                                }
                            } else if (t instanceof Long) {
                                c.putLong(str, t.longValue());
                            } else {
                                m204897b(str, str2, t);
                            }
                        } else if (t instanceof Integer) {
                            c.putInt(str, t.intValue());
                        } else {
                            m204897b(str, str2, t);
                        }
                    } else if (t == null) {
                        c.putString(str, null);
                    } else if (t instanceof String) {
                        c.putString(str, t);
                    } else {
                        m204897b(str, str2, t);
                    }
                } else if (t instanceof Boolean) {
                    c.putBoolean(str, t.booleanValue());
                } else {
                    m204897b(str, str2, t);
                }
            }
        }
    }
}
