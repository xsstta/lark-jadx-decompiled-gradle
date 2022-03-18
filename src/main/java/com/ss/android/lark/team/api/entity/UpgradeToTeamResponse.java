package com.ss.android.lark.team.api.entity;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.team.entity.Item;
import com.ss.android.lark.team.entity.Team;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006%"}, d2 = {"Lcom/ss/android/lark/team/api/entity/UpgradeToTeamResponse;", "Ljava/io/Serializable;", "team", "Lcom/ss/android/lark/team/entity/Team;", "teamItem", "Lcom/ss/android/lark/team/entity/Item;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatItem", "(Lcom/ss/android/lark/team/entity/Team;Lcom/ss/android/lark/team/entity/Item;Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/team/entity/Item;)V", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "setChat", "(Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "getChatItem", "()Lcom/ss/android/lark/team/entity/Item;", "setChatItem", "(Lcom/ss/android/lark/team/entity/Item;)V", "getTeam", "()Lcom/ss/android/lark/team/entity/Team;", "setTeam", "(Lcom/ss/android/lark/team/entity/Team;)V", "getTeamItem", "setTeamItem", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UpgradeToTeamResponse implements Serializable {
    private Chat chat;
    private Item chatItem;
    private Team team;
    private Item teamItem;

    public static /* synthetic */ UpgradeToTeamResponse copy$default(UpgradeToTeamResponse upgradeToTeamResponse, Team team2, Item item, Chat chat2, Item item2, int i, Object obj) {
        if ((i & 1) != 0) {
            team2 = upgradeToTeamResponse.team;
        }
        if ((i & 2) != 0) {
            item = upgradeToTeamResponse.teamItem;
        }
        if ((i & 4) != 0) {
            chat2 = upgradeToTeamResponse.chat;
        }
        if ((i & 8) != 0) {
            item2 = upgradeToTeamResponse.chatItem;
        }
        return upgradeToTeamResponse.copy(team2, item, chat2, item2);
    }

    public final Team component1() {
        return this.team;
    }

    public final Item component2() {
        return this.teamItem;
    }

    public final Chat component3() {
        return this.chat;
    }

    public final Item component4() {
        return this.chatItem;
    }

    public final UpgradeToTeamResponse copy(Team team2, Item item, Chat chat2, Item item2) {
        return new UpgradeToTeamResponse(team2, item, chat2, item2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpgradeToTeamResponse)) {
            return false;
        }
        UpgradeToTeamResponse upgradeToTeamResponse = (UpgradeToTeamResponse) obj;
        return Intrinsics.areEqual(this.team, upgradeToTeamResponse.team) && Intrinsics.areEqual(this.teamItem, upgradeToTeamResponse.teamItem) && Intrinsics.areEqual(this.chat, upgradeToTeamResponse.chat) && Intrinsics.areEqual(this.chatItem, upgradeToTeamResponse.chatItem);
    }

    public int hashCode() {
        Team team2 = this.team;
        int i = 0;
        int hashCode = (team2 != null ? team2.hashCode() : 0) * 31;
        Item item = this.teamItem;
        int hashCode2 = (hashCode + (item != null ? item.hashCode() : 0)) * 31;
        Chat chat2 = this.chat;
        int hashCode3 = (hashCode2 + (chat2 != null ? chat2.hashCode() : 0)) * 31;
        Item item2 = this.chatItem;
        if (item2 != null) {
            i = item2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "UpgradeToTeamResponse(team=" + this.team + ", teamItem=" + this.teamItem + ", chat=" + this.chat + ", chatItem=" + this.chatItem + ")";
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

    public final Item getTeamItem() {
        return this.teamItem;
    }

    public final void setChat(Chat chat2) {
        this.chat = chat2;
    }

    public final void setChatItem(Item item) {
        this.chatItem = item;
    }

    public final void setTeam(Team team2) {
        this.team = team2;
    }

    public final void setTeamItem(Item item) {
        this.teamItem = item;
    }

    public UpgradeToTeamResponse(Team team2, Item item, Chat chat2, Item item2) {
        this.team = team2;
        this.teamItem = item;
        this.chat = chat2;
        this.chatItem = item2;
    }
}
