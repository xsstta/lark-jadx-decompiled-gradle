package com.ss.android.lark.team.page.member;

import com.ss.android.lark.team.entity.MemberActionType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.member.g */
public final /* synthetic */ class C55584g {

    /* renamed from: a */
    public static final /* synthetic */ int[] f137137a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f137138b;

    static {
        int[] iArr = new int[MemberActionType.values().length];
        f137137a = iArr;
        iArr[MemberActionType.BROWSE_LIST.ordinal()] = 1;
        int[] iArr2 = new int[MemberActionType.values().length];
        f137138b = iArr2;
        iArr2[MemberActionType.REMOVE_MEMBER.ordinal()] = 1;
        iArr2[MemberActionType.SELECT_MEMBER_FOR_PRIVATE_CHAT.ordinal()] = 2;
    }
}
