package com.he.v8_inspect.network;

import com.he.v8_inspect.protocol.module.Page;

public class ResourceTypeHelper {
    private final MimeMatcher<Page.ResourceType> mMimeMatcher;

    public ResourceTypeHelper() {
        MimeMatcher<Page.ResourceType> mimeMatcher = new MimeMatcher<>();
        this.mMimeMatcher = mimeMatcher;
        mimeMatcher.addRule("text/css", Page.ResourceType.STYLESHEET);
        mimeMatcher.addRule("image/*", Page.ResourceType.IMAGE);
        mimeMatcher.addRule("application/x-javascript", Page.ResourceType.SCRIPT);
        mimeMatcher.addRule("text/javascript", Page.ResourceType.XHR);
        mimeMatcher.addRule("application/json", Page.ResourceType.XHR);
        mimeMatcher.addRule("text/*", Page.ResourceType.DOCUMENT);
        mimeMatcher.addRule("*", Page.ResourceType.OTHER);
    }

    public Page.ResourceType determineResourceType(String str) {
        return this.mMimeMatcher.match(stripContentExtras(str));
    }

    public String stripContentExtras(String str) {
        int indexOf = str.indexOf(59);
        if (indexOf >= 0) {
            return str.substring(0, indexOf);
        }
        return str;
    }
}
