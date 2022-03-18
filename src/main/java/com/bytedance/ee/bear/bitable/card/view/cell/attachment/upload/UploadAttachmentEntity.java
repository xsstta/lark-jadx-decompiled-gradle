package com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload;

import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.AttachmentEntity;

public class UploadAttachmentEntity extends AttachmentEntity {
    private String fieldId;
    private boolean isCameraOnly;
    private String recordId;
    private int uploadProgress;
    private String uploadTaskKey;

    public String getFieldId() {
        return this.fieldId;
    }

    public String getRecordId() {
        return this.recordId;
    }

    public int getUploadProgress() {
        return this.uploadProgress;
    }

    public String getUploadTaskKey() {
        return this.uploadTaskKey;
    }

    public boolean isCameraOnly() {
        return this.isCameraOnly;
    }

    public void setCameraOnly(boolean z) {
        this.isCameraOnly = z;
    }

    public void setFieldId(String str) {
        this.fieldId = str;
    }

    public void setRecordId(String str) {
        this.recordId = str;
    }

    public void setUploadProgress(int i) {
        this.uploadProgress = i;
    }

    public void setUploadTaskKey(String str) {
        this.uploadTaskKey = str;
    }
}
