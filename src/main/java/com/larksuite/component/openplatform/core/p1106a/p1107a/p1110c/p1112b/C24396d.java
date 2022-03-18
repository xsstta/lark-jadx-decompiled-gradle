package com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.card.meta.CardMetaFetcher;
import com.bytedance.ee.ref.card.p687b.C13523c;
import com.google.gson.JsonObject;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.openplatform.api.entity.C24377a;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24369b;
import com.larksuite.component.openplatform.core.block.C24417g;
import com.larksuite.component.openplatform.core.block.C24418h;
import com.larksuite.component.openplatform.core.container.p1118a.AbstractC24459a;
import com.larksuite.component.openplatform.core.container.p1118a.AbstractC24469d;
import com.larksuite.component.openplatform.core.loader.abs.AbstractC24507b;
import com.larksuite.component.openplatform.core.loader.abs.LoadTaskType;
import com.larksuite.component.openplatform.core.loader.meta.impl.block.BlockMetaFetcher;
import com.larksuite.component.openplatform.core.loader.meta.impl.block.C24566e;
import com.larksuite.component.openplatform.core.loader.p1122a.C24502b;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1109b.C24381a;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.suite.R;
import com.tt.miniapp.toast.ToastManager;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.meta.AbstractC67783a;
import com.tt.refer.common.meta.AbstractC67788b;
import com.tt.refer.common.meta.AbstractC67796c;
import com.tt.refer.common.meta.IAppMetaService;
import com.tt.refer.common.meta.base.AbsAppMeta;
import com.tt.refer.common.meta.base.AbsMetaLoadEntity;
import com.tt.refer.impl.business.meta.GadgetMetaFetcher;
import com.tt.refer.impl.business.meta.GadgetSchema;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.a.a.c.b.d */
public class C24396d extends AbstractC24387a {
    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: a */
    public void mo87177a(IAppContext iAppContext, Bundle bundle) {
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: c */
    public String mo87181c() {
        return "STEP_LOADER";
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: c */
    public void mo87182c(IAppContext iAppContext, Bundle bundle) {
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: d */
    public boolean mo87183d() {
        return true;
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: a */
    public void mo87178a(C24381a aVar, AbstractC24469d dVar) {
        super.mo87178a(aVar, dVar);
    }

    /* renamed from: e */
    public void mo87189e(IAppContext iAppContext, Bundle bundle) {
        mo87176a().mo87166a(this, iAppContext, bundle, "-10005", "LAUNCH_SCHEDULER_STEP_STEP_LOADER_ILLEGAL_TYPE");
    }

    /* renamed from: d */
    public void mo87188d(IAppContext iAppContext, Bundle bundle) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(UpdateKey.STATUS, (Number) 0);
        mo87176a().mo87166a(this, iAppContext, bundle, "-10016", jsonObject.toString());
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: b */
    public void mo87180b(final IAppContext iAppContext, final Bundle bundle) {
        C24566e.C24567a aVar;
        AbstractC67788b bVar;
        String string = bundle.getString(C24377a.f60156a);
        String string2 = bundle.getString(C24377a.f60157b);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            mo87176a().mo87166a(this, iAppContext, bundle, "-10004", "LAUNCH_SCHEDULER_STEP_LOADER_ILLEGAL_PARAMS ");
            return;
        }
        final AppType appType = (AppType) C25529d.m91149b(bundle, C24377a.f60160e);
        AbstractC67796c cVar = (AbstractC67796c) iAppContext.findServiceByInterface(AbstractC67796c.class);
        if (appType == AppType.CardAPP) {
            AbsMetaLoadEntity aVar2 = new C13523c.C13524a(string, string2);
            if (cVar != null) {
                cVar.mo88673a(aVar2);
            }
            bVar = new CardMetaFetcher(iAppContext);
            aVar = aVar2;
        } else if (appType == AppType.BlockitApp) {
            C24566e.C24567a aVar3 = new C24566e.C24567a(string, string2);
            String string3 = bundle.getString("preview_token", "");
            if (!TextUtils.isEmpty(string3)) {
                aVar3.mo87529a(string3);
                aVar3.setVersionType("preview");
            }
            if (cVar != null) {
                cVar.mo88673a(aVar3);
            }
            bVar = new BlockMetaFetcher((AbstractC67783a) ((IAppMetaService) iAppContext.findServiceByInterface(IAppMetaService.class)), iAppContext);
            aVar = aVar3;
        } else if (appType == AppType.GadgetAPP) {
            AbsMetaLoadEntity entity = new GadgetSchema.C67943Entity(string);
            bVar = new GadgetMetaFetcher(iAppContext);
            aVar = entity;
        } else {
            mo87176a().mo87166a(this, iAppContext, bundle, "-10005", "LAUNCH_SCHEDULER_STEP_STEP_LOADER_ILLEGAL_TYPE");
            return;
        }
        final C24502b bVar2 = new C24502b(iAppContext, bVar, null);
        mo87179b().mo87283a(bVar2);
        bVar2.mo87360a(iAppContext.getApplicationContext(), aVar == 1 ? 1 : 0, new AbstractC24507b.AbstractC24508a() {
            /* class com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b.C24396d.C243971 */

            @Override // com.larksuite.component.openplatform.core.loader.abs.AbstractC24507b.AbstractC24508a
            /* renamed from: b */
            public void mo87194b() {
                C24396d.this.mo87176a().mo87170c();
            }

            @Override // com.larksuite.component.openplatform.core.loader.abs.AbstractC24507b.AbstractC24508a
            /* renamed from: a */
            public void mo87190a() {
                if (C24396d.this.mo87187a(appType, bVar2, bundle, iAppContext)) {
                    C24396d.this.mo87176a().mo87169b(C24396d.this, iAppContext, bundle);
                }
            }

            @Override // com.larksuite.component.openplatform.core.loader.abs.AbstractC24507b.AbstractC24508a
            /* renamed from: a */
            public void mo87193a(String str) {
                AppBrandLogger.m52830i("OP_SDK_Launch_LoaderStep", "STEP_TYPE_LOADER : onPackageLoaded" + str);
            }

            @Override // com.larksuite.component.openplatform.core.loader.abs.AbstractC24507b.AbstractC24508a
            /* renamed from: a */
            public void mo87192a(AbsAppMeta absAppMeta) {
                boolean z = true;
                AppBrandLogger.m52830i("OP_SDK_Launch_LoaderStep", "STEP_TYPE_LOADER : onMetaLoaded" + absAppMeta.getAppId() + " & " + absAppMeta.getIdentifier());
                AbstractC24459a aVar = (AbstractC24459a) iAppContext.findServiceByInterface(AbstractC24459a.class);
                if (aVar != null) {
                    aVar.mo87271a(absAppMeta);
                }
                iAppContext.putExtra("APP_META", absAppMeta);
                if (absAppMeta.getMetaSource() != 1) {
                    z = false;
                }
                iAppContext.putExtra("meta_cache", Boolean.valueOf(z));
            }

            @Override // com.larksuite.component.openplatform.core.loader.abs.AbstractC24507b.AbstractC24508a
            /* renamed from: a */
            public void mo87191a(LoadTaskType loadTaskType, String str, String str2, Bundle bundle) {
                if (AppType.BlockitApp.equals(appType)) {
                    if (LoadTaskType.META.equals(loadTaskType)) {
                        C24417g gVar = new C24417g("mp_app_launch_result", C24418h.f60258h, iAppContext);
                        gVar.setErrorMessage(str + " ," + str2).flush();
                    } else if (LoadTaskType.PACKAGE.equals(loadTaskType)) {
                        C24417g gVar2 = new C24417g("mp_app_launch_result", C24418h.f60259i, iAppContext);
                        gVar2.setErrorMessage(str + " ," + str2).flush();
                    }
                    if ("10251".equals(str)) {
                        ToastManager.showShortToast(C24396d.this.mo87179b().mo49749b(), C24396d.this.mo87179b().mo49749b().getString(R.string.OpenPlatform_WorkplaceBlock_PreviewTokenExpireMsg));
                    }
                    if (bundle == null) {
                        C24396d.this.mo87189e(iAppContext, bundle);
                    } else if (bundle.getInt("sub_error_code") == 1) {
                        C24396d.this.mo87188d(iAppContext, bundle);
                    } else {
                        C24396d.this.mo87189e(iAppContext, bundle);
                    }
                } else {
                    C24396d.this.mo87189e(iAppContext, bundle);
                }
                AppBrandLogger.m52830i("OP_SDK_Launch_LoaderStep", "STEP_TYPE_LOADER : onLoadError" + loadTaskType + " & code : " + str + " errMsg : " + str2);
            }
        });
    }

    /* renamed from: a */
    public boolean mo87187a(AppType appType, C24502b bVar, Bundle bundle, IAppContext iAppContext) {
        JSONException e;
        if (appType == AppType.BlockitApp) {
            String b = bVar.mo87359a().mo87365b("project.config.json");
            if (TextUtils.isEmpty(b)) {
                mo87176a().mo87166a(this, iAppContext, bundle, "-10006", "LAUNCH_SCHEDULER_STEP_STEP_O_PROJECT_CONFIG");
                AppBrandLogger.m52829e("OP_SDK_Launch_LoaderStep", "STEP_TYPE_LOADER : processConfigError :LAUNCH_SCHEDULER_STEP_STEP_O_PROJECT_CONFIG");
                return false;
            }
            try {
                String optString = new JSONObject(b).optString("blocks");
                if (TextUtils.isEmpty(optString)) {
                    mo87176a().mo87166a(this, iAppContext, bundle, "-10007", "LAUNCH_SCHEDULER_STEP_STEP_NO_BLOCK_CONFIG");
                    AppBrandLogger.m52829e("OP_SDK_Launch_LoaderStep", "STEP_TYPE_LOADER : processConfigError :LAUNCH_SCHEDULER_STEP_STEP_NO_BLOCK_CONFIG");
                    return false;
                }
                JSONArray jSONArray = new JSONArray(optString);
                if (jSONArray.length() > 0) {
                    String str = jSONArray.optString(0) + ".json";
                    String str2 = jSONArray.optString(0) + ".js";
                    bundle.putString("blockPath", str2);
                    AppBrandLogger.m52830i("OP_SDK_Launch_LoaderStep", "finalBlockPath : " + str2);
                    String b2 = bVar.mo87359a().mo87365b(str);
                    if (!TextUtils.isEmpty(b2)) {
                        JSONObject jSONObject = new JSONObject(b2);
                        String str3 = jSONObject.optString("creator") + ".js";
                        AppBrandLogger.m52830i("OP_SDK_Launch_LoaderStep", "creatorPath : " + str3);
                        bundle.putString("creatorPath", str3);
                        try {
                            iAppContext.putExtra("darkmode", Boolean.valueOf(jSONObject.optBoolean("darkmode", false)));
                            Set<AbstractC24369b> o = mo87179b().mo87297o();
                            if (o != null && !o.isEmpty()) {
                                for (AbstractC24369b bVar2 : o) {
                                    bVar2.onConfigLoaded(jSONObject);
                                }
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            mo87176a().mo87166a(this, iAppContext, bundle, "-10008", "LAUNCH_SCHEDULER_STEP_STEP_PROCESS_CONFIG_EXCEPTION");
                            AppBrandLogger.m52829e("OP_SDK_Launch_LoaderStep", "STEP_TYPE_LOADER : processConfigError :" + e.getMessage());
                            return false;
                        }
                    } else {
                        AppBrandLogger.m52830i("OP_SDK_Launch_LoaderStep", "creatorPath is null");
                    }
                } else {
                    mo87176a().mo87166a(this, iAppContext, bundle, "-10009", "LAUNCH_SCHEDULER_STEP_NO_BLOCK_PATH");
                    AppBrandLogger.m52829e("OP_SDK_Launch_LoaderStep", "STEP_TYPE_LOADER : processConfigError :LAUNCH_SCHEDULER_STEP_NO_BLOCK_PATH");
                }
            } catch (JSONException e3) {
                e = e3;
                mo87176a().mo87166a(this, iAppContext, bundle, "-10008", "LAUNCH_SCHEDULER_STEP_STEP_PROCESS_CONFIG_EXCEPTION");
                AppBrandLogger.m52829e("OP_SDK_Launch_LoaderStep", "STEP_TYPE_LOADER : processConfigError :" + e.getMessage());
                return false;
            }
        } else {
            AppBrandLogger.m52830i("OP_SDK_Launch_LoaderStep", "processConfig error : illegal app type: " + appType);
        }
        return true;
    }
}
