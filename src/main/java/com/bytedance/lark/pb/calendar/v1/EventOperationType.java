package com.bytedance.lark.pb.calendar.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum EventOperationType implements WireEnum {
    OP_CREATE_EVENT(1),
    OP_EDIT_EVENT(2),
    OP_DELETE_EVENT(3);
    
    public static final ProtoAdapter<EventOperationType> ADAPTER = ProtoAdapter.newEnumAdapter(EventOperationType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static EventOperationType fromValue(int i) {
        if (i == 1) {
            return OP_CREATE_EVENT;
        }
        if (i == 2) {
            return OP_EDIT_EVENT;
        }
        if (i != 3) {
            return null;
        }
        return OP_DELETE_EVENT;
    }

    private EventOperationType(int i) {
        this.value = i;
    }
}
