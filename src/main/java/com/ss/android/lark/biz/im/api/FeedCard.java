package com.ss.android.lark.biz.im.api;

import com.huawei.hms.support.api.entity.core.CommonCode;
import java.io.Serializable;

public class FeedCard implements Serializable, Comparable<FeedCard> {
    private FeedType feedType;
    private String id;
    private boolean isActive;
    private Type type = Type.UNKNOWN;
    private long updateTime;

    public enum FeedType {
        ALL(0),
        INBOX(1),
        DONE(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static FeedType valueOf(int i) {
            return forNumber(i);
        }

        public static FeedType forNumber(int i) {
            if (i == 0) {
                return ALL;
            }
            if (i == 1) {
                return INBOX;
            }
            if (i != 2) {
                return null;
            }
            return DONE;
        }

        private FeedType(int i) {
            this.value = i;
        }
    }

    public enum FilterType {
        FILTER_ALL(100),
        FILTER_MESSAGE(101),
        FILTER_DOC(103),
        FILTER_THREAD(104),
        FILTER_SECRET(CommonCode.StatusCode.API_CLIENT_EXPIRED),
        FILTER_CROSS_TENANT(1002);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static FilterType valueOf(int i) {
            return forNumber(i);
        }

        public static FilterType forNumber(int i) {
            if (i == 100) {
                return FILTER_ALL;
            }
            if (i == 101) {
                return FILTER_MESSAGE;
            }
            if (i == 103) {
                return FILTER_DOC;
            }
            if (i == 104) {
                return FILTER_THREAD;
            }
            if (i == 1001) {
                return FILTER_SECRET;
            }
            if (i != 1002) {
                return null;
            }
            return FILTER_CROSS_TENANT;
        }

        private FilterType(int i) {
            this.value = i;
        }
    }

    public enum Type {
        UNKNOWN(0),
        CHAT(1),
        DOC(3),
        THREAD(4),
        BOX(5),
        APP(6),
        TOPIC(7),
        OPEN_APP_CHAT(8),
        SUBSCRIPTION(10);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            switch (i) {
                case 1:
                    return CHAT;
                case 2:
                default:
                    return null;
                case 3:
                    return DOC;
                case 4:
                    return THREAD;
                case 5:
                    return BOX;
                case 6:
                    return APP;
                case 7:
                    return TOPIC;
                case 8:
                    return OPEN_APP_CHAT;
                case 9:
                    return SUBSCRIPTION;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public FeedType getFeedType() {
        return this.feedType;
    }

    public String getId() {
        return this.id;
    }

    public Type getType() {
        return this.type;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public FeedCard() {
    }

    public void setActive(boolean z) {
        this.isActive = z;
    }

    public void setFeedType(FeedType feedType2) {
        this.feedType = feedType2;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setType(Type type2) {
        this.type = type2;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public int compareTo(FeedCard feedCard) {
        int i = (getUpdateTime() > feedCard.getUpdateTime() ? 1 : (getUpdateTime() == feedCard.getUpdateTime() ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    public FeedCard(FeedCard feedCard) {
        this.isActive = feedCard.isActive();
        this.id = feedCard.getId();
        this.type = feedCard.getType();
        this.updateTime = feedCard.getUpdateTime();
        this.feedType = feedCard.getFeedType();
    }
}
