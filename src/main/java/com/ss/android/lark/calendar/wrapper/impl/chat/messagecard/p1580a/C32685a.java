package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1580a;

import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.vo.CalendarContentVO;
import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;

/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.a.a */
public class C32685a implements IOpenMessageCellFactory<CalendarContentVO, CalendarMsgConverter, C32686b> {
    /* renamed from: a */
    public CalendarMsgConverter mo120405b() {
        return new CalendarMsgConverter();
    }

    /* renamed from: a */
    public C32686b mo120404b(IMessageContext aVar, IOpenCellCallback<CalendarContentVO> bVar) {
        return new C32686b(aVar, bVar);
    }
}
