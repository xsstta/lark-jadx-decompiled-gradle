package com.huawei.updatesdk.p1029a.p1030a.p1035c.p1037i.p1038c;

import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.huawei.updatesdk.a.a.c.i.c.d */
public final class C23853d implements AbstractC23849a {

    /* renamed from: a */
    private static final Object f59074a = new Object();

    /* renamed from: b */
    private static C23853d f59075b;

    private C23853d() {
    }

    /* renamed from: b */
    private static Object m87206b() {
        StringBuilder sb;
        String str;
        try {
            Class<?> cls = Class.forName("com.mediatek.telephony.TelephonyManagerEx");
            return cls.getDeclaredMethod("getDefault", new Class[0]).invoke(cls, new Object[0]);
        } catch (ClassNotFoundException e) {
            sb = new StringBuilder();
            sb.append(" getDefaultTelephonyManagerEx wrong ");
            str = e.toString();
            sb.append(str);
            C23834a.m87118b("mutiCardMTKImpl", sb.toString());
            return null;
        } catch (SecurityException e2) {
            sb = new StringBuilder();
            sb.append(" getDefaultTelephonyManagerEx wrong ");
            str = e2.toString();
            sb.append(str);
            C23834a.m87118b("mutiCardMTKImpl", sb.toString());
            return null;
        } catch (NoSuchMethodException e3) {
            sb = new StringBuilder();
            sb.append(" getDefaultTelephonyManagerEx wrong ");
            str = e3.toString();
            sb.append(str);
            C23834a.m87118b("mutiCardMTKImpl", sb.toString());
            return null;
        } catch (IllegalAccessException e4) {
            sb = new StringBuilder();
            sb.append(" getDefaultTelephonyManagerEx wrong ");
            str = e4.toString();
            sb.append(str);
            C23834a.m87118b("mutiCardMTKImpl", sb.toString());
            return null;
        } catch (IllegalArgumentException e5) {
            sb = new StringBuilder();
            sb.append(" getDefaultTelephonyManagerEx wrong ");
            str = e5.toString();
            sb.append(str);
            C23834a.m87118b("mutiCardMTKImpl", sb.toString());
            return null;
        } catch (InvocationTargetException e6) {
            sb = new StringBuilder();
            sb.append(" getDefaultTelephonyManagerEx wrong ");
            str = e6.toString();
            sb.append(str);
            C23834a.m87118b("mutiCardMTKImpl", sb.toString());
            return null;
        } catch (Exception e7) {
            sb = new StringBuilder();
            sb.append(" getDefaultTelephonyManagerEx wrong ");
            str = e7.toString();
            sb.append(str);
            C23834a.m87118b("mutiCardMTKImpl", sb.toString());
            return null;
        }
    }

    /* renamed from: c */
    public static C23853d m87207c() {
        C23853d dVar;
        synchronized (f59074a) {
            if (f59075b == null) {
                f59075b = new C23853d();
            }
            dVar = f59075b;
        }
        return dVar;
    }

    @Override // com.huawei.updatesdk.p1029a.p1030a.p1035c.p1037i.p1038c.AbstractC23849a
    /* renamed from: a */
    public int mo85581a() {
        StringBuilder sb;
        String str;
        Object b = m87206b();
        if (b != null) {
            try {
                Object invoke = b.getClass().getMethod("getPreferredDataSubscription", new Class[0]).invoke(b, new Object[0]);
                if (invoke instanceof Integer) {
                    return ((Integer) invoke).intValue();
                }
            } catch (NoSuchMethodException e) {
                sb = new StringBuilder();
                sb.append(" getPreferredDataSubscription wrong ");
                str = e.toString();
                sb.append(str);
                C23834a.m87118b("mutiCardMTKImpl", sb.toString());
                return -1;
            } catch (InvocationTargetException e2) {
                sb = new StringBuilder();
                sb.append(" getPreferredDataSubscription wrong ");
                str = e2.toString();
                sb.append(str);
                C23834a.m87118b("mutiCardMTKImpl", sb.toString());
                return -1;
            } catch (IllegalAccessException e3) {
                sb = new StringBuilder();
                sb.append(" getPreferredDataSubscription wrong ");
                str = e3.toString();
                sb.append(str);
                C23834a.m87118b("mutiCardMTKImpl", sb.toString());
                return -1;
            }
        }
        return 0;
    }
}
