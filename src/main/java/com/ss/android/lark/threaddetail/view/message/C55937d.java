package com.ss.android.lark.threaddetail.view.message;

import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.core.view.PostChatView;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell;

/* renamed from: com.ss.android.lark.threaddetail.view.message.d */
public class C55937d extends ThreadWindowPostCell {

    /* renamed from: g */
    private final boolean f138237g;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell
    /* renamed from: a */
    public void mo190687a(PostChatView postChatView) {
        if (this.f138237g) {
            postChatView.setEnableEllipsize(false);
        } else {
            super.mo190687a(postChatView);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell
    /* renamed from: a */
    public void mo122649a(ThreadWindowPostCell.PostMessageViewHolder postMessageViewHolder, AbsMessageVO<ContentVO<?>> aVar) {
        if (aVar instanceof ChatMessageVO) {
            if (((ChatMessageVO) aVar).mo124235H()) {
                postMessageViewHolder.mRoot.setVisibility(8);
                return;
            }
            postMessageViewHolder.mRoot.setVisibility(0);
            super.mo122649a(postMessageViewHolder, aVar);
        }
    }

    public C55937d(AbstractC33342d dVar, ThreadWindowPostCell.AbstractC56183a aVar, boolean z) {
        super(dVar, aVar);
        this.f138237g = z;
    }
}
