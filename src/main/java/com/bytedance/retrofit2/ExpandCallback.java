package com.bytedance.retrofit2;

public interface ExpandCallback<T> extends Callback<T> {
    void onAsyncPreRequest(RequestBuilder requestBuilder);

    void onAsyncResponse(Call<T> call, SsResponse<T> ssResponse);
}
