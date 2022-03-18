package com.ss.android.lark.member_manage.impl.bean;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.member_manage.impl.bean.f */
public class C45086f {

    /* renamed from: a */
    private static IGroupMemberManageModuleDependency.AbstractC44882e f114175a = GroupMemberManageModule.m177902a().getChatterNameDependency();

    /* renamed from: a */
    public static C45085e m178889a(Chatter chatter) {
        int i;
        String str;
        ArrayList arrayList;
        if (chatter == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (chatter instanceof ChatChatter) {
            ChatChatter chatChatter = (ChatChatter) chatter;
            String chatId = chatChatter.getChatId();
            int onCallRole = chatChatter.getOnCallRole();
            arrayList = chatChatter.getTagInfos();
            str = chatId;
            i = onCallRole;
        } else {
            str = null;
            arrayList = arrayList2;
            i = 0;
        }
        return new C45085e(chatter.getId(), chatter.getAvatarKey(), chatter.getAvatarKey(), f114175a.mo143789a(chatter), chatter.getLocalizedName(), "", new ArrayList(), new ArrayList(), chatter.getType(), arrayList, chatter.getDescription(), chatter.getRegistered(), chatter.getNamePy(), str, chatter.getWorkStatus(), chatter.isFrozen(), chatter.getZenModeEndTime(), chatter.getAccessInfo().isInacessUrgentByExecutives(), i, chatter.getTimeZone(), chatter.isAnonymous(), GroupMemberManageModule.m177902a().getOpenedStatus(chatter.getCustomStatus()));
    }

    /* renamed from: a */
    public static List<C45084c> m178890a(Chat chat, List<Chatter> list, Chatter chatter, Map<String, String> map, Map<String, String> map2) {
        ArrayList arrayList = new ArrayList();
        for (Chatter chatter2 : list) {
            C45085e a = m178889a(chatter2);
            if (a != null) {
                if (GroupMemberManageModule.m177902a().getAccountDependency().mo143792a()) {
                    a.mo159525a(false);
                } else if (chatter != null) {
                    a.mo159525a(!chatter.getTenantId().equals(chatter2.getTenantId()));
                }
                if (chat != null) {
                    a.mo159525a((!chat.isEdu()) & a.mo159532g());
                }
                C45084c cVar = new C45084c(a);
                if (map != null) {
                    String str = map.get(chatter2.getId());
                    if (!TextUtils.isEmpty(str)) {
                        cVar.mo159502a(str.charAt(0));
                    }
                }
                if (CollectionUtils.isNotEmpty(map2)) {
                    cVar.mo159512g().mo159523a(map2.get(chatter2.getId()));
                }
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
