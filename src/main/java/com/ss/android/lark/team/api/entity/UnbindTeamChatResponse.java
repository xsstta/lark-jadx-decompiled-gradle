package com.ss.android.lark.team.api.entity;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.team.entity.Item;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/team/api/entity/UnbindTeamChatResponse;", "Ljava/io/Serializable;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "item", "Lcom/ss/android/lark/team/entity/Item;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/team/entity/Item;)V", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "getItem", "()Lcom/ss/android/lark/team/entity/Item;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UnbindTeamChatResponse implements Serializable {
    private final Chat chat;
    private final Item item;

    public static /* synthetic */ UnbindTeamChatResponse copy$default(UnbindTeamChatResponse unbindTeamChatResponse, Chat chat2, Item item2, int i, Object obj) {
        if ((i & 1) != 0) {
            chat2 = unbindTeamChatResponse.chat;
        }
        if ((i & 2) != 0) {
            item2 = unbindTeamChatResponse.item;
        }
        return unbindTeamChatResponse.copy(chat2, item2);
    }

    public final Chat component1() {
        return this.chat;
    }

    public final Item component2() {
        return this.item;
    }

    public final UnbindTeamChatResponse copy(Chat chat2, Item item2) {
        return new UnbindTeamChatResponse(chat2, item2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnbindTeamChatResponse)) {
            return false;
        }
        UnbindTeamChatResponse unbindTeamChatResponse = (UnbindTeamChatResponse) obj;
        return Intrinsics.areEqual(this.chat, unbindTeamChatResponse.chat) && Intrinsics.areEqual(this.item, unbindTeamChatResponse.item);
    }

    public int hashCode() {
        Chat chat2 = this.chat;
        int i = 0;
        int hashCode = (chat2 != null ? chat2.hashCode() : 0) * 31;
        Item item2 = this.item;
        if (item2 != null) {
            i = item2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "UnbindTeamChatResponse(chat=" + this.chat + ", item=" + this.item + ")";
    }

    public final Chat getChat() {
        return this.chat;
    }

    public final Item getItem() {
        return this.item;
    }

    public UnbindTeamChatResponse(Chat chat2, Item item2) {
        this.chat = chat2;
        this.item = item2;
    }
}
