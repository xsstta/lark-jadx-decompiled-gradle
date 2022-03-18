package com.ss.android.lark.chat.entity.chatter;

import com.ss.android.lark.chat.entity.chatter.Chatter;
import java.io.Serializable;

public class ChatterInfo implements Serializable {
    private String avatarKey;
    private String id;
    private boolean isAnonymous;
    private String name;
    private Chatter.ChatterType type;

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Chatter.ChatterType getType() {
        return this.type;
    }

    public boolean isAnonymous() {
        return this.isAnonymous;
    }

    public void setAnonymous(boolean z) {
        this.isAnonymous = z;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(Chatter.ChatterType chatterType) {
        this.type = chatterType;
    }
}
