package com.ss.android.lark.todo.impl.framework.p2842c.p2844b;

import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoSceneType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.framework.c.b.d */
public final /* synthetic */ class C57209d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f141074a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f141075b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f141076c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f141077d;

    static {
        int[] iArr = new int[TodoFilterType.values().length];
        f141074a = iArr;
        iArr[TodoFilterType.ALL.ordinal()] = 1;
        iArr[TodoFilterType.ASSIGN_FROM_ME.ordinal()] = 2;
        iArr[TodoFilterType.ASSIGN_TO_ME.ordinal()] = 3;
        iArr[TodoFilterType.FOLLOWED.ordinal()] = 4;
        iArr[TodoFilterType.COMPLETED.ordinal()] = 5;
        int[] iArr2 = new int[TodoListView.Type.values().length];
        f141075b = iArr2;
        iArr2[TodoListView.Type.ALL.ordinal()] = 1;
        iArr2[TodoListView.Type.ASSIGN_FROM_ME.ordinal()] = 2;
        iArr2[TodoListView.Type.ASSIGN_TO_ME.ordinal()] = 3;
        iArr2[TodoListView.Type.FOLLOWED.ordinal()] = 4;
        iArr2[TodoListView.Type.COMPLETED.ordinal()] = 5;
        int[] iArr3 = new int[TodoSceneType.values().length];
        f141076c = iArr3;
        iArr3[TodoSceneType.TODO_ALL.ordinal()] = 1;
        iArr3[TodoSceneType.TODO_ASSIGIN_FROM_ME.ordinal()] = 2;
        iArr3[TodoSceneType.TODO_COMPLETED.ordinal()] = 3;
        iArr3[TodoSceneType.TODO_FOLLOWED.ordinal()] = 4;
        iArr3[TodoSceneType.MESSAGE_TOOLBAR.ordinal()] = 5;
        iArr3[TodoSceneType.INPUT_BOX.ordinal()] = 6;
        iArr3[TodoSceneType.SINGLE_MESSAGE.ordinal()] = 7;
        iArr3[TodoSceneType.MULTIPLE_MESSAGES.ordinal()] = 8;
        iArr3[TodoSceneType.MESSAGE_AFTER_FORWARDING.ordinal()] = 9;
        iArr3[TodoSceneType.CHAT_TODO_LIST.ordinal()] = 10;
        int[] iArr4 = new int[TodoSceneType.values().length];
        f141077d = iArr4;
        iArr4[TodoSceneType.SINGLE_MESSAGE.ordinal()] = 1;
        iArr4[TodoSceneType.MULTIPLE_MESSAGES.ordinal()] = 2;
        iArr4[TodoSceneType.MESSAGE_AFTER_FORWARDING.ordinal()] = 3;
    }
}
