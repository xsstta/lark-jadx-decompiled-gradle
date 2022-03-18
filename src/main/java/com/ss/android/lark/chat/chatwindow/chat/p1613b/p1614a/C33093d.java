package com.ss.android.lark.chat.chatwindow.chat.p1613b.p1614a;

import com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.ChatMessageVO;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.a.d */
public class C33093d implements AbstractC32928b<ChatMessageVO<?>> {
    /* renamed from: a */
    public boolean accept(C34029b bVar, ChatMessageVO<?> cVar) {
        boolean z;
        boolean z2 = false;
        if (cVar.mo121698f() || cVar.mo124251X()) {
            return false;
        }
        if (cVar.ai()) {
            if (bVar.f87966a == 23) {
                z = true;
            } else {
                z = false;
            }
            if (cVar.mo121710r() != Message.Type.TEXT && cVar.mo121710r() != Message.Type.POST) {
                return z;
            }
            if (bVar.f87966a == 8) {
                z2 = true;
            }
            return z | z2;
        } else if (!cVar.mo124248U() || bVar.f87966a == 23) {
            return true;
        } else {
            return false;
        }
    }
}
