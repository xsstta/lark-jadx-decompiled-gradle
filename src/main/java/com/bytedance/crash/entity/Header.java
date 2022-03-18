package com.bytedance.crash.entity;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.runtime.C3873q;
import com.bytedance.crash.util.C3927aa;
import com.bytedance.crash.util.C3942g;
import com.bytedance.crash.util.C3953o;
import com.bytedance.crash.util.C3955q;
import com.bytedance.crash.util.C3966w;
import com.bytedance.crash.util.C3968x;
import com.bytedance.crash.util.NativeTools;
import com.huawei.hms.adapter.internal.CommonCode;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

public final class Header {

    /* renamed from: a */
    private static final String[] f11523a = {"version_code", "manifest_version_code", "aid", "update_version_code"};

    /* renamed from: d */
    private static String f11524d;

    /* renamed from: e */
    private static int f11525e = -1;

    /* renamed from: f */
    private static int f11526f = -1;

    /* renamed from: b */
    private final Context f11527b;

    /* renamed from: c */
    private final JSONObject f11528c = new JSONObject();

    /* renamed from: j */
    private static void m15415j(JSONObject jSONObject) {
    }

    /* renamed from: f */
    public JSONObject mo15227f() {
        return this.f11528c;
    }

    /* renamed from: d */
    public void mo15225d() {
        mo15222a((String) null);
    }

    /* renamed from: e */
    public void mo15226e() {
        mo15221a(0);
    }

    /* renamed from: c */
    public JSONObject mo15224c() {
        return mo15220a(C3774m.m15591a().mo15456a());
    }

    /* renamed from: a */
    public static boolean m15401a() {
        if (f11525e == -1) {
            f11525e = m15410g().contains("64") ? 1 : 0;
        }
        if (f11525e == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static String m15412h() {
        String str = Build.VERSION.RELEASE;
        if (str.contains(".")) {
            return str;
        }
        return str + ".0";
    }

    /* renamed from: b */
    public static boolean m15404b() {
        if (f11526f == -1) {
            f11526f = m15410g().contains("86") ? 1 : 0;
        }
        if (f11526f == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static String m15410g() {
        if (f11524d == null) {
            try {
                StringBuilder sb = new StringBuilder();
                if (Build.VERSION.SDK_INT < 21 || Build.SUPPORTED_ABIS.length <= 0) {
                    sb = new StringBuilder(Build.CPU_ABI);
                } else {
                    for (int i = 0; i < Build.SUPPORTED_ABIS.length; i++) {
                        sb.append(Build.SUPPORTED_ABIS[i]);
                        if (i != Build.SUPPORTED_ABIS.length - 1) {
                            sb.append(", ");
                        }
                    }
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    f11524d = "unknown";
                }
                f11524d = sb.toString();
            } catch (Exception e) {
                C3968x.m16537b((Throwable) e);
                f11524d = "unknown";
            }
        }
        return f11524d;
    }

    /* renamed from: a */
    public static void m15400a(Header header) {
        addRuntimeHeader(header.mo15227f());
    }

    public static void addRuntimeHeader(JSONObject jSONObject) {
        m15414i(jSONObject);
        m15415j(jSONObject);
    }

    /* renamed from: b */
    public static boolean m15405b(JSONObject jSONObject) {
        return jSONObject.has("params_err");
    }

    public Header(Context context) {
        this.f11527b = context;
    }

    /* renamed from: a */
    public static Header m15398a(Context context) {
        Header header = new Header(context);
        header.m15408e(header.mo15227f());
        return header;
    }

    /* renamed from: b */
    public static void m15403b(Header header) {
        if (header != null) {
            addOtherHeader(header.mo15227f());
        }
    }

    /* renamed from: b */
    public static Header m15402b(Context context) {
        Header a = m15398a(context);
        m15400a(a);
        m15403b(a);
        a.mo15224c();
        a.mo15225d();
        a.mo15226e();
        return a;
    }

    /* renamed from: d */
    public static boolean m15407d(JSONObject jSONObject) {
        if (C3955q.m16453a(jSONObject)) {
            return true;
        }
        String optString = jSONObject.optString("aid");
        if (TextUtils.isEmpty(optString)) {
            return true;
        }
        try {
            if (Integer.parseInt(optString) <= 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: e */
    private void m15408e(JSONObject jSONObject) {
        try {
            jSONObject.put("sdk_version", 30106103);
            jSONObject.put("sdk_version_name", "3.1.6-rc.53-lark.oversea");
            jSONObject.put("bytrace_id", C3774m.m15608i());
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    private static void m15411g(JSONObject jSONObject) {
        try {
            int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put("timezone", rawOffset);
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    private static void m15414i(JSONObject jSONObject) {
        try {
            jSONObject.put("access", C3966w.m16526a(C3774m.m15609j()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static boolean m15406c(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0 || ((jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo15221a(long j) {
        try {
            long g = C3774m.m15591a().mo15462g();
            if (g > 0) {
                this.f11528c.put("user_id", g);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    private static void m15409f(JSONObject jSONObject) {
        String str;
        try {
            DisplayMetrics displayMetrics = C3774m.m15609j().getResources().getDisplayMetrics();
            int i = displayMetrics.densityDpi;
            if (i == 120) {
                str = "ldpi";
            } else if (i == 240) {
                str = "hdpi";
            } else if (i != 320) {
                str = "mdpi";
            } else {
                str = "xhdpi";
            }
            jSONObject.put("density_dpi", i);
            jSONObject.put("display_density", str);
            jSONObject.put(CommonCode.MapKey.HAS_RESOLUTION, displayMetrics.heightPixels + "x" + displayMetrics.widthPixels);
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    private static void m15413h(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        try {
            if (C3942g.m16369c()) {
                sb.append("MIUI-");
            } else if (C3942g.m16370d()) {
                sb.append("FLYME-");
            } else {
                String a = C3942g.m16365a();
                if (C3942g.m16366a(a)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(a)) {
                    sb.append(a);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
            if (sb.length() > 0) {
                jSONObject.put("rom", sb.toString());
            }
            jSONObject.put("rom_version", C3927aa.m16278a());
        } catch (Throwable unused) {
        }
    }

    public static void addOtherHeader(JSONObject jSONObject) {
        Object obj;
        int i;
        if (jSONObject != null) {
            m15413h(jSONObject);
            m15409f(jSONObject);
            m15411g(jSONObject);
            try {
                jSONObject.put("os", "Android");
                if (NativeTools.m16236b().mo15613e()) {
                    obj = "64";
                } else {
                    obj = "32";
                }
                jSONObject.put("verify_info", obj);
                jSONObject.put("device_id", C3774m.m15603d().mo15504a());
                jSONObject.put("os_version", m15412h());
                jSONObject.put("os_api", Build.VERSION.SDK_INT);
                String str = Build.MODEL;
                String str2 = Build.BRAND;
                if (str == null) {
                    str = str2;
                } else if (str2 != null && !str.contains(str2)) {
                    str = str2 + ' ' + str;
                }
                jSONObject.put("device_model", str);
                jSONObject.put("device_brand", Build.BRAND);
                jSONObject.put("device_manufacturer", Build.MANUFACTURER);
                jSONObject.put("cpu_abi", m15410g());
                jSONObject.put("cpu_model", C3953o.m16434a());
                jSONObject.put("hardware", Build.HARDWARE);
                jSONObject.put("kernel_version", C3953o.m16435b());
                Context j = C3774m.m15609j();
                String packageName = j.getPackageName();
                jSONObject.put("package", packageName);
                PackageInfo packageInfo = j.getPackageManager().getPackageInfo(packageName, 0);
                if (packageInfo.applicationInfo != null && (i = packageInfo.applicationInfo.labelRes) > 0) {
                    jSONObject.put("display_name", j.getString(i));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            C3746e.m15485a(jSONObject);
        }
    }

    /* renamed from: a */
    public JSONObject mo15220a(Map<String, Object> map) {
        if (map == null) {
            try {
                return this.f11528c;
            } catch (Throwable unused) {
            }
        } else {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (!this.f11528c.has(entry.getKey())) {
                    this.f11528c.put(entry.getKey(), entry.getValue());
                }
            }
            String[] strArr = f11523a;
            for (String str : strArr) {
                if (map.containsKey(str)) {
                    try {
                        this.f11528c.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                    } catch (Throwable unused2) {
                        this.f11528c.put(str, map.get(str));
                    }
                }
            }
            if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
                try {
                    this.f11528c.put("manifest_version_code", Integer.parseInt(String.valueOf(map.get("version_code"))));
                } catch (Throwable unused3) {
                }
            }
            if (map.containsKey("version_name")) {
                this.f11528c.put("app_version", map.get("version_name"));
                this.f11528c.remove("version_name");
            }
            this.f11528c.put("version_get_time", 0);
            return this.f11528c;
        }
    }

    /* renamed from: a */
    public void mo15222a(String str) {
        try {
            this.f11528c.put("device_id", C3774m.m15603d().mo15504a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo15223a(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C3955q.m16447a(this.f11528c, next, jSONObject.opt(next));
            }
        }
    }

    /* renamed from: a */
    public static C3742b m15399a(String str, Context context, long j, long j2) {
        Header header;
        C3742b bVar;
        C3873q a = C3873q.m16033a();
        if (j2 == 0) {
            j2 = System.currentTimeMillis();
        }
        JSONObject a2 = a.mo15489a(str, j, j2);
        if (a2 == null || a2.length() == 0) {
            C3742b bVar2 = new C3742b();
            header = m15398a(context);
            header.mo15224c();
            try {
                header.mo15227f().put("version_get_time", System.currentTimeMillis());
            } catch (Throwable unused) {
            }
            bVar = bVar2;
        } else {
            bVar = new C3742b(a2);
            header = new Header(C3774m.m15609j());
            header.mo15223a(a2.optJSONObject("header"));
        }
        header.mo15225d();
        m15403b(header);
        bVar.mo15231a(header);
        return bVar;
    }
}
