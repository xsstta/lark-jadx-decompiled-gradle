package com.ss.android.lark.flutter.container.api;

import android.content.Context;
import java.util.Map;

public interface INativeRouteHandler {
    void handleNativeRoute(Context context, String str, Map<String, Object> map);
}
