package com.bytedance.ee.larkbrand;

import com.bytedance.ee.larkbrand.p649d.C12989b;
import com.bytedance.ee.larkbrand.service.ExtensionWrapper;

public class LarkExtensionManager {
    private ExtensionWrapper brandWrapper;

    public ExtensionWrapper getExtension() {
        return this.brandWrapper;
    }

    public static LarkExtensionManager getInstance() {
        return C12989b.m53447a().mo48912b();
    }

    public void setBrandWrapper(ExtensionWrapper extensionWrapper) {
        this.brandWrapper = extensionWrapper;
    }
}
