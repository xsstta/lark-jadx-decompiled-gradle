package com.bytedance.applog.manager;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.applog.C3368a;
import com.bytedance.applog.p200d.C3398b;
import com.bytedance.applog.util.AbstractC3463l;
import com.bytedance.applog.util.C3452b;
import com.bytedance.applog.util.C3469r;
import com.bytedance.applog.util.C3470s;
import com.bytedance.dr.C4000c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.manager.h */
public class C3436h {

    /* renamed from: f */
    private static final String[] f10925f = {"channel", "package", "app_version"};

    /* renamed from: a */
    private boolean f10926a;

    /* renamed from: b */
    private final Context f10927b;

    /* renamed from: c */
    private final C3435g f10928c;

    /* renamed from: d */
    private JSONObject f10929d;

    /* renamed from: e */
    private final ArrayList<AbstractC3431c> f10930e = new ArrayList<>(32);

    /* renamed from: g */
    private final SharedPreferences f10931g;

    /* renamed from: h */
    private AbstractC3463l f10932h;

    /* renamed from: i */
    private int f10933i = 0;

    /* renamed from: j */
    private boolean f10934j;

    /* renamed from: k */
    private boolean f10935k = false;

    /* renamed from: a */
    private static <T> T m14497a(Object obj, T t) {
        if (obj == null) {
            obj = (T) null;
        }
        return obj == null ? t : (T) obj;
    }

    /* renamed from: t */
    private JSONObject m14509t() {
        return this.f10929d;
    }

    /* renamed from: a */
    public AbstractC3463l mo13848a() {
        return this.f10932h;
    }

    /* renamed from: a */
    public void mo13853a(JSONObject jSONObject) {
        this.f10928c.mo13821c(jSONObject);
        m14502b(jSONObject);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x01aa A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo13855a(org.json.JSONObject r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
        // Method dump skipped, instructions count: 434
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.manager.C3436h.mo13855a(org.json.JSONObject, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public void mo13854a(boolean z) {
        this.f10935k = z;
        if (!mo13875p()) {
            m14504c("sim_serial_number", null);
        }
    }

    /* renamed from: p */
    public boolean mo13875p() {
        return !this.f10935k;
    }

    /* renamed from: b */
    public JSONObject mo13857b() {
        if (this.f10926a) {
            return m14509t();
        }
        return null;
    }

    /* renamed from: g */
    public String mo13866g() {
        return m14509t().optString("device_id", "");
    }

    /* renamed from: i */
    public String mo13868i() {
        return m14509t().optString("udid", "");
    }

    /* renamed from: j */
    public String mo13869j() {
        return m14509t().optString("install_id", "");
    }

    /* renamed from: k */
    public String mo13870k() {
        return m14509t().optString("ssid", "");
    }

    /* renamed from: l */
    public String mo13871l() {
        return m14509t().optString("clientudid", "");
    }

    /* renamed from: m */
    public String mo13872m() {
        return m14509t().optString("openudid", "");
    }

    /* renamed from: o */
    public long mo13874o() {
        return m14509t().optLong("register_time", 0);
    }

    /* renamed from: r */
    public void mo13877r() {
        m14507h(null);
        mo13858b("");
        mo13853a((JSONObject) null);
    }

    /* renamed from: s */
    public int mo13878s() {
        return this.f10931g.getInt("version_code", 0);
    }

    /* renamed from: h */
    public String mo13867h() {
        return m14509t().optString("aid", "");
    }

    /* renamed from: q */
    public String mo13876q() {
        if (this.f10926a) {
            return m14509t().optString("ab_sdk_version", "");
        }
        C3435g gVar = this.f10928c;
        if (gVar != null) {
            return gVar.mo13841t();
        }
        return "";
    }

    /* renamed from: u */
    private JSONObject m14510u() {
        if (this.f10926a) {
            return m14509t().optJSONObject("custom");
        }
        if (this.f10928c != null) {
            try {
                return new JSONObject(this.f10928c.mo13840s());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public int mo13859c() {
        int i;
        if (this.f10926a) {
            i = m14509t().optInt("version_code", -1);
        } else {
            i = -1;
        }
        for (int i2 = 0; i2 < 3 && i == -1; i2++) {
            mo13862e();
            if (this.f10926a) {
                i = m14509t().optInt("version_code", -1);
            } else {
                i = -1;
            }
        }
        return i;
    }

    /* renamed from: f */
    public String mo13864f() {
        String str = "";
        if (this.f10926a) {
            str = m14509t().optString("user_unique_id", str);
        } else {
            C3435g gVar = this.f10928c;
            if (gVar != null) {
                str = gVar.mo13842u();
            }
        }
        if (TextUtils.isEmpty(str)) {
            return mo13866g();
        }
        return str;
    }

    /* renamed from: d */
    public String mo13861d() {
        String optString = this.f10926a ? m14509t().optString("app_version", null) : null;
        for (int i = 0; i < 3 && optString == null; i++) {
            mo13862e();
            optString = this.f10926a ? m14509t().optString("app_version", null) : null;
        }
        return optString;
    }

    /* renamed from: n */
    public int mo13873n() {
        String optString = m14509t().optString("device_id", "");
        String optString2 = m14509t().optString("install_id", "");
        String optString3 = m14509t().optString("bd_did", "");
        if ((!m14505d(optString) && !m14505d(optString3)) || !m14505d(optString2)) {
            return 0;
        }
        if (this.f10931g.getInt("version_code", 0) == m14509t().optInt("version_code", -1)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: e */
    public boolean mo13862e() {
        boolean z;
        synchronized (this.f10930e) {
            if (this.f10930e.size() == 0) {
                this.f10930e.add(new C3432d(this.f10927b));
                this.f10930e.add(new C3434f(this.f10927b, this.f10928c));
                this.f10930e.add(new C3438j(this.f10927b));
                this.f10930e.add(new C3439k(this.f10927b));
                this.f10930e.add(new C3445q(this.f10927b, this.f10928c, this));
                this.f10930e.add(new C3440l(this.f10927b));
                this.f10930e.add(new C3443o(this.f10927b, this.f10928c));
                this.f10930e.add(new C3444p());
                this.f10930e.add(new C3446r(this.f10928c, this));
                this.f10930e.add(new C3447s(this.f10927b));
                this.f10930e.add(new C3448t(this.f10927b));
                this.f10930e.add(new C3437i(this.f10927b, this));
                this.f10930e.add(new C3441m(this.f10927b));
                this.f10930e.add(new C3442n(this.f10927b, this.f10928c));
                this.f10930e.add(new C3433e(this.f10927b, this.f10928c));
                this.f10930e.add(new C3429a(this.f10927b));
            }
        }
        JSONObject t = m14509t();
        JSONObject jSONObject = new JSONObject();
        C3470s.m14681b(jSONObject, t);
        Iterator<AbstractC3431c> it = this.f10930e.iterator();
        boolean z2 = true;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            AbstractC3431c next = it.next();
            if (!next.f10905a || next.f10907c || m14501a(next)) {
                try {
                    next.f10905a = next.mo13788a(jSONObject);
                } catch (JSONException e) {
                    C3469r.m14667a(e);
                } catch (SecurityException e2) {
                    if (!next.f10906b) {
                        i++;
                        C3469r.m14668b("loadHeader, " + this.f10933i, e2);
                        if (!next.f10905a && this.f10933i > 10) {
                            next.f10905a = true;
                        }
                    }
                }
                if (!next.f10905a && !next.f10906b) {
                    i2++;
                }
            }
            if (next.f10905a || next.f10906b) {
                z = true;
            } else {
                z = false;
            }
            z2 &= z;
        }
        if (z2) {
            String[] strArr = f10925f;
            for (String str : strArr) {
                boolean isEmpty = TextUtils.isEmpty(jSONObject.optString(str));
                z2 &= !isEmpty;
                if (isEmpty) {
                    C3469r.m14668b("loadHeader, " + this.f10926a + ", " + str, null);
                }
            }
        }
        JSONObject jSONObject2 = this.f10929d;
        this.f10929d = jSONObject;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next2 = keys.next();
            m14504c(next2, jSONObject2.opt(next2));
        }
        this.f10926a = z2;
        if (C3469r.f10990a) {
            C3469r.m14666a("loadHeader, " + this.f10926a + ", " + this.f10933i + ", " + this.f10929d.toString(), (Throwable) null);
        } else {
            C3469r.m14670d("loadHeader, " + this.f10926a + ", " + this.f10933i, null);
        }
        if (i > 0 && i == i2) {
            this.f10933i++;
            if (mo13873n() != 0) {
                this.f10933i += 10;
            }
        }
        if (this.f10926a) {
            C3452b.m14578a().mo13630a(C3368a.m14046i(), mo13869j(), mo13870k());
        }
        return this.f10926a;
    }

    /* renamed from: a */
    public void mo13850a(Account account) {
        this.f10932h.mo13901a(account);
    }

    /* renamed from: c */
    private void m14503c(JSONObject jSONObject) {
        if (m14504c("custom", jSONObject)) {
            this.f10928c.mo13818b(jSONObject);
        }
    }

    /* renamed from: h */
    private void m14507h(String str) {
        if (m14504c("ab_sdk_version", str)) {
            this.f10928c.mo13810a(str);
        }
    }

    /* renamed from: c */
    public boolean mo13860c(String str) {
        if (!m14504c("user_unique_id", str)) {
            return false;
        }
        this.f10928c.mo13817b(str);
        return true;
    }

    /* renamed from: e */
    public boolean mo13863e(String str) {
        if (!m14504c("app_language", str)) {
            return false;
        }
        this.f10928c.mo13823d(str);
        return true;
    }

    /* renamed from: f */
    public boolean mo13865f(String str) {
        if (!m14504c("app_region", str)) {
            return false;
        }
        this.f10928c.mo13826e(str);
        return true;
    }

    /* renamed from: a */
    private String m14498a(Set<String> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static boolean m14505d(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str) || "unknown".equalsIgnoreCase(str) || "Null".equalsIgnoreCase(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = true;
                break;
            } else if (str.charAt(i) != '0') {
                break;
            } else {
                i++;
            }
        }
        return !z;
    }

    /* renamed from: g */
    private Set<String> m14506g(String str) {
        String[] split;
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(str) && (split = str.split(",")) != null && split.length > 0) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2)) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    private synchronized void m14502b(JSONObject jSONObject) {
        if (jSONObject == null) {
            C3469r.m14668b("null abconfig", null);
        }
        String optString = m14509t().optString("ab_sdk_version");
        if (!TextUtils.isEmpty(optString)) {
            Set<String> g = m14506g(optString);
            HashSet hashSet = new HashSet();
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next instanceof String) {
                        String str = next;
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                hashSet.add(jSONObject.getJSONObject(str).optString("vid"));
                            } catch (JSONException e) {
                                C3469r.m14667a(e);
                            }
                        }
                    }
                }
            }
            String y = this.f10928c.mo13846y();
            hashSet.addAll(m14506g(y));
            g.retainAll(hashSet);
            String a = m14498a(g);
            m14507h(a);
            if (!TextUtils.equals(optString, a)) {
                m14499a(a, y);
            }
        }
    }

    /* renamed from: i */
    private synchronized void m14508i(String str) {
        String optString = m14509t().optString("ab_sdk_version");
        if (!TextUtils.isEmpty(optString)) {
            String[] split = optString.split(",");
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && str2.equals(str)) {
                    if (C3469r.f10990a) {
                        C3469r.m14666a("addExposedVid ready added " + optString, (Throwable) null);
                    }
                    return;
                }
            }
            str = optString + "," + str;
        }
        m14507h(str);
        m14499a(str, this.f10928c.mo13846y());
    }

    /* renamed from: a */
    private boolean m14501a(AbstractC3431c cVar) {
        boolean z;
        if (this.f10928c.mo13843v() || !cVar.f10908d) {
            z = false;
        } else {
            z = true;
        }
        C3469r.m14666a("needSyncFromSub " + cVar + " " + z, (Throwable) null);
        return z;
    }

    /* renamed from: b */
    public synchronized void mo13858b(String str) {
        Set<String> g = m14506g(this.f10928c.mo13846y());
        Set<String> g2 = m14506g(m14509t().optString("ab_sdk_version"));
        g2.removeAll(g);
        g2.addAll(m14506g(str));
        this.f10928c.mo13820c(str);
        m14507h(m14498a(g2));
    }

    /* renamed from: a */
    public void mo13851a(String str) {
        this.f10932h.mo13902a(this.f10927b, str);
    }

    /* renamed from: a */
    public void mo13852a(HashMap<String, Object> hashMap) {
        JSONException e;
        JSONObject jSONObject = null;
        if (hashMap != null && !hashMap.isEmpty()) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONObject u = m14510u();
                    if (u != null) {
                        C3470s.m14681b(jSONObject2, u);
                    }
                    for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                        if (!TextUtils.isEmpty(entry.getKey())) {
                            jSONObject2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject = jSONObject2;
                } catch (JSONException e2) {
                    e = e2;
                    jSONObject = jSONObject2;
                    C3469r.m14667a(e);
                    m14503c(jSONObject);
                }
            } catch (JSONException e3) {
                e = e3;
                C3469r.m14667a(e);
                m14503c(jSONObject);
            }
        }
        m14503c(jSONObject);
    }

    public C3436h(Context context, C3435g gVar) {
        this.f10927b = context;
        this.f10928c = gVar;
        this.f10931g = gVar.mo13831j();
        this.f10929d = new JSONObject();
        C4000c.m16654a(context);
        this.f10932h = DeviceRegisterParameterFactory.getProvider(context, gVar);
    }

    /* renamed from: b */
    public <T> T mo13856b(String str, T t) {
        JSONObject optJSONObject = this.f10928c.mo13845x().optJSONObject(str);
        if (optJSONObject == null) {
            return t;
        }
        String optString = optJSONObject.optString("vid");
        Object opt = optJSONObject.opt("val");
        m14508i(optString);
        return (T) m14497a(opt, t);
    }

    /* renamed from: a */
    private void m14499a(String str, String str2) {
        if (this.f10928c.mo13847z() && this.f10928c.mo13816b().mo13727G()) {
            Set<String> g = m14506g(str);
            g.removeAll(m14506g(str2));
            C3452b.m14578a().mo13629a(m14498a(g), str2);
        }
    }

    /* renamed from: c */
    private boolean m14504c(String str, Object obj) {
        boolean z;
        Object opt = m14509t().opt(str);
        if ((obj == null || obj.equals(opt)) && (obj != null || opt == null)) {
            z = false;
        } else {
            synchronized (this) {
                try {
                    JSONObject jSONObject = this.f10929d;
                    JSONObject jSONObject2 = new JSONObject();
                    C3470s.m14681b(jSONObject2, jSONObject);
                    jSONObject2.put(str, obj);
                    this.f10929d = jSONObject2;
                } catch (JSONException e) {
                    C3469r.m14667a(e);
                }
            }
            z = true;
        }
        C3469r.m14666a("updateHeader, " + str + ", " + opt + ", " + obj, (Throwable) null);
        return z;
    }

    /* renamed from: a */
    public <T> T mo13849a(String str, T t) {
        return (T) C3398b.m14188a(m14509t(), str, t);
    }

    /* renamed from: a */
    static void m14500a(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put(str, str2);
        }
    }
}
