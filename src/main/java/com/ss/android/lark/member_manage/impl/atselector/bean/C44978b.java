package com.ss.android.lark.member_manage.impl.atselector.bean;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.member_manage.impl.atselector.bean.b */
public class C44978b {

    /* renamed from: a */
    private static IGroupMemberManageModuleDependency.AbstractC44882e f113887a = GroupMemberManageModule.m177902a().getChatterNameDependency();

    /* renamed from: b */
    private static IGroupMemberManageModuleDependency.AbstractC44881d f113888b = GroupMemberManageModule.m177902a().getChatterDependency();

    /* renamed from: a */
    public static C44977a m178402a(Chat chat, ChatChatter chatChatter) {
        boolean z;
        if (chatChatter == null) {
            return null;
        }
        if (!f113888b.mo143785a(chatChatter) || chat.isEdu()) {
            z = false;
        } else {
            z = true;
        }
        return new C44977a(chatChatter.getId(), chatChatter.getAvatarKey(), chatChatter.getAvatarKey(), f113887a.mo143789a(chatChatter), "", new ArrayList(), new ArrayList(), chatChatter.getType(), chatChatter.getDescription(), chatChatter.getRegistered(), chatChatter.getNamePy(), chatChatter.getWorkStatus(), chatChatter.getZenModeEndTime(), z, chatChatter.getTagInfos(), GroupMemberManageModule.m177902a().getOpenedStatus(chatChatter.getCustomStatus()));
    }
}
