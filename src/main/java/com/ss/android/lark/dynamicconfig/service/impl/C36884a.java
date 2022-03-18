package com.ss.android.lark.dynamicconfig.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.GetInitSettingsResponse;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import java.util.ArrayList;
import java.util.HashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.dynamicconfig.service.impl.a */
public class C36884a extends AbstractBaseSettingHandler {

    /* renamed from: a */
    private static HashMap<String, C36884a> f94807a = new HashMap<>();

    /* renamed from: c */
    private static Object f94808c = new Object();

    /* renamed from: d */
    private String f94809d;

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "DefaultDomainConfigHandler";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return this.f94809d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public GetInitSettingsResponse mo136183d() {
        GetInitSettingsResponse a = m145573a(mo148410h());
        if (a == null) {
            Log.m165383e("DefaultDomainConfigHandler", "getDefaultDomainConfig get static config failed, of key " + mo107772a());
        }
        return a;
    }

    private C36884a(String str) {
        this.f94809d = str;
    }

    /* renamed from: a */
    static GetInitSettingsResponse m145573a(String str) {
        JSONObject parseObject = JSON.parseObject(str);
        ArrayList arrayList = new ArrayList();
        if (parseObject == null) {
            Log.m165383e("DefaultDomainConfigHandler", "parseDomainConfig failed with " + str);
        } else {
            for (String str2 : parseObject.keySet()) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    JSONArray jSONArray = parseObject.getJSONArray(str2);
                    int size = jSONArray.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(jSONArray.getString(i));
                    }
                } catch (Exception e) {
                    Log.m165385e("DefaultDomainConfigHandler", "parseDomainConfig error, domain key is " + str2, e, true);
                }
                arrayList.add(new DomainSettings.Pair.C14890a().mo54574b(str2).mo54570a(DomainSettings.Alias.UNKNOWN).mo54571a("").mo54572a(arrayList2).build());
            }
        }
        return new GetInitSettingsResponse.C14967a().mo54741a(new DomainSettings.C14892a().mo54578a(arrayList).build()).build();
    }

    /* renamed from: a */
    static C36884a m145574a(int i, String str) {
        String str2;
        String str3;
        boolean z = true;
        if (!PackageChannelManager.isKABuildPackage(LarkContext.getApplication()) || PackageChannelManager.getDeployMode(LarkContext.getApplication()) == 1) {
            z = false;
        }
        if (z) {
            str2 = "biz_domain_config";
        } else {
            if (i == 2) {
                str3 = "staging";
            } else if (i != 3) {
                str3 = "release";
            } else {
                str3 = "pre_release";
            }
            str2 = str3 + "_" + str + "_" + "biz_domain_config";
        }
        synchronized (f94808c) {
            if (f94807a.containsKey(str2)) {
                return f94807a.get(str2);
            }
            C36884a aVar = new C36884a(str2);
            f94807a.put(str2, aVar);
            return aVar;
        }
    }
}
