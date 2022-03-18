package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.DnsRecord;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.p744a.C14033a;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.p744a.C14034b;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.p744a.C14035c;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.p744a.C14036d;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.c */
public class CallableC14043c implements Callable<Void> {

    /* renamed from: a */
    private static final String f36812a = "c";

    /* renamed from: b */
    private final String f36813b;

    /* renamed from: c */
    private final C14032a f36814c;

    /* renamed from: d */
    private String f36815d;

    /* renamed from: e */
    private List<String> f36816e = new ArrayList();

    /* renamed from: f */
    private List<String> f36817f = new ArrayList();

    /* renamed from: g */
    private DnsRecord.CacheStaleReason f36818g;

    /* renamed from: h */
    private int f36819h = 0;

    /* renamed from: i */
    private final WeakHandler f36820i;

    /* renamed from: a */
    public Void call() {
        String str;
        String[] split = this.f36815d.split(",");
        for (String str2 : split) {
            this.f36816e.add(str2);
            this.f36817f.add(str2);
        }
        Logger.m15167d(f36812a, "Start httpdns resolve for host : " + this.f36816e);
        String f = C14041b.m56829a().mo51700f();
        if (C14041b.m56829a().mo51701g().size() == 0) {
            this.f36814c.mo51663e();
        }
        if (!C14033a.m56814a(f) || this.f36814c.mo51657c().get() >= 2) {
            str = null;
        } else {
            str = m56861a(f);
            if (str == null) {
                this.f36814c.mo51661d();
            }
        }
        if (str == null) {
            Iterator<String> it = C14041b.m56829a().mo51701g().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (C14035c.m56819d(next) || C14035c.m56818c(next)) {
                    String a = m56861a(next);
                    if (a != null) {
                        m56863b(a);
                        break;
                    }
                    Logger.m15167d(f36812a, "httpdns request failed use hardcode ip: " + next + " try next hardcode ip");
                } else {
                    Logger.m15167d(f36812a, "httpdns backup domian hardcode ip: " + next + " is invalid");
                }
            }
        } else {
            m56863b(str);
            this.f36814c.mo51663e();
        }
        for (String str3 : this.f36816e) {
            this.f36814c.mo51665f(str3);
            this.f36814c.mo51647a(str3);
        }
        Message obtain = Message.obtain();
        obtain.obj = this;
        obtain.what = 3;
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("httpdns_completed_hosts", (ArrayList) this.f36817f);
        obtain.setData(bundle);
        this.f36820i.sendMessage(obtain);
        Logger.m15167d(f36812a, "send message to collect result handler for host : " + this.f36817f);
        return null;
    }

    /* renamed from: b */
    private void m56863b(String str) {
        Logger.m15167d(f36812a, "parseHttpDnsResponse");
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (this.f36816e.size() > 1) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("dns");
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            m56862a(optJSONArray.optJSONObject(i));
                        }
                    } else {
                        return;
                    }
                } else {
                    m56862a(jSONObject);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("httpdns_backup_ip");
                if (optJSONArray2 != null) {
                    C14041b.m56829a().mo51690a(optJSONArray2);
                }
            }
        } catch (JSONException unused) {
            Logger.m15167d(f36812a, "httpdns server returned a invalid json response.");
        }
    }

    /* renamed from: a */
    private String m56861a(String str) {
        StringBuilder sb = new StringBuilder();
        if (!C14036d.m56821b().get()) {
            this.f36819h = 1;
        }
        sb.append("https://");
        sb.append(str);
        sb.append("/q?host=");
        sb.append(this.f36815d);
        sb.append(ContainerUtils.FIELD_DELIMITER);
        sb.append("aid=");
        sb.append(C14041b.m56829a().mo51698e().mo51713c());
        sb.append(ContainerUtils.FIELD_DELIMITER);
        sb.append("okhttp_version=");
        sb.append(this.f36813b);
        sb.append(ContainerUtils.FIELD_DELIMITER);
        sb.append("p=");
        sb.append("android");
        sb.append(ContainerUtils.FIELD_DELIMITER);
        sb.append("source=");
        sb.append("tt-ok");
        sb.append(ContainerUtils.FIELD_DELIMITER);
        sb.append("f=");
        sb.append(this.f36819h);
        sb.append(ContainerUtils.FIELD_DELIMITER);
        sb.append("reason=");
        sb.append(this.f36818g.ordinal() - 1);
        if (this.f36814c.mo51645a().get() < 3) {
            sb.append(ContainerUtils.FIELD_DELIMITER);
            sb.append("refresh_bkup_ip=");
            sb.append("1");
            this.f36814c.mo51653b();
        }
        return C14034b.m56815a(sb.toString(), str);
    }

    /* renamed from: a */
    private void m56862a(JSONObject jSONObject) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("host");
            String str = f36812a;
            Logger.m15167d(str, "parseSingleHostHttpDnsResponse for host " + optString);
            int optInt = jSONObject.optInt("ttl");
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString2 = optJSONArray.optString(i);
                    if (C14035c.m56818c(optString2)) {
                        arrayList2.add(optString2);
                    } else if (C14035c.m56819d(optString2)) {
                        arrayList.add(optString2);
                    } else {
                        String str2 = f36812a;
                        Logger.m15167d(str2, "httpdns server returned a invalid address: " + optString2);
                    }
                }
            }
            if (!this.f36816e.contains(optString)) {
                return;
            }
            if (arrayList.size() > 0 || arrayList2.size() > 0) {
                this.f36814c.mo51648a(optString, new DnsRecord(optString, System.currentTimeMillis(), arrayList, arrayList2, optInt));
                this.f36814c.mo51665f(optString);
                this.f36816e.remove(optString);
            }
        }
    }

    CallableC14043c(String str, String str2, C14032a aVar, DnsRecord.CacheStaleReason cacheStaleReason, WeakHandler weakHandler) {
        this.f36815d = str;
        this.f36813b = str2;
        this.f36814c = aVar;
        this.f36818g = cacheStaleReason;
        this.f36820i = weakHandler;
    }
}
