package com.bytedance.ugc.security.detection.privacy_detection_dynamic;

import com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvApp;
import com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvProxy;
import com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvSetting;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007¨\u0006\f"}, d2 = {"Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/PrivacyDetectionDynamicInitializer;", "", "()V", "init", "", "envProxy", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/CommonEnvProxy;", "envApp", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/CommonEnvApp;", "envSetting", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/CommonEnvSetting;", "onApmConfigReady", "privacy-detection-dynamic_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PrivacyDetectionDynamicInitializer {
    public static final PrivacyDetectionDynamicInitializer INSTANCE = new PrivacyDetectionDynamicInitializer();

    @JvmStatic
    public static final void init(CommonEnvProxy commonEnvProxy, CommonEnvApp commonEnvApp, CommonEnvSetting commonEnvSetting) {
        Intrinsics.checkParameterIsNotNull(commonEnvProxy, "envProxy");
        Intrinsics.checkParameterIsNotNull(commonEnvApp, "envApp");
    }

    @JvmStatic
    public static final void onApmConfigReady() {
    }

    private PrivacyDetectionDynamicInitializer() {
    }

    public static /* synthetic */ void init$default(CommonEnvProxy commonEnvProxy, CommonEnvApp commonEnvApp, CommonEnvSetting commonEnvSetting, int i, Object obj) {
        if ((i & 4) != 0) {
            commonEnvSetting = null;
        }
        init(commonEnvProxy, commonEnvApp, commonEnvSetting);
    }
}
