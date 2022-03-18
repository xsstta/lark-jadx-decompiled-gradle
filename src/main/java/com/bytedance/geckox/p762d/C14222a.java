package com.bytedance.geckox.p762d;

import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.policy.p778d.C14308c;
import com.bytedance.geckox.utils.C14373o;
import com.bytedance.pipeline.AbstractC20233b;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.geckox.d.a */
public class C14222a implements C14308c.AbstractC14310a {

    /* renamed from: a */
    public AbstractC20233b f37435a;

    /* renamed from: b */
    private Executor f37436b;

    @Override // com.bytedance.geckox.policy.p778d.C14308c.AbstractC14310a
    /* renamed from: a */
    public void mo52174a() {
        if (this.f37435a != null) {
            if (this.f37436b == null) {
                this.f37436b = C14373o.m57855a().mo52491b();
            }
            this.f37436b.execute(new Runnable() {
                /* class com.bytedance.geckox.p762d.C14222a.RunnableC142231 */

                public void run() {
                    String str = null;
                    try {
                        String str2 = (String) C14222a.this.f37435a.getPipelineData("api_version");
                        try {
                            C14276b.m57604a("gecko-debug-tag", "check request retry start", str2);
                            C14222a.this.f37435a.setPipelineData("req_type", 2);
                            C14222a.this.f37435a.restart();
                        } catch (Exception unused) {
                            str = str2;
                        }
                    } catch (Exception unused2) {
                        C14276b.m57604a("gecko-debug-tag", "check request retry failed", str);
                    }
                }
            });
        }
    }

    public C14222a(Executor executor, AbstractC20233b bVar) {
        this.f37436b = executor;
        this.f37435a = bVar;
    }
}
