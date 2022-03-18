package com.bytedance.ee.ref.p682a.p685c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.settings.v2.handler.C66759ab;
import com.tt.refer.impl.business.p3434e.AbstractC67906a;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.bytedance.ee.ref.a.c.a */
public class C13489a extends AbstractC67906a {

    /* renamed from: a */
    AbstractC67734b f35538a;

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public String mo50175a(int i) {
        return "";
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public List<C66578b.C66579a> mo50176a(String str) {
        return null;
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public boolean mo50181a(C66578b.C66579a aVar) {
        return false;
    }

    /* renamed from: a */
    private boolean m54808a() {
        String b = C66759ab.m260590a().mo232665b();
        String appId = this.f171032b.getAppId();
        if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(appId)) {
            try {
                JSONArray jSONArray = new JSONArray(b);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (appId.equals((String) jSONArray.get(i))) {
                        return true;
                    }
                }
            } catch (JSONException e) {
                AppBrandLogger.m52829e("WebAppPermissionService", "JSONException", e);
            }
        }
        return false;
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: b */
    public boolean mo50184b(int i) {
        return this.f35538a.mo50192a(i);
    }

    public C13489a(IAppContext iAppContext) {
        super(iAppContext);
        this.f35538a = (AbstractC67734b) iAppContext.findServiceByInterface(AbstractC67734b.class);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public void mo50178a(LinkedHashMap<Integer, String> linkedHashMap) {
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            mo50183b(entry.getKey().intValue(), entry.getValue().contentEquals("ok"));
        }
    }

    @Override // com.tt.refer.impl.business.p3434e.AbstractC67906a
    /* renamed from: a */
    public Set<C66578b.C66579a> mo50177a(String str, Set<C66578b.C66579a> set) {
        if (m54808a()) {
            return null;
        }
        return super.mo50177a(str, set);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: b */
    public boolean mo50185b(String str, int i) {
        return mo50179a(i, false);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public boolean mo50179a(int i, boolean z) {
        return this.f35538a.mo50194a(i, this.f171032b.getAppId(), z);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: b */
    public void mo50183b(int i, boolean z) {
        this.f35538a.mo50188a(i, getAppContext().getAppId(), z, System.currentTimeMillis());
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public boolean mo50182a(String str, int i) {
        return mo50184b(i);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public boolean mo50180a(Context context, String str, int i) {
        return this.f35538a.mo50196a(str, i);
    }
}
