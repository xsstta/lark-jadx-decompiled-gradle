package com.bytedance.ee.bear.drive.biz.importfile.exception;

public class DriveImportBaseException extends Exception {
    public DriveImportBaseException() {
    }

    public DriveImportBaseException(String str) {
        super(str);
    }

    public DriveImportBaseException(Throwable th) {
        super(th);
    }

    public DriveImportBaseException(String str, Throwable th) {
        super(str, th);
    }
}
