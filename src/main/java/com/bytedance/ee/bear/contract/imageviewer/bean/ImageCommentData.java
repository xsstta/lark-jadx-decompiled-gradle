package com.bytedance.ee.bear.contract.imageviewer.bean;

import com.bytedance.ee.util.io.NonProguard;
import java.util.HashMap;
import java.util.Map;

public class ImageCommentData implements NonProguard {
    private Map<String, ImageCommentInfo> mImageCommentDataMap = new HashMap();

    public static class ImageCommentInfo implements NonProguard {
        private int commentCount;
        private boolean commentable;

        public int getCommentCount() {
            return this.commentCount;
        }

        public boolean isCommentable() {
            return this.commentable;
        }

        public void setCommentCount(int i) {
            this.commentCount = i;
        }

        public void setCommentable(boolean z) {
            this.commentable = z;
        }
    }

    public Map<String, ImageCommentInfo> getImageCommentDataMap() {
        return this.mImageCommentDataMap;
    }

    public void setCommentInfo(String str, boolean z, int i) {
        ImageCommentInfo imageCommentInfo = this.mImageCommentDataMap.get(str);
        if (imageCommentInfo == null) {
            imageCommentInfo = new ImageCommentInfo();
            this.mImageCommentDataMap.put(str, imageCommentInfo);
        }
        imageCommentInfo.setCommentable(z);
        imageCommentInfo.setCommentCount(i);
    }
}
