package com.ss.android.lark.platform.network.ttnet;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.ApmAgent;
import com.bytedance.ttnet.AbstractC20744c;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.dynamicconfig.service.impl.C36885b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.platform.network.ttnet.MultiProcessSharedProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.network.ttnet.c */
public class C51877c implements AbstractC20744c {

    /* renamed from: a */
    private Context f128894a;

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: a */
    public void mo69988a(Context context, JSONObject jSONObject) {
    }

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: a */
    public void mo69989a(String str) {
    }

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: b */
    public boolean mo69991b() {
        return true;
    }

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: c */
    public boolean mo69992c() {
        return true;
    }

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: e */
    public String mo69994e() {
        return "snssdk.com";
    }

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: f */
    public String mo69995f() {
        return "byteimg.com";
    }

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: g */
    public String mo69996g() {
        return null;
    }

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: h */
    public void mo69997h() {
    }

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: i */
    public ArrayList<String> mo69998i() {
        return null;
    }

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: a */
    public Context mo69984a() {
        return this.f128894a;
    }

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: j */
    public int mo69999j() {
        return C29410a.m108287a().mo104277a();
    }

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: d */
    public String[] mo69993d() {
        List<String> b = C36885b.m145580c().mo136184b("ttnet_tnc");
        if (!CollectionUtils.isEmpty(b)) {
            return (String[]) b.toArray(new String[0]);
        }
        Log.m165397w("TTNET_DEPEND", "get tnc domain config empty.");
        if (C36083a.m141486a().getPassportDependency().mo133089h()) {
            return new String[]{"dm.larksuite.com", "dm-bk.larksuite.com"};
        }
        return new String[]{"dm.feishu.cn", "dm-lf.feishu.cn", "dm-hl.feishu.cn"};
    }

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: k */
    public Map<String, String> mo70000k() {
        HashMap hashMap = new HashMap();
        String a = C36885b.m145580c().mo136165a("ttnet_httpdns");
        String a2 = C36885b.m145580c().mo136165a("ttnet_netlog");
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(a2)) {
            Log.m165383e("TTNET_DEPEND", "ttnet domain fetch failed.");
            if (C36083a.m141486a().getPassportDependency().mo133089h()) {
                hashMap.put("httpdns", "34.102.215.99");
                hashMap.put("netlog", "ttnet-sg.byteoversea.com");
                hashMap.put("boe", ".boe-gateway.byted.org");
            } else {
                hashMap.put("httpdns", "dig.bdurl.net");
                hashMap.put("netlog", "crash.snssdk.com");
                hashMap.put("boe", ".boe-gateway.byted.org");
            }
        } else {
            hashMap.put("httpdns", a);
            hashMap.put("netlog", a2);
            hashMap.put("boe", ".boe-gateway.byted.org");
        }
        return hashMap;
    }

    public C51877c(Context context) {
        this.f128894a = context;
    }

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: a */
    public void mo69987a(Context context, Map<String, ?> map) {
        try {
            MultiProcessSharedProvider.C51873a a = MultiProcessSharedProvider.m201162a(context);
            if (map != null) {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        a.mo178044a(entry.getKey(), ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        a.mo178045a(entry.getKey(), ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        a.mo178043a(entry.getKey(), ((Float) value).floatValue());
                    } else if (value instanceof Boolean) {
                        a.mo178047a(entry.getKey(), ((Boolean) value).booleanValue());
                    } else if (value instanceof String) {
                        a.mo178046a(entry.getKey(), (String) value);
                    }
                }
                a.mo178049b();
            }
        } catch (Throwable th) {
            Log.m165398w("TTNET_DEPEND", "saveMapToProvider", th);
        }
    }

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: a */
    public void mo69990a(String str, JSONObject jSONObject) {
        ApmAgent.monitorCommonLog(str, jSONObject);
        Log.m165389i("TTNET_DEPEND", "monitorLogSend " + str + " , json " + jSONObject.toString());
    }

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: a */
    public int mo69983a(Context context, String str, int i) {
        return MultiProcessSharedProvider.m201165b(context).mo178050a(str, i);
    }

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: a */
    public String mo69985a(Context context, String str, String str2) {
        return MultiProcessSharedProvider.m201165b(context).mo178051a(str, str2);
    }

    @Override // com.bytedance.ttnet.AbstractC20744c
    /* renamed from: a */
    public void mo69986a(Context context, String str, String str2, JSONObject jSONObject) {
        Log.m165383e("TTNET_DEPEND", "event: " + str + " label: " + str2 + " json: " + jSONObject.toString());
    }
}
