package com.bytedance.ugc.security.detection.privacy_detection_dynamic.config;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/CommonEnvSetting;", "", "()V", "canAccessSensitiveApi", "", "actionId", "", "canMonitor", "getALogSettingsModel", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/ALogSettingsModel;", "getALogUploadTimelySettingModel", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/ALogUploadTimelySettingModel;", "getBackgroundFreezeTimeModel", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/BackgroundFreezeTimeModel;", "getCallAPICountsLogModel", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/CallAPICountsLogModel;", "getMultiCallAPICountsLogModel", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/MultiCallAPICountsLogModel;", "getSkyEyeConfigModel", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/SkyEyeConfigModel;", "getUploadTimelyInfoModels", "", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/UploadTimelyInfoModel;", "privacy-detection-dynamic_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class CommonEnvSetting {
    public boolean canAccessSensitiveApi(int i) {
        return true;
    }

    public boolean canMonitor() {
        return false;
    }

    public List<UploadTimelyInfoModel> getUploadTimelyInfoModels() {
        return new ArrayList();
    }

    public ALogUploadTimelySettingModel getALogUploadTimelySettingModel() {
        return new ALogUploadTimelySettingModel(0, false, 3, null);
    }

    public BackgroundFreezeTimeModel getBackgroundFreezeTimeModel() {
        return new BackgroundFreezeTimeModel(0, 0, 3, null);
    }

    public CallAPICountsLogModel getCallAPICountsLogModel() {
        return new CallAPICountsLogModel(0, 0, 0, 0, 15, null);
    }

    public MultiCallAPICountsLogModel getMultiCallAPICountsLogModel() {
        return new MultiCallAPICountsLogModel(0, 0, 0, 0, 15, null);
    }

    public SkyEyeConfigModel getSkyEyeConfigModel() {
        return new SkyEyeConfigModel(0, 0, 0, null, null, 31, null);
    }

    public ALogSettingsModel getALogSettingsModel() {
        return new ALogSettingsModel(0, 0, 0, 0, false, 0, 63, null);
    }
}
