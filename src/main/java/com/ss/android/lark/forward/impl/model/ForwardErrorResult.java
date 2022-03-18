package com.ss.android.lark.forward.impl.model;

import com.larksuite.framework.callback.Entity.ErrorResult;

public class ForwardErrorResult extends ErrorResult {
    private boolean mIsClose;
    private boolean mIsDialog;
    private String mMessage;
    private String mTitle;

    public String getMessage() {
        return this.mMessage;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public boolean isIsDialog() {
        return this.mIsDialog;
    }

    public boolean isWillClose() {
        return this.mIsClose;
    }

    public ForwardErrorResult(String str, boolean z) {
        super(str);
        init(null, str, z);
    }

    private void init(String str, String str2, boolean z) {
        this.mTitle = str;
        this.mMessage = str2;
        this.mIsClose = z;
    }

    public ForwardErrorResult(String str, String str2, boolean z) {
        super(str2);
        init(str, str2, z);
        this.mIsDialog = true;
    }
}
