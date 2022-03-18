package com.bytedance.ee.bear.list;

import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.list.m */
public class C8596m extends C8639o {
    @Override // com.bytedance.ee.bear.list.C8639o
    /* renamed from: a */
    public C8638n mo33525a(HashMap<String, String> hashMap) {
        if (this.f23408d == 1) {
            return super.mo33525a(hashMap);
        }
        HashMap hashMap2 = new HashMap();
        if (this.f23407c != null) {
            hashMap2.putAll(this.f23407c);
        }
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        if (hashMap2.size() == 0) {
            return super.mo33525a(hashMap);
        }
        StringBuilder sb = new StringBuilder(this.f23406b);
        int i = 0;
        for (Map.Entry entry : hashMap2.entrySet()) {
            if (i == 0) {
                sb.append("?");
            } else {
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
            sb.append(entry.getKey());
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(entry.getValue());
            i++;
        }
        C13479a.m54764b("RequestGetInfoCreator", "url is:" + C13598b.m55197d(sb.toString()));
        return new C8638n(this.f23405a, sb.toString(), hashMap2, this.f23408d);
    }

    public C8596m(String str, String str2, HashMap<String, String> hashMap, int i) {
        super(str, str2, hashMap, i);
    }
}
