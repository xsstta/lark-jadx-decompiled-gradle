package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom;

import com.ss.android.lark.calendar.impl.features.events.edit.IEditContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.f */
public final /* synthetic */ class C31774f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f80841a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f80842b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f80843c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f80844d;

    static {
        int[] iArr = new int[IEditContract.RequestBuildingResultType.values().length];
        f80841a = iArr;
        iArr[IEditContract.RequestBuildingResultType.NO_RESULT.ordinal()] = 1;
        iArr[IEditContract.RequestBuildingResultType.FAILURE.ordinal()] = 2;
        iArr[IEditContract.RequestBuildingResultType.SUCCESS_WITH_DATA.ordinal()] = 3;
        iArr[IEditContract.RequestBuildingResultType.SUCCESS_NO_DATA.ordinal()] = 4;
        int[] iArr2 = new int[IBuildingContract.SelectState.values().length];
        f80842b = iArr2;
        iArr2[IBuildingContract.SelectState.NOT_OPTIONAL.ordinal()] = 1;
        iArr2[IBuildingContract.SelectState.NONE.ordinal()] = 2;
        iArr2[IBuildingContract.SelectState.SELF.ordinal()] = 3;
        int[] iArr3 = new int[IBuildingContract.SelectState.values().length];
        f80843c = iArr3;
        iArr3[IBuildingContract.SelectState.NOT_OPTIONAL.ordinal()] = 1;
        iArr3[IBuildingContract.SelectState.NONE.ordinal()] = 2;
        iArr3[IBuildingContract.SelectState.SELF.ordinal()] = 3;
        int[] iArr4 = new int[IBuildingContract.SelectState.values().length];
        f80844d = iArr4;
        iArr4[IBuildingContract.SelectState.NOT_OPTIONAL.ordinal()] = 1;
        iArr4[IBuildingContract.SelectState.NONE.ordinal()] = 2;
        iArr4[IBuildingContract.SelectState.SELF.ordinal()] = 3;
    }
}
