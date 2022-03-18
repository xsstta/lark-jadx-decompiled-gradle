package com.bytedance.ee.plugin.common.ttpdfreader;

import android.graphics.Bitmap;
import android.graphics.RectF;

public class PagePart {
    private int cacheOrder;
    private int page;
    private RectF pageRelativeBounds;
    private Bitmap renderedBitmap;
    private boolean thumbnail;

    public int getCacheOrder() {
        return this.cacheOrder;
    }

    public int getPage() {
        return this.page;
    }

    public RectF getPageRelativeBounds() {
        return this.pageRelativeBounds;
    }

    public Bitmap getRenderedBitmap() {
        return this.renderedBitmap;
    }

    public boolean isThumbnail() {
        return this.thumbnail;
    }

    public void setCacheOrder(int i) {
        this.cacheOrder = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PagePart)) {
            return false;
        }
        PagePart pagePart = (PagePart) obj;
        if (pagePart.getPage() == this.page && pagePart.getPageRelativeBounds().left == this.pageRelativeBounds.left && pagePart.getPageRelativeBounds().right == this.pageRelativeBounds.right && pagePart.getPageRelativeBounds().top == this.pageRelativeBounds.top && pagePart.getPageRelativeBounds().bottom == this.pageRelativeBounds.bottom) {
            return true;
        }
        return false;
    }

    public PagePart(int i, Bitmap bitmap, RectF rectF, boolean z, int i2) {
        this.page = i;
        this.renderedBitmap = bitmap;
        this.pageRelativeBounds = rectF;
        this.thumbnail = z;
        this.cacheOrder = i2;
    }
}
