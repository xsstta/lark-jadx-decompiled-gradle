package com.ss.android.lark.chat.chatwindow.chat;

import com.ss.android.lark.chat.base.view.recycleview.AbstractC32943c;
import com.ss.android.lark.chat.p1660e.C33974e;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.n */
public class C33415n implements AbstractC32943c<C33086b> {
    /* renamed from: a */
    public int getTargetItemPosition(C33086b bVar) {
        if (bVar == null) {
            return -1;
        }
        for (int i = 0; i < bVar.getItemCount(); i++) {
            C33974e q = bVar.mo31276a(i).mo124282q();
            if (q != null && q.mo124312c()) {
                return i;
            }
        }
        return -1;
    }
}
