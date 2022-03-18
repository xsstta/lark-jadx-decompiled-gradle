package com.bytedance.ee.bear.drive.module.nativepreview.p359a;

import com.bytedance.ee.bear.drive.module.nativepreview.model.FileBlockResModel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.module.nativepreview.a.a */
public class C7103a implements AbstractC7107c {

    /* renamed from: a */
    private HashMap<String, FileBlockResModel> f19136a;

    public C7103a(HashMap<String, FileBlockResModel> hashMap) {
        this.f19136a = hashMap;
    }

    @Override // com.bytedance.ee.bear.drive.module.nativepreview.p359a.AbstractC7107c
    /* renamed from: a */
    public String mo27745a(HashMap<String, FileBlockResModel> hashMap) {
        String str = "";
        if (hashMap.size() > 5) {
            long j = Long.MAX_VALUE;
            for (Map.Entry<String, FileBlockResModel> entry : hashMap.entrySet()) {
                if (!(entry == null || entry.getValue() == null)) {
                    FileBlockResModel value = entry.getValue();
                    long updateTime = value.getUpdateTime();
                    if (updateTime < j && !value.isNeedShow()) {
                        str = entry.getKey();
                        j = updateTime;
                    }
                }
            }
        }
        return str;
    }
}
