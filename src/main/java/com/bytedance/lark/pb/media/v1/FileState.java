package com.bytedance.lark.pb.media.v1;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum FileState implements WireEnum {
    UPLOAD_WAIT(1),
    UPLOADING(2),
    UPLOAD_FAIL(3),
    UPLOAD_CANCEL(4),
    UPLOAD_SUCCESS(5),
    UPLOAD_CREATED(6),
    DOWNLOAD_WAIT(7),
    DOWNLOADING(8),
    DOWNLOAD_FAIL(9),
    DOWNLOAD_CANCEL(10),
    DOWNLOAD_SUCCESS(11),
    DOWNLOAD_FAIL_RECALL(12),
    DOWNLOAD_FAIL_BURNED(13),
    COMPRESS_MEDIA_COMPLETE(14),
    UPLOAD_CANCEL_FOR_SWITCH(15);
    
    public static final ProtoAdapter<FileState> ADAPTER = ProtoAdapter.newEnumAdapter(FileState.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static FileState fromValue(int i) {
        switch (i) {
            case 1:
                return UPLOAD_WAIT;
            case 2:
                return UPLOADING;
            case 3:
                return UPLOAD_FAIL;
            case 4:
                return UPLOAD_CANCEL;
            case 5:
                return UPLOAD_SUCCESS;
            case 6:
                return UPLOAD_CREATED;
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
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                return DOWNLOAD_FAIL_RECALL;
            case 13:
                return DOWNLOAD_FAIL_BURNED;
            case 14:
                return COMPRESS_MEDIA_COMPLETE;
            case 15:
                return UPLOAD_CANCEL_FOR_SWITCH;
            default:
                return null;
        }
    }

    private FileState(int i) {
        this.value = i;
    }
}
