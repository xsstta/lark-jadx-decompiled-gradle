package com.ss.android.lark.chatsetting.impl.post;

import com.ss.android.lark.chat.entity.chat.Chat;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.post.d */
public final /* synthetic */ class C35058d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f90459a;

    static {
        int[] iArr = new int[Chat.PostType.values().length];
        f90459a = iArr;
        iArr[Chat.PostType.ANYONE.ordinal()] = 1;
        iArr[Chat.PostType.ONLY_ADMIN.ordinal()] = 2;
    }
}
