package com.ss.android.lark.profile.entity;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.WorkStatus;
import com.bytedance.lark.pb.contact.v1.GetUserProfileResponse;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.profile.entity.AccessInfo;
import com.ss.android.lark.profile.entity.ChatterDescription;
import com.ss.android.lark.profile.entity.WorkStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.profile.entity.a */
public class C52260a {
    /* renamed from: a */
    private static void m202785a(Profile profile, GetUserProfileResponse.Personal personal) {
        if (personal.profile_value != null) {
            profile.setGenderType(personal.profile_value.gender_enum.getValue());
            List<GetUserProfileResponse.Personal.ProfileField> list = personal.profile_value.profile_fields_order;
            Map<String, GetUserProfileResponse.Personal.ProfileValue.FieldValue> map = personal.profile_value.custom_field_values_v2;
            if (list != null) {
                HashMap<String, CustomProfileField> hashMap = new HashMap<>();
                if (!CollectionUtils.isEmpty(map)) {
                    for (String str : map.keySet()) {
                        GetUserProfileResponse.Personal.ProfileValue.FieldValue fieldValue = map.get(str);
                        hashMap.put(str, new CustomProfileField(str, fieldValue.TEXT, fieldValue.URL));
                    }
                }
                profile.setCustomField(hashMap);
                List asList = Arrays.asList(Profile.DEFAULT_FIELD_KEY);
                ArrayList arrayList = new ArrayList();
                for (GetUserProfileResponse.Personal.ProfileField profileField : list) {
                    if (profileField.visible.booleanValue() && (profileField.field_type == GetUserProfileResponse.Personal.ProfileField.FieldType.DEFAULT || profileField.field_value_type != GetUserProfileResponse.Personal.ProfileField.FieldValueType.UNKNOWN_TYPE)) {
                        if (asList.contains(profileField.key)) {
                            arrayList.add(profileField.key);
                        } else if (hashMap.containsKey(profileField.key)) {
                            if (profileField.field_value_type == GetUserProfileResponse.Personal.ProfileField.FieldValueType.HREF) {
                                hashMap.get(profileField.key).setUrl(true);
                            }
                            hashMap.get(profileField.key).setName(profileField.i18n_field_name);
                            arrayList.add(profileField.key);
                        }
                    }
                }
                arrayList.add("B-POSITION");
                profile.setDisplayFieldList(arrayList);
            }
        }
    }

    /* renamed from: a */
    public static Profile m202784a(GetUserProfileResponse getUserProfileResponse, String str) {
        Chatter.AccessInfo.AccessProfile accessProfile;
        Profile profile = new Profile();
        GetUserProfileResponse.Company company = getUserProfileResponse.company;
        if (company != null) {
            profile.setDepartment(company.department_name);
            profile.setTenant(company.tenant_name);
            if (company.position != null && !TextUtils.isEmpty(company.position.name)) {
                profile.setPosition(new Position(company.position.name));
            }
            if (company.org_unit != null && !TextUtils.isEmpty(company.org_unit.name)) {
                profile.setOrgUnit(new OrgUnit(company.org_unit.name));
            }
            if (company.departments != null && CollectionUtils.isNotEmpty(company.departments.dept_metas)) {
                DepartmentList departmentList = new DepartmentList();
                ArrayList arrayList = new ArrayList();
                departmentList.setDepartmentMetaList(arrayList);
                for (GetUserProfileResponse.Company.DepartmentMeta departmentMeta : company.departments.dept_metas) {
                    if (departmentMeta != null) {
                        arrayList.add(new DepartmentMeta(departmentMeta.id, departmentMeta.name));
                    }
                }
                profile.setDepartmentMetaList(departmentList);
            }
        }
        GetUserProfileResponse.Leader leader = getUserProfileResponse.leader;
        if (leader != null) {
            profile.setLeaderId(leader.id);
            profile.setLeaderName(leader.name);
            profile.setLeaderEnName(leader.en_name);
            profile.setLeaderUrl(leader.profile_url);
        }
        GetUserProfileResponse.AdminInfo adminInfo = getUserProfileResponse.admin_info;
        if (adminInfo != null) {
            profile.setIsAdmin(adminInfo.is_admin.booleanValue());
            profile.setIsTopicGroupAdmin(adminInfo.is_topic_group_admin.booleanValue());
        }
        GetUserProfileResponse.Personal personal = getUserProfileResponse.personal;
        if (personal != null) {
            profile.setName(personal.name);
            profile.setLocalizedName(personal.localized_name);
            profile.setAlias(personal.alias);
            profile.setDescription(new ChatterDescription(personal.description, ChatterDescription.Type.valueOf(personal.description_type.getValue())));
            profile.setEmail(personal.email);
            profile.setGender(personal.gender);
            profile.setProfile(personal.malaita_profile_url);
            profile.setMicroAppProfileUrl(personal.microapp_profile_url);
            profile.setCity(personal.city);
            profile.setEmployeeId(personal.employee_id);
            profile.setEnName(personal.en_name);
            profile.setTenantId(personal.tenant_id);
            profile.setIsFriend(personal.is_friend.booleanValue());
            profile.setIsRequestUserApplied(personal.request_user_apply.booleanValue());
            profile.setIsTargetUserApplied(personal.target_user_apply.booleanValue());
            profile.setContactToken(personal.contact_token);
            profile.setContactApplicationId(personal.contact_application_id);
            profile.setApplicationReason(personal.application_reason);
            profile.setIsResigned(personal.is_resigned.booleanValue());
            profile.setAvatarKey(personal.avatar_key);
            profile.setId(personal.user_id);
            profile.setLocalizedName(personal.localized_name);
            profile.setZenModeEndTime(getUserProfileResponse.do_not_disturb_end_time.longValue());
            WorkStatus workStatus = getUserProfileResponse.work_status;
            if (workStatus != null) {
                profile.setWorkStatus(new WorkStatus(WorkStatus.Status.valueOf(workStatus.status.getValue()), workStatus.description, workStatus.start_time.longValue(), workStatus.end_time.longValue(), !TextUtils.equals(profile.getTenantId(), str)));
            }
            Chatter.AccessInfo accessInfo = getUserProfileResponse.access_info;
            if (!(accessInfo == null || (accessProfile = accessInfo.access_profile) == null)) {
                AccessInfo accessInfo2 = new AccessInfo();
                if (accessProfile.access_message_phone_call != null) {
                    accessInfo2.setPhoneCallAccessProfile(new AccessInfo.AccessProfile(accessProfile.access_message_phone_call.is_accessible.booleanValue(), AccessInfo.InaccessibleCode.fromValue(accessProfile.access_message_phone_call.inaccessible_code.getValue())));
                }
                if (accessProfile.access_message_voice_call != null) {
                    accessInfo2.setVoiceCallAccessProfile(new AccessInfo.AccessProfile(accessProfile.access_message_voice_call.is_accessible.booleanValue(), AccessInfo.InaccessibleCode.fromValue(accessProfile.access_message_voice_call.inaccessible_code.getValue())));
                }
                if (accessProfile.access_message_video_call != null) {
                    accessInfo2.setVideoCallAccessProfile(new AccessInfo.AccessProfile(accessProfile.access_message_video_call.is_accessible.booleanValue(), AccessInfo.InaccessibleCode.fromValue(accessProfile.access_message_video_call.inaccessible_code.getValue())));
                }
                if (accessProfile.access_message_urgent != null) {
                    accessInfo2.setUrgentAccessProfile(new AccessInfo.AccessProfile(accessProfile.access_message_urgent.is_accessible.booleanValue(), AccessInfo.InaccessibleCode.fromValue(accessProfile.access_message_urgent.inaccessible_code.getValue())));
                }
                profile.setAccessInfo(accessInfo2);
            }
            m202785a(profile, personal);
        }
        return profile;
    }
}
