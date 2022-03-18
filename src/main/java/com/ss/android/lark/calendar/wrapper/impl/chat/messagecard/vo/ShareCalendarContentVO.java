package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.vo;

import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.ShareCalendarEventContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020\u001bH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8FX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001a\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001b8FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001e\u0010\u001c¨\u0006!"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/vo/ShareCalendarContentVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/content/ShareCalendarEventContent;", "content", "(Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/content/ShareCalendarEventContent;)V", "attendeesCount", "", "getAttendeesCount", "()I", "attendeesCount$delegate", "Lkotlin/Lazy;", "calendarEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "getCalendarEvent", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "calendarEvent$delegate", "conflictTime", "", "getConflictTime", "()J", "conflictTime$delegate", "conflictType", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalContent$ConflictType;", "getConflictType", "()Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalContent$ConflictType;", "conflictType$delegate", "isJoined", "", "()Z", "isJoined$delegate", "isSharable", "isSharable$delegate", "canReply", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.f.c */
public final class ShareCalendarContentVO extends ContentVO<ShareCalendarEventContent> {

    /* renamed from: a */
    private final Lazy f83889a;

    /* renamed from: b */
    private final Lazy f83890b;

    /* renamed from: c */
    private final Lazy f83891c;

    /* renamed from: d */
    private final Lazy f83892d;

    /* renamed from: e */
    private final Lazy f83893e;

    /* renamed from: f */
    private final Lazy f83894f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.f.c$a */
    static final class C32709a extends Lambda implements Function0<Integer> {
        final /* synthetic */ ShareCalendarEventContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32709a(ShareCalendarEventContent shareCalendarEventContent) {
            super(0);
            this.$content = shareCalendarEventContent;
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return this.$content.getCalendarInternalShareEventContent().getAttendeesCount();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.f.c$b */
    static final class C32710b extends Lambda implements Function0<CalendarEvent> {
        final /* synthetic */ ShareCalendarEventContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32710b(ShareCalendarEventContent shareCalendarEventContent) {
            super(0);
            this.$content = shareCalendarEventContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarEvent invoke() {
            return this.$content.getCalendarInternalShareEventContent().getCalendarEvent();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.f.c$c */
    static final class C32711c extends Lambda implements Function0<Long> {
        final /* synthetic */ ShareCalendarEventContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32711c(ShareCalendarEventContent shareCalendarEventContent) {
            super(0);
            this.$content = shareCalendarEventContent;
        }

        /* Return type fixed from 'long' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return this.$content.getCalendarInternalShareEventContent().getConflictTime();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalContent$ConflictType;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.f.c$d */
    static final class C32712d extends Lambda implements Function0<CalendarInternalContent.ConflictType> {
        final /* synthetic */ ShareCalendarEventContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32712d(ShareCalendarEventContent shareCalendarEventContent) {
            super(0);
            this.$content = shareCalendarEventContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarInternalContent.ConflictType invoke() {
            CalendarInternalContent.ConflictType conflictType = this.$content.getCalendarInternalShareEventContent().getConflictType();
            if (conflictType != null) {
                return conflictType;
            }
            return CalendarInternalContent.ConflictType.NONE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.f.c$e */
    static final class C32713e extends Lambda implements Function0<Boolean> {
        final /* synthetic */ ShareCalendarEventContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32713e(ShareCalendarEventContent shareCalendarEventContent) {
            super(0);
            this.$content = shareCalendarEventContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.getCalendarInternalShareEventContent().isJoined();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.f.c$f */
    static final class C32714f extends Lambda implements Function0<Boolean> {
        final /* synthetic */ ShareCalendarEventContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32714f(ShareCalendarEventContent shareCalendarEventContent) {
            super(0);
            this.$content = shareCalendarEventContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.getCalendarInternalShareEventContent().isSharable();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareCalendarContentVO(ShareCalendarEventContent shareCalendarEventContent) {
        super(shareCalendarEventContent);
        Intrinsics.checkParameterIsNotNull(shareCalendarEventContent, "content");
        this.f83889a = LazyKt.lazy(new C32710b(shareCalendarEventContent));
        this.f83890b = LazyKt.lazy(new C32709a(shareCalendarEventContent));
        this.f83891c = LazyKt.lazy(new C32713e(shareCalendarEventContent));
        this.f83892d = LazyKt.lazy(new C32714f(shareCalendarEventContent));
        this.f83893e = LazyKt.lazy(new C32711c(shareCalendarEventContent));
        this.f83894f = LazyKt.lazy(new C32712d(shareCalendarEventContent));
    }
}
