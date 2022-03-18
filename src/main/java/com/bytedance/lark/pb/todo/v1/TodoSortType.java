package com.bytedance.lark.pb.todo.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum TodoSortType implements WireEnum {
    UNKNOWN(0),
    CREATE_TIME(1),
    DUE_TIME(2);
    
    public static final ProtoAdapter<TodoSortType> ADAPTER = ProtoAdapter.newEnumAdapter(TodoSortType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static TodoSortType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return CREATE_TIME;
        }
        if (i != 2) {
            return null;
        }
        return DUE_TIME;
    }

    private TodoSortType(int i) {
        this.value = i;
    }
}
