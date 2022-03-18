package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop;

import android.graphics.Color;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31139h;
import com.ss.android.lark.calendar.impl.features.common.dragger.DragTriggerAction;

public class DragTargetOptionBuilder {

    public enum Style {
        DEFAULT_STYLE,
        TOUCH_DOWN_NO_DRAG_VIEW,
        TOUCH_DOWN_SHOW_DRAG_VIEW,
        LONG_PRESS_NO_DRAG_EXIT_HINT
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder$1 */
    public static /* synthetic */ class C307551 {

        /* renamed from: a */
        static final /* synthetic */ int[] f77252a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder$Style[] r0 = com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder.Style.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder.C307551.f77252a = r0
                com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder$Style r1 = com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder.Style.TOUCH_DOWN_NO_DRAG_VIEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder.C307551.f77252a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder$Style r1 = com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder.Style.TOUCH_DOWN_SHOW_DRAG_VIEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder.C307551.f77252a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder$Style r1 = com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder.Style.LONG_PRESS_NO_DRAG_EXIT_HINT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder.C307551.f77252a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder$Style r1 = com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder.Style.DEFAULT_STYLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder.C307551.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C31139h m114600a(Style style) {
        C31139h hVar = new C31139h();
        int i = C307551.f77252a[style.ordinal()];
        if (i == 1) {
            hVar.mo112765a(DragTriggerAction.TOUCH_DOWN).mo112766a(false);
        } else if (i == 2) {
            hVar.mo112765a(DragTriggerAction.TOUCH_DOWN).mo112766a(true).mo112764a(0);
        } else if (i == 3) {
            hVar.mo112765a(DragTriggerAction.LONG_PRESS).mo112766a(false).mo112764a(0).mo112767a(0.6f);
        } else if (i == 4) {
            hVar.mo112765a(DragTriggerAction.LONG_PRESS).mo112766a(false).mo112764a(Color.argb(238, 193, 193, 193));
        }
        return hVar;
    }
}
