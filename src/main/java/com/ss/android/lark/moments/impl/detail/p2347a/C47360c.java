package com.ss.android.lark.moments.impl.detail.p2347a;

import com.bytedance.lark.pb.moments.v1.Comment;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.detail.a.c */
public final /* synthetic */ class C47360c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f119544a;

    static {
        int[] iArr = new int[Comment.CreateStatus.values().length];
        f119544a = iArr;
        iArr[Comment.CreateStatus.SENDING.ordinal()] = 1;
        iArr[Comment.CreateStatus.FAILED.ordinal()] = 2;
        iArr[Comment.CreateStatus.ERROR.ordinal()] = 3;
    }
}
