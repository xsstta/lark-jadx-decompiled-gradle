package com.ss.android.lark.create.groupchat.impl.util;

import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/util/GroupFGUtils;", "", "()V", "mIsInSecretMode", "", "isCheckSecretPermission", "isCreateGroupPublicEnable", "isCreateSecretChatEnable", "isEnable", "featureName", "", "isNeedShowCreateGroupGuide", "isSecretOpen", "setInSecretMode", "", "isInSecretMode", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.b.d */
public final class GroupFGUtils {

    /* renamed from: a */
    public static final GroupFGUtils f93570a = new GroupFGUtils();

    /* renamed from: b */
    private static boolean f93571b;

    private GroupFGUtils() {
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m142839c() {
        return m142837a("lark.client.secretchat_priviledge_control.migrate");
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m142836a() {
        if (!m142837a("create.group.public") || m142837a("im.chat.searchable.group")) {
            return false;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m142838b() {
        AbstractC36248c dependency = CreateGroupChatModule.getDependency();
        if (m142839c()) {
            Intrinsics.checkExpressionValueIsNotNull(dependency, "dependency");
            if (!dependency.isAllowSecret() || !dependency.isSecretChatEnable()) {
                return false;
            }
            return true;
        } else if (m142837a("secretchat.main")) {
            Intrinsics.checkExpressionValueIsNotNull(dependency, "dependency");
            if (dependency.isSecretChatEnable()) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    /* renamed from: d */
    public static final boolean m142840d() {
        AbstractC36248c dependency = CreateGroupChatModule.getDependency();
        if (!m142839c() || !f93571b) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(dependency, "dependency");
        if (!dependency.isAllowSecret() || !dependency.isSecretChatEnable()) {
            return false;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m142835a(boolean z) {
        f93571b = z;
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m142837a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "featureName");
        return CreateGroupChatModule.getDependency().isFeatureGatingEnable(str);
    }
}
