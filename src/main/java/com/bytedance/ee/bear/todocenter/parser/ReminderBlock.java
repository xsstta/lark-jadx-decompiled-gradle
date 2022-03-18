package com.bytedance.ee.bear.todocenter.parser;

import com.bytedance.ee.log.C13479a;

public class ReminderBlock extends AbsBlock {
    private long expireTime;
    private boolean isWholeDay;
    private boolean shouldNotify;

    public long getExpireTime() {
        return this.expireTime;
    }

    public boolean isShouldNotify() {
        return this.shouldNotify;
    }

    public boolean isWholeDay() {
        return this.isWholeDay;
    }

    public ReminderBlock() {
        setType("2");
    }

    @Override // com.bytedance.ee.bear.todocenter.parser.AbsBlock
    public boolean isValid() {
        if (this.expireTime > 0) {
            return true;
        }
        return false;
    }

    public ReminderBlock setShouldNotify(String str) {
        try {
            this.shouldNotify = Boolean.parseBoolean(str);
        } catch (Exception e) {
            C13479a.m54761a("ReminderBlock", e);
        }
        return this;
    }

    public ReminderBlock setWholeDay(String str) {
        try {
            this.isWholeDay = Boolean.parseBoolean(str);
        } catch (Exception e) {
            C13479a.m54761a("ReminderBlock", e);
        }
        return this;
    }

    public ReminderBlock setExpireTime(String str) {
        try {
            this.expireTime = Long.parseLong(str) * 1000;
        } catch (Exception e) {
            C13479a.m54761a("ReminderBlock", e);
        }
        return this;
    }
}
