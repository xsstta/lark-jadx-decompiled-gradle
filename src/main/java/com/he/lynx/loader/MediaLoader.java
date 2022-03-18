package com.he.lynx.loader;

import android.net.Uri;

public interface MediaLoader {

    public enum FacingMode {
        USER,
        ENVIRONMENT
    }

    public static class RequestParams {
        public boolean audio;
        public boolean effect;
        public FacingMode facingMode = FacingMode.USER;
        public boolean video;
    }

    public interface Responder {
        void onResponse(boolean z);
    }

    Uri loadMedia(String str);

    void onRequest(RequestParams requestParams, Responder responder);
}
