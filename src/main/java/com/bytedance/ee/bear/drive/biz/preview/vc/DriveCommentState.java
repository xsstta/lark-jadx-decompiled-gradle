package com.bytedance.ee.bear.drive.biz.preview.vc;

import com.bytedance.ee.util.io.NonProguard;

public class DriveCommentState implements NonProguard {
    private String focusedCommentId;
    private boolean isCommentExpanded;

    public String getFocusedCommentId() {
        return this.focusedCommentId;
    }

    public boolean isIsCommentExpanded() {
        return this.isCommentExpanded;
    }

    public void setFocusedCommentId(String str) {
        this.focusedCommentId = str;
    }

    public void setIsCommentExpanded(boolean z) {
        this.isCommentExpanded = z;
    }
}
