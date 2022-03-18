package com.ss.android.lark.todo.impl.features.mainview.widget;

import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.b */
public final /* synthetic */ class C56936b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f140518a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f140519b;

    static {
        int[] iArr = new int[TodoFilterType.values().length];
        f140518a = iArr;
        iArr[TodoFilterType.ALL.ordinal()] = 1;
        iArr[TodoFilterType.ASSIGN_TO_ME.ordinal()] = 2;
        iArr[TodoFilterType.ASSIGN_FROM_ME.ordinal()] = 3;
        iArr[TodoFilterType.FOLLOWED.ordinal()] = 4;
        iArr[TodoFilterType.COMPLETED.ordinal()] = 5;
        iArr[TodoFilterType.FROM_DOCS.ordinal()] = 6;
        int[] iArr2 = new int[TodoFilterType.values().length];
        f140519b = iArr2;
        iArr2[TodoFilterType.ALL.ordinal()] = 1;
        iArr2[TodoFilterType.ASSIGN_TO_ME.ordinal()] = 2;
        iArr2[TodoFilterType.ASSIGN_FROM_ME.ordinal()] = 3;
        iArr2[TodoFilterType.FOLLOWED.ordinal()] = 4;
        iArr2[TodoFilterType.COMPLETED.ordinal()] = 5;
        iArr2[TodoFilterType.FROM_DOCS.ordinal()] = 6;
    }
}
