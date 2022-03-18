package com.ss.android.lark.searchcommon.dto.info;

import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.DeniedReason;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import java.util.List;

public class SearchChatterInfo extends SearchBaseInfo {
    private static final long serialVersionUID = -7571314980887695999L;
    private boolean canJoinGroup;
    private ChatterDescription chatterDescription;
    private Chatter.ChatterType chatterType;
    private String cryptoChatterId;
    private int deniedReason;
    private String enterpriseMailAddress;
    private boolean fromOrganization;
    private boolean hasOUPermission = true;
    private boolean hasSecretPermission = true;
    private boolean inChat;
    private List<String> inChatIds;
    private boolean inContacts;
    private boolean isP2pCryptoChat;
    private boolean isRegistered = true;
    private boolean mIsCustomer;
    private boolean mIsInZenMode;
    private String mailAddress;
    private String p2pChatId;
    private String statusIconKey;
    private List<Chatter.ChatterCustomStatus> statusList;
    private String tenantId;
    private String timeZoneId;
    private WorkStatus workStatus;
    private long zenModeEndTime;

    public ChatterDescription getChatterDescription() {
        return this.chatterDescription;
    }

    public Chatter.ChatterType getChatterType() {
        return this.chatterType;
    }

    public String getCryptoChatterId() {
        return this.cryptoChatterId;
    }

    public int getDeniedReason() {
        return this.deniedReason;
    }

    public String getEnterpriseMailAddress() {
        return this.enterpriseMailAddress;
    }

    public List<String> getInChatIds() {
        return this.inChatIds;
    }

    public String getMailAddress() {
        return this.mailAddress;
    }

    public String getP2pChatId() {
        return this.p2pChatId;
    }

    public String getStatusIconKey() {
        return this.statusIconKey;
    }

    public List<Chatter.ChatterCustomStatus> getStatusList() {
        return this.statusList;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public String getTimeZoneId() {
        return this.timeZoneId;
    }

    public WorkStatus getWorkStatus() {
        return this.workStatus;
    }

    public long getZenModeEndTime() {
        return this.zenModeEndTime;
    }

    public boolean isCanJoinGroup() {
        return this.canJoinGroup;
    }

    public boolean isCustomer() {
        return this.mIsCustomer;
    }

    public boolean isFromOrganization() {
        return this.fromOrganization;
    }

    public boolean isHasOUPermission() {
        return this.hasOUPermission;
    }

    public boolean isHasSecretPermission() {
        return this.hasSecretPermission;
    }

    public boolean isInChat() {
        return this.inChat;
    }

    public boolean isInContacts() {
        return this.inContacts;
    }

    public boolean isInZenMode() {
        return this.mIsInZenMode;
    }

    public boolean isP2pCryptoChat() {
        return this.isP2pCryptoChat;
    }

    public boolean isRegistered() {
        return this.isRegistered;
    }

    public SearchChatterInfo() {
        this.type = 1;
    }

    public String getAvatarId() {
        if (this.isP2pCryptoChat) {
            return this.cryptoChatterId;
        }
        return getId();
    }

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public String getResultTypeForReport() {
        if (this.chatterType == Chatter.ChatterType.BOT) {
            return "single_bot";
        }
        return "contacts";
    }

    public boolean isBeBlocked() {
        if (this.deniedReason == DeniedReason.BE_BLOCKED.getValue()) {
            return true;
        }
        return false;
    }

    public boolean isBlock() {
        if (this.deniedReason == DeniedReason.BLOCKED.getValue()) {
            return true;
        }
        return false;
    }

    public boolean isNotContact() {
        if (this.deniedReason == DeniedReason.NO_FRIENDSHIP.getValue()) {
            return true;
        }
        return false;
    }

    public boolean isBlockOrBeBlocked() {
        if (isBlock() || isBeBlocked()) {
            return true;
        }
        return false;
    }

    public void customer(boolean z) {
        this.mIsCustomer = z;
    }

    public void setCanJoinGroup(boolean z) {
        this.canJoinGroup = z;
    }

    public void setChatterDescription(ChatterDescription chatterDescription2) {
        this.chatterDescription = chatterDescription2;
    }

    public void setChatterType(Chatter.ChatterType chatterType2) {
        this.chatterType = chatterType2;
    }

    public void setCryptoChatterId(String str) {
        this.cryptoChatterId = str;
    }

    public void setDeniedReason(int i) {
        this.deniedReason = i;
    }

    public void setEnterpriseMailAddress(String str) {
        this.enterpriseMailAddress = str;
    }

    public void setFromOrganization(boolean z) {
        this.fromOrganization = z;
    }

    public void setHasOUPermission(boolean z) {
        this.hasOUPermission = z;
    }

    public void setHasSecretPermission(boolean z) {
        this.hasSecretPermission = z;
    }

    public void setInChat(boolean z) {
        this.inChat = z;
    }

    public void setInChatIds(List<String> list) {
        this.inChatIds = list;
    }

    public void setInContacts(boolean z) {
        this.inContacts = z;
    }

    public void setMailAddress(String str) {
        this.mailAddress = str;
    }

    public void setP2pChatId(String str) {
        this.p2pChatId = str;
    }

    public void setP2pCryptoChat(boolean z) {
        this.isP2pCryptoChat = z;
    }

    public void setRegistered(boolean z) {
        this.isRegistered = z;
    }

    public void setStatusIconKey(String str) {
        this.statusIconKey = str;
    }

    public void setStatusList(List<Chatter.ChatterCustomStatus> list) {
        this.statusList = list;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public void setTimeZoneId(String str) {
        this.timeZoneId = str;
    }

    public void setWorkStatus(WorkStatus workStatus2) {
        this.workStatus = workStatus2;
    }

    public void setZenModeEndTime(long j) {
        this.zenModeEndTime = j;
    }

    public void zenMode(boolean z) {
        this.mIsInZenMode = z;
    }
}
