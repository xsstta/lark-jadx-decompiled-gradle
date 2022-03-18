package com.ss.android.lark.app.task;

import android.app.Application;
import com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.AppInfoModel;
import com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvApp;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/app/task/InitPrivacyTask$execute$2", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/CommonEnvApp;", "getAppInfoModel", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/AppInfoModel;", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InitPrivacyTask$execute$2 extends CommonEnvApp {
    InitPrivacyTask$execute$2() {
    }

    @Override // com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvApp
    public AppInfoModel getAppInfoModel() {
        Application application = LarkContext.getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
        String buildPackageChannel = PackageChannelManager.getBuildPackageChannel(LarkContext.getApplication());
        Intrinsics.checkExpressionValueIsNotNull(buildPackageChannel, "PackageChannelManager.ge…Context.getApplication())");
        return new AppInfoModel(application, buildPackageChannel);
    }
}
