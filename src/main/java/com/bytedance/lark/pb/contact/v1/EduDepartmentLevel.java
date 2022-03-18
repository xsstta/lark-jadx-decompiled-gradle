package com.bytedance.lark.pb.contact.v1;

import com.huawei.hms.support.api.entity.core.CommonCode;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum EduDepartmentLevel implements WireEnum {
    UNKNOWN_DEPARTMENT_LEVEL(0),
    CAMPUS(1),
    PERIOD(2),
    GRADE(3),
    CLASS(4),
    SCHOOL(10),
    VNODE_UNDER_CLASS(CommonCode.StatusCode.API_CLIENT_EXPIRED);
    
    public static final ProtoAdapter<EduDepartmentLevel> ADAPTER = ProtoAdapter.newEnumAdapter(EduDepartmentLevel.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static EduDepartmentLevel fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_DEPARTMENT_LEVEL;
        }
        if (i == 1) {
            return CAMPUS;
        }
        if (i == 2) {
            return PERIOD;
        }
        if (i == 3) {
            return GRADE;
        }
        if (i == 4) {
            return CLASS;
        }
        if (i == 10) {
            return SCHOOL;
        }
        if (i != 1001) {
            return null;
        }
        return VNODE_UNDER_CLASS;
    }

    private EduDepartmentLevel(int i) {
        this.value = i;
    }
}
