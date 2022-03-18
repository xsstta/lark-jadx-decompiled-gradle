package com.ss.android.lark.chat.export.entity.message.content;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/message/content/InviteAtChatters;", "Lcom/ss/android/lark/chat/export/entity/message/content/SystemMessageItemAction;", "chatters", "", "", "(Ljava/util/List;)V", "getChatters", "()Ljava/util/List;", "setChatters", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.export.entity.message.content.b */
public final class InviteAtChatters extends SystemMessageItemAction {

    /* renamed from: a */
    private List<String> f87962a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof InviteAtChatters) && Intrinsics.areEqual(this.f87962a, ((InviteAtChatters) obj).f87962a);
        }
        return true;
    }

    public int hashCode() {
        List<String> list = this.f87962a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "InviteAtChatters(chatters=" + this.f87962a + ")";
    }

    /* renamed from: a */
    public final List<String> mo126117a() {
        return this.f87962a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteAtChatters(List<String> list) {
        super(2);
        Intrinsics.checkParameterIsNotNull(list, "chatters");
        this.f87962a = list;
    }
}
