package com.ss.android.lark.threaddetail.view.message;

import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatbase.view.post.PostChatView2;
import com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2;

/* renamed from: com.ss.android.lark.threaddetail.view.message.e */
public class C55938e extends ThreadWindowPostCell2 {

    /* renamed from: e */
    private final boolean f138238e;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2
    /* renamed from: a */
    public void mo190689a(PostChatView2 postChatView2, AbsMessageVO aVar) {
        if (this.f138238e) {
            postChatView2.setEnableEllipsize(false);
        } else {
            super.mo190689a(postChatView2, aVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2
    /* renamed from: a */
    public void mo122649a(ThreadWindowPostCell2.PostMessageViewHolder postMessageViewHolder, AbsMessageVO<ContentVO<?>> aVar) {
        if (aVar instanceof ChatMessageVO) {
            if (((ChatMessageVO) aVar).mo124235H()) {
                postMessageViewHolder.mRoot.setVisibility(8);
                return;
            }
            postMessageViewHolder.mRoot.setVisibility(0);
            super.mo122649a(postMessageViewHolder, aVar);
        }
    }

    public C55938e(AbstractC33342d dVar, ThreadWindowPostCell2.AbstractC56194a aVar, boolean z) {
        super(dVar, aVar);
        this.f138238e = z;
    }
}
