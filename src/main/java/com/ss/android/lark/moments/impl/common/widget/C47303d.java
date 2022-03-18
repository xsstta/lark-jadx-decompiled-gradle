package com.ss.android.lark.moments.impl.common.widget;

import com.ss.android.lark.moments.impl.common.widget.MomentsFollowButton;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.widget.d */
public final /* synthetic */ class C47303d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f119310a;

    static {
        int[] iArr = new int[MomentsFollowButton.ButtonMode.values().length];
        f119310a = iArr;
        iArr[MomentsFollowButton.ButtonMode.UNFOLLOW.ordinal()] = 1;
        iArr[MomentsFollowButton.ButtonMode.FOLLOWING.ordinal()] = 2;
        iArr[MomentsFollowButton.ButtonMode.FOLLOWED.ordinal()] = 3;
        iArr[MomentsFollowButton.ButtonMode.UNFOLLOWING.ordinal()] = 4;
    }
}
