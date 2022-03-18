package com.bytedance.ee.webapp.api;

import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;

/* renamed from: com.bytedance.ee.webapp.api.a */
public interface AbstractC13761a {
    void onError(ErrorResult errorResult);

    void onSuccess(SendHttpResponse sendHttpResponse);
}
