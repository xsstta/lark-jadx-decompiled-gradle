package com.bytedance.applog.manager;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.applog.C3424j;
import com.bytedance.applog.p201e.AbstractC3402b;
import com.bytedance.applog.p201e.C3411e;
import com.bytedance.applog.p201e.C3413g;
import com.bytedance.applog.util.C3469r;
import com.bytedance.applog.util.C3470s;
import com.bytedance.dr.AbstractC4018m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.manager.g */
public class C3435g {

    /* renamed from: a */
    private final Context f10913a;

    /* renamed from: b */
    private final C3424j f10914b;

    /* renamed from: c */
    private final SharedPreferences f10915c;

    /* renamed from: d */
    private final SharedPreferences f10916d;

    /* renamed from: e */
    private final SharedPreferences f10917e;

    /* renamed from: f */
    private volatile JSONObject f10918f;

    /* renamed from: g */
    private volatile String f10919g;

    /* renamed from: h */
    private volatile JSONObject f10920h;

    /* renamed from: i */
    private final HashSet<String> f10921i;

    /* renamed from: j */
    private final HashSet<String> f10922j;

    /* renamed from: k */
    private volatile HashSet<String> f10923k;

    /* renamed from: l */
    private int f10924l = 1;

    /* renamed from: b */
    public C3424j mo13816b() {
        return this.f10914b;
    }

    /* renamed from: j */
    public SharedPreferences mo13831j() {
        return this.f10917e;
    }

    /* renamed from: l */
    public JSONObject mo13833l() {
        return this.f10920h;
    }

    /* renamed from: B */
    public boolean mo13790B() {
        return this.f10914b.mo13728H();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public String mo13794F() {
        return this.f10914b.mo13746c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo13795G() {
        return this.f10914b.mo13749d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public String mo13799K() {
        return this.f10914b.mo13768w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo13800L() {
        return this.f10914b.mo13771z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public int mo13801M() {
        return this.f10914b.mo13721A();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public int mo13802N() {
        return this.f10914b.mo13722B();
    }

    /* renamed from: O */
    public String mo13803O() {
        return this.f10914b.mo13769x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public String mo13804P() {
        return this.f10914b.mo13770y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public String mo13805Q() {
        return this.f10914b.mo13723C();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public CharSequence mo13806R() {
        return this.f10914b.mo13724D();
    }

    /* renamed from: S */
    public AbstractC4018m mo13807S() {
        return this.f10914b.mo13733M();
    }

    /* renamed from: a */
    public boolean mo13815a() {
        return this.f10914b.mo13745b();
    }

    /* renamed from: c */
    public boolean mo13822c() {
        return this.f10914b.mo13762q();
    }

    /* renamed from: d */
    public boolean mo13824d() {
        return this.f10914b.mo13763r();
    }

    /* renamed from: e */
    public Account mo13825e() {
        return this.f10914b.mo13764s();
    }

    /* renamed from: f */
    public boolean mo13827f() {
        return this.f10914b.mo13765t();
    }

    /* renamed from: g */
    public String mo13828g() {
        return this.f10914b.mo13766u();
    }

    /* renamed from: k */
    public boolean mo13832k() {
        return this.f10914b.mo13751f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public String mo13835n() {
        return this.f10914b.mo13752g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public String mo13836o() {
        return this.f10914b.mo13753h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo13837p() {
        return this.f10914b.mo13754i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public String mo13838q() {
        return this.f10914b.mo13755j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public String mo13839r() {
        return this.f10914b.mo13756k();
    }

    /* renamed from: A */
    public boolean mo13789A() {
        return this.f10917e.getBoolean("bav_log_collect", false);
    }

    /* renamed from: C */
    public long mo13791C() {
        return this.f10917e.getLong("session_interval", 30000);
    }

    /* renamed from: D */
    public long mo13792D() {
        return this.f10917e.getLong("batch_event_interval", 30000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public String mo13793E() {
        return this.f10915c.getString("app_track", null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public String mo13796H() {
        return this.f10917e.getString("user_agent", null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public String mo13797I() {
        return this.f10917e.getString("app_language", null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public String mo13798J() {
        return this.f10917e.getString("app_region", null);
    }

    /* renamed from: T */
    public long mo13808T() {
        return this.f10917e.getLong("fetch_interval", 21600000);
    }

    /* renamed from: h */
    public String mo13829h() {
        return this.f10916d.getString("session_last_day", "");
    }

    /* renamed from: i */
    public int mo13830i() {
        return this.f10916d.getInt("session_order", 0);
    }

    /* renamed from: m */
    public long mo13834m() {
        return this.f10917e.getLong("app_log_last_config_time", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public String mo13840s() {
        return this.f10915c.getString("header_custom_info", null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public String mo13841t() {
        return this.f10915c.getString("ab_sdk_version", "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public String mo13842u() {
        return this.f10915c.getString("user_unique_id", null);
    }

    /* renamed from: w */
    public long mo13844w() {
        return this.f10917e.getLong("abtest_fetch_interval", 0);
    }

    /* renamed from: z */
    public boolean mo13847z() {
        return this.f10917e.getBoolean("bav_ab_config", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public String mo13846y() {
        String str = this.f10919g;
        if (TextUtils.isEmpty(str)) {
            synchronized (this) {
                str = this.f10915c.getString("external_ab_version", "");
                this.f10919g = str;
            }
        }
        return str;
    }

    /* renamed from: U */
    private HashSet<String> m14437U() {
        HashSet<String> hashSet = this.f10923k;
        if (hashSet != null) {
            return hashSet;
        }
        try {
            JSONArray jSONArray = new JSONArray(this.f10917e.getString("real_time_events", "[]"));
            int length = jSONArray.length();
            HashSet<String> hashSet2 = new HashSet<>();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    hashSet2.add(string);
                }
            }
            return hashSet2;
        } catch (Throwable th) {
            C3469r.m14667a(th);
            return new HashSet<>();
        }
    }

    /* renamed from: v */
    public boolean mo13843v() {
        if (this.f10914b.mo13757l() == 0) {
            this.f10914b.mo13743a(!C3470s.m14672a(this.f10913a).contains(":"));
        }
        if (this.f10914b.mo13757l() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public JSONObject mo13845x() {
        JSONObject jSONObject = this.f10918f;
        if (jSONObject == null) {
            synchronized (this) {
                try {
                    jSONObject = new JSONObject(this.f10915c.getString("ab_configure", ""));
                } catch (JSONException unused) {
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                this.f10918f = jSONObject;
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo13814a(boolean z) {
        this.f10924l = z ? 1 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13810a(String str) {
        this.f10915c.edit().putString("ab_sdk_version", str).apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13817b(String str) {
        this.f10915c.edit().putString("user_unique_id", str).apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo13823d(String str) {
        this.f10917e.edit().putString("app_language", str).apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo13826e(String str) {
        this.f10917e.edit().putString("app_region", str).apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13818b(JSONObject jSONObject) {
        String str;
        SharedPreferences.Editor edit = this.f10915c.edit();
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = "";
        }
        edit.putString("header_custom_info", str).apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo13820c(String str) {
        C3469r.m14666a("setExternalAbVersion, " + str, (Throwable) null);
        this.f10915c.edit().putString("external_ab_version", str).apply();
        this.f10919g = null;
    }

    /* renamed from: a */
    public ArrayList<AbstractC3402b> mo13809a(ArrayList<AbstractC3402b> arrayList) {
        String str;
        String str2;
        Iterator<AbstractC3402b> it = arrayList.iterator();
        ArrayList<AbstractC3402b> arrayList2 = null;
        while (it.hasNext()) {
            AbstractC3402b next = it.next();
            if (next instanceof C3411e) {
                C3411e eVar = (C3411e) next;
                StringBuilder sb = new StringBuilder();
                sb.append(eVar.f10803k);
                if (!TextUtils.isEmpty(eVar.f10804l)) {
                    str2 = eVar.f10804l;
                } else {
                    str2 = "";
                }
                sb.append(str2);
                str = sb.toString();
            } else if (next instanceof C3413g) {
                str = ((C3413g) next).mo13711k();
            } else {
                str = "!_NO_NAME_!";
            }
            if (m14437U().contains(str)) {
                it.remove();
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    /* renamed from: b */
    public boolean mo13819b(ArrayList<AbstractC3402b> arrayList) {
        String str;
        if (arrayList == null || arrayList.size() == 0 || (this.f10921i.size() == 0 && this.f10922j.size() == 0)) {
            return true;
        }
        Iterator<AbstractC3402b> it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC3402b next = it.next();
            if (next instanceof C3411e) {
                C3411e eVar = (C3411e) next;
                StringBuilder sb = new StringBuilder();
                sb.append(eVar.f10803k);
                if (!TextUtils.isEmpty(eVar.f10804l)) {
                    str = eVar.f10804l;
                } else {
                    str = "";
                }
                sb.append(str);
                if (this.f10921i.contains(sb.toString())) {
                    it.remove();
                }
            } else if (this.f10922j.contains(((C3413g) next).mo13711k())) {
                it.remove();
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo13821c(JSONObject jSONObject) {
        String str;
        if (jSONObject == null) {
            str = "";
        } else {
            str = jSONObject.toString();
        }
        if (C3469r.f10990a) {
            C3469r.m14666a("setAbConfig, " + str, (Throwable) null);
        } else {
            C3469r.m14666a("setAbConfig", (Throwable) null);
        }
        this.f10915c.edit().putString("ab_configure", str).apply();
        this.f10918f = null;
    }

    /* renamed from: a */
    public void mo13813a(JSONObject jSONObject) {
        if (C3469r.f10990a) {
            C3469r.m14666a("setConfig, " + jSONObject.toString(), (Throwable) null);
        }
        this.f10920h = jSONObject;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.f10917e.edit();
        boolean z = false;
        long optInt = (long) jSONObject.optInt("session_interval", 0);
        if (optInt <= 0 || optInt > 604800) {
            edit.remove("session_interval");
        } else {
            edit.putLong("session_interval", optInt * 1000);
        }
        long optInt2 = (long) jSONObject.optInt("batch_event_interval", 0);
        if (optInt2 <= 0 || optInt2 > 604800) {
            edit.remove("batch_event_interval");
        } else {
            edit.putLong("batch_event_interval", optInt2 * 1000);
        }
        int optInt3 = jSONObject.optInt("send_launch_timely", 0);
        if (optInt3 <= 0 || ((long) optInt3) > 604800) {
            edit.remove("send_launch_timely");
        } else {
            edit.putInt("send_launch_timely", optInt3);
        }
        long optInt4 = (long) jSONObject.optInt("abtest_fetch_interval", 0);
        if (optInt4 <= 20 || optInt4 > 604800) {
            edit.remove("abtest_fetch_interval");
        } else {
            edit.putLong("abtest_fetch_interval", optInt4 * 1000);
        }
        boolean optBoolean = jSONObject.optBoolean("bav_log_collect", mo13790B());
        if (optBoolean) {
            edit.putBoolean("bav_log_collect", true);
        } else {
            edit.remove("bav_log_collect");
        }
        mo13814a(optBoolean);
        if (jSONObject.optBoolean("bav_ab_config", false)) {
            edit.putBoolean("bav_ab_config", true);
        } else {
            edit.remove("bav_ab_config");
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("real_time_events");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            edit.remove("real_time_events");
        } else {
            edit.putString("real_time_events", optJSONArray.toString());
        }
        this.f10923k = null;
        int optInt5 = jSONObject.optInt("bav_monitor_rate", 0);
        if (optInt5 <= 0 || optInt5 > 100) {
            edit.remove("bav_monitor_rate");
        } else {
            edit.putInt("bav_monitor_rate", optInt5);
        }
        int optInt6 = jSONObject.optInt("http_monitor_port", 0);
        if (optInt6 > 0) {
            edit.putInt("http_monitor_port", optInt6);
        }
        edit.putLong("app_log_last_config_time", currentTimeMillis);
        int optInt7 = jSONObject.optInt("forbid_report_phone_detail_info", -1);
        if (optInt7 >= 0) {
            if (optInt7 > 0) {
                z = true;
            }
            edit.putBoolean("orbid_report_phone_detail_info", z);
        }
        long optLong = jSONObject.optLong("fetch_interval", 21600) * 1000;
        if (optLong < 1800000 || optLong > 172800000) {
            optLong = 21600000;
        }
        edit.putLong("fetch_interval", optLong);
        edit.apply();
    }

    /* renamed from: a */
    public void mo13811a(String str, int i) {
        this.f10916d.edit().putString("session_last_day", str).putInt("session_order", i).apply();
    }

    public C3435g(Context context, C3424j jVar) {
        this.f10913a = context;
        this.f10914b = jVar;
        this.f10917e = context.getSharedPreferences(jVar.mo13732L(), 0);
        this.f10915c = context.getSharedPreferences("header_custom", 0);
        this.f10916d = context.getSharedPreferences("last_sp_session", 0);
        this.f10921i = new HashSet<>();
        this.f10922j = new HashSet<>();
    }

    /* renamed from: a */
    public void mo13812a(HashSet<String> hashSet, HashSet<String> hashSet2) {
        if (hashSet != null) {
            this.f10921i.addAll(hashSet);
        }
        if (hashSet2 != null) {
            this.f10922j.addAll(hashSet2);
        }
    }
}
