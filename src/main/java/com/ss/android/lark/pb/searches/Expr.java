package com.ss.android.lark.pb.searches;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum Expr implements WireEnum {
    AND(0),
    OR(1);
    
    public static final ProtoAdapter<Expr> ADAPTER = ProtoAdapter.newEnumAdapter(Expr.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static Expr fromValue(int i) {
        if (i == 0) {
            return AND;
        }
        if (i != 1) {
            return null;
        }
        return OR;
    }

    private Expr(int i) {
        this.value = i;
    }
}
