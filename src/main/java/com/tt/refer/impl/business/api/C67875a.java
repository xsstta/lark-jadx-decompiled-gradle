package com.tt.refer.impl.business.api;

import android.app.Application;
import android.content.SharedPreferences;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.miniapp.settings.configs.IGadgetFgService;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.p3400a.p3401a.AbstractC67699a;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.refer.impl.business.api.a */
public class C67875a implements AbstractC67699a {

    /* renamed from: a */
    private IAppContext f170945a;

    /* renamed from: b */
    private boolean f170946b;

    /* renamed from: c */
    private JSONObject f170947c;

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
    }

    @Override // com.tt.refer.p3400a.p3401a.AbstractC67699a
    /* renamed from: d */
    public boolean mo234980d() {
        return this.f170946b;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public IAppContext getAppContext() {
        return this.f170945a;
    }

    @Override // com.tt.refer.p3400a.p3401a.AbstractC67699a
    /* renamed from: a */
    public void mo234975a() {
        if (mo234980d()) {
            m264046e().edit().clear().apply();
        }
    }

    /* renamed from: e */
    private SharedPreferences m264046e() {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        return C12899a.m53203a(applicationContext, "START_UP_STORAGE_KEY_SP" + this.f170945a.getAppId());
    }

    @Override // com.tt.refer.p3400a.p3401a.AbstractC67699a
    /* renamed from: b */
    public JSONObject mo234977b() {
        JSONException e;
        if (!mo234980d()) {
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                AbstractC12910a aVar = (AbstractC12910a) this.f170945a.findServiceByInterface(AbstractC12910a.class);
                JSONObject jSONObject = new JSONObject();
                AppBrandLogger.m52828d("APICacheServiceImpl", "set before cost:", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                long a = C67070z.m261383a(aVar.mo48694b(), true);
                AppBrandLogger.m52828d("APICacheServiceImpl", "set size cost:", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                long a2 = C67070z.m261383a(aVar.mo48698c(), true);
                AppBrandLogger.m52828d("APICacheServiceImpl", "set limit size cost:", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                JSONArray d = aVar.mo48702d();
                AppBrandLogger.m52828d("APICacheServiceImpl", "set keys cost:", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                jSONObject.put("currentSize", a);
                jSONObject.put("limitSize", a2);
                jSONObject.put("keys", d.toString());
                AppBrandLogger.m52830i("APICacheServiceImpl", "set storage cache cost:", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                return jSONObject;
            } catch (JSONException e2) {
                e = e2;
                AppBrandLogger.m52829e("APICacheServiceImpl", e);
                return null;
            }
        } catch (JSONException e3) {
            e = e3;
            AppBrandLogger.m52829e("APICacheServiceImpl", e);
            return null;
        }
    }

    @Override // com.tt.refer.p3400a.p3401a.AbstractC67699a
    /* renamed from: c */
    public synchronized JSONObject mo234979c() {
        if (!mo234980d()) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f170947c == null) {
                AbstractC12910a aVar = (AbstractC12910a) this.f170945a.findServiceByInterface(AbstractC12910a.class);
                Set<String> keySet = m264046e().getAll().keySet();
                JSONObject jSONObject = new JSONObject();
                if (keySet != null && keySet.size() > 0) {
                    for (String str : keySet) {
                        String b = aVar.mo48697b(str);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("value", b).put(ShareHitPoint.f121869d, aVar.mo48700c(str));
                        jSONObject.put(str, jSONObject2);
                    }
                }
                this.f170947c = jSONObject;
            }
            AppBrandLogger.m52830i("APICacheServiceImpl", "get storage cache", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return this.f170947c;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("APICacheServiceImpl", e);
            return null;
        }
    }

    @Override // com.tt.refer.p3400a.p3401a.AbstractC67699a
    /* renamed from: b */
    public void mo234978b(String str) {
        if (mo234980d()) {
            m264046e().edit().remove(str).apply();
        }
    }

    public C67875a(IAppContext iAppContext) {
        this.f170945a = iAppContext;
        boolean gadgetFG = ((IGadgetFgService) iAppContext.findServiceByInterface(IGadgetFgService.class)).getGadgetFG("storage_js_sdk_cache", false);
        this.f170946b = gadgetFG;
        AppBrandLogger.m52830i("APICacheServiceImpl", "storage cache: enableStorageCacheGadgetFG", Boolean.valueOf(gadgetFG));
    }

    @Override // com.tt.refer.p3400a.p3401a.AbstractC67699a
    /* renamed from: a */
    public void mo234976a(String str) {
        if (mo234980d()) {
            long currentTimeMillis = System.currentTimeMillis();
            m264046e().edit().putString(str, "").apply();
            AppBrandLogger.m52830i("APICacheServiceImpl", "start up storage: cost :", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "key:" + str);
        }
    }
}
