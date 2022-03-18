package com.ss.android.lark.team.page.member;

import com.ss.android.lark.team.entity.MemberActionType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.member.h */
public final /* synthetic */ class C55585h {

    /* renamed from: a */
    public static final /* synthetic */ int[] f137139a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f137140b;

    static {
        int[] iArr = new int[MemberActionType.values().length];
        f137139a = iArr;
        iArr[MemberActionType.SELECT_MEMBER_FOR_PRIVATE_CHAT.ordinal()] = 1;
        int[] iArr2 = new int[MemberActionType.values().length];
        f137140b = iArr2;
        iArr2[MemberActionType.BROWSE_LIST_WITHOUT_OPERATION.ordinal()] = 1;
        iArr2[MemberActionType.REMOVE_MEMBER.ordinal()] = 2;
        iArr2[MemberActionType.CHANGE_OWNER.ordinal()] = 3;
        iArr2[MemberActionType.SELECT_MEMBER_FOR_PRIVATE_CHAT.ordinal()] = 4;
    }
}
