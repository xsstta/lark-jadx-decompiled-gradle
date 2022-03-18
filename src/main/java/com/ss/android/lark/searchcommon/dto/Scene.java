package com.ss.android.lark.searchcommon.dto;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/searchcommon/dto/Scene;", "Ljava/io/Serializable;", "sceneId", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "(Ljava/lang/String;Lcom/ss/android/lark/searchcommon/dto/Scene$Type;)V", "getSceneId", "()Ljava/lang/String;", "setSceneId", "(Ljava/lang/String;)V", "getType", "()Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "setType", "(Lcom/ss/android/lark/searchcommon/dto/Scene$Type;)V", "Type", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class Scene implements Serializable {
    private String sceneId;
    private Type type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0001\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001!B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006\""}, d2 = {"Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "", "Ljava/io/Serializable;", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "ADD_CHAT_CHATTERS", "TRANSMIT_MESSAGES", "SMART_SEARCH", "SEARCH_MESSAGES", "SEARCH_CHATS", "SEARCH_CHATTERS", "SEARCH_USERS", "SEARCH_SPACE", "SEARCH_IN_CALENDAR_SCENE", "SEARCH_HAD_CHAT_HISTORY_SCENE", "SEARCH_HELP_DESK", "SEARCH_THREAD", "SEARCH_OPEN_APP_SCENE", "SEARCH_LINK", "SEARCH_FILE", "SEARCH_WIKI_SCENE", "SEARCH_CALENDAR_EVENT", "SEARCH_CHATS_IN_ADVANCE_SCENE", "SEARCH_GLOBAL", "SEARCH_OPEN_SEARCH_SCENE", "SEARCH_DOCS_WIKI_IN_CHAT_SCENE", "SEARCH_FILE_AND_FOLDER", "RECOMMEND", "SEARCH_CARDS", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Type implements Serializable {
        UNKNOWN(0),
        ADD_CHAT_CHATTERS(2),
        TRANSMIT_MESSAGES(3),
        SMART_SEARCH(4),
        SEARCH_MESSAGES(5),
        SEARCH_CHATS(6),
        SEARCH_CHATTERS(7),
        SEARCH_USERS(8),
        SEARCH_SPACE(12),
        SEARCH_IN_CALENDAR_SCENE(15),
        SEARCH_HAD_CHAT_HISTORY_SCENE(16),
        SEARCH_HELP_DESK(23),
        SEARCH_THREAD(25),
        SEARCH_OPEN_APP_SCENE(27),
        SEARCH_LINK(30),
        SEARCH_FILE(31),
        SEARCH_WIKI_SCENE(33),
        SEARCH_CALENDAR_EVENT(36),
        SEARCH_CHATS_IN_ADVANCE_SCENE(37),
        SEARCH_GLOBAL(38),
        SEARCH_OPEN_SEARCH_SCENE(44),
        SEARCH_DOCS_WIKI_IN_CHAT_SCENE(45),
        SEARCH_FILE_AND_FOLDER(47),
        RECOMMEND(48),
        SEARCH_CARDS(49);
        
        public static final Companion Companion = new Companion(null);
        private final int number;

        @JvmStatic
        public static final Type valueOf(int i) {
            return Companion.mo183841a(i);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/dto/Scene$Type$Companion;", "", "()V", "valueOf", "Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "value", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.searchcommon.dto.Scene$Type$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final Type mo183841a(int i) {
                if (i == 12) {
                    return Type.SEARCH_SPACE;
                }
                if (i == 23) {
                    return Type.SEARCH_HELP_DESK;
                }
                if (i == 25) {
                    return Type.SEARCH_THREAD;
                }
                if (i == 27) {
                    return Type.SEARCH_OPEN_APP_SCENE;
                }
                if (i == 33) {
                    return Type.SEARCH_WIKI_SCENE;
                }
                if (i == 15) {
                    return Type.SEARCH_IN_CALENDAR_SCENE;
                }
                if (i == 16) {
                    return Type.SEARCH_HAD_CHAT_HISTORY_SCENE;
                }
                if (i == 30) {
                    return Type.SEARCH_LINK;
                }
                if (i == 31) {
                    return Type.SEARCH_FILE;
                }
                if (i == 44) {
                    return Type.SEARCH_OPEN_SEARCH_SCENE;
                }
                if (i == 45) {
                    return Type.SEARCH_DOCS_WIKI_IN_CHAT_SCENE;
                }
                switch (i) {
                    case 2:
                        return Type.ADD_CHAT_CHATTERS;
                    case 3:
                        return Type.TRANSMIT_MESSAGES;
                    case 4:
                        return Type.SMART_SEARCH;
                    case 5:
                        return Type.SEARCH_MESSAGES;
                    case 6:
                        return Type.SEARCH_CHATS;
                    case 7:
                        return Type.SEARCH_CHATTERS;
                    case 8:
                        return Type.SEARCH_USERS;
                    default:
                        switch (i) {
                            case 36:
                                return Type.SEARCH_CALENDAR_EVENT;
                            case 37:
                                return Type.SEARCH_CHATS_IN_ADVANCE_SCENE;
                            case 38:
                                return Type.SEARCH_GLOBAL;
                            default:
                                switch (i) {
                                    case 47:
                                        return Type.SEARCH_FILE_AND_FOLDER;
                                    case 48:
                                        return Type.RECOMMEND;
                                    case 49:
                                        return Type.SEARCH_CARDS;
                                    default:
                                        return Type.UNKNOWN;
                                }
                        }
                }
            }
        }

        public final int getNumber() {
            return this.number;
        }

        private Type(int i) {
            this.number = i;
        }
    }

    public final String getSceneId() {
        return this.sceneId;
    }

    public final Type getType() {
        return this.type;
    }

    public final void setSceneId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.sceneId = str;
    }

    public final void setType(Type type2) {
        Intrinsics.checkParameterIsNotNull(type2, "<set-?>");
        this.type = type2;
    }

    public Scene(String str, Type type2) {
        Intrinsics.checkParameterIsNotNull(str, "sceneId");
        Intrinsics.checkParameterIsNotNull(type2, ShareHitPoint.f121869d);
        this.sceneId = str;
        this.type = type2;
    }
}
