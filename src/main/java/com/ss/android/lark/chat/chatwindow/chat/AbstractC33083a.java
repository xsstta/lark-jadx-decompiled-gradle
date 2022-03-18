package com.ss.android.lark.chat.chatwindow.chat;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.lark.chat.chatwindow.chat.C33188c;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.recyclerview.hive.ICellHoverHandler;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.a */
public abstract class AbstractC33083a implements C33188c.AbstractC33189a, ICellHoverHandler<ChatMessageVO> {

    /* renamed from: a */
    protected ICellHoverHandler f85216a = new C33188c(this);

    /* renamed from: b */
    public boolean mo122230b(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        return this.f85216a.mo122230b(bVar, eVar, cVar);
    }

    /* renamed from: c */
    public boolean mo122226a(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        return this.f85216a.mo122226a(bVar, eVar, cVar);
    }

    /* renamed from: a */
    public boolean mo122234c(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        return this.f85216a.mo122234c(bVar, eVar, cVar);
    }

    /* renamed from: a */
    public void mo122232c(View view, AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        this.f85216a.mo122232c(view, bVar, eVar, cVar);
    }

    /* renamed from: b */
    public void mo122228b(View view, AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        this.f85216a.mo122228b(view, bVar, eVar, cVar);
    }

    /* renamed from: c */
    public void mo122222a(View view, AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        this.f85216a.mo122222a(view, bVar, eVar, cVar);
    }

    /* renamed from: a */
    public boolean mo122224a(View view, AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar, MotionEvent motionEvent, int i) {
        return this.f85216a.mo122224a(view, bVar, eVar, cVar, motionEvent, i);
    }
}
