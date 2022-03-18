package com.bytedance.ee.bear.share.export;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.util.io.NonProguard;
import com.chad.library.adapter.base.entity.AbstractC20930c;
import java.util.Locale;
import java.util.Objects;

public class UserInfo implements Parcelable, NonProguard, AbstractC20930c {
    public static final Parcelable.Creator<UserInfo> CREATOR = new Parcelable.Creator<UserInfo>() {
        /* class com.bytedance.ee.bear.share.export.UserInfo.C110021 */

        /* renamed from: a */
        public UserInfo[] newArray(int i) {
            return new UserInfo[i];
        }

        /* renamed from: a */
        public UserInfo createFromParcel(Parcel parcel) {
            return new UserInfo(parcel);
        }
    };
    private static final int[] SUPPORTED_TYPES = {0, 1, 2, 5, 8, 9, 11, 10, 17, 14, 16, 18, 24, 23};
    private String avatarUrl;
    private int blockStatus;
    private boolean can_modify_perm;
    private boolean can_modify_role;
    private String cn_name;
    private String en_name;
    private boolean has_tips;
    private String id;
    private String inviter_id;
    private boolean isExternal;
    private boolean isFriend;
    private boolean isOwner;
    private boolean is_role_inherited;
    private boolean is_single_product;
    private String label;
    private String name;
    private int ownerType;
    private String permSource;
    private int permission;
    private String tempCountryCode;
    private String tempPhone;
    private String tenantId;
    private String tenantName;
    private String tenant_tag;
    private int userCount;

    public int describeContents() {
        return 0;
    }

    public UserInfo() {
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public int getBlockStatus() {
        return this.blockStatus;
    }

    public String getCnName() {
        return this.cn_name;
    }

    public String getEnName() {
        return this.en_name;
    }

    public String getId() {
        return this.id;
    }

    public String getInviter_id() {
        return this.inviter_id;
    }

    public String getLabel() {
        return this.label;
    }

    public String getName() {
        return this.name;
    }

    public int getOwnerType() {
        return this.ownerType;
    }

    public String getPermSource() {
        return this.permSource;
    }

    public int getPermission() {
        return this.permission;
    }

    public String getTempCountryCode() {
        return this.tempCountryCode;
    }

    public String getTempPhone() {
        return this.tempPhone;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public String getTenantName() {
        return this.tenantName;
    }

    public String getTenant_tag() {
        return this.tenant_tag;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public boolean isCan_modify_perm() {
        return this.can_modify_perm;
    }

    public boolean isCan_modify_role() {
        return this.can_modify_role;
    }

    public boolean isExternal() {
        return this.isExternal;
    }

    public boolean isFriend() {
        return this.isFriend;
    }

    public boolean isHas_tips() {
        return this.has_tips;
    }

    public boolean isIs_role_inherited() {
        return this.is_role_inherited;
    }

    public boolean isIs_single_product() {
        return this.is_single_product;
    }

    public boolean isOwner() {
        return this.isOwner;
    }

    @Override // com.chad.library.adapter.base.entity.AbstractC20930c
    public int getItemType() {
        return ShareMemberGroupType.GROUP_MEMBER.getType();
    }

    public boolean isBlock() {
        int i = this.ownerType;
        if ((i == 0 || i == 1) && this.blockStatus != 0) {
            return true;
        }
        return false;
    }

    public boolean isUserType() {
        int i = this.ownerType;
        if (i == 0 || i == 1 || i == 17) {
            return true;
        }
        return false;
    }

    public String getDisplayLabel() {
        String str;
        if (this.isExternal) {
            str = this.tenantName;
        } else {
            str = this.label;
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    public int hashCode() {
        return Objects.hash(this.id, Integer.valueOf(this.ownerType));
    }

    public boolean isUnknownType() {
        for (int i : SUPPORTED_TYPES) {
            if (this.ownerType == i) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "UserInfo{, permission=" + this.permission + ", isExternal=" + this.isExternal + ", isOwner=" + this.isOwner + '}';
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setBlockStatus(int i) {
        this.blockStatus = i;
    }

    public void setCan_modify_perm(boolean z) {
        this.can_modify_perm = z;
    }

    public void setCan_modify_role(boolean z) {
        this.can_modify_role = z;
    }

    public void setCnName(String str) {
        this.cn_name = str;
    }

    public void setEnName(String str) {
        this.en_name = str;
    }

    public void setExternal(boolean z) {
        this.isExternal = z;
    }

    public void setFriend(boolean z) {
        this.isFriend = z;
    }

    public void setHas_tips(boolean z) {
        this.has_tips = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setInviter_id(String str) {
        this.inviter_id = str;
    }

    public void setIs_role_inherited(boolean z) {
        this.is_role_inherited = z;
    }

    public void setIs_single_product(boolean z) {
        this.is_single_product = z;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOwner(boolean z) {
        this.isOwner = z;
    }

    public void setOwnerType(int i) {
        this.ownerType = i;
    }

    public void setPermSource(String str) {
        this.permSource = str;
    }

    public void setPermission(int i) {
        this.permission = i;
    }

    public void setTempCountryCode(String str) {
        this.tempCountryCode = str;
    }

    public void setTempPhone(String str) {
        this.tempPhone = str;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public void setTenantName(String str) {
        this.tenantName = str;
    }

    public void setTenant_tag(String str) {
        this.tenant_tag = str;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        if (isUserType() && userInfo.isUserType()) {
            return Objects.equals(this.id, userInfo.id);
        }
        if (!Objects.equals(this.id, userInfo.id) || !Objects.equals(Integer.valueOf(this.ownerType), Integer.valueOf(userInfo.ownerType))) {
            return false;
        }
        return true;
    }

    public String getDisplayName(Locale locale) {
        int i = this.ownerType;
        if (i != 0 && i != 1 && i != 17) {
            return getName();
        }
        if (TextUtils.isEmpty(getEnName()) && TextUtils.isEmpty(getCnName())) {
            return getName();
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            if (!TextUtils.isEmpty(getEnName())) {
                return getEnName();
            }
            return getCnName();
        } else if (Locale.CHINESE.getLanguage().equals(language)) {
            if (!TextUtils.isEmpty(getCnName())) {
                return getCnName();
            }
            return getEnName();
        } else if (!TextUtils.isEmpty(getEnName())) {
            return getEnName();
        } else {
            return getCnName();
        }
    }

    protected UserInfo(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        this.id = parcel.readString();
        this.name = parcel.readString();
        this.cn_name = parcel.readString();
        this.en_name = parcel.readString();
        this.label = parcel.readString();
        this.avatarUrl = parcel.readString();
        this.ownerType = parcel.readInt();
        this.permission = parcel.readInt();
        boolean z8 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isExternal = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.can_modify_perm = z2;
        this.tenantId = parcel.readString();
        this.tenantName = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isOwner = z3;
        this.inviter_id = parcel.readString();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.is_role_inherited = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.can_modify_role = z5;
        this.tenant_tag = parcel.readString();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.is_single_product = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.has_tips = z7;
        this.tempCountryCode = parcel.readString();
        this.blockStatus = parcel.readInt();
        this.isFriend = parcel.readByte() == 0 ? false : z8;
        this.tempPhone = parcel.readString();
        this.permSource = parcel.readString();
        this.userCount = parcel.readInt();
    }

    public void setDisplayName(Locale locale, String str) {
        int i = this.ownerType;
        if (i == 0 || i == 1) {
            String language = locale.getLanguage();
            if (TextUtils.isEmpty(language)) {
                setEnName(str);
            } else if (Locale.CHINESE.getLanguage().equals(language)) {
                setCnName(str);
            } else {
                setEnName(str);
            }
        } else {
            setName(str);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.cn_name);
        parcel.writeString(this.en_name);
        parcel.writeString(this.label);
        parcel.writeString(this.avatarUrl);
        parcel.writeInt(this.ownerType);
        parcel.writeInt(this.permission);
        parcel.writeByte(this.isExternal ? (byte) 1 : 0);
        parcel.writeByte(this.can_modify_perm ? (byte) 1 : 0);
        parcel.writeString(this.tenantId);
        parcel.writeString(this.tenantName);
        parcel.writeByte(this.isOwner ? (byte) 1 : 0);
        parcel.writeString(this.inviter_id);
        parcel.writeByte(this.is_role_inherited ? (byte) 1 : 0);
        parcel.writeByte(this.can_modify_role ? (byte) 1 : 0);
        parcel.writeString(this.tenant_tag);
        parcel.writeByte(this.is_single_product ? (byte) 1 : 0);
        parcel.writeByte(this.has_tips ? (byte) 1 : 0);
        parcel.writeString(this.tempCountryCode);
        parcel.writeInt(this.blockStatus);
        parcel.writeByte(this.isFriend ? (byte) 1 : 0);
        parcel.writeString(this.tempPhone);
        parcel.writeString(this.permSource);
        parcel.writeInt(this.userCount);
    }

    public UserInfo(String str, String str2, String str3, String str4, int i, int i2, boolean z) {
        this.id = str;
        this.name = str2;
        this.label = str3;
        this.avatarUrl = str4;
        this.ownerType = i;
        this.permission = i2;
        this.isExternal = z;
    }
}
