package com.bytedance.retrofit2;

import com.bytedance.retrofit2.client.Request;

public interface Call<T> extends Cloneable {
    void cancel();

    @Override // java.lang.Object
    Call<T> clone();

    void enqueue(Callback<T> callback);

    SsResponse<T> execute() throws Exception;

    boolean isCanceled();

    boolean isExecuted();

    Request request();
}
