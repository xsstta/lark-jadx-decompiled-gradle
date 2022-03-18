package com.ss.android.lark.create.groupchat.impl.type.fragment;

import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.impl.util.GroupFGUtils;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/type/fragment/GroupCreateFgUtils;", "", "()V", "isShowSecretChat", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.a */
public final class GroupCreateFgUtils {

    /* renamed from: a */
    public static final GroupCreateFgUtils f93898a = new GroupCreateFgUtils();

    private GroupCreateFgUtils() {
    }

    /* renamed from: a */
    public final boolean mo134236a() {
        AbstractC36248c dependency = CreateGroupChatModule.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "CreateGroupChatModule.getDependency()");
        if (!dependency.getAppConfigDependency().mo133724a("secretChat")) {
            return false;
        }
        return GroupFGUtils.m142838b();
    }
}
