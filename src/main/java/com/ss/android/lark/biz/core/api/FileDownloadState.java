package com.ss.android.lark.biz.core.api;

public enum FileDownloadState {
    UNKNOWN(0),
    DOWNLOAD_WAIT(7),
    DOWNLOADING(8),
    DOWNLOAD_FAIL(9),
    DOWNLOAD_CANCEL(10),
    DOWNLOAD_SUCCESS(11);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static FileDownloadState valueOf(int i) {
        return forNumber(i);
    }

    public static FileDownloadState forNumber(int i) {
        switch (i) {
            case 7:
                return DOWNLOAD_WAIT;
            case 8:
                return DOWNLOADING;
            case 9:
                return DOWNLOAD_FAIL;
            case 10:
                return DOWNLOAD_CANCEL;
            case 11:
                return DOWNLOAD_SUCCESS;
            default:
                return UNKNOWN;
        }
    }

    private FileDownloadState(int i) {
        this.value = i;
    }
}
