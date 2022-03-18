package com.ss.android.lark.filedetail.impl.detail;

public enum FileDownloadState {
    NORMAL(0),
    PAUSE(1),
    DOWNLOADING(2),
    DONE(3),
    STOP(4),
    RECALL(5),
    BURNED(6),
    FAILED(7),
    UNKNOWN(-1);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static FileDownloadState valueOf(int i) {
        return forNumber(i);
    }

    public static FileDownloadState forNumber(int i) {
        switch (i) {
            case 0:
                return NORMAL;
            case 1:
                return PAUSE;
            case 2:
                return DOWNLOADING;
            case 3:
                return DONE;
            case 4:
                return STOP;
            case 5:
                return RECALL;
            case 6:
                return BURNED;
            case 7:
                return FAILED;
            default:
                return UNKNOWN;
        }
    }

    private FileDownloadState(int i) {
        this.value = i;
    }
}
