package com.ss.android.lark.calendar.impl.features.meetingroom.append.p1537a;

import com.ss.android.lark.calendar.impl.features.events.edit.IEditContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.c */
public final /* synthetic */ class C31980c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f81749a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f81750b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f81751c;

    static {
        int[] iArr = new int[IEditContract.RequestBuildingResultType.values().length];
        f81749a = iArr;
        iArr[IEditContract.RequestBuildingResultType.SUCCESS_WITH_DATA.ordinal()] = 1;
        iArr[IEditContract.RequestBuildingResultType.SUCCESS_NO_DATA.ordinal()] = 2;
        int[] iArr2 = new int[IBuildingContract.SelectState.values().length];
        f81750b = iArr2;
        iArr2[IBuildingContract.SelectState.NOT_OPTIONAL.ordinal()] = 1;
        iArr2[IBuildingContract.SelectState.NONE.ordinal()] = 2;
        iArr2[IBuildingContract.SelectState.SELF.ordinal()] = 3;
        int[] iArr3 = new int[IBuildingContract.SelectState.values().length];
        f81751c = iArr3;
        iArr3[IBuildingContract.SelectState.NOT_OPTIONAL.ordinal()] = 1;
        iArr3[IBuildingContract.SelectState.NONE.ordinal()] = 2;
        iArr3[IBuildingContract.SelectState.SELF.ordinal()] = 3;
    }
}
