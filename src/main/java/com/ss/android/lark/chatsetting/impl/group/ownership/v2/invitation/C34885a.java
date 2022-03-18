package com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation;

import com.ss.android.lark.chat.entity.chat.Chat;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation.a */
public final /* synthetic */ class C34885a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f90064a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f90065b;

    static {
        int[] iArr = new int[Chat.SystemMessageVisible.values().length];
        f90064a = iArr;
        iArr[Chat.SystemMessageVisible.ALL_MEMBERS.ordinal()] = 1;
        iArr[Chat.SystemMessageVisible.ONLY_OWNER.ordinal()] = 2;
        int[] iArr2 = new int[Type.values().length];
        f90065b = iArr2;
        iArr2[Type.JOIN_CHAT.ordinal()] = 1;
        iArr2[Type.LEAVE_CHAT.ordinal()] = 2;
    }
}
