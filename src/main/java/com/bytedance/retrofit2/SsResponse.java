package com.bytedance.retrofit2;

import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Response;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import java.util.Objects;

public final class SsResponse<T> {
    private final T body;
    private final TypedInput errorBody;
    private final Response rawResponse;
    private C20639k retrofitMetrics;

    public T body() {
        return this.body;
    }

    public TypedInput errorBody() {
        return this.errorBody;
    }

    public C20639k getRetrofitMetrics() {
        return this.retrofitMetrics;
    }

    public Response raw() {
        return this.rawResponse;
    }

    public int code() {
        return this.rawResponse.getStatus();
    }

    public List<Header> headers() {
        return this.rawResponse.getHeaders();
    }

    public boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    public void setRetrofitMetrics(C20639k kVar) {
        this.retrofitMetrics = kVar;
    }

    public static <T> SsResponse<T> error(TypedInput typedInput, Response response) {
        Objects.requireNonNull(typedInput, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (!response.isSuccessful()) {
            return new SsResponse<>(response, null, typedInput);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> SsResponse<T> success(T t, Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new SsResponse<>(response, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    private SsResponse(Response response, T t, TypedInput typedInput) {
        this.rawResponse = response;
        this.body = t;
        this.errorBody = typedInput;
    }
}
