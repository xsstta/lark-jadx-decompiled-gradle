package com.ss.android.lark.team.api.entity;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.team.entity.Item;
import com.ss.android.lark.team.entity.Team;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/team/api/entity/BindTeamChatResponse;", "Ljava/io/Serializable;", "team", "Lcom/ss/android/lark/team/entity/Team;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatItem", "Lcom/ss/android/lark/team/entity/Item;", "(Lcom/ss/android/lark/team/entity/Team;Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/team/entity/Item;)V", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChatItem", "()Lcom/ss/android/lark/team/entity/Item;", "getTeam", "()Lcom/ss/android/lark/team/entity/Team;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BindTeamChatResponse implements Serializable {
    private final Chat chat;
    private final Item chatItem;
    private final Team team;

    public static /* synthetic */ BindTeamChatResponse copy$default(BindTeamChatResponse bindTeamChatResponse, Team team2, Chat chat2, Item item, int i, Object obj) {
        if ((i & 1) != 0) {
            team2 = bindTeamChatResponse.team;
        }
        if ((i & 2) != 0) {
            chat2 = bindTeamChatResponse.chat;
        }
        if ((i & 4) != 0) {
            item = bindTeamChatResponse.chatItem;
        }
        return bindTeamChatResponse.copy(team2, chat2, item);
    }

    public final Team component1() {
        return this.team;
    }

    public final Chat component2() {
        return this.chat;
    }

    public final Item component3() {
        return this.chatItem;
    }

    public final BindTeamChatResponse copy(Team team2, Chat chat2, Item item) {
        return new BindTeamChatResponse(team2, chat2, item);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindTeamChatResponse)) {
            return false;
        }
        BindTeamChatResponse bindTeamChatResponse = (BindTeamChatResponse) obj;
        return Intrinsics.areEqual(this.team, bindTeamChatResponse.team) && Intrinsics.areEqual(this.chat, bindTeamChatResponse.chat) && Intrinsics.areEqual(this.chatItem, bindTeamChatResponse.chatItem);
    }

    public int hashCode() {
        Team team2 = this.team;
        int i = 0;
        int hashCode = (team2 != null ? team2.hashCode() : 0) * 31;
        Chat chat2 = this.chat;
        int hashCode2 = (hashCode + (chat2 != null ? chat2.hashCode() : 0)) * 31;
        Item item = this.chatItem;
        if (item != null) {
            i = item.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "BindTeamChatResponse(team=" + this.team + ", chat=" + this.chat + ", chatItem=" + this.chatItem + ")";
    }

    public final Chat getChat() {
        return this.chat;
    }

    public final Item getChatItem() {
        return this.chatItem;
    }

    public final Team getTeam() {
        return this.team;
    }

    public BindTeamChatResponse(Team team2, Chat chat2, Item item) {
        this.team = team2;
        this.chat = chat2;
        this.chatItem = item;
    }
}
