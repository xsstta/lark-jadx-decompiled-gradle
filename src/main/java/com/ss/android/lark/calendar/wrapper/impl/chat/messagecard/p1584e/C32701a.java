package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1584e;

import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.vo.ShareCalendarContentVO;
import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;

/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.e.a */
public class C32701a implements IOpenMessageCellFactory<ShareCalendarContentVO, ShareCalendarMsgConverter, C32702b> {
    /* renamed from: a */
    public ShareCalendarMsgConverter mo120405b() {
        return new ShareCalendarMsgConverter();
    }

    /* renamed from: a */
    public C32702b mo120404b(IMessageContext aVar, IOpenCellCallback<ShareCalendarContentVO> bVar) {
        return new C32702b(aVar, bVar);
    }
}
