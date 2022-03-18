package com.bytedance.ee.ref.card;

import android.app.Application;
import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.ref.card.p688c.AbstractC13527a;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.tt.miniapphost.util.DebugUtil;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.ref.card.d */
public class C13528d implements AbstractC13527a {

    /* renamed from: a */
    private Context f35616a;

    @Override // com.bytedance.ee.ref.card.p688c.AbstractC13527a
    /* renamed from: b */
    public boolean mo50287b() {
        return DebugUtil.debug();
    }

    @Override // com.bytedance.ee.ref.card.p688c.AbstractC13527a
    /* renamed from: c */
    public Application mo50288c() {
        return (Application) this.f35616a.getApplicationContext();
    }

    @Override // com.bytedance.ee.ref.card.p688c.AbstractC13527a
    /* renamed from: a */
    public String mo50285a() {
        String format = String.format("https://%s/open-apis/mina/v3/getAppMeta/batch", LarkHostDependManager.f34682b.mo49086a().mo48919b().mo148978a(DomainSettings.Alias.OPEN));
        AppBrandLogger.m52830i("CardSDKDependencyImpl", "card meta url:", format);
        return format;
    }

    public C13528d(Context context) {
        this.f35616a = context;
    }

    @Override // com.bytedance.ee.ref.card.p688c.AbstractC13527a
    /* renamed from: a */
    public void mo50286a(String str, JSONObject jSONObject) {
        if (LarkExtensionManager.getInstance().getExtension() != null) {
            LarkExtensionManager.getInstance().getExtension().mo49574a(str, jSONObject);
        }
    }
}
