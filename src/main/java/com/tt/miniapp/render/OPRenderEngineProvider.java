package com.tt.miniapp.render;

import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;

public interface OPRenderEngineProvider {
    RenderEngineType getEngineType();

    OPRenderEngine getRenderEngine(AppbrandApplicationImpl appbrandApplicationImpl);

    ISandboxEnvInfo[] getSandboxEnvConfigList(IAppSandboxEnvProcessor iAppSandboxEnvProcessor);

    boolean isSupportDarkMode();
}
