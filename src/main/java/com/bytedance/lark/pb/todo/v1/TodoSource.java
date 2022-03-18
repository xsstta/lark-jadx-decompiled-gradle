package com.bytedance.lark.pb.todo.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum TodoSource implements WireEnum {
    UNKNOWN_SOURCE(0),
    TODO(1),
    MESSENGER(2),
    DOC(3),
    DOC_PRODUCT(4),
    OAPI(6);
    
    public static final ProtoAdapter<TodoSource> ADAPTER = ProtoAdapter.newEnumAdapter(TodoSource.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static TodoSource fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_SOURCE;
        }
        if (i == 1) {
            return TODO;
        }
        if (i == 2) {
            return MESSENGER;
        }
        if (i == 3) {
            return DOC;
        }
        if (i == 4) {
            return DOC_PRODUCT;
        }
        if (i != 6) {
            return null;
        }
        return OAPI;
    }

    private TodoSource(int i) {
        this.value = i;
    }
}
