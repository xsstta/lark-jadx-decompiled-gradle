package com.ss.android.lark.calendar.wrapper.dependency.entity;

import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import java.io.Serializable;

public class CalChatter implements AbstractC30026d, Serializable {
    private Chatter mChatter;

    public Chatter getChatter() {
        return this.mChatter;
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d
    public String getAvatarKey() {
        return this.mChatter.getAvatarKey();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d
    public String getId() {
        return this.mChatter.getId();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d
    public String getLocalizedName() {
        return this.mChatter.getLocalizedName();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d
    public String getName() {
        return this.mChatter.getName();
    }

    public CalChatter(Chatter chatter) {
        this.mChatter = chatter;
    }

    public static CalChatter parseChatter(Chatter chatter) {
        if (chatter == null) {
            return null;
        }
        return new CalChatter(chatter);
    }
}
