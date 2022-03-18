package com.bytedance.frameworks.baselib.network.http.p741a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.retrofit2.client.Request;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.frameworks.baselib.network.http.a.b */
public class C13981b {

    /* renamed from: a */
    private static volatile C13981b f36541a;

    /* renamed from: b */
    private C13979a f36542b;

    /* renamed from: c */
    private volatile boolean f36543c;

    private C13981b() {
    }

    /* renamed from: b */
    public C13979a mo51399b() {
        return this.f36542b;
    }

    /* renamed from: a */
    public static C13981b m56538a() {
        if (f36541a == null) {
            synchronized (C13981b.class) {
                if (f36541a == null) {
                    f36541a = new C13981b();
                }
            }
        }
        return f36541a;
    }

    /* renamed from: a */
    private static boolean m56540a(Set<?> set) {
        if (set == null || set.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo51398a(C13979a aVar) {
        if (this.f36542b != null) {
            throw new IllegalStateException("CommonParamConfig has been initialized before.");
        } else if (aVar != null) {
            this.f36542b = aVar;
        } else {
            throw new IllegalArgumentException("config is null, please init CommonParamConfig before.");
        }
    }

    /* renamed from: a */
    public String mo51397a(Request request, String str) {
        boolean z;
        Set<String> d = this.f36542b.mo51387d();
        if (m56540a(d)) {
            return str;
        }
        Iterator<String> it = d.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (UrlUtils.matchPattern(request.getHost(), it.next())) {
                z = true;
                break;
            }
        }
        if (!z) {
            Logger.m15167d("CommonParamManager", "Domain not match: " + str);
            return str;
        } else if (TextUtils.isEmpty(request.getPath())) {
            Logger.m15167d("CommonParamManager", "Path is empty: " + request.getPath());
            return str;
        } else if (this.f36543c) {
            Logger.m15167d("CommonParamManager", "ForceAddMinParams match url: " + str);
            return m56539a(NetworkParams.getCommonParamsByLevel(1), str, true);
        } else if (m56541a(this.f36542b.mo51388e(), this.f36542b.mo51389f(), this.f36542b.mo51390g(), request.getPath())) {
            Logger.m15167d("CommonParamManager", "AddMaxParamsPathFilterMap match: " + str);
            return m56539a(NetworkParams.getCommonParamsByLevel(0), str, false);
        } else if (m56541a(this.f36542b.mo51391h(), this.f36542b.mo51392i(), this.f36542b.mo51393j(), request.getPath())) {
            Logger.m15167d("CommonParamManager", "AddMinParamsPathFilterMap match: " + str);
            return m56539a(NetworkParams.getCommonParamsByLevel(1), str, true);
        } else if (this.f36542b.mo51386c()) {
            Logger.m15167d("CommonParamManager", "addMinCommonParamsWhenDomainMatch is enabled.");
            return m56539a(NetworkParams.getCommonParamsByLevel(1), str, true);
        } else {
            Logger.m15167d("CommonParamManager", "add max common params by default.");
            return m56539a(NetworkParams.getCommonParamsByLevel(0), str, false);
        }
    }

    /* renamed from: a */
    private String m56539a(Map<String, String> map, String str, boolean z) {
        if (map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append(ContainerUtils.FIELD_DELIMITER);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                Set<String> k = this.f36542b.mo51394k();
                if (!z || m56540a(k) || !k.contains(entry.getKey())) {
                    arrayList.add(new Pair(entry.getKey(), entry.getValue()));
                }
            }
        }
        sb.append(NetworkUtils.format(arrayList, "UTF-8"));
        Logger.m15167d("CommonParamManager", "addCommonParamsByQueryMap url: " + sb.toString());
        return sb.toString();
    }

    /* renamed from: a */
    private boolean m56541a(Set<String> set, Set<String> set2, Set<Pattern> set3, String str) {
        if (!m56540a(set)) {
            for (String str2 : set) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        if (!m56540a(set2)) {
            for (String str3 : set2) {
                if (str.startsWith(str3)) {
                    return true;
                }
            }
        }
        if (m56540a(set3)) {
            return false;
        }
        for (Pattern pattern : set3) {
            if (pattern != null && pattern.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }
}
