package com.ss.android.lark.threaddetail.view.p2752b.p2753a;

import com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.ChatMessageVO;

/* renamed from: com.ss.android.lark.threaddetail.view.b.a.b */
public class C55875b implements AbstractC32928b<ChatMessageVO<?>> {

    /* renamed from: a */
    private boolean f138064a;

    /* renamed from: b */
    private boolean f138065b;

    public C55875b(boolean z, boolean z2) {
        this.f138064a = z;
        this.f138065b = z2;
    }

    /* renamed from: a */
    public boolean accept(C34029b bVar, ChatMessageVO<?> cVar) {
        if (bVar.f87966a == 7 && this.f138064a) {
            return false;
        }
        if (bVar.f87966a != 15 || !this.f138065b) {
            return true;
        }
        return false;
    }
}
