package com.bytedance.lark.pb.contact.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum EduRoleType implements WireEnum {
    UNKNOWN_EDU_ROLE_TYPE(0),
    STUDENT(1),
    PARENT(2),
    SUBJECT_TEACHER(3),
    CLASS_HEAD(4),
    DIRECTOR(5),
    SUPER_ADMIN(6),
    ADMIN(7);
    
    public static final ProtoAdapter<EduRoleType> ADAPTER = ProtoAdapter.newEnumAdapter(EduRoleType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static EduRoleType fromValue(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_EDU_ROLE_TYPE;
            case 1:
                return STUDENT;
            case 2:
                return PARENT;
            case 3:
                return SUBJECT_TEACHER;
            case 4:
                return CLASS_HEAD;
            case 5:
                return DIRECTOR;
            case 6:
                return SUPER_ADMIN;
            case 7:
                return ADMIN;
            default:
                return null;
        }
    }

    private EduRoleType(int i) {
        this.value = i;
    }
}
