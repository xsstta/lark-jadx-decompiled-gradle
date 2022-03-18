package com.ss.android.lark.pb.authorization;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum PermissionType implements WireEnum {
    PERMISSION_TYPE_UNKNOWN(0),
    FILE_UPLOAD(1),
    FILE_IMPORT(2),
    FILE_DOWNLOAD(3),
    FILE_EXPORT(4),
    FILE_PRINT(5),
    FILE_APP_OPEN(6),
    FILE_ACCESS_FOLDER(7),
    FILE_READ(8),
    FILE_EDIT(9),
    FILE_COMMENT(10),
    FILE_COPY(11),
    FILE_DELETE(12),
    FILE_SHARE(13),
    SEARCH(14);
    
    public static final ProtoAdapter<PermissionType> ADAPTER = ProtoAdapter.newEnumAdapter(PermissionType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static PermissionType fromValue(int i) {
        switch (i) {
            case 0:
                return PERMISSION_TYPE_UNKNOWN;
            case 1:
                return FILE_UPLOAD;
            case 2:
                return FILE_IMPORT;
            case 3:
                return FILE_DOWNLOAD;
            case 4:
                return FILE_EXPORT;
            case 5:
                return FILE_PRINT;
            case 6:
                return FILE_APP_OPEN;
            case 7:
                return FILE_ACCESS_FOLDER;
            case 8:
                return FILE_READ;
            case 9:
                return FILE_EDIT;
            case 10:
                return FILE_COMMENT;
            case 11:
                return FILE_COPY;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return FILE_DELETE;
            case 13:
                return FILE_SHARE;
            case 14:
                return SEARCH;
            default:
                return null;
        }
    }

    private PermissionType(int i) {
        this.value = i;
    }
}
