package com.tt.miniapp.webbridge;

import com.tt.miniapp.RenderViewManager;
import com.tt.option.ext.AbstractC67628l;

/* renamed from: com.tt.miniapp.webbridge.f */
public abstract class AbstractC67320f extends AbstractC67628l {
    public RenderViewManager.IRender mRender;

    public int getWebViewId() {
        RenderViewManager.IRender iRender = this.mRender;
        if (iRender != null) {
            return iRender.getRenderViewId();
        }
        return 0;
    }

    public AbstractC67320f(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
        this.mRender = iRender;
    }
}
