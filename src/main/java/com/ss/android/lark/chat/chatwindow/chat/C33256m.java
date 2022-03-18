package com.ss.android.lark.chat.chatwindow.chat;

import com.ss.android.lark.chat.base.view.recycleview.AbstractC32943c;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.m */
public class C33256m implements AbstractC32943c<C33086b> {

    /* renamed from: a */
    private final int f85590a;

    public C33256m(int i) {
        this.f85590a = i;
    }

    /* renamed from: a */
    public int getTargetItemPosition(C33086b bVar) {
        if (bVar == null) {
            return -1;
        }
        for (int itemCount = bVar.getItemCount() - 1; itemCount >= 0; itemCount--) {
            if (bVar.mo31276a(itemCount).mo121717y() == this.f85590a) {
                return itemCount;
            }
        }
        return -1;
    }
}
