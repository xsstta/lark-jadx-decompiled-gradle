package com.ss.android.vc.common.p3083e;

import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.vc.dependency.VideoChatModuleDependency;

/* renamed from: com.ss.android.vc.common.e.n */
public final class C60772n {
    /* renamed from: a */
    public static String m236113a(String str) {
        OpenChatter chatterById = VideoChatModuleDependency.getChatDependency().getChatterById(str);
        String a = VideoChatModuleDependency.getChatterNameDependency().mo196369a(chatterById);
        if (chatterById != null) {
            return a;
        }
        return "";
    }

    /* renamed from: b */
    public static String m236114b(String str) {
        OpenChatter chatterById = VideoChatModuleDependency.getChatDependency().getChatterById(str);
        if (chatterById != null) {
            return chatterById.getAvatarKey();
        }
        return "";
    }
}
