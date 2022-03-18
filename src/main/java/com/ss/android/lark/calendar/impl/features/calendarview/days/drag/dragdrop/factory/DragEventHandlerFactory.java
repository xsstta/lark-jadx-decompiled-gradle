package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.factory;

import android.view.View;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b.C30758b;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b.C30759c;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b.C30761e;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.C30763a;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.C30769b;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.C30770c;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.C30771d;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.C30772e;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a.AbstractC30766c;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.DayChipsLayer;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;
import com.ss.android.lark.calendar.impl.features.common.dragger.AbstractC31134c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/dragdrop/factory/DragEventHandlerFactory;", "", "()V", "createMultiDragEventHandler", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/dragdrop/handler/base/IDragEventHandler;", "dragEvent", "Lcom/ss/android/lark/calendar/impl/features/common/dragger/DragEvent;", "createSingleDragEventHandler", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.a.a */
public final class DragEventHandlerFactory {

    /* renamed from: a */
    public static final DragEventHandlerFactory f77253a = new DragEventHandlerFactory();

    private DragEventHandlerFactory() {
    }

    /* renamed from: a */
    public final AbstractC30766c<?> mo111210a(AbstractC31134c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "dragEvent");
        View k = cVar.mo112759k();
        if (k instanceof DayChipsLayer) {
            return new C30770c(false);
        }
        if (k instanceof EventChipView) {
            return new C30770c(false);
        }
        if (k instanceof C30758b) {
            return new C30769b(false);
        }
        if (k instanceof C30761e) {
            return new C30772e();
        }
        if (k instanceof C30759c) {
            return new C30763a();
        }
        return new C30771d(false);
    }
}
