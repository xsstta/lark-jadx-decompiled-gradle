package com.ss.android.lark.widget.richtext2.entity;

public abstract class ChildViewParseResult extends AbstractParseResult {
    private static final long serialVersionUID = -2057654951099359059L;
    private boolean mIsInQuote;
    private int mLeftMargin;

    public int getLeftMargin() {
        return this.mLeftMargin;
    }

    public boolean isInQuote() {
        return this.mIsInQuote;
    }

    public void setIsInQuote(boolean z) {
        this.mIsInQuote = z;
    }

    public void setLeftMargin(int i) {
        this.mLeftMargin = i;
    }
}
