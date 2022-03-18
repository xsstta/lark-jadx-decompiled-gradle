package com.bytedance.ee.bear.domain;

import android.text.TextUtils;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.CollectionUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.domain.f */
public class C6310f {

    /* renamed from: a */
    private String[] f17475a = {"space"};

    /* renamed from: b */
    private String[] f17476b = C6311g.f17495a;

    /* renamed from: c */
    private String[] f17477c;

    /* renamed from: d */
    private String[] f17478d = C6311g.f17496b;

    /* renamed from: e */
    private String[] f17479e = C6311g.f17497c;

    /* renamed from: f */
    private String f17480f = "";

    /* renamed from: g */
    private Map<String, String> f17481g = C6311g.f17501g;

    /* renamed from: h */
    private Map<String, String> f17482h = C6311g.f17500f;

    /* renamed from: i */
    private String f17483i = "/space/help/about";

    /* renamed from: j */
    private String f17484j = "/space/app/upgrade/";

    /* renamed from: k */
    private String f17485k = "/blank/";

    /* renamed from: l */
    private Pattern f17486l = Pattern.compile("^(/space|/drive)?/(doc|docs|sheet|sheets|mindnote|mindnotes|slide|slides|file|bitable|base|folder|wiki|isv|docx)/[^\\/]{14,}(/)?");

    /* renamed from: m */
    private Pattern f17487m = Pattern.compile("/(doc|docs|sheet|sheets|mindnote|mindnotes|slide|slides|file|bitable|base|folder|wiki|isv|docx)/");

    /* renamed from: n */
    private Pattern f17488n = Pattern.compile("/([\\w]{14,})");

    /* renamed from: o */
    private Map<String, String> f17489o = C6311g.f17498d;

    /* renamed from: p */
    private String[] f17490p = C6311g.f17499e;

    /* renamed from: q */
    private Map<String, String> f17491q = C6311g.f17502h;

    /* renamed from: r */
    private Map<String, String> f17492r = C6311g.f17503i;

    /* renamed from: s */
    private String f17493s = "/(doc|docs|sheet|sheets|mindnote|mindnotes|slide|slides|file|bitable|base|folder|wiki|isv|docx)/";

    /* renamed from: t */
    private String f17494t = "";

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo25366c() {
        return this.f17480f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Map<String, String> mo25367d() {
        return this.f17481g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Map<String, String> mo25368e() {
        return this.f17482h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo25370g() {
        return this.f17485k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Pattern mo25371h() {
        return this.f17486l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Pattern mo25372i() {
        return this.f17487m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Pattern mo25373j() {
        return this.f17488n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Map<String, String> mo25374k() {
        return this.f17492r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public String[] mo25375l() {
        return this.f17476b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String[] mo25376m() {
        return this.f17477c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public String[] mo25377n() {
        return this.f17478d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public String[] mo25378o() {
        return this.f17479e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo25365b() {
        String[] strArr = this.f17475a;
        if (strArr == null || strArr.length <= 1) {
            return "";
        }
        return strArr[1];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo25369f() {
        if (TextUtils.isEmpty(this.f17494t)) {
            m25291a(new PersistenceSharedPreference(C6306d.f17467a).getString(C6306d.f17468b, ""));
        }
        return this.f17494t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo25364a() {
        String[] strArr = this.f17475a;
        if (strArr == null || strArr.length <= 0) {
            return "space";
        }
        return strArr[0];
    }

    C6310f() {
        String str = (String) C4211a.m17514a().mo16533a("domain_config", "");
        C13479a.m54764b("DomainConfig", "domainConfigStr = " + str);
        m25301e(str);
        m25300d(str);
        m25306p();
        PersistenceSharedPreference aVar = new PersistenceSharedPreference(C6306d.f17467a);
        m25296b(aVar.getString(C6306d.f17469c, ""));
        m25298c(aVar.getString(C6306d.f17470d, ""));
        C13479a.m54772d("DomainConfig", "DomainConfig()...json = " + str + ", mainDomain = " + this.f17494t);
    }

    /* renamed from: p */
    private void m25306p() {
        Set<Map.Entry<String, String>> entrySet = this.f17491q.entrySet();
        if (!CollectionUtils.isEmpty(entrySet)) {
            for (Map.Entry<String, String> entry : entrySet) {
                String key = entry.getKey();
                if (TextUtils.equals(key, "doc")) {
                    C8275a.f22371d.mo32554a(entry.getValue());
                } else if (TextUtils.equals(key, "sheet")) {
                    C8275a.f22372e.mo32554a(entry.getValue());
                } else if (TextUtils.equals(key, "folder")) {
                    C8275a.f22370c.mo32554a(entry.getValue());
                } else if (TextUtils.equals(key, "bitable")) {
                    C8275a.f22373f.mo32554a(entry.getValue());
                } else if (TextUtils.equals(key, "mindnote")) {
                    C8275a.f22374g.mo32554a(entry.getValue());
                } else if (TextUtils.equals(key, "file")) {
                    C8275a.f22375h.mo32554a(entry.getValue());
                } else if (TextUtils.equals(key, "slide")) {
                    C8275a.f22376i.mo32554a(entry.getValue());
                } else if (TextUtils.equals(key, "wiki")) {
                    C8275a.f22377j.mo32554a(entry.getValue());
                } else if (TextUtils.equals(key, "doc")) {
                    C8275a.f22378k.mo32554a(entry.getValue());
                }
            }
        }
        C13479a.m54764b("DomainConfig", "updateDocumentTypeName()..." + m25307q());
    }

    /* renamed from: q */
    private String m25307q() {
        return "doc = " + C8275a.f22371d.mo32556c() + ", sheet = " + C8275a.f22372e.mo32556c() + ", folder = " + C8275a.f22370c.mo32556c() + ", bitable = " + C8275a.f22373f.mo32556c() + ", mindnote = " + C8275a.f22374g.mo32556c() + ", file = " + C8275a.f22375h.mo32556c() + ", slide = " + C8275a.f22376i.mo32556c() + ", docx = " + C8275a.f22378k.mo32556c() + ", wiki = " + C8275a.f22377j.mo32556c();
    }

    /* renamed from: e */
    private String[] m25302e(JSONObject jSONObject) {
        return m25293a("blackPathList", jSONObject);
    }

    /* renamed from: f */
    private String[] m25303f(JSONObject jSONObject) {
        return m25293a("whitePathList", jSONObject);
    }

    /* renamed from: g */
    private String[] m25304g(JSONObject jSONObject) {
        return m25293a("pathlist", jSONObject);
    }

    /* renamed from: h */
    private String[] m25305h(JSONObject jSONObject) {
        return m25293a("productJoinWiki", jSONObject);
    }

    /* renamed from: a */
    private String[] m25294a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.optString(i);
        }
        return strArr;
    }

    /* renamed from: b */
    private Map<String, String> m25295b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return C6311g.f17500f;
        }
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        hashMap.put("/drive/folder/", "folder");
        return hashMap;
    }

    /* renamed from: c */
    private Map<String, String> m25297c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return C6311g.f17501g;
        }
        this.f17483i = jSONObject.optString("help");
        this.f17484j = jSONObject.optString("upgrade");
        this.f17485k = jSONObject.optString("blank");
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    /* renamed from: d */
    private Map<String, String> m25299d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this.f17489o;
        }
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    /* renamed from: b */
    private void m25296b(String str) {
        C13479a.m54764b("DomainConfig", "parseDomainPoolStr()...domainPoolStr = " + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] a = m25294a(new JSONArray(str));
                if (a != null) {
                    this.f17478d = a;
                }
            } catch (JSONException e) {
                C13479a.m54761a("DomainConfig", e);
            }
        }
    }

    /* renamed from: c */
    private void m25298c(String str) {
        C13479a.m54764b("DomainConfig", "parseSpaceApiHostArray()...spaceApiStr = " + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] a = m25294a(new JSONArray(str));
                if (this.f17479e != null) {
                    this.f17479e = a;
                }
            } catch (JSONException e) {
                C13479a.m54761a("DomainConfig", e);
            }
        }
    }

    /* renamed from: d */
    private void m25300d(String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("DomainConfig", "parsePathChangeConfigStr()... json is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap<String, String> a = m25290a(jSONObject, "lateastMap");
            if (a != null) {
                this.f17491q = a;
            }
            HashMap<String, String> a2 = m25290a(jSONObject, "productMap");
            if (a2 != null) {
                this.f17492r = a2;
            }
        } catch (JSONException e) {
            C13479a.m54761a("DomainConfig", e);
        }
    }

    /* renamed from: a */
    private void m25291a(String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("DomainConfig", "parseMainDomain()...domainCharacteristicStr is empty");
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("common");
            if (optJSONObject != null) {
                this.f17494t = optJSONObject.optString("mainDomain");
            }
        } catch (JSONException e) {
            C13479a.m54758a("DomainConfig", "parseMainDomain()...error = " + e);
        }
        C13479a.m54764b("DomainConfig", "parseMainDomain()...mainDomain = " + this.f17494t);
    }

    /* renamed from: e */
    private void m25301e(String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("DomainConfig", "parseDomainConfig()... json is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String[] g = m25304g(jSONObject);
            if (g != null) {
                this.f17475a = g;
            }
            String[] f = m25303f(jSONObject);
            if (f != null) {
                this.f17476b = f;
            }
            String[] e = m25302e(jSONObject);
            if (e != null) {
                this.f17477c = e;
            }
            String[] h = m25305h(jSONObject);
            if (h != null) {
                this.f17490p = h;
            }
            this.f17480f = jSONObject.optString("h5PathPrefix");
            m25292a(jSONObject);
            this.f17481g = m25297c(jSONObject.optJSONObject("pathGenerator"));
            this.f17482h = m25295b(jSONObject.optJSONObject("pathMap"));
            this.f17489o = m25299d(jSONObject.optJSONObject("wikiDirectMap"));
            C13479a.m54764b("DomainConfig", String.format("DomainConfig()...mWebPathPrefix = %s\n mPathGenerator = %s\n mPathMap = %s\n pathList = %s", this.f17480f, this.f17481g.toString(), this.f17482h.toString(), Arrays.toString(this.f17475a)));
        } catch (JSONException e2) {
            C13479a.m54761a("DomainConfig", e2);
        }
    }

    /* renamed from: a */
    private void m25292a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("tokenPattern");
        String str = "/([\\w]{14,})";
        String str2 = "^(/space|/drive)?/(doc|docs|sheet|sheets|mindnote|mindnotes|slide|slides|file|bitable|base|folder|wiki|isv|docx)/[^\\/]{14,}(/)?";
        if (optJSONObject != null) {
            str2 = optJSONObject.optString("androidUrlReg", str2);
            this.f17493s = optJSONObject.optString("typeReg", "/(doc|docs|sheet|sheets|mindnote|mindnotes|slide|slides|file|bitable|base|folder|wiki|isv|docx)/");
            str = optJSONObject.optString("tokenReg", str);
        }
        try {
            this.f17486l = Pattern.compile(str2);
            this.f17487m = Pattern.compile(this.f17493s);
            this.f17488n = Pattern.compile(str);
        } catch (Exception e) {
            C13479a.m54761a("DomainConfig", e);
        }
        C13479a.m54764b("DomainConfig", String.format("parseProductPattern()...mUrlReg = %s\n mTypeReg = %s\n mTokenReg = %s", str2, this.f17493s, str));
    }

    /* renamed from: a */
    private String[] m25293a(String str, JSONObject jSONObject) {
        return m25294a(jSONObject.optJSONArray(str));
    }

    /* renamed from: a */
    private HashMap<String, String> m25290a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            C13479a.m54764b("DomainConfig", "parseJsonObj2Map()...jsonObject = null , key = " + str);
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, optJSONObject.optString(next));
        }
        C13479a.m54764b("DomainConfig", "parseJsonObj2Map()...map = " + hashMap.toString());
        return hashMap;
    }
}
