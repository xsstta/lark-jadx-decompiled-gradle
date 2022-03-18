package com.bytedance.lark.pb.contact.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum BizScenario implements WireEnum {
    UnknownScenario(0),
    ContactCard(1),
    TeamCard(2),
    EduCard(3);
    
    public static final ProtoAdapter<BizScenario> ADAPTER = ProtoAdapter.newEnumAdapter(BizScenario.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static BizScenario fromValue(int i) {
        if (i == 0) {
            return UnknownScenario;
        }
        if (i == 1) {
            return ContactCard;
        }
        if (i == 2) {
            return TeamCard;
        }
        if (i != 3) {
            return null;
        }
        return EduCard;
    }

    private BizScenario(int i) {
        this.value = i;
    }
}
