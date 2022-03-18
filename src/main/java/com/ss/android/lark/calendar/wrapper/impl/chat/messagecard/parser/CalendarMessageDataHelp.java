package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.parser;

import com.ss.android.lark.calendar.dependency.idependency.entity.IMessageCardData;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0014\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/parser/CalendarMessageDataHelp;", "", "()V", "getDetailMessageData", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IMessageCardData;", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "getMessageData", "openMessageVO", "Lcom/ss/android/lark/chat/export/vo/OpenMessageVO;", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.c.b */
public final class CalendarMessageDataHelp {

    /* renamed from: a */
    public static final CalendarMessageDataHelp f83851a = new CalendarMessageDataHelp();

    private CalendarMessageDataHelp() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/wrapper/impl/chat/messagecard/parser/CalendarMessageDataHelp$getMessageData$1", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IMessageCardData;", "getMessageId", "", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.c.b$a */
    public static final class C32690a implements IMessageCardData {

        /* renamed from: a */
        final /* synthetic */ OpenMessageVO f83852a;

        @Override // com.ss.android.lark.calendar.dependency.idependency.entity.IMessageCardData
        /* renamed from: a */
        public String mo108167a() {
            return this.f83852a.mo121681a();
        }

        C32690a(OpenMessageVO cVar) {
            this.f83852a = cVar;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final IMessageCardData m125509a(OpenMessageVO<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "openMessageVO");
        return new C32690a(cVar);
    }
}
