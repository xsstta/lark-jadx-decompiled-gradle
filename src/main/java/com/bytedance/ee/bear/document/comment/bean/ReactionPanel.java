package com.bytedance.ee.bear.document.comment.bean;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import java.util.List;

public class ReactionPanel implements BaseJSModel {
    private Position position;
    private List<OperationItem> toolBar;

    public static class OperationItem implements BaseJSModel {
        private String id;
        private String text;

        public String getId() {
            return this.id;
        }

        public String getText() {
            return this.text;
        }

        public String toString() {
            return "OperationItem{id='" + this.id + '\'' + ", text='" + this.text + '\'' + '}';
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setText(String str) {
            this.text = str;
        }
    }

    public static class Position implements BaseJSModel {

        /* renamed from: x */
        private int f16093x;

        /* renamed from: y */
        private int f16094y;

        public int getX() {
            return this.f16093x;
        }

        public int getY() {
            return this.f16094y;
        }

        public String toString() {
            return "Position{x=" + this.f16093x + ", y=" + this.f16094y + '}';
        }

        public void setX(int i) {
            this.f16093x = i;
        }

        public void setY(int i) {
            this.f16094y = i;
        }
    }

    public Position getPosition() {
        return this.position;
    }

    public List<OperationItem> getToolBar() {
        return this.toolBar;
    }

    public String toString() {
        return "OperationPanel{position=" + this.position + ", toolBar=" + this.toolBar + '}';
    }

    public void setPosition(Position position2) {
        this.position = position2;
    }

    public void setToolBar(List<OperationItem> list) {
        this.toolBar = list;
    }
}
