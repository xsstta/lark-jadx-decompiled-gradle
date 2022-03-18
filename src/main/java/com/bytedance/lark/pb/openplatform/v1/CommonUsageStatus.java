package com.bytedance.lark.pb.openplatform.v1;

import com.huawei.hms.location.LocationRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum CommonUsageStatus implements WireEnum {
    USABLE(1),
    TENANT_FORBIDDEN(2),
    PLATFORM_FORBIDDEN(3),
    DEVELOPER_FORBIDDEN(4),
    OFFLINE(5),
    USER_UNVISIBLE(6),
    NEED_PAY_USE(7),
    DELETED(8),
    NOT_EXSIT(100),
    UNPUBLISHED(101),
    UNSHELVE(102),
    PUBLISHED(103),
    CAN_NOT_INSTALL(104),
    NONE_ABILITY(LocationRequest.PRIORITY_HD_ACCURACY),
    NOT_SUPPORT_ABILITY(201);
    
    public static final ProtoAdapter<CommonUsageStatus> ADAPTER = ProtoAdapter.newEnumAdapter(CommonUsageStatus.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static CommonUsageStatus fromValue(int i) {
        if (i == 200) {
            return NONE_ABILITY;
        }
        if (i == 201) {
            return NOT_SUPPORT_ABILITY;
        }
        switch (i) {
            case 1:
                return USABLE;
            case 2:
                return TENANT_FORBIDDEN;
            case 3:
                return PLATFORM_FORBIDDEN;
            case 4:
                return DEVELOPER_FORBIDDEN;
            case 5:
                return OFFLINE;
            case 6:
                return USER_UNVISIBLE;
            case 7:
                return NEED_PAY_USE;
            case 8:
                return DELETED;
            default:
                switch (i) {
                    case 100:
                        return NOT_EXSIT;
                    case 101:
                        return UNPUBLISHED;
                    case 102:
                        return UNSHELVE;
                    case 103:
                        return PUBLISHED;
                    case 104:
                        return CAN_NOT_INSTALL;
                    default:
                        return null;
                }
        }
    }

    private CommonUsageStatus(int i) {
        this.value = i;
    }
}
