package com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission;

import com.ss.android.lark.chat.entity.chat.Chat;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.a */
public final /* synthetic */ class C34912a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f90099a;

    static {
        int[] iArr = new int[Chat.PostType.values().length];
        f90099a = iArr;
        iArr[Chat.PostType.UNKNOWN_POST_TYPE.ordinal()] = 1;
        iArr[Chat.PostType.ANYONE.ordinal()] = 2;
        iArr[Chat.PostType.ONLY_ADMIN.ordinal()] = 3;
        iArr[Chat.PostType.WHITE_LIST.ordinal()] = 4;
    }
}
