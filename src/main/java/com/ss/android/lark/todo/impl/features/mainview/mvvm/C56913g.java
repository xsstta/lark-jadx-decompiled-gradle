package com.ss.android.lark.todo.impl.features.mainview.mvvm;

import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.mainview.entity.LoadTitleType;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.g */
public final /* synthetic */ class C56913g {

    /* renamed from: a */
    public static final /* synthetic */ int[] f140467a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f140468b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f140469c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f140470d;

    /* renamed from: e */
    public static final /* synthetic */ int[] f140471e;

    /* renamed from: f */
    public static final /* synthetic */ int[] f140472f;

    /* renamed from: g */
    public static final /* synthetic */ int[] f140473g;

    /* renamed from: h */
    public static final /* synthetic */ int[] f140474h;

    /* renamed from: i */
    public static final /* synthetic */ int[] f140475i;

    /* renamed from: j */
    public static final /* synthetic */ int[] f140476j;

    /* renamed from: k */
    public static final /* synthetic */ int[] f140477k;

    /* renamed from: l */
    public static final /* synthetic */ int[] f140478l;

    /* renamed from: m */
    public static final /* synthetic */ int[] f140479m;

    /* renamed from: n */
    public static final /* synthetic */ int[] f140480n;

    static {
        int[] iArr = new int[TodoFilterType.values().length];
        f140467a = iArr;
        iArr[TodoFilterType.ALL.ordinal()] = 1;
        iArr[TodoFilterType.ASSIGN_FROM_ME.ordinal()] = 2;
        iArr[TodoFilterType.ASSIGN_TO_ME.ordinal()] = 3;
        iArr[TodoFilterType.COMPLETED.ordinal()] = 4;
        iArr[TodoFilterType.FOLLOWED.ordinal()] = 5;
        iArr[TodoFilterType.FROM_DOCS.ordinal()] = 6;
        int[] iArr2 = new int[LoadTitleType.values().length];
        f140468b = iArr2;
        iArr2[LoadTitleType.LOAD_DONE.ordinal()] = 1;
        int[] iArr3 = new int[TodoListView.Type.values().length];
        f140469c = iArr3;
        iArr3[TodoListView.Type.ALL.ordinal()] = 1;
        iArr3[TodoListView.Type.ASSIGN_FROM_ME.ordinal()] = 2;
        iArr3[TodoListView.Type.ASSIGN_TO_ME.ordinal()] = 3;
        iArr3[TodoListView.Type.COMPLETED.ordinal()] = 4;
        iArr3[TodoListView.Type.FOLLOWED.ordinal()] = 5;
        iArr3[TodoListView.Type.FROM_DOC.ordinal()] = 6;
        int[] iArr4 = new int[TodoFilterType.values().length];
        f140470d = iArr4;
        iArr4[TodoFilterType.ALL.ordinal()] = 1;
        iArr4[TodoFilterType.ASSIGN_FROM_ME.ordinal()] = 2;
        iArr4[TodoFilterType.ASSIGN_TO_ME.ordinal()] = 3;
        iArr4[TodoFilterType.FOLLOWED.ordinal()] = 4;
        iArr4[TodoFilterType.FROM_DOCS.ordinal()] = 5;
        int[] iArr5 = new int[TodoListView.Type.values().length];
        f140471e = iArr5;
        iArr5[TodoListView.Type.ALL.ordinal()] = 1;
        iArr5[TodoListView.Type.ASSIGN_FROM_ME.ordinal()] = 2;
        iArr5[TodoListView.Type.ASSIGN_TO_ME.ordinal()] = 3;
        iArr5[TodoListView.Type.FOLLOWED.ordinal()] = 4;
        int[] iArr6 = new int[TodoFilterType.values().length];
        f140472f = iArr6;
        iArr6[TodoFilterType.FROM_DOCS.ordinal()] = 1;
        int[] iArr7 = new int[MultiCompleteHelper.MultiCompleteType.values().length];
        f140473g = iArr7;
        iArr7[MultiCompleteHelper.MultiCompleteType.COMPLETE_USER.ordinal()] = 1;
        iArr7[MultiCompleteHelper.MultiCompleteType.COMPLETE_TODO_WITH_DIALOG.ordinal()] = 2;
        int[] iArr8 = new int[MultiCompleteHelper.MultiCompleteType.values().length];
        f140474h = iArr8;
        iArr8[MultiCompleteHelper.MultiCompleteType.COMPLETE_USER.ordinal()] = 1;
        iArr8[MultiCompleteHelper.MultiCompleteType.COMPLETE_TODO_WITH_DIALOG.ordinal()] = 2;
        int[] iArr9 = new int[TodoDisplayItem.ChangeStatus.values().length];
        f140475i = iArr9;
        iArr9[TodoDisplayItem.ChangeStatus.DELETE.ordinal()] = 1;
        iArr9[TodoDisplayItem.ChangeStatus.QUIT.ordinal()] = 2;
        iArr9[TodoDisplayItem.ChangeStatus.UNFOLLOWED.ordinal()] = 3;
        int[] iArr10 = new int[TodoFilterType.values().length];
        f140476j = iArr10;
        iArr10[TodoFilterType.ALL.ordinal()] = 1;
        iArr10[TodoFilterType.ASSIGN_FROM_ME.ordinal()] = 2;
        iArr10[TodoFilterType.ASSIGN_TO_ME.ordinal()] = 3;
        iArr10[TodoFilterType.FOLLOWED.ordinal()] = 4;
        iArr10[TodoFilterType.COMPLETED.ordinal()] = 5;
        int[] iArr11 = new int[TodoFilterType.values().length];
        f140477k = iArr11;
        iArr11[TodoFilterType.ALL.ordinal()] = 1;
        iArr11[TodoFilterType.ASSIGN_FROM_ME.ordinal()] = 2;
        iArr11[TodoFilterType.ASSIGN_TO_ME.ordinal()] = 3;
        iArr11[TodoFilterType.FOLLOWED.ordinal()] = 4;
        iArr11[TodoFilterType.COMPLETED.ordinal()] = 5;
        int[] iArr12 = new int[TodoFilterType.values().length];
        f140478l = iArr12;
        iArr12[TodoFilterType.ALL.ordinal()] = 1;
        iArr12[TodoFilterType.ASSIGN_FROM_ME.ordinal()] = 2;
        iArr12[TodoFilterType.ASSIGN_TO_ME.ordinal()] = 3;
        iArr12[TodoFilterType.COMPLETED.ordinal()] = 4;
        iArr12[TodoFilterType.FOLLOWED.ordinal()] = 5;
        iArr12[TodoFilterType.FROM_DOCS.ordinal()] = 6;
        int[] iArr13 = new int[TodoListView.Type.values().length];
        f140479m = iArr13;
        iArr13[TodoListView.Type.ALL.ordinal()] = 1;
        iArr13[TodoListView.Type.ASSIGN_FROM_ME.ordinal()] = 2;
        iArr13[TodoListView.Type.ASSIGN_TO_ME.ordinal()] = 3;
        iArr13[TodoListView.Type.COMPLETED.ordinal()] = 4;
        iArr13[TodoListView.Type.FOLLOWED.ordinal()] = 5;
        int[] iArr14 = new int[TodoDisplayItem.TitleType.values().length];
        f140480n = iArr14;
        iArr14[TodoDisplayItem.TitleType.DONE.ordinal()] = 1;
        iArr14[TodoDisplayItem.TitleType.DOING.ordinal()] = 2;
    }
}
