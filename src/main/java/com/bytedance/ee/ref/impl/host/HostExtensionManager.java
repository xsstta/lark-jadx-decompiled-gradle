package com.bytedance.ee.ref.impl.host;

import com.bytedance.ee.larkbrand.p649d.C12989b;

public class HostExtensionManager {
    private HostInterface hostInterface;

    public HostInterface getHostInterface() {
        return this.hostInterface;
    }

    public static HostExtensionManager getInstance() {
        return C12989b.m53447a().mo48914d();
    }

    public void setHostInterface(HostInterface hostInterface2) {
        this.hostInterface = hostInterface2;
    }
}
