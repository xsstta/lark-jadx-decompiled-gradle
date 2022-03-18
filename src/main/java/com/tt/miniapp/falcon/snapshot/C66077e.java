package com.tt.miniapp.falcon.snapshot;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.falcon.snapshot.C66071b;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.tt.miniapp.falcon.snapshot.e */
public class C66077e extends C66071b {
    @Override // com.tt.miniapp.falcon.snapshot.C66071b
    /* renamed from: b */
    public boolean mo231220b() {
        return true;
    }

    /* renamed from: c */
    public void mo231231c() {
        AppBrandLogger.m52830i("PreviewSnapshotCreator", "createSnapshotSync: ");
        if (mo231218a().mo231215b().mo231237d()) {
            mo231218a().mo231215b().mo231238e();
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        mo231219a(new C66071b.AbstractC66073a() {
            /* class com.tt.miniapp.falcon.snapshot.C66077e.C660781 */

            @Override // com.tt.miniapp.falcon.snapshot.C66071b.AbstractC66073a
            /* renamed from: a */
            public void mo231221a() {
                AppBrandLogger.m52829e("PreviewSnapshotCreator", "onDisable: IMPOSSIBLE");
            }

            @Override // com.tt.miniapp.falcon.snapshot.C66071b.AbstractC66073a
            /* renamed from: b */
            public void mo231222b() {
                AppBrandLogger.m52830i("PreviewSnapshotCreator", "create snapshot start");
            }

            @Override // com.tt.miniapp.falcon.snapshot.C66071b.AbstractC66073a
            /* renamed from: c */
            public void mo231223c() {
                AppBrandLogger.m52830i("PreviewSnapshotCreator", "create snapshot success");
                countDownLatch.countDown();
            }

            @Override // com.tt.miniapp.falcon.snapshot.C66071b.AbstractC66073a
            /* renamed from: d */
            public void mo231224d() {
                AppBrandLogger.m52829e("PreviewSnapshotCreator", "create snapshot failed");
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            AppBrandLogger.m52829e("PreviewSnapshotCreator", e);
        }
    }

    public C66077e(IAppContext iAppContext, String str, SnapshotType snapshotType) {
        super(iAppContext, new C66070a(iAppContext, str, snapshotType, new C66079f()));
    }
}
