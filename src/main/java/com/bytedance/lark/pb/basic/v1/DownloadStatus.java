package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum DownloadStatus implements WireEnum {
    DOWNLOAD_STATUS_UNKOWN(0),
    DOWNLOAD_STATUS_INIT(1),
    DOWNLOAD_STATUS_DOWNLOADING(2),
    DOWNLOAD_STATUS_SUCCESS(3),
    DOWNLOAD_STATUS_FAIL(4);
    
    public static final ProtoAdapter<DownloadStatus> ADAPTER = ProtoAdapter.newEnumAdapter(DownloadStatus.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static DownloadStatus fromValue(int i) {
        if (i == 0) {
            return DOWNLOAD_STATUS_UNKOWN;
        }
        if (i == 1) {
            return DOWNLOAD_STATUS_INIT;
        }
        if (i == 2) {
            return DOWNLOAD_STATUS_DOWNLOADING;
        }
        if (i == 3) {
            return DOWNLOAD_STATUS_SUCCESS;
        }
        if (i != 4) {
            return null;
        }
        return DOWNLOAD_STATUS_FAIL;
    }

    private DownloadStatus(int i) {
        this.value = i;
    }
}
