package com.ss.android.lark.pb.searches;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;

public enum Scene implements WireEnum {
    UNKNOWN_SCENE(0),
    AT_USERS_SCENE(1),
    ADD_CHATTERS_SCENE(2),
    TRANSMIT_MESSAGES_SCENE(3),
    SMART_SEARCH_SCENE(4),
    SEARCH_MESSAGES_SCENE(5),
    SEARCH_CHATS_SCENE(6),
    SEARCH_CHATTERS_SCENE(7),
    SEARCH_USERS_SCENE(8),
    SEARCH_IN_CHAT_SCENE(9),
    SEARCH_IN_EMAIL_SCENE(10),
    SEARCH_MEMBER_IN_EMAIL_SCENE(11),
    SEARCH_DOCS_SCENE(12),
    SEARCH_EMAIL_MESSAGE_SCENE(13),
    SEARCH_DOCS_IN_DIALOG_SCENE(14),
    SEARCH_IN_CALENDAR_SCENE(15),
    SEARCH_HAD_CHAT_HISTORY_SCENE(16),
    SEARCH_MESSAGE_IN_CHAT_SCENE(17),
    SEARCH_FILE_IN_CHAT_SCENE(18),
    SEARCH_DOCS_IN_CHAT_SCENE(19),
    PULL_FILE_IN_CHAT_SCENE(20),
    PULL_DOCS_IN_CHAT_SCENE(21),
    SEARCH_BOX_SCENE(22),
    SEARCH_ONCALL_SCENE(23),
    SEARCH_MESSAGE_COUNT(24),
    SEARCH_THREAD_SCENE(25),
    CHAT_MENTION_SCENE(26),
    SEARCH_APPS_SCENE(27),
    LARGE_GROUP_SEARCH_SCENE(28),
    LARGE_GROUP_READ_SCENE(29),
    SEARCH_URLS_SCENE(30),
    SEARCH_FILE_SCENE(31),
    SEARCH_EXTERNAL_SCENE(32),
    SEARCH_WIKI_SCENE(33),
    SEARCH_WIKI_IN_CHAT_SCENE(34),
    ADVANCED_SEARCH_FILTER_SCENE(35),
    SEARCH_CALENDAR_EVENT_SCENE(36),
    SEARCH_CHATS_IN_ADVANCE_SCENE(37),
    SEARCH_CHATTERS_IN_ADVANCE_SCENE(38),
    SEARCH_DEPARTMENT_SCENE(39),
    SEARCH_PANO_TAG_SCENE(40),
    SEARCH_PANO_VIEW_SCENE(41),
    SEARCH_SLASH_COMMAND_SCENE(42),
    SEARCH_OPEN_SEARCH_SCENE(43),
    SEARCH_DOCS_WIKI_IN_CHAT_SCENE(44),
    PULL_DOCS_WIKI_IN_CHAT_SCENE(45);
    
    public static final ProtoAdapter<Scene> ADAPTER = ProtoAdapter.newEnumAdapter(Scene.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static Scene fromValue(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SCENE;
            case 1:
                return AT_USERS_SCENE;
            case 2:
                return ADD_CHATTERS_SCENE;
            case 3:
                return TRANSMIT_MESSAGES_SCENE;
            case 4:
                return SMART_SEARCH_SCENE;
            case 5:
                return SEARCH_MESSAGES_SCENE;
            case 6:
                return SEARCH_CHATS_SCENE;
            case 7:
                return SEARCH_CHATTERS_SCENE;
            case 8:
                return SEARCH_USERS_SCENE;
            case 9:
                return SEARCH_IN_CHAT_SCENE;
            case 10:
                return SEARCH_IN_EMAIL_SCENE;
            case 11:
                return SEARCH_MEMBER_IN_EMAIL_SCENE;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return SEARCH_DOCS_SCENE;
            case 13:
                return SEARCH_EMAIL_MESSAGE_SCENE;
            case 14:
                return SEARCH_DOCS_IN_DIALOG_SCENE;
            case 15:
                return SEARCH_IN_CALENDAR_SCENE;
            case 16:
                return SEARCH_HAD_CHAT_HISTORY_SCENE;
            case 17:
                return SEARCH_MESSAGE_IN_CHAT_SCENE;
            case 18:
                return SEARCH_FILE_IN_CHAT_SCENE;
            case 19:
                return SEARCH_DOCS_IN_CHAT_SCENE;
            case 20:
                return PULL_FILE_IN_CHAT_SCENE;
            case 21:
                return PULL_DOCS_IN_CHAT_SCENE;
            case 22:
                return SEARCH_BOX_SCENE;
            case 23:
                return SEARCH_ONCALL_SCENE;
            case 24:
                return SEARCH_MESSAGE_COUNT;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                return SEARCH_THREAD_SCENE;
            case 26:
                return CHAT_MENTION_SCENE;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                return SEARCH_APPS_SCENE;
            case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                return LARGE_GROUP_SEARCH_SCENE;
            case 29:
                return LARGE_GROUP_READ_SCENE;
            case 30:
                return SEARCH_URLS_SCENE;
            case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                return SEARCH_FILE_SCENE;
            case 32:
                return SEARCH_EXTERNAL_SCENE;
            case 33:
                return SEARCH_WIKI_SCENE;
            case 34:
                return SEARCH_WIKI_IN_CHAT_SCENE;
            case 35:
                return ADVANCED_SEARCH_FILTER_SCENE;
            case 36:
                return SEARCH_CALENDAR_EVENT_SCENE;
            case 37:
                return SEARCH_CHATS_IN_ADVANCE_SCENE;
            case 38:
                return SEARCH_CHATTERS_IN_ADVANCE_SCENE;
            case 39:
                return SEARCH_DEPARTMENT_SCENE;
            case 40:
                return SEARCH_PANO_TAG_SCENE;
            case 41:
                return SEARCH_PANO_VIEW_SCENE;
            case 42:
                return SEARCH_SLASH_COMMAND_SCENE;
            case 43:
                return SEARCH_OPEN_SEARCH_SCENE;
            case 44:
                return SEARCH_DOCS_WIKI_IN_CHAT_SCENE;
            case 45:
                return PULL_DOCS_WIKI_IN_CHAT_SCENE;
            default:
                return null;
        }
    }

    private Scene(int i) {
        this.value = i;
    }
}
