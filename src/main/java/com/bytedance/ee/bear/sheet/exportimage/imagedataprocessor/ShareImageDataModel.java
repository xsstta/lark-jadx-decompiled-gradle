package com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor;

import com.bytedance.ee.util.io.NonProguard;

public class ShareImageDataModel implements NonProguard {
    private int belongToCol;
    private int belongToRow;
    private int height;
    private String img;
    private boolean isLast;
    private boolean isLastInRow;
    private int width;

    public int getBelongToCol() {
        return this.belongToCol;
    }

    public int getBelongToRow() {
        return this.belongToRow;
    }

    public int getHeight() {
        return this.height;
    }

    public String getImg() {
        return this.img;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isLast() {
        return this.isLast;
    }

    public boolean isLastInRow() {
        return this.isLastInRow;
    }

    public String toString() {
        return "ShareImageDataModel{, isLast=" + this.isLast + ", width=" + this.width + ", height=" + this.height + ", belongToRow=" + this.belongToRow + ", belongToCol=" + this.belongToCol + ", isLastInRow=" + this.isLastInRow + '}';
    }

    public void setBelongToCol(int i) {
        this.belongToCol = i;
    }

    public void setBelongToRow(int i) {
        this.belongToRow = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setLast(boolean z) {
        this.isLast = z;
    }

    public void setLastInRow(boolean z) {
        this.isLastInRow = z;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
