package com.bytedance.ee.falcon.inspector.network;

import com.bytedance.ee.falcon.inspector.protocol.module.Page;

public enum PrettyPrinterDisplayType {
    JSON(Page.ResourceType.XHR),
    HTML(Page.ResourceType.DOCUMENT),
    TEXT(Page.ResourceType.DOCUMENT);
    
    private final Page.ResourceType mResourceType;

    public Page.ResourceType getResourceType() {
        return this.mResourceType;
    }

    private PrettyPrinterDisplayType(Page.ResourceType resourceType) {
        this.mResourceType = resourceType;
    }
}
