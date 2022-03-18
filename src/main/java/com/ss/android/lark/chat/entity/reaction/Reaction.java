package com.ss.android.lark.chat.entity.reaction;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Reaction implements AbstractC26248b<Reaction>, Serializable {
    private List<String> chatterIds;
    private int count;
    private String messageId;
    private int resId;
    private String type;

    public boolean isItemSame(Reaction reaction) {
        return true;
    }

    public Reaction() {
    }

    public List<String> getChatterIds() {
        return this.chatterIds;
    }

    public int getCount() {
        return this.count;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public int getResId() {
        return this.resId;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "Reaction{type='" + this.type + '\'' + ", count=" + this.count + ", chatterIds=" + this.chatterIds + '}';
    }

    public void setChatterIds(List<String> list) {
        this.chatterIds = list;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public boolean isContentSame(Reaction reaction) {
        if (!this.type.equals(reaction.getType()) || this.count != reaction.getCount()) {
            return false;
        }
        List<String> chatterIds2 = reaction.getChatterIds();
        try {
            if (this.chatterIds.size() != chatterIds2.size() || !this.chatterIds.containsAll(chatterIds2)) {
                return false;
            }
            return true;
        } catch (ConcurrentModificationException unused) {
        }
    }

    public Reaction(String str, int i, List<String> list, int i2) {
        this.type = str;
        this.count = i;
        this.chatterIds = list;
        this.resId = i2;
    }

    public Reaction(String str, int i, String str2, int i2) {
        this.type = str;
        this.count = i;
        this.chatterIds = new ArrayList(Arrays.asList(str2));
        this.resId = i2;
    }
}
