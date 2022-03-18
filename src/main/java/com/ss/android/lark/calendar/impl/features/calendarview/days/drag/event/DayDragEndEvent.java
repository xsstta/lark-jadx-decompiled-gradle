package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.event;

import android.view.View;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DragDrawChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.DayChipsLayer;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31133b;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31140i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0013J\b\u0010\u0016\u001a\u0004\u0018\u00010\rJ\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/event/DayDragEndEvent;", "Lcom/ss/android/lark/calendar/impl/features/common/dragger/DragEndEvent;", "x", "", "y", "rawX", "rawY", "offsetX", "", "offsetY", "dragTarget", "Landroid/view/View;", "layerChipData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DragDrawChipViewData;", "parent", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/DayChipsLayer;", "dragView", "Lcom/ss/android/lark/calendar/impl/features/common/dragger/DragView;", "watcher", "(FFFFIILandroid/view/View;Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DragDrawChipViewData;Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/DayChipsLayer;Lcom/ss/android/lark/calendar/impl/features/common/dragger/DragView;Landroid/view/View;)V", "mLayerChipData", "mParent", "getLayerChipData", "getParent", "setParent", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.b.a */
public final class DayDragEndEvent extends C31133b {

    /* renamed from: a */
    private DragDrawChipViewData f77240a;

    /* renamed from: b */
    private DayChipsLayer f77241b;

    /* renamed from: a */
    public final DragDrawChipViewData mo111202a() {
        return this.f77240a;
    }

    /* renamed from: b */
    public final DayChipsLayer mo111204b() {
        return this.f77241b;
    }

    /* renamed from: a */
    public final void mo111203a(DayChipsLayer dayChipsLayer) {
        Intrinsics.checkParameterIsNotNull(dayChipsLayer, "parent");
        this.f77241b = dayChipsLayer;
    }

    public DayDragEndEvent(float f, float f2, float f3, float f4, int i, int i2, View view, DragDrawChipViewData eVar, DayChipsLayer dayChipsLayer, C31140i iVar, View view2) {
        super(f, f2, f3, f4, i, i2, view, iVar, view2);
        this.f77240a = eVar;
        this.f77241b = dayChipsLayer;
    }
}
