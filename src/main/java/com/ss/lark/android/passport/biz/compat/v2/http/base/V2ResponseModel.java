package com.ss.lark.android.passport.biz.compat.v2.http.base;

import com.ss.android.lark.passport.infra.model.IResponseModel;

public class V2ResponseModel<T> implements IResponseModel {
    public int code;
    public Object data;
    public String message;

    @Override // com.ss.android.lark.passport.infra.model.IResponseModel
    public int getCode() {
        return this.code;
    }

    @Override // com.ss.android.lark.passport.infra.model.IResponseModel
    public String getMessage() {
        return this.message;
    }

    @Override // com.ss.android.lark.passport.infra.model.IResponseModel
    public boolean isSuccess() {
        if (this.data != null || this.code == 0) {
            return true;
        }
        return false;
    }
}
