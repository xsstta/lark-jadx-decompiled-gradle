package com.ss.android.lark.passport.infra.model;

import java.io.Serializable;

public interface IResponseModel extends Serializable {
    int getCode();

    String getMessage();

    boolean isSuccess();
}
