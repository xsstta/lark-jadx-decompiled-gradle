package com.bytedance.framwork.core.sdklib.p750a;

import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.framwork.core.sdklib.a.b */
public interface AbstractC14127b {
    boolean getRemoveSwitch();

    int reportCount();

    int reportFailRepeatBaseTime();

    int reportFailRepeatCount();

    int reportInterval();

    JSONObject reportJsonHeaderInfo();

    List<String> reportUrl(String str);
}
