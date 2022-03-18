package com.tt.miniapp.render;

import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.preload.IRenderViewPreload;

public interface OPRenderEngine {
    String getRenderTypeStr();

    RenderViewManager.IRenderManager getRenderViewInnerManager();

    IRenderViewPreload getRenderViewPreload();
}
