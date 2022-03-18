package com.ss.android.lark.chatwindow;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.lark.chatwindow.h */
public class C35249h {
    /* renamed from: a */
    public static boolean m137636a(List<ReactionInfo> list, String str, String str2) {
        if (CollectionUtils.isEmpty(list)) {
            return false;
        }
        for (ReactionInfo reactionInfo : list) {
            Reaction reaction = reactionInfo.getReaction();
            if (Objects.equals(str, reaction.getType())) {
                if (reaction.getChatterIds() == null) {
                    return false;
                }
                for (String str3 : reaction.getChatterIds()) {
                    if (str3.equals(str2)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
