package com.ss.android.lark.flutter.container.api;

import android.app.Application;
import java.util.Map;

public interface InitParams {
    Application getAppContext();

    Map<String, String> getAppInfo();

    INativeRouteHandler getNativeRouteHandler();
}
