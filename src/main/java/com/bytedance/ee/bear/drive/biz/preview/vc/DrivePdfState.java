package com.bytedance.ee.bear.drive.biz.preview.vc;

import com.bytedance.ee.util.io.NonProguard;

public class DrivePdfState implements NonProguard {
    private int activePageNumber;
    private boolean isPresentationMode;
    private int pageNumber;
    private float pageOffsetLeft;
    private float pageOffsetTop;
    private float scale = 1.0f;
    private V2Offset v2;

    public static class V2Offset implements NonProguard {
        public int pageNumber;
        public float pageOffsetTop;
    }

    public int getActivePageNumber() {
        return this.activePageNumber;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public float getPageOffsetLeft() {
        return this.pageOffsetLeft;
    }

    public float getPageOffsetTop() {
        return this.pageOffsetTop;
    }

    public float getScale() {
        return this.scale;
    }

    public V2Offset getV2() {
        return this.v2;
    }

    public boolean isIsPresentationMode() {
        return this.isPresentationMode;
    }

    public void setActivePageNumber(int i) {
        this.activePageNumber = i;
    }

    public void setIsPresentationMode(boolean z) {
        this.isPresentationMode = z;
    }

    public void setPageNumber(int i) {
        this.pageNumber = i;
    }

    public void setPageOffsetLeft(float f) {
        this.pageOffsetLeft = f;
    }

    public void setPageOffsetTop(float f) {
        this.pageOffsetTop = f;
    }

    public void setScale(float f) {
        this.scale = f;
    }

    public void setV2(V2Offset v2Offset) {
        this.v2 = v2Offset;
    }
}
