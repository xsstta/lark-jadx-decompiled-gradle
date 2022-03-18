package com.ss.android.lark.calendar.impl.features.events.edit.fragment.entity;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BI\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0002\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0011R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/entity/SpanMenuItem;", "", "builder", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/entity/SpanMenuItem$Builder;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/entity/SpanMenuItem$Builder;)V", "span", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "spanLabel", "", "spanLabelDesc", "spanCheckboxDesc", "isChecked", "", "isToChoose", "isIconShow", "isShowInRed", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "()Z", "setChecked", "(Z)V", "getSpan", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "getSpanCheckboxDesc", "()Ljava/lang/String;", "getSpanLabel", "getSpanLabelDesc", "Builder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.b.b */
public final class SpanMenuItem {

    /* renamed from: a */
    private final CalendarEvent.Span f80422a;

    /* renamed from: b */
    private final String f80423b;

    /* renamed from: c */
    private final String f80424c;

    /* renamed from: d */
    private final String f80425d;

    /* renamed from: e */
    private boolean f80426e;

    /* renamed from: f */
    private final boolean f80427f;

    /* renamed from: g */
    private final boolean f80428g;

    /* renamed from: h */
    private final boolean f80429h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010 \u001a\u00020!J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0015J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007R\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019¨\u0006\""}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/entity/SpanMenuItem$Builder;", "", "()V", "isChecked", "", "()Z", "setChecked", "(Z)V", "isIconShow", "setIconShow", "isShowInRed", "setShowInRed", "isToChoose", "setToChoose", "span", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "getSpan", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "setSpan", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;)V", "spanCheckboxDesc", "", "getSpanCheckboxDesc", "()Ljava/lang/String;", "setSpanCheckboxDesc", "(Ljava/lang/String;)V", "spanLabel", "getSpanLabel", "setSpanLabel", "spanLabelDesc", "getSpanLabelDesc", "setSpanLabelDesc", "build", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/entity/SpanMenuItem;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.b.b$a */
    public static final class Builder {

        /* renamed from: a */
        private CalendarEvent.Span f80430a;

        /* renamed from: b */
        private String f80431b = "";

        /* renamed from: c */
        private String f80432c = "";

        /* renamed from: d */
        private String f80433d = "";

        /* renamed from: e */
        private boolean f80434e = true;

        /* renamed from: f */
        private boolean f80435f = true;

        /* renamed from: g */
        private boolean f80436g;

        /* renamed from: h */
        private boolean f80437h;

        /* renamed from: e */
        public final boolean mo115320e() {
            return this.f80434e;
        }

        /* renamed from: f */
        public final boolean mo115321f() {
            return this.f80435f;
        }

        /* renamed from: g */
        public final boolean mo115322g() {
            return this.f80436g;
        }

        /* renamed from: h */
        public final boolean mo115323h() {
            return this.f80437h;
        }

        /* renamed from: d */
        public final String mo115319d() {
            return this.f80433d;
        }

        /* renamed from: i */
        public final SpanMenuItem mo115324i() {
            return new SpanMenuItem(this, null);
        }

        /* renamed from: b */
        public final String mo115314b() {
            return this.f80431b;
        }

        /* renamed from: c */
        public final String mo115317c() {
            return this.f80432c;
        }

        /* renamed from: a */
        public final CalendarEvent.Span mo115311a() {
            return this.f80430a;
        }

        /* renamed from: a */
        public final Builder mo115310a(boolean z) {
            this.f80434e = z;
            return this;
        }

        /* renamed from: b */
        public final Builder mo115313b(boolean z) {
            this.f80435f = z;
            return this;
        }

        /* renamed from: c */
        public final Builder mo115316c(boolean z) {
            this.f80436g = z;
            return this;
        }

        /* renamed from: d */
        public final Builder mo115318d(boolean z) {
            this.f80437h = z;
            return this;
        }

        /* renamed from: a */
        public final Builder mo115308a(CalendarEvent.Span span) {
            Intrinsics.checkParameterIsNotNull(span, "span");
            this.f80430a = span;
            return this;
        }

        /* renamed from: b */
        public final Builder mo115312b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "spanLabelDesc");
            this.f80432c = str;
            return this;
        }

        /* renamed from: c */
        public final Builder mo115315c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "spanCheckboxDesc");
            this.f80433d = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo115309a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "spanLabel");
            this.f80431b = str;
            return this;
        }
    }

    /* renamed from: a */
    public final CalendarEvent.Span mo115299a() {
        return this.f80422a;
    }

    /* renamed from: b */
    public final String mo115301b() {
        return this.f80423b;
    }

    /* renamed from: c */
    public final String mo115302c() {
        return this.f80424c;
    }

    /* renamed from: d */
    public final String mo115303d() {
        return this.f80425d;
    }

    /* renamed from: e */
    public final boolean mo115304e() {
        return this.f80426e;
    }

    /* renamed from: f */
    public final boolean mo115305f() {
        return this.f80427f;
    }

    /* renamed from: g */
    public final boolean mo115306g() {
        return this.f80428g;
    }

    /* renamed from: h */
    public final boolean mo115307h() {
        return this.f80429h;
    }

    /* renamed from: a */
    public final void mo115300a(boolean z) {
        this.f80426e = z;
    }

    private SpanMenuItem(Builder aVar) {
        this(aVar.mo115311a(), aVar.mo115314b(), aVar.mo115317c(), aVar.mo115319d(), aVar.mo115320e(), aVar.mo115321f(), aVar.mo115322g(), aVar.mo115323h());
    }

    public /* synthetic */ SpanMenuItem(Builder aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    private SpanMenuItem(CalendarEvent.Span span, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f80422a = span;
        this.f80423b = str;
        this.f80424c = str2;
        this.f80425d = str3;
        this.f80426e = z;
        this.f80427f = z2;
        this.f80428g = z3;
        this.f80429h = z4;
    }
}
