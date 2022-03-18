package com.ss.android.lark.message.card.view;

import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;

/* renamed from: com.ss.android.lark.message.card.view.d */
public class C45334d implements IOpenMessageCellFactory<CardContentVO, CardMsgConverter, C45332c> {
    /* renamed from: a */
    public CardMsgConverter mo120405b() {
        return new CardMsgConverter();
    }

    /* renamed from: a */
    public C45332c mo120404b(IMessageContext aVar, IOpenCellCallback<CardContentVO> bVar) {
        return new C45332c(aVar, bVar);
    }
}
