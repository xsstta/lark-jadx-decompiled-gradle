package com.bytedance.ee.bear.drive.biz.importfile.request.error;

public enum ImportFailedType {
    FailedNoPermisson,
    FailedNoNet,
    FailedType,
    FailedSize,
    FailedCanRetry,
    FailedOverLimitCount,
    FailedCanContactSupport,
    FailedEncrypt,
    FailedImportBlockNumberOverLimit,
    FailedImportBlockHierarchyOverLimit,
    FailedImportBlockStorageOverLimit,
    FailedNotExist,
    FailedEmptyFile
}
