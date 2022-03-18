package com.ss.android.lark.todo.impl.features.detail.comment;

import com.bytedance.lark.pb.todo.v1.TodoComment;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.b */
public final /* synthetic */ class C56511b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f139793a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f139794b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f139795c;

    static {
        int[] iArr = new int[TodoComment.Status.values().length];
        f139793a = iArr;
        iArr[TodoComment.Status.EDITED.ordinal()] = 1;
        int[] iArr2 = new int[TodoComment.Status.values().length];
        f139794b = iArr2;
        iArr2[TodoComment.Status.EDITED.ordinal()] = 1;
        int[] iArr3 = new int[TodoComment.Type.values().length];
        f139795c = iArr3;
        iArr3[TodoComment.Type.UNKNOWN_TYPE.ordinal()] = 1;
    }
}
