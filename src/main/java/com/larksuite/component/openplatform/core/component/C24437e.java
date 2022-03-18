package com.larksuite.component.openplatform.core.component;

import android.view.View;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.log.Log;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.NativeViewManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.larksuite.component.openplatform.core.component.e */
public class C24437e {

    /* renamed from: a */
    private final Map<String, Integer> f60299a = new ConcurrentHashMap();

    /* renamed from: b */
    private IAppContext f60300b;

    /* renamed from: a */
    public void mo87231a() {
        this.f60299a.clear();
        this.f60300b = null;
    }

    public C24437e(IAppContext iAppContext) {
        this.f60300b = iAppContext;
    }

    /* renamed from: b */
    public void mo87232b(String str) {
        synchronized (this) {
            Log.m165389i("OPWebViewComponentChann", "remove channel:" + str);
            this.f60299a.remove(str);
        }
    }

    /* renamed from: a */
    public String mo87230a(int i) {
        String str = "MESSAGE_CHANNEL_" + i;
        if (this.f60299a.containsKey(str)) {
            Log.m165389i("OPWebViewComponentChann", " this channel already generate :" + str);
            return str;
        }
        synchronized (this) {
            this.f60299a.put(str, Integer.valueOf(i));
            Log.m165389i("OPWebViewComponentChann", "view id:" + i);
        }
        return str;
    }

    /* renamed from: a */
    public View mo87229a(String str) {
        if (!this.f60299a.containsKey(str)) {
            Log.m165383e("OPWebViewComponentChann", "not set this channel." + str);
            return null;
        }
        synchronized (this) {
            int intValue = this.f60299a.get(str).intValue();
            RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(this.f60300b).getRenderViewManager();
            if (renderViewManager == null) {
                Log.m165383e("OPWebViewComponentChann", "webViewManager == null, appContextKey:" + this.f60300b.getAppId());
                return null;
            }
            RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
            if (currentIRender == null) {
                Log.m165383e("OPWebViewComponentChann", "render == null, appContextKey:" + this.f60300b.getAppId());
                return null;
            }
            NativeViewManager nativeViewManager = currentIRender.getNativeViewManager();
            if (nativeViewManager == null) {
                Log.m165383e("OPWebViewComponentChann", "nativeViewManager == null, appContextKey:" + this.f60300b.getAppId());
                return null;
            }
            return nativeViewManager.getView(intValue);
        }
    }
}
