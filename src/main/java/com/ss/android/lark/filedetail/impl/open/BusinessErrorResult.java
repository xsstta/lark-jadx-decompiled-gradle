package com.ss.android.lark.filedetail.impl.open;

import com.larksuite.framework.callback.Entity.ErrorResult;

public class BusinessErrorResult extends ErrorResult {
    private int mShowMessage;

    public int getShowMessage() {
        return this.mShowMessage;
    }

    public void setShowMessage(int i) {
        this.mShowMessage = i;
    }

    public BusinessErrorResult(int i, int i2) {
        super(i);
        this.mShowMessage = i2;
    }
}
