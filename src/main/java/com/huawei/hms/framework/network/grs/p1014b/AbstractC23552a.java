package com.huawei.hms.framework.network.grs.p1014b;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.local.model.C23590a;
import com.huawei.hms.framework.network.grs.local.model.C23591b;
import com.huawei.hms.framework.network.grs.local.model.C23592c;
import com.huawei.hms.framework.network.grs.local.model.C23593d;
import com.huawei.hms.framework.network.grs.p1018d.C23584c;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.framework.network.grs.b.a */
public abstract class AbstractC23552a {

    /* renamed from: a */
    protected C23590a f58051a;

    /* renamed from: b */
    protected List<C23591b> f58052b;

    /* renamed from: c */
    protected Map<String, String> f58053c = new ConcurrentHashMap(16);

    /* renamed from: d */
    protected boolean f58054d = false;

    /* renamed from: e */
    protected Set<String> f58055e = new HashSet(16);

    /* renamed from: a */
    private int m85413a(Context context) {
        int i = -1;
        try {
            String[] list = context.getAssets().list("");
            if (list != null && list.length > 0) {
                for (String str : list) {
                    if (Pattern.matches("^grs_sdk_global_route_config_[a-zA-Z]+\\.json$", str) && m85417g(C23584c.m85559a(str, context)) == 0) {
                        Logger.m85371i("AbstractLocalManager", "load SDK_CONFIG_FILE sucess.");
                        i = 0;
                    }
                }
            }
        } catch (IOException unused) {
            Logger.m85375w("AbstractLocalManager", "list assets files fail,please check if according to our standard config json files.");
        }
        return i;
    }

    /* renamed from: a */
    private int m85414a(String str, Context context) {
        if (m85416f(C23584c.m85559a(str, context)) != 0) {
            return -1;
        }
        Logger.m85371i("AbstractLocalManager", "load APP_CONFIG_FILE success.");
        return 0;
    }

    /* renamed from: a */
    private Map<String, String> m85415a(List<C23591b> list, GrsBaseInfo grsBaseInfo) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        concurrentHashMap.put("no_route_country", "no-country");
        for (C23591b bVar : list) {
            if (bVar.mo82947a().contains(grsBaseInfo.getIssueCountry())) {
                concurrentHashMap.put(grsBaseInfo.getIssueCountry(), bVar.mo82950b());
            }
            if (bVar.mo82947a().contains(grsBaseInfo.getRegCountry())) {
                concurrentHashMap.put(grsBaseInfo.getRegCountry(), bVar.mo82950b());
            }
            if (bVar.mo82947a().contains(grsBaseInfo.getSerCountry())) {
                concurrentHashMap.put(grsBaseInfo.getSerCountry(), bVar.mo82950b());
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: f */
    private int m85416f(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int b = mo82861b(str);
        if (b != 0) {
            return b;
        }
        int a = mo82853a(str);
        return a != 0 ? a : mo82865e(str);
    }

    /* renamed from: g */
    private int m85417g(String str) {
        int c;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        List<C23591b> list = this.f58052b;
        return ((list == null || list.isEmpty()) && (c = mo82863c(str)) != 0) ? c : mo82864d(str);
    }

    /* renamed from: a */
    public abstract int mo82853a(String str);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo82854a(String str, Context context, boolean z) {
        if (m85414a(str, context) != 0 && z) {
            return -1;
        }
        m85413a(context);
        return 0;
    }

    /* renamed from: a */
    public C23590a mo82855a() {
        return this.f58051a;
    }

    /* renamed from: a */
    public String mo82856a(GrsBaseInfo grsBaseInfo, String str, String str2) {
        Map<String, String> a = mo82858a(grsBaseInfo, str);
        if (a != null) {
            return a.get(str2);
        }
        Logger.m85377w("AbstractLocalManager", "addresses not found by routeby in local config{%s}", str);
        return null;
    }

    /* renamed from: a */
    public abstract List<C23591b> mo82857a(JSONArray jSONArray, JSONObject jSONObject);

    /* renamed from: a */
    public Map<String, String> mo82858a(GrsBaseInfo grsBaseInfo, String str) {
        if (!this.f58054d) {
            return null;
        }
        C23590a aVar = this.f58051a;
        if (aVar == null) {
            Logger.m85375w("AbstractLocalManager", "application data is null.");
            return null;
        }
        C23592c a = aVar.mo82941a(str);
        if (a == null) {
            Logger.m85377w("AbstractLocalManager", "service not found in local config{%s}", str);
            return null;
        }
        String a2 = C23557f.m85445a(a.mo82959c(), grsBaseInfo);
        if (a2 == null) {
            Logger.m85377w("AbstractLocalManager", "country not found by routeby in local config{%s}", a.mo82959c());
            return null;
        }
        List<C23591b> a3 = a.mo82954a();
        C23593d a4 = a.mo82953a(((a3 == null || a3.size() == 0) ? this.f58053c : m85415a(a3, grsBaseInfo)).get(a2));
        if (a4 == null) {
            return null;
        }
        return a4.mo82961a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008b A[LOOP:2: B:18:0x0085->B:20:0x008b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo82859a(org.json.JSONArray r14) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.p1014b.AbstractC23552a.mo82859a(org.json.JSONArray):void");
    }

    /* renamed from: a */
    public boolean mo82860a(GrsBaseInfo grsBaseInfo) {
        List<C23591b> list = this.f58052b;
        if (list == null || list.isEmpty()) {
            return false;
        }
        this.f58053c.put("no_route_country", "no-country");
        for (C23591b bVar : this.f58052b) {
            if (bVar.mo82947a().contains(grsBaseInfo.getIssueCountry())) {
                this.f58053c.put(grsBaseInfo.getIssueCountry(), bVar.mo82950b());
            }
            if (bVar.mo82947a().contains(grsBaseInfo.getRegCountry())) {
                this.f58053c.put(grsBaseInfo.getRegCountry(), bVar.mo82950b());
            }
            if (bVar.mo82947a().contains(grsBaseInfo.getSerCountry())) {
                this.f58053c.put(grsBaseInfo.getSerCountry(), bVar.mo82950b());
            }
        }
        return true;
    }

    /* renamed from: b */
    public abstract int mo82861b(String str);

    /* renamed from: b */
    public boolean mo82862b() {
        return this.f58054d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo82863c(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.p1014b.AbstractC23552a.mo82863c(java.lang.String):int");
    }

    /* renamed from: d */
    public int mo82864d(String str) {
        try {
            mo82859a(new JSONObject(str).getJSONArray("services"));
            return 0;
        } catch (JSONException e) {
            Logger.m85376w("AbstractLocalManager", "parse 2.0 services failed maybe because of json style.please check!", e);
            return -1;
        }
    }

    /* renamed from: e */
    public abstract int mo82865e(String str);
}
