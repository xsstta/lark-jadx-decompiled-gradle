package com.bytedance.ee.bear.drive.biz.comment.area;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.drive.biz.comment.Quad;
import java.io.Serializable;

public class AreaCoordinate implements Serializable {
    private Position position;
    private int type;

    public static class Position implements Serializable {
        private float bottom;
        private float left;
        private int page;
        @JSONField(name = "quads")
        private Quad[] quads;
        private float right;
        private String text;
        private float top;

        public float getBottom() {
            return this.bottom;
        }

        public float getLeft() {
            return this.left;
        }

        public int getPage() {
            return this.page;
        }

        public Quad[] getQuads() {
            return this.quads;
        }

        public float getRight() {
            return this.right;
        }

        public String getText() {
            return this.text;
        }

        public float getTop() {
            return this.top;
        }

        public String toString() {
            return "Position{page=" + this.page + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
        }

        public void setBottom(float f) {
            this.bottom = f;
        }

        public void setLeft(float f) {
            this.left = f;
        }

        public void setPage(int i) {
            this.page = i;
        }

        public void setQuads(Quad[] quadArr) {
            this.quads = quadArr;
        }

        public void setRight(float f) {
            this.right = f;
        }

        public void setText(String str) {
            this.text = str;
        }

        public void setTop(float f) {
            this.top = f;
        }
    }

    public Position getPosition() {
        return this.position;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "AreaCoordinate{type=" + this.type + ", position=" + this.position + '}';
    }

    public void setPosition(Position position2) {
        this.position = position2;
    }

    public void setType(int i) {
        this.type = i;
    }
}
