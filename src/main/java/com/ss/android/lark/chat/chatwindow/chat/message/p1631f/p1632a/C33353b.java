package com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a;

import android.view.View;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.C33348a;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.message.style.C34035c;
import com.ss.android.lark.chat.open.message.AbstractC34072a;
import com.ss.android.lark.chat.vo.AbsMessageVO;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.f.a.b */
public class C33353b implements AbstractC34072a {
    @Override // com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: b */
    public C34035c mo122837b(AbsMessageVO aVar) {
        return C33348a.C33351c.m129130a(aVar.mo121695c());
    }

    @Override // com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: a */
    public C34034b mo122836a(AbsMessageVO aVar) {
        return C33348a.C33350b.m129129a(aVar.mo121695c());
    }

    @Override // com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: a */
    public BubbleStyle mo122835a(AbsMessageVO aVar, View view) {
        return C33348a.C33349a.m129128a(aVar.mo121695c(), aVar.ah());
    }
}
