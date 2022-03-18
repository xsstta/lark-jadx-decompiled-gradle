package com.ss.android.lark.todo.impl.framework.p2842c.p2844b;

import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.framework.c.b.b */
public final /* synthetic */ class C57208b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f141071a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f141072b;

    static {
        int[] iArr = new int[TodoFilterType.values().length];
        f141071a = iArr;
        iArr[TodoFilterType.ALL.ordinal()] = 1;
        iArr[TodoFilterType.ASSIGN_TO_ME.ordinal()] = 2;
        iArr[TodoFilterType.ASSIGN_FROM_ME.ordinal()] = 3;
        iArr[TodoFilterType.FOLLOWED.ordinal()] = 4;
        iArr[TodoFilterType.COMPLETED.ordinal()] = 5;
        iArr[TodoFilterType.FROM_DOCS.ordinal()] = 6;
        int[] iArr2 = new int[TodoListView.Type.values().length];
        f141072b = iArr2;
        iArr2[TodoListView.Type.ALL.ordinal()] = 1;
        iArr2[TodoListView.Type.ASSIGN_TO_ME.ordinal()] = 2;
        iArr2[TodoListView.Type.ASSIGN_FROM_ME.ordinal()] = 3;
        iArr2[TodoListView.Type.FOLLOWED.ordinal()] = 4;
        iArr2[TodoListView.Type.COMPLETED.ordinal()] = 5;
        iArr2[TodoListView.Type.FROM_DOC.ordinal()] = 6;
    }
}
