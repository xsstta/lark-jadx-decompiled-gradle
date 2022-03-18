package com.ss.android.lark.http.model;

import android.text.TextUtils;
import java.io.Serializable;

public abstract class BaseResponseModel implements Serializable {
    private int code;
    private String error;
    private String message;

    public int getErrorCode() {
        return this.code;
    }

    public boolean isSuccess() {
        if (this.code == 0) {
            return true;
        }
        return false;
    }

    public String getErrorMessage() {
        if (TextUtils.isEmpty(this.message)) {
            return this.error;
        }
        return this.message;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
