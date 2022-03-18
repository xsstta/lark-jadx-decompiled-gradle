package com.larksuite.component.openplatform.core.loader.meta.impl.block;

import android.text.TextUtils;
import com.tt.refer.common.meta.fetch.C67803g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.loader.meta.impl.block.d */
public class C24565d extends C67803g.AbstractC67804a {

    /* renamed from: a */
    public Set<String> f60553a = new HashSet();

    /* renamed from: b */
    public Map<String, String> f60554b = new HashMap();

    @Override // com.tt.refer.common.meta.fetch.C67803g.AbstractC67804a
    /* renamed from: a */
    public JSONObject mo50354a(C67803g gVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        hashMap.put("extension_queries", arrayList);
        for (String str : this.f60553a) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("extension_id", str);
            hashMap2.put("extension_type", "block");
            String str2 = this.f60554b.get(str);
            if (!TextUtils.isEmpty(str2)) {
                hashMap2.put("preview_token", str2);
            }
            arrayList.add(hashMap2);
        }
        return new JSONObject(hashMap);
    }

    public C24565d(String str, String str2) {
        super(str, str2);
    }
}
