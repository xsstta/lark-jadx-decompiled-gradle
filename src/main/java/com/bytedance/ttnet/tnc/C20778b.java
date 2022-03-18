package com.bytedance.ttnet.tnc;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.TTDelayStateManager;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.C14041b;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.C14073i;
import com.bytedance.frameworks.baselib.network.http.p742b.C13984b;
import com.bytedance.frameworks.baselib.network.http.util.C14088f;
import com.bytedance.ttnet.TTReqController;
import com.bytedance.ttnet.tnc.TNCManager;
import com.bytedance.ttnet.utils.C20789b;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.tnc.b */
public class C20778b {

    /* renamed from: a */
    private Context f50937a;

    /* renamed from: b */
    private C20777a f50938b;

    /* renamed from: c */
    private boolean f50939c;

    /* renamed from: d */
    private String f50940d = "";

    /* renamed from: e */
    private String f50941e = "";

    /* renamed from: f */
    private String f50942f = "";

    /* renamed from: g */
    private String f50943g = "";

    /* renamed from: a */
    public C20777a mo70061a() {
        return this.f50938b;
    }

    /* renamed from: b */
    private String m75704b() {
        if (TextUtils.isEmpty(TNCManager.m75680a())) {
            Logger.m15167d("TNCConfigHandler", "getGetDomainDefaultJson no existed");
            return null;
        }
        try {
            String string = new JSONObject(TNCManager.m75680a()).getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Logger.m15167d("TNCConfigHandler", "use get domain default json.");
            return string;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public void mo70063a(String str) {
        this.f50943g = str;
    }

    /* renamed from: b */
    private boolean m75705b(String str) {
        boolean z = true;
        if (TextUtils.isEmpty(str) || !C13984b.m56548a().mo51419b()) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        if (!C14088f.m57042a(str, ";", ContainerUtils.KEY_VALUE_DELIMITER, arrayList) || arrayList.size() != 3) {
            return false;
        }
        String str2 = (String) ((Pair) arrayList.get(1)).second;
        String str3 = (String) ((Pair) arrayList.get(0)).second;
        if (!((String) ((Pair) arrayList.get(2)).first).equals("force_accept") || !((String) ((Pair) arrayList.get(2)).second).equals("true")) {
            String d = C13984b.m56548a().mo51421d();
            if (d.equals("did") || d.equals("uid") ? !str2.equals(d) || !str3.equals(C13984b.m56548a().mo51420c()) : str2.equals("did") || str2.equals("uid")) {
                z = false;
            }
            if (z) {
                this.f50940d = str3;
                this.f50942f = str2;
            }
            Logger.m15167d("TNCConfigHandler", "accept: " + z + " tnc source: " + str2 + " tnc region: " + str3 + " user source: " + d + " user region: " + C13984b.m56548a().mo51420c());
            return z;
        }
        this.f50940d = str3;
        this.f50942f = str2;
        return true;
    }

    /* renamed from: a */
    public void mo70062a(long j) {
        String str;
        Logger.m15167d("TNCConfigHandler", "load local config");
        if (this.f50939c) {
            SharedPreferences sharedPreferences = this.f50937a.getSharedPreferences("ttnet_tnc_config", 0);
            String string = sharedPreferences.getString("tnc_config_str", null);
            String string2 = sharedPreferences.getString("ttnet_tnc_etag", null);
            String string3 = sharedPreferences.getString("ttnet_tnc_abtest", null);
            if (TextUtils.isEmpty(string)) {
                string = m75704b();
                if (TextUtils.isEmpty(string)) {
                    Logger.m15167d("TNCConfigHandler", "load local config failed.");
                    return;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(string);
                C14073i.m56967a().mo51753a(jSONObject, TNCManager.TNCUpdateSource.TTCACHE.mValue, string2, string3, j);
                C14041b.m56829a().mo51691a(jSONObject);
                TTReqController.m75525a(jSONObject);
                TTDelayStateManager.m56396a(jSONObject);
                C20777a a = m75703a(jSONObject);
                if (a != null) {
                    this.f50938b = a;
                }
                if (Logger.debug()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("loadLocalConfig: ");
                    if (a == null) {
                        str = "null";
                    } else {
                        str = a.toString();
                    }
                    sb.append(str);
                    Logger.m15167d("TNCConfigHandler", sb.toString());
                }
            } catch (Throwable th) {
                th.printStackTrace();
                if (Logger.debug()) {
                    Logger.m15167d("TNCConfigHandler", "loadLocalConfig: except: " + th.getMessage());
                }
            }
        }
    }

    /* renamed from: a */
    private C20777a m75703a(JSONObject jSONObject) {
        boolean z;
        try {
            C14073i.m56967a().mo51763j().clear();
            JSONObject optJSONObject = jSONObject.optJSONObject("tnc_config");
            C20777a aVar = new C20777a();
            if (optJSONObject == null) {
                return aVar;
            }
            boolean z2 = true;
            if (optJSONObject.has("local_enable")) {
                if (optJSONObject.getInt("local_enable") == 0) {
                    z = false;
                } else {
                    z = true;
                }
                aVar.f50925a = z;
            }
            if (optJSONObject.has("probe_enable")) {
                if (optJSONObject.getInt("probe_enable") == 0) {
                    z2 = false;
                }
                aVar.f50926b = z2;
            }
            if (optJSONObject.has("local_host_filter")) {
                JSONArray jSONArray = optJSONObject.getJSONArray("local_host_filter");
                HashMap hashMap = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(string, 0);
                        }
                    }
                }
                aVar.f50927c = hashMap;
            } else {
                aVar.f50927c = null;
            }
            if (optJSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = optJSONObject.getJSONObject("host_replace_map");
                if (jSONObject2.length() > 0) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string2 = jSONObject2.getString(next);
                        if (!TextUtils.isEmpty(next)) {
                            if (!TextUtils.isEmpty(string2)) {
                                C14073i.m56967a().mo51763j().put(next, string2);
                            }
                        }
                    }
                }
            }
            aVar.f50928d = optJSONObject.optInt("req_to_cnt", aVar.f50928d);
            aVar.f50929e = optJSONObject.optInt("req_to_api_cnt", aVar.f50929e);
            aVar.f50930f = optJSONObject.optInt("req_to_ip_cnt", aVar.f50930f);
            aVar.f50931g = optJSONObject.optInt("req_err_cnt", aVar.f50931g);
            aVar.f50932h = optJSONObject.optInt("req_err_api_cnt", aVar.f50932h);
            aVar.f50933i = optJSONObject.optInt("req_err_ip_cnt", aVar.f50933i);
            aVar.f50934j = optJSONObject.optInt("update_interval", aVar.f50934j);
            aVar.f50935k = optJSONObject.optInt("update_random_range", aVar.f50935k);
            aVar.f50936l = optJSONObject.optString("http_code_black", aVar.f50936l);
            return aVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public void mo70065b(long j) {
        String str;
        try {
            String a = C20789b.m75731a(this.f50937a, 4);
            if (TextUtils.isEmpty(a)) {
                a = m75704b();
                if (TextUtils.isEmpty(a)) {
                    Logger.m15167d("TNCConfigHandler", "load local config failed.");
                    return;
                }
            }
            JSONObject jSONObject = new JSONObject(a);
            C20777a a2 = m75703a(jSONObject);
            C14073i.m56967a().mo51753a(jSONObject, TNCManager.TNCUpdateSource.TTCACHE.mValue, C20789b.m75731a(this.f50937a, 5), C20789b.m75731a(this.f50937a, 6), j);
            C14041b.m56829a().mo51691a(jSONObject);
            TTReqController.m75525a(jSONObject);
            TTDelayStateManager.m56396a(jSONObject);
            if (Logger.debug()) {
                StringBuilder sb = new StringBuilder();
                sb.append("loadLocalConfigForOtherProcess, config: ");
                if (a2 == null) {
                    str = "null";
                } else {
                    str = a2.toString();
                }
                sb.append(str);
                Logger.m15167d("TNCConfigHandler", sb.toString());
            }
            if (a2 != null) {
                this.f50938b = a2;
            }
        } catch (Throwable th) {
            if (Logger.debug()) {
                Logger.m15167d("TNCConfigHandler", "loadLocalConfigForOtherProcess, except: " + th.getMessage());
            }
        }
    }

    public C20778b(Context context, boolean z) {
        this.f50937a = context;
        this.f50939c = z;
        this.f50938b = new C20777a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a9, code lost:
        if (android.text.TextUtils.isEmpty(r16.f50943g) != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ab, code lost:
        r16.f50943g = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ad, code lost:
        r0.putString("ttnet_tnc_abtest", r16.f50943g).apply();
        com.bytedance.ttnet.utils.C20789b.m75732a(r16.f50937a, 6, r16.f50943g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bd, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0141, code lost:
        if (android.text.TextUtils.isEmpty(r16.f50943g) == false) goto L_0x00ad;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo70064a(org.json.JSONObject r17, com.bytedance.ttnet.tnc.TNCManager.TNCUpdateSource r18, java.lang.String r19, java.lang.String r20, long r21) {
        /*
        // Method dump skipped, instructions count: 393
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.tnc.C20778b.mo70064a(org.json.JSONObject, com.bytedance.ttnet.tnc.TNCManager$TNCUpdateSource, java.lang.String, java.lang.String, long):boolean");
    }
}
