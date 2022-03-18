package com.ss.android.lark.profile.v2.entity;

import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.ss.android.lark.profile.entity.WorkStatus;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 U2\u00020\u0001:\u0005TUVWXB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R\u001a\u0010,\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010&\"\u0004\b-\u0010(R\u001a\u0010.\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010&\"\u0004\b/\u0010(R\u001a\u00100\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R\u001a\u00102\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010&\"\u0004\b3\u0010(R\u001a\u00104\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010&\"\u0004\b5\u0010(R\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001c\u0010<\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001c\u0010?\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001c\u0010B\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001c\u0010E\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001c\u0010H\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001a\u0010K\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010 \"\u0004\bM\u0010\"R\u001c\u0010N\u001a\u0004\u0018\u00010OX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006Y"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/UserInfo;", "Ljava/io/Serializable;", "()V", "avatarKey", "", "getAvatarKey", "()Ljava/lang/String;", "setAvatarKey", "(Ljava/lang/String;)V", "contactApplicationId", "getContactApplicationId", "setContactApplicationId", "contactToken", "getContactToken", "setContactToken", "customTagFields", "", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse$CustomImage;", "getCustomTagFields", "()Ljava/util/List;", "setCustomTagFields", "(Ljava/util/List;)V", "doNotDisturbEndTime", "", "getDoNotDisturbEndTime", "()Ljava/lang/Long;", "setDoNotDisturbEndTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "friendStatus", "", "getFriendStatus", "()I", "setFriendStatus", "(I)V", "frozen", "", "getFrozen", "()Z", "setFrozen", "(Z)V", "gender", "getGender", "setGender", "isBeBlocked", "setBeBlocked", "isBlocked", "setBlocked", "isHasTenantCertification", "setHasTenantCertification", "isResigned", "setResigned", "isTenantCertification", "setTenantCertification", "leaderId", "getLeaderId", "setLeaderId", "nameCardId", "getNameCardId", "setNameCardId", "tenantCertificationUrl", "getTenantCertificationUrl", "setTenantCertificationUrl", "tenantId", "getTenantId", "setTenantId", "tenantName", "getTenantName", "setTenantName", "userId", "getUserId", "setUserId", "userName", "getUserName", "setUserName", "userTag", "getUserTag", "setUserTag", "workStatus", "Lcom/ss/android/lark/profile/entity/WorkStatus;", "getWorkStatus", "()Lcom/ss/android/lark/profile/entity/WorkStatus;", "setWorkStatus", "(Lcom/ss/android/lark/profile/entity/WorkStatus;)V", "BlockStatus", "Companion", "FriendStatus", "Gender", "UserTag", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UserInfo implements Serializable {
    public static final Companion Companion = new Companion(null);
    private String avatarKey;
    private String contactApplicationId;
    private String contactToken;
    private List<GetUserProfileResponse.CustomImage> customTagFields = CollectionsKt.emptyList();
    private Long doNotDisturbEndTime;
    private int friendStatus;
    private boolean frozen;
    private int gender;
    private boolean isBeBlocked;
    private boolean isBlocked;
    private boolean isHasTenantCertification;
    private boolean isResigned;
    private boolean isTenantCertification;
    private String leaderId;
    private String nameCardId;
    private String tenantCertificationUrl;
    private String tenantId;
    private String tenantName;
    private String userId;
    private String userName;
    private int userTag;
    private WorkStatus workStatus;

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/UserInfo$BlockStatus;", "", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface BlockStatus {
    }

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/UserInfo$FriendStatus;", "", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface FriendStatus {
    }

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/UserInfo$Gender;", "", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface Gender {
    }

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/UserInfo$UserTag;", "", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface UserTag {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/UserInfo$Companion;", "", "()V", "BLOCK_DOUBLE", "", "BLOCK_FORWARD", "BLOCK_NONE", "BLOCK_REVERSE", "BLOCK_UNKNOWN", "FRIEND_STATUS_DOUBLE", "FRIEND_STATUS_FORWARD", "FRIEND_STATUS_NONE", "FRIEND_STATUS_REVERSE", "FRIEND_STATUS_UNKNOWN", "GENDER_TYPE_FEMALE", "GENDER_TYPE_MALE", "GENDER_TYPE_UNKNOWN", "NONE_NAME_CARD_ID", "", "U_TAG_DEFAULT", "U_TAG_PARENT", "U_TAG_STUDENT", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.entity.UserInfo$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getAvatarKey() {
        return this.avatarKey;
    }

    public final String getContactApplicationId() {
        return this.contactApplicationId;
    }

    public final String getContactToken() {
        return this.contactToken;
    }

    public final List<GetUserProfileResponse.CustomImage> getCustomTagFields() {
        return this.customTagFields;
    }

    public final Long getDoNotDisturbEndTime() {
        return this.doNotDisturbEndTime;
    }

    public final int getFriendStatus() {
        return this.friendStatus;
    }

    public final boolean getFrozen() {
        return this.frozen;
    }

    public final int getGender() {
        return this.gender;
    }

    public final String getLeaderId() {
        return this.leaderId;
    }

    public final String getNameCardId() {
        return this.nameCardId;
    }

    public final String getTenantCertificationUrl() {
        return this.tenantCertificationUrl;
    }

    public final String getTenantId() {
        return this.tenantId;
    }

    public final String getTenantName() {
        return this.tenantName;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final int getUserTag() {
        return this.userTag;
    }

    public final WorkStatus getWorkStatus() {
        return this.workStatus;
    }

    public final boolean isBeBlocked() {
        return this.isBeBlocked;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isHasTenantCertification() {
        return this.isHasTenantCertification;
    }

    public final boolean isResigned() {
        return this.isResigned;
    }

    public final boolean isTenantCertification() {
        return this.isTenantCertification;
    }

    public final void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public final void setBeBlocked(boolean z) {
        this.isBeBlocked = z;
    }

    public final void setBlocked(boolean z) {
        this.isBlocked = z;
    }

    public final void setContactApplicationId(String str) {
        this.contactApplicationId = str;
    }

    public final void setContactToken(String str) {
        this.contactToken = str;
    }

    public final void setDoNotDisturbEndTime(Long l) {
        this.doNotDisturbEndTime = l;
    }

    public final void setFriendStatus(int i) {
        this.friendStatus = i;
    }

    public final void setFrozen(boolean z) {
        this.frozen = z;
    }

    public final void setGender(int i) {
        this.gender = i;
    }

    public final void setHasTenantCertification(boolean z) {
        this.isHasTenantCertification = z;
    }

    public final void setLeaderId(String str) {
        this.leaderId = str;
    }

    public final void setNameCardId(String str) {
        this.nameCardId = str;
    }

    public final void setResigned(boolean z) {
        this.isResigned = z;
    }

    public final void setTenantCertification(boolean z) {
        this.isTenantCertification = z;
    }

    public final void setTenantCertificationUrl(String str) {
        this.tenantCertificationUrl = str;
    }

    public final void setTenantId(String str) {
        this.tenantId = str;
    }

    public final void setTenantName(String str) {
        this.tenantName = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setUserName(String str) {
        this.userName = str;
    }

    public final void setUserTag(int i) {
        this.userTag = i;
    }

    public final void setWorkStatus(WorkStatus workStatus2) {
        this.workStatus = workStatus2;
    }

    public final void setCustomTagFields(List<GetUserProfileResponse.CustomImage> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.customTagFields = list;
    }
}
