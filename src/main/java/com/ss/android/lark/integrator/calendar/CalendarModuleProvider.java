package com.ss.android.lark.integrator.calendar;

import com.ss.android.lark.calendar.wrapper.C32674a;
import com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32677a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/CalendarModuleProvider;", "", "()V", "Companion", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.a */
public final class CalendarModuleProvider {

    /* renamed from: a */
    public static final Lazy f100460a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39181b.INSTANCE);

    /* renamed from: b */
    public static final Companion f100461b = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC32677a m154500a() {
        return f100461b.mo143023b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0007R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/CalendarModuleProvider$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/calendar/wrapper/api/ICalendarModuleForLark;", "getInstance", "()Lcom/ss/android/lark/calendar/wrapper/api/ICalendarModuleForLark;", "instance$delegate", "Lkotlin/Lazy;", "getModule", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.a$a */
    public static final class Companion {
        /* renamed from: a */
        public final AbstractC32677a mo143022a() {
            Lazy lazy = CalendarModuleProvider.f100460a;
            Companion aVar = CalendarModuleProvider.f100461b;
            return (AbstractC32677a) lazy.getValue();
        }

        private Companion() {
        }

        @JvmStatic
        /* renamed from: b */
        public final AbstractC32677a mo143023b() {
            return mo143022a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/wrapper/CalendarModuleWrapper;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.a$b */
    static final class C39181b extends Lambda implements Function0<C32674a> {
        public static final C39181b INSTANCE = new C39181b();

        C39181b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C32674a invoke() {
            return new C32674a();
        }
    }
}
