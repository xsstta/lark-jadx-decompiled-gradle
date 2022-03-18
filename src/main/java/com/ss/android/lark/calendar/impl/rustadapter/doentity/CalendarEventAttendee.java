package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.WireEnum;
import com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b;
import java.io.Serializable;
import java.util.List;

public class CalendarEventAttendee implements AbstractC30095b, Serializable, Comparable<CalendarEventAttendee> {
    private Category category = Category.USER;
    private String email;
    private boolean isAnyRemoved;
    private Boolean isForceReleased = false;
    private boolean isSelfInGroup;
    private int mAdditionalGuestsCount;
    private String mAttendeeCalendarId;
    private String mAvatarKey;
    private boolean mDeletable = true;
    private boolean mDisabled;
    private String mDisplayName;
    private String mGroupId;
    private List<CalendarEventAttendee> mGroupMembers;
    private String mId;
    private String mInviterCalendarId;
    private boolean mIsCrossTenantGroup;
    private boolean mIsEditable = true;
    private boolean mIsOptional;
    private boolean mIsOrganizer;
    private String mKey;
    private String mLarkId;
    private String mLocalAttendeeContact;
    private long mLocalAttendeeId;
    private int mLocalAttendeeType;
    private String mLocalizedDisplayName;
    private boolean mOpenSecurity;
    private long mOriginalTime;
    private CalendarSchemaCollection mSchemaCollection;
    private SchemaExtraData mSchemaExtraData;
    private int mShowMemberLimit;
    private Status mStatus = Status.NEEDS_ACTION;
    private String mTags;
    private String mTenantId;
    private String mTimeZoneId;
    private String mUserId;
    private int mValidMemberCount;

    public enum Category implements WireEnum {
        USER(1),
        GROUP(2),
        RESOURCE(3),
        THIRD_PARTY_USER(4);
        
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Category fromValue(int i) {
            if (i == 1) {
                return USER;
            }
            if (i == 2) {
                return GROUP;
            }
            if (i == 3) {
                return RESOURCE;
            }
            if (i != 4) {
                return null;
            }
            return THIRD_PARTY_USER;
        }

        private Category(int i) {
            this.value = i;
        }
    }

    public enum Status {
        NEEDS_ACTION(1),
        ACCEPT(2),
        TENTATIVE(3),
        DECLINE(4),
        REMOVED(5);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Status valueOf(int i) {
            return forNumber(i);
        }

        public static Status forNumber(int i) {
            if (i == 1) {
                return NEEDS_ACTION;
            }
            if (i == 2) {
                return ACCEPT;
            }
            if (i == 3) {
                return TENTATIVE;
            }
            if (i == 4) {
                return DECLINE;
            }
            if (i != 5) {
                return null;
            }
            return REMOVED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public int getAdditionalGuestsCount() {
        return this.mAdditionalGuestsCount;
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b
    public String getAttendeeCalendarId() {
        return this.mAttendeeCalendarId;
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b
    public String getAvatarKey() {
        return this.mAvatarKey;
    }

    public Category getCategory() {
        return this.category;
    }

    public String getDisplayName() {
        return this.mDisplayName;
    }

    public String getEmail() {
        return this.email;
    }

    public Boolean getForceReleased() {
        return this.isForceReleased;
    }

    public String getGroupId() {
        return this.mGroupId;
    }

    public List<CalendarEventAttendee> getGroupMembers() {
        return this.mGroupMembers;
    }

    public String getId() {
        return this.mId;
    }

    public String getInviterCalendarId() {
        return this.mInviterCalendarId;
    }

    public boolean getIsCrossTenantGroup() {
        return this.mIsCrossTenantGroup;
    }

    public String getKey() {
        return this.mKey;
    }

    public String getLarkId() {
        return this.mLarkId;
    }

    public String getLocalAttendeeContact() {
        return this.mLocalAttendeeContact;
    }

    public long getLocalAttendeeId() {
        return this.mLocalAttendeeId;
    }

    public int getLocalAttendeeType() {
        return this.mLocalAttendeeType;
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b
    public String getLocalizedDisplayName() {
        return this.mLocalizedDisplayName;
    }

    public boolean getOpenSecurity() {
        return this.mOpenSecurity;
    }

    public long getOriginalTime() {
        return this.mOriginalTime;
    }

    public CalendarSchemaCollection getSchemaCollection() {
        return this.mSchemaCollection;
    }

    public SchemaExtraData getSchemaExtraData() {
        return this.mSchemaExtraData;
    }

    public int getShowMemberLimit() {
        return this.mShowMemberLimit;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b
    public String getTenantId() {
        return this.mTenantId;
    }

    public String getTimeZoneId() {
        return this.mTimeZoneId;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public int getValidMemberCount() {
        return this.mValidMemberCount;
    }

    public boolean isAnyRemoved() {
        return this.isAnyRemoved;
    }

    public boolean isDeletable() {
        return this.mDeletable;
    }

    public boolean isDisabled() {
        return this.mDisabled;
    }

    public boolean isEditable() {
        return this.mIsEditable;
    }

    public boolean isOptional() {
        return this.mIsOptional;
    }

    public boolean isOrganizer() {
        return this.mIsOrganizer;
    }

    public boolean isSelfInGroup() {
        return this.isSelfInGroup;
    }

    public boolean isGroup() {
        return Category.GROUP.equals(this.category);
    }

    public boolean isResource() {
        return Category.RESOURCE.equals(this.category);
    }

    public boolean isThirdParty() {
        return Category.THIRD_PARTY_USER.equals(this.category);
    }

    public CalendarEventAttendee() {
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b
    public String getAvatarEntityId() {
        if (this.category == Category.USER) {
            return this.mUserId;
        }
        if (this.category == Category.GROUP) {
            return this.mGroupId;
        }
        return "";
    }

    private int getPriority() {
        if (isOrganizer()) {
            return 0;
        }
        if (getStatus() == Status.ACCEPT) {
            return 1;
        }
        if (getStatus() == Status.TENTATIVE) {
            return 2;
        }
        if (getStatus() == Status.DECLINE) {
            return 3;
        }
        if (getStatus() == Status.NEEDS_ACTION) {
            return 4;
        }
        return HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
    }

    public void setAdditionalGuestsCount(int i) {
        this.mAdditionalGuestsCount = i;
    }

    public void setAttendeeCalendarId(String str) {
        this.mAttendeeCalendarId = str;
    }

    public void setAvatarKey(String str) {
        this.mAvatarKey = str;
    }

    public void setCategory(Category category2) {
        this.category = category2;
    }

    public void setDeletable(boolean z) {
        this.mDeletable = z;
    }

    public void setDisabled(boolean z) {
        this.mDisabled = z;
    }

    public void setDisplayName(String str) {
        this.mDisplayName = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setForceReleased(Boolean bool) {
        this.isForceReleased = bool;
    }

    public void setGroupId(String str) {
        this.mGroupId = str;
    }

    public void setGroupMembers(List<CalendarEventAttendee> list) {
        this.mGroupMembers = list;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setInviterCalendarId(String str) {
        this.mInviterCalendarId = str;
    }

    public void setIsAnyRemoved(boolean z) {
        this.isAnyRemoved = z;
    }

    public void setIsCrossTenantGroup(boolean z) {
        this.mIsCrossTenantGroup = z;
    }

    public void setIsEditable(boolean z) {
        this.mIsEditable = z;
    }

    public void setIsOptional(boolean z) {
        this.mIsOptional = z;
    }

    public void setIsOrganizer(boolean z) {
        this.mIsOrganizer = z;
    }

    public void setIsSelfInGroup(boolean z) {
        this.isSelfInGroup = z;
    }

    public void setKey(String str) {
        this.mKey = str;
    }

    public void setLarkId(String str) {
        this.mLarkId = str;
    }

    public void setLocalAttendeeContact(String str) {
        this.mLocalAttendeeContact = str;
    }

    public void setLocalAttendeeId(long j) {
        this.mLocalAttendeeId = j;
    }

    public void setLocalAttendeeType(int i) {
        this.mLocalAttendeeType = i;
    }

    public void setLocalizedDisplayName(String str) {
        this.mLocalizedDisplayName = str;
    }

    public void setOpenSecurity(boolean z) {
        this.mOpenSecurity = z;
    }

    public void setOriginalTime(long j) {
        this.mOriginalTime = j;
    }

    public void setSchemaCollection(CalendarSchemaCollection calendarSchemaCollection) {
        this.mSchemaCollection = calendarSchemaCollection;
    }

    public void setSchemaExtraData(SchemaExtraData schemaExtraData) {
        this.mSchemaExtraData = schemaExtraData;
    }

    public void setShowMemberLimit(int i) {
        this.mShowMemberLimit = i;
    }

    public void setStatus(Status status) {
        this.mStatus = status;
    }

    public void setTenantId(String str) {
        this.mTenantId = str;
    }

    public void setTimeZoneId(String str) {
        this.mTimeZoneId = str;
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }

    public void setValidMemberCount(int i) {
        this.mValidMemberCount = i;
    }

    public void setIsGroup(boolean z) {
        if (z) {
            this.category = Category.GROUP;
        }
    }

    public void setIsResource(boolean z) {
        if (z) {
            this.category = Category.RESOURCE;
        }
    }

    public void setThirdParty(boolean z) {
        if (z) {
            this.category = Category.THIRD_PARTY_USER;
        }
    }

    public int compareTo(CalendarEventAttendee calendarEventAttendee) {
        if (getPriority() < calendarEventAttendee.getPriority()) {
            return -1;
        }
        if (getPriority() == calendarEventAttendee.getPriority()) {
            return 0;
        }
        return 1;
    }

    public boolean isOuterUser(String str) {
        if (!TextUtils.isEmpty(this.mTenantId) && !this.mTenantId.equals(str) && !"-1".equals(this.mTenantId)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof CalendarEventAttendee)) {
            return false;
        }
        CalendarEventAttendee calendarEventAttendee = (CalendarEventAttendee) obj;
        if (Category.THIRD_PARTY_USER.equals(this.category) && Category.THIRD_PARTY_USER.equals(calendarEventAttendee.category)) {
            return this.email.equals(calendarEventAttendee.email);
        }
        if (!TextUtils.isEmpty(this.mLarkId) && !TextUtils.isEmpty(calendarEventAttendee.getLarkId())) {
            return this.mLarkId.equals(calendarEventAttendee.getLarkId());
        }
        if (TextUtils.isEmpty(calendarEventAttendee.getGroupId())) {
            return this.mAttendeeCalendarId.equals(calendarEventAttendee.getAttendeeCalendarId());
        }
        if (!TextUtils.isEmpty(this.mGroupId)) {
            return this.mGroupId.equals(calendarEventAttendee.getGroupId());
        }
        return false;
    }

    public CalendarEventAttendee(CalendarEventAttendee calendarEventAttendee) {
        this.mId = calendarEventAttendee.mId;
        this.mKey = calendarEventAttendee.mKey;
        this.mOriginalTime = calendarEventAttendee.mOriginalTime;
        this.mDisplayName = calendarEventAttendee.mDisplayName;
        this.mLocalizedDisplayName = calendarEventAttendee.mLocalizedDisplayName;
        this.mAttendeeCalendarId = calendarEventAttendee.mAttendeeCalendarId;
        this.mIsOrganizer = calendarEventAttendee.mIsOrganizer;
        this.mIsOptional = calendarEventAttendee.mIsOptional;
        this.mStatus = calendarEventAttendee.mStatus;
        this.mAdditionalGuestsCount = calendarEventAttendee.mAdditionalGuestsCount;
        this.mAvatarKey = calendarEventAttendee.mAvatarKey;
        this.mLarkId = calendarEventAttendee.mLarkId;
        this.mGroupId = calendarEventAttendee.mGroupId;
        this.mGroupMembers = calendarEventAttendee.mGroupMembers;
        this.mDeletable = calendarEventAttendee.mDeletable;
        this.mLocalAttendeeContact = calendarEventAttendee.mLocalAttendeeContact;
        this.mLocalAttendeeType = calendarEventAttendee.mLocalAttendeeType;
        this.mLocalAttendeeId = calendarEventAttendee.mLocalAttendeeId;
        this.mIsCrossTenantGroup = calendarEventAttendee.mIsCrossTenantGroup;
        this.mTenantId = calendarEventAttendee.mTenantId;
        this.mOpenSecurity = calendarEventAttendee.mOpenSecurity;
        this.mShowMemberLimit = calendarEventAttendee.mShowMemberLimit;
        this.mDisabled = calendarEventAttendee.mDisabled;
        this.mIsEditable = calendarEventAttendee.mIsEditable;
        this.mInviterCalendarId = calendarEventAttendee.mInviterCalendarId;
        this.email = calendarEventAttendee.email;
        this.category = calendarEventAttendee.category;
        this.mUserId = calendarEventAttendee.mUserId;
        this.mTimeZoneId = calendarEventAttendee.mTimeZoneId;
        this.mSchemaCollection = calendarEventAttendee.mSchemaCollection;
        this.mValidMemberCount = calendarEventAttendee.mValidMemberCount;
        this.isAnyRemoved = calendarEventAttendee.isAnyRemoved;
        this.isSelfInGroup = calendarEventAttendee.isSelfInGroup;
        SchemaExtraData schemaExtraData = calendarEventAttendee.mSchemaExtraData;
        if (schemaExtraData != null) {
            this.mSchemaExtraData = schemaExtraData.copy();
        } else {
            this.mSchemaExtraData = null;
        }
    }
}
