package com.tt.miniapp.render;

import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.preload.C66602b;
import com.tt.miniapp.preload.IRenderViewPreload;
import com.tt.miniapp.preload.PreloadManager;

/* renamed from: com.tt.miniapp.render.c */
public class C66733c implements OPRenderEngine {

    /* renamed from: a */
    final AppbrandApplicationImpl f168479a;

    /* renamed from: b */
    final IRenderViewPreload f168480b;

    /* renamed from: c */
    final RenderViewManager.IRenderManager f168481c;

    @Override // com.tt.miniapp.render.OPRenderEngine
    public String getRenderTypeStr() {
        return "webview";
    }

    @Override // com.tt.miniapp.render.OPRenderEngine
    public RenderViewManager.IRenderManager getRenderViewInnerManager() {
        return this.f168481c;
    }

    @Override // com.tt.miniapp.render.OPRenderEngine
    public IRenderViewPreload getRenderViewPreload() {
        return this.f168480b;
    }

    protected C66733c(AppbrandApplicationImpl appbrandApplicationImpl) {
        this.f168479a = appbrandApplicationImpl;
        this.f168480b = new C66602b((PreloadManager) appbrandApplicationImpl.getService(PreloadManager.class), appbrandApplicationImpl.getiAppContext());
        this.f168481c = new C66728b(appbrandApplicationImpl.getRenderViewManager());
    }
}
