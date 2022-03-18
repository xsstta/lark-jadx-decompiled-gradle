package com.bytedance.lark.pb.contact.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum VirtualNodeType implements WireEnum {
    UNKNOWN_VIRTUAL_NODE_TYPE(0),
    VNODE_STUDENT(1),
    VNODE_PARENT(2),
    VNODE_TEACHER(3);
    
    public static final ProtoAdapter<VirtualNodeType> ADAPTER = ProtoAdapter.newEnumAdapter(VirtualNodeType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static VirtualNodeType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_VIRTUAL_NODE_TYPE;
        }
        if (i == 1) {
            return VNODE_STUDENT;
        }
        if (i == 2) {
            return VNODE_PARENT;
        }
        if (i != 3) {
            return null;
        }
        return VNODE_TEACHER;
    }

    private VirtualNodeType(int i) {
        this.value = i;
    }
}
