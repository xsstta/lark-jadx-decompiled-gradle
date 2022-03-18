package com.tt.refer.impl.business.meta;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.utils.DebugHelper;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.miniapp.manager.C66375a;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapp.manager.UpdateAppManager;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.settings.v2.handler.C66786m;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.C67531h;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.option.p3392m.C67657c;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.meta.AbstractC67783a;
import com.tt.refer.common.meta.base.AbsAppMeta;
import com.tt.refer.common.meta.fetch.AbstractC67799c;
import com.tt.refer.common.meta.fetch.AbstractC67806i;
import com.tt.refer.common.meta.fetch.C67800d;
import com.tt.refer.common.meta.fetch.C67803g;
import com.tt.refer.impl.business.meta.GadgetSchema;
import com.tt.refer.impl.business.meta.p3436a.C67946a;
import com.tt.refer.impl.business.meta.p3436a.C67947b;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.tt.refer.impl.business.meta.b */
public class C67948b extends AbstractC67783a<GadgetAppInfo, GadgetSchema.C67943Entity> {

    /* renamed from: g */
    private static String f171190g = "gadget_app_start_load_meta_service";

    /* renamed from: h */
    private final AbstractC67806i<GadgetAppInfo> f171191h;

    /* renamed from: i */
    private IAppContext f171192i;

    public C67948b(IAppContext iAppContext) {
        this(iAppContext, new C67800d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo235269c(GadgetAppInfo gadgetAppInfo) {
        if (this.f171192i.getAppType() != AppType.WebGadgetAPP) {
            super.mo235269c(gadgetAppInfo);
        } else if (gadgetAppInfo != null) {
            String a = mo235259a(gadgetAppInfo.getIdentifier(), gadgetAppInfo.getWebVersionCode());
            AppBrandLogger.m52830i(f171190g, "removeFromMemoryCache success: metaKey is ", a);
            this.f170714c.remove(a);
        } else {
            AppBrandLogger.m52829e(f171190g, "no need removeFromMemoryCache", gadgetAppInfo.getIdentifier());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo87527a(GadgetAppInfo gadgetAppInfo) {
        if (this.f171192i.getAppType() == AppType.WebGadgetAPP) {
            if (gadgetAppInfo != null) {
                String a = mo235259a(gadgetAppInfo.getIdentifier(), gadgetAppInfo.getWebVersionCode());
                AppBrandLogger.m52830i(f171190g, "saveMetaToMemoryCache success: metaKey is ", a);
                this.f170714c.put(a, gadgetAppInfo);
                return;
            }
            AppBrandLogger.m52829e(f171190g, "saveMetaToMemoryCache fail: appMetaInfo not exist!");
        } else if (gadgetAppInfo == null) {
            AppBrandLogger.m52829e(f171190g, "saveMetaToMemoryCache fail: appMetaInfo not exist!");
        } else if (LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.gadget.preset.enable", false)) {
            String versionType = gadgetAppInfo.getVersionType();
            GadgetAppInfo a2 = mo50349a(this.f171192i.getApplicationContext(), new GadgetSchema.C67943Entity(gadgetAppInfo.getAppId()));
            if (a2 != null && C66375a.m259526b(gadgetAppInfo.getAppVersion(), a2.getAppVersion())) {
                super.mo87527a((AbsAppMeta) gadgetAppInfo);
            } else if (a2 == null || mo235268b(versionType)) {
                super.mo87527a((AbsAppMeta) gadgetAppInfo);
            } else {
                AppBrandLogger.m52829e(f171190g, "appMetaInfo version less than cacheGadgetAppInfo version");
            }
        } else {
            super.mo87527a((AbsAppMeta) gadgetAppInfo);
            if (gadgetAppInfo != null) {
                Context applicationContext = this.f171192i.getApplicationContext();
                Storage.getStorageByName(applicationContext, Storage.getStorageFilePrefix("new_update_app_info_v2" + gadgetAppInfo.getAppId())).edit().putLong("save_time", System.currentTimeMillis()).commit();
                return;
            }
            AppBrandLogger.m52829e(f171190g, "saveMetaTimeToMemoryCache fail: appMetaInfo not exist!");
        }
    }

    public C67948b(IAppContext iAppContext, AbstractC67799c cVar) {
        super(iAppContext, new C67947b(), cVar);
        if (iAppContext.getAppType() == AppType.WebGadgetAPP) {
            f171190g = "h5gadget_app_start_load_meta_service";
        }
        this.f171192i = iAppContext;
        this.f171191h = new C67946a(iAppContext);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.meta.AbstractC67783a
    /* renamed from: a */
    public String mo50351a(String str, boolean z) {
        if (z) {
            String str2 = f171190g;
            AppBrandLogger.m52830i(str2, "getStorageFileName->preview mode and appid:" + str);
            return Storage.getStorageFilePrefix("new_debug_update_app_info" + str);
        }
        String str3 = f171190g;
        AppBrandLogger.m52830i(str3, "getStorageFileName->current mode and appid:" + str);
        return Storage.getStorageFilePrefix("new_update_app_info_v2" + str);
    }

    /* renamed from: a */
    public GadgetAppInfo mo50349a(Context context, GadgetSchema.C67943Entity entity) {
        if (entity.getAppId() == null || entity.getAppId().length() <= 0 || entity.getAppId().indexOf(File.separatorChar) < 0) {
            String string = Storage.getStorageByName(context, mo50351a(entity.getAppId(), entity.isLocalTest())).getString(entity.getIdentifier(), "");
            if (TextUtils.isEmpty(string)) {
                AppBrandLogger.m52830i(f171190g, "getAppMetaFromLocal->local meta is empty,try get legacy data! identify:", entity.getIdentifier());
                UpdateAppManager.clearLegacyJsonData(context, entity.getAppId(), entity.isLocalTest());
                return null;
            }
            try {
                GadgetAppInfo b = this.f171191h.mo50346b(this.f171191h.b_(string));
                this.f171191h.mo235305a(b);
                if (b != null) {
                    String a = mo235258a();
                    String language = b.getLanguage();
                    if (!TextUtils.isEmpty(language) && !language.equals(a)) {
                        AppBrandLogger.m52830i(f171190g, String.format("meta lang is not match current language ,delete it!Identifier :%s", entity.getIdentifier()));
                        mo235257b(context, entity);
                        return null;
                    }
                }
                return b;
            } catch (Exception e) {
                String str = f171190g;
                AppBrandLogger.m52829e(str, "getAppMetaFromLocal->parser exception:" + e.getMessage());
                return null;
            }
        } else {
            AppBrandLogger.m52830i(f171190g, "app_id Illegal");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.meta.AbstractC67783a
    /* renamed from: a */
    public C67803g<? extends C67803g.AbstractC67804a> mo50350a(Context context, List<GadgetSchema.C67943Entity> list) {
        String str = null;
        if (list.isEmpty()) {
            AppBrandLogger.m52829e(f171190g, "createMetaRequest>>> entities is empty!");
            return null;
        }
        GadgetSchema.C67943Entity entity = list.get(0);
        String a = ((AbstractC67724a) this.f171192i.findServiceByInterface(AbstractC67724a.class)).mo50438a(this.f171192i);
        if (TextUtils.isEmpty(a)) {
            AppBrandLogger.m52829e(f171190g, "createMetaRequest>>> meta url is null!");
            return null;
        }
        String format = String.format("https://%s/open-apis/mina/v2/getAppMeta", a);
        AppBrandLogger.m52830i(f171190g, "gadget meta url:", format);
        CrossProcessDataEntity f = C67556a.m262949f();
        if (f != null) {
            str = new C66467o.C66470b(f).f167782h;
        }
        C67803g<? extends C67803g.AbstractC67804a> gVar = new C67803g<>(format, str, mo235258a(), this.f170716e);
        HashMap hashMap = new HashMap();
        String versionType = entity.getVersionType();
        if (!versionType.equals("preview")) {
            if (DebugHelper.m54233b(context)) {
                versionType = "current";
            } else if (C66786m.m260648a(context).mo232696a(entity.getAppId())) {
                versionType = "test";
            }
        }
        AppBrandLogger.m52830i(f171190g, "version type:", versionType);
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, versionType);
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, entity.getAppId());
        hashMap.put("ttcode", this.f170716e.f167670c);
        hashMap.put("sdk_version", 3420001);
        if (!TextUtils.isEmpty(entity.getToken())) {
            hashMap.put("token", entity.getToken());
        }
        C67531h initParams = AppbrandContext.getInst().getInitParams();
        if (initParams != null) {
            hashMap.put("aid", initParams.mo234510j());
            hashMap.put("version_code", initParams.mo234500a());
            hashMap.put("bdp_version_code", initParams.mo234500a());
            hashMap.put("bdp_device_id", C67657c.m263250a());
            hashMap.put("channel", initParams.mo234502b());
            hashMap.put("device_platform", initParams.mo234503c());
            hashMap.put("bdp_device_platform", initParams.mo234503c());
            hashMap.put("os_version", initParams.mo234504d());
            hashMap.put("tma_jssdk_version", C66399c.m259608a().mo231922b(context, getAppContext()));
        }
        gVar.mo235311b(hashMap);
        return gVar;
    }

    /* renamed from: a */
    public void mo50353a(Context context, GadgetAppInfo gadgetAppInfo) {
        String a = mo235258a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("encryKey", this.f170716e.f167668a).put("encryIV", this.f170716e.f167669b).put("lang", a).put("from_preset", false).put("value", GadgetAppInfoGsonParser.getGson().toJson(gadgetAppInfo));
            Storage.getStorageByName(context, mo50351a(gadgetAppInfo.getAppId(), mo235265a(gadgetAppInfo.getVersionType()))).edit().putString(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, gadgetAppInfo.getAppVersion()).putLong("save_time", System.currentTimeMillis()).putString(gadgetAppInfo.getIdentifier(), jSONObject.toString()).commit();
        } catch (Exception e) {
            AppBrandLogger.m52829e(f171190g, "saveAppMeta exception:", e.getMessage());
        }
    }
}
