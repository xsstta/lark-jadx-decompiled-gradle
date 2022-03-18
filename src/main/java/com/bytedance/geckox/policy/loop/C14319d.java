package com.bytedance.geckox.policy.loop;

import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.C14264e;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.p773i.C14282a;
import com.bytedance.geckox.policy.loop.C14316c;
import com.bytedance.geckox.policy.loop.model.LoopInterval;
import com.bytedance.geckox.policy.loop.model.LoopRequestModel;
import com.bytedance.geckox.utils.C14373o;
import com.bytedance.pipeline.AbstractC20233b;
import java.util.Map;

/* renamed from: com.bytedance.geckox.policy.loop.d */
public class C14319d implements C14316c.AbstractC14318a {

    /* renamed from: a */
    public C14218d f37623a;

    /* renamed from: b */
    public LoopInterval.LoopLevel f37624b;

    public C14319d(C14218d dVar, LoopInterval.LoopLevel loopLevel) {
        this.f37623a = dVar;
        this.f37624b = loopLevel;
    }

    @Override // com.bytedance.geckox.policy.loop.C14316c.AbstractC14318a
    /* renamed from: a */
    public void mo52378a(int i, final Map<String, LoopRequestModel> map) {
        C14373o.m57855a().mo52491b().execute(new Runnable() {
            /* class com.bytedance.geckox.policy.loop.C14319d.RunnableC143201 */

            public void run() {
                try {
                    C14276b.m57604a("gecko-debug-tag", "[loop]loop start checkUpdate");
                    AbstractC20233b<Object> a = C14282a.m57620a(C14264e.m57551a().mo52227c(), C14319d.this.f37623a, map, C14319d.this.f37624b, new C14314a());
                    a.setPipelineData("req_type", 3);
                    a.proceed(null);
                    C14276b.m57604a("gecko-debug-tag", "[loop] checkUpdate success");
                } catch (Exception e) {
                    C14276b.m57604a("gecko-debug-tag", "[loop] combine checkUpdate exception", e);
                }
            }
        });
    }
}
