package com.ss.android.lark.message.vote.message;

import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;

/* renamed from: com.ss.android.lark.message.vote.message.b */
public class C45397b implements IOpenMessageCellFactory<VoteContentVO, VoteMsgConverter, VoteMessageCell> {
    /* renamed from: a */
    public VoteMsgConverter mo120405b() {
        return new VoteMsgConverter();
    }

    /* renamed from: a */
    public VoteMessageCell mo120404b(IMessageContext aVar, IOpenCellCallback<VoteContentVO> bVar) {
        return new VoteMessageCell(aVar);
    }
}
