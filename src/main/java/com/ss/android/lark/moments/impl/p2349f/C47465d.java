package com.ss.android.lark.moments.impl.p2349f;

import com.ss.android.lark.pb.moments_entities.SecretChatStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.f.d */
public final /* synthetic */ class C47465d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f119742a;

    static {
        int[] iArr = new int[SecretChatStatus.values().length];
        f119742a = iArr;
        iArr[SecretChatStatus.NOT_ALLOWED.ordinal()] = 1;
        iArr[SecretChatStatus.NOT_ASKED.ordinal()] = 2;
        iArr[SecretChatStatus.ALREADY_ASKED.ordinal()] = 3;
        iArr[SecretChatStatus.ALREADY_ACCEPTED.ordinal()] = 4;
    }
}
