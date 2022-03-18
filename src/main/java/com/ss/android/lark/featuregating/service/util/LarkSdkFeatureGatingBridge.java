package com.ss.android.lark.featuregating.service.util;

import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;

public class LarkSdkFeatureGatingBridge {
    public static boolean larkFeatureGatingFrom(String str) {
        if ("lark.feed.client_protocol_opt".equals(str)) {
            Log.m165389i("LarkSdkFeatureGatingBridge", str + " -> " + FeedFgSyncUtil.m146721a());
            return FeedFgSyncUtil.m146721a();
        } else if (!"lark.feed.add_mute_group_android".equals(str)) {
            return C37239a.m146648b().mo136951a(str);
        } else {
            Log.m165389i("LarkSdkFeatureGatingBridge", str + " -> " + FeedFgSyncUtil.m146722b());
            return FeedFgSyncUtil.m146722b();
        }
    }
}
