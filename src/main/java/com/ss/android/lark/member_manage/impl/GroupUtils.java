package com.ss.android.lark.member_manage.impl;

import android.text.TextUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/GroupUtils;", "", "()V", "isChatOwner", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isChatOwnerOrAdmin", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.a */
public final class GroupUtils {

    /* renamed from: a */
    public static final GroupUtils f113674a = new GroupUtils();

    private GroupUtils() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m178040b(Chat chat) {
        if (m178039a(chat) || (chat != null && chat.isAdmin())) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m178039a(Chat chat) {
        if (!(chat == null || chat.isP2PChat() || chat.getOwnerId() == null)) {
            IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
            IGroupMemberManageModuleDependency.AbstractC44878a accountDependency = a.getAccountDependency();
            Intrinsics.checkExpressionValueIsNotNull(accountDependency, "GroupMemberManageModule.…dency().accountDependency");
            if (TextUtils.equals(chat.getOwnerId(), accountDependency.mo143795b())) {
                return true;
            }
        }
        return false;
    }
}
