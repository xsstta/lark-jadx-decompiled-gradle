package com.ss.android.lark.calendar.impl.features.meetingroom.instance.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30745a;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.AbsDaysLayoutManager;
import com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomLayoutParam;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/widget/InstancesLayoutManager;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/AbsDaysLayoutManager;", "parent", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "mRoomLayoutParam", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/RoomLayoutParam;", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/RoomLayoutParam;)V", "mDragLayer", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/draglayer/ChipsDragLayer;", "getParent", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "addDragLayer", "", "dragLayer", "drawChild", "canvas", "Landroid/graphics/Canvas;", "drawTime", "", "layoutChild", "offsetX", "", "offsetY", "notifyLayerDayChanged", "leftLayerDay", "scrollDx", "dx", "scrollDy", "dy", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.widget.a */
public final class InstancesLayoutManager extends AbsDaysLayoutManager {

    /* renamed from: b */
    public static final Companion f82138b = new Companion(null);

    /* renamed from: c */
    private C30745a f82139c;

    /* renamed from: d */
    private final SnapScrollView f82140d;

    /* renamed from: e */
    private final RoomLayoutParam f82141e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/widget/InstancesLayoutManager$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.widget.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.AbsDaysLayoutManager
    /* renamed from: a */
    public SnapScrollView mo113316a() {
        return this.f82140d;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.AbsDaysLayoutManager
    /* renamed from: a */
    public void mo113317a(int i) {
        C30745a aVar = this.f82139c;
        if (aVar != null) {
            aVar.setDate(i);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.AbsDaysLayoutManager, com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: b */
    public void mo111063b(int i) {
        super.mo111063b(i);
        C30745a aVar = this.f82139c;
        if (aVar != null) {
            aVar.mo111148a(i);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.AbsDaysLayoutManager, com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: c */
    public void mo111067c(int i) {
        super.mo111067c(i);
        C30745a aVar = this.f82139c;
        if (aVar != null) {
            aVar.offsetTopAndBottom(i);
        }
    }

    /* renamed from: a */
    public final void mo117216a(C30745a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dragLayer");
        this.f82139c = aVar;
        mo113316a().mo113223a(aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstancesLayoutManager(SnapScrollView snapScrollView, RoomLayoutParam eVar) {
        super(snapScrollView, eVar.mo117199j());
        Intrinsics.checkParameterIsNotNull(snapScrollView, "parent");
        Intrinsics.checkParameterIsNotNull(eVar, "mRoomLayoutParam");
        this.f82140d = snapScrollView;
        this.f82141e = eVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.AbsDaysLayoutManager, com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: a */
    public void mo111054a(Canvas canvas, long j) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.mo111054a(canvas, j);
        Rect f = this.f82141e.mo117199j().mo113328f();
        if (f != null) {
            int save = canvas.save();
            canvas.clipRect(f);
            mo113316a().mo113225a(canvas, this.f82139c, j);
            canvas.restoreToCount(save);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.AbsDaysLayoutManager, com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: b */
    public void mo111064b(int i, int i2) {
        int f = this.f82141e.mo117195f();
        int d = this.f82141e.mo117193d();
        int b = this.f82141e.mo117191b();
        int a = this.f82141e.mo117189a();
        int d2 = this.f82141e.mo117199j().mo113326d();
        if (f > 0) {
            super.mo111064b(i, i2);
            C30745a aVar = this.f82139c;
            if (aVar != null) {
                aVar.layout(a, d2 + i2, d, b + d2 + i2);
            }
        }
    }
}
