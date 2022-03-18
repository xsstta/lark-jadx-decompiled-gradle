package com.bytedance.sdk.bridge.api;

import com.bytedance.news.common.service.manager.IService;
import com.bytedance.sdk.bridge.C20661b;
import com.bytedance.sdk.bridge.C20665d;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/bytedance/sdk/bridge/api/BridgeService;", "Lcom/bytedance/news/common/service/manager/IService;", "initBridgeConfig", "Lcom/bytedance/sdk/bridge/BridgeConfig;", "initBridgeLazyConfig", "Lcom/bytedance/sdk/bridge/BridgeLazyConfig;", "initBridgeSDK", "", "reportErrorInfo", "tag", "", "msg", "bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
public interface BridgeService extends IService {
    C20661b initBridgeConfig();

    C20665d initBridgeLazyConfig();

    void initBridgeSDK();

    void reportErrorInfo(String str, String str2);
}
