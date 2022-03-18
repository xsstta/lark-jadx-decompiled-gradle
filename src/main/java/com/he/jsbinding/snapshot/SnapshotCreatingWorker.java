package com.he.jsbinding.snapshot;

import android.content.ContextWrapper;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.falcon.runtime.IJsRuntime;
import com.tt.miniapp.jsbridge.JsRuntimeManager;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.refer.common.C67738a;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.meta.base.AbsMetaLoadEntity;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.impl.business.meta.GadgetAppInfo;
import com.tt.refer.impl.business.meta.GadgetBeanConverter;
import com.tt.refer.impl.business.meta.GadgetMetaFetcher;
import com.tt.refer.impl.business.meta.GadgetSchema;

public class SnapshotCreatingWorker {
    public static final String TAG = "SnapshotCreatingWorker";
    public final Object mCompleter = new Object();
    private final SnapshotCreatorData mCreatorData;

    public void startCreatingSnapshot() {
        String str = TAG;
        AppBrandLogger.m52828d(str, "createSnapshot: creatorData = " + this.mCreatorData.toString());
        final AppInfoEntity appInfoEntity = new AppInfoEntity();
        appInfoEntity.appId = this.mCreatorData.getAppId();
        appInfoEntity.version = this.mCreatorData.getAppVersion();
        C67866g.m264025a(new Action() {
            /* class com.he.jsbinding.snapshot.SnapshotCreatingWorker.C233701 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                IAppContext createAppContext = SnapshotCreatingWorker.this.createAppContext(appInfoEntity);
                ISnapshotService iSnapshotService = (ISnapshotService) AppbrandApplicationImpl.getInst(createAppContext).getService(SnapshotServiceImpl.class);
                iSnapshotService.setIsRunningInSeparateProcess(true);
                if (iSnapshotService.enableSnapshot(appInfoEntity.version, appInfoEntity.isPreview())) {
                    SnapshotCreatingWorker.this.requestAppInfo(appInfoEntity, createAppContext);
                }
            }
        }, C67554l.m262725b());
        AppBrandLogger.m52828d(str, "createSnapshot: wait");
        try {
            synchronized (this.mCompleter) {
                this.mCompleter.wait();
            }
        } catch (InterruptedException e) {
            AppBrandLogger.m52829e(TAG, e);
        }
        AppBrandLogger.m52828d(TAG, "createSnapshot: end");
    }

    public SnapshotCreatingWorker(SnapshotCreatorData snapshotCreatorData) {
        this.mCreatorData = snapshotCreatorData;
    }

    public IAppContext createAppContext(AppInfoEntity appInfoEntity) {
        AbstractC67433a i = C67448a.m262353a().mo234190i();
        i.mo234157a(C67440a.m262344a(AppType.GadgetAPP, appInfoEntity.appId));
        AppbrandApplicationImpl m = C67485a.m262488a(i).mo234292m();
        m.setAppInfo(appInfoEntity);
        ((JsRuntimeManager) m.getService(JsRuntimeManager.class)).initTMARuntime((ContextWrapper) i.getApplicationContext());
        return i;
    }

    public void requestAppInfo(final AppInfoEntity appInfoEntity, final IAppContext iAppContext) {
        C67738a aVar = new C67738a(new GadgetMetaFetcher(iAppContext), iAppContext);
        final GadgetSchema.C67943Entity convertAppInfoEntityToSchemaEntity = GadgetBeanConverter.convertAppInfoEntityToSchemaEntity(appInfoEntity);
        aVar.mo235104a(iAppContext.getApplicationContext(), (AbsMetaLoadEntity) convertAppInfoEntityToSchemaEntity, 0, (C67738a.AbstractC67742a) new C67738a.AbstractC67742a<GadgetAppInfo>() {
            /* class com.he.jsbinding.snapshot.SnapshotCreatingWorker.C233712 */

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onDownloadSuccess(int i, boolean z) {
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onDownloading(int i, float f) {
            }

            public void onRequestAppMetaSuccess(int i, GadgetAppInfo gadgetAppInfo) {
                AppBrandLogger.m52828d(SnapshotCreatingWorker.TAG, "onRequestAppMetaSuccess");
                C67485a.m262488a(iAppContext).mo234292m().setAppInfo(GadgetBeanConverter.convertGadgetAppInfoToAppInfoEntity(gadgetAppInfo, convertAppInfoEntityToSchemaEntity));
            }

            public void onAppMetaInvalid(int i, GadgetAppInfo gadgetAppInfo, int i2) {
                String str = SnapshotCreatingWorker.TAG;
                AppBrandLogger.m52829e(str, "onAppMetaInvalid, invalidType = " + i2);
                synchronized (SnapshotCreatingWorker.this.mCompleter) {
                    SnapshotCreatingWorker.this.mCompleter.notifyAll();
                }
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onFailed(int i, String str, String str2) {
                String str3 = SnapshotCreatingWorker.TAG;
                AppBrandLogger.m52829e(str3, "onFailed, reason = " + str2);
                synchronized (SnapshotCreatingWorker.this.mCompleter) {
                    SnapshotCreatingWorker.this.mCompleter.notifyAll();
                }
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onInstallPkgSuccess(int i, String str, String str2) {
                String str3 = SnapshotCreatingWorker.TAG;
                AppBrandLogger.m52828d(str3, "onInstallPkgSuccess, requestType = " + i + ", installPath = " + str);
                if (i == 0) {
                    C67866g.m264025a(new Action() {
                        /* class com.he.jsbinding.snapshot.SnapshotCreatingWorker.C233712.C233721 */

                        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                        public void act() {
                            C67485a.m262488a(iAppContext).mo234292m().initAppConfig();
                            SnapshotCreatingWorker.this.createSnapshot(iAppContext, appInfoEntity.version);
                        }
                    }, C67554l.m262725b());
                }
            }

            @Override // com.tt.refer.common.meta.AbstractC67788b.AbstractC67792b
            public void onRequestAppMetaFail(int i, String str, String str2) {
                String str3 = SnapshotCreatingWorker.TAG;
                AppBrandLogger.m52829e(str3, "onRequestAppMetaFail, errorMsg = " + str2);
                synchronized (SnapshotCreatingWorker.this.mCompleter) {
                    SnapshotCreatingWorker.this.mCompleter.notifyAll();
                }
            }
        }, false);
    }

    public void createSnapshot(IAppContext iAppContext, String str) {
        IJsRuntime currentRuntime = ((JsRuntimeManager) C67485a.m262488a(iAppContext).mo234292m().getService(JsRuntimeManager.class)).getCurrentRuntime();
        String str2 = TAG;
        AppBrandLogger.m52828d(str2, "createSnapshot: appVersion = " + str);
        currentRuntime.postRunnable(new Runnable(iAppContext, str) {
            /* class com.he.jsbinding.snapshot.$$Lambda$SnapshotCreatingWorker$IOY4kwT6OXzod4tdr6HLfIWEV00 */
            public final /* synthetic */ IAppContext f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                SnapshotCreatingWorker.this.lambda$createSnapshot$0$SnapshotCreatingWorker(this.f$1, this.f$2);
            }
        });
    }

    public /* synthetic */ void lambda$createSnapshot$0$SnapshotCreatingWorker(IAppContext iAppContext, String str) {
        String str2 = TAG;
        AppBrandLogger.m52828d(str2, "createSnapshot: running");
        ((ISnapshotService) AppbrandApplicationImpl.getInst(iAppContext).getService(SnapshotServiceImpl.class)).generateSnapshot(str);
        AppBrandLogger.m52828d(str2, "createSnapshot: end");
        synchronized (this.mCompleter) {
            this.mCompleter.notifyAll();
        }
    }
}
