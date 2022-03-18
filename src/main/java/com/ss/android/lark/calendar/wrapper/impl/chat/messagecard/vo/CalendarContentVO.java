package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.vo;

import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.CalendarContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001b\u0010\u0005\u001a\u00020\u00028FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/vo/CalendarContentVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/content/CalendarContent;", "content", "(Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/content/CalendarContent;)V", "calendarContent", "getCalendarContent", "()Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/content/CalendarContent;", "calendarContent$delegate", "Lkotlin/Lazy;", "canReply", "", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.f.a */
public final class CalendarContentVO extends ContentVO<CalendarContent> {

    /* renamed from: a */
    private final Lazy f83884a;

    /* renamed from: a */
    public final CalendarContent mo120467a() {
        return (CalendarContent) this.f83884a.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/content/CalendarContent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.f.a$a */
    static final class C32704a extends Lambda implements Function0<CalendarContent> {
        final /* synthetic */ CalendarContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32704a(CalendarContent calendarContent) {
            super(0);
            this.$content = calendarContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarContent invoke() {
            return this.$content;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarContentVO(CalendarContent calendarContent) {
        super(calendarContent);
        Intrinsics.checkParameterIsNotNull(calendarContent, "content");
        this.f83884a = LazyKt.lazy(new C32704a(calendarContent));
    }
}
