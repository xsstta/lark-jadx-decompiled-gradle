package com.ss.android.lark.profile.message;

import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;

/* renamed from: com.ss.android.lark.profile.message.c */
public class C52888c implements IOpenMessageCellFactory<ProfileContentVO, ProfileMsgConverter, ProfileMessageCell> {
    /* renamed from: a */
    public ProfileMsgConverter mo120405b() {
        return new ProfileMsgConverter();
    }

    /* renamed from: a */
    public ProfileMessageCell mo120404b(IMessageContext aVar, IOpenCellCallback<ProfileContentVO> bVar) {
        return new ProfileMessageCell(aVar, bVar);
    }
}
