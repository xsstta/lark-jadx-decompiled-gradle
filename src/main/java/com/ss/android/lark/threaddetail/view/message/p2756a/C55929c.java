package com.ss.android.lark.threaddetail.view.message.p2756a;

import com.ss.android.lark.chat.base.view.vo.message.MediaContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.MediaMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33302l;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.utils.C34347m;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.threaddetail.view.p2752b.AbstractC55870a;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55885h;
import java.util.List;

/* renamed from: com.ss.android.lark.threaddetail.view.message.a.c */
public class C55929c extends C33330b<MediaContentVO, MediaMessageCell.MediaMessageViewHolder> {

    /* renamed from: c */
    private final AbstractC33302l f138219c;

    public C55929c(AbstractC33342d dVar, AbstractC33302l lVar) {
        super(dVar);
        this.f138219c = lVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b, com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo122821a((List<C34029b>) list, (C33141d) obj);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b
    /* renamed from: a */
    public void mo122821a(List<C34029b> list, C33141d<AbsMessageVO<MediaContentVO>, MediaMessageCell.MediaMessageViewHolder> dVar) {
        list.add(AbstractC55870a.CC.m217011a(new AbstractC55885h(dVar) {
            /* class com.ss.android.lark.threaddetail.view.message.p2756a.$$Lambda$c$mYD4TAFDWjP_h_7zPTGqsgid6YE */
            public final /* synthetic */ C33141d f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55885h
            public final void onMutePlay(AbsMessageVO aVar) {
                C55929c.lambda$mYD4TAFDWjP_h_7zPTGqsgid6YE(C55929c.this, this.f$1, aVar);
            }
        }, dVar.f85280b));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m217273a(C33141d dVar, AbsMessageVO aVar) {
        C34347m.m133190a(this.f85878a.mo122543g(), ((MediaMessageCell.MediaMessageViewHolder) dVar.f85279a).mImageView, dVar.f85280b, true, this.f138219c);
    }
}
