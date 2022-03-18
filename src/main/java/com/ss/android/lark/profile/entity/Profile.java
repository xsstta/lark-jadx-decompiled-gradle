package com.ss.android.lark.profile.entity;

import android.text.TextUtils;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;

public class Profile implements Serializable {
    public static final String[] DEFAULT_FIELD_KEY = {"B-DESCRIPTION", "B-CALENDARSCHEDULE", "B-CHATGROUPNICKNAME", "B-DEPARTMENT", "B-EMAIL", "B-LEADER", "B-CITY", "B-ALIAS", "B-FRIENDAPPLYREASON", "B-FRIENDLINK", "B-MORE", "B-UNIT", "B-POSITION"};
    private static final long serialVersionUID = 2832176776710183791L;
    private AccessInfo accessInfo;
    private String alias;
    private String applicationReason;
    private String avatarKey;
    private String city;
    private String contactApplicationId;
    private String contactToken;
    private HashMap<String, CustomProfileField> customField;
    private String department;
    private ChatterDescription description;
    private List<String> displayFieldList;
    private String email;
    private String employeeId;
    private String enName;
    private String gender;
    private int genderType;
    private String id;
    private boolean isAdmin;
    private boolean isFriend;
    private boolean isRequestUserApplied;
    private boolean isResigned;
    private boolean isTargetUserApplied;
    private boolean isTopicGroupAdmin;
    private String leaderEnName;
    private String leaderId;
    private String leaderLocalizedName;
    private String leaderName;
    private String leaderUrl;
    private String localizedName;
    private DepartmentList mDepartmentMetaList;
    private OrgUnit mOrgUnit;
    private Position mPosition;
    private String microAppProfileUrl;
    private String name;
    private String organization;
    private String profile;
    private STATUE status;
    private String tenant;
    private String tenantId;
    private WorkStatus workStatus;
    private long zenModeEndTime;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Gender {
    }

    public enum STATUE {
        ON_DEFAULT(0),
        ON_BUSINESS(1),
        ON_LEAVE(2),
        ON_MEETING(3),
        ON_UNKNOWN(-1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static STATUE valueOf(int i) {
            return forNumber(i);
        }

        public static STATUE forNumber(int i) {
            if (i == 0) {
                return ON_DEFAULT;
            }
            if (i == 1) {
                return ON_BUSINESS;
            }
            if (i == 2) {
                return ON_LEAVE;
            }
            if (i != 3) {
                return ON_UNKNOWN;
            }
            return ON_MEETING;
        }

        private STATUE(int i) {
            this.value = i;
        }
    }

    public AccessInfo getAccessInfo() {
        return this.accessInfo;
    }

    public String getAlias() {
        return this.alias;
    }

    public String getApplicationReason() {
        return this.applicationReason;
    }

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public String getCity() {
        return this.city;
    }

    public String getContactApplicationId() {
        return this.contactApplicationId;
    }

    public String getContactToken() {
        return this.contactToken;
    }

    public HashMap<String, CustomProfileField> getCustomField() {
        return this.customField;
    }

    public String getDepartment() {
        return this.department;
    }

    public DepartmentList getDepartmentMetaList() {
        return this.mDepartmentMetaList;
    }

    public ChatterDescription getDescription() {
        return this.description;
    }

    public List<String> getDisplayFieldList() {
        return this.displayFieldList;
    }

    public String getEmail() {
        return this.email;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public String getEnName() {
        return this.enName;
    }

    public String getGender() {
        return this.gender;
    }

    public int getGenderType() {
        return this.genderType;
    }

    public String getId() {
        return this.id;
    }

    public boolean getIsAdmin() {
        return this.isAdmin;
    }

    public boolean getIsTopicGroupAdmin() {
        return this.isTopicGroupAdmin;
    }

    public String getLeaderEnName() {
        return this.leaderEnName;
    }

    public String getLeaderId() {
        return this.leaderId;
    }

    public String getLeaderLocalizedName() {
        return this.leaderLocalizedName;
    }

    public String getLeaderName() {
        return this.leaderName;
    }

    public String getLeaderUrl() {
        return this.leaderUrl;
    }

    public String getLocalizedName() {
        return this.localizedName;
    }

    public String getMicroAppProfileUrl() {
        return this.microAppProfileUrl;
    }

    public String getName() {
        return this.name;
    }

    public OrgUnit getOrgUnit() {
        return this.mOrgUnit;
    }

    public String getOrganization() {
        return this.organization;
    }

    public Position getPosition() {
        return this.mPosition;
    }

    public String getProfile() {
        return this.profile;
    }

    public STATUE getStatus() {
        return this.status;
    }

    public String getTenant() {
        return this.tenant;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public WorkStatus getWorkStatus() {
        return this.workStatus;
    }

    public long getZenModeEndTime() {
        return this.zenModeEndTime;
    }

    public boolean isFriend() {
        return this.isFriend;
    }

    public boolean isRequestUserApplied() {
        return this.isRequestUserApplied;
    }

    public boolean isResigned() {
        return this.isResigned;
    }

    public boolean isTargetUserApplied() {
        return this.isTargetUserApplied;
    }

    public boolean hasLeader() {
        if (this.leaderName != null) {
            return true;
        }
        return false;
    }

    public boolean isValid() {
        if (this.id != null) {
            return true;
        }
        return false;
    }

    public boolean hasApplicationReason() {
        return !TextUtils.isEmpty(this.applicationReason);
    }

    public boolean hasDepartment() {
        return !TextUtils.isEmpty(this.department);
    }

    public boolean hasEmail() {
        return !TextUtils.isEmpty(this.email);
    }

    public boolean hasTenant() {
        return !TextUtils.isEmpty(this.tenant);
    }

    public boolean hasProfile() {
        if (!TextUtils.isEmpty(this.microAppProfileUrl) || !TextUtils.isEmpty(this.profile)) {
            return true;
        }
        return false;
    }

    public void setAccessInfo(AccessInfo accessInfo2) {
        this.accessInfo = accessInfo2;
    }

    public void setAlias(String str) {
        this.alias = str;
    }

    public void setApplicationReason(String str) {
        this.applicationReason = str;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setContactApplicationId(String str) {
        this.contactApplicationId = str;
    }

    public void setContactToken(String str) {
        this.contactToken = str;
    }

    public void setCustomField(HashMap<String, CustomProfileField> hashMap) {
        this.customField = hashMap;
    }

    public void setDepartment(String str) {
        this.department = str;
    }

    public void setDepartmentMetaList(DepartmentList departmentList) {
        this.mDepartmentMetaList = departmentList;
    }

    public void setDescription(ChatterDescription chatterDescription) {
        this.description = chatterDescription;
    }

    public void setDisplayFieldList(List<String> list) {
        this.displayFieldList = list;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setEmployeeId(String str) {
        this.employeeId = str;
    }

    public void setEnName(String str) {
        this.enName = str;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public void setGenderType(int i) {
        this.genderType = i;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIsAdmin(boolean z) {
        this.isAdmin = z;
    }

    public void setIsFriend(boolean z) {
        this.isFriend = z;
    }

    public void setIsRequestUserApplied(boolean z) {
        this.isRequestUserApplied = z;
    }

    public void setIsResigned(boolean z) {
        this.isResigned = z;
    }

    public void setIsTargetUserApplied(boolean z) {
        this.isTargetUserApplied = z;
    }

    public void setIsTopicGroupAdmin(boolean z) {
        this.isTopicGroupAdmin = z;
    }

    public void setLeaderEnName(String str) {
        this.leaderEnName = str;
    }

    public void setLeaderId(String str) {
        this.leaderId = str;
    }

    public void setLeaderLocalizedName(String str) {
        this.leaderLocalizedName = str;
    }

    public void setLeaderName(String str) {
        this.leaderName = str;
    }

    public void setLeaderUrl(String str) {
        this.leaderUrl = str;
    }

    public void setLocalizedName(String str) {
        this.localizedName = str;
    }

    public void setMicroAppProfileUrl(String str) {
        this.microAppProfileUrl = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOrgUnit(OrgUnit orgUnit) {
        this.mOrgUnit = orgUnit;
    }

    public void setOrganization(String str) {
        this.organization = str;
    }

    public void setPosition(Position position) {
        this.mPosition = position;
    }

    public void setProfile(String str) {
        this.profile = str;
    }

    public void setStatus(STATUE statue) {
        this.status = statue;
    }

    public void setTenant(String str) {
        this.tenant = str;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public void setWorkStatus(WorkStatus workStatus2) {
        this.workStatus = workStatus2;
    }

    public void setZenModeEndTime(long j) {
        this.zenModeEndTime = j;
    }
}
