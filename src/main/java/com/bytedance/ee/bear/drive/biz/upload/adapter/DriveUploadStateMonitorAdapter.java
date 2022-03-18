package com.bytedance.ee.bear.drive.biz.upload.adapter;

import com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor;
import com.bytedance.ee.bear.middleground.drive.export.ProgressingEntity;

public class DriveUploadStateMonitorAdapter extends BinderIUploadStateMonitor.Stub {
    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onExistUploadingFile() {
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onFileCountChange(int i, int i2) {
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onFileProgressChange(int i, ProgressingEntity progressingEntity) {
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onUploadError(int i) {
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onUploadErrorCode(String str, int i) {
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onUploadFileSuccess(String str, String str2, String str3) {
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onUploadFinished() {
    }
}
