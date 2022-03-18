package com.ss.android.lark.chat.chatwindow.chat.model;

import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.chatwindow.chat.C33235f;
import com.ss.android.lark.chat.core.model.C33955c;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.i */
public class C33413i implements C33955c.AbstractC33956a<ChatMessageVO> {

    /* renamed from: a */
    C33235f f86041a;

    public C33413i(C33235f fVar) {
        this.f86041a = fVar;
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: b */
    public void mo122970b(List<ChatMessageVO> list, int i, int i2) {
        m129468e(list, i - 1, i2 + 2);
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: a */
    public void mo122969a(List<ChatMessageVO> list, int i, int i2) {
        m129467d(list, i, i2);
        m129468e(list, i - 1, i2 + 2);
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: c */
    public void mo122971c(List<ChatMessageVO> list, int i, int i2) {
        m129467d(list, i, i2);
        m129468e(list, i - 1, i2 + 2);
    }

    /* renamed from: e */
    private void m129468e(List<ChatMessageVO> list, int i, int i2) {
        for (int max = Math.max(i, 0); max <= Math.min(i + i2, list.size() - 1); max++) {
            ChatMessageVO cVar = list.get(max);
            int m = cVar.mo121705m();
            int b = this.f86041a.mo122567b(cVar.mo121696d(), m);
            if (b != m) {
                cVar.mo124274d(true);
            }
            cVar.mo124254a(b);
            this.f86041a.mo122564a(cVar.mo121696d(), m);
        }
    }

    /* renamed from: d */
    private void m129467d(List<ChatMessageVO> list, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            ChatMessageVO<? extends BaseTextContentVO<?>> cVar = list.get(i3);
            String a = cVar.mo121681a();
            cVar.mo124269b(this.f86041a.mo122570e(a));
            ContentVO g = cVar.mo121699g();
            if (g instanceof BaseTextContentVO) {
                BaseTextContentVO baseTextContentVO = (BaseTextContentVO) g;
                this.f86041a.mo122563a(cVar);
                baseTextContentVO.mo121774a(this.f86041a.mo122561a(a));
                baseTextContentVO.mo121773a(this.f86041a.mo122566b(a));
                baseTextContentVO.mo121779a(this.f86041a.mo122568c(a));
            }
        }
    }
}
