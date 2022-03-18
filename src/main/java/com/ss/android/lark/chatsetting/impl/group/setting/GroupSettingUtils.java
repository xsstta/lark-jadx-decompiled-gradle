package com.ss.android.lark.chatsetting.impl.group.setting;

import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/setting/GroupSettingUtils;", "", "()V", "reorderChatters", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "chatters", "", "ownerId", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.h */
public final class GroupSettingUtils {

    /* renamed from: a */
    public static final GroupSettingUtils f90260a = new GroupSettingUtils();

    private GroupSettingUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<ChatChatter> m136106a(List<ChatChatter> list, String str) {
        boolean z;
        T t;
        List<ChatChatter> list2 = list;
        boolean z2 = true;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = str;
            if (!(str2 == null || str2.length() == 0)) {
                z2 = false;
            }
            if (!z2 && !Intrinsics.areEqual(((ChatChatter) CollectionsKt.first((List) list)).getId(), str)) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Intrinsics.areEqual(t.getId(), str)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    list.remove(t2);
                    list.add(0, t2);
                }
            }
        }
        return list;
    }
}
