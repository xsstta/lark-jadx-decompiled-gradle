package com.bytedance.lynx.webview.util;

import com.bytedance.lynx.webview.internal.AbstractC19937a;
import com.bytedance.lynx.webview.internal.AppInfo;
import com.bytedance.lynx.webview.internal.C19938b;
import com.bytedance.lynx.webview.internal.C19958i;
import com.bytedance.lynx.webview.internal.C19984r;
import com.bytedance.lynx.webview.internal.C20011y;
import com.bytedance.lynx.webview.internal.DownloadEventType;
import com.bytedance.lynx.webview.internal.LoadEventType;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.bytedance.lynx.webview.util.a */
public class C20026a {

    /* renamed from: a */
    public static StringBuffer f48948a = new StringBuffer();

    /* renamed from: b */
    public static boolean f48949b;

    /* renamed from: c */
    public static boolean f48950c;

    /* renamed from: d */
    private static StringBuffer f48951d;

    /* renamed from: a */
    public static void m73078a(int i) {
    }

    /* renamed from: a */
    public static void m73079a(DownloadEventType downloadEventType) {
    }

    /* renamed from: b */
    public static String m73081b() {
        return "";
    }

    /* renamed from: c */
    public static void m73084c(String str) {
    }

    /* renamed from: c */
    public static String m73083c() {
        return f48948a.toString();
    }

    /* renamed from: d */
    public static void m73085d() {
        f48948a.setLength(0);
    }

    /* renamed from: a */
    public static void m73077a() {
        C20011y.m73001d(new Runnable() {
            /* class com.bytedance.lynx.webview.util.C20026a.RunnableC200271 */

            public void run() {
                AppInfo b;
                if (C20051j.m73195a(C20011y.m72976a().mo67938u())) {
                    C19984r v = C20011y.m72976a().mo67939v();
                    try {
                        if (!C20026a.f48949b) {
                            C20026a.f48949b = true;
                            int j = v.mo67841j();
                            AbstractC19937a l = C20011y.m73014l();
                            if (!(l == null || (b = l.mo67715b()) == null)) {
                                String updateVersionCode = b.getUpdateVersionCode();
                                if (!updateVersionCode.isEmpty() && v.mo67829d(updateVersionCode)) {
                                    C20026a.f48950c = true;
                                }
                            }
                            if (!C20026a.f48950c) {
                                if (v.mo67843k() != 0) {
                                    v.mo67824c(v.mo67843k() + 1);
                                    v.mo67819b(j + 1);
                                }
                            }
                            v.mo67824c(1);
                            v.mo67819b(j + 1);
                        }
                    } catch (Exception e) {
                        C19938b.m72701a("sendCommonEvent:" + e.toString());
                    }
                }
            }
        });
    }

    /* renamed from: e */
    public static void m73086e() {
        C20011y.m73001d(new Runnable() {
            /* class com.bytedance.lynx.webview.util.C20026a.RunnableC200293 */

            public void run() {
                try {
                    C20011y.m72976a().mo67939v().mo67836g("");
                } catch (Exception e) {
                    C20048g.m73164d("onConfigLoaded", e.toString());
                }
            }
        });
    }

    /* renamed from: g */
    public static String m73088g() {
        StringBuffer stringBuffer = f48951d;
        if (stringBuffer == null) {
            return "";
        }
        return stringBuffer.toString();
    }

    /* renamed from: i */
    private static String m73090i() {
        int l = C19958i.m72806l();
        if (l == 0) {
            return " and get contentlock failed";
        }
        if (l == 1) {
            return " and get setting cross process";
        }
        if (l != 2) {
            return null;
        }
        return " and get setting in self-process";
    }

    /* renamed from: h */
    private static String m73089h() {
        int m = C20011y.m72976a().mo67939v().mo67846m();
        if (m == -1) {
            return " and not get setting";
        }
        if (m != 0) {
            if (m != 1) {
                return null;
            }
            return "";
        } else if (f48950c) {
            return " and setting-switch is off from PreVersion";
        } else {
            return " and setting-switch is off";
        }
    }

    /* renamed from: f */
    public static JSONObject m73087f() {
        JSONObject jSONObject = new JSONObject();
        StringBuffer stringBuffer = f48951d;
        if (stringBuffer == null) {
            return jSONObject;
        }
        String[] split = stringBuffer.toString().split("#");
        try {
            jSONObject.put("download_times", split.length);
            int i = 0;
            for (int i2 = 0; i2 < split.length; i2++) {
                if (split[i2] != null && !split[i2].equals("")) {
                    for (int i3 = 0; i3 < split[i2].length(); i3++) {
                        if (split[i2].charAt(i3) > '9' || split[i2].charAt(i3) < '0') {
                            jSONObject.put("segNum", 0);
                            return jSONObject;
                        }
                    }
                    i += Integer.parseInt(split[i2]);
                }
            }
            jSONObject.put("segNum", i);
        } catch (Exception e) {
            C19938b.m72701a("sendCommonEvent:" + e.toString());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m73080a(final LoadEventType loadEventType) {
        C20011y.m73001d(new Runnable() {
            /* class com.bytedance.lynx.webview.util.C20026a.RunnableC200282 */

            public void run() {
                StringBuffer stringBuffer = C20026a.f48948a;
                stringBuffer.append(loadEventType.getStatusCode() + "-");
            }
        });
    }

    /* renamed from: a */
    public static String m73076a(String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        try {
            String[] split = str.split("-");
            for (String str2 : split) {
                if (str2 != null && !str2.equals("")) {
                    for (int i2 = 0; i2 < str2.length(); i2++) {
                        if (str2.charAt(i2) <= '9') {
                            if (str2.charAt(i2) >= '0') {
                            }
                        }
                        return "Failed";
                    }
                    arrayList.add(DownloadEventType.getDownloadEventType(Integer.parseInt(str2)));
                }
            }
        } catch (Exception e) {
            C19938b.m72701a("sendCommonEvent:" + e.toString());
        }
        if (arrayList.size() < 2) {
            return "Failed";
        }
        DownloadEventType downloadEventType = (DownloadEventType) arrayList.get(arrayList.size() - 1);
        DownloadEventType downloadEventType2 = (DownloadEventType) arrayList.get(arrayList.size() - 2);
        if (downloadEventType == null || downloadEventType2 == null) {
            return "Failed";
        }
        if (DownloadEventType.isSucessStatus(downloadEventType.name()) && DownloadEventType.isSucessStatus(downloadEventType2.name())) {
            return "Success";
        }
        if (downloadEventType == DownloadEventType.Prepare_download_end) {
            i = downloadEventType2.ordinal();
        } else {
            i = downloadEventType.ordinal();
        }
        try {
            return "Not reach " + DownloadEventType.getDownloadEventTypeByIndex(i + 1).name();
        } catch (NullPointerException e2) {
            C19938b.m72701a("sendCommonEvent:" + e2.toString());
            return null;
        }
    }

    /* renamed from: b */
    public static String m73082b(String str) {
        LoadEventType loadEventType;
        ArrayList arrayList = new ArrayList();
        try {
            String[] split = str.split("-");
            for (String str2 : split) {
                if (str2 != null && !str2.equals("")) {
                    for (int i = 0; i < str2.length(); i++) {
                        if (str2.charAt(i) <= '9') {
                            if (str2.charAt(i) >= '0') {
                            }
                        }
                        return "Failed";
                    }
                    arrayList.add(LoadEventType.getLoadEventType(Integer.parseInt(str2)));
                }
            }
        } catch (Exception e) {
            C19938b.m72701a("sendCommonEvent:" + e.toString());
        }
        if (arrayList.size() < 2 || (loadEventType = (LoadEventType) arrayList.get(arrayList.size() - 2)) == null) {
            return "Failed";
        }
        if (LoadEventType.isSucessStatus(loadEventType.name())) {
            return "Success";
        }
        int statusCode = loadEventType.getStatusCode();
        if (statusCode == LoadEventType.LoadPreCheck_first_download.getStatusCode() || statusCode == LoadEventType.LoadPreCheck_not_first_download.getStatusCode()) {
            try {
                return "so not exits and " + LoadEventType.getLoadEventType(statusCode).name();
            } catch (NullPointerException e2) {
                C19938b.m72701a("sendCommonEvent:" + e2.toString());
            }
        } else {
            try {
                String name = LoadEventType.getLoadEventTypeByIndex(loadEventType.ordinal() + 1).name();
                if (name.equals(LoadEventType.CheckSwitch_enable_ttwebview.name())) {
                    name = name + m73089h();
                }
                if (name.equals(LoadEventType.DoCrossProcessInitialization_load_ttwebview.name())) {
                    name = name + m73090i();
                }
                return "Not Pass " + name;
            } catch (NullPointerException e3) {
                C19938b.m72701a("sendCommonEvent:" + e3.toString());
                return null;
            }
        }
    }
}
