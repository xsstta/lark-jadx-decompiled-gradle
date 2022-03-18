package com.ss.android.lark.chat.entity.reaction;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ReactionInfo implements AbstractC26248b<ReactionInfo>, Serializable {
    private Reaction reaction;
    private Map<String, ChatChatter> reactionChatters = new HashMap();

    public boolean isItemSame(ReactionInfo reactionInfo) {
        return true;
    }

    public Reaction getReaction() {
        return this.reaction;
    }

    public Map<String, ChatChatter> getReactionChatters() {
        return this.reactionChatters;
    }

    public void setReaction(Reaction reaction2) {
        this.reaction = reaction2;
    }

    public void setReactionChatters(Map<String, ChatChatter> map) {
        this.reactionChatters = map;
    }

    public boolean isContentSame(ReactionInfo reactionInfo) {
        if (!(this.reaction.isContentSame(reactionInfo.reaction) && this.reactionChatters.size() == reactionInfo.reactionChatters.size() && this.reactionChatters.values().containsAll(reactionInfo.reactionChatters.values()))) {
            return false;
        }
        for (String str : this.reactionChatters.keySet()) {
            if (!C26247a.m94983b(this.reactionChatters.get(str), reactionInfo.reactionChatters.get(str))) {
                return false;
            }
        }
        return true;
    }

    public ReactionInfo(Reaction reaction2, Map<String, ChatChatter> map) {
        this.reaction = reaction2;
        this.reactionChatters = map;
    }
}
