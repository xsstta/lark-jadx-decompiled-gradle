package com.ss.android.lark.appstate.service;

import com.ss.android.lark.appstate.p1372a.C29224a;

public interface IClientService {
    /* renamed from: a */
    C29224a mo103631a(long j, long j2, long j3, long j4);

    /* renamed from: a */
    void mo103632a();

    /* renamed from: a */
    void mo103633a(ClientEvent clientEvent);

    /* renamed from: a */
    void mo103634a(boolean z);

    /* renamed from: b */
    C29224a mo103635b();

    /* renamed from: b */
    void mo103636b(boolean z);

    public enum ClientEvent {
        ENTER_FOREGROUND(1),
        ENTER_BACKGROUND(2),
        TERMINATING(3),
        MEMORY_WARNING(4),
        FIRST_SCREEN_FINISHED(5),
        CHAT_MESSAGE_GOT(6);
        
        private long updateTime;
        private int value;

        public int getNumber() {
            return this.value;
        }

        public long updateTime() {
            return this.updateTime;
        }

        public static ClientEvent valueOf(int i) {
            return forNumber(i);
        }

        public ClientEvent updateTime(long j) {
            this.updateTime = j;
            return this;
        }

        public static ClientEvent forNumber(int i) {
            switch (i) {
                case 1:
                    return ENTER_FOREGROUND;
                case 2:
                    return ENTER_BACKGROUND;
                case 3:
                    return TERMINATING;
                case 4:
                    return MEMORY_WARNING;
                case 5:
                    return FIRST_SCREEN_FINISHED;
                case 6:
                    return CHAT_MESSAGE_GOT;
                default:
                    return null;
            }
        }

        private ClientEvent(int i) {
            this.value = i;
        }
    }

    public enum NetworkType {
        NONE(0, "unvailable"),
        MOBILE(1, "mobile"),
        MOBILE_2G(2, "mobile_2g"),
        MOBILE_3G(3, "mobile_3g"),
        WIFI(4, "wifi"),
        MOBILE_4G(5, "mobile_4g"),
        UNKNOWN(6, "unknown");
        
        final int nativeInt;
        private final String nativeName;

        public String getNativeName() {
            return this.nativeName;
        }

        public int getValue() {
            return this.nativeInt;
        }

        public static NetworkType forNumber(int i) {
            switch (i) {
                case 0:
                    return NONE;
                case 1:
                    return MOBILE;
                case 2:
                    return MOBILE_2G;
                case 3:
                    return MOBILE_3G;
                case 4:
                    return WIFI;
                case 5:
                    return MOBILE_4G;
                case 6:
                    return UNKNOWN;
                default:
                    return null;
            }
        }

        private NetworkType(int i, String str) {
            this.nativeInt = i;
            this.nativeName = str;
        }
    }
}
