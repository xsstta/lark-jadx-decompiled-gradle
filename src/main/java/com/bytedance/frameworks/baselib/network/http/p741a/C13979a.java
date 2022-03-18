package com.bytedance.frameworks.baselib.network.http.p741a;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.a.a */
public class C13979a {

    /* renamed from: a */
    private volatile boolean f36520a;

    /* renamed from: b */
    private volatile boolean f36521b;

    /* renamed from: c */
    private volatile String f36522c;

    /* renamed from: d */
    private CopyOnWriteArraySet<String> f36523d;

    /* renamed from: e */
    private CopyOnWriteArraySet<String> f36524e;

    /* renamed from: f */
    private CopyOnWriteArraySet<String> f36525f;

    /* renamed from: g */
    private CopyOnWriteArraySet<Pattern> f36526g;

    /* renamed from: h */
    private CopyOnWriteArraySet<String> f36527h;

    /* renamed from: i */
    private CopyOnWriteArraySet<String> f36528i;

    /* renamed from: j */
    private CopyOnWriteArraySet<Pattern> f36529j;

    /* renamed from: k */
    private CopyOnWriteArraySet<String> f36530k;

    /* renamed from: b */
    public boolean mo51385b() {
        return this.f36520a;
    }

    /* renamed from: c */
    public boolean mo51386c() {
        return this.f36521b;
    }

    /* renamed from: d */
    public Set<String> mo51387d() {
        return this.f36523d;
    }

    /* renamed from: e */
    public Set<String> mo51388e() {
        return this.f36524e;
    }

    /* renamed from: f */
    public Set<String> mo51389f() {
        return this.f36525f;
    }

    /* renamed from: g */
    public Set<Pattern> mo51390g() {
        return this.f36526g;
    }

    /* renamed from: h */
    public Set<String> mo51391h() {
        return this.f36527h;
    }

    /* renamed from: i */
    public Set<String> mo51392i() {
        return this.f36528i;
    }

    /* renamed from: j */
    public Set<Pattern> mo51393j() {
        return this.f36529j;
    }

    /* renamed from: k */
    public Set<String> mo51394k() {
        return this.f36530k;
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.a.a$a */
    public static final class C13980a {

        /* renamed from: a */
        public boolean f36531a;

        /* renamed from: b */
        public boolean f36532b;

        /* renamed from: c */
        public CopyOnWriteArraySet<String> f36533c = new CopyOnWriteArraySet<>();

        /* renamed from: d */
        public CopyOnWriteArraySet<String> f36534d = new CopyOnWriteArraySet<>();

        /* renamed from: e */
        public CopyOnWriteArraySet<String> f36535e = new CopyOnWriteArraySet<>();

        /* renamed from: f */
        public CopyOnWriteArraySet<Pattern> f36536f = new CopyOnWriteArraySet<>();

        /* renamed from: g */
        public CopyOnWriteArraySet<String> f36537g = new CopyOnWriteArraySet<>();

        /* renamed from: h */
        public CopyOnWriteArraySet<String> f36538h = new CopyOnWriteArraySet<>();

        /* renamed from: i */
        public CopyOnWriteArraySet<Pattern> f36539i = new CopyOnWriteArraySet<>();

        /* renamed from: j */
        public CopyOnWriteArraySet<String> f36540j = new CopyOnWriteArraySet<>();

        /* renamed from: a */
        public C13979a mo51396a() {
            return new C13979a(this);
        }

        /* renamed from: a */
        public C13980a mo51395a(boolean z) {
            this.f36531a = z;
            return this;
        }
    }

    /* renamed from: a */
    public static C13980a m56522a() {
        return new C13980a();
    }

    public C13979a(C13980a aVar) {
        this.f36520a = aVar.f36531a;
        this.f36521b = aVar.f36532b;
        this.f36523d = aVar.f36533c;
        this.f36524e = aVar.f36534d;
        this.f36525f = aVar.f36535e;
        this.f36526g = aVar.f36536f;
        this.f36527h = aVar.f36537g;
        this.f36528i = aVar.f36538h;
        this.f36529j = aVar.f36539i;
        this.f36530k = aVar.f36540j;
    }

    /* renamed from: a */
    public void mo51384a(String str) {
        Logger.m15167d("CommonParamConfig", "onNetConfigChanged config: " + str);
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(this.f36522c) || !this.f36522c.equals(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    this.f36522c = str;
                    m56524b(jSONObject.optJSONArray("host_group"), this.f36523d);
                    m56524b(jSONObject.optJSONArray("min_params_exclude"), this.f36530k);
                    JSONObject optJSONObject = jSONObject.optJSONObject("L0_path");
                    if (optJSONObject != null) {
                        m56524b(optJSONObject.optJSONArray("equal_group"), this.f36524e);
                        m56524b(optJSONObject.optJSONArray("prefix_group"), this.f36525f);
                        m56523a(optJSONObject.optJSONArray("pattern_group"), this.f36526g);
                    }
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("L1_path");
                    if (optJSONObject2 != null) {
                        m56524b(optJSONObject2.optJSONArray("equal_group"), this.f36527h);
                        m56524b(optJSONObject2.optJSONArray("prefix_group"), this.f36528i);
                        m56523a(optJSONObject2.optJSONArray("pattern_group"), this.f36529j);
                    }
                } catch (Throwable unused) {
                }
            } else {
                Logger.m15167d("CommonParamConfig", "Config is same with local config, do not parse.");
            }
        }
    }

    /* renamed from: b */
    private static void m56524b(JSONArray jSONArray, Set<String> set) {
        if (!(jSONArray == null || set == null)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    set.add(jSONArray.getString(i));
                } catch (JSONException unused) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m56523a(JSONArray jSONArray, Set<Pattern> set) {
        if (!(jSONArray == null || set == null)) {
            HashSet hashSet = new HashSet();
            for (Pattern pattern : set) {
                hashSet.add(pattern.toString());
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string) && !hashSet.contains(string)) {
                        set.add(Pattern.compile(string, 2));
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        }
    }
}
