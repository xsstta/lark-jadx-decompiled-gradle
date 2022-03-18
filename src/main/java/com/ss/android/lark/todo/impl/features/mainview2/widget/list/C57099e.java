package com.ss.android.lark.todo.impl.features.mainview2.widget.list;

import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.e */
public final /* synthetic */ class C57099e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f140781a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f140782b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f140783c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f140784d;

    /* renamed from: e */
    public static final /* synthetic */ int[] f140785e;

    /* renamed from: f */
    public static final /* synthetic */ int[] f140786f;

    /* renamed from: g */
    public static final /* synthetic */ int[] f140787g;

    static {
        int[] iArr = new int[TodoListView.Type.values().length];
        f140781a = iArr;
        iArr[TodoListView.Type.ALL.ordinal()] = 1;
        iArr[TodoListView.Type.ASSIGN_FROM_ME.ordinal()] = 2;
        iArr[TodoListView.Type.ASSIGN_TO_ME.ordinal()] = 3;
        iArr[TodoListView.Type.FOLLOWED.ordinal()] = 4;
        iArr[TodoListView.Type.FROM_DOC.ordinal()] = 5;
        int[] iArr2 = new int[TodoListView.Type.values().length];
        f140782b = iArr2;
        iArr2[TodoListView.Type.COMPLETED.ordinal()] = 1;
        iArr2[TodoListView.Type.FROM_DOC.ordinal()] = 2;
        int[] iArr3 = new int[MultiCompleteHelper.MultiCompleteType.values().length];
        f140783c = iArr3;
        iArr3[MultiCompleteHelper.MultiCompleteType.COMPLETE_USER.ordinal()] = 1;
        iArr3[MultiCompleteHelper.MultiCompleteType.COMPLETE_TODO_WITH_DIALOG.ordinal()] = 2;
        int[] iArr4 = new int[MultiCompleteHelper.MultiCompleteType.values().length];
        f140784d = iArr4;
        iArr4[MultiCompleteHelper.MultiCompleteType.COMPLETE_USER.ordinal()] = 1;
        iArr4[MultiCompleteHelper.MultiCompleteType.COMPLETE_TODO_WITH_DIALOG.ordinal()] = 2;
        int[] iArr5 = new int[TodoItemViewData.BehindDeleteStatus.values().length];
        f140785e = iArr5;
        iArr5[TodoItemViewData.BehindDeleteStatus.DELETE.ordinal()] = 1;
        iArr5[TodoItemViewData.BehindDeleteStatus.QUIT.ordinal()] = 2;
        iArr5[TodoItemViewData.BehindDeleteStatus.UNFOLLOW.ordinal()] = 3;
        int[] iArr6 = new int[TodoListView.Type.values().length];
        f140786f = iArr6;
        iArr6[TodoListView.Type.COMPLETED.ordinal()] = 1;
        iArr6[TodoListView.Type.FROM_DOC.ordinal()] = 2;
        int[] iArr7 = new int[TodoListView.Type.values().length];
        f140787g = iArr7;
        iArr7[TodoListView.Type.ALL.ordinal()] = 1;
        iArr7[TodoListView.Type.ASSIGN_FROM_ME.ordinal()] = 2;
        iArr7[TodoListView.Type.ASSIGN_TO_ME.ordinal()] = 3;
        iArr7[TodoListView.Type.COMPLETED.ordinal()] = 4;
        iArr7[TodoListView.Type.FOLLOWED.ordinal()] = 5;
        iArr7[TodoListView.Type.FROM_DOC.ordinal()] = 6;
    }
}
