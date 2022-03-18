package com.ss.android.lark.app.task;

import com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.ALogUploadTimelySettingModel;
import com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.BackgroundFreezeTimeModel;
import com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CallAPICountsLogModel;
import com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvSetting;
import com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.MultiCallAPICountsLogModel;
import com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.UploadTimelyInfoModel;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.larkconfig.larksetting.handler.privacydetection.Anchor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/lark/app/task/InitPrivacyTask$execute$3", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/CommonEnvSetting;", "canAccessSensitiveApi", "", "actionId", "", "canMonitor", "getALogUploadTimelySettingModel", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/ALogUploadTimelySettingModel;", "getBackgroundFreezeTimeModel", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/BackgroundFreezeTimeModel;", "getCallAPICountsLogModel", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/CallAPICountsLogModel;", "getMultiCallAPICountsLogModel", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/MultiCallAPICountsLogModel;", "getUploadTimelyInfoModels", "", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/UploadTimelyInfoModel;", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InitPrivacyTask$execute$3 extends CommonEnvSetting {

    /* renamed from: a */
    final /* synthetic */ List f72628a;

    @Override // com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvSetting
    public boolean canAccessSensitiveApi(int i) {
        return true;
    }

    @Override // com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvSetting
    public boolean canMonitor() {
        return true;
    }

    @Override // com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvSetting
    public ALogUploadTimelySettingModel getALogUploadTimelySettingModel() {
        return new ALogUploadTimelySettingModel(7200000, true);
    }

    @Override // com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvSetting
    public BackgroundFreezeTimeModel getBackgroundFreezeTimeModel() {
        return new BackgroundFreezeTimeModel(1000, 3000);
    }

    @Override // com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvSetting
    public CallAPICountsLogModel getCallAPICountsLogModel() {
        return new CallAPICountsLogModel(LocationRequest.PRIORITY_HD_ACCURACY, 3600000, 10, 60000);
    }

    @Override // com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvSetting
    public MultiCallAPICountsLogModel getMultiCallAPICountsLogModel() {
        return new MultiCallAPICountsLogModel(LocationRequest.PRIORITY_HD_ACCURACY, 3600000, 10, 60000);
    }

    @Override // com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvSetting
    public List<UploadTimelyInfoModel> getUploadTimelyInfoModels() {
        List<Anchor> list = this.f72628a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Anchor anchor : list) {
            arrayList.add(new UploadTimelyInfoModel(anchor.getAnchorPage(), anchor.getAnchorLifecycle(), anchor.getAnchorMonitorEvents(), anchor.getAnchorTimeDelay(), anchor.getAdvancedAnchorTimeDelay(), anchor.getMidAnchorTimeDelay(), anchor.getMaxAnchorTimeDelay(), anchor.getDetectionPage(), anchor.getTimeLineEventLimit(), anchor.getRemoveTaskLifecycle()));
        }
        return CollectionsKt.toMutableList((Collection) arrayList);
    }

    InitPrivacyTask$execute$3(List list) {
        this.f72628a = list;
    }
}
