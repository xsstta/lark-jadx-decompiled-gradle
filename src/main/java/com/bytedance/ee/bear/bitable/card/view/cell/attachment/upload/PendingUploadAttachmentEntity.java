package com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload;

import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.document.offline.file.upload.FileUploadModel;
import com.bytedance.ee.bear.fileselector.bean.FileBean;

public class PendingUploadAttachmentEntity extends UploadAttachmentEntity {
    private boolean isPendingUpload;
    private FileBean photo;
    private C4535b table;
    private FileUploadModel uploadModel;

    public FileBean getPhoto() {
        return this.photo;
    }

    public C4535b getTable() {
        return this.table;
    }

    public FileUploadModel getUploadModel() {
        return this.uploadModel;
    }

    public boolean isPendingUpload() {
        return this.isPendingUpload;
    }

    public void setPendingUpload(boolean z) {
        this.isPendingUpload = z;
    }

    public void setPhoto(FileBean fileBean) {
        this.photo = fileBean;
    }

    public void setTable(C4535b bVar) {
        this.table = bVar;
    }

    public void setUploadModel(FileUploadModel fileUploadModel) {
        this.uploadModel = fileUploadModel;
    }
}
