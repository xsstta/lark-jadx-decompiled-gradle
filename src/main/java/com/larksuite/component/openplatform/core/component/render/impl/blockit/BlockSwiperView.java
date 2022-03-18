package com.larksuite.component.openplatform.core.component.render.impl.blockit;

import android.content.Context;
import com.bytedance.ies.xelement.banner.Banner;
import com.bytedance.ies.xelement.banner.LynxSwiperView;
import com.tt.miniapphost.host.HostDependManager;

public class BlockSwiperView extends LynxSwiperView {
    @Override // com.bytedance.ies.xelement.banner.LynxSwiperView
    public boolean R_() {
        return !m89153d();
    }

    /* renamed from: d */
    private boolean m89153d() {
        return HostDependManager.getInst().getFeatureGating("openplatform.blockit.disable_swiper_auto_play_fix", false);
    }

    public BlockSwiperView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.xelement.banner.LynxSwiperView
    /* renamed from: a */
    public Banner mo33942b(Context context) {
        Banner a = super.mo33942b(context);
        a.setTwoItemCircularSwipe(true);
        return a;
    }
}
