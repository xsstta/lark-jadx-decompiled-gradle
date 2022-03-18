package com.bytedance.lark.pb.todo.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum TodoItemMemberType implements WireEnum {
    USER(1),
    GROUP(2);
    
    public static final ProtoAdapter<TodoItemMemberType> ADAPTER = ProtoAdapter.newEnumAdapter(TodoItemMemberType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static TodoItemMemberType fromValue(int i) {
        if (i == 1) {
            return USER;
        }
        if (i != 2) {
            return null;
        }
        return GROUP;
    }

    private TodoItemMemberType(int i) {
        this.value = i;
    }
}
