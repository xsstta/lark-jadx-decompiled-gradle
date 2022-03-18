package com.ss.android.vc.entity.background;

public enum FileStatus {
    UnSyncServer(0),
    FileSizeLimit(1),
    FileCountLimit(2),
    Reviewing(3),
    ServerErr(4),
    TimeOut(5),
    Failed(6),
    OK(7);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public int getValue() {
        return this.value;
    }

    public static FileStatus fromValue(int i) {
        switch (i) {
            case 0:
                return UnSyncServer;
            case 1:
                return FileSizeLimit;
            case 2:
                return FileCountLimit;
            case 3:
                return Reviewing;
            case 4:
                return ServerErr;
            case 5:
                return TimeOut;
            case 6:
                return Failed;
            case 7:
                return OK;
            default:
                return null;
        }
    }

    private FileStatus(int i) {
        this.value = i;
    }
}
