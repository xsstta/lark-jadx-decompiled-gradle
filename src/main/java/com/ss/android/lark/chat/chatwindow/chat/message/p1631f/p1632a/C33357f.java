package com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a;

import android.view.View;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.message.style.C34035c;
import com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider;
import com.ss.android.lark.chat.vo.AbsMessageVO;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.f.a.f */
public class C33357f extends C33353b {

    /* renamed from: a */
    private IOpenMessageCell f85912a;

    public C33357f(IOpenMessageCell cVar) {
        this.f85912a = cVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33353b, com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: b */
    public C34035c mo122837b(AbsMessageVO aVar) {
        C34035c cVar;
        IOpenMessageCell cVar2 = this.f85912a;
        if (cVar2 instanceof IOpenBubbleStyleProvider) {
            cVar = ((IOpenBubbleStyleProvider) cVar2).mo120416b(aVar);
        } else {
            cVar = null;
        }
        if (cVar == null) {
            return super.mo122837b(aVar);
        }
        return cVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33353b, com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: a */
    public C34034b mo122836a(AbsMessageVO aVar) {
        IOpenMessageCell cVar = this.f85912a;
        if (cVar instanceof IOpenBubbleStyleProvider) {
            return ((IOpenBubbleStyleProvider) cVar).mo120408a(aVar);
        }
        return super.mo122836a(aVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33353b, com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: a */
    public BubbleStyle mo122835a(AbsMessageVO aVar, View view) {
        IOpenMessageCell cVar = this.f85912a;
        if (cVar instanceof IOpenBubbleStyleProvider) {
            return ((IOpenBubbleStyleProvider) cVar).mo120407a(aVar, view);
        }
        return super.mo122835a(aVar, view);
    }
}
