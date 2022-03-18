package com.ss.android.lark.chat.entity.chatter;

import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.chatter.IAccess;
import com.ss.android.lark.chat.export.entity.chatter.IChatterDesc;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class ChatChatter extends Chatter implements Serializable {
    String chatId;
    Chatter chatter;
    boolean isOutChatUser;
    String nickName;
    int onCallRole;
    private final List<TagInfo> tagInfos = new ArrayList();

    @Retention(RetentionPolicy.SOURCE)
    public @interface OncallRole {
    }

    public String getChatId() {
        return this.chatId;
    }

    public Chatter getChatter() {
        return this.chatter;
    }

    public String getNickName() {
        return this.nickName;
    }

    public int getOnCallRole() {
        return this.onCallRole;
    }

    public List<TagInfo> getTagInfos() {
        return this.tagInfos;
    }

    public boolean isOutChatUser() {
        return this.isOutChatUser;
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter, com.ss.android.lark.chat.entity.chatter.Chatter
    public IAccess getAccess() {
        return this.chatter.getAccess();
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public AccessInfo getAccessInfo() {
        return this.chatter.getAccessInfo();
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter, com.ss.android.lark.chat.entity.chatter.Chatter
    public String getAlias() {
        return this.chatter.getAlias();
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter, com.ss.android.lark.chat.entity.chatter.Chatter
    public String getAvatarKey() {
        return this.chatter.getAvatarKey();
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public AvatarMedal getAvatarMedal() {
        return this.chatter.getAvatarMedal();
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter, com.ss.android.lark.chat.entity.chatter.Chatter
    public List<ChatterCustomStatus> getCustomStatus() {
        return this.chatter.getCustomStatus();
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter, com.ss.android.lark.chat.entity.chatter.Chatter
    public IChatterDesc getDesc() {
        return this.chatter.getDesc();
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public ChatterDescription getDescription() {
        return this.chatter.getDescription();
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter, com.ss.android.lark.chat.entity.chatter.Chatter
    public String getEnName() {
        return this.chatter.getEnName();
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter, com.ss.android.lark.chat.entity.chatter.Chatter
    public String getId() {
        return this.chatter.getId();
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter, com.ss.android.lark.chat.entity.chatter.Chatter
    public String getLocalizedName() {
        return this.chatter.getLocalizedName();
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter, com.ss.android.lark.chat.entity.chatter.Chatter
    public String getName() {
        return this.chatter.getName();
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public String getNamePinyin() {
        return this.chatter.getNamePinyin();
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter, com.ss.android.lark.chat.entity.chatter.Chatter
    public String getNamePy() {
        return this.chatter.getNamePy();
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public boolean getRegistered() {
        return this.chatter.getRegistered();
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public int getStatus() {
        return this.chatter.getStatus();
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter, com.ss.android.lark.chat.entity.chatter.Chatter
    public String getTenantId() {
        return this.chatter.getTenantId();
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public TimeZone getTimeZone() {
        return this.chatter.getTimeZone();
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public Chatter.ChatterType getType() {
        return this.chatter.getType();
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public long getUpdateTime() {
        return this.chatter.getUpdateTime();
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public String getWithBotTag() {
        return this.chatter.getWithBotTag();
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public WorkStatus getWorkStatus() {
        return this.chatter.getWorkStatus();
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter, com.ss.android.lark.chat.entity.chatter.Chatter
    public long getZenModeEndTime() {
        return this.chatter.getZenModeEndTime();
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public boolean isAcceptSmsPhoneUrgent() {
        return this.chatter.isAcceptSmsPhoneUrgent();
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public boolean isAnonymous() {
        return this.chatter.isAnonymous();
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public boolean isFrozen() {
        return this.chatter.isFrozen();
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public boolean isProfileEnable() {
        return this.chatter.isProfileEnable();
    }

    private ChatChatter() {
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public String getOpenAppId() {
        Chatter chatter2 = this.chatter;
        if (chatter2 != null) {
            return chatter2.getOpenAppId();
        }
        return "";
    }

    public boolean isOncallDuty() {
        int i = this.onCallRole;
        if (i == 4 || i == 5) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public boolean showBotTag() {
        return getChatter().showBotTag();
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setChatter(Chatter chatter2) {
        this.chatter = chatter2;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setOnCallRole(int i) {
        this.onCallRole = i;
    }

    public void setOutChatUser(boolean z) {
        this.isOutChatUser = z;
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public void setAccessInfo(AccessInfo accessInfo) {
        this.chatter.setAccessInfo(accessInfo);
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public void setAvatarKey(String str) {
        this.chatter.setAvatarKey(str);
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public void setAvatarMedal(AvatarMedal avatarMedal) {
        this.chatter.setAvatarMedal(avatarMedal);
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public void setLocalizedName(String str) {
        this.chatter.setLocalizedName(str);
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public void setProfileEnable(boolean z) {
        this.chatter.setProfileEnable(z);
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public void setTimeZone(TimeZone timeZone) {
        this.chatter.setTimeZone(timeZone);
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public void setWorkStatus(WorkStatus workStatus) {
        this.chatter.setWorkStatus(workStatus);
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public void setZenModeEndTime(long j) {
        this.chatter.setZenModeEndTime(j);
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public boolean isItemSame(Chatter chatter2) {
        return equals(chatter2);
    }

    public void setTagInfos(List<TagInfo> list) {
        this.tagInfos.clear();
        this.tagInfos.addAll(list);
    }

    public ChatChatter(Chatter chatter2) {
        this.chatter = chatter2;
        if (chatter2 == null) {
            Log.m165383e("warning", "new ChatChatter with null chatter");
        }
    }

    @Override // java.lang.Comparable, com.ss.android.lark.chat.entity.chatter.Chatter
    public int compareTo(Object obj) {
        if (obj instanceof ChatChatter) {
            return this.chatter.compareTo(((ChatChatter) obj).chatter);
        }
        return 0;
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public boolean equals(Object obj) {
        if (obj instanceof Chatter) {
            return getId().equals(((Chatter) obj).getId());
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.entity.chatter.Chatter
    public boolean isContentSame(Chatter chatter2) {
        if (!(chatter2 instanceof ChatChatter)) {
            return false;
        }
        ChatChatter chatChatter = (ChatChatter) chatter2;
        if (!C26247a.m94983b(this.chatter, chatChatter.chatter) || !C26247a.m94981a(this.chatId, chatChatter.chatId) || !C26247a.m94981a(this.nickName, chatChatter.nickName) || !C26247a.m94981a(Integer.valueOf(this.onCallRole), Integer.valueOf(chatChatter.onCallRole))) {
            return false;
        }
        return true;
    }
}
