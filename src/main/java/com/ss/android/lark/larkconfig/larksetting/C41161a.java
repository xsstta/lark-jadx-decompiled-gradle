package com.ss.android.lark.larkconfig.larksetting;

import com.ss.android.lark.larkconfig.export.C41149a;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.Map;

/* renamed from: com.ss.android.lark.larkconfig.larksetting.a */
public class C41161a {
    /* renamed from: a */
    public String mo148436a(String str, C41149a aVar) {
        String str2 = str + "_v1";
        if (aVar == null || aVar.mo148396a()) {
            return UserSP.getInstance().getString(str2);
        }
        return C57744a.m224104a().getString(str2);
    }

    /* renamed from: a */
    public void mo148438a(Map<String, String> map, Map<String, C41149a> map2) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C41149a aVar = map2.get(entry.getKey());
            if (aVar != null) {
                mo148437a(entry.getKey(), entry.getValue(), aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo148437a(String str, String str2, C41149a aVar) {
        String str3 = str + "_v1";
        if (aVar == null || aVar.mo148396a()) {
            UserSP.getInstance().putString(str3, str2);
        } else {
            C57744a.m224104a().putString(str3, str2);
        }
    }
}
