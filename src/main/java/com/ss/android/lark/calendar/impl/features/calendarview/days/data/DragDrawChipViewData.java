package com.ss.android.lark.calendar.impl.features.calendarview.days.data;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.DelayClickerTarget;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.PiecesClickTarget;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0006\u0010\u001a\u001a\u00020\tJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0006\u0010\u001f\u001a\u00020\tJ\u0006\u0010 \u001a\u00020\tJ\u0006\u0010!\u001a\u00020\tJ\u0006\u0010\"\u001a\u00020\tJ\u0006\u0010#\u001a\u00020\tJ\u0006\u0010$\u001a\u00020\tJ\b\u0010%\u001a\u00020\tH\u0016J\b\u0010&\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0006\u0010'\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ&\u0010(\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tJ\u0010\u0010)\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\fH\u0016J\u000e\u0010*\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010+\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\fJ\u0010\u0010,\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010-\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DragDrawChipViewData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/DelayClickerTarget;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/PiecesClickTarget;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;)V", "getData", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "forbiddenType", "", "height", "isInDragMode", "", "isOnClick", "isRemoved", "left", "mIsDragging", "top", "width", "drawSelf", "", "canvas", "Landroid/graphics/Canvas;", "equals", "other", "", "getBottom", "getChipBitmap", "Landroid/graphics/Bitmap;", "getEventChipView", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/EventChipView;", "getForbiddenType", "getHeight", "getLeft", "getRight", "getTop", "getWidth", "hashCode", "isEnableClick", "isOnDrag", "setChipSize", "setEnableClick", "setForbiddenType", "setIsRemoved", "setOnClick", "setOnDrag", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a.e */
public final class DragDrawChipViewData implements DelayClickerTarget, PiecesClickTarget {

    /* renamed from: a */
    public static final Companion f77030a = new Companion(null);

    /* renamed from: b */
    private boolean f77031b;

    /* renamed from: c */
    private boolean f77032c;

    /* renamed from: d */
    private boolean f77033d;

    /* renamed from: e */
    private boolean f77034e;

    /* renamed from: f */
    private int f77035f;

    /* renamed from: g */
    private int f77036g;

    /* renamed from: h */
    private int f77037h;

    /* renamed from: i */
    private int f77038i;

    /* renamed from: j */
    private int f77039j;

    /* renamed from: k */
    private final DayEventChipViewData f77040k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DragDrawChipViewData$Companion;", "", "()V", "FORBIDDEN_TYPE_CROSS_DAY", "", "FORBIDDEN_TYPE_NOT_FORBIDDEN", "FORBIDDEN_TYPE_NO_PERMISSION", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final boolean mo110965b() {
        return this.f77033d;
    }

    /* renamed from: e */
    public final int mo110970e() {
        return this.f77035f;
    }

    /* renamed from: g */
    public final int mo110973g() {
        return this.f77038i;
    }

    /* renamed from: h */
    public final int mo110974h() {
        return this.f77039j;
    }

    /* renamed from: i */
    public final int mo110976i() {
        return this.f77036g;
    }

    /* renamed from: j */
    public final int mo110977j() {
        return this.f77037h;
    }

    /* renamed from: n */
    public final DayEventChipViewData mo110981n() {
        return this.f77040k;
    }

    /* renamed from: d */
    public final boolean mo110969d() {
        return this.f77034e;
    }

    /* renamed from: f */
    public final EventChipView mo110972f() {
        return this.f77040k.getChipView();
    }

    /* renamed from: k */
    public final int mo110978k() {
        return this.f77037h + this.f77038i;
    }

    /* renamed from: l */
    public final int mo110979l() {
        return this.f77036g + this.f77039j;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.PiecesClickTarget
    /* renamed from: c */
    public boolean mo110967c() {
        return !this.f77032c;
    }

    /* renamed from: m */
    public final Bitmap mo110980m() {
        EventChipView chipView = this.f77040k.getChipView();
        if (chipView != null) {
            return chipView.mo112553a();
        }
        return null;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.DelayClickerTarget
    /* renamed from: a */
    public boolean mo110963a() {
        return this.f77031b;
    }

    public int hashCode() {
        CalendarEventInstance calendarEventInstance = this.f77040k.getCalendarEventInstance();
        Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance, "data.calendarEventInstance");
        CalendarEventInstance calendarEventInstance2 = this.f77040k.getCalendarEventInstance();
        Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance2, "data.calendarEventInstance");
        CalendarEventInstance calendarEventInstance3 = this.f77040k.getCalendarEventInstance();
        Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance3, "data.calendarEventInstance");
        CalendarEventInstance calendarEventInstance4 = this.f77040k.getCalendarEventInstance();
        Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance4, "data.calendarEventInstance");
        return Objects.hash(calendarEventInstance.getCalendarId(), Long.valueOf(calendarEventInstance2.getOriginalTime()), calendarEventInstance3.getKey(), Long.valueOf(calendarEventInstance4.getStartTime()));
    }

    /* renamed from: a */
    public final void mo110959a(int i) {
        this.f77035f = i;
    }

    /* renamed from: d */
    public final void mo110968d(boolean z) {
        this.f77034e = z;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.DelayClickerTarget
    /* renamed from: a */
    public void mo110962a(boolean z) {
        this.f77031b = z;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.PiecesClickTarget
    /* renamed from: c */
    public void mo110966c(boolean z) {
        this.f77032c = !z;
    }

    public DragDrawChipViewData(DayEventChipViewData dayEventChipViewData) {
        Intrinsics.checkParameterIsNotNull(dayEventChipViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f77040k = dayEventChipViewData;
    }

    /* renamed from: a */
    public final void mo110961a(Canvas canvas) {
        EventChipView chipView;
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (!mo110969d() && (chipView = this.f77040k.getChipView()) != null) {
            chipView.mo112556a(canvas);
        }
    }

    /* renamed from: b */
    public final void mo110964b(boolean z) {
        this.f77033d = z;
        if (z) {
            EventChipView chipView = this.f77040k.getChipView();
            if (chipView != null) {
                chipView.mo112561c();
                return;
            }
            return;
        }
        EventChipView chipView2 = this.f77040k.getChipView();
        if (chipView2 != null) {
            chipView2.mo112563d();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DragDrawChipViewData)) {
            return false;
        }
        CalendarEventInstance calendarEventInstance = this.f77040k.getCalendarEventInstance();
        Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance, "data.calendarEventInstance");
        String calendarId = calendarEventInstance.getCalendarId();
        DragDrawChipViewData eVar = (DragDrawChipViewData) obj;
        CalendarEventInstance calendarEventInstance2 = eVar.f77040k.getCalendarEventInstance();
        Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance2, "other.data.calendarEventInstance");
        if (!Intrinsics.areEqual(calendarId, calendarEventInstance2.getCalendarId())) {
            return false;
        }
        CalendarEventInstance calendarEventInstance3 = this.f77040k.getCalendarEventInstance();
        Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance3, "data.calendarEventInstance");
        long originalTime = calendarEventInstance3.getOriginalTime();
        CalendarEventInstance calendarEventInstance4 = eVar.f77040k.getCalendarEventInstance();
        Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance4, "other.data.calendarEventInstance");
        if (originalTime != calendarEventInstance4.getOriginalTime()) {
            return false;
        }
        CalendarEventInstance calendarEventInstance5 = this.f77040k.getCalendarEventInstance();
        Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance5, "data.calendarEventInstance");
        String key = calendarEventInstance5.getKey();
        CalendarEventInstance calendarEventInstance6 = eVar.f77040k.getCalendarEventInstance();
        Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance6, "other.data.calendarEventInstance");
        if (!Intrinsics.areEqual(key, calendarEventInstance6.getKey())) {
            return false;
        }
        CalendarEventInstance calendarEventInstance7 = this.f77040k.getCalendarEventInstance();
        Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance7, "data.calendarEventInstance");
        long startTime = calendarEventInstance7.getStartTime();
        CalendarEventInstance calendarEventInstance8 = eVar.f77040k.getCalendarEventInstance();
        Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance8, "other.data.calendarEventInstance");
        if (startTime == calendarEventInstance8.getStartTime()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo110960a(int i, int i2, int i3, int i4) {
        if (i > 0) {
            this.f77038i = i;
        }
        if (i2 > 0) {
            this.f77039j = i2;
        }
        this.f77037h = i3;
        this.f77036g = i4;
    }
}
