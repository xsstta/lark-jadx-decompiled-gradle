package com.tt.option.ext;

import org.json.JSONObject;

public interface WebEventCallback {
    JSONObject buildErrorMsg(String str);

    void invokeHandler(String str);
}
