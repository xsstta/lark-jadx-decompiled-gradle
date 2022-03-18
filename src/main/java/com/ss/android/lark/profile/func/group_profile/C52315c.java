package com.ss.android.lark.profile.func.group_profile;

import com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent;
import com.ss.android.lark.profile.func.group_profile.mvvm.GroupProfileViewModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.group_profile.c */
public final /* synthetic */ class C52315c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f129721a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f129722b;

    static {
        int[] iArr = new int[ShareGroupChatContent.GroupState.values().length];
        f129721a = iArr;
        iArr[ShareGroupChatContent.GroupState.ALREADY_IN_GROUP.ordinal()] = 1;
        iArr[ShareGroupChatContent.GroupState.JUST_SHOW_GROUP_INFO.ordinal()] = 2;
        iArr[ShareGroupChatContent.GroupState.CAN_JOIN_DIRECTLY.ordinal()] = 3;
        iArr[ShareGroupChatContent.GroupState.NEED_APPLY.ordinal()] = 4;
        iArr[ShareGroupChatContent.GroupState.PENDING_APPROVAL.ordinal()] = 5;
        iArr[ShareGroupChatContent.GroupState.NEED_CREATE_TENANT.ordinal()] = 6;
        iArr[ShareGroupChatContent.GroupState.NEED_SWITCH_TENANT.ordinal()] = 7;
        iArr[ShareGroupChatContent.GroupState.EXTERNAL_USERS_CANNOT_OPERATE.ordinal()] = 8;
        iArr[ShareGroupChatContent.GroupState.INVITER_LEFT.ordinal()] = 9;
        iArr[ShareGroupChatContent.GroupState.GROUP_DISBANDED.ordinal()] = 10;
        iArr[ShareGroupChatContent.GroupState.SHARING_DISABLED.ordinal()] = 11;
        iArr[ShareGroupChatContent.GroupState.SHARE_EXPIRED.ordinal()] = 12;
        iArr[ShareGroupChatContent.GroupState.NO_EXTERNAL_COMMUNICATION_AUTHORITY.ordinal()] = 13;
        iArr[ShareGroupChatContent.GroupState.GROUP_IS_FULL.ordinal()] = 14;
        iArr[ShareGroupChatContent.GroupState.LINK_CERTIFIED_REFUSE.ordinal()] = 15;
        iArr[ShareGroupChatContent.GroupState.QR_CODE_CERTIFIED_REFUSE.ordinal()] = 16;
        iArr[ShareGroupChatContent.GroupState.SHARE_CARD_CERTIFIED_REFUSE.ordinal()] = 17;
        int[] iArr2 = new int[GroupProfileViewModel.ActionResultNotify.values().length];
        f129722b = iArr2;
        iArr2[GroupProfileViewModel.ActionResultNotify.PENDING_APPROVAL.ordinal()] = 1;
        iArr2[GroupProfileViewModel.ActionResultNotify.NEED_APPLY.ordinal()] = 2;
        iArr2[GroupProfileViewModel.ActionResultNotify.INVITER_LEFT.ordinal()] = 3;
        iArr2[GroupProfileViewModel.ActionResultNotify.GROUP_DISBANDED.ordinal()] = 4;
        iArr2[GroupProfileViewModel.ActionResultNotify.SHARING_DISABLED.ordinal()] = 5;
        iArr2[GroupProfileViewModel.ActionResultNotify.SHARE_EXPIRED.ordinal()] = 6;
        iArr2[GroupProfileViewModel.ActionResultNotify.GROUP_IS_FULL.ordinal()] = 7;
        iArr2[GroupProfileViewModel.ActionResultNotify.REACH_MEMBER_LIMIT_FOR_FEE.ordinal()] = 8;
        iArr2[GroupProfileViewModel.ActionResultNotify.FETCH_INFO_FAILED.ordinal()] = 9;
        iArr2[GroupProfileViewModel.ActionResultNotify.INTERNAL_GROUP_CAN_NOT_JOIN.ordinal()] = 10;
        iArr2[GroupProfileViewModel.ActionResultNotify.NO_EXTERNAL_COMMUNICATION_AUTHORITY.ordinal()] = 11;
        iArr2[GroupProfileViewModel.ActionResultNotify.OTHER_ACTION_RESULT.ordinal()] = 12;
        iArr2[GroupProfileViewModel.ActionResultNotify.LINK_CERTIFIED_REFUSE.ordinal()] = 13;
        iArr2[GroupProfileViewModel.ActionResultNotify.QR_CODE_CERTIFIED_REFUSE.ordinal()] = 14;
        iArr2[GroupProfileViewModel.ActionResultNotify.SHARE_CARD_CERTIFIED_REFUSE.ordinal()] = 15;
    }
}
