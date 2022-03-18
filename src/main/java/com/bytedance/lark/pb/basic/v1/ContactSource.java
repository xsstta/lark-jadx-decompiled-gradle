package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ContactSource implements WireEnum {
    UNKNOWN_SOURCE(0),
    LINK(1),
    CHAT(2),
    CALENDAR(3),
    DOCS(4),
    VC(5),
    EMAIL(6),
    NAME_CARD(7),
    SEARCH_PHONE(8),
    SEARCH_EMAIL(9),
    SEARCH_CONTACT(10),
    COMMUNITY(11),
    EXTERNAL_CONTACT(17),
    NEW_CONTACT(18),
    SPECIAL_FOCUS(19),
    CONTACTCARDS(1000);
    
    public static final ProtoAdapter<ContactSource> ADAPTER = ProtoAdapter.newEnumAdapter(ContactSource.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ContactSource fromValue(int i) {
        if (i == 1000) {
            return CONTACTCARDS;
        }
        switch (i) {
            case 0:
                return UNKNOWN_SOURCE;
            case 1:
                return LINK;
            case 2:
                return CHAT;
            case 3:
                return CALENDAR;
            case 4:
                return DOCS;
            case 5:
                return VC;
            case 6:
                return EMAIL;
            case 7:
                return NAME_CARD;
            case 8:
                return SEARCH_PHONE;
            case 9:
                return SEARCH_EMAIL;
            case 10:
                return SEARCH_CONTACT;
            case 11:
                return COMMUNITY;
            default:
                switch (i) {
                    case 17:
                        return EXTERNAL_CONTACT;
                    case 18:
                        return NEW_CONTACT;
                    case 19:
                        return SPECIAL_FOCUS;
                    default:
                        return null;
                }
        }
    }

    private ContactSource(int i) {
        this.value = i;
    }
}
