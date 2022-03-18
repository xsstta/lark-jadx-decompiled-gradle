package com.diggo.sdk;

import org.json.JSONObject;

public interface IDigGoInit {
    IDigGo addFlipperPlugin(String str);

    IDigGo addFlipperPlugin(String str, JSONObject jSONObject);

    IDigGo addLensHookPlugin(String str, String[] strArr);

    IDigGo disableAutoRun(boolean z);

    IDigGo enableFlipper(boolean z);

    IDigGo enableLens(boolean z);

    void init();

    void init(boolean z);

    boolean isInitialized();

    IDigGo setAutoRunDelayTime(int i);

    IDigGo setDescriptor(IObjectDescriptor iObjectDescriptor);

    IDigGo setLaunchEndViewId(int i);

    IDigGo setLaunchEndViewIds(int[] iArr);

    IDigGo setViewDebugger(IViewDebug iViewDebug);
}
