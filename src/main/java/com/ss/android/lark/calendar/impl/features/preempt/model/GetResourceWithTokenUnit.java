package com.ss.android.lark.calendar.impl.features.preempt.model;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000e¨\u0006%"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/model/GetResourceWithTokenUnit;", "", "()V", "building", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "getBuilding", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "setBuilding", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;)V", "currentTimestamp", "", "getCurrentTimestamp", "()J", "setCurrentTimestamp", "(J)V", "eventInstances", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "getEventInstances", "()Ljava/util/List;", "setEventInstances", "(Ljava/util/List;)V", "needPopOver", "", "getNeedPopOver", "()Z", "setNeedPopOver", "(Z)V", "resource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "getResource", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "setResource", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;)V", "seizeTime", "getSeizeTime", "setSeizeTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.preempt.b.a */
public final class GetResourceWithTokenUnit {

    /* renamed from: a */
    public CalendarResource f82444a;

    /* renamed from: b */
    public CalendarBuilding f82445b;

    /* renamed from: c */
    public List<? extends CalendarEventInstance> f82446c;

    /* renamed from: d */
    private long f82447d;

    /* renamed from: e */
    private long f82448e;

    /* renamed from: f */
    private boolean f82449f = true;

    /* renamed from: d */
    public final long mo117867d() {
        return this.f82447d;
    }

    /* renamed from: e */
    public final long mo117868e() {
        return this.f82448e;
    }

    /* renamed from: f */
    public final boolean mo117869f() {
        return this.f82449f;
    }

    /* renamed from: a */
    public final CalendarResource mo117858a() {
        CalendarResource calendarResource = this.f82444a;
        if (calendarResource == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resource");
        }
        return calendarResource;
    }

    /* renamed from: b */
    public final CalendarBuilding mo117864b() {
        CalendarBuilding calendarBuilding = this.f82445b;
        if (calendarBuilding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("building");
        }
        return calendarBuilding;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance>, java.util.List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance> */
    /* renamed from: c */
    public final List<CalendarEventInstance> mo117866c() {
        List list = this.f82446c;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventInstances");
        }
        return list;
    }

    /* renamed from: a */
    public final void mo117859a(long j) {
        this.f82447d = j;
    }

    /* renamed from: b */
    public final void mo117865b(long j) {
        this.f82448e = j;
    }

    /* renamed from: a */
    public final void mo117860a(CalendarBuilding calendarBuilding) {
        Intrinsics.checkParameterIsNotNull(calendarBuilding, "<set-?>");
        this.f82445b = calendarBuilding;
    }

    /* renamed from: a */
    public final void mo117861a(CalendarResource calendarResource) {
        Intrinsics.checkParameterIsNotNull(calendarResource, "<set-?>");
        this.f82444a = calendarResource;
    }

    /* renamed from: a */
    public final void mo117862a(List<? extends CalendarEventInstance> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f82446c = list;
    }

    /* renamed from: a */
    public final void mo117863a(boolean z) {
        this.f82449f = z;
    }
}
