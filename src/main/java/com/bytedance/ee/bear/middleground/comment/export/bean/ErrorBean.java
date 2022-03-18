package com.bytedance.ee.bear.middleground.comment.export.bean;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import com.bytedance.ee.bear.p513o.AbstractC10365a;
import org.koin.java.KoinJavaComponent;

public class ErrorBean implements BaseJSModel {
    public int code;
    public String msg;

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public boolean isSuccess() {
        if (this.code == 0) {
            return true;
        }
        return false;
    }

    public boolean isNetFail() {
        if (this.code == -8) {
            return true;
        }
        return false;
    }

    public boolean isReviewFail() {
        return ((AbstractC10365a) KoinJavaComponent.m268610a(AbstractC10365a.class)).mo39496a(this.code);
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ErrorBean) || ((ErrorBean) obj).code != this.code) {
            return false;
        }
        return true;
    }
}
