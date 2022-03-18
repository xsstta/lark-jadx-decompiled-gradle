package com.bytedance.lark.pb.email.client.v1;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum PermissionCode implements WireEnum {
    NONE(0),
    VIEW(1),
    EDIT(4),
    OWNER(DynamicModule.f58006b);
    
    public static final ProtoAdapter<PermissionCode> ADAPTER = ProtoAdapter.newEnumAdapter(PermissionCode.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static PermissionCode fromValue(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return VIEW;
        }
        if (i == 4) {
            return EDIT;
        }
        if (i != 256) {
            return null;
        }
        return OWNER;
    }

    private PermissionCode(int i) {
        this.value = i;
    }
}
