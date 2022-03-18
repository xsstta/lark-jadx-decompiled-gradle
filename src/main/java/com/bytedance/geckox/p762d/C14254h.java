package com.bytedance.geckox.p762d;

import android.util.Pair;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.utils.C14369m;
import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20235d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.geckox.d.h */
public class C14254h extends AbstractC20235d<String, Map<String, List<Pair<String, Long>>>> {

    /* renamed from: a */
    private Map<String, String> f37486a;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.pipeline.AbstractC20235d
    /* renamed from: a */
    public void mo52179a(Object... objArr) {
        super.mo52179a(objArr);
        this.f37486a = (Map) objArr[0];
    }

    /* renamed from: a */
    public Object a_(AbstractC20233b<Map<String, List<Pair<String, Long>>>> bVar, String str) throws Exception {
        Long a;
        C14276b.m57604a("gecko-debug-tag", "get local channel version", "group:" + str);
        HashMap hashMap = new HashMap();
        for (String str2 : this.f37486a.keySet()) {
            File file = new File(this.f37486a.get(str2), str2);
            String[] list = file.list();
            ArrayList arrayList = new ArrayList();
            if (list != null && list.length > 0) {
                for (String str3 : list) {
                    File file2 = new File(file, str3);
                    if (file2.isDirectory() && (a = C14369m.m57849a(file2)) != null) {
                        arrayList.add(new Pair<>(str3, a));
                    }
                }
            }
            hashMap.put(str2, arrayList);
        }
        return bVar.proceed(hashMap);
    }
}
