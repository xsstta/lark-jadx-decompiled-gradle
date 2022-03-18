package com.ss.android.lark.chatsetting.impl.statistics;

import com.ss.android.lark.chat.entity.chat.Chat;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.statistics.b */
public final /* synthetic */ class C35074b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f90515a;

    static {
        int[] iArr = new int[Chat.PostType.values().length];
        f90515a = iArr;
        iArr[Chat.PostType.ANYONE.ordinal()] = 1;
        iArr[Chat.PostType.WHITE_LIST.ordinal()] = 2;
    }
}
