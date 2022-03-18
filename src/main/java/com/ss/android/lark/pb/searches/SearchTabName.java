package com.ss.android.lark.pb.searches;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum SearchTabName implements WireEnum {
    UNKNOWN_TAB(0),
    MESSAGE_TAB(1),
    DOCS_TAB(2),
    WIKI_TAB(3),
    CHAT_TAB(4),
    CALENDAR_TAB(5),
    APP_TAB(6),
    EMAIL_TAB(7),
    CHATTER_TAB(8),
    PANO_TAB(9),
    HELPDESK_TAB(10),
    OPEN_SEARCH_TAB(255);
    
    public static final ProtoAdapter<SearchTabName> ADAPTER = ProtoAdapter.newEnumAdapter(SearchTabName.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static SearchTabName fromValue(int i) {
        if (i == 255) {
            return OPEN_SEARCH_TAB;
        }
        switch (i) {
            case 0:
                return UNKNOWN_TAB;
            case 1:
                return MESSAGE_TAB;
            case 2:
                return DOCS_TAB;
            case 3:
                return WIKI_TAB;
            case 4:
                return CHAT_TAB;
            case 5:
                return CALENDAR_TAB;
            case 6:
                return APP_TAB;
            case 7:
                return EMAIL_TAB;
            case 8:
                return CHATTER_TAB;
            case 9:
                return PANO_TAB;
            case 10:
                return HELPDESK_TAB;
            default:
                return null;
        }
    }

    private SearchTabName(int i) {
        this.value = i;
    }
}
