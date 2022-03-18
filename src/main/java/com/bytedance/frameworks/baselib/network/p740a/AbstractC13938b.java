package com.bytedance.frameworks.baselib.network.p740a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.retrofit2.client.Request;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.a.b */
public abstract class AbstractC13938b {

    /* renamed from: c */
    private static final String f36438c = "b";

    /* renamed from: a */
    private int f36439a;

    /* renamed from: b */
    private int f36440b;

    /* renamed from: d */
    private Set<String> f36441d = new HashSet();

    /* renamed from: e */
    private Set<String> f36442e = new HashSet();

    /* renamed from: f */
    private Set<String> f36443f = new HashSet();

    /* renamed from: g */
    private Set<Pattern> f36444g = new HashSet();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo51293a(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo51295a(Request request, Map<String, List<String>> map);

    /* renamed from: a */
    public int mo51292a() {
        return this.f36439a;
    }

    /* renamed from: a */
    private void m56408a(int i) {
        this.f36440b = i;
    }

    /* renamed from: a */
    private static boolean m56410a(Set<?> set) {
        if (set == null || set.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m56412b(Request request) {
        if (request.getQueryFilterPriority() > this.f36439a) {
            return false;
        }
        return true;
    }

    public AbstractC13938b(int i) {
        this.f36439a = i;
        this.f36440b = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo51297b(JSONObject jSONObject) {
        m56411b(jSONObject.optJSONArray("host_group"), this.f36441d);
        m56411b(jSONObject.optJSONArray("equal_group"), this.f36442e);
        m56411b(jSONObject.optJSONArray("prefix_group"), this.f36443f);
        m56409a(jSONObject.optJSONArray("pattern_group"), this.f36444g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo51294a(Request request) {
        boolean z;
        if (!m56410a(this.f36441d)) {
            Iterator<String> it = this.f36441d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (UrlUtils.matchPattern(request.getHost(), it.next())) {
                    break;
                }
            }
        } else {
            z = true;
        }
        if (!z) {
            String str = f36438c;
            Logger.m15167d(str, "Domain not match: " + request.getHost());
            return false;
        }
        String path = request.getPath();
        if (TextUtils.isEmpty(path)) {
            String str2 = f36438c;
            Logger.m15167d(str2, "Path is empty: " + path);
            return false;
        }
        int length = path.length();
        if (length > 1) {
            int i = length - 1;
            if (path.substring(i).equals("/")) {
                path = path.substring(0, i);
            }
        }
        if (!m56410a(this.f36442e) && this.f36442e.contains(path)) {
            return true;
        }
        if (!m56410a(this.f36443f)) {
            for (String str3 : this.f36443f) {
                if (path.startsWith(str3)) {
                    return true;
                }
            }
        }
        if (!m56410a(this.f36444g)) {
            for (Pattern pattern : this.f36444g) {
                if (pattern != null && pattern.matcher(path).matches()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m56411b(JSONArray jSONArray, Set<String> set) {
        if (!(jSONArray == null || set == null)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        set.add(string);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m56409a(JSONArray jSONArray, Set<Pattern> set) {
        if (!(jSONArray == null || set == null)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            set.add(Pattern.compile(string, 2));
                        } catch (Throwable unused) {
                        }
                    }
                } catch (JSONException unused2) {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m56413b(Request request, Map<String, List<String>> map) {
        if (!m56412b(request)) {
            return false;
        }
        return mo51295a(request, map);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo51296a(Request request, Map<String, List<String>> map, List<C13937a> list) {
        C13937a aVar = new C13937a();
        aVar.mo51287a(SystemClock.uptimeMillis());
        boolean b = m56413b(request, map);
        if (b) {
            request.setQueryFilterPriority(this.f36440b);
        }
        aVar.mo51288a(b);
        aVar.mo51286a(this.f36439a);
        aVar.mo51289b(SystemClock.uptimeMillis());
        list.add(aVar);
        return b;
    }

    /* renamed from: a */
    protected static AbstractC13938b m56407a(String str, int i, int i2, JSONObject jSONObject) {
        if (!str.equals("rm")) {
            return null;
        }
        C13941d dVar = new C13941d(i);
        dVar.mo51293a(jSONObject);
        dVar.m56408a(i2);
        return dVar;
    }
}
