package com.bytedance.ee.bear.document.comment.imageviewer;

import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.List;
import java.util.Objects;

public class OpenCommentImageModel implements NonProguard {
    private int active;
    private List<CommentImageBean> imageList;

    public static class CommentImageBean implements NonProguard {
        private String originalSrc;
        private String src;
        private String token;

        public String getOriginalSrc() {
            return this.originalSrc;
        }

        public String getSrc() {
            return this.src;
        }

        public String getToken() {
            return this.token;
        }

        public int hashCode() {
            return Objects.hash(this.token, this.src, this.originalSrc);
        }

        public String toString() {
            return "CommentImage{token='" + C13598b.m55197d(this.token) + '\'' + ", src='" + C13598b.m55197d(this.src) + '\'' + ", originalSrc='" + C13598b.m55197d(this.originalSrc) + '\'' + '}';
        }

        public void setOriginalSrc(String str) {
            this.originalSrc = str;
        }

        public void setSrc(String str) {
            this.src = str;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CommentImageBean commentImageBean = (CommentImageBean) obj;
            if (!Objects.equals(this.token, commentImageBean.token) || !Objects.equals(this.src, commentImageBean.src) || !Objects.equals(this.originalSrc, commentImageBean.originalSrc)) {
                return false;
            }
            return true;
        }
    }

    public int getActive() {
        return this.active;
    }

    public List<CommentImageBean> getImageList() {
        return this.imageList;
    }

    public int hashCode() {
        return Objects.hash(this.imageList, Integer.valueOf(this.active));
    }

    public String toString() {
        return "OpenCommentImageModel{imageList=" + this.imageList + ", active=" + this.active + '}';
    }

    public void setActive(int i) {
        this.active = i;
    }

    public void setImageList(List<CommentImageBean> list) {
        this.imageList = list;
    }

    public static boolean isActive(OpenCommentImageModel openCommentImageModel) {
        if (openCommentImageModel == null || openCommentImageModel.getImageList() == null) {
            return false;
        }
        int size = openCommentImageModel.getImageList().size();
        int i = openCommentImageModel.active;
        if (i < 0 || i >= size) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenCommentImageModel openCommentImageModel = (OpenCommentImageModel) obj;
        if (this.active != openCommentImageModel.active || !Objects.equals(this.imageList, openCommentImageModel.imageList)) {
            return false;
        }
        return true;
    }
}
