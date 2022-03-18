package com.ss.android.lark.widget.ptr;

import android.content.Context;
import android.util.AttributeSet;

public class LKUIPtrClassicFrameLayout extends LKUIPtrFrameLayout {
    private LKUIPtrDefaultFooter mPtrClassicFooter;
    private LKUIPtrDefaultHeader mPtrClassicHeader;

    public LKUIPtrDefaultHeader getHeader() {
        return this.mPtrClassicHeader;
    }

    private void initViews() {
        LKUIPtrDefaultHeader lKUIPtrDefaultHeader = new LKUIPtrDefaultHeader(getContext());
        this.mPtrClassicHeader = lKUIPtrDefaultHeader;
        setHeaderView(lKUIPtrDefaultHeader);
        addPtrUIHandler(this.mPtrClassicHeader);
        LKUIPtrDefaultFooter lKUIPtrDefaultFooter = new LKUIPtrDefaultFooter(getContext());
        this.mPtrClassicFooter = lKUIPtrDefaultFooter;
        setFooterView(lKUIPtrDefaultFooter);
        addPtrUIHandler(this.mPtrClassicFooter);
    }

    public LKUIPtrClassicFrameLayout(Context context) {
        super(context);
        initViews();
    }

    public void setLastUpdateTimeFooterKey(String str) {
        LKUIPtrDefaultFooter lKUIPtrDefaultFooter = this.mPtrClassicFooter;
        if (lKUIPtrDefaultFooter != null) {
            lKUIPtrDefaultFooter.setLastUpdateTimeKey(str);
        }
    }

    public void setLastUpdateTimeFooterRelateObject(Object obj) {
        LKUIPtrDefaultFooter lKUIPtrDefaultFooter = this.mPtrClassicFooter;
        if (lKUIPtrDefaultFooter != null) {
            lKUIPtrDefaultFooter.setLastUpdateTimeRelateObject(obj);
        }
    }

    public void setLastUpdateTimeHeaderKey(String str) {
        LKUIPtrDefaultHeader lKUIPtrDefaultHeader = this.mPtrClassicHeader;
        if (lKUIPtrDefaultHeader != null) {
            lKUIPtrDefaultHeader.setLastUpdateTimeKey(str);
        }
    }

    public void setLastUpdateTimeHeaderRelateObject(Object obj) {
        LKUIPtrDefaultHeader lKUIPtrDefaultHeader = this.mPtrClassicHeader;
        if (lKUIPtrDefaultHeader != null) {
            lKUIPtrDefaultHeader.setLastUpdateTimeRelateObject(obj);
        }
    }

    public void setLastUpdateTimeKey(String str) {
        setLastUpdateTimeHeaderKey(str);
        setLastUpdateTimeFooterKey(str);
    }

    public void setLastUpdateTimeRelateObject(Object obj) {
        setLastUpdateTimeHeaderRelateObject(obj);
        setLastUpdateTimeFooterRelateObject(obj);
    }

    public LKUIPtrClassicFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViews();
    }

    public LKUIPtrClassicFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initViews();
    }
}
