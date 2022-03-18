package com.bytedance.lynx.webview.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.lynx.webview.TTWebSdk;
import com.bytedance.lynx.webview.glue.ISdkToGlue;
import com.bytedance.lynx.webview.sdkadapt.Version;
import com.bytedance.lynx.webview.util.C20026a;
import com.bytedance.lynx.webview.util.C20040b;
import com.bytedance.lynx.webview.util.C20044e;
import com.bytedance.lynx.webview.util.C20048g;
import com.bytedance.lynx.webview.util.C20049h;
import com.bytedance.lynx.webview.util.C20050i;
import com.bytedance.lynx.webview.util.p844a.C20034b;
import com.bytedance.lynx.webview.util.p844a.C20037d;
import com.bytedance.lynx.webview.util.p844a.C20038e;
import com.google.firebase.messaging.Constants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.lynx.webview.internal.h */
public class C19951h {

    /* renamed from: a */
    private static C19951h f48731a;

    /* renamed from: j */
    private static String f48732j;

    /* renamed from: b */
    private SharedPreferences f48733b;

    /* renamed from: c */
    private C19956d f48734c;

    /* renamed from: d */
    private C19954b f48735d;

    /* renamed from: e */
    private JSONObject f48736e;

    /* renamed from: f */
    private boolean f48737f;

    /* renamed from: g */
    private volatile boolean f48738g;

    /* renamed from: h */
    private C19953a f48739h;

    /* renamed from: i */
    private Map<String, Integer> f48740i;

    /* renamed from: k */
    private boolean f48741k;

    /* renamed from: com.bytedance.lynx.webview.internal.h$c */
    public interface AbstractC19955c {
        /* renamed from: a */
        void mo67766a(JSONObject jSONObject, boolean z);
    }

    private C19951h() {
    }

    /* renamed from: e */
    public static String m72736e() {
        return f48732j;
    }

    /* renamed from: f */
    public C19953a mo67748f() {
        return this.f48739h;
    }

    /* renamed from: h */
    public boolean mo67750h() {
        return this.f48737f;
    }

    /* renamed from: com.bytedance.lynx.webview.internal.h$a */
    public static class C19953a {

        /* renamed from: a */
        private String f48744a = "0620010001";

        /* renamed from: b */
        private String f48745b = "0620010001";

        /* renamed from: c */
        private String f48746c = "com";

        /* renamed from: d */
        private String f48747d = "NULL";

        /* renamed from: e */
        private String f48748e = "1";

        /* renamed from: f */
        private String f48749f = "NULL";

        /* renamed from: g */
        private String f48750g = "-1";

        /* renamed from: h */
        private String f48751h = "0";

        /* renamed from: a */
        public String mo67755a() {
            return this.f48750g;
        }

        /* renamed from: b */
        public String mo67757b() {
            return this.f48751h;
        }

        /* renamed from: c */
        public String mo67759c() {
            if (TextUtils.isEmpty(this.f48748e) || TextUtils.isEmpty(this.f48749f) || TextUtils.isEmpty(this.f48750g) || TextUtils.isEmpty(this.f48751h)) {
                throw new NullPointerException("deviceId or channel or aid or appVersionCode can't be empty!");
            }
            C20011y a = C20011y.m72976a();
            this.f48744a = a.mo67934h(true);
            this.f48745b = a.mo67932g(true);
            this.f48746c = a.mo67938u().getPackageName();
            this.f48747d = C20049h.m73169a(a.mo67938u());
            return "https://lf.snssdk.com/service/settings/v2/?app=1&caller_name=tt_webview" + "&sdk_version_code=" + Uri.encode(Version.f48943d) + "&sdk_upto_so_versioncode=" + Uri.encode(this.f48744a) + "&sdk_load_so_versioncode=" + Uri.encode(this.f48745b) + "&os_type=" + "android" + "&os_api=" + Build.VERSION.SDK_INT + "&target_api=" + a.mo67938u().getApplicationInfo().targetSdkVersion + "&host_abi=" + C20011y.m72974M() + "&device_platform=" + Uri.encode(Build.MODEL) + "&device_manufacturer=" + Uri.encode(Build.MANUFACTURER) + "&deviceid=" + Uri.encode(this.f48748e) + "&device_id=" + Uri.encode(this.f48748e) + "&channel=" + Uri.encode(this.f48749f) + "&aid=" + Uri.encode(this.f48750g) + "&app_version_code=" + Uri.encode(this.f48751h) + "&update_version_code=" + Uri.encode(this.f48751h) + "&os_version=" + Uri.encode(Build.VERSION.RELEASE) + "&package_name=" + Uri.encode(this.f48746c) + "&network_type=" + Uri.encode(this.f48747d) + "&enforce_pull_so=" + C19941e.m72704a().mo67726b();
        }

        /* renamed from: a */
        public C19953a mo67754a(String str) {
            this.f48748e = str;
            return this;
        }

        /* renamed from: b */
        public C19953a mo67756b(String str) {
            this.f48749f = str;
            return this;
        }

        /* renamed from: c */
        public C19953a mo67758c(String str) {
            this.f48750g = str;
            return this;
        }

        /* renamed from: d */
        public C19953a mo67760d(String str) {
            this.f48751h = str;
            return this;
        }
    }

    /* renamed from: b */
    public void mo67741b() {
        C19956d dVar = this.f48734c;
        if (dVar != null) {
            dVar.mo67767a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.lynx.webview.internal.h$d */
    public static class C19956d implements TTWebSdk.AbstractC19912d.AbstractC19913a {

        /* renamed from: a */
        private final Set<AbstractC19955c> f48753a = new HashSet();

        /* renamed from: a */
        public void mo67767a() {
            synchronized (this.f48753a) {
                this.f48753a.clear();
            }
        }

        @Override // com.bytedance.lynx.webview.util.p844a.C20038e.AbstractC20039a
        /* renamed from: b */
        public void mo67764b(C20038e eVar) {
            C19943g.m72724a(EventType.GET_JSON_NET_ERROR, (Object) null);
            C20048g.m73164d("LoadJsonConfig onFail");
        }

        /* renamed from: a */
        public void mo67768a(AbstractC19955c cVar) {
            if (cVar != null) {
                synchronized (this.f48753a) {
                    this.f48753a.add(cVar);
                }
            }
        }

        @Override // com.bytedance.lynx.webview.util.p844a.C20038e.AbstractC20039a
        /* renamed from: a */
        public void mo67762a(C20038e eVar) {
            C20026a.m73079a(DownloadEventType.OnSuccess_begin);
            C20026a.m73086e();
            JSONObject a = C19957e.m72778a(eVar);
            JSONObject j = C19951h.m72733a().mo67752j();
            if (j != null) {
                C19957e.m72779a(a, j);
            }
            mo67770a(a);
        }

        /* renamed from: a */
        public void mo67769a(String str) {
            C20048g.m73161a("config url is", str);
            if (C20011y.m73015m() == null || C20011y.m73015m().mo67446a() == null) {
                C20037d dVar = new C20037d(str);
                C20034b bVar = new C20034b();
                bVar.mo68005a(this);
                C20049h.m73168a().mo67993a(dVar, bVar);
                return;
            }
            C20011y.m73015m().mo67446a().mo67448a(str, this);
        }

        /* renamed from: a */
        public void mo67770a(JSONObject jSONObject) {
            C19951h.m72733a().mo67740a(jSONObject);
            boolean h = C19951h.m72733a().mo67750h();
            synchronized (this) {
                Iterator<AbstractC19955c> it = this.f48753a.iterator();
                while (it.hasNext()) {
                    AbstractC19955c next = it.next();
                    if (next != null) {
                        next.mo67766a(jSONObject, h);
                    } else {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static C19951h m72733a() {
        if (f48731a == null) {
            f48731a = new C19951h();
        }
        return f48731a;
    }

    /* renamed from: g */
    public boolean mo67749g() {
        boolean d;
        synchronized (this) {
            d = m72735d(mo67751i());
        }
        return d;
    }

    /* renamed from: c */
    public void mo67745c() {
        C19953a aVar;
        if (this.f48735d != null && (aVar = this.f48739h) != null) {
            String c = aVar.mo67759c();
            f48732j = c;
            this.f48735d.mo67763a(c);
        }
    }

    /* renamed from: d */
    public void mo67747d() {
        C19953a aVar;
        if (this.f48734c != null && (aVar = this.f48739h) != null) {
            String c = aVar.mo67759c();
            f48732j = c;
            this.f48734c.mo67769a(c);
        }
    }

    /* renamed from: j */
    public JSONObject mo67752j() {
        SharedPreferences sharedPreferences = this.f48733b;
        if (sharedPreferences == null) {
            C20048g.m73161a("getPredefinedJsonConfig: SharedPreferences is not initialized.");
            return null;
        }
        try {
            return new JSONObject(sharedPreferences.getString("predefined_json_config", ""));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public JSONObject mo67751i() {
        if (!C20040b.m73125d() || C19941e.m72704a().mo67726b()) {
            JSONObject jSONObject = this.f48736e;
            if (jSONObject != null) {
                return jSONObject;
            }
            this.f48736e = m72738l();
        } else {
            this.f48736e = C20040b.m73126e();
        }
        return this.f48736e;
    }

    /* renamed from: l */
    private JSONObject m72738l() {
        String e = C20011y.m72976a().mo67939v().mo67830e();
        String b = C20044e.m73155b(C20050i.m73174a(e) + C20050i.m73187g());
        if (TextUtils.isEmpty(b)) {
            C20048g.m73161a("getJsonObjectFromSharedPreferences: There is no json in SharedPrefernces.");
            return null;
        }
        try {
            return new JSONObject(b);
        } catch (JSONException e2) {
            C19938b.m72701a("JsonConfigManager::getJsonObjectFromSharedPreferences: " + e2.toString());
            C20048g.m73164d("getJsonObjectFromSharedPreferences: Failed to create JsonObject from SharedPreferences.");
            return null;
        }
    }

    /* renamed from: k */
    private void m72737k() {
        try {
            Map<String, Integer> map = this.f48740i;
            if (map == null) {
                this.f48740i = new ConcurrentHashMap();
            } else {
                map.clear();
            }
            String[] split = mo67733a("process_feature", "").split(";");
            for (String str : split) {
                String[] split2 = str.split("#", 2);
                if (split2.length == 2) {
                    this.f48740i.put(split2[0], Integer.valueOf(split2[1]));
                } else {
                    this.f48740i.put(split2[0], 0);
                }
            }
            if (this.f48741k) {
                C19941e a = C19941e.m72704a();
                for (String str2 : split) {
                    String[] split3 = str2.split("#", 2);
                    if (split3.length == 2) {
                        a.mo67719a(split3[0], Integer.parseInt(split3[1]));
                    } else {
                        a.mo67719a(split3[0], 0);
                    }
                }
            }
        } catch (Exception e) {
            C20048g.m73164d("TT_WEBVIEW", "updateProcessFeatureMap error:" + e.toString());
        }
    }

    /* renamed from: a */
    public void mo67735a(C19953a aVar) {
        this.f48739h = aVar;
    }

    /* renamed from: b */
    public void mo67744b(boolean z) {
        this.f48738g = z;
    }

    /* renamed from: a */
    public void mo67736a(AbstractC19955c cVar) {
        C19956d dVar = this.f48734c;
        if (dVar != null) {
            dVar.mo67768a(cVar);
        }
    }

    /* renamed from: c */
    public void mo67746c(AbstractC19955c cVar) {
        C19954b bVar = this.f48735d;
        if (bVar != null) {
            bVar.mo67765b(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.lynx.webview.internal.h$b */
    public static class C19954b implements C20038e.AbstractC20039a {

        /* renamed from: a */
        private Set<AbstractC19955c> f48752a = new HashSet();

        /* renamed from: a */
        public void mo67761a(AbstractC19955c cVar) {
            if (cVar != null) {
                synchronized (this) {
                    this.f48752a.add(cVar);
                }
            }
        }

        @Override // com.bytedance.lynx.webview.util.p844a.C20038e.AbstractC20039a
        /* renamed from: b */
        public void mo67764b(C20038e eVar) {
            C19943g.m72724a(EventType.GET_JSON_NET_ERROR, (Object) null);
            C20048g.m73164d("LoadJsonConfig onFail");
        }

        /* renamed from: a */
        public void mo67763a(String str) {
            C20037d dVar = new C20037d(str);
            C20034b bVar = new C20034b();
            bVar.mo68005a(this);
            C20049h.m73168a().mo67993a(dVar, bVar);
        }

        /* renamed from: b */
        public boolean mo67765b(AbstractC19955c cVar) {
            boolean remove;
            if (cVar == null) {
                return false;
            }
            synchronized (this) {
                remove = this.f48752a.remove(cVar);
            }
            return remove;
        }

        @Override // com.bytedance.lynx.webview.util.p844a.C20038e.AbstractC20039a
        /* renamed from: a */
        public void mo67762a(C20038e eVar) {
            C20026a.m73079a(DownloadEventType.OnSuccess_begin);
            C20026a.m73086e();
            JSONObject a = C19957e.m72778a(eVar);
            JSONObject j = C19951h.m72733a().mo67752j();
            if (j != null) {
                C19957e.m72779a(a, j);
            }
            boolean h = C19951h.m72733a().mo67750h();
            synchronized (this) {
                Iterator<AbstractC19955c> it = this.f48752a.iterator();
                while (it.hasNext()) {
                    AbstractC19955c next = it.next();
                    if (next != null) {
                        next.mo67766a(a, h);
                    } else {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo67742b(AbstractC19955c cVar) {
        C19954b bVar = this.f48735d;
        if (bVar != null) {
            bVar.mo67761a(cVar);
        }
    }

    /* renamed from: c */
    private boolean m72734c(JSONObject jSONObject) {
        String optString = jSONObject.optString("sdk_upto_so_md5");
        if (TextUtils.isEmpty(optString)) {
            C20048g.m73164d("no UPTO_SO_MD5 in setting json.");
            return false;
        }
        C20044e.m73150a(jSONObject.toString(), C20050i.m73174a(optString) + C20050i.m73187g());
        return true;
    }

    /* renamed from: a */
    public void mo67734a(Context context) {
        boolean z = false;
        this.f48733b = context.getSharedPreferences("TTWebView_Json_Config_Manager", 0);
        this.f48734c = new C19956d();
        this.f48735d = new C19954b();
        this.f48741k = C20040b.m73122a(context);
        JSONObject i = mo67751i();
        if (i != null) {
            try {
                if (this.f48741k || i.getBoolean("sdk_enable_debug_page")) {
                    z = true;
                }
                this.f48741k = z;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo67743b(JSONObject jSONObject) {
        SharedPreferences sharedPreferences = this.f48733b;
        if (sharedPreferences == null) {
            C20048g.m73161a("setPredefinedJsonConfig: SharedPreferences is not initialized.");
        } else if (jSONObject == null) {
            sharedPreferences.edit().putString("predefined_json_config", "").apply();
        } else {
            sharedPreferences.edit().putString("predefined_json_config", jSONObject.toString()).apply();
        }
    }

    /* renamed from: com.bytedance.lynx.webview.internal.h$e */
    private static class C19957e {
        /* renamed from: a */
        public static JSONObject m72778a(C20038e eVar) {
            Object obj;
            JSONObject jSONObject = new JSONObject();
            try {
                Object obj2 = new JSONObject(new String(eVar.f48966b)).get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (obj2 == null || (obj = ((JSONObject) obj2).get("app")) == null || ((JSONObject) obj).length() <= 0) {
                    return jSONObject;
                }
                Iterator<String> keys = ((JSONObject) obj).keys();
                while (keys.hasNext()) {
                    jSONObject = m72779a(jSONObject, ((JSONObject) obj).getJSONObject(keys.next()));
                }
                return jSONObject;
            } catch (Throwable th) {
                C19943g.m72724a(EventType.JSON_OUT_FORMAT_ERROR, th.toString());
                return null;
            }
        }

        /* renamed from: a */
        public static JSONObject m72779a(JSONObject jSONObject, JSONObject jSONObject2) {
            if (!(jSONObject2 == null || jSONObject == null)) {
                try {
                    if (jSONObject.length() == 0) {
                        return jSONObject2;
                    }
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, jSONObject2.get(next));
                    }
                } catch (Throwable th) {
                    C20048g.m73164d("JsonConfigManager mergeJson error:" + th.toString());
                }
            }
            return jSONObject;
        }
    }

    /* renamed from: d */
    private boolean m72735d(JSONObject jSONObject) {
        ISdkToGlue e = C20011y.m72976a().mo67902F().mo67781e();
        if (e == null) {
            return false;
        }
        try {
            C19953a aVar = this.f48739h;
            if (aVar != null) {
                jSONObject.putOpt("sdk_app_id", aVar.mo67755a());
            }
            e.setJsonObject(jSONObject);
            return true;
        } catch (Throwable th) {
            C19938b.m72701a("JsonConfigManager::applyToEngine: " + th.toString());
            C20048g.m73164d("applyToEngine: Failed to invoke setJsonObject. " + th.toString());
            return false;
        }
    }

    /* renamed from: a */
    public void mo67737a(String str) {
        if (this.f48734c != null) {
            try {
                this.f48734c.mo67770a(new JSONObject(str));
            } catch (Exception unused) {
                C20048g.m73164d("Local setting failed!!");
            }
        }
    }

    /* renamed from: a */
    public void mo67738a(final boolean z) {
        mo67747d();
        if (!z) {
            C20011y.m72993b(new Runnable() {
                /* class com.bytedance.lynx.webview.internal.C19951h.RunnableC199521 */

                public void run() {
                    C19951h.this.mo67738a(z);
                }
            }, 3600000);
        }
    }

    /* renamed from: a */
    public boolean mo67740a(JSONObject jSONObject) {
        synchronized (this) {
            this.f48736e = null;
            this.f48737f = false;
            if (jSONObject != null) {
                if (!C20040b.m73125d() || C19941e.m72704a().mo67726b()) {
                    this.f48736e = jSONObject;
                } else {
                    this.f48736e = C20040b.m73126e();
                }
                this.f48737f = true;
                C20048g.m73161a("applyToEngineByJsonString: create JsonObject from config file successfully.");
            }
            if (this.f48736e != null) {
                m72734c(jSONObject);
                m72737k();
                return m72735d(this.f48736e);
            }
            C20048g.m73161a("applyToEngineByJsonString: Won't apply JsonObject to engine.");
            return false;
        }
    }

    /* renamed from: a */
    public String mo67733a(String str, String str2) {
        synchronized (this) {
            JSONObject i = mo67751i();
            if (i == null) {
                return str2;
            }
            return i.optString(str, str2);
        }
    }

    /* renamed from: a */
    public boolean mo67739a(String str, int i, boolean z) {
        boolean z2;
        synchronized (this) {
            if (this.f48740i == null) {
                m72737k();
            }
        }
        try {
            Matcher matcher = Pattern.compile("\\d+$").matcher(str);
            if (matcher.find()) {
                str = matcher.replaceAll("x");
            }
            Integer num = this.f48740i.get(str);
            if (num != null) {
                if ((num.intValue() & (1 << (i - 1))) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z2;
            }
            if (i == 1) {
                return z | this.f48738g;
            }
            return z;
        } catch (Exception e) {
            C20048g.m73164d("TT_WEBVIEW", "getProcessFeature error:" + e.toString());
            return z;
        }
    }
}
