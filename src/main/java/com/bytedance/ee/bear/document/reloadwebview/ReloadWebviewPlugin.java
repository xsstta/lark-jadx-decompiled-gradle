package com.bytedance.ee.bear.document.reloadwebview;

import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;

public class ReloadWebviewPlugin extends DocumentPlugin {
    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        C6083a.f16962c++;
        C6083a.f16961b++;
    }

    public void onDetachFromHost(C6095s sVar) {
        super.onDetachFromHost((C4943e) sVar);
        C6083a.f16962c--;
        C6083a.m24591a().mo24582b();
    }
}
