package com.bytedance.ee.bear.drive.biz.importfile.exception;

import com.bytedance.ee.bear.drive.loader.model.C7086a;

public class DriveCannotImportBySizeException extends DriveImportBaseException {
    private C7086a mFileModel;

    public C7086a getFileModel() {
        return this.mFileModel;
    }

    public DriveCannotImportBySizeException(C7086a aVar) {
        this.mFileModel = aVar;
    }
}
