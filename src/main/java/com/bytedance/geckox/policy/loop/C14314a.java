package com.bytedance.geckox.policy.loop;

import com.bytedance.geckox.C14264e;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.policy.loop.model.LoopInterval;
import com.bytedance.pipeline.AbstractC20236e;
import java.util.Map;

/* renamed from: com.bytedance.geckox.policy.loop.a */
public class C14314a implements AbstractC20236e {
    @Override // com.bytedance.pipeline.AbstractC20236e
    /* renamed from: a */
    public void mo52368a(Object obj) {
        if (obj != null && C14264e.m57551a().mo52234i() == null) {
            Map<String, LoopInterval> map = (Map) obj;
            C14276b.m57604a("gecko-debug-tag", "[loop]update interval:", map);
            C14315b.m57703a().mo52371a(map);
        }
    }
}
