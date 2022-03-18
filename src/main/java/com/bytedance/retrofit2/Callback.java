package com.bytedance.retrofit2;

public interface Callback<T> {
    void onFailure(Call<T> call, Throwable th);

    void onResponse(Call<T> call, SsResponse<T> ssResponse);
}
