package com.ss.android.lark.chat.chatwindow.chat.view.message.menu;

import com.ss.android.lark.chat.base.view.vo.message.FolderContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.chatwindow.chat.view.message.FolderMessageCell;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J2\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\u001a\u0010\u000b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/view/message/menu/FolderContextMenuHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/message/menu/DefaultContextMenuHandler;", "Lcom/ss/android/lark/chat/base/view/vo/message/FolderContentVO;", "Lcom/ss/android/lark/chat/chatwindow/chat/view/message/FolderMessageCell$FolderMessageViewHolder;", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "(Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;)V", "onFilterContextMenu", "", "menuItem", "Lcom/ss/android/lark/chat/export/ui/menu/MenuItem;", "dataHolder", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/MenuDataHolder;", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.view.message.b.a */
public final class FolderContextMenuHandler extends C33330b<FolderContentVO, FolderMessageCell.FolderMessageViewHolder> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FolderContextMenuHandler(AbstractC33342d dVar) {
        super(dVar);
        Intrinsics.checkParameterIsNotNull(dVar, "chatContext");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b, com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo120415a(C34029b bVar, Object obj) {
        return mo122822a((C34029b<?>) bVar, (C33141d) obj);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b
    /* renamed from: a */
    public boolean mo122822a(C34029b<?> bVar, C33141d<AbsMessageVO<FolderContentVO>, FolderMessageCell.FolderMessageViewHolder> dVar) {
        if (bVar == null || dVar == null) {
            return true;
        }
        FolderContentVO eVar = (FolderContentVO) dVar.f85280b.mo121699g();
        if (bVar.f87966a == 9 || bVar.f87966a == 11) {
            return !eVar.mo121830g();
        }
        if (bVar.f87966a != 23) {
            return !eVar.mo121832i();
        }
        return true;
    }
}
