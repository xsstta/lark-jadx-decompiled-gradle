package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1581b;

import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.vo.CalendarGeneralContentVO;
import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;

/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.b.b */
public class C32688b implements IOpenMessageCellFactory<CalendarGeneralContentVO, CalendarGeneralMsgConverter, C32687a> {
    /* renamed from: a */
    public CalendarGeneralMsgConverter mo120405b() {
        return new CalendarGeneralMsgConverter();
    }

    /* renamed from: a */
    public C32687a mo120404b(IMessageContext aVar, IOpenCellCallback<CalendarGeneralContentVO> bVar) {
        return new C32687a(aVar, bVar);
    }
}
