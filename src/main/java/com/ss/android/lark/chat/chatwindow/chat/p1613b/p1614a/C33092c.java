package com.ss.android.lark.chat.chatwindow.chat.p1613b.p1614a;

import com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.ChatMessageVO;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.a.c */
public class C33092c implements AbstractC32928b<ChatMessageVO> {
    /* renamed from: a */
    public boolean accept(C34029b bVar, ChatMessageVO cVar) {
        if ((cVar.mo121710r() == Message.Type.TEXT || cVar.mo121710r() == Message.Type.POST) && bVar.f87966a == 8) {
            return true;
        }
        return false;
    }
}
