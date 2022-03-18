package com.tt.miniapp.p3327s;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager;
import com.larksuite.component.openplatform.core.loader.jsbundle.bean.ReadyJSComponent;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.refer.common.C67738a;
import com.tt.refer.common.meta.base.AbsMetaLoadEntity;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.impl.business.meta.DependComponent;
import com.tt.refer.impl.business.meta.GadgetAppInfo;
import com.tt.refer.impl.business.meta.GadgetBeanConverter;
import com.tt.refer.impl.business.meta.GadgetMetaFetcher;
import com.tt.refer.impl.business.meta.GadgetSchema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tt.miniapp.s.d */
public class C66739d {

    /* renamed from: a */
    protected AbstractC66745e f168484a;

    /* renamed from: b */
    protected IAppContext f168485b;

    /* renamed from: c */
    public GadgetAppInfo f168486c;

    /* renamed from: d */
    public GadgetAppInfo f168487d;

    /* renamed from: a */
    public void mo232570a(AppInfoEntity appInfoEntity) {
        boolean z;
        int i;
        if (appInfoEntity.schema == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 3;
        } else {
            i = 0;
        }
        AppBrandLogger.m52830i("app_start_load_gadget_presenter", "requestAppInfo type:" + i);
        C67738a aVar = new C67738a(new GadgetMetaFetcher(this.f168485b), this.f168485b);
        final GadgetSchema.C67943Entity convertAppInfoEntityToSchemaEntity = GadgetBeanConverter.convertAppInfoEntityToSchemaEntity(appInfoEntity);
        aVar.mo235104a(this.f168485b.getApplicationContext(), (AbsMetaLoadEntity) convertAppInfoEntityToSchemaEntity, i, (C67738a.AbstractC67742a) new C67738a.AbstractC67742a<GadgetAppInfo>() {
            /* class com.tt.miniapp.p3327s.C66739d.C667401 */

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onDownloading(int i, float f) {
                if ((i == 0 || i == 4) && C66739d.this.f168484a != null) {
                    C66739d.this.f168484a.miniAppDownloadInstallProgress((int) f);
                }
            }

            /* renamed from: a */
            public void onRequestAppMetaSuccess(int i, GadgetAppInfo gadgetAppInfo) {
                if (!TextUtils.isEmpty(gadgetAppInfo.getDecodeExtra()) && gadgetAppInfo.getMetaSource() != 1) {
                    HostDependManager.getInst().metaExtraNotify(gadgetAppInfo.getAppId(), gadgetAppInfo.getDecodeExtra(), C66739d.this.f168485b);
                }
                final AppInfoEntity convertGadgetAppInfoToAppInfoEntity = GadgetBeanConverter.convertGadgetAppInfoToAppInfoEntity(gadgetAppInfo, convertAppInfoEntityToSchemaEntity);
                if (i == 0 || i == 3 || i == 4) {
                    C66739d.this.f168486c = gadgetAppInfo;
                    if (C66739d.this.f168484a != null) {
                        C66739d.this.f168484a.requestAppInfoSuccess(convertGadgetAppInfoToAppInfoEntity);
                        C67866g.m264025a(new Action() {
                            /* class com.tt.miniapp.p3327s.C66739d.C667401.C667411 */

                            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                            public void act() {
                                C66612a.m260229a(convertGadgetAppInfoToAppInfoEntity.appId, convertGadgetAppInfoToAppInfoEntity.isGame(), convertGadgetAppInfoToAppInfoEntity.isSpecial());
                            }
                        }, Schedulers.shortIO());
                        return;
                    }
                    AppBrandLogger.m52829e("app_start_load_gadget_presenter", "requestAppInfoSuccess, mView is null");
                } else if (i == 1) {
                    C66739d.this.f168487d = gadgetAppInfo;
                    if (C66739d.this.f168484a != null) {
                        C66739d.this.f168484a.onCheckForUpdate(convertGadgetAppInfoToAppInfoEntity);
                    }
                }
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onDownloadSuccess(int i, boolean z) {
                AppBrandLogger.m52830i("app_start_load_gadget_presenter", "onDownloadSuccess:fromLocal", Boolean.valueOf(z));
                C66739d.this.f168484a.onPkgDownloadDone(true);
                if (i == 1 && !z && C66739d.this.f168487d != null && C66739d.this.f168486c != null && !TextUtils.equals(C66739d.this.f168486c.getMd5(), C66739d.this.f168487d.getMd5()) && C66739d.this.f168486c.getVersionCode() != C66739d.this.f168487d.getVersionCode()) {
                    C67866g.m264027a(new Runnable() {
                        /* class com.tt.miniapp.p3327s.C66739d.C667401.RunnableC667443 */

                        public void run() {
                            if (C66739d.this.f168484a != null) {
                                C66739d.this.f168484a.onUpdateReady();
                            }
                        }
                    });
                }
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onInstallPkgSuccess(final int i, String str, String str2) {
                AppBrandLogger.m52830i("app_start_load_gadget_presenter", "onInstallPkgSuccess:", str);
                if (i == 0 || i == 3 || i == 4) {
                    C67866g.m264025a(new Action() {
                        /* class com.tt.miniapp.p3327s.C66739d.C667401.C667422 */

                        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                        public void act() {
                            if (C66739d.this.f168484a != null) {
                                C66739d.this.f168484a.miniAppInstallSuccess(i);
                            }
                            Map<String, DependComponent> jsComponents = C66739d.this.f168486c.getJsComponents();
                            if (jsComponents != null && !jsComponents.isEmpty()) {
                                final ArrayList arrayList = new ArrayList();
                                arrayList.addAll(jsComponents.keySet());
                                AppBrandLogger.m52830i("app_start_load_gadget_presenter", "depend components:", arrayList);
                                C66399c.m259608a().mo231921a(arrayList, new IJSComponentManager.AbstractC24523a() {
                                    /* class com.tt.miniapp.p3327s.C66739d.C667401.C667422.C667431 */

                                    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager.AbstractC24523a
                                    /* renamed from: a */
                                    public void mo87362a(Map<String, ReadyJSComponent> map) {
                                        if (map != null) {
                                            Set<String> keySet = map.keySet();
                                            if (keySet.containsAll(arrayList)) {
                                                AppBrandLogger.m52830i("app_start_load_gadget_presenter", "onComponentFetch....ready");
                                                return;
                                            }
                                            arrayList.removeAll(keySet);
                                            new C67500a("op_common_component_app_start_failed", null, C66739d.this.f168485b).addCategoryValue("components", Arrays.toString(arrayList.toArray())).flush();
                                        }
                                    }
                                }, C66739d.this.f168485b);
                            }
                        }
                    }, C67554l.m262725b());
                }
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onFailed(int i, String str, String str2) {
                AppBrandLogger.m52829e("app_start_load_gadget_presenter", "onFailed errMsg:", str2, "code:", str, ", appId: ", convertAppInfoEntityToSchemaEntity.getIdentifier());
                C66739d.this.f168484a.onPkgDownloadDone(false);
                if (C66739d.this.f168484a == null) {
                    return;
                }
                if (i == 0 || i == 3 || i == 4) {
                    C66739d.this.f168484a.miniAppDownloadInstallFail(str2);
                } else if (i == 1) {
                    C66739d.this.f168484a.onUpdateFailed();
                }
            }

            @Override // com.tt.refer.common.meta.AbstractC67788b.AbstractC67792b
            public void onRequestAppMetaFail(int i, String str, String str2) {
                AppBrandLogger.m52829e("app_start_load_gadget_presenter", "requestAppInfoFail:requetType:", Integer.valueOf(i), "code", str, "errorMsg:", str2, "appId", convertAppInfoEntityToSchemaEntity.getIdentifier());
                if (i == 0 || i == 3 || i == 4) {
                    if (C66739d.this.f168484a != null) {
                        C66739d.this.f168484a.requestAppInfoFail(str, str2);
                        return;
                    }
                    AppBrandLogger.m52829e("app_start_load_gadget_presenter", "requestAppInfoFail, mView is null");
                } else if (i == 1 && C66739d.this.f168484a != null) {
                    C66739d.this.f168484a.onUpdateFailed();
                }
            }

            /* renamed from: a */
            public void onAppMetaInvalid(int i, GadgetAppInfo gadgetAppInfo, int i2) {
                AppBrandLogger.m52829e("app_start_load_gadget_presenter", "requestAppInfoFail:requetType:", Integer.valueOf(i), "invalidType", Integer.valueOf(i2), "appId", convertAppInfoEntityToSchemaEntity.getIdentifier());
                AppInfoEntity convertGadgetAppInfoToAppInfoEntity = GadgetBeanConverter.convertGadgetAppInfoToAppInfoEntity(gadgetAppInfo, convertAppInfoEntityToSchemaEntity);
                if ((i == 0 || i == 3 || i == 4) && C66739d.this.f168484a != null) {
                    switch (i2) {
                        case 1:
                            C66739d.this.f168484a.offline();
                            return;
                        case 2:
                        case 7:
                        case 8:
                            C66739d.this.f168484a.showNotSupportView(convertGadgetAppInfoToAppInfoEntity, i2);
                            return;
                        case 3:
                            C66739d.this.f168484a.noPermission();
                            return;
                        case 4:
                            C66739d.this.f168484a.mismatchHost();
                            return;
                        case 5:
                            C66739d.this.f168484a.metaExpired();
                            return;
                        case 6:
                        default:
                            AppBrandLogger.m52830i("app_start_load_gadget_presenter", "onAppInfoInvalid, appId: " + convertGadgetAppInfoToAppInfoEntity.appId + ", invalidType: " + i2);
                            return;
                    }
                }
            }
        }, true);
    }

    public C66739d(AbstractC66745e eVar, IAppContext iAppContext) {
        this.f168484a = eVar;
        this.f168485b = iAppContext;
    }
}
