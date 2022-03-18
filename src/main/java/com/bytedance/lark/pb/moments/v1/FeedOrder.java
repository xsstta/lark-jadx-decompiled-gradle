package com.bytedance.lark.pb.moments.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum FeedOrder implements WireEnum {
    UNSPECIFIED(0),
    LAST_REPLIED(1),
    LAST_PUBLISH(2),
    RECOMMEND(3);
    
    public static final ProtoAdapter<FeedOrder> ADAPTER = ProtoAdapter.newEnumAdapter(FeedOrder.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static FeedOrder fromValue(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return LAST_REPLIED;
        }
        if (i == 2) {
            return LAST_PUBLISH;
        }
        if (i != 3) {
            return null;
        }
        return RECOMMEND;
    }

    private FeedOrder(int i) {
        this.value = i;
    }
}
