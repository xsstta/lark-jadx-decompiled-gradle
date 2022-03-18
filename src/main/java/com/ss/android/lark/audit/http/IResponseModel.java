package com.ss.android.lark.audit.http;

import java.io.Serializable;

public interface IResponseModel extends Serializable {
    int getCode();

    String getMessage();

    boolean isSuccess();
}
