package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class BaseDispatchAction {

    /* renamed from: i */
    private static final String f36931i = "BaseDispatchAction";

    /* renamed from: a */
    protected List<String> f36932a = new ArrayList();

    /* renamed from: b */
    protected List<String> f36933b = new ArrayList();

    /* renamed from: c */
    protected List<String> f36934c = new ArrayList();

    /* renamed from: d */
    protected List<String> f36935d = new ArrayList();

    /* renamed from: e */
    protected List<String> f36936e = new ArrayList();

    /* renamed from: f */
    protected List<String> f36937f = new ArrayList();

    /* renamed from: g */
    protected String f36938g;

    /* renamed from: h */
    protected int f36939h;

    /* renamed from: j */
    private long f36940j;

    /* renamed from: k */
    private long f36941k;

    /* renamed from: l */
    private int f36942l;

    /* renamed from: m */
    private long f36943m;

    /* renamed from: n */
    private List<String> f36944n = new ArrayList();

    public enum DispatchResultEnum {
        DISPATCH_NONE,
        DISPATCH_HIT,
        DISPATCH_DROP,
        DISPATCH_DELAY
    }

    /* renamed from: a */
    public abstract boolean mo51736a(JSONObject jSONObject, String str, long j);

    /* renamed from: b */
    public long mo51737b() {
        return this.f36943m;
    }

    /* renamed from: c */
    public String mo51738c() {
        return this.f36938g;
    }

    /* renamed from: d */
    public boolean mo51739d() {
        return mo51746e();
    }

    /* renamed from: e */
    private boolean mo51746e() {
        long j = this.f36940j;
        if (j == 0 && this.f36941k == 0) {
            return true;
        }
        if (!(j == -1 || this.f36941k == -1)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > this.f36940j && currentTimeMillis < this.f36941k) {
                return true;
            }
            Logger.m15167d(f36931i, "current time is out action lifecycle");
        }
        return false;
    }

    /* renamed from: a */
    public int mo51732a() {
        return this.f36942l;
    }

    /* renamed from: a */
    private void m56926a(int i) {
        this.f36942l = i;
    }

    /* renamed from: a */
    private void m56927a(long j) {
        this.f36943m = j;
    }

    /* renamed from: b */
    private void m56931b(int i) {
        if (i < 0) {
            this.f36939h = Integer.MAX_VALUE;
        } else {
            this.f36939h = i;
        }
    }

    /* renamed from: a */
    private void m56929a(List<String> list) {
        this.f36944n = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo51733a(JSONObject jSONObject) {
        m56930a(jSONObject, "host_group", this.f36932a);
        m56930a(jSONObject, "equal_group", this.f36933b);
        m56930a(jSONObject, "prefixes_group", this.f36934c);
        m56930a(jSONObject, "contain_group", this.f36935d);
        m56930a(jSONObject, "pattern_group", this.f36936e);
        m56930a(jSONObject, "url_group", this.f36937f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo51734a(Uri uri) {
        boolean z;
        if (!this.f36932a.isEmpty()) {
            Iterator<String> it = this.f36932a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (UrlUtils.matchPattern(uri.getHost(), it.next())) {
                    break;
                }
            }
        } else {
            z = true;
        }
        if (!z) {
            Logger.m15167d(f36931i, "host group is not match");
            return false;
        }
        String path = uri.getPath();
        if (path != null) {
            if (!this.f36933b.isEmpty()) {
                for (String str : this.f36933b) {
                    if (path.equals(str)) {
                        String str2 = f36931i;
                        Logger.m15167d(str2, "path equal hit: " + str);
                        return true;
                    }
                }
            }
            if (!this.f36934c.isEmpty()) {
                for (String str3 : this.f36934c) {
                    if (path.startsWith(str3)) {
                        String str4 = f36931i;
                        Logger.m15167d(str4, "path prefix hit: " + str3);
                        return true;
                    }
                }
            }
            if (!this.f36935d.isEmpty()) {
                for (String str5 : this.f36935d) {
                    if (path.contains(str5)) {
                        String str6 = f36931i;
                        Logger.m15167d(str6, "path contain hit: " + str5);
                        return true;
                    }
                }
            }
            if (!this.f36936e.isEmpty()) {
                for (String str7 : this.f36936e) {
                    if (path.matches(str7)) {
                        String str8 = f36931i;
                        Logger.m15167d(str8, "path pattern hit: " + str7);
                        return true;
                    }
                }
            }
        }
        if (!this.f36937f.isEmpty()) {
            for (String str9 : this.f36937f) {
                if (uri.toString().matches(str9)) {
                    String str10 = f36931i;
                    Logger.m15167d(str10, "full url hit: " + str9);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo51735a(C14075j jVar) {
        if (jVar.mo51769c() > this.f36942l) {
            String str = f36931i;
            Logger.m15167d(str, "jump action: " + this.f36938g + ", dispatchPriority: " + jVar.mo51769c() + ", actionPriority: " + this.f36942l);
            return false;
        } else if (this.f36944n.isEmpty() || TextUtils.isEmpty(jVar.mo51766a()) || this.f36944n.contains(jVar.mo51766a())) {
            return mo51746e();
        } else {
            String str2 = f36931i;
            Logger.m15167d(str2, "request method not support: " + jVar.mo51766a());
            return false;
        }
    }

    /* renamed from: a */
    private void m56928a(long j, long j2) {
        this.f36940j = j;
        this.f36941k = j2;
    }

    /* renamed from: a */
    private void m56930a(JSONObject jSONObject, String str, List<String> list) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    list.add(optString);
                }
            }
        }
    }

    /* renamed from: a */
    public static BaseDispatchAction m56925a(String str, JSONObject jSONObject, int i, long j, long j2, long j3, String str2, long j4, List<String> list, int i2) {
        BaseDispatchAction baseDispatchAction;
        if (str.equals("tc")) {
            baseDispatchAction = new C14071g();
        } else {
            baseDispatchAction = null;
        }
        if (str.equals("dispatch")) {
            baseDispatchAction = new C14069e();
        }
        if (str.equals("delay")) {
            baseDispatchAction = new C14066b();
        }
        if (baseDispatchAction == null) {
            return null;
        }
        baseDispatchAction.m56926a(i);
        baseDispatchAction.m56928a(j, j2);
        baseDispatchAction.m56927a(j3);
        baseDispatchAction.m56929a(list);
        baseDispatchAction.m56931b(i2);
        if (baseDispatchAction.mo51736a(jSONObject, str2, j4)) {
            return baseDispatchAction;
        }
        return null;
    }
}
