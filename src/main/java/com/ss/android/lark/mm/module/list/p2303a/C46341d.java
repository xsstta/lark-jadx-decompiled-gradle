package com.ss.android.lark.mm.module.list.p2303a;

import com.ss.android.lark.mm.module.list.data.MmOwnerType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.a.d */
public final /* synthetic */ class C46341d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f116722a;

    static {
        int[] iArr = new int[MmOwnerType.values().length];
        f116722a = iArr;
        iArr[MmOwnerType.OWNED_BY_ANYONE.ordinal()] = 1;
        iArr[MmOwnerType.OWNED_BY_ME.ordinal()] = 2;
        iArr[MmOwnerType.SHARED_WITH_ME.ordinal()] = 3;
    }
}
