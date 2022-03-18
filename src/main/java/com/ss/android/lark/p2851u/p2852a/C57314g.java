package com.ss.android.lark.p2851u.p2852a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.AvatarMedal;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.Image;
import com.bytedance.lark.pb.basic.v1.WorkStatus;
import com.larksuite.framework.utils.C26249aa;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.chatter.AccessInfo;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.chat.entity.chatter.TimeZone;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.u.a.g */
public class C57314g {

    /* renamed from: a */
    private static volatile AbstractC36450aa f141167a;

    /* renamed from: a */
    public static AbstractC36450aa m222101a() {
        if (f141167a == null) {
            synchronized (C57314g.class) {
                if (f141167a == null) {
                    f141167a = C29990c.m110930b().mo134515N();
                }
            }
        }
        return f141167a;
    }

    /* renamed from: b */
    public static C33982a m222106b(C14928Entity entity) {
        return m222100a(entity, null);
    }

    /* renamed from: a */
    private static TimeZone m222099a(Chatter.TimeZone timeZone) {
        if (timeZone == null) {
            return null;
        }
        TimeZone timeZone2 = new TimeZone();
        timeZone2.setTimeZoneId(timeZone.time_zone_id);
        return timeZone2;
    }

    /* renamed from: a */
    private static List<TagInfo> m222102a(Chatter.ChatExtra.ChatChatterTagInfo chatChatterTagInfo) {
        ArrayList arrayList = new ArrayList();
        if (chatChatterTagInfo == null) {
            return arrayList;
        }
        for (Chatter.ChatExtra.ChatChatterTagInfo.TagInfo tagInfo : chatChatterTagInfo.tags) {
            arrayList.add(TagInfo.map(tagInfo));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<com.ss.android.lark.chat.entity.chatter.Chatter> m222103a(List<Chatter> list) {
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<Chatter, com.ss.android.lark.chat.entity.chatter.Chatter>() {
            /* class com.ss.android.lark.p2851u.p2852a.C57314g.C573162 */

            /* renamed from: a */
            public com.ss.android.lark.chat.entity.chatter.Chatter get(Chatter chatter) {
                return C57314g.m222098a(chatter);
            }
        });
    }

    /* renamed from: a */
    public static Map<String, com.ss.android.lark.chat.entity.chatter.Chatter> m222104a(C14928Entity entity) {
        return m222106b(entity).mo124894a();
    }

    /* renamed from: a */
    public static com.ss.android.lark.chat.entity.chatter.Chatter m222098a(Chatter chatter) {
        List<String> list;
        String str;
        Chatter.Description.Type type;
        Chatter.AccessInfo.AccessProfile accessProfile;
        Image image;
        List<String> list2;
        Image image2 = null;
        if (chatter == null) {
            return null;
        }
        com.ss.android.lark.chat.entity.chatter.Chatter chatter2 = new com.ss.android.lark.chat.entity.chatter.Chatter();
        if (chatter.is_resigned.booleanValue()) {
            chatter2.setDimission();
        }
        chatter2.setId(chatter.id);
        chatter2.setName(chatter.name);
        chatter2.setEnName(chatter.en_us_name);
        chatter2.setLocalizedName(chatter.localized_name);
        chatter2.setAlias(chatter.alias);
        chatter2.setAvatarKey(chatter.avatar_key);
        if (chatter.avatar_urls == null || chatter.avatar_urls.isEmpty()) {
            if (chatter.avatar != null) {
                image = chatter.avatar.origin;
            } else {
                image = null;
            }
            if (image != null) {
                list2 = image.urls;
            } else {
                list2 = new ArrayList<>();
            }
            chatter2.setAvatarUrls(list2);
        } else {
            chatter2.setAvatarUrls(chatter.avatar_urls);
        }
        if (chatter.avatar != null) {
            image2 = chatter.avatar.thumbnail;
        }
        if (image2 != null) {
            list = image2.urls;
        } else {
            list = new ArrayList<>();
        }
        chatter2.setThumbnails(list);
        chatter2.setUpdateTime(chatter.update_time.longValue());
        if (TextUtils.isEmpty(chatter.name_pinyin)) {
            chatter2.setNamePinyin("#");
        } else {
            chatter2.setNamePinyin(chatter.name_pinyin);
        }
        chatter2.setNamePy(chatter.name_pinyin);
        chatter2.setCreatorId(chatter.creator_id);
        chatter2.setType(Chatter.ChatterType.valueOf(chatter.type.getValue()));
        if (chatter.type == Chatter.Type.UNKNOWN) {
            Log.m165382e("chatter type unknown value: " + chatter2.getId());
        }
        chatter2.setRegistered(chatter.is_registered.booleanValue());
        if (chatter.description == null) {
            str = "";
        } else {
            str = chatter.description.text;
        }
        if (chatter.description == null) {
            type = Chatter.Description.DEFAULT_TYPE;
        } else {
            type = chatter.description.type;
        }
        chatter2.setDescription(new ChatterDescription(str, ChatterDescription.Type.valueOf(type.getValue())));
        chatter2.setWithBotTag(chatter.with_bot_tag);
        chatter2.setInContacts(chatter.in_contacts.booleanValue());
        chatter2.setCanJoinGroup(chatter.can_join_group.booleanValue());
        chatter2.setTenantId(chatter.tenant_id);
        chatter2.setProfileEnable(chatter.profile_enabled.booleanValue());
        WorkStatus workStatus = chatter.work_status;
        if (workStatus != null) {
            chatter2.setWorkStatus(new com.ss.android.lark.chat.entity.chatter.WorkStatus(WorkStatus.Status.valueOf(workStatus.status.getValue()), workStatus.description, workStatus.start_time.longValue(), workStatus.end_time.longValue(), !TextUtils.equals(chatter2.getTenantId(), m222101a().mo134405h())));
        }
        chatter2.setFrozen(chatter.is_frozen.booleanValue());
        chatter2.setZenModeEndTime(chatter.do_not_disturb_end_time.longValue());
        Chatter.AccessInfo accessInfo = chatter.access_info;
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
            chatter2.setAccessInfo(accessInfo2);
        }
        chatter2.setOpenAppId(chatter.open_app_id);
        chatter2.setAcceptSmsPhoneUrgent(chatter.accept_sms_phone_urgent.booleanValue());
        chatter2.setTimeZone(m222099a(chatter.time_zone));
        chatter2.setAnonymous(chatter.is_anonymous.booleanValue());
        chatter2.setCustomStatus(ChatterCustomStatus.fromPB(chatter.status));
        AvatarMedal avatarMedal = chatter.avatar_medal;
        if (avatarMedal != null) {
            chatter2.setAvatarMedal(new com.ss.android.lark.chat.entity.chatter.AvatarMedal(avatarMedal.key, avatarMedal.name));
        }
        return chatter2;
    }

    /* renamed from: a */
    public static Map<String, com.ss.android.lark.chat.entity.chatter.Chatter> m222105a(Map<String, com.bytedance.lark.pb.basic.v1.Chatter> map) {
        return C26249aa.m94985a(map, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.basic.v1.Chatter, com.ss.android.lark.chat.entity.chatter.Chatter>() {
            /* class com.ss.android.lark.p2851u.p2852a.C57314g.C573151 */

            /* renamed from: a */
            public com.ss.android.lark.chat.entity.chatter.Chatter get(com.bytedance.lark.pb.basic.v1.Chatter chatter) {
                return C57314g.m222098a(chatter);
            }
        });
    }

    /* renamed from: a */
    public static C33982a m222100a(C14928Entity entity, String str) {
        C33982a aVar = new C33982a();
        if (entity == null) {
            return aVar;
        }
        HashMap hashMap = new HashMap();
        Map<String, C14928Entity.ChatChatter> map = entity.chat_chatters;
        Map hashMap2 = new HashMap();
        if (!map.isEmpty()) {
            for (Map.Entry<String, C14928Entity.ChatChatter> entry : map.entrySet()) {
                String key = entry.getKey();
                Map<String, com.bytedance.lark.pb.basic.v1.Chatter> map2 = entry.getValue().chatters;
                hashMap2.putAll(map2);
                for (String str2 : map2.keySet()) {
                    hashMap.put(str2, key);
                }
            }
        } else {
            hashMap2 = entity.chatters;
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            com.bytedance.lark.pb.basic.v1.Chatter chatter = (com.bytedance.lark.pb.basic.v1.Chatter) entry2.getValue();
            com.ss.android.lark.chat.entity.chatter.Chatter a = m222098a(chatter);
            if (a != null) {
                String id = a.getId();
                ChatChatter chatChatter = new ChatChatter(a);
                chatChatter.setChatId(str);
                Chatter.ChatExtra chatExtra = chatter.chat_extra;
                if (chatExtra != null && !TextUtils.isEmpty(chatExtra.chat_id)) {
                    String str3 = chatExtra.chat_id;
                    String str4 = chatExtra.nick_name;
                    int value = chatExtra.oncall_role.getValue();
                    chatChatter.setTagInfos(m222102a(chatExtra.tag_infos));
                    chatChatter.setChatId(str3);
                    chatChatter.setNickName(str4);
                    chatChatter.setOnCallRole(value);
                } else if (hashMap.containsKey(id)) {
                    chatChatter.setChatId((String) hashMap.get(id));
                }
                aVar.mo124895a(chatChatter);
            }
        }
        return aVar;
    }
}
