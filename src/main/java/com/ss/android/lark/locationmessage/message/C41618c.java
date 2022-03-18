package com.ss.android.lark.locationmessage.message;

import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;

/* renamed from: com.ss.android.lark.locationmessage.message.c */
public class C41618c implements IOpenMessageCellFactory<LocationContentVO, LocationMsgConverter, LocationMessageCell> {
    /* renamed from: a */
    public LocationMsgConverter mo120405b() {
        return new LocationMsgConverter();
    }

    /* renamed from: a */
    public LocationMessageCell mo120404b(IMessageContext aVar, IOpenCellCallback<LocationContentVO> bVar) {
        return new LocationMessageCell(aVar, bVar);
    }
}
