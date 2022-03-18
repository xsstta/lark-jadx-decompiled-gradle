package com.ss.android.lark.threaddetail.view.p2752b.p2753a;

import com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.threaddetail.view.message.C55934b;

/* renamed from: com.ss.android.lark.threaddetail.view.b.a.a */
public class C55874a implements AbstractC32928b<ChatMessageVO<?>> {

    /* renamed from: a */
    private C55934b f138061a;

    /* renamed from: b */
    private String f138062b;

    /* renamed from: c */
    private boolean f138063c;

    /* renamed from: a */
    private boolean m217033a(ChatMessageVO<?> cVar) {
        if (cVar.mo121695c() || C34339g.m133167a(this.f138061a.mo122550n()) || this.f138063c) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean accept(C34029b bVar, ChatMessageVO<?> cVar) {
        C33973b C = cVar.mo121657C();
        if (bVar.f87966a == 7 && C != null && cVar.mo121695c()) {
            return false;
        }
        if (bVar.f87966a != 15 || m217033a(cVar)) {
            return true;
        }
        return false;
    }

    public C55874a(C55934b bVar, String str, boolean z) {
        this.f138061a = bVar;
        this.f138062b = str;
        this.f138063c = z;
    }
}
