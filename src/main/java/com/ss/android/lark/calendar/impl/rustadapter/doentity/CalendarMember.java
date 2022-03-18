package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import java.io.Serializable;

public class CalendarMember implements Serializable {
    private Calendar.AccessRole mAccessRole = Calendar.AccessRole.READER;
    private String mAvatarKey;
    private String mCalendarId;
    private String mChatId;
    private int mChatMemberCount;
    private String mId;
    private boolean mIsCrossTenant;
    private String mLocalizedName;
    private CalendarMemberType mMemberType = CalendarMemberType.INDIVIDUAL;
    private String mName;
    private Calendar.Status mStatus = Calendar.Status.DEFAULT;
    private String mTenantId;
    private String mUserId;

    public enum CalendarMemberType {
        INDIVIDUAL(1),
        GROUP(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static CalendarMemberType valueOf(int i) {
            return forNumber(i);
        }

        public static CalendarMemberType forNumber(int i) {
            if (i == 1) {
                return INDIVIDUAL;
            }
            if (i != 2) {
                return null;
            }
            return GROUP;
        }

        private CalendarMemberType(int i) {
            this.value = i;
        }
    }

    public Calendar.AccessRole getAccessRole() {
        return this.mAccessRole;
    }

    public String getAvatarKey() {
        return this.mAvatarKey;
    }

    public String getCalendarId() {
        return this.mCalendarId;
    }

    public String getChatId() {
        return this.mChatId;
    }

    public int getChatMemberCount() {
        return this.mChatMemberCount;
    }

    public String getId() {
        return this.mId;
    }

    public String getLocalizedName() {
        return this.mLocalizedName;
    }

    public CalendarMemberType getMemberType() {
        return this.mMemberType;
    }

    public String getName() {
        return this.mName;
    }

    public Calendar.Status getStatus() {
        return this.mStatus;
    }

    public String getTenantId() {
        return this.mTenantId;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public boolean isCrossTenant() {
        return this.mIsCrossTenant;
    }

    public void setAccessRole(Calendar.AccessRole accessRole) {
        this.mAccessRole = accessRole;
    }

    public void setAvatarKey(String str) {
        this.mAvatarKey = str;
    }

    public void setCalendarId(String str) {
        this.mCalendarId = str;
    }

    public void setChatId(String str) {
        this.mChatId = str;
    }

    public void setChatMemberCount(int i) {
        this.mChatMemberCount = i;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setIsCrossTenant(boolean z) {
        this.mIsCrossTenant = z;
    }

    public void setLocalizedName(String str) {
        this.mLocalizedName = str;
    }

    public void setMemberType(CalendarMemberType calendarMemberType) {
        this.mMemberType = calendarMemberType;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setStatus(Calendar.Status status) {
        this.mStatus = status;
    }

    public void setTenantId(String str) {
        this.mTenantId = str;
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }
}
