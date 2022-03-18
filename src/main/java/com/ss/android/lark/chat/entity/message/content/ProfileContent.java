package com.ss.android.lark.chat.entity.message.content;

import com.alibaba.fastjson.annotation.JSONType;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.export.entity.message.Content;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010#\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010%\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\b¨\u0006&"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/ProfileContent;", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "()V", "avatarKey", "", "getAvatarKey", "()Ljava/lang/String;", "setAvatarKey", "(Ljava/lang/String;)V", "chatterType", "Lcom/ss/android/lark/chat/entity/chatter/Chatter$ChatterType;", "getChatterType", "()Lcom/ss/android/lark/chat/entity/chatter/Chatter$ChatterType;", "setChatterType", "(Lcom/ss/android/lark/chat/entity/chatter/Chatter$ChatterType;)V", "description", "Lcom/ss/android/lark/chat/entity/chatter/ChatterDescription;", "getDescription", "()Lcom/ss/android/lark/chat/entity/chatter/ChatterDescription;", "setDescription", "(Lcom/ss/android/lark/chat/entity/chatter/ChatterDescription;)V", "displayName", "getDisplayName", "setDisplayName", "id", "getId", "setId", "isProfileEnable", "", "()Z", "setProfileEnable", "(Z)V", "tenantId", "getTenantId", "setTenantId", "isContentSame", "diffable", "isItemSame", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
@JSONType(typeName = "ProfileContent")
public final class ProfileContent extends Content {
    private String avatarKey;
    private Chatter.ChatterType chatterType;
    private ChatterDescription description;
    private String displayName;
    private String id;
    private boolean isProfileEnable;
    private String tenantId;

    public final String getAvatarKey() {
        return this.avatarKey;
    }

    public final Chatter.ChatterType getChatterType() {
        return this.chatterType;
    }

    public final ChatterDescription getDescription() {
        return this.description;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTenantId() {
        return this.tenantId;
    }

    public final boolean isProfileEnable() {
        return this.isProfileEnable;
    }

    public final void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public final void setChatterType(Chatter.ChatterType chatterType2) {
        this.chatterType = chatterType2;
    }

    public final void setDescription(ChatterDescription chatterDescription) {
        this.description = chatterDescription;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setProfileEnable(boolean z) {
        this.isProfileEnable = z;
    }

    public final void setTenantId(String str) {
        this.tenantId = str;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.Content
    public boolean isItemSame(Content content) {
        return super.isItemSame(content);
    }

    @Override // com.ss.android.lark.chat.export.entity.message.Content
    public boolean isContentSame(Content content) {
        if (!(content instanceof ProfileContent)) {
            return false;
        }
        if (this == content) {
            return true;
        }
        ProfileContent profileContent = (ProfileContent) content;
        if (!C26247a.m94981a(this.id, profileContent.id) || !C26247a.m94981a(this.displayName, profileContent.displayName) || !C26247a.m94981a(this.avatarKey, profileContent.avatarKey)) {
            return false;
        }
        return super.isContentSame(content);
    }
}
