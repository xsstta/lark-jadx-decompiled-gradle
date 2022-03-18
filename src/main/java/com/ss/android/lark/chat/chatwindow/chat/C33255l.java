package com.ss.android.lark.chat.chatwindow.chat;

import com.ss.android.lark.chat.base.view.recycleview.AbstractC32943c;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.l */
public class C33255l implements AbstractC32943c<C33086b> {

    /* renamed from: a */
    private final String f85589a;

    public C33255l(String str) {
        this.f85589a = str;
    }

    /* renamed from: a */
    public int getTargetItemPosition(C33086b bVar) {
        if (bVar == null) {
            return -1;
        }
        for (int i = 0; i < bVar.getItemCount(); i++) {
            if (bVar.mo31276a(i).mo121681a().equals(this.f85589a)) {
                return i;
            }
        }
        return -1;
    }
}
