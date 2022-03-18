package com.bytedance.ee.bear.document;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import org.koin.java.KoinJavaComponent;

public class WatermarkPlugin extends DocumentPlugin {
    public /* synthetic */ void lambda$onAttachToHost$0$WatermarkPlugin(String str) {
        String documentTypeValueString = getDocViewModel().getDocumentTypeValueString();
        if (str == null) {
            str = "";
        }
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40650a(str, documentTypeValueString, getActivity());
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        getDocViewModel().liveDocObjToken().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.$$Lambda$WatermarkPlugin$5OmhW_0s4GKs_4wC3SYv_vtTaU */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                WatermarkPlugin.this.lambda$onAttachToHost$0$WatermarkPlugin((String) obj);
            }
        });
    }
}
