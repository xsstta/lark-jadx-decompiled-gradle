package com.bytedance.ee.ref.card.support.lynx;

import android.content.Context;
import com.bytedance.ies.xelement.banner.Banner;
import com.lynx.tasm.behavior.ui.view.UISimpleView;

public class LarkSwiper extends UISimpleView<Banner> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Banner mo33942b(Context context) {
        Banner banner = (Banner) super.mo33942b(context);
        banner.setTwoItemCircularSwipe(true);
        return banner;
    }
}
