package com.ss.android.lark.mm.module.list.data;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/mm/module/list/data/MmOwnerType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "OWNED_BY_ANYONE", "OWNED_BY_ME", "SHARED_WITH_ME", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum MmOwnerType {
    OWNED_BY_ANYONE(1),
    OWNED_BY_ME(2),
    SHARED_WITH_ME(3);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    private MmOwnerType(int i) {
        this.value = i;
    }
}
