package com.bytedance.retrofit2.intercept;

import com.bytedance.retrofit2.C20639k;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;

public interface Interceptor {

    public interface Chain {
        Call call();

        C20639k metrics();

        SsResponse proceed(Request request) throws Exception;

        Request request();
    }

    SsResponse intercept(Chain chain) throws Exception;
}
