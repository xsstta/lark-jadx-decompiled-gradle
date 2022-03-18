package com.ss.android.lark.chat.chatwindow.chat.message.p1626c;

import com.ss.android.lark.chat.base.view.vo.message.MediaContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.MediaMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33302l;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.AbstractC33142f;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33122k;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.utils.C34347m;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.c.f */
public class C33335f extends C33330b<MediaContentVO, MediaMessageCell.MediaMessageViewHolder> {

    /* renamed from: c */
    private final AbstractC33302l f85883c;

    public C33335f(AbstractC33342d dVar, AbstractC33302l lVar) {
        super(dVar);
        this.f85883c = lVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b, com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo122821a((List<C34029b>) list, (C33141d) obj);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b
    /* renamed from: a */
    public void mo122821a(List<C34029b> list, C33141d<AbsMessageVO<MediaContentVO>, MediaMessageCell.MediaMessageViewHolder> dVar) {
        list.add(AbstractC33142f.CC.m128067a(new AbstractC33122k(dVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.p1626c.$$Lambda$f$CLVrnYyRhULplJx5HNz3hoi4Mbc */
            public final /* synthetic */ C33141d f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33122k
            public final void onMutePlay(AbsMessageVO aVar) {
                C33335f.lambda$CLVrnYyRhULplJx5HNz3hoi4Mbc(C33335f.this, this.f$1, aVar);
            }
        }, dVar.f85280b));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m129061a(C33141d dVar, AbsMessageVO aVar) {
        C34347m.m133190a(this.f85878a.mo122543g(), ((MediaMessageCell.MediaMessageViewHolder) dVar.f85279a).mImageView, dVar.f85280b, true, this.f85883c);
    }
}
