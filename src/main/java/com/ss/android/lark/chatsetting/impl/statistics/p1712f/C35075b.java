package com.ss.android.lark.chatsetting.impl.statistics.p1712f;

import com.ss.android.lark.chat.entity.chat.Chat;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.statistics.f.b */
public final /* synthetic */ class C35075b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f90521a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f90522b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f90523c;

    static {
        int[] iArr = new int[Chat.PostType.values().length];
        f90521a = iArr;
        iArr[Chat.PostType.WHITE_LIST.ordinal()] = 1;
        iArr[Chat.PostType.ONLY_ADMIN.ordinal()] = 2;
        int[] iArr2 = new int[Chat.PostType.values().length];
        f90522b = iArr2;
        iArr2[Chat.PostType.WHITE_LIST.ordinal()] = 1;
        iArr2[Chat.PostType.ONLY_ADMIN.ordinal()] = 2;
        int[] iArr3 = new int[Chat.MessagePosition.values().length];
        f90523c = iArr3;
        iArr3[Chat.MessagePosition.RECENT_LEFT.ordinal()] = 1;
        iArr3[Chat.MessagePosition.NEWEST_UNREAD.ordinal()] = 2;
    }
}
