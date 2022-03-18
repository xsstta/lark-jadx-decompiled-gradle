package com.larksuite.component.openplatform.core.plugin.container;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.C65844b;
import com.tt.miniapp.component.nativeview.NativeViewManager;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapphost.AppbrandContext;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.o */
public class C24690o extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "setKeyboardValue";
    }

    public C24690o() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f168426a);
            int i = jSONObject.getInt("inputId");
            final int i2 = jSONObject.getInt("cursor");
            final String string = jSONObject.getString("value");
            RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(mo232455f()).getRenderViewManager();
            if (renderViewManager == null) {
                AppBrandLogger.m52829e("tma_ApiRequestCtrl", "webViewManager == null, appContextKey:" + mo232455f().getAppId());
                return mo232451b("WebViewManager is null");
            }
            RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
            if (currentIRender == null) {
                AppBrandLogger.m52829e("tma_ApiRequestCtrl", "render == null, appContextKey:" + mo232455f().getAppId());
                return mo232451b("current render is null");
            }
            NativeViewManager nativeViewManager = currentIRender.getNativeViewManager();
            if (nativeViewManager == null) {
                AppBrandLogger.m52829e("tma_ApiRequestCtrl", "nativeViewManager == null, appContextKey:" + mo232455f().getAppId());
                return mo232451b("native view manager is null");
            }
            View view = nativeViewManager.getView(i);
            if (view instanceof C65844b) {
                final C65844b bVar = (C65844b) view;
                if (!TextUtils.equals(bVar.getValue(), string)) {
                    AppbrandContext.getMainHandler().post(new Runnable() {
                        /* class com.larksuite.component.openplatform.core.plugin.container.C24690o.RunnableC246911 */

                        public void run() {
                            bVar.setValue(string);
                            int i = i2;
                            if (i != -1) {
                                bVar.setSelection(i);
                                return;
                            }
                            C65844b bVar = bVar;
                            bVar.setSelection(bVar.getText().length());
                        }
                    });
                }
                return mo232456g();
            }
            AppBrandLogger.m52829e("tma_ApiRequestCtrl", "view is not input");
            return mo232451b("input id error");
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_ApiRequestCtrl", e);
            return mo232445a(e);
        }
    }

    public C24690o(String str) {
        super(str);
    }
}
