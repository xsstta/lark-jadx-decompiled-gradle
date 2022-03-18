package com.ss.android.lark.calendar.impl.features.calendarview.days.drag;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DragDrawChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.event.DayDragEndEvent;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.event.DayDragMoveEvent;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.event.DayDragStartEvent;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.helper.PiecesLongClickTrigger;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.DayChipsLayer;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31133b;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31136e;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31138g;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31142k;
import com.ss.android.lark.calendar.impl.utils.am;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012J\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0011H\u0002J\"\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0011H\u0014J\"\u0010!\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0011H\u0014J\u0012\u0010#\u001a\u00020$2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0014J&\u0010%\u001a\u00020$2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\b\u0010(\u001a\u00020\u0017H\u0016J\u001a\u0010)\u001a\u00020\u00172\b\u0010*\u001a\u0004\u0018\u00010\f2\u0006\u0010+\u001a\u00020\u0006H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00120\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/PiecesDragger;", "Lcom/ss/android/lark/calendar/impl/features/common/dragger/Dragger;", "window", "Landroid/view/Window;", "(Landroid/view/Window;)V", "currentDragData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DragDrawChipViewData;", "getCurrentDragData", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DragDrawChipViewData;", "setCurrentDragData", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DragDrawChipViewData;)V", "currentParent", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/DayChipsLayer;", "longClickTrigger", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/helper/PiecesLongClickTrigger;", "mDayChipsLayerData", "Ljava/util/HashMap;", "Landroid/view/View;", "Ljava/util/ArrayList;", "addDragTarget", "dayChipsLayer", "enableChips", "clearCurrentDragData", "", "getChipOfTouch", "v", "getDragEndEvent", "Lcom/ss/android/lark/calendar/impl/features/common/dragger/DragEndEvent;", "position", "Landroid/graphics/Point;", "event", "Landroid/view/MotionEvent;", "watcher", "getDragMoveEvent", "Lcom/ss/android/lark/calendar/impl/features/common/dragger/DragMoveEvent;", "onLongClick", "", "onTouch", "originOnTouchListener", "Landroid/view/View$OnTouchListener;", "release", "triggerDrag", "targetView", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.b */
public final class PiecesDragger extends C31142k {

    /* renamed from: l */
    private final PiecesLongClickTrigger f77236l = new PiecesLongClickTrigger();

    /* renamed from: m */
    private HashMap<View, ArrayList<DragDrawChipViewData>> f77237m = new HashMap<>();

    /* renamed from: n */
    private DayChipsLayer f77238n;

    /* renamed from: o */
    private volatile DragDrawChipViewData f77239o;

    /* renamed from: a */
    public final DragDrawChipViewData mo111193a() {
        return this.f77239o;
    }

    /* renamed from: b */
    public final void mo111200b() {
        this.f77239o = null;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.dragger.C31142k
    /* renamed from: c */
    public void mo111201c() {
        super.mo111201c();
        this.f77237m.clear();
        this.f77238n = null;
        this.f77239o = null;
    }

    /* renamed from: a */
    public final void mo111196a(DragDrawChipViewData eVar) {
        this.f77239o = eVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PiecesDragger(Window window) {
        super(window);
        Intrinsics.checkParameterIsNotNull(window, "window");
    }

    /* renamed from: g */
    private final DragDrawChipViewData m114581g(View view) {
        ArrayList<DragDrawChipViewData> arrayList = this.f77237m.get(view);
        if (arrayList != null) {
            Intrinsics.checkExpressionValueIsNotNull(arrayList, "mDayChipsLayerData[v] ?: return null");
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                DragDrawChipViewData eVar = arrayList.get(size);
                Intrinsics.checkExpressionValueIsNotNull(eVar, "data[i]");
                DragDrawChipViewData eVar2 = eVar;
                if (this.f78659a < eVar2.mo110978k() && this.f78659a > eVar2.mo110977j() && this.f78660b > eVar2.mo110976i() && this.f78660b < eVar2.mo110979l()) {
                    return eVar2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.common.dragger.C31142k
    /* renamed from: a */
    public boolean mo111197a(View view) {
        DragDrawChipViewData g;
        View view2;
        if (!(!this.f77236l.mo111209a(view) || view == null || (g = m114581g(view)) == null)) {
            if (!(view instanceof DayChipsLayer)) {
                view2 = null;
            } else {
                view2 = view;
            }
            DayChipsLayer dayChipsLayer = (DayChipsLayer) view2;
            if (dayChipsLayer != null) {
                this.f77238n = dayChipsLayer;
                this.f78663e = this.f78659a - g.mo110977j();
                this.f78664f = this.f78660b - g.mo110976i();
                g.mo110966c(false);
                if (g.mo110970e() != 0) {
                    DayChipsLayer dayChipsLayer2 = (DayChipsLayer) view;
                    am.m125208a(dayChipsLayer2.getContext(), (long) 80);
                    int e = g.mo110970e();
                    int i = R.string.Calendar_Edit_PermissonErrorTip;
                    if (e != 1 && e == 2) {
                        i = R.string.Calendar_Edit_DragCrossDayEventTip;
                    }
                    LKUIToast.show(dayChipsLayer2.getContext(), i);
                } else {
                    this.f77239o = g;
                    m114580a((DayChipsLayer) view, g);
                    g.mo110964b(true);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m114580a(DayChipsLayer dayChipsLayer, DragDrawChipViewData eVar) {
        if (mo112794e()) {
            this.f78667i = eVar.mo110972f();
            this.f78668j = this.f78669k;
            int round = Math.round(this.f78661c);
            int round2 = Math.round(this.f78662d);
            View b = mo112787b(round, round2);
            Point a = mo112781a(round, round2);
            mo112786a(C31138g.class, new DayDragStartEvent((float) a.x, (float) a.y, this.f78661c, this.f78662d, this.f78663e, this.f78664f, dayChipsLayer, eVar, dayChipsLayer, this.f78666h, b));
        }
    }

    /* renamed from: a */
    public final C31142k mo111195a(DayChipsLayer dayChipsLayer, ArrayList<DragDrawChipViewData> arrayList) {
        Intrinsics.checkParameterIsNotNull(dayChipsLayer, "dayChipsLayer");
        Intrinsics.checkParameterIsNotNull(arrayList, "enableChips");
        this.f78669k = DragTargetOptionBuilder.m114600a(DragTargetOptionBuilder.Style.LONG_PRESS_NO_DRAG_EXIT_HINT);
        this.f78669k.mo112766a(true);
        if (this.f77237m.containsKey(dayChipsLayer)) {
            this.f77237m.put(dayChipsLayer, arrayList);
        } else {
            this.f77237m.put(dayChipsLayer, arrayList);
            mo112793e(dayChipsLayer);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.common.dragger.C31142k
    /* renamed from: a */
    public boolean mo111198a(View view, MotionEvent motionEvent, View.OnTouchListener onTouchListener) {
        if (motionEvent != null) {
            this.f77236l.mo111208a(motionEvent, view);
        }
        return mo112789b(view, motionEvent, onTouchListener);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.common.dragger.C31142k
    /* renamed from: a */
    public C31136e mo111194a(Point point, MotionEvent motionEvent, View view) {
        Intrinsics.checkParameterIsNotNull(point, "position");
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        return new DayDragMoveEvent((float) point.x, (float) point.y, (float) Math.round(motionEvent.getRawX()), (float) Math.round(motionEvent.getRawY()), this.f78663e, this.f78664f, this.f78667i, this.f77239o, this.f77238n, this.f78666h, view);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.common.dragger.C31142k
    /* renamed from: b */
    public C31133b mo111199b(Point point, MotionEvent motionEvent, View view) {
        Intrinsics.checkParameterIsNotNull(point, "position");
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        return new DayDragEndEvent((float) point.x, (float) point.y, motionEvent.getRawX(), motionEvent.getRawY(), this.f78663e, this.f78664f, this.f78667i, this.f77239o, this.f77238n, this.f78666h, view);
    }
}
