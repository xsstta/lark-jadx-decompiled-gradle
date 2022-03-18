package com.bytedance.ee.bear.drive.biz.preview.watermark;

import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import org.koin.java.KoinJavaComponent;

public class DriveWatermarkPlugin extends AbsDrivePlugin {
    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        super.onAttachToHost(aVar);
        BaseOpenEntity openEntity = aVar.mo27261l().getOpenEntity();
        if (openEntity != null) {
            ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40650a(openEntity.getFileId(), String.valueOf(C8275a.m34051b("file")), getActivity());
        }
    }
}
