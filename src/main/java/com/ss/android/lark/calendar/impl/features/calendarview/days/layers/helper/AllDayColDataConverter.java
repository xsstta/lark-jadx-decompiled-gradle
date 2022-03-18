package com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper;

import com.ss.android.lark.calendar.impl.features.calendarview.days.data.AllDayColumnData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.AllDayEventChipViewData;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0002\u0010\nJ'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/AllDayColDataConverter;", "", "()V", "MAX_EVENT_COUNT_CONTRACT", "", "computeChipMaxRow", "", "columnDataArr", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/AllDayColumnData;", "([Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/AllDayColumnData;)V", "getColumnData", "columnNumber", "chipDataList", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/AllDayEventChipViewData;", "(ILjava/util/List;)[Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/AllDayColumnData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.a.a */
public final class AllDayColDataConverter {

    /* renamed from: a */
    public static final AllDayColDataConverter f77364a = new AllDayColDataConverter();

    private AllDayColDataConverter() {
    }

    /* renamed from: a */
    private final void m114801a(AllDayColumnData[] bVarArr) {
        for (AllDayColumnData bVar : bVarArr) {
            if (bVar.mo110944d() > 0) {
                bVar.mo110938a(3);
            }
            Iterator<AllDayEventChipViewData> it = bVar.mo110945e().iterator();
            while (it.hasNext()) {
                AllDayEventChipViewData next = it.next();
                Intrinsics.checkExpressionValueIsNotNull(next, "showChipData");
                int col = next.getCol() + next.getSpan();
                for (int col2 = next.getCol(); col2 < col; col2++) {
                    if (col2 >= 0 && col2 < bVarArr.length) {
                        AllDayColumnData bVar2 = bVarArr[col2];
                        if (bVar2.mo110937a() < next.getRow() + 1) {
                            bVar2.mo110938a(next.getRow() + 1);
                        }
                    }
                }
            }
        }
        for (AllDayColumnData bVar3 : bVarArr) {
            if (bVar3.mo110940b() < bVar3.mo110937a()) {
                bVar3.mo110941b(bVar3.mo110937a());
            }
            Iterator<AllDayEventChipViewData> it2 = bVar3.mo110946f().iterator();
            while (it2.hasNext()) {
                AllDayEventChipViewData next2 = it2.next();
                Intrinsics.checkExpressionValueIsNotNull(next2, "hideData");
                int col3 = next2.getCol() + next2.getSpan();
                for (int col4 = next2.getCol(); col4 < col3; col4++) {
                    if (col4 >= 0 && col4 < bVarArr.length) {
                        AllDayColumnData bVar4 = bVarArr[col4];
                        if (bVar4.mo110940b() < next2.getRow() + 1) {
                            bVar4.mo110941b(next2.getRow() + 1);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final AllDayColumnData[] mo111338a(int i, List<? extends AllDayEventChipViewData> list) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(list, "chipDataList");
        AllDayColumnData[] bVarArr = new AllDayColumnData[i];
        for (int i2 = 0; i2 < i; i2++) {
            bVarArr[i2] = new AllDayColumnData();
        }
        for (AllDayEventChipViewData allDayEventChipViewData : list) {
            int col = allDayEventChipViewData.getCol();
            if (col >= 0 && col < i) {
                AllDayColumnData bVar = bVarArr[col];
                if (allDayEventChipViewData.getRow() >= 2) {
                    bVar.mo110946f().add(allDayEventChipViewData);
                    bVar.mo110942c(bVar.mo110944d() + 1);
                } else {
                    bVar.mo110945e().add(allDayEventChipViewData);
                }
            }
        }
        for (int i3 = 0; i3 < i; i3++) {
            AllDayColumnData bVar2 = bVarArr[i3];
            Iterator<AllDayEventChipViewData> it = bVar2.mo110946f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AllDayEventChipViewData next = it.next();
                Intrinsics.checkExpressionValueIsNotNull(next, "chipData");
                if (next.getSpan() > 1) {
                    if (next.getRow() >= 3) {
                        int col2 = next.getCol() + next.getSpan();
                        for (int col3 = next.getCol() + 1; col3 < col2; col3++) {
                            if (col3 >= 0 && col3 < i) {
                                AllDayColumnData bVar3 = bVarArr[col3];
                                bVar3.mo110942c(bVar3.mo110944d() + 1);
                            }
                        }
                    }
                    if (next.getRow() == 2) {
                        if (bVar2.mo110944d() > 0) {
                            z = false;
                        } else {
                            int col4 = next.getCol() + next.getSpan();
                            z = true;
                            for (int col5 = next.getCol(); col5 < col4; col5++) {
                                if (col5 >= 0 && col5 < i) {
                                    Iterator<T> it2 = bVarArr[col5].mo110946f().iterator();
                                    while (it2.hasNext()) {
                                        if (it2.next().getRow() > next.getRow()) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                        }
                        if (z) {
                            bVar2.mo110946f().remove(next);
                            bVar2.mo110945e().add(next);
                            bVar2.mo110942c(bVar2.mo110944d() - 1);
                            break;
                        }
                        int col6 = next.getCol() + next.getSpan();
                        for (int col7 = next.getCol() + 1; col7 < col6; col7++) {
                            if (col7 >= 0 && col7 < i) {
                                AllDayColumnData bVar4 = bVarArr[col7];
                                bVar4.mo110942c(bVar4.mo110944d() + 1);
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        for (int i4 = 0; i4 < i; i4++) {
            AllDayColumnData bVar5 = bVarArr[i4];
            Iterator<AllDayEventChipViewData> it3 = bVar5.mo110946f().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                AllDayEventChipViewData next2 = it3.next();
                Intrinsics.checkExpressionValueIsNotNull(next2, "chipData");
                if (next2.getSpan() <= 1 && next2.getRow() == 2 && bVar5.mo110944d() == 1) {
                    bVar5.mo110946f().remove(next2);
                    bVar5.mo110945e().add(next2);
                    bVar5.mo110942c(bVar5.mo110944d() - 1);
                    break;
                }
            }
        }
        m114801a(bVarArr);
        return bVarArr;
    }
}
