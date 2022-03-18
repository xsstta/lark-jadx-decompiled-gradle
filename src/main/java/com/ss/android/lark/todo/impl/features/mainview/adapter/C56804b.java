package com.ss.android.lark.todo.impl.features.mainview.adapter;

import com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.adapter.b */
public final /* synthetic */ class C56804b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f140251a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f140252b;

    static {
        int[] iArr = new int[TodoDisplayItem.ChangeStatus.values().length];
        f140251a = iArr;
        iArr[TodoDisplayItem.ChangeStatus.DELETE.ordinal()] = 1;
        iArr[TodoDisplayItem.ChangeStatus.QUIT.ordinal()] = 2;
        iArr[TodoDisplayItem.ChangeStatus.UNFOLLOWED.ordinal()] = 3;
        int[] iArr2 = new int[TodoDisplayItem.ChangeStatus.values().length];
        f140252b = iArr2;
        iArr2[TodoDisplayItem.ChangeStatus.DELETE.ordinal()] = 1;
        iArr2[TodoDisplayItem.ChangeStatus.QUIT.ordinal()] = 2;
        iArr2[TodoDisplayItem.ChangeStatus.UNFOLLOWED.ordinal()] = 3;
    }
}
