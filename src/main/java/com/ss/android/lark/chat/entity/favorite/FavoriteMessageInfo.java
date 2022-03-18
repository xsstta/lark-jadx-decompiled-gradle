package com.ss.android.lark.chat.entity.favorite;

import com.bytedance.lark.pb.basic.v1.FavoritesType;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import java.io.Serializable;

public class FavoriteMessageInfo implements Serializable, Comparable<FavoriteMessageInfo> {
    private long createTime;
    private String id;
    private Chat sourceChat;
    private Chatter sourceChatter;
    private Message sourceMessage;
    private FavoritesType type;

    public long getCreateTime() {
        return this.createTime;
    }

    public String getId() {
        return this.id;
    }

    public Chat getSourceChat() {
        return this.sourceChat;
    }

    public Chatter getSourceChatter() {
        return this.sourceChatter;
    }

    public Message getSourceMessage() {
        return this.sourceMessage;
    }

    public FavoritesType getType() {
        return this.type;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setSourceChat(Chat chat) {
        this.sourceChat = chat;
    }

    public void setSourceChatter(Chatter chatter) {
        this.sourceChatter = chatter;
    }

    public void setSourceMessage(Message message) {
        this.sourceMessage = message;
    }

    public void setType(FavoritesType favoritesType) {
        this.type = favoritesType;
    }

    public int compareTo(FavoriteMessageInfo favoriteMessageInfo) {
        if (this.createTime < favoriteMessageInfo.createTime) {
            return -1;
        }
        return 1;
    }
}
