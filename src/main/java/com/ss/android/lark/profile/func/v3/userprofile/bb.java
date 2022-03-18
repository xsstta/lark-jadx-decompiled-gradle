package com.ss.android.lark.profile.func.v3.userprofile;

import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
public final /* synthetic */ class bb {

    /* renamed from: a */
    public static final /* synthetic */ int[] f130443a;

    static {
        int[] iArr = new int[GetUserProfileResponse.UserInfo.FriendStatus.values().length];
        f130443a = iArr;
        iArr[GetUserProfileResponse.UserInfo.FriendStatus.FORWARD.ordinal()] = 1;
        iArr[GetUserProfileResponse.UserInfo.FriendStatus.DOUBLE.ordinal()] = 2;
        iArr[GetUserProfileResponse.UserInfo.FriendStatus.NONE.ordinal()] = 3;
        iArr[GetUserProfileResponse.UserInfo.FriendStatus.REVERSE.ordinal()] = 4;
    }
}
