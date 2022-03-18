package com.ss.android.lark.team.page.member;

import com.ss.android.lark.team.entity.MemberActionType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.member.u */
public final /* synthetic */ class C55596u {

    /* renamed from: a */
    public static final /* synthetic */ int[] f137162a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f137163b;

    static {
        int[] iArr = new int[MemberActionType.values().length];
        f137162a = iArr;
        iArr[MemberActionType.BROWSE_LIST_WITHOUT_OPERATION.ordinal()] = 1;
        iArr[MemberActionType.REMOVE_MEMBER.ordinal()] = 2;
        iArr[MemberActionType.CHANGE_OWNER.ordinal()] = 3;
        int[] iArr2 = new int[MemberActionType.values().length];
        f137163b = iArr2;
        iArr2[MemberActionType.CHANGE_OWNER.ordinal()] = 1;
    }
}
