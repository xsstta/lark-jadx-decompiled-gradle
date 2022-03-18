package com.tt.miniapp.manager.p3302a.p3303a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.larksuite.component.openplatform.core.loader.jsbundle.bean.ReadyJSComponent;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.refer.impl.business.meta.GadgetMonitorCreator;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.tt.miniapp.manager.a.a.b */
public class C66386b extends AbstractC66378a {
    public C66386b() {
        mo231898a(new GadgetMonitorCreator(mo231903e()));
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.manager.p3302a.p3303a.AbstractC66378a
    /* renamed from: e */
    public IAppContext mo231903e() {
        return C67448a.m262353a().mo234190i();
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.manager.p3302a.p3303a.AbstractC66378a
    /* renamed from: b */
    public void mo231900b() {
        String json = new Gson().toJson(this.f167580b);
        AppBrandLogger.m52830i("gadget_js_component_mgr", "saveReadyComponents:", json);
        Storage.getStorageByName(AppbrandContext.getInst().getApplicationContext(), "tenant_share_js_component").edit().putString("ready_js_components", json).apply();
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.manager.p3302a.p3303a.AbstractC66378a
    /* renamed from: c */
    public void mo231901c() {
        AppBrandLogger.m52830i("gadget_js_component_mgr", "clearReadyComponents:");
        Storage.getStorageByName(AppbrandContext.getInst().getApplicationContext(), "tenant_share_js_component").edit().clear().commit();
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.manager.p3302a.p3303a.AbstractC66378a
    /* renamed from: d */
    public void mo231902d() {
        String string = Storage.getStorageByName(AppbrandContext.getInst().getApplicationContext(), "tenant_share_js_component").getString("ready_js_components", "");
        if (TextUtils.isEmpty(string)) {
            AppBrandLogger.m52830i("gadget_js_component_mgr", "has no install components!");
            return;
        }
        Map map = (Map) new Gson().fromJson(string, new TypeToken<Map<String, ReadyJSComponent>>() {
            /* class com.tt.miniapp.manager.p3302a.p3303a.C66386b.C663882 */
        }.getType());
        if (map != null) {
            AppBrandLogger.m52830i("gadget_js_component_mgr", "ready_components:", Arrays.toString(map.entrySet().toArray()));
            this.f167580b.clear();
            this.f167581c.clear();
            this.f167580b.putAll(map);
            this.f167581c.putAll(map);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        r1 = new java.io.File(r1.mo87445a()).getParentFile();
     */
    @Override // com.tt.miniapp.manager.p3302a.p3303a.AbstractC66378a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo231899a(final boolean r11) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.manager.p3302a.p3303a.C66386b.mo231899a(boolean):void");
    }
}
