package com.larksuite.component.openplatform.core.plugin.inner;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.util.C67063u;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONException;
import org.json.JSONObject;

@ApiHandler(eventName = "storePreRenderData")
/* renamed from: com.larksuite.component.openplatform.core.plugin.inner.j */
public class C25009j extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "storePreRenderData";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        String str = C67432a.m262319a(this.iAppContext).getAppInfo().appId;
        if (!HostDependManager.getInst().isPreRenderApp()) {
            return CharacterUtils.empty();
        }
        if (!C67063u.m261365a(str)) {
            return CharacterUtils.empty();
        }
        try {
            String optString = new JSONObject(this.mArgs).optString("preRenderData");
            if (!TextUtils.isEmpty(optString)) {
                C67063u.m261364a(C67063u.m261363a(this.iAppContext), optString);
            }
        } catch (JSONException e) {
            AppBrandLogger.m52829e("tma_ApiStorePreRenderCtrl", e);
            callbackFail(e);
        }
        return CharacterUtils.empty();
    }

    public C25009j(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
