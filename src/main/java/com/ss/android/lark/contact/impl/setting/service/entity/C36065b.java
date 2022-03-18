package com.ss.android.lark.contact.impl.setting.service.entity;

import com.bytedance.lark.pb.settings.v1.GetAddFriendPrivateConfigResponse;
import com.bytedance.lark.pb.settings.v1.WayToAddMeSetting;
import com.bytedance.lark.pb.settings.v1.WayToAddMeSettingItem;
import com.bytedance.lark.pb.settings.v1.WayToFindMeSettingItem;
import com.larksuite.framework.utils.C26249aa;
import com.ss.android.lark.contact.impl.setting.service.entity.WayToFindMeSettingItem;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.setting.service.entity.b */
public class C36065b {
    /* renamed from: a */
    public static C36067c m141447a(GetAddFriendPrivateConfigResponse getAddFriendPrivateConfigResponse) {
        return new C36067c(m141450b(getAddFriendPrivateConfigResponse), m141448a(getAddFriendPrivateConfigResponse.add_me_setting));
    }

    /* renamed from: a */
    private static List<WayToFindMeSettingItem> m141449a(List<WayToFindMeSettingItem> list) {
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<WayToFindMeSettingItem, WayToFindMeSettingItem>() {
            /* class com.ss.android.lark.contact.impl.setting.service.entity.C36065b.C360661 */

            /* renamed from: a */
            public WayToFindMeSettingItem get(WayToFindMeSettingItem wayToFindMeSettingItem) {
                return C36065b.m141446a(wayToFindMeSettingItem);
            }
        });
    }

    /* renamed from: b */
    private static C36070f m141450b(GetAddFriendPrivateConfigResponse getAddFriendPrivateConfigResponse) {
        return new C36070f(m141449a(getAddFriendPrivateConfigResponse.find_me_setting), getAddFriendPrivateConfigResponse.LoginCPDiff.booleanValue(), getAddFriendPrivateConfigResponse.DocLink);
    }

    /* renamed from: a */
    public static WayToAddMeSettingItem m141445a(WayToAddMeSettingItem wayToAddMeSettingItem) {
        return new WayToAddMeSettingItem.C19231a().mo65646a(WayToAddMeSettingItem.Type.fromValue(wayToAddMeSettingItem.mo132601a().getNumber())).mo65647a(Boolean.valueOf(wayToAddMeSettingItem.mo132602b())).build();
    }

    /* renamed from: a */
    public static WayToFindMeSettingItem m141446a(WayToFindMeSettingItem wayToFindMeSettingItem) {
        return new WayToFindMeSettingItem(WayToFindMeSettingItem.FindMeType.forNumber(wayToFindMeSettingItem.type.getValue()), wayToFindMeSettingItem.id, wayToFindMeSettingItem.display_contact, wayToFindMeSettingItem.enable.booleanValue(), wayToFindMeSettingItem.has_verified.booleanValue(), wayToFindMeSettingItem.need_cp_verify.booleanValue());
    }

    /* renamed from: a */
    private static C36068d m141448a(WayToAddMeSetting wayToAddMeSetting) {
        HashMap hashMap = new HashMap();
        for (WayToAddMeSettingItem wayToAddMeSettingItem : wayToAddMeSetting.way_to_add_items) {
            hashMap.put(Integer.valueOf(wayToAddMeSettingItem.type.getValue()), wayToAddMeSettingItem.enable);
        }
        return new C36068d(hashMap);
    }
}
