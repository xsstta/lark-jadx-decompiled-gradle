package com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30166b;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DragDrawChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.util.DayChipDataUtil;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceLayout;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u000eJ\u0018\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0010\u0010\u001a\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tJ\u001e\u0010\u001c\u001a\u00020\u000e2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nR\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/ChipsDataHandler;", "", "layerApi", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/ChipsLayerApi;", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/ChipsLayerApi;)V", "TAG", "", "chipData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DragDrawChipViewData;", "Lkotlin/collections/ArrayList;", "getChipData", "()Ljava/util/ArrayList;", "addChip", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "width", "", "height", "left", "top", "clearChips", "findChip", "x", "", "y", "moveChip", "removedChip", "setChipData", "drawChipData", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.a.c */
public final class ChipsDataHandler {

    /* renamed from: a */
    public static final Companion f77372a = new Companion(null);

    /* renamed from: b */
    private final String f77373b = "ChipsDataHandler";

    /* renamed from: c */
    private final ArrayList<DragDrawChipViewData> f77374c = new ArrayList<>();

    /* renamed from: d */
    private final ChipsLayerApi f77375d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JH\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J*\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/ChipsDataHandler$Companion;", "", "()V", "getDragDrawChipViewData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DragDrawChipViewData;", "Lkotlin/collections/ArrayList;", "chipData", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "chipPool", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/EventChipViewPool;", "dayWidth", "", "chipTopMargin", "oneMinuteHeight", "", "handleCurrentDragData", "currentDragData", "drawChipData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DragDrawChipViewData mo111352a(DragDrawChipViewData eVar, ArrayList<DragDrawChipViewData> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "drawChipData");
            if (eVar != null) {
                Iterator<DragDrawChipViewData> it = arrayList.iterator();
                while (it.hasNext()) {
                    DragDrawChipViewData next = it.next();
                    if (!(!Intrinsics.areEqual(eVar, next))) {
                        next.mo110966c(eVar.mo110967c());
                        next.mo110964b(eVar.mo110965b());
                        EventChipView f = next.mo110972f();
                        if (next.mo110965b()) {
                            if (f != null) {
                                f.mo112561c();
                            }
                        } else if (f != null) {
                            f.mo112563d();
                        }
                        next.mo110968d(eVar.mo110969d());
                        return next;
                    }
                }
            }
            return null;
        }

        /* renamed from: a */
        public final ArrayList<DragDrawChipViewData> mo111353a(List<? extends DayEventChipViewData> list, C30166b bVar, int i, int i2, float f) {
            EventChipView eventChipView;
            ArrayList<DragDrawChipViewData> arrayList = new ArrayList<>();
            if (list != null) {
                for (T t : list) {
                    DragDrawChipViewData eVar = new DragDrawChipViewData(t);
                    arrayList.add(eVar);
                    int i3 = 0;
                    if (bVar == null || (eventChipView = (EventChipView) bVar.mo108795b(0)) == null) {
                        eventChipView = null;
                    } else {
                        DayChipDataUtil dVar = DayChipDataUtil.f77184a;
                        InstanceLayout layout = t.getLayout();
                        Intrinsics.checkExpressionValueIsNotNull(layout, "data.layout");
                        Rect a = dVar.mo111136a(i, i2, f, layout);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a.width(), a.height());
                        layoutParams.topMargin = a.top;
                        layoutParams.leftMargin = a.left;
                        eventChipView.mo112554a(a.width(), a.height(), a.left, a.top);
                        eVar.mo110960a(a.width(), a.height(), a.left, a.top);
                        eventChipView.setLayoutParams(layoutParams);
                        eventChipView.mo112557a(eVar);
                    }
                    t.setChipView(eventChipView);
                    if (!t.isSupportDrag()) {
                        if (t.isCrossDay()) {
                            i3 = 2;
                        } else {
                            i3 = 1;
                        }
                    }
                    eVar.mo110959a(i3);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final ArrayList<DragDrawChipViewData> mo111346a() {
        return this.f77374c;
    }

    /* renamed from: b */
    public final void mo111350b() {
        this.f77374c.clear();
        this.f77375d.mo111329a();
    }

    public ChipsDataHandler(ChipsLayerApi dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "layerApi");
        this.f77375d = dVar;
    }

    /* renamed from: a */
    public final void mo111349a(ArrayList<DragDrawChipViewData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "drawChipData");
        this.f77374c.clear();
        this.f77374c.addAll(arrayList);
    }

    /* renamed from: b */
    public final void mo111351b(DragDrawChipViewData eVar) {
        if (eVar != null) {
            this.f77374c.remove(eVar);
            this.f77375d.mo111329a();
        }
    }

    /* renamed from: a */
    public final void mo111347a(DragDrawChipViewData eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (eVar.mo110970e() == 0) {
            eVar.mo110968d(true);
        }
        eVar.mo110964b(false);
        this.f77375d.mo111329a();
        String str = this.f77373b;
        Log.m165389i(str, C32673y.m125369a("chipsDataHandler removedChip data=" + System.identityHashCode(eVar)));
    }

    /* renamed from: a */
    public final DragDrawChipViewData mo111345a(float f, float f2) {
        int size = this.f77374c.size();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return null;
            }
            DragDrawChipViewData eVar = this.f77374c.get(i);
            Intrinsics.checkExpressionValueIsNotNull(eVar, "chipData[i]");
            DragDrawChipViewData eVar2 = eVar;
            if (f >= ((float) eVar2.mo110977j()) && f <= ((float) eVar2.mo110978k()) && f2 >= ((float) eVar2.mo110976i()) && f2 <= ((float) eVar2.mo110979l())) {
                return eVar2;
            }
            size = i;
        }
    }

    /* renamed from: a */
    public final void mo111348a(DragDrawChipViewData eVar, int i, int i2, int i3, int i4) {
        if (eVar != null) {
            eVar.mo110968d(false);
            EventChipView f = eVar.mo110972f();
            if (f != null) {
                f.mo112554a(i, i2, i3, i4);
            }
            eVar.mo110960a(i, i2, i3, i4);
            eVar.mo110964b(false);
            this.f77374c.add(eVar);
            this.f77375d.mo111329a();
            String str = this.f77373b;
            Log.m165389i(str, C32673y.m125369a("chipsDataHandler addChip data=" + System.identityHashCode(eVar)));
        }
    }
}
