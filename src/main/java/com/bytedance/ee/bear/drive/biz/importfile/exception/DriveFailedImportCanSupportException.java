package com.bytedance.ee.bear.drive.biz.importfile.exception;

import com.bytedance.ee.bear.drive.loader.model.ErrCode;

public class DriveFailedImportCanSupportException extends DriveImportBaseException {
    private ErrCode mErrCode;

    public DriveFailedImportCanSupportException() {
    }

    public ErrCode getErrCode() {
        return this.mErrCode;
    }

    public DriveFailedImportCanSupportException(ErrCode errCode) {
        this.mErrCode = errCode;
    }
}
