package com.ss.android.lark.contact.dto;

import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import java.util.List;

public class ChatterSelectBean extends BaseSelectBean {
    private static final long serialVersionUID = -8980352757996945035L;
    private ChatterDescription chatterDescription;
    private Chatter.ChatterType chatterType;
    private boolean hasOUPermission = true;
    private boolean isRegistered;
    private String mailAddress;
    private List<String> mailAddressHitTerms;
    private String tenantId;
    private String timeZoneId;
    private WorkStatus workStatus;

    @Override // com.ss.android.lark.contact.dto.BaseSelectBean
    public int getType() {
        return 2;
    }

    public ChatterDescription getChatterDescription() {
        return this.chatterDescription;
    }

    public Chatter.ChatterType getChatterType() {
        return this.chatterType;
    }

    public String getMailAddress() {
        return this.mailAddress;
    }

    public List<String> getMailAddressHitTerms() {
        return this.mailAddressHitTerms;
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

    public boolean isHasOUPermission() {
        return this.hasOUPermission;
    }

    public boolean isRegistered() {
        return this.isRegistered;
    }

    public boolean isCustomer() {
        return "0".equals(this.tenantId);
    }

    public void setChatterDescription(ChatterDescription chatterDescription2) {
        this.chatterDescription = chatterDescription2;
    }

    public void setChatterType(Chatter.ChatterType chatterType2) {
        this.chatterType = chatterType2;
    }

    public void setHasOUPermission(boolean z) {
        this.hasOUPermission = z;
    }

    public void setMailAddress(String str) {
        this.mailAddress = str;
    }

    public void setMailAddressHitTerms(List<String> list) {
        this.mailAddressHitTerms = list;
    }

    public void setRegistered(boolean z) {
        this.isRegistered = z;
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
}
