package com.bytedance.lark.pb.tool.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ProxyMode implements WireEnum {
    No(2, null),
    Debug(3, true),
    Specify(4, null),
    Automatic(5, null);
    
    public static final ProtoAdapter<ProxyMode> ADAPTER = ProtoAdapter.newEnumAdapter(ProxyMode.class);
    public final Boolean deprecated;
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ProxyMode fromValue(int i) {
        if (i == 2) {
            return No;
        }
        if (i == 3) {
            return Debug;
        }
        if (i == 4) {
            return Specify;
        }
        if (i != 5) {
            return null;
        }
        return Automatic;
    }

    private ProxyMode(int i, Boolean bool) {
        this.value = i;
        this.deprecated = bool;
    }
}
