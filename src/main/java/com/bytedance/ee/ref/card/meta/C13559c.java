package com.bytedance.ee.ref.card.meta;

import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.refer.common.meta.fetch.C67803g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.ref.card.meta.c */
public class C13559c extends C67803g.AbstractC67804a {

    /* renamed from: a */
    public Set<String> f35673a = new HashSet();

    /* renamed from: a */
    public void mo50355a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f35673a.add(str);
        }
    }

    @Override // com.tt.refer.common.meta.fetch.C67803g.AbstractC67804a
    /* renamed from: a */
    public JSONObject mo50354a(C67803g gVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, this.f170766c);
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, this.f170767d);
        if (!this.f35673a.isEmpty()) {
            hashMap.put("card_ids", this.f35673a);
        }
        if (!TextUtils.isEmpty(this.f170768e)) {
            hashMap.put("token", this.f170768e);
        }
        return new JSONObject(hashMap);
    }

    public C13559c(String str, String str2) {
        super(str, str2);
    }
}
