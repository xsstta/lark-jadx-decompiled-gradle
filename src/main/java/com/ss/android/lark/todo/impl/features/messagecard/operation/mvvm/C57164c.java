package com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm;

import com.bytedance.lark.pb.basic.v1.TodoOperationContent;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.c */
public final /* synthetic */ class C57164c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f140944a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f140945b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f140946c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f140947d;

    /* renamed from: e */
    public static final /* synthetic */ int[] f140948e;

    /* renamed from: f */
    public static final /* synthetic */ int[] f140949f;

    static {
        int[] iArr = new int[TodoOperationContent.Type.values().length];
        f140944a = iArr;
        iArr[TodoOperationContent.Type.CREATE.ordinal()] = 1;
        iArr[TodoOperationContent.Type.ASSIGN.ordinal()] = 2;
        iArr[TodoOperationContent.Type.COMPLETE.ordinal()] = 3;
        iArr[TodoOperationContent.Type.INCOMPLETE.ordinal()] = 4;
        iArr[TodoOperationContent.Type.DELETE.ordinal()] = 5;
        iArr[TodoOperationContent.Type.SHARE.ordinal()] = 6;
        iArr[TodoOperationContent.Type.FOLLOW.ordinal()] = 7;
        iArr[TodoOperationContent.Type.CANCEL.ordinal()] = 8;
        iArr[TodoOperationContent.Type.UNFOLLOW.ordinal()] = 9;
        iArr[TodoOperationContent.Type.COMPLETE_ASSIGNEE.ordinal()] = 10;
        iArr[TodoOperationContent.Type.COMPLETE_SELF.ordinal()] = 11;
        iArr[TodoOperationContent.Type.RESTORE_ASSIGNEE.ordinal()] = 12;
        iArr[TodoOperationContent.Type.RESTORE_SELF.ordinal()] = 13;
        int[] iArr2 = new int[TodoOperationContent.CompleteType.values().length];
        f140945b = iArr2;
        iArr2[TodoOperationContent.CompleteType.COMPLETE_WHOLE_TODO.ordinal()] = 1;
        iArr2[TodoOperationContent.CompleteType.COMPLETE_WHOLE_TODO_AFTER_REMOVE_ASSIGNEE_SELF.ordinal()] = 2;
        iArr2[TodoOperationContent.CompleteType.COMPLETE_WHOLE_TODO_AFTER_REMOVE_ASSIGNEES.ordinal()] = 3;
        iArr2[TodoOperationContent.CompleteType.COMPLETE_WHOLE_TODO_AFTER_REMOVE_ASSIGNEE_YOURSELF.ordinal()] = 4;
        iArr2[TodoOperationContent.CompleteType.COMPLETE_WHOLE_TODO_AFTER_COMPLETE_ASSIGNEES.ordinal()] = 5;
        iArr2[TodoOperationContent.CompleteType.COMPLETE_WHOLE_TODO_AFTER_COMPLETE_ASSIGNEE_YOURSELF.ordinal()] = 6;
        int[] iArr3 = new int[TodoOperationContent.CompleteType.values().length];
        f140946c = iArr3;
        iArr3[TodoOperationContent.CompleteType.RESTORE_WHOLE_TODO.ordinal()] = 1;
        iArr3[TodoOperationContent.CompleteType.RESTORE_WHOLE_TODO_AFTER_ADD_ASSIGNEE_SELF.ordinal()] = 2;
        iArr3[TodoOperationContent.CompleteType.RESTORE_WHOLE_TODO_AFTER_ADD_ASSIGNEES.ordinal()] = 3;
        iArr3[TodoOperationContent.CompleteType.RESTORE_WHOLE_TODO_AFTER_ADD_ASSIGNEES_YOURSELF.ordinal()] = 4;
        iArr3[TodoOperationContent.CompleteType.RESTORE_WHOLE_TODO_AFTER_RESTORE_SELF.ordinal()] = 5;
        iArr3[TodoOperationContent.CompleteType.RESTORE_WHOLE_TODO_AFTER_RESTORE_ASSIGNEE.ordinal()] = 6;
        iArr3[TodoOperationContent.CompleteType.RESTORE_WHOLE_TODO_AFTER_RESTORE_ASSIGNEE_YOURSELF.ordinal()] = 7;
        int[] iArr4 = new int[TodoOperationContent.Type.values().length];
        f140947d = iArr4;
        iArr4[TodoOperationContent.Type.DELETE.ordinal()] = 1;
        iArr4[TodoOperationContent.Type.CANCEL.ordinal()] = 2;
        int[] iArr5 = new int[MultiCompleteHelper.MultiCompleteType.values().length];
        f140948e = iArr5;
        iArr5[MultiCompleteHelper.MultiCompleteType.COMPLETE_USER.ordinal()] = 1;
        iArr5[MultiCompleteHelper.MultiCompleteType.COMPLETE_TODO_WITH_DIALOG.ordinal()] = 2;
        int[] iArr6 = new int[MultiCompleteHelper.MultiCompleteType.values().length];
        f140949f = iArr6;
        iArr6[MultiCompleteHelper.MultiCompleteType.COMPLETE_USER.ordinal()] = 1;
        iArr6[MultiCompleteHelper.MultiCompleteType.COMPLETE_TODO_WITH_DIALOG.ordinal()] = 2;
    }
}
