package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.vo;

import com.ss.android.lark.calendar.impl.features.messagecard.entity.CalendarCardContent;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.RSVPCommentCardInfo;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalGeneralContent;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.CalendarGeneralContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u001dR\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR)\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/vo/CalendarGeneralContentVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/content/CalendarGeneralContent;", "content", "(Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/content/CalendarGeneralContent;)V", "calendarCardContent", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/CalendarCardContent;", "getCalendarCardContent", "()Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/CalendarCardContent;", "calendarCardContent$delegate", "Lkotlin/Lazy;", "messageChatters", "", "", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IChatterData;", "getMessageChatters", "()Ljava/util/Map;", "messageChatters$delegate", "messageType", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalGeneralContent$CalendarMessageType;", "getMessageType", "()Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalGeneralContent$CalendarMessageType;", "messageType$delegate", "rsvpCommentCardInfo", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/RSVPCommentCardInfo;", "getRsvpCommentCardInfo", "()Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/RSVPCommentCardInfo;", "rsvpCommentCardInfo$delegate", "canReply", "", "isEnableRSVPCalendarType", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.f.b */
public final class CalendarGeneralContentVO extends ContentVO<CalendarGeneralContent> {

    /* renamed from: a */
    private final Lazy f83885a;

    /* renamed from: b */
    private final Lazy f83886b;

    /* renamed from: c */
    private final Lazy f83887c;

    /* renamed from: d */
    private final Lazy f83888d;

    /* renamed from: b */
    private final CalendarInternalGeneralContent.CalendarMessageType m125557b() {
        return (CalendarInternalGeneralContent.CalendarMessageType) this.f83885a.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/CalendarCardContent;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.f.b$a */
    static final class C32705a extends Lambda implements Function0<CalendarCardContent> {
        final /* synthetic */ CalendarGeneralContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32705a(CalendarGeneralContent calendarGeneralContent) {
            super(0);
            this.$content = calendarGeneralContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarCardContent invoke() {
            return this.$content.getCalendarInternalGeneralContent().getCalendarCardContent();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\u0010\u0000\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00050\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IChatterData;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.f.b$b */
    static final class C32706b extends Lambda implements Function0<Map<String, AbstractC30026d>> {
        final /* synthetic */ CalendarGeneralContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32706b(CalendarGeneralContent calendarGeneralContent) {
            super(0);
            this.$content = calendarGeneralContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, AbstractC30026d> invoke() {
            return this.$content.getCalendarInternalGeneralContent().getmMessageChatters();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalGeneralContent$CalendarMessageType;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.f.b$c */
    static final class C32707c extends Lambda implements Function0<CalendarInternalGeneralContent.CalendarMessageType> {
        final /* synthetic */ CalendarGeneralContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32707c(CalendarGeneralContent calendarGeneralContent) {
            super(0);
            this.$content = calendarGeneralContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarInternalGeneralContent.CalendarMessageType invoke() {
            CalendarInternalGeneralContent.CalendarMessageType messageType = this.$content.getCalendarInternalGeneralContent().getMessageType();
            if (messageType != null) {
                return messageType;
            }
            return CalendarInternalGeneralContent.CalendarMessageType.UNKNOWN;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/RSVPCommentCardInfo;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.f.b$d */
    static final class C32708d extends Lambda implements Function0<RSVPCommentCardInfo> {
        final /* synthetic */ CalendarGeneralContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32708d(CalendarGeneralContent calendarGeneralContent) {
            super(0);
            this.$content = calendarGeneralContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final RSVPCommentCardInfo invoke() {
            return this.$content.getCalendarInternalGeneralContent().getRSVPCommentCardInfo();
        }
    }

    /* renamed from: a */
    public final boolean mo120468a() {
        if (m125557b() == CalendarInternalGeneralContent.CalendarMessageType.RSVP_COMMENT) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarGeneralContentVO(CalendarGeneralContent calendarGeneralContent) {
        super(calendarGeneralContent);
        Intrinsics.checkParameterIsNotNull(calendarGeneralContent, "content");
        this.f83885a = LazyKt.lazy(new C32707c(calendarGeneralContent));
        this.f83886b = LazyKt.lazy(new C32705a(calendarGeneralContent));
        this.f83887c = LazyKt.lazy(new C32708d(calendarGeneralContent));
        this.f83888d = LazyKt.lazy(new C32706b(calendarGeneralContent));
    }
}
