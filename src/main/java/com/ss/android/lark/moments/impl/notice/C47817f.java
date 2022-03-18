package com.ss.android.lark.moments.impl.notice;

import com.bytedance.lark.pb.moments.v1.Notification;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.notice.f */
public final /* synthetic */ class C47817f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f120431a;

    static {
        int[] iArr = new int[Notification.Type.values().length];
        f120431a = iArr;
        iArr[Notification.Type.FOLLOWER.ordinal()] = 1;
        iArr[Notification.Type.POST_REACTION.ordinal()] = 2;
        iArr[Notification.Type.COMMENT_REACTION.ordinal()] = 3;
        iArr[Notification.Type.COMMENT.ordinal()] = 4;
        iArr[Notification.Type.REPLY.ordinal()] = 5;
        iArr[Notification.Type.AT_IN_POST.ordinal()] = 6;
        iArr[Notification.Type.AT_IN_COMMENT.ordinal()] = 7;
    }
}
