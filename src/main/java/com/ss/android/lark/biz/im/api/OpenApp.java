package com.ss.android.lark.biz.im.api;

import java.io.Serializable;

public class OpenApp implements Serializable {
    private String appId;
    private String avatarKey;
    private String botId;
    private BotTipsContent botTips;
    private Chatable chatable;
    private String desc;
    private ExtraConfig extraConfig;
    private String id;
    private String lastHappen;
    private String name;
    private State state;
    private String tips;
    private String version;

    public enum Chatable {
        CHATABLE_UNKNOWN(0),
        CHATABLE(1),
        UNCHATABLE(2);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        public static Chatable fromValue(int i) {
            if (i == 0) {
                return CHATABLE_UNKNOWN;
            }
            if (i == 1) {
                return CHATABLE;
            }
            if (i != 2) {
                return UNCHATABLE;
            }
            return UNCHATABLE;
        }

        private Chatable(int i) {
            this.value = i;
        }
    }

    public enum State {
        UNKNOW(100),
        USABLE(0),
        TENANT_FORBIDDEN(2),
        PLATFORM_FORBIDDEN(3),
        DEVELOPER_FORBIDDEN(4),
        OFFLINE(5),
        USER_INVISIBLE(6),
        DELETED(8);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        public static State fromValue(int i) {
            if (i == 0) {
                return USABLE;
            }
            if (i == 8) {
                return DELETED;
            }
            if (i == 100) {
                return UNKNOW;
            }
            if (i == 2) {
                return TENANT_FORBIDDEN;
            }
            if (i == 3) {
                return PLATFORM_FORBIDDEN;
            }
            if (i == 4) {
                return DEVELOPER_FORBIDDEN;
            }
            if (i == 5) {
                return OFFLINE;
            }
            if (i != 6) {
                return USABLE;
            }
            return USER_INVISIBLE;
        }

        private State(int i) {
            this.value = i;
        }
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public String getBotId() {
        return this.botId;
    }

    public BotTipsContent getBotTips() {
        return this.botTips;
    }

    public Chatable getChatable() {
        return this.chatable;
    }

    public String getDesc() {
        return this.desc;
    }

    public ExtraConfig getExtraConfig() {
        return this.extraConfig;
    }

    public String getId() {
        return this.id;
    }

    public String getLastHappen() {
        return this.lastHappen;
    }

    public String getName() {
        return this.name;
    }

    public State getState() {
        return this.state;
    }

    public String getTips() {
        return this.tips;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean canApplyVisibility() {
        ExtraConfig extraConfig2 = this.extraConfig;
        if (extraConfig2 == null || extraConfig2.isCanApplyVisibility()) {
            return true;
        }
        return false;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setBotId(String str) {
        this.botId = str;
    }

    public void setBotTips(BotTipsContent botTipsContent) {
        this.botTips = botTipsContent;
    }

    public void setChatable(Chatable chatable2) {
        this.chatable = chatable2;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setExtraConfig(ExtraConfig extraConfig2) {
        this.extraConfig = extraConfig2;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLastHappen(String str) {
        this.lastHappen = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setState(State state2) {
        this.state = state2;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
