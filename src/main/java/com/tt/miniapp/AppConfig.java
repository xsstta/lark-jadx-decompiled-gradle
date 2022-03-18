package com.tt.miniapp;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12798b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.manager.C66375a;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.refer.common.util.C67866g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppConfig {

    /* renamed from: x */
    private static final Map<String, List> f165493x = new HashMap<String, List>() {
        /* class com.tt.miniapp.AppConfig.C656841 */

        {
            put("tabBar", Arrays.asList("list"));
        }
    };

    /* renamed from: a */
    public C65688c f165494a;

    /* renamed from: b */
    public C65690e f165495b;

    /* renamed from: c */
    public C12798b f165496c;

    /* renamed from: d */
    public String f165497d;

    /* renamed from: e */
    public String f165498e;

    /* renamed from: f */
    public boolean f165499f = false;

    /* renamed from: g */
    public HashMap<String, String> f165500g = new HashMap<>();

    /* renamed from: h */
    public Set<AppInfoEntity> f165501h = new HashSet();

    /* renamed from: i */
    public Set<String> f165502i = new HashSet();

    /* renamed from: j */
    private ArrayList<String> f165503j = new ArrayList<>();

    /* renamed from: k */
    private C65691f f165504k;

    /* renamed from: l */
    private C65689d f165505l;

    /* renamed from: m */
    private boolean f165506m;

    /* renamed from: n */
    private boolean f165507n;

    /* renamed from: o */
    private JSONObject f165508o;

    /* renamed from: p */
    private JSONObject f165509p;

    /* renamed from: q */
    private JSONObject f165510q;

    /* renamed from: r */
    private JSONObject f165511r;

    /* renamed from: s */
    private JSONObject f165512s;

    /* renamed from: t */
    private JSONObject f165513t;

    /* renamed from: u */
    private JSONObject f165514u;

    /* renamed from: v */
    private C65686a f165515v;

    /* renamed from: w */
    private C65687b f165516w;

    /* renamed from: com.tt.miniapp.AppConfig$a */
    public static class C65686a {

        /* renamed from: a */
        private String f165519a;

        /* renamed from: b */
        private String f165520b;

        /* renamed from: c */
        private String f165521c;

        /* renamed from: d */
        private String f165522d;

        /* renamed from: e */
        private String f165523e;

        /* renamed from: f */
        private String f165524f;

        /* renamed from: g */
        private String f165525g;

        /* renamed from: h */
        private String f165526h;

        /* renamed from: a */
        public String mo230052a() {
            return this.f165519a;
        }

        /* renamed from: b */
        public String mo230053b() {
            return this.f165520b;
        }

        /* renamed from: c */
        public String mo230054c() {
            return this.f165521c;
        }

        /* renamed from: d */
        public String mo230055d() {
            return this.f165522d;
        }

        /* renamed from: e */
        public String mo230056e() {
            return this.f165523e;
        }

        /* renamed from: f */
        public String mo230057f() {
            return this.f165524f;
        }

        /* renamed from: g */
        public String mo230058g() {
            return this.f165525g;
        }

        /* renamed from: h */
        public String mo230059h() {
            return this.f165526h;
        }

        /* renamed from: a */
        public static C65686a m257593a(JSONObject jSONObject) {
            C65686a aVar = new C65686a();
            if (jSONObject != null) {
                JSONObject optJSONObject = jSONObject.optJSONObject("scope.userLocation");
                if (optJSONObject != null) {
                    aVar.f165519a = optJSONObject.optString("desc", null);
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("scope.address");
                if (optJSONObject2 != null) {
                    aVar.f165520b = optJSONObject2.optString("desc", null);
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("scope.record");
                if (optJSONObject3 != null) {
                    aVar.f165521c = optJSONObject3.optString("desc", null);
                }
                JSONObject optJSONObject4 = jSONObject.optJSONObject("scope.album");
                if (optJSONObject4 != null) {
                    aVar.f165522d = optJSONObject4.optString("desc", null);
                }
                JSONObject optJSONObject5 = jSONObject.optJSONObject("scope.camera");
                if (optJSONObject5 != null) {
                    aVar.f165523e = optJSONObject5.optString("desc", null);
                }
                JSONObject optJSONObject6 = jSONObject.optJSONObject("scope.clipboard");
                if (optJSONObject6 != null) {
                    aVar.f165524f = optJSONObject6.optString("desc", null);
                }
                JSONObject optJSONObject7 = jSONObject.optJSONObject("scope.appBadge");
                if (optJSONObject7 != null) {
                    aVar.f165525g = optJSONObject7.optString("desc", null);
                }
                JSONObject optJSONObject8 = jSONObject.optJSONObject("scope.runData");
                if (optJSONObject8 != null) {
                    aVar.f165526h = optJSONObject8.optString("desc", null);
                }
            }
            return aVar;
        }
    }

    /* renamed from: c */
    public ArrayList<String> mo230042c() {
        return this.f165503j;
    }

    /* renamed from: j */
    public Set<AppInfoEntity> mo230049j() {
        return this.f165501h;
    }

    /* renamed from: k */
    public Set<String> mo230050k() {
        return this.f165502i;
    }

    /* renamed from: a */
    public boolean mo230040a() {
        return this.f165506m && this.f165507n;
    }

    /* renamed from: com.tt.miniapp.AppConfig$b */
    public static class C65687b {

        /* renamed from: a */
        public final String f165527a;

        public C65687b() {
            this("");
        }

        public C65687b(String str) {
            this.f165527a = str;
        }
    }

    /* renamed from: h */
    public JSONObject mo230047h() {
        return this.f165508o.optJSONObject("prefetches");
    }

    /* renamed from: i */
    public JSONObject mo230048i() {
        return this.f165508o.optJSONObject("prefetchRules");
    }

    /* renamed from: com.tt.miniapp.AppConfig$c */
    public static class C65688c {

        /* renamed from: a */
        public Window f165528a;

        public String toString() {
            return "{window: " + this.f165528a + "}";
        }

        /* renamed from: a */
        public static C65688c m257602a(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
            C65688c cVar = new C65688c();
            if (jSONObject == null) {
                return cVar;
            }
            cVar.f165528a = Window.parseWindowWithDarkMode(jSONObject, jSONObject2, z);
            return cVar;
        }
    }

    /* renamed from: com.tt.miniapp.AppConfig$e */
    public static class C65690e {

        /* renamed from: a */
        private Map<String, Window> f165531a = new ConcurrentHashMap();

        /* renamed from: b */
        private JSONObject f165532b;

        /* renamed from: c */
        private boolean f165533c;

        /* renamed from: d */
        private JSONObject f165534d;

        public String toString() {
            return "{pageConfig: " + this.f165531a + "}";
        }

        /* renamed from: a */
        public static C65690e m257604a(JSONObject jSONObject) {
            return new C65690e(jSONObject);
        }

        private C65690e(JSONObject jSONObject) {
            this.f165532b = jSONObject;
        }

        /* renamed from: a */
        public Window mo230061a(String str) {
            JSONObject optJSONObject;
            Window window;
            JSONObject jSONObject = this.f165532b;
            JSONObject jSONObject2 = null;
            if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
                return null;
            }
            if (this.f165533c) {
                JSONObject jSONObject3 = this.f165534d;
                if (jSONObject3 != null) {
                    JSONObject optJSONObject2 = jSONObject3.optJSONObject(str);
                    if (optJSONObject2 != null) {
                        jSONObject2 = optJSONObject2.optJSONObject("window");
                        if (jSONObject2 == null) {
                            AppBrandLogger.m52830i("tma_AppConfig", " no target page for dark mode window params : " + str);
                        }
                    } else {
                        AppBrandLogger.m52830i("tma_AppConfig", " no target page for dark mode params : " + str);
                    }
                } else {
                    AppBrandLogger.m52830i("tma_AppConfig", " no theme page json ");
                }
            }
            if (optJSONObject.has("window")) {
                if (this.f165533c) {
                    window = Window.parseWindowWithDarkMode(optJSONObject.optJSONObject("window"), jSONObject2, this.f165533c);
                } else {
                    window = Window.parseWindow(optJSONObject.optJSONObject("window"));
                }
            } else if (this.f165533c) {
                window = Window.parseWindowWithDarkMode(optJSONObject.optJSONObject("window"), jSONObject2, this.f165533c);
            } else {
                window = Window.parseWindow(optJSONObject);
            }
            this.f165531a.put(AppConfig.m257573a(str), window);
            return window;
        }

        /* renamed from: a */
        public static C65690e m257605a(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
            return new C65690e(jSONObject, jSONObject2, z);
        }

        private C65690e(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
            this.f165532b = jSONObject;
            this.f165533c = z;
            this.f165534d = jSONObject2;
        }
    }

    /* renamed from: e */
    public C65686a mo230044e() {
        if (this.f165515v == null) {
            this.f165515v = C65686a.m257593a(this.f165508o.optJSONObject("permission"));
        }
        return this.f165515v;
    }

    /* renamed from: f */
    public C65689d mo230045f() {
        if (this.f165505l == null) {
            this.f165505l = C65689d.m257603a(m257579b(this.f165508o, this.f165509p, "ttLaunchApp"));
        }
        return this.f165505l;
    }

    /* renamed from: g */
    public C12798b mo230046g() {
        if (this.f165496c == null) {
            this.f165496c = m257570a(this.f165508o.optJSONObject("networkTimeout"));
        }
        return this.f165496c;
    }

    /* renamed from: com.tt.miniapp.AppConfig$f */
    public static class C65691f {

        /* renamed from: a */
        public String f165535a;

        /* renamed from: b */
        public String f165536b;

        /* renamed from: c */
        public String f165537c;

        /* renamed from: d */
        public String f165538d;

        /* renamed from: e */
        public String f165539e;

        /* renamed from: f */
        public ArrayList<C65692a> f165540f;

        /* renamed from: com.tt.miniapp.AppConfig$f$a */
        public static class C65692a {

            /* renamed from: a */
            public String f165541a;

            /* renamed from: b */
            public String f165542b;

            /* renamed from: c */
            public String f165543c;

            /* renamed from: d */
            public String f165544d;

            public String toString() {
                return "{pagePath: " + this.f165541a + ", iconPath: " + this.f165542b + ", selectedIconPath: " + this.f165543c + ", text: " + this.f165544d + "}";
            }
        }

        public String toString() {
            return "{color: " + this.f165535a + ", selectedColor: " + this.f165536b + ", borderStyle: " + this.f165537c + ", backgroundColor: " + this.f165539e + ", tabs: " + this.f165540f + "}";
        }

        /* renamed from: a */
        public static C65691f m257607a(JSONObject jSONObject) {
            C65691f fVar = new C65691f();
            if (jSONObject != null) {
                fVar.f165535a = C67070z.m261388a(jSONObject.optString("color"));
                fVar.f165536b = C67070z.m261388a(jSONObject.optString("selectedColor"));
                fVar.f165537c = jSONObject.optString("borderStyle");
                fVar.f165539e = C67070z.m261388a(jSONObject.optString("backgroundColor"));
                JSONArray optJSONArray = jSONObject.optJSONArray("list");
                if (optJSONArray != null) {
                    fVar.f165540f = new ArrayList<>();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            C65692a aVar = new C65692a();
                            fVar.f165540f.add(aVar);
                            aVar.f165541a = optJSONObject.optString("pagePath");
                            aVar.f165541a = AppConfig.m257573a(aVar.f165541a);
                            aVar.f165542b = optJSONObject.optString("iconPath");
                            aVar.f165543c = optJSONObject.optString("selectedIconPath");
                            aVar.f165544d = optJSONObject.optString("text");
                        }
                    }
                }
            }
            return fVar;
        }

        /* renamed from: a */
        public static C65691f m257608a(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
            C65691f a = m257607a(jSONObject);
            if (z && jSONObject2 != null) {
                JSONObject optJSONObject = jSONObject2.optJSONObject("dark");
                if (optJSONObject == null) {
                    AppBrandLogger.m52830i("tma_AppConfig", "no tabs params to fit dark mode");
                    return a;
                }
                a.f165535a = C67070z.m261388a(optJSONObject.optString("color"));
                a.f165536b = C67070z.m261388a(optJSONObject.optString("selectedColor"));
                a.f165537c = optJSONObject.optString("borderStyle");
                a.f165539e = C67070z.m261388a(optJSONObject.optString("backgroundColor"));
                JSONArray optJSONArray = optJSONObject.optJSONArray("list");
                ArrayList<C65692a> arrayList = a.f165540f;
                if (arrayList == null || arrayList.isEmpty()) {
                    AppBrandLogger.m52830i("tma_AppConfig", "no tabs to fit dark mode");
                } else if (optJSONArray == null || optJSONArray.length() == 0) {
                    AppBrandLogger.m52830i("tma_AppConfig", "no dark mode tabs params ");
                    return a;
                } else if (a.f165540f.size() != optJSONArray.length()) {
                    AppBrandLogger.m52830i("tma_AppConfig", "default tab bar size not equal to dark mode tabs size ");
                    return a;
                } else {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                        if (optJSONObject2 != null) {
                            C65692a aVar = a.f165540f.get(i);
                            aVar.f165542b = optJSONObject2.optString("iconPath");
                            aVar.f165543c = optJSONObject2.optString("selectedIconPath");
                            AppBrandLogger.m52830i("tma_AppConfig", "parse tab bar content with dark mode : " + aVar.toString());
                        }
                    }
                    AppBrandLogger.m52830i("tma_AppConfig", "parse tab bar with dark mode : " + a.toString());
                }
            }
            return a;
        }
    }

    /* renamed from: b */
    public C65691f mo230041b() {
        if (this.f165504k == null) {
            this.f165504k = C65691f.m257608a(m257579b(this.f165508o, this.f165509p, "tabBar"), this.f165513t, mo230040a());
        }
        return this.f165504k;
    }

    /* renamed from: d */
    public C65687b mo230043d() {
        JSONObject jSONObject;
        JSONObject optJSONObject;
        if (!(this.f165516w != null || (jSONObject = this.f165508o) == null || (optJSONObject = jSONObject.optJSONObject("experiments")) == null)) {
            String optString = optJSONObject.optString("snapshot");
            if (!TextUtils.isEmpty(optString)) {
                this.f165516w = new C65687b(optString);
            }
        }
        if (this.f165516w == null) {
            this.f165516w = new C65687b();
        }
        return this.f165516w;
    }

    public static class Window {
        public String backgroundColor;
        public String backgroundTextStyle;
        public boolean disableDefaultPopupMenu;
        public boolean disableScroll;
        public boolean disableSwipeBack;
        public boolean enablePullDownRefresh;
        public HashMap<String, Window> extend = new HashMap<>();
        public boolean hasBackgroundColor;
        public boolean hasBackgroundTextStyle;
        public boolean hasDisableScroll;
        public boolean hasDisableSwipeBack;
        public boolean hasEnablePullDownRefresh;
        public boolean hasExtend;
        public boolean hasNavigationBarBackgroundColor;
        public boolean hasNavigationBarTextStyle;
        public boolean hasNavigationBarTitleText;
        public boolean hasNavigationStyle;
        public boolean hasRenderType;
        public boolean hasTransparentTitle;
        public String navigationBarBackgroundColor;
        public String navigationBarTextStyle;
        public String navigationBarTitleText;
        public String navigationStyle;
        public String renderType;
        public String transparentTitle;

        public String toString() {
            StringBuilder sb = new StringBuilder("{navigationBarBackgroundColor: " + this.navigationBarBackgroundColor + ", navigationBarTextStyle: " + this.navigationBarTextStyle + ", navigationBarTitleText: " + this.navigationBarTitleText + ", enablePullDownRefresh: " + this.enablePullDownRefresh + ", backgroundColor: " + this.backgroundColor + ", backgroundTextStyle: " + this.backgroundTextStyle + ", navigationStyle: " + this.navigationStyle + ", disableScroll: " + this.disableScroll + ", disableSwipeBack: " + this.disableSwipeBack + ", transparentTitle: " + this.transparentTitle + ", extend: {");
            for (String str : this.extend.keySet()) {
                sb.append(str + ": " + this.extend.get(str).toString());
            }
            sb.append("}");
            sb.append("}");
            return sb.toString();
        }

        public static Window parseWindow(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            Window window = new Window();
            boolean has = jSONObject.has("navigationBarBackgroundColor");
            window.hasNavigationBarBackgroundColor = has;
            if (has) {
                window.navigationBarBackgroundColor = C67070z.m261388a(jSONObject.optString("navigationBarBackgroundColor"));
            }
            boolean has2 = jSONObject.has("navigationBarTextStyle");
            window.hasNavigationBarTextStyle = has2;
            if (has2) {
                window.navigationBarTextStyle = jSONObject.optString("navigationBarTextStyle");
            }
            if (TextUtils.isEmpty(window.navigationBarTextStyle)) {
                window.navigationBarTextStyle = "white";
            }
            boolean has3 = jSONObject.has("navigationBarTitleText");
            window.hasNavigationBarTitleText = has3;
            if (has3) {
                window.navigationBarTitleText = jSONObject.optString("navigationBarTitleText");
            }
            boolean has4 = jSONObject.has("enablePullDownRefresh");
            window.hasEnablePullDownRefresh = has4;
            if (has4) {
                window.enablePullDownRefresh = jSONObject.optBoolean("enablePullDownRefresh");
            }
            boolean has5 = jSONObject.has("backgroundColor");
            window.hasBackgroundColor = has5;
            if (has5) {
                window.backgroundColor = C67070z.m261388a(jSONObject.optString("backgroundColor"));
            }
            boolean has6 = jSONObject.has("backgroundTextStyle");
            window.hasBackgroundTextStyle = has6;
            if (has6) {
                window.backgroundTextStyle = jSONObject.optString("backgroundTextStyle");
            }
            boolean has7 = jSONObject.has("navigationStyle");
            window.hasNavigationStyle = has7;
            if (has7) {
                window.navigationStyle = jSONObject.optString("navigationStyle");
            } else {
                window.navigationStyle = "default";
            }
            boolean has8 = jSONObject.has("disableScroll");
            window.hasDisableScroll = has8;
            if (has8) {
                window.disableScroll = jSONObject.optBoolean("disableScroll");
            }
            boolean has9 = jSONObject.has("disableSwipeBack");
            window.hasDisableSwipeBack = has9;
            if (has9) {
                window.disableSwipeBack = jSONObject.optBoolean("disableSwipeBack");
            }
            boolean has10 = jSONObject.has("renderType");
            window.hasRenderType = has10;
            if (has10) {
                window.renderType = jSONObject.optString("renderType");
            }
            boolean has11 = jSONObject.has("extend");
            window.hasExtend = has11;
            if (has11) {
                JSONObject optJSONObject = jSONObject.optJSONObject("extend");
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    window.extend.put(next, parseWindow(optJSONObject.optJSONObject(next)));
                }
            }
            boolean has12 = jSONObject.has("transparentTitle");
            window.hasTransparentTitle = has12;
            if (has12) {
                window.transparentTitle = jSONObject.optString("transparentTitle");
            } else {
                window.transparentTitle = "none";
            }
            window.disableDefaultPopupMenu = jSONObject.optBoolean("disableDefaultPopupMenu", false);
            coverWindow(AppbrandContext.getInst().getInitParams().mo234505e(), window);
            return window;
        }

        private static void coverWindow(String str, Window window) {
            if (str != null) {
                Window window2 = window.extend.get(str);
                if (window2 == null) {
                    AppBrandLogger.m52830i("tma_AppConfig", "no window config:" + str);
                    return;
                }
                if (window2.hasNavigationBarBackgroundColor) {
                    window.navigationBarBackgroundColor = C67070z.m261388a(window2.navigationBarBackgroundColor);
                    window.hasNavigationBarBackgroundColor = true;
                }
                if (window2.hasNavigationBarTextStyle) {
                    window.navigationBarTextStyle = window2.navigationBarTextStyle;
                    window.hasNavigationBarTextStyle = true;
                }
                if (window2.hasNavigationBarTitleText) {
                    window.navigationBarTitleText = window2.navigationBarTitleText;
                    window.hasNavigationBarTitleText = true;
                }
                if (window2.hasEnablePullDownRefresh) {
                    window.enablePullDownRefresh = window2.enablePullDownRefresh;
                    window.hasEnablePullDownRefresh = true;
                }
                if (window2.hasBackgroundColor) {
                    window.backgroundColor = C67070z.m261388a(window2.backgroundColor);
                    window.hasBackgroundColor = true;
                }
                if (window2.hasBackgroundTextStyle) {
                    window.backgroundTextStyle = window2.backgroundTextStyle;
                    window.hasBackgroundTextStyle = true;
                }
                if (window2.hasNavigationStyle) {
                    window.navigationStyle = window2.navigationStyle;
                    window.hasNavigationStyle = true;
                }
                if (window2.hasDisableScroll) {
                    window.disableScroll = window2.disableScroll;
                    window.hasDisableScroll = true;
                }
                if (window2.hasDisableSwipeBack) {
                    window.disableSwipeBack = window2.disableSwipeBack;
                    window.hasDisableSwipeBack = true;
                }
                if (window2.hasTransparentTitle) {
                    window.transparentTitle = window2.transparentTitle;
                    window.hasTransparentTitle = true;
                }
            }
        }

        public static Window parseWindowWithDarkMode(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
            Window parseWindow = parseWindow(jSONObject);
            if (!z) {
                AppBrandLogger.m52830i("tma_AppConfig", "parse dark mode ignore : supportDarkMode is false ");
            } else if (jSONObject2 == null) {
                AppBrandLogger.m52830i("tma_AppConfig", "parseWindowWithDarkMode : no themeWindowObject ");
                return parseWindow;
            } else {
                JSONObject optJSONObject = jSONObject2.optJSONObject("dark");
                if (optJSONObject.has("navigationBarBackgroundColor")) {
                    parseWindow.navigationBarBackgroundColor = C67070z.m261388a(optJSONObject.optString("navigationBarBackgroundColor"));
                }
                if (optJSONObject.has("navigationBarTextStyle")) {
                    parseWindow.navigationBarTextStyle = optJSONObject.optString("navigationBarTextStyle");
                }
                if (optJSONObject.has("backgroundColor")) {
                    parseWindow.backgroundColor = C67070z.m261388a(optJSONObject.optString("backgroundColor"));
                }
                if (optJSONObject.has("backgroundTextStyle")) {
                    parseWindow.backgroundTextStyle = optJSONObject.optString("backgroundTextStyle");
                }
                AppBrandLogger.m52830i("tma_AppConfig", "parseWindowWithDarkMode : " + parseWindow.toString());
            }
            return parseWindow;
        }
    }

    /* renamed from: c */
    public static boolean m257581c(String str) {
        return TextUtils.equals("extPages", str);
    }

    /* renamed from: com.tt.miniapp.AppConfig$d */
    public static class C65689d {

        /* renamed from: a */
        public String f165529a;

        /* renamed from: b */
        public String f165530b;

        /* renamed from: a */
        public static C65689d m257603a(JSONObject jSONObject) {
            C65689d dVar = new C65689d();
            if (jSONObject != null) {
                dVar.f165529a = jSONObject.optString("appName");
                dVar.f165530b = jSONObject.optString("androidPackageName");
            }
            return dVar;
        }
    }

    /* renamed from: a */
    public static String m257573a(String str) {
        if (TextUtils.isEmpty(str) || !str.endsWith(".html")) {
            return str;
        }
        return str.substring(0, str.length() - 5);
    }

    /* renamed from: b */
    public static String m257578b(String str) {
        int indexOf;
        if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf("?")) > 0) {
            str = str.substring(0, indexOf);
        }
        return m257573a(str);
    }

    /* renamed from: a */
    public static C12798b m257570a(JSONObject jSONObject) {
        C12798b bVar = new C12798b();
        if (jSONObject != null) {
            long optLong = jSONObject.optLong("request");
            long optLong2 = jSONObject.optLong("uploadFile");
            long optLong3 = jSONObject.optLong("downloadFile");
            long optLong4 = jSONObject.optLong("connectSocket");
            if (optLong > 0 && optLong < 60000) {
                bVar.f34173a = optLong;
            }
            if (optLong2 > 0 && optLong2 < 60000) {
                bVar.f34174b = optLong2;
            }
            if (optLong3 > 0 && optLong3 < 60000) {
                bVar.f34175c = optLong3;
            }
            if (optLong4 > 0 && optLong4 < 60000) {
                bVar.f34176d = optLong4;
            }
        }
        return bVar;
    }

    /* renamed from: a */
    private static JSONObject m257575a(IAppContext iAppContext) {
        AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
        if (appInfo == null) {
            return null;
        }
        String str = appInfo.mExtJson;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "tma_AppConfig", e.getStackTrace());
            return null;
        }
    }

    /* renamed from: a */
    private static void m257577a(AppConfig appConfig, final IAppContext iAppContext) {
        C67866g.m264025a(new Action(appConfig) {
            /* class com.tt.miniapp.AppConfig.C656852 */

            /* renamed from: a */
            final /* synthetic */ AppConfig f165517a;

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                for (String str : this.f165517a.f165502i) {
                    AppInfoEntity a = C66375a.m259514a(str, iAppContext);
                    if (a != null) {
                        this.f165517a.f165501h.add(a);
                    }
                }
            }

            {
                this.f165517a = r1;
            }
        }, C67554l.m262725b());
    }

    public static class AppPageConfig {
        public final int color;
        public final boolean enablePullDownRefresh;
        public final boolean isTextLight;

        public static AppPageConfig parse(AppConfig appConfig, String str) {
            String str2;
            boolean z = false;
            String str3 = "dark";
            if (appConfig != null) {
                C65688c cVar = appConfig.f165494a;
                if (cVar != null) {
                    Window window = cVar.f165528a;
                    if (window == null || !window.hasBackgroundColor) {
                        str2 = "#FFFFFF";
                    } else {
                        str2 = window.backgroundColor;
                    }
                    if (window != null && window.hasBackgroundTextStyle) {
                        str3 = window.backgroundTextStyle;
                    }
                    if (window != null && window.hasEnablePullDownRefresh) {
                        z = window.enablePullDownRefresh;
                    }
                } else {
                    str2 = "#FFFFFF";
                }
                C65690e eVar = appConfig.f165495b;
                if (eVar != null) {
                    Window a = eVar.mo230061a(str);
                    if (a != null && a.hasBackgroundColor) {
                        str2 = a.backgroundColor;
                    }
                    if (a != null && a.hasBackgroundTextStyle) {
                        str3 = a.backgroundTextStyle;
                    }
                    if (a != null && a.hasEnablePullDownRefresh) {
                        z = a.enablePullDownRefresh;
                    }
                }
            } else {
                AppBrandLogger.m52829e("tma_AppConfig", "Background parse appcofnig == null");
                str2 = "#FFFFFF";
            }
            return new AppPageConfig(C67590h.m263069a(str2, "#FFFFFF"), TextUtils.equals(str3, "light"), z);
        }

        public AppPageConfig(int i, boolean z, boolean z2) {
            this.color = i;
            this.isTextLight = z;
            this.enablePullDownRefresh = z2;
        }
    }

    /* renamed from: b */
    private static JSONObject m257579b(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        return m257576a(jSONObject, jSONObject2, str, str);
    }

    /* renamed from: c */
    private static JSONArray m257580c(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        JSONArray jSONArray;
        if (jSONObject2 == null || !jSONObject2.has(str)) {
            jSONArray = null;
        } else {
            jSONArray = jSONObject2.optJSONArray(str);
        }
        return (JSONArray) m257572a(jSONObject.optJSONArray(str), jSONArray, str, str);
    }

    /* renamed from: a */
    private static String m257574a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        String str2;
        if (jSONObject2 == null || !jSONObject2.has(str)) {
            str2 = null;
        } else {
            str2 = jSONObject2.optString(str);
        }
        return (String) m257572a(jSONObject.optString(str), str2, str, str);
    }

    /* renamed from: a */
    public static AppConfig m257571a(String str, IAppContext iAppContext, boolean z) throws JSONException {
        boolean z2;
        boolean z3;
        boolean z4;
        AppBrandLogger.m52830i("tma_AppConfig", "appJson = ", str);
        AppConfig appConfig = new AppConfig();
        JSONObject a = m257575a(iAppContext);
        AppBrandLogger.m52828d("tma_AppConfig", "extConfigJson", a);
        appConfig.f165509p = a;
        JSONObject jSONObject = new JSONObject(str);
        appConfig.f165508o = jSONObject;
        String a2 = m257574a(jSONObject, a, "entryPagePath");
        appConfig.f165497d = a2;
        String a3 = m257573a(a2);
        appConfig.f165497d = a3;
        AppBrandLogger.m52828d("tma_AppConfig", "appConfig.mEntryPath = ", a3);
        boolean optBoolean = jSONObject.optBoolean("darkmode");
        appConfig.f165506m = optBoolean;
        appConfig.f165507n = z;
        if (optBoolean) {
            if (z) {
                iAppContext.setCurrentTheme(2);
            } else {
                iAppContext.setCurrentTheme(1);
            }
        }
        AppBrandLogger.m52830i("tma_AppConfig", "appConfig.darkmode = " + appConfig.f165506m + " isDarkModeEnv : " + appConfig.f165507n);
        if (z && appConfig.f165506m) {
            JSONObject optJSONObject = jSONObject.optJSONObject("theme");
            appConfig.f165510q = optJSONObject;
            if (optJSONObject != null) {
                appConfig.f165511r = optJSONObject.optJSONObject("global");
                appConfig.f165513t = appConfig.f165510q.optJSONObject("tabBar");
                appConfig.f165514u = appConfig.f165510q.optJSONObject("page");
                JSONObject jSONObject2 = appConfig.f165511r;
                if (jSONObject2 != null) {
                    appConfig.f165512s = jSONObject2.optJSONObject("window");
                }
            } else {
                AppBrandLogger.m52829e("tma_AppConfig", "appConfig.darkmode=true but no target theme config");
            }
        }
        JSONArray c = m257580c(jSONObject, a, "pages");
        if (c != null) {
            int length = c.length();
            for (int i = 0; i < length; i++) {
                appConfig.f165503j.add(c.optString(i));
            }
        }
        JSONObject b = m257579b(jSONObject, a, "loadPage");
        if (b != null) {
            Iterator<String> it = appConfig.f165503j.iterator();
            while (it.hasNext()) {
                String next = it.next();
                appConfig.f165500g.put(next, b.optString(next));
            }
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("navigateToMiniProgramAppIdList");
        if (optJSONArray != null) {
            int length2 = optJSONArray.length();
            for (int i2 = 0; i2 < length2; i2++) {
                appConfig.f165502i.add(optJSONArray.optString(i2));
            }
            m257577a(appConfig, iAppContext);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("global");
        JSONObject jSONObject3 = null;
        if (optJSONObject2 != null) {
            jSONObject3 = m257579b(optJSONObject2, a, "window");
        } else if (a != null) {
            jSONObject3 = a.getJSONObject("window");
        }
        JSONObject jSONObject4 = appConfig.f165512s;
        if (!appConfig.f165507n || !appConfig.f165506m) {
            z2 = false;
        } else {
            z2 = true;
        }
        appConfig.f165494a = C65688c.m257602a(jSONObject3, jSONObject4, z2);
        JSONObject a4 = m257576a(jSONObject, a, "page", "extPages");
        boolean z5 = appConfig.f165507n;
        if (!z5 || !(z3 = appConfig.f165506m)) {
            appConfig.f165495b = C65690e.m257604a(a4);
        } else {
            JSONObject jSONObject5 = appConfig.f165514u;
            if (!z5 || !z3) {
                z4 = false;
            } else {
                z4 = true;
            }
            appConfig.f165495b = C65690e.m257605a(a4, jSONObject5, z4);
        }
        String a5 = m257574a(jSONObject, a, "deviceOrientation");
        appConfig.f165498e = a5;
        if (TextUtils.isEmpty(a5)) {
            appConfig.f165498e = "portrait";
        }
        AppBrandLogger.m52828d("tma_AppConfig", "appConfig", appConfig);
        return appConfig;
    }

    /* renamed from: a */
    private static <T> T m257572a(T t, T t2, String str, String str2) {
        if (t == null) {
            return t2;
        }
        if (t2 == null) {
            return t;
        }
        if (t instanceof JSONObject) {
            if (!(t2 instanceof JSONObject)) {
                DebugUtil.outputError("tma_AppConfig", " merge JSONObject 类型不匹配。 appConfigValue：" + ((Object) t) + " extConfigValue：" + ((Object) t2));
                return t2;
            } else if (m257581c(str2)) {
                return t2;
            } else {
                T t3 = t;
                T t4 = t2;
                List list = f165493x.get(str);
                Iterator<String> keys = t4.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (list == null || !list.contains(next)) {
                        try {
                            t3.put(next, m257572a(t3.opt(next), t4.opt(next), (String) null, (String) null));
                        } catch (JSONException e) {
                            AppBrandLogger.m52829e("tma_AppConfig", "mergeJsonObject", e);
                        }
                    } else {
                        try {
                            t3.put(next, t2.opt(next));
                        } catch (JSONException e2) {
                            AppBrandLogger.m52829e("tma_AppConfig", "mergeJsonObject", e2);
                        }
                    }
                }
                return t;
            }
        } else if (!(t instanceof JSONArray)) {
            return t2;
        } else {
            if (!(t2 instanceof JSONArray)) {
                DebugUtil.outputError("tma_AppConfig", " merge JSONArray 类型不匹配。 appConfigValue：" + ((Object) t) + " extConfigValue：" + ((Object) t2));
                return t2;
            }
            T t5 = t;
            T t6 = t2;
            int length = t6.length();
            for (int i = 0; i < length; i++) {
                t5.put(t6.opt(i));
            }
            return t;
        }
    }

    /* renamed from: a */
    private static JSONObject m257576a(JSONObject jSONObject, JSONObject jSONObject2, String str, String str2) {
        JSONObject jSONObject3;
        if (jSONObject2 == null || !jSONObject2.has(str2)) {
            jSONObject3 = null;
        } else {
            jSONObject3 = jSONObject2.optJSONObject(str2);
        }
        return (JSONObject) m257572a((Object) jSONObject.optJSONObject(str), (Object) jSONObject3, str, str2);
    }
}
