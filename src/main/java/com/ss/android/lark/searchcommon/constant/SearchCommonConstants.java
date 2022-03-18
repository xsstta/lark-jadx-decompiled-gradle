package com.ss.android.lark.searchcommon.constant;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class SearchCommonConstants {

    @Retention(RetentionPolicy.SOURCE)
    public @interface OpenAppAbilityType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SearchFrom {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SearchResultType {
        public static final int BOX = 9;
        public static final int DOC_FEED = 4;
        public static final int EXTERNAL = 14;
        public static final int SPACE_HOLDER = 10000003;
        public static final int THREAD_GROUP = 10000009;
    }

    /* renamed from: a */
    public static int m208814a(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                return 0;
            case 10:
                return 10;
            case 11:
                return 11;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 21:
                return 21;
        }
    }

    /* renamed from: b */
    public static String m208815b(int i) {
        if (i == 21) {
            return "SLASH_COMMAND";
        }
        if (i == 10000001) {
            return "FILE";
        }
        switch (i) {
            case 1:
                return "CHATTER";
            case 2:
                return "CHAT";
            case 3:
                return "MESSAGE";
            case 4:
                return "DOC_FEED";
            case 5:
                return "EMAIL";
            case 6:
                return "SPACE";
            case 7:
                return "EMAIL_MESSAGE";
            case 8:
                return "THREAD";
            default:
                switch (i) {
                    case 10:
                        return "HELPDESK";
                    case 11:
                        return "CRYPTO_P2P_CHAT";
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                        return "OPEN_APP";
                    case 13:
                        return "LINK";
                    case 14:
                        return "EXTERNAL";
                    case 15:
                        return "WIKI";
                    case 16:
                        return "MAIL_CONTACT";
                    default:
                        return GrsBaseInfo.CountryCodeSource.UNKNOWN;
                }
        }
    }

    public enum FeedType {
        UNKNOWN(0),
        CHAT(1),
        DOC(3),
        THREAD(4),
        BOX(5),
        APP(6),
        TOPIC(7),
        OPEN_APP_CHAT(8);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static FeedType valueOf(int i) {
            return forNumber(i);
        }

        public static FeedType forNumber(int i) {
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
            }
        }

        private FeedType(int i) {
            this.value = i;
        }
    }

    public enum SearchHistorySource {
        UNKNOWN(0),
        MAIN(1),
        MESSAGE(2),
        SPACE(3),
        EXTERNAL(4),
        WIKI(5),
        CHAT(6),
        USER(7);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static SearchHistorySource valueOf(int i) {
            return forNumber(i);
        }

        public static SearchHistorySource forNumber(int i) {
            switch (i) {
                case 1:
                    return MAIN;
                case 2:
                    return MESSAGE;
                case 3:
                    return SPACE;
                case 4:
                    return EXTERNAL;
                case 5:
                    return WIKI;
                case 6:
                    return CHAT;
                case 7:
                    return USER;
                default:
                    return UNKNOWN;
            }
        }

        private SearchHistorySource(int i) {
            this.value = i;
        }
    }
}
