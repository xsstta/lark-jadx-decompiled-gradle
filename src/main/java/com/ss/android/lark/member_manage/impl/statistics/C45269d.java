package com.ss.android.lark.member_manage.impl.statistics;

import com.ss.android.lark.chat.entity.chat.Chat;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.statistics.d */
public final /* synthetic */ class C45269d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f114609a;

    static {
        int[] iArr = new int[Chat.Type.values().length];
        f114609a = iArr;
        iArr[Chat.Type.P2P.ordinal()] = 1;
        iArr[Chat.Type.GROUP.ordinal()] = 2;
        iArr[Chat.Type.TOPIC_GROUP.ordinal()] = 3;
    }
}
