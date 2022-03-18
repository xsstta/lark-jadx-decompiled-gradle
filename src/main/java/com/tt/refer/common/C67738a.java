package com.tt.refer.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.tt.miniapp.event.C66036d;
import com.tt.refer.common.meta.AbstractC67788b;
import com.tt.refer.common.meta.IAppMetaService;
import com.tt.refer.common.meta.base.AbsAppMeta;
import com.tt.refer.common.meta.base.AbsMetaLoadEntity;
import com.tt.refer.common.pkg.IPkgDownloadInstallListener;
import com.tt.refer.common.pkg.IPkgMgrService;
import com.tt.refer.common.pkg.PackageEntity;
import com.tt.refer.impl.business.meta.GadgetSchema;
import com.tt.refer.impl.business.meta.PackageComponent;
import java.util.List;
import java.util.Map;

/* renamed from: com.tt.refer.common.a */
public class C67738a<E extends AbsMetaLoadEntity, M extends AbsAppMeta> {

    /* renamed from: a */
    public AbstractC67788b<E, M> f170561a;

    /* renamed from: b */
    public IAppContext f170562b;

    /* renamed from: c */
    private IPkgMgrService f170563c;

    /* renamed from: com.tt.refer.common.a$a */
    public interface AbstractC67742a<M extends AbsAppMeta> extends AbstractC67788b.AbstractC67792b<M>, IPkgDownloadInstallListener {
    }

    public C67738a(AbstractC67788b bVar, IAppContext iAppContext) {
        this.f170561a = bVar;
        this.f170562b = iAppContext;
        this.f170563c = (IPkgMgrService) iAppContext.findServiceByInterface(IPkgMgrService.class);
    }

    /* renamed from: a */
    public void mo235106a(M m, final IAppContext iAppContext, final AbstractC67742a<M> aVar, int i) {
        final PackageEntity a = this.f170561a.mo50334a(m);
        final Context applicationContext = iAppContext.getApplicationContext();
        this.f170563c.downloadAndInstallPackage(applicationContext, a, i, new IPkgDownloadInstallListener() {
            /* class com.tt.refer.common.C67738a.C677402 */

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onDownloading(int i, float f) {
                aVar.onDownloading(i, f);
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onDownloadSuccess(int i, boolean z) {
                AppBrandLogger.m52830i("app_start_load_manager", "onDownloadSuccess:fromLocal", Boolean.valueOf(z), a);
                ((IAppMetaService) iAppContext.findServiceByInterface(IAppMetaService.class)).mo235256a(applicationContext, a.getIdentifier(), a.getPackageName());
                aVar.onDownloadSuccess(i, z);
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onFailed(int i, String str, String str2) {
                AppBrandLogger.m52829e("app_start_load_manager", "onFailed:code", str, "reason:", str2);
                aVar.onFailed(i, str, str2);
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onInstallPkgSuccess(int i, String str, String str2) {
                AppBrandLogger.m52830i("app_start_load_manager", "onInstallPkgSuccess:", str, a);
                aVar.onInstallPkgSuccess(i, str, str2);
            }
        });
    }

    /* renamed from: a */
    public void mo235104a(Context context, E e, int i, AbstractC67742a<M> aVar, boolean z) {
        mo235105a(context, e, i, aVar, true, z);
    }

    /* renamed from: a */
    public void mo235107a(M m, final IAppContext iAppContext, final AbstractC67742a<M> aVar, int i, final String str) {
        String str2;
        PackageComponent packageComponent;
        final long currentTimeMillis = System.currentTimeMillis();
        C66036d.m258598b(str, currentTimeMillis, iAppContext);
        final PackageEntity a = this.f170561a.mo50334a(m);
        final Context applicationContext = iAppContext.getApplicationContext();
        Map<String, PackageComponent> packageComponents = a.getPackageComponents();
        if (!(packageComponents == null || (packageComponent = packageComponents.get("__APP__")) == null)) {
            List<String> c = packageComponent.mo235798c();
            if (TextUtils.isEmpty(str) || c.contains(str)) {
                AppBrandLogger.m52830i("app_start_load_manager", "realPage is main page");
                str2 = "__APP__";
                this.f170563c.downloadAndInstallMainApp(applicationContext, a, i, str2, new IPkgDownloadInstallListener() {
                    /* class com.tt.refer.common.C67738a.C677413 */

                    @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
                    public void onDownloading(int i, float f) {
                        aVar.onDownloading(i, f);
                    }

                    @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
                    public void onDownloadSuccess(int i, boolean z) {
                        AppBrandLogger.m52830i("app_start_load_manager", "onDownloadSuccess:fromLocal", Boolean.valueOf(z), a);
                        ((IAppMetaService) iAppContext.findServiceByInterface(IAppMetaService.class)).mo235256a(applicationContext, a.getIdentifier(), a.getPackageName());
                        aVar.onDownloadSuccess(i, z);
                    }

                    @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
                    public void onFailed(int i, String str, String str2) {
                        C66036d.m258586a("fail", str, System.currentTimeMillis() - currentTimeMillis, iAppContext);
                        AppBrandLogger.m52829e("app_start_load_manager", "onFailed:code", str, "reason:", str2);
                        aVar.onFailed(i, str, str2);
                    }

                    @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
                    public void onInstallPkgSuccess(int i, String str, String str2) {
                        C66036d.m258586a("success", str, System.currentTimeMillis() - currentTimeMillis, iAppContext);
                        AppBrandLogger.m52830i("app_start_load_manager", "onInstallPkgSuccess:", str, a);
                        aVar.onInstallPkgSuccess(i, str, str2);
                    }
                });
            }
        }
        str2 = str;
        this.f170563c.downloadAndInstallMainApp(applicationContext, a, i, str2, new IPkgDownloadInstallListener() {
            /* class com.tt.refer.common.C67738a.C677413 */

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onDownloading(int i, float f) {
                aVar.onDownloading(i, f);
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onDownloadSuccess(int i, boolean z) {
                AppBrandLogger.m52830i("app_start_load_manager", "onDownloadSuccess:fromLocal", Boolean.valueOf(z), a);
                ((IAppMetaService) iAppContext.findServiceByInterface(IAppMetaService.class)).mo235256a(applicationContext, a.getIdentifier(), a.getPackageName());
                aVar.onDownloadSuccess(i, z);
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onFailed(int i, String str, String str2) {
                C66036d.m258586a("fail", str, System.currentTimeMillis() - currentTimeMillis, iAppContext);
                AppBrandLogger.m52829e("app_start_load_manager", "onFailed:code", str, "reason:", str2);
                aVar.onFailed(i, str, str2);
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onInstallPkgSuccess(int i, String str, String str2) {
                C66036d.m258586a("success", str, System.currentTimeMillis() - currentTimeMillis, iAppContext);
                AppBrandLogger.m52830i("app_start_load_manager", "onInstallPkgSuccess:", str, a);
                aVar.onInstallPkgSuccess(i, str, str2);
            }
        });
    }

    /* renamed from: a */
    public void mo235105a(final Context context, final E e, int i, final AbstractC67742a<M> aVar, final boolean z, final boolean z2) {
        this.f170561a.mo235274a(context, e, i, new AbstractC67788b.AbstractC67792b<M>() {
            /* class com.tt.refer.common.C67738a.C677391 */

            /* JADX DEBUG: Multi-variable search result rejected for r14v5, resolved type: com.tt.refer.common.meta.b<E extends com.tt.refer.common.meta.base.AbsMetaLoadEntity, M extends com.tt.refer.common.meta.base.AbsAppMeta> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tt.refer.common.meta.AbstractC67788b.AbstractC67792b
            public void onRequestAppMetaSuccess(int i, M m) {
                AppBrandLogger.m52830i("app_start_load_manager", "onRequestAppMetaSuccess:requestType:", Integer.valueOf(i), "getIdentifier:", m.getIdentifier(), "version:", m.getAppVersion());
                aVar.onRequestAppMetaSuccess(i, m);
                PackageEntity a = C67738a.this.f170561a.mo50334a(m);
                boolean featureGating = LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.subpackage.enabled");
                boolean isSubPackageModeSettingsOpen = ((IPkgMgrService) C67738a.this.f170562b.findServiceByInterface(IPkgMgrService.class)).isSubPackageModeSettingsOpen(C67738a.this.f170562b.getAppId());
                if (!z2 || !featureGating || !isSubPackageModeSettingsOpen || !a.isValidSubPackage()) {
                    C67738a aVar = C67738a.this;
                    aVar.mo235106a(m, aVar.f170562b, aVar, i);
                } else {
                    if (i == 0) {
                        i = 4;
                    }
                    String str = null;
                    AbsMetaLoadEntity absMetaLoadEntity = e;
                    if (absMetaLoadEntity instanceof GadgetSchema.C67943Entity) {
                        str = ((GadgetSchema.C67943Entity) absMetaLoadEntity).getStartPage();
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = "__APP__";
                    }
                    C67738a aVar2 = C67738a.this;
                    aVar2.mo235107a(m, aVar2.f170562b, aVar, i, str);
                }
                if (i != 0) {
                    if (i == 1 || i == 2) {
                        AppBrandLogger.m52830i("app_start_load_manager", "onRequestAppMetaSuccess:async or preload,try download pkg only! meta version:", m.getAppVersion());
                        return;
                    } else if (!(i == 3 || i == 4)) {
                        AppBrandLogger.m52829e("app_start_load_manager", "onRequestAppMetaSuccess:request type is invalid!");
                        return;
                    }
                }
                if (z && m.getMetaSource() == 1) {
                    C67738a.this.f170561a.mo235274a(context, e, 1, this);
                }
            }

            @Override // com.tt.refer.common.meta.AbstractC67788b.AbstractC67792b
            public void onAppMetaInvalid(int i, M m, int i2) {
                AppBrandLogger.m52829e("app_start_load_manager", "onAppMetaInvalid:requestType->", Integer.valueOf(i), "getIdentifier", e.getIdentifier());
                aVar.onAppMetaInvalid(i, m, i2);
            }

            @Override // com.tt.refer.common.meta.AbstractC67788b.AbstractC67792b
            public void onRequestAppMetaFail(int i, String str, String str2) {
                AppBrandLogger.m52829e("app_start_load_manager", "onRequestAppMetaFail:requestType->", Integer.valueOf(i), "code:", str, "errorMsg:", str2, "getIdentifier", e.getIdentifier());
                aVar.onRequestAppMetaFail(i, str, str2);
            }
        });
    }
}
