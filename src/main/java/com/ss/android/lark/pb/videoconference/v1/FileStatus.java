package com.ss.android.lark.pb.videoconference.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum FileStatus implements WireEnum {
    UnSyncServer(0),
    FileSizeLimit(1),
    FileCountLimit(2),
    Reviewing(3),
    ServerErr(4),
    TimeOut(5),
    Failed(6),
    OK(7);
    
    public static final ProtoAdapter<FileStatus> ADAPTER = ProtoAdapter.newEnumAdapter(FileStatus.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
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
