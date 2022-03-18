package com.bytedance.ee.bear.drive.biz.versions;

import com.bytedance.ee.bear.drive.biz.versions.model.VersionDeleteModel;
import com.bytedance.ee.bear.drive.biz.versions.model.VersionPayLoadData;
import com.bytedance.ee.bear.drive.biz.versions.model.VersionUploadModel;

/* renamed from: com.bytedance.ee.bear.drive.biz.versions.c */
public class C6841c {
    /* renamed from: a */
    public static VersionPayLoadData m27013a(VersionDeleteModel versionDeleteModel) {
        VersionPayLoadData versionPayLoadData = new VersionPayLoadData();
        versionPayLoadData.setToken(versionDeleteModel.getData().getToken());
        versionPayLoadData.setVersion(versionDeleteModel.getData().getVersion());
        versionPayLoadData.setSource(versionDeleteModel.getData().getSource());
        versionPayLoadData.setEditUserId(versionDeleteModel.getData().getEdit_user_id());
        versionPayLoadData.setOperation(102);
        return versionPayLoadData;
    }

    /* renamed from: a */
    public static VersionPayLoadData m27014a(VersionUploadModel versionUploadModel) {
        VersionPayLoadData versionPayLoadData = new VersionPayLoadData();
        versionPayLoadData.setToken(versionUploadModel.getData().getToken());
        versionPayLoadData.setVersion(versionUploadModel.getData().getVersion());
        versionPayLoadData.setSource(versionUploadModel.getData().getSource());
        versionPayLoadData.setEditUserId(versionUploadModel.getData().getEdit_user_id());
        versionPayLoadData.setOperation(101);
        return versionPayLoadData;
    }
}
