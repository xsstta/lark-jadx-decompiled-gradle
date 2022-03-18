package com.huawei.updatesdk.p1029a.p1030a.p1035c.p1037i.p1038c;

import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.p1037i.p1038c.AbstractC23849a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.huawei.updatesdk.a.a.c.i.c.b */
public class C23851b {

    /* renamed from: a */
    private static AbstractC23849a.EnumC23850a f59070a = AbstractC23849a.EnumC23850a.MODE_SUPPORT_UNKNOWN;

    /* renamed from: b */
    private static AbstractC23849a f59071b;

    /* renamed from: a */
    public static AbstractC23849a m87199a() {
        m87202d();
        f59071b = f59070a == AbstractC23849a.EnumC23850a.MODE_SUPPORT_MTK_GEMINI ? C23853d.m87207c() : C23852c.m87204c();
        return f59071b;
    }

    /* renamed from: b */
    public static boolean m87200b() {
        String str;
        StringBuilder sb;
        String str2;
        boolean z = false;
        try {
            Object b = C23852c.m87203b();
            if (b != null) {
                Object invoke = b.getClass().getMethod("isMultiSimEnabled", new Class[0]).invoke(b, new Object[0]);
                if (invoke instanceof Boolean) {
                    z = ((Boolean) invoke).booleanValue();
                }
            }
        } catch (NoSuchMethodException e) {
            str = "MSimTelephonyManager.getDefault().isMultiSimEnabled()?" + e.toString();
            C23834a.m87118b("mutiCardFactory", str);
            C23834a.m87116a("mutiCardFactory", "isHwGeminiSupport1 " + z);
            return z;
        } catch (IllegalAccessException e2) {
            sb = new StringBuilder();
            sb.append("MSimTelephonyManager.getDefault().isMultiSimEnabled()");
            str2 = e2.toString();
            sb.append(str2);
            str = sb.toString();
            C23834a.m87118b("mutiCardFactory", str);
            C23834a.m87116a("mutiCardFactory", "isHwGeminiSupport1 " + z);
            return z;
        } catch (InvocationTargetException e3) {
            sb = new StringBuilder();
            sb.append("MSimTelephonyManager.getDefault().isMultiSimEnabled()");
            str2 = e3.toString();
            sb.append(str2);
            str = sb.toString();
            C23834a.m87118b("mutiCardFactory", str);
            C23834a.m87116a("mutiCardFactory", "isHwGeminiSupport1 " + z);
            return z;
        }
        C23834a.m87116a("mutiCardFactory", "isHwGeminiSupport1 " + z);
        return z;
    }

    /* renamed from: c */
    private static boolean m87201c() {
        boolean z;
        StringBuilder sb;
        String str;
        try {
            Field declaredField = Class.forName("com.mediatek.common.featureoption.FeatureOption").getDeclaredField("MTK_GEMINI_SUPPORT");
            declaredField.setAccessible(true);
            z = declaredField.getBoolean(null);
        } catch (ClassNotFoundException e) {
            sb = new StringBuilder();
            sb.append("FeatureOption.MTK_GEMINI_SUPPORT");
            str = e.toString();
        } catch (NoSuchFieldException e2) {
            sb = new StringBuilder();
            sb.append("FeatureOption.MTK_GEMINI_SUPPORT");
            str = e2.toString();
        } catch (IllegalAccessException e3) {
            sb = new StringBuilder();
            sb.append("FeatureOption.MTK_GEMINI_SUPPORT");
            str = e3.toString();
        } catch (Exception e4) {
            sb = new StringBuilder();
            sb.append("FeatureOption.MTK_GEMINI_SUPPORT");
            str = e4.toString();
        }
        C23834a.m87116a("mutiCardFactory", "isMtkGeminiSupport " + z);
        return z;
        sb.append(str);
        C23834a.m87120d("mutiCardFactory", sb.toString());
        z = false;
        C23834a.m87116a("mutiCardFactory", "isMtkGeminiSupport " + z);
        return z;
    }

    /* renamed from: d */
    public static boolean m87202d() {
        AbstractC23849a.EnumC23850a aVar;
        if (f59070a == AbstractC23849a.EnumC23850a.MODE_SUPPORT_UNKNOWN) {
            if (m87201c()) {
                aVar = AbstractC23849a.EnumC23850a.MODE_SUPPORT_MTK_GEMINI;
            } else if (m87200b()) {
                aVar = AbstractC23849a.EnumC23850a.MODE_SUPPORT_HW_GEMINI;
            } else {
                f59070a = AbstractC23849a.EnumC23850a.MODE_NOT_SUPPORT_GEMINI;
            }
            f59070a = aVar;
            return true;
        } else if (f59070a == AbstractC23849a.EnumC23850a.MODE_SUPPORT_HW_GEMINI || f59070a == AbstractC23849a.EnumC23850a.MODE_SUPPORT_MTK_GEMINI) {
            return true;
        }
        return false;
    }
}
