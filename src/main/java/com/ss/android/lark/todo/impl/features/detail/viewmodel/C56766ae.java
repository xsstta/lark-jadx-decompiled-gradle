package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import com.bytedance.lark.pb.todo.v1.TodoOrigin;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoSceneType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ae */
public final /* synthetic */ class C56766ae {

    /* renamed from: a */
    public static final /* synthetic */ int[] f140152a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f140153b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f140154c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f140155d;

    static {
        int[] iArr = new int[TodoOrigin.Type.values().length];
        f140152a = iArr;
        iArr[TodoOrigin.Type.UNKNOWN.ordinal()] = 1;
        iArr[TodoOrigin.Type.BLOCK.ordinal()] = 2;
        int[] iArr2 = new int[BlockExtra.SceneType.values().length];
        f140153b = iArr2;
        iArr2[BlockExtra.SceneType.MESSAGE_TOOLBAR.ordinal()] = 1;
        iArr2[BlockExtra.SceneType.INPUT_BOX.ordinal()] = 2;
        iArr2[BlockExtra.SceneType.THREAD_MULTI.ordinal()] = 3;
        iArr2[BlockExtra.SceneType.CHAT_MULTI.ordinal()] = 4;
        int[] iArr3 = new int[TodoSource.values().length];
        f140154c = iArr3;
        iArr3[TodoSource.DOC.ordinal()] = 1;
        int[] iArr4 = new int[TodoSceneType.values().length];
        f140155d = iArr4;
        iArr4[TodoSceneType.SINGLE_MESSAGE.ordinal()] = 1;
        iArr4[TodoSceneType.MULTIPLE_MESSAGES.ordinal()] = 2;
        iArr4[TodoSceneType.MESSAGE_AFTER_FORWARDING.ordinal()] = 3;
        iArr4[TodoSceneType.MESSAGE_TOOLBAR.ordinal()] = 4;
        iArr4[TodoSceneType.INPUT_BOX.ordinal()] = 5;
        iArr4[TodoSceneType.CHAT_TODO_LIST.ordinal()] = 6;
        iArr4[TodoSceneType.TODO_ALL.ordinal()] = 7;
        iArr4[TodoSceneType.TODO_ASSIGIN_FROM_ME.ordinal()] = 8;
        iArr4[TodoSceneType.TODO_ASSIGN_TO_ME.ordinal()] = 9;
        iArr4[TodoSceneType.TODO_COMPLETED.ordinal()] = 10;
        iArr4[TodoSceneType.TODO_FOLLOWED.ordinal()] = 11;
        iArr4[TodoSceneType.TODO_FROM_DOCS.ordinal()] = 12;
        iArr4[TodoSceneType.TODO_UNDEFINED.ordinal()] = 13;
    }
}
