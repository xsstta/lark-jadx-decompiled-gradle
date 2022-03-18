package com.ss.android.lark.chat.entity.chatter;

import android.text.TextUtils;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.export.entity.chatter.IAccess;
import com.ss.android.lark.chat.export.entity.chatter.IChatterDesc;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Chatter implements AbstractC26248b<Chatter>, OpenChatter, Serializable, Comparable {
    private static final long serialVersionUID = 7837580756091984831L;
    private boolean acceptSmsPhoneUrgent;
    private AccessInfo accessInfo;
    private String alias;
    private String avatarKey;
    private AvatarMedal avatarMedal;
    private List<String> avatarUrls;
    private boolean canJoinGroup;
    private String creatorId;
    private List<ChatterCustomStatus> customStatus;
    private ChatterDescription description = new ChatterDescription();
    private String enName;
    private String id;
    private boolean inContacts;
    private boolean isAnonymous;
    private boolean isCollaboration = false;
    private boolean isCrossTenant = false;
    private boolean isFrozen;
    private boolean isRegistered;
    private String localizedName;
    private String name;
    private String namePinyin;
    private String namePy;
    private String openAppId;
    private boolean profileEnable;
    private int status;
    private String tenantId;
    private List<String> thumbnails;
    private TimeZone timeZone;
    private ChatterType type;
    private long updateTime;
    private long weight;
    private String withBotTag;
    private WorkStatus workStatus;
    private long zenModeEndTime;

    public enum ChatterType {
        UNKNOWN(0),
        USER(1),
        BOT(2);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static ChatterType valueOf(int i) {
            return forNumber(i);
        }

        public static ChatterType forNumber(int i) {
            if (i == 1) {
                return USER;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return BOT;
        }

        private ChatterType(int i) {
            this.value = i;
        }
    }

    public AccessInfo getAccessInfo() {
        return this.accessInfo;
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter
    public String getAlias() {
        return this.alias;
    }

    public AvatarMedal getAvatarMedal() {
        return this.avatarMedal;
    }

    public List<String> getAvatarUrls() {
        return this.avatarUrls;
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter
    public List<ChatterCustomStatus> getCustomStatus() {
        return this.customStatus;
    }

    public ChatterDescription getDescription() {
        return this.description;
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter
    public String getEnName() {
        return this.enName;
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter
    public String getId() {
        return this.id;
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter
    public String getLocalizedName() {
        return this.localizedName;
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter
    public String getName() {
        return this.name;
    }

    public String getNamePinyin() {
        return this.namePinyin;
    }

    public String getOpenAppId() {
        return this.openAppId;
    }

    public boolean getRegistered() {
        return this.isRegistered;
    }

    public int getStatus() {
        return this.status;
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter
    public String getTenantId() {
        return this.tenantId;
    }

    public List<String> getThumbnails() {
        return this.thumbnails;
    }

    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public ChatterType getType() {
        return this.type;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public String getWithBotTag() {
        return this.withBotTag;
    }

    public WorkStatus getWorkStatus() {
        return this.workStatus;
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter
    public long getZenModeEndTime() {
        return this.zenModeEndTime;
    }

    public boolean isAcceptSmsPhoneUrgent() {
        return this.acceptSmsPhoneUrgent;
    }

    public boolean isAnonymous() {
        return this.isAnonymous;
    }

    public boolean isCanJoinGroup() {
        return this.canJoinGroup;
    }

    public boolean isCollaboration() {
        return this.isCollaboration;
    }

    public boolean isCrossTenant() {
        return this.isCrossTenant;
    }

    public boolean isFrozen() {
        return this.isFrozen;
    }

    public boolean isInContacts() {
        return this.inContacts;
    }

    public boolean isProfileEnable() {
        return this.profileEnable;
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter
    public boolean isRegistered() {
        return this.isRegistered;
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter
    public String getAvatarKey() {
        String str = this.avatarKey;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter
    public IAccess getAccess() {
        AccessInfo accessInfo2 = this.accessInfo;
        if (accessInfo2 != null) {
            return accessInfo2;
        }
        return IAccess.f87956a.mo126088a();
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter
    public IChatterDesc getDesc() {
        ChatterDescription chatterDescription = this.description;
        if (chatterDescription != null) {
            return chatterDescription;
        }
        return IChatterDesc.f87951a.mo126086a();
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter
    public String getNamePy() {
        if (TextUtils.isEmpty(this.namePy)) {
            return "#";
        }
        return this.namePy;
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter
    public boolean isBot() {
        if (getType() == ChatterType.BOT) {
            return true;
        }
        return false;
    }

    public boolean isCustomer() {
        return "0".equals(this.tenantId);
    }

    public boolean isUser() {
        if (getType() == ChatterType.USER) {
            return true;
        }
        return false;
    }

    public void setDimission() {
        int i = this.status;
        if ((i & 2) == 0) {
            this.status = i | 2;
        }
    }

    @Override // com.ss.android.lark.chat.export.entity.chatter.OpenChatter
    public boolean isDimission() {
        if (getType() != ChatterType.BOT && (getStatus() & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean showBotTag() {
        if (ChatterType.BOT != getType() || !"bot".equals(this.withBotTag)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Chatter{id='" + this.id + '\'' + ", name='" + this.name + '\'' + ", status=" + this.status + ", type=" + this.type + ", withBotTag='" + this.withBotTag + '\'' + ", inContacts=" + this.inContacts + ", canJoinGroup=" + this.canJoinGroup + ", profileEnable=" + this.profileEnable + '}';
    }

    public void setAcceptSmsPhoneUrgent(boolean z) {
        this.acceptSmsPhoneUrgent = z;
    }

    public void setAccessInfo(AccessInfo accessInfo2) {
        this.accessInfo = accessInfo2;
    }

    public void setAlias(String str) {
        this.alias = str;
    }

    public void setAnonymous(boolean z) {
        this.isAnonymous = z;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setAvatarMedal(AvatarMedal avatarMedal2) {
        this.avatarMedal = avatarMedal2;
    }

    public void setAvatarUrls(List<String> list) {
        this.avatarUrls = list;
    }

    public void setCanJoinGroup(boolean z) {
        this.canJoinGroup = z;
    }

    public void setCollaboration(boolean z) {
        this.isCollaboration = z;
    }

    public void setCreatorId(String str) {
        this.creatorId = str;
    }

    public void setCrossTenant(boolean z) {
        this.isCrossTenant = z;
    }

    public void setCustomStatus(List<ChatterCustomStatus> list) {
        this.customStatus = list;
    }

    public void setDescription(ChatterDescription chatterDescription) {
        this.description = chatterDescription;
    }

    public void setEnName(String str) {
        this.enName = str;
    }

    public void setFrozen(boolean z) {
        this.isFrozen = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setInContacts(boolean z) {
        this.inContacts = z;
    }

    public void setLocalizedName(String str) {
        this.localizedName = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNamePinyin(String str) {
        this.namePinyin = str;
    }

    public void setNamePy(String str) {
        this.namePy = str;
    }

    public void setOpenAppId(String str) {
        this.openAppId = str;
    }

    public void setProfileEnable(boolean z) {
        this.profileEnable = z;
    }

    public void setRegistered(boolean z) {
        this.isRegistered = z;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public void setThumbnails(List<String> list) {
        this.thumbnails = list;
    }

    public void setTimeZone(TimeZone timeZone2) {
        this.timeZone = timeZone2;
    }

    public void setType(ChatterType chatterType) {
        this.type = chatterType;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public void setWithBotTag(String str) {
        this.withBotTag = str;
    }

    public void setWorkStatus(WorkStatus workStatus2) {
        this.workStatus = workStatus2;
    }

    public void setZenModeEndTime(long j) {
        this.zenModeEndTime = j;
    }

    public boolean isItemSame(Chatter chatter) {
        return equals(chatter);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Chatter) {
            return getId().equals(((Chatter) obj).getId());
        }
        return false;
    }

    public boolean exactlyCompare(Chatter chatter) {
        boolean equals = equals(chatter);
        if (!equals || TextUtils.equals(chatter.getAvatarKey(), getAvatarKey())) {
            return equals;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof Chatter)) {
            return 0;
        }
        String str = this.localizedName;
        if (!TextUtils.isEmpty(this.namePy) && !this.namePy.equals("#")) {
            str = this.namePy;
        }
        Chatter chatter = (Chatter) obj;
        String namePy2 = chatter.getNamePy();
        if (TextUtils.isEmpty(namePy2) || namePy2.equals("#")) {
            namePy2 = chatter.getLocalizedName();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.compareToIgnoreCase(namePy2) == 0) {
            return this.id.compareTo(chatter.getId());
        }
        return str.compareToIgnoreCase(namePy2);
    }

    public boolean isContentSame(Chatter chatter) {
        if (C26247a.m94981a(this.name, chatter.getName()) && C26247a.m94981a(this.localizedName, chatter.localizedName) && C26247a.m94981a(this.alias, chatter.alias) && this.status == chatter.getStatus() && C26247a.m94981a(this.avatarKey, chatter.getAvatarKey()) && this.updateTime == chatter.getUpdateTime() && C26247a.m94981a(this.namePy, chatter.getNamePy()) && C26247a.m94981a(this.description, chatter.getDescription()) && C26247a.m94981a(this.enName, chatter.getEnName()) && C26247a.m94981a(this.workStatus, chatter.getWorkStatus()) && C26247a.m94981a((Object) this.customStatus, (Object) chatter.getCustomStatus()) && Objects.equals(this.avatarMedal, chatter.avatarMedal)) {
            return true;
        }
        return false;
    }
}
