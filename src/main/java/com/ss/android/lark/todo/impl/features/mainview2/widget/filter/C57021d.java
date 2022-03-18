package com.ss.android.lark.todo.impl.features.mainview2.widget.filter;

import com.bytedance.lark.pb.todo.v1.TodoListView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.d */
public final /* synthetic */ class C57021d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f140697a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f140698b;

    static {
        int[] iArr = new int[TodoListView.Type.values().length];
        f140697a = iArr;
        iArr[TodoListView.Type.ALL.ordinal()] = 1;
        iArr[TodoListView.Type.ASSIGN_TO_ME.ordinal()] = 2;
        iArr[TodoListView.Type.ASSIGN_FROM_ME.ordinal()] = 3;
        iArr[TodoListView.Type.FOLLOWED.ordinal()] = 4;
        iArr[TodoListView.Type.COMPLETED.ordinal()] = 5;
        iArr[TodoListView.Type.FROM_DOC.ordinal()] = 6;
        int[] iArr2 = new int[TodoListView.Type.values().length];
        f140698b = iArr2;
        iArr2[TodoListView.Type.ALL.ordinal()] = 1;
        iArr2[TodoListView.Type.ASSIGN_TO_ME.ordinal()] = 2;
        iArr2[TodoListView.Type.ASSIGN_FROM_ME.ordinal()] = 3;
        iArr2[TodoListView.Type.FOLLOWED.ordinal()] = 4;
        iArr2[TodoListView.Type.COMPLETED.ordinal()] = 5;
        iArr2[TodoListView.Type.FROM_DOC.ordinal()] = 6;
    }
}
