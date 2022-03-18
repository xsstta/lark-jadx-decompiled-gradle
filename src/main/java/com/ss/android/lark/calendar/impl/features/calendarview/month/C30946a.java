package com.ss.android.lark.calendar.impl.features.calendarview.month;

import com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.a */
public final /* synthetic */ class C30946a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f77955a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f77956b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f77957c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f77958d;

    static {
        int[] iArr = new int[IMonthDiagramContract.OperationType.values().length];
        f77955a = iArr;
        iArr[IMonthDiagramContract.OperationType.SCROLL.ordinal()] = 1;
        iArr[IMonthDiagramContract.OperationType.INIT.ordinal()] = 2;
        iArr[IMonthDiagramContract.OperationType.MOVE_TODAY.ordinal()] = 3;
        int[] iArr2 = new int[IMonthDiagramContract.PagePosition.values().length];
        f77956b = iArr2;
        iArr2[IMonthDiagramContract.PagePosition.LEFT.ordinal()] = 1;
        iArr2[IMonthDiagramContract.PagePosition.RIGHT.ordinal()] = 2;
        int[] iArr3 = new int[IMonthDiagramContract.PagePosition.values().length];
        f77957c = iArr3;
        iArr3[IMonthDiagramContract.PagePosition.LEFT.ordinal()] = 1;
        iArr3[IMonthDiagramContract.PagePosition.CENTER.ordinal()] = 2;
        int[] iArr4 = new int[IMonthDiagramContract.PagePosition.values().length];
        f77958d = iArr4;
        iArr4[IMonthDiagramContract.PagePosition.LEFT.ordinal()] = 1;
        iArr4[IMonthDiagramContract.PagePosition.CENTER.ordinal()] = 2;
    }
}
