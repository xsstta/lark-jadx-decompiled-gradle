package com.ss.android.lark.chatsetting.impl.group.ownership.sharing;

import com.ss.android.lark.chat.entity.chat.ChatShareInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.j */
public final /* synthetic */ class C34803j {

    /* renamed from: a */
    public static final /* synthetic */ int[] f89905a;

    static {
        int[] iArr = new int[ChatShareInfo.ShareTargetType.values().length];
        f89905a = iArr;
        iArr[ChatShareInfo.ShareTargetType.TARGET_CHATTER.ordinal()] = 1;
        iArr[ChatShareInfo.ShareTargetType.TARGET_CHAT.ordinal()] = 2;
        iArr[ChatShareInfo.ShareTargetType.TARGET_DOC.ordinal()] = 3;
    }
}
