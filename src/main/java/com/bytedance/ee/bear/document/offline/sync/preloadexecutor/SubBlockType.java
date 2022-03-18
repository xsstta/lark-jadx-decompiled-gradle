package com.bytedance.ee.bear.document.offline.sync.preloadexecutor;

public enum SubBlockType {
    COMMENTS_DATA("COMMENTS_DATA"),
    POLL_DATA("POLL_DATA"),
    IMAGE_DATA("IMAGE_DATA"),
    INNER_SHEET("INNER_SHEET");
    
    private String type;

    public String getSubBlockType() {
        return this.type;
    }

    private SubBlockType(String str) {
        this.type = str;
    }
}
