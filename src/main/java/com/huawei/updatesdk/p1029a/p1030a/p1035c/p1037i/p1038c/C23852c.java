package com.huawei.updatesdk.p1029a.p1030a.p1035c.p1037i.p1038c;

import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.huawei.updatesdk.a.a.c.i.c.c */
public class C23852c implements AbstractC23849a {

    /* renamed from: a */
    private static final Object f59072a = new Object();

    /* renamed from: b */
    private static C23852c f59073b;

    /* renamed from: b */
    public static Object m87203b() {
        StringBuilder sb;
        String str;
        try {
            Class<?> cls = Class.forName("android.telephony.MSimTelephonyManager");
            return cls.getDeclaredMethod("getDefault", new Class[0]).invoke(cls, new Object[0]);
        } catch (NoSuchMethodException e) {
            sb = new StringBuilder();
            sb.append(" getDefaultMSimTelephonyManager wrong ");
            str = e.toString();
            sb.append(str);
            C23834a.m87118b("MutiCardHwImpl", sb.toString());
            return null;
        } catch (IllegalAccessException e2) {
            sb = new StringBuilder();
            sb.append(" getDefaultMSimTelephonyManager wrong ");
            str = e2.toString();
            sb.append(str);
            C23834a.m87118b("MutiCardHwImpl", sb.toString());
            return null;
        } catch (IllegalArgumentException e3) {
            sb = new StringBuilder();
            sb.append(" getDefaultMSimTelephonyManager wrong ");
            str = e3.toString();
            sb.append(str);
            C23834a.m87118b("MutiCardHwImpl", sb.toString());
            return null;
        } catch (InvocationTargetException e4) {
            sb = new StringBuilder();
            sb.append(" getDefaultMSimTelephonyManager wrong ");
            str = e4.toString();
            sb.append(str);
            C23834a.m87118b("MutiCardHwImpl", sb.toString());
            return null;
        } catch (ClassNotFoundException e5) {
            sb = new StringBuilder();
            sb.append(" getDefaultMSimTelephonyManager wrong ");
            str = e5.toString();
            sb.append(str);
            C23834a.m87118b("MutiCardHwImpl", sb.toString());
            return null;
        } catch (Exception e6) {
            sb = new StringBuilder();
            sb.append(" getDefaultMSimTelephonyManager wrong ");
            str = e6.toString();
            sb.append(str);
            C23834a.m87118b("MutiCardHwImpl", sb.toString());
            return null;
        }
    }

    /* renamed from: c */
    public static C23852c m87204c() {
        C23852c cVar;
        synchronized (f59072a) {
            if (f59073b == null) {
                f59073b = new C23852c();
            }
            cVar = f59073b;
        }
        return cVar;
    }

    @Override // com.huawei.updatesdk.p1029a.p1030a.p1035c.p1037i.p1038c.AbstractC23849a
    /* renamed from: a */
    public int mo85581a() {
        StringBuilder sb;
        String str;
        try {
            Object b = m87203b();
            if (b != null) {
                Object invoke = b.getClass().getMethod("getPreferredDataSubscription", new Class[0]).invoke(b, new Object[0]);
                if (invoke instanceof Integer) {
                    return ((Integer) invoke).intValue();
                }
            }
            return 0;
        } catch (NoSuchMethodException e) {
            sb = new StringBuilder();
            sb.append(" getPreferredDataSubscription wrong ");
            str = e.toString();
            sb.append(str);
            C23834a.m87118b("MutiCardHwImpl", sb.toString());
            return -1;
        } catch (IllegalAccessException e2) {
            sb = new StringBuilder();
            sb.append(" getPreferredDataSubscription wrong ");
            str = e2.toString();
            sb.append(str);
            C23834a.m87118b("MutiCardHwImpl", sb.toString());
            return -1;
        } catch (InvocationTargetException e3) {
            sb = new StringBuilder();
            sb.append(" getPreferredDataSubscription wrong ");
            str = e3.toString();
            sb.append(str);
            C23834a.m87118b("MutiCardHwImpl", sb.toString());
            return -1;
        }
    }
}
