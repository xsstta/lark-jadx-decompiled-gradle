package com.ss.android.lark.todo.impl.features.detail.comment;

import com.bytedance.lark.pb.todo.v1.TodoComment;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.x */
public final /* synthetic */ class C56568x {

    /* renamed from: a */
    public static final /* synthetic */ int[] f139904a;

    static {
        int[] iArr = new int[TodoComment.Status.values().length];
        f139904a = iArr;
        iArr[TodoComment.Status.NORMAL.ordinal()] = 1;
        iArr[TodoComment.Status.EDITED.ordinal()] = 2;
        iArr[TodoComment.Status.DELETED.ordinal()] = 3;
    }
}
