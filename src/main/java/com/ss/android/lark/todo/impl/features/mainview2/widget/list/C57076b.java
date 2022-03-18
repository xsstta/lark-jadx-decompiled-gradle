package com.ss.android.lark.todo.impl.features.mainview2.widget.list;

import com.bytedance.lark.pb.todo.v1.TodoSortType;
import com.ss.android.lark.todo.impl.features.mainview.entity.LoadTitleType;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.b */
public final /* synthetic */ class C57076b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f140754a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f140755b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f140756c;

    static {
        int[] iArr = new int[LoadTitleType.values().length];
        f140754a = iArr;
        iArr[LoadTitleType.LOAD_DONE.ordinal()] = 1;
        int[] iArr2 = new int[TodoItemViewData.TitleType.values().length];
        f140755b = iArr2;
        iArr2[TodoItemViewData.TitleType.DONE.ordinal()] = 1;
        iArr2[TodoItemViewData.TitleType.DOING.ordinal()] = 2;
        int[] iArr3 = new int[TodoSortType.values().length];
        f140756c = iArr3;
        iArr3[TodoSortType.CREATE_TIME.ordinal()] = 1;
        iArr3[TodoSortType.DUE_TIME.ordinal()] = 2;
    }
}
