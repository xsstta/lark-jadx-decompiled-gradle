package com.bytedance.ee.bear.document.orientation;

import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;

public class PortraitOrientationPlugin extends CommonOrientationPlugin {
    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        getActivity().setRequestedOrientation(1);
    }
}
