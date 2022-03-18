package com.bytedance.ee.bear.document.offline.sync.preloadexecutor.p320a;

import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.SubBlockModel;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.preloadexecutor.a.d */
public class C6016d {

    /* renamed from: a */
    private ConcurrentHashMap<String, C6013a> f16841a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public void mo24313a() {
        ConcurrentHashMap<String, C6013a> concurrentHashMap = this.f16841a;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    /* renamed from: a */
    public C6013a mo24311a(String str) {
        if (str != null && this.f16841a.contains(str)) {
            return this.f16841a.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public void mo24314a(C6013a aVar) {
        if (!(aVar == null || this.f16841a == null)) {
            for (SubBlockModel subBlockModel : aVar.mo24303e()) {
                this.f16841a.put(subBlockModel.getUrl(), aVar);
            }
        }
    }

    /* renamed from: a */
    public C6013a mo24312a(String str, boolean z) {
        ConcurrentHashMap<String, C6013a> concurrentHashMap;
        if (!(str == null || (concurrentHashMap = this.f16841a) == null || !concurrentHashMap.containsKey(str))) {
            C6013a aVar = this.f16841a.get(str);
            if (z) {
                aVar.mo24297a(str);
            } else {
                aVar.mo24299b(str);
            }
            this.f16841a.remove(str);
            if (aVar.mo24298a()) {
                C13479a.m54764b("ImgDownloadJobInFlightContainer", "job finished");
                return aVar;
            }
        }
        return null;
    }
}
