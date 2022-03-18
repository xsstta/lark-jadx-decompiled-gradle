package com.ss.android.lark.calendar.impl.features.meetingroom.instance.util;

import android.view.View;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.AbstractC30173d;
import com.ss.android.lark.calendar.impl.features.meetingroom.instance.widget.InstanceChipView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/util/InstanceChipPool;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/SimpleViewPool;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/widget/InstanceChipView;", "factory", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/SimpleViewPool$ViewFactory;", "(Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/SimpleViewPool$ViewFactory;)V", "acquireView", "returnView", "", "chipView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.a.a */
public final class InstanceChipPool extends AbstractC30173d<InstanceChipView> {
    /* renamed from: b */
    public final InstanceChipView mo117167b() {
        View b = super.mo108795b(0);
        Intrinsics.checkExpressionValueIsNotNull(b, "super.acquire(0)");
        return (InstanceChipView) b;
    }

    public InstanceChipPool(AbstractC30173d.AbstractC30174a<InstanceChipView> aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo117166a(InstanceChipView instanceChipView) {
        if (instanceChipView != null) {
            instanceChipView.mo117201a();
            super.mo108793a(0, instanceChipView);
        }
    }
}
