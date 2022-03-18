package com.bytedance.push.utils;

import android.os.Build;
import com.bytedance.common.utility.StringUtils;
import com.ss.android.common.p1317a.C28446a;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.utils.e */
public class C20554e {

    /* renamed from: a */
    private static final String f50122a;

    /* renamed from: b */
    private static final C20558h f50123b = new C20558h();

    /* renamed from: c */
    private static String f50124c;

    /* renamed from: d */
    private static String f50125d;

    /* renamed from: e */
    private static String f50126e;

    /* renamed from: f */
    private static boolean f50127f;

    /* renamed from: g */
    private static boolean f50128g;

    /* renamed from: h */
    private static final JSONObject f50129h = new JSONObject();

    /* renamed from: a */
    public static String m74855a() {
        return f50124c;
    }

    /* renamed from: b */
    public static boolean m74857b() {
        if (!C28446a.m104267a()) {
            return false;
        }
        try {
            if (Integer.parseInt(m74856a("ro.miui.ui.version.name").substring(1)) >= 12) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m74859d() {
        synchronized (f50129h) {
            if (!f50127f) {
                m74867l();
            }
        }
        return f50128g;
    }

    /* renamed from: g */
    private static boolean m74862g() {
        String str = Build.MANUFACTURER;
        if (!StringUtils.isEmpty(str)) {
            return str.toLowerCase().contains("oppo");
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m74864i() {
        String a = m74856a("ro.vivo.os.build.display.id");
        if (StringUtils.isEmpty(a) || !a.toLowerCase().contains("funtouch")) {
            return false;
        }
        return true;
    }

    static {
        String str;
        String valueOf = String.valueOf(Build.VERSION.SDK);
        f50122a = valueOf;
        f50124c = valueOf;
        try {
            str = m74861f();
        } catch (Throwable th) {
            th.printStackTrace();
            str = null;
        }
        if (StringUtils.isEmpty(str)) {
            str = f50122a;
        }
        f50124c = str;
    }

    /* renamed from: c */
    public static boolean m74858c() {
        try {
            String a = m74856a("ro.build.version.emui");
            f50125d = a;
            if (StringUtils.isEmpty(a) || !f50125d.toLowerCase().startsWith("magic")) {
                return false;
            }
            f50126e = f50125d.toLowerCase();
            return true;
        } catch (Exception e) {
            C20552c.m74849b(e.getMessage());
            return false;
        }
    }

    /* renamed from: e */
    public static String m74860e() {
        JSONObject jSONObject = f50129h;
        synchronized (jSONObject) {
            if (!f50127f) {
                m74867l();
            }
            if (!jSONObject.keys().hasNext()) {
                return "";
            }
            return jSONObject.toString();
        }
    }

    /* renamed from: f */
    private static String m74861f() {
        if (m74868m()) {
            return m74870o();
        }
        if (m74858c()) {
            return m74869n();
        }
        if (m74864i()) {
            return m74865j();
        }
        if (m74862g()) {
            return m74863h();
        }
        if (C28446a.m104267a()) {
            return m74866k();
        }
        return f50122a;
    }

    /* renamed from: h */
    private static String m74863h() {
        if (!m74862g()) {
            return f50122a;
        }
        return ("coloros_" + m74856a("ro.build.version.opporom") + "_" + Build.DISPLAY).toLowerCase();
    }

    /* renamed from: j */
    private static String m74865j() {
        return (m74856a("ro.vivo.os.build.display.id") + "_" + m74856a("ro.vivo.product.version")).toLowerCase();
    }

    /* renamed from: k */
    private static String m74866k() {
        return ("miui_" + m74856a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL).toLowerCase();
    }

    /* renamed from: l */
    private static void m74867l() {
        if (!f50127f) {
            f50128g = false;
            try {
                Class<?> cls = Class.forName("ohos.system.version.SystemVersion");
                f50128g = true;
                Method[] declaredMethods = cls.getDeclaredMethods();
                for (Method method : declaredMethods) {
                    method.setAccessible(true);
                    Object invoke = method.invoke(null, new Object[0]);
                    if (invoke != null) {
                        f50129h.put(method.getName(), invoke);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            f50127f = true;
        }
    }

    /* renamed from: m */
    private static boolean m74868m() {
        try {
            String a = m74856a("ro.build.version.emui");
            f50125d = a;
            boolean isEmpty = StringUtils.isEmpty(a);
            if (!isEmpty) {
                if (f50125d.toLowerCase().startsWith("magic")) {
                    f50126e = f50125d.toLowerCase();
                    return false;
                }
                f50125d = f50125d.toLowerCase();
            }
            return !isEmpty;
        } catch (Exception e) {
            C20552c.m74849b(e.getMessage());
            return false;
        }
    }

    /* renamed from: n */
    private static String m74869n() {
        if (StringUtils.isEmpty(f50126e)) {
            f50126e = m74856a("ro.build.version.emui");
        }
        String lowerCase = (f50126e + "_" + Build.DISPLAY).toLowerCase();
        if (!StringUtils.isEmpty(lowerCase)) {
            return lowerCase.toLowerCase();
        }
        return f50122a;
    }

    /* renamed from: o */
    private static String m74870o() {
        if (StringUtils.isEmpty(f50125d)) {
            f50125d = m74856a("ro.build.version.emui");
        }
        String lowerCase = (f50125d + "_" + Build.DISPLAY).toLowerCase();
        if (!StringUtils.isEmpty(lowerCase)) {
            return lowerCase.toLowerCase();
        }
        return f50122a;
    }

    /* renamed from: a */
    private static String m74856a(String str) {
        return f50123b.mo69199a(str);
    }
}
