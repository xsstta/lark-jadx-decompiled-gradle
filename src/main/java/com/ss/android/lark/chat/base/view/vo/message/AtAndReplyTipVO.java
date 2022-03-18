package com.ss.android.lark.chat.base.view.vo.message;

import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\u0016J\u0016\u0010\u0017\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/AtAndReplyTipVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/TextContent;", "()V", "atReplyCount", "", "getAtReplyCount", "()I", "setAtReplyCount", "(I)V", "lastAtChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "getLastAtChatter", "()Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "setLastAtChatter", "(Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;)V", "replyCount", "getReplyCount", "setReplyCount", "canReply", "", "isContentSame", "diffable", "isItemSame", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.a */
public final class AtAndReplyTipVO extends ContentVO<TextContent> {

    /* renamed from: a */
    private ChatChatter f84787a;

    /* renamed from: b */
    private int f84788b;

    /* renamed from: c */
    private int f84789c;

    /* renamed from: a */
    public final ChatChatter mo121793a() {
        return this.f84787a;
    }

    /* renamed from: b */
    public final int mo121794b() {
        return this.f84788b;
    }

    /* renamed from: c */
    public final int mo121795c() {
        return this.f84789c;
    }

    public AtAndReplyTipVO() {
        super(new TextContent());
    }

    @Override // com.ss.android.lark.chat.export.vo.ContentVO
    /* renamed from: a */
    public boolean mo121780a(ContentVO<?> aVar) {
        if (!super.mo121780a(aVar) || !(aVar instanceof AtAndReplyTipVO)) {
            return false;
        }
        AtAndReplyTipVO aVar2 = (AtAndReplyTipVO) aVar;
        if (C26247a.m94981a((Object) this.f84787a, (Object) aVar2.f84787a) && this.f84788b == aVar2.f84788b && this.f84789c == aVar2.f84789c) {
            return true;
        }
        return false;
    }
}
