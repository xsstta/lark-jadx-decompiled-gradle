package com.bytedance.ee.plugin.common.pdftron.wrapper;

public class Page {
    private double mHeight;
    private Object mSrcPage;
    private double mWidth;
    private int pageRotation;

    public Page() {
    }

    public double getHeight() {
        return this.mHeight;
    }

    public int getPageRotation() {
        return this.pageRotation;
    }

    public Object getSrcPage() {
        return this.mSrcPage;
    }

    public double getWidth() {
        return this.mWidth;
    }

    public void setHeight(double d) {
        this.mHeight = d;
    }

    public void setPageRotation(int i) {
        this.pageRotation = i;
    }

    public void setSrcPage(Object obj) {
        this.mSrcPage = obj;
    }

    public void setWidth(double d) {
        this.mWidth = d;
    }

    public Page(Object obj) {
        this.mSrcPage = obj;
    }

    public Page(Object obj, double d, double d2, int i) {
        this.mSrcPage = obj;
        this.mWidth = d;
        this.mHeight = d2;
        this.pageRotation = i;
    }
}
