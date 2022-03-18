package com.bytedance.retrofit2.rxjava2.adapter;

import com.bytedance.retrofit2.SsResponse;
import java.util.Objects;
import javax.annotation.Nullable;

public final class HttpException extends RuntimeException {
    private final int code;
    private final transient SsResponse<?> response;

    public int code() {
        return this.code;
    }

    public SsResponse<?> response() {
        return this.response;
    }

    public HttpException(SsResponse<?> ssResponse) {
        super(getMessage(ssResponse));
        this.code = ssResponse.code();
        this.response = ssResponse;
    }

    private static String getMessage(SsResponse<?> ssResponse) {
        checkNotNull(ssResponse, "response == null");
        return "HTTP " + ssResponse.code();
    }

    private static <T> T checkNotNull(@Nullable T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
