package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum TransStatus implements WireEnum {
    PENDING(0),
    ACCEPT(1),
    REFUSE(2),
    CANCEL(3),
    ABORT_BY_SENDER(4),
    ABORT_BY_RECEIVER(5),
    TRANS_DONE(6),
    OFFLINE_MODE(7),
    CANCEL_BY_RECEIVER(8);
    
    public static final ProtoAdapter<TransStatus> ADAPTER = ProtoAdapter.newEnumAdapter(TransStatus.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static TransStatus fromValue(int i) {
        switch (i) {
            case 0:
                return PENDING;
            case 1:
                return ACCEPT;
            case 2:
                return REFUSE;
            case 3:
                return CANCEL;
            case 4:
                return ABORT_BY_SENDER;
            case 5:
                return ABORT_BY_RECEIVER;
            case 6:
                return TRANS_DONE;
            case 7:
                return OFFLINE_MODE;
            case 8:
                return CANCEL_BY_RECEIVER;
            default:
                return null;
        }
    }

    private TransStatus(int i) {
        this.value = i;
    }
}
