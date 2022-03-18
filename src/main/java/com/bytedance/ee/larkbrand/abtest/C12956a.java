package com.bytedance.ee.larkbrand.abtest;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.abtest.p646a.C12957a;
import com.bytedance.ee.larkbrand.p649d.C12989b;
import com.he.jsbinding.snapshot.ISnapshotService;
import com.he.jsbinding.snapshot.SnapshotServiceImpl;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.jsbridge.V8ShareManager;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.abtest.a */
public class C12956a {

    /* renamed from: a */
    private JSONObject f34511a;

    /* renamed from: a */
    public static C12956a m53359a() {
        return C12989b.m53447a().mo48913c();
    }

    /* renamed from: a */
    public JSONObject mo48857a(String str) {
        return C12957a.m53363a(str);
    }

    /* renamed from: b */
    public JSONObject mo48859b(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str) || (jSONObject = this.f34511a) == null) {
            return null;
        }
        return jSONObject.optJSONObject(str);
    }

    /* renamed from: a */
    public void mo48858a(IAppContext iAppContext, Intent intent) {
        if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra("ab_experiment");
                if (!TextUtils.isEmpty(stringExtra)) {
                    this.f34511a = new JSONObject(stringExtra);
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("LarkABExperiment", e);
            }
            if (!(iAppContext == null || iAppContext.getApplicationContext() == null)) {
                V8ShareManager.f167231a.mo231624a(iAppContext.getApplicationContext(), intent);
            }
            ISnapshotService iSnapshotService = (ISnapshotService) AppbrandApplicationImpl.getInst(iAppContext).getService(SnapshotServiceImpl.class);
            if (iSnapshotService != null) {
                iSnapshotService.updateSnapshotABIntent(intent);
            }
        }
    }
}
