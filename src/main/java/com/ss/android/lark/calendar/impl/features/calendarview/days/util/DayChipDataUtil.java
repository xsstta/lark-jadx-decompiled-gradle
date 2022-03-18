package com.ss.android.lark.calendar.impl.features.calendarview.days.util;

import android.graphics.Rect;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DayChipData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceLayout;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ6\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/util/DayChipDataUtil;", "", "()V", "getLayoutInfo", "Landroid/graphics/Rect;", "dayWidth", "", "topMargin", "heightPerMinute", "", "insLayout", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/InstanceLayout;", "sortDayData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DayChipData;", "Lkotlin/collections/ArrayList;", "selectDay", "dayChipData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d.d */
public final class DayChipDataUtil {

    /* renamed from: a */
    public static final DayChipDataUtil f77184a = new DayChipDataUtil();

    private DayChipDataUtil() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dataB", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DayChipData;", "kotlin.jvm.PlatformType", "dataA", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d.d$a */
    static final class C30744a<T> implements Comparator<DayChipData> {

        /* renamed from: a */
        final /* synthetic */ int f77185a;

        C30744a(int i) {
            this.f77185a = i;
        }

        /* renamed from: a */
        public final int compare(DayChipData cVar, DayChipData cVar2) {
            int a = cVar2.mo110947a() - this.f77185a;
            int a2 = cVar.mo110947a() - this.f77185a;
            if (a >= 0 && a2 >= 0) {
                return a2 - a;
            }
            if (a >= 0) {
                return 1;
            }
            if (a2 >= 0) {
                return -1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    public final ArrayList<DayChipData> mo111137a(int i, ArrayList<DayChipData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "dayChipData");
        CollectionsKt.sortWith(arrayList, new C30744a(i));
        return arrayList;
    }

    /* renamed from: a */
    public final Rect mo111136a(int i, int i2, float f, InstanceLayout instanceLayout) {
        Intrinsics.checkParameterIsNotNull(instanceLayout, "insLayout");
        float width = instanceLayout.getWidth();
        float height = instanceLayout.getHeight();
        float xOffset = instanceLayout.getXOffset();
        float yOffset = instanceLayout.getYOffset();
        int a = C69029a.m265653a(height * 14.4f * f);
        float f2 = (float) (i - 8);
        int a2 = C69029a.m265653a((width / 100.0f) * f2);
        int a3 = C69029a.m265653a((xOffset / 100.0f) * f2);
        int a4 = C69029a.m265653a(yOffset * 14.4f * f) + i2;
        return new Rect(a3, a4, a2 + a3, a + a4);
    }
}
