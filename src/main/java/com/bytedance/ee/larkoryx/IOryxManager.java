package com.bytedance.ee.larkoryx;

import android.content.Context;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.render.RenderEngineManageService;
import com.tt.miniapphost.entity.AppInfoEntity;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/larkoryx/IOryxManager;", "", "initProcess", "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "isAppOryxEnable", "currentAppInfo", "Lcom/tt/miniapphost/entity/AppInfoEntity;", "isOryxRenderSupport", "context", "Landroid/content/Context;", "regRenderEngine", "", "service", "Lcom/tt/miniapp/render/RenderEngineManageService;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IOryxManager {
    boolean initProcess(IAppContext iAppContext);

    boolean isAppOryxEnable(AppInfoEntity appInfoEntity);

    boolean isOryxRenderSupport(Context context);

    void regRenderEngine(RenderEngineManageService renderEngineManageService);
}
