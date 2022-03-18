package com.bytedance.geckox.p762d;

import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.policy.p777c.AbstractRunnableC14305c;
import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20235d;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.geckox.d.k */
public class C14256k extends AbstractC20235d<List<UpdatePackage>, UpdatePackage> {

    /* renamed from: a */
    public static AtomicInteger f37489a = new AtomicInteger(1);

    /* renamed from: b */
    public static AtomicInteger f37490b = new AtomicInteger(0);

    /* renamed from: f */
    private Executor f37491f;

    /* renamed from: g */
    private OptionCheckUpdateParams f37492g;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.pipeline.AbstractC20235d
    /* renamed from: a */
    public void mo52179a(Object... objArr) {
        super.mo52179a(objArr);
        if (objArr == null) {
            this.f37491f = Executors.newFixedThreadPool(2);
        } else if (objArr[0] instanceof Executor) {
            this.f37491f = (Executor) objArr[0];
            if (objArr[1] == null) {
                this.f37492g = null;
            } else {
                this.f37492g = (OptionCheckUpdateParams) objArr[1];
            }
        } else {
            throw new IllegalArgumentException("ParallelInterceptor args must be instance of Executor");
        }
    }

    /* renamed from: a */
    public final Object a_(final AbstractC20233b<UpdatePackage> bVar, List<UpdatePackage> list) throws Throwable {
        final int i;
        OptionCheckUpdateParams optionCheckUpdateParams = this.f37492g;
        if (optionCheckUpdateParams != null) {
            i = optionCheckUpdateParams.getChannelUpdatePriority();
        } else {
            i = 1;
        }
        f37490b.addAndGet(list.size());
        for (final UpdatePackage updatePackage : list) {
            final String str = updatePackage.getAccessKey() + "-" + updatePackage.getChannel();
            final int andIncrement = ((3 - i) * 100000) + f37489a.getAndIncrement();
            C14276b.m57604a("gecko-debug-tag", "parallel download add queue", "priority:" + i, "queue priority:" + andIncrement, str);
            this.f37491f.execute(new AbstractRunnableC14305c(andIncrement, str) {
                /* class com.bytedance.geckox.p762d.C14256k.C142571 */

                public void run() {
                    C14276b.m57604a("gecko-debug-tag", "parallel download start", "priority:" + i, "queue priority:" + andIncrement, str);
                    try {
                        bVar.setPipelineData("update_priority", Integer.valueOf(i));
                        bVar.proceed(updatePackage);
                        if (C14256k.f37490b.decrementAndGet() == 0) {
                            C14256k.f37489a.set(0);
                        }
                    } catch (Throwable th) {
                        C14256k.this.mo68494d(th);
                    }
                }
            });
        }
        return null;
    }
}
