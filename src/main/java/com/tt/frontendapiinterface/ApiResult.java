package com.tt.frontendapiinterface;

import android.text.TextUtils;
import java.util.HashMap;

public class ApiResult {
    public HashMap<String, Object> extra;
    public final String message;
    public final boolean success;

    public static ApiResult success() {
        return new ApiResult(true, "");
    }

    public static ApiResult fail(String str) {
        return new ApiResult(false, str);
    }

    public ApiResult(boolean z, String str) {
        this.success = z;
        this.message = TextUtils.isEmpty(str) ? "" : str;
    }
}
