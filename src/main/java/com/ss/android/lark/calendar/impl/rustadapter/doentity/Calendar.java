package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import android.text.TextUtils;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.WorkHourSetting;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.io.Serializable;
import java.util.List;

public class Calendar implements Serializable {
    private String externalAccount;
    private int mBackgroundColor;
    private Calendar.CalendarAuthInfo mCalendarAuthInfo;
    private CalendarSchemaCollection mCalendarEventSchema;
    private CalendarSchemaCollection mCalendarSchema;
    private Calendar.CalendarShareInfo mCalendarShareInfo;
    private Calendar.CalendarShareOptions mCalendarShareOptions;
    private long mCreateTime;
    private AccessRole mDefaultAccessRole = AccessRole.FREE_BUSY_READER;
    private List<CalendarEventReminder> mDefaultReminders;
    private String mDefaultTimeZone = "UTC";
    private String mDescription;
    private DirtyType mDirtyType = DirtyType.NONE_DIRTY_TYPE;
    private String mEmail;
    private boolean mExternalPasswordInvalid;
    private int mForegroundColor;
    private String mId;
    private boolean mIsActive = true;
    private boolean mIsAllStaff;
    private boolean mIsCrossTenant;
    private boolean mIsDefault;
    private boolean mIsDisabled;
    private boolean mIsLoading;
    private boolean mIsPrimary;
    private boolean mIsPublic;
    private boolean mIsSubscriber;
    private boolean mIsSynced = true;
    private boolean mIsVisible = true;
    private String mLocalName;
    private String mLocalType;
    private String mLocalizedSummary;
    private String mNote;
    private String mOwnerId;
    private int mResourceCapacity;
    private SchemaExtraData mSchemaExtraData;
    private AccessRole mSelfAccessRole = AccessRole.FREE_BUSY_READER;
    private Status mSelfStatus = Status.DEFAULT;
    private String mServerId;
    private String mSuccessorChatterId;
    private String mSummary;
    private String mTenantId;
    private Type mType = Type.PRIMARY;
    private long mUpdateTime;
    private String mUserId;
    private int mWeight;
    private WorkHourSetting mWorkHourSetting;
    private CalendarMember owner;

    public enum AccessRole {
        UNKNOWN_ACCESS_ROLE(0),
        FREE_BUSY_READER(1),
        READER(2),
        WRITER(3),
        OWNER(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static AccessRole valueOf(int i) {
            return forNumber(i);
        }

        public static AccessRole forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_ACCESS_ROLE;
            }
            if (i == 1) {
                return FREE_BUSY_READER;
            }
            if (i == 2) {
                return READER;
            }
            if (i == 3) {
                return WRITER;
            }
            if (i != 4) {
                return null;
            }
            return OWNER;
        }

        private AccessRole(int i) {
            this.value = i;
        }
    }

    public enum Status {
        DEFAULT(1),
        ACCEPTED(2),
        DECLINED(3),
        INVITED(4),
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
                return DEFAULT;
            }
            if (i == 2) {
                return ACCEPTED;
            }
            if (i == 3) {
                return DECLINED;
            }
            if (i == 4) {
                return INVITED;
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

    public enum Type {
        UNKNOWN_TYPE(0),
        PRIMARY(1),
        OTHER(2),
        GOOGLE(3),
        RESOURCES(4),
        GOOGLE_RESOURCE(5),
        EXCHANGE(8),
        ACTIVITY(9);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_TYPE;
            }
            if (i == 1) {
                return PRIMARY;
            }
            if (i == 2) {
                return OTHER;
            }
            if (i == 3) {
                return GOOGLE;
            }
            if (i == 4) {
                return RESOURCES;
            }
            if (i == 5) {
                return GOOGLE_RESOURCE;
            }
            if (i == 8) {
                return EXCHANGE;
            }
            if (i != 9) {
                return null;
            }
            return ACTIVITY;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public Calendar.CalendarAuthInfo getCalendarAuthInfo() {
        return this.mCalendarAuthInfo;
    }

    public CalendarSchemaCollection getCalendarEventSchema() {
        return this.mCalendarEventSchema;
    }

    public CalendarSchemaCollection getCalendarSchema() {
        return this.mCalendarSchema;
    }

    public Calendar.CalendarShareInfo getCalendarShareInfo() {
        return this.mCalendarShareInfo;
    }

    public Calendar.CalendarShareOptions getCalendarShareOptions() {
        return this.mCalendarShareOptions;
    }

    public long getCreateTime() {
        return this.mCreateTime;
    }

    public AccessRole getDefaultAccessRole() {
        return this.mDefaultAccessRole;
    }

    public List<CalendarEventReminder> getDefaultReminders() {
        return this.mDefaultReminders;
    }

    public String getDefaultTimeZone() {
        return this.mDefaultTimeZone;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public DirtyType getDirtyType() {
        return this.mDirtyType;
    }

    public String getEmail() {
        return this.mEmail;
    }

    public String getExternalAccount() {
        return this.externalAccount;
    }

    public int getForegroundColor() {
        return this.mForegroundColor;
    }

    public String getId() {
        return this.mId;
    }

    public boolean getIsCrossTenant() {
        return this.mIsCrossTenant;
    }

    public String getLocalName() {
        return this.mLocalName;
    }

    public String getLocalType() {
        return this.mLocalType;
    }

    public String getLocalizedSummary() {
        return this.mLocalizedSummary;
    }

    public String getNote() {
        return this.mNote;
    }

    public CalendarMember getOwner() {
        return this.owner;
    }

    public String getOwnerId() {
        return this.mOwnerId;
    }

    public int getResourceCapacity() {
        return this.mResourceCapacity;
    }

    public SchemaExtraData getSchemaExtraData() {
        return this.mSchemaExtraData;
    }

    public AccessRole getSelfAccessRole() {
        return this.mSelfAccessRole;
    }

    public Status getSelfStatus() {
        return this.mSelfStatus;
    }

    public String getServerId() {
        return this.mServerId;
    }

    public String getSuccessorChatterId() {
        return this.mSuccessorChatterId;
    }

    public String getSummary() {
        return this.mSummary;
    }

    public String getTenantId() {
        return this.mTenantId;
    }

    public Type getType() {
        return this.mType;
    }

    public long getUpdateTime() {
        return this.mUpdateTime;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public int getWeight() {
        return this.mWeight;
    }

    public WorkHourSetting getWorkHourSetting() {
        return this.mWorkHourSetting;
    }

    public boolean isActive() {
        return this.mIsActive;
    }

    public boolean isAllStaff() {
        return this.mIsAllStaff;
    }

    public boolean isDefault() {
        return this.mIsDefault;
    }

    public boolean isDisabled() {
        return this.mIsDisabled;
    }

    public boolean isExternalPasswordInvalid() {
        return this.mExternalPasswordInvalid;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public boolean isPrimary() {
        return this.mIsPrimary;
    }

    public boolean isPublic() {
        return this.mIsPublic;
    }

    public boolean isSynced() {
        return this.mIsSynced;
    }

    public boolean isVisible() {
        return this.mIsVisible;
    }

    public boolean isSubscriber() {
        return this.mIsSubscriber;
    }

    public boolean isGoogleCalendar() {
        if (this.mType == Type.GOOGLE) {
            return true;
        }
        return false;
    }

    public boolean isOwnerCalendar() {
        if (this.mSelfAccessRole == AccessRole.OWNER) {
            return true;
        }
        return false;
    }

    public boolean isRealPrimary() {
        if (!isPrimary() || !Type.PRIMARY.equals(getType())) {
            return false;
        }
        return true;
    }

    public boolean isResignedCalendar() {
        if (TextUtils.isEmpty(this.mSuccessorChatterId) || "0".equals(this.mSuccessorChatterId) || this.mType != Type.OTHER) {
            return false;
        }
        return true;
    }

    public boolean isUserIdInValid() {
        if (TextUtils.isEmpty(this.mUserId) || "0".equalsIgnoreCase(this.mUserId)) {
            return true;
        }
        return false;
    }

    public String getNoteOrLocalizeSummary() {
        if (!C30022a.f74883b.mo112688B() && !TextUtils.isEmpty(this.mNote)) {
            return this.mNote;
        }
        if (!TextUtils.isEmpty(this.mLocalizedSummary)) {
            return this.mLocalizedSummary;
        }
        return this.mSummary;
    }

    public void isSubscriber(boolean z) {
        this.mIsSubscriber = z;
    }

    public void setActive(boolean z) {
        this.mIsActive = z;
    }

    public void setBackgroundColor(int i) {
        this.mBackgroundColor = i;
    }

    public void setCalendarAuthInfo(Calendar.CalendarAuthInfo calendarAuthInfo) {
        this.mCalendarAuthInfo = calendarAuthInfo;
    }

    public void setCalendarEventSchema(CalendarSchemaCollection calendarSchemaCollection) {
        this.mCalendarEventSchema = calendarSchemaCollection;
    }

    public void setCalendarSchema(CalendarSchemaCollection calendarSchemaCollection) {
        this.mCalendarSchema = calendarSchemaCollection;
    }

    public void setCalendarShareInfo(Calendar.CalendarShareInfo calendarShareInfo) {
        this.mCalendarShareInfo = calendarShareInfo;
    }

    public void setCalendarShareOptions(Calendar.CalendarShareOptions calendarShareOptions) {
        this.mCalendarShareOptions = calendarShareOptions;
    }

    public void setCreateTime(long j) {
        this.mCreateTime = j;
    }

    public void setDefaultAccessRole(AccessRole accessRole) {
        this.mDefaultAccessRole = accessRole;
    }

    public void setDefaultReminders(List<CalendarEventReminder> list) {
        this.mDefaultReminders = list;
    }

    public void setDefaultTimeZone(String str) {
        this.mDefaultTimeZone = str;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setDirtyType(DirtyType dirtyType) {
        this.mDirtyType = dirtyType;
    }

    public void setEmail(String str) {
        this.mEmail = str;
    }

    public void setExternalAccount(String str) {
        this.externalAccount = str;
    }

    public void setExternalPasswordInvalid(boolean z) {
        this.mExternalPasswordInvalid = z;
    }

    public void setForegroundColor(int i) {
        this.mForegroundColor = i;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setIsAllStaff(boolean z) {
        this.mIsAllStaff = z;
    }

    public void setIsCrossTenant(boolean z) {
        this.mIsCrossTenant = z;
    }

    public void setIsDefault(boolean z) {
        this.mIsDefault = z;
    }

    public void setIsDisabled(boolean z) {
        this.mIsDisabled = z;
    }

    public void setIsLoading(boolean z) {
        this.mIsLoading = z;
    }

    public void setIsPrimary(boolean z) {
        this.mIsPrimary = z;
    }

    public void setIsPublic(boolean z) {
        this.mIsPublic = z;
    }

    public void setIsSynced(boolean z) {
        this.mIsSynced = z;
    }

    public void setIsVisible(boolean z) {
        this.mIsVisible = z;
    }

    public void setLocalName(String str) {
        this.mLocalName = str;
    }

    public void setLocalType(String str) {
        this.mLocalType = str;
    }

    public void setLocalizedSummary(String str) {
        this.mLocalizedSummary = str;
    }

    public void setNote(String str) {
        this.mNote = str;
    }

    public void setOwner(CalendarMember calendarMember) {
        this.owner = calendarMember;
    }

    public void setOwnerId(String str) {
        this.mOwnerId = str;
    }

    public void setResourceCapacity(int i) {
        this.mResourceCapacity = i;
    }

    public void setSelfAccessRole(AccessRole accessRole) {
        this.mSelfAccessRole = accessRole;
    }

    public void setSelfStatus(Status status) {
        this.mSelfStatus = status;
    }

    public void setServerId(String str) {
        this.mServerId = str;
    }

    public void setSuccessorChatterId(String str) {
        this.mSuccessorChatterId = str;
    }

    public void setSummary(String str) {
        this.mSummary = str;
    }

    public void setTenantId(String str) {
        this.mTenantId = str;
    }

    public void setType(Type type) {
        this.mType = type;
    }

    public void setUpdateTime(long j) {
        this.mUpdateTime = j;
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }

    public void setWeight(int i) {
        this.mWeight = i;
    }

    public void setWorkHourSetting(WorkHourSetting workHourSetting) {
        this.mWorkHourSetting = workHourSetting;
    }

    public void setmSchemaExtraData(SchemaExtraData schemaExtraData) {
        this.mSchemaExtraData = schemaExtraData;
    }
}
