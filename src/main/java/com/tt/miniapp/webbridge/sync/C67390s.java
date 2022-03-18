package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.preload.PreloadManager;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.refer.common.annotation.ApiHandler;

@ApiHandler(eventName = "snapshotReady")
/* renamed from: com.tt.miniapp.webbridge.sync.s */
public class C67390s extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "snapshotReady";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        TimeLogger.getInstance(this.iAppContext).logTimeDuration("SnapShotRenderReadyHandler_hideloadingview");
        AppBrandLogger.m52830i("snapshotReady", "exec snapshotReady , callbackId = " + this.mCallBackId);
        ((PreloadManager) AppbrandApplicationImpl.getInst(this.iAppContext).getService(PreloadManager.class)).preloadOnIdle();
        return CharacterUtils.empty();
    }

    public C67390s(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
