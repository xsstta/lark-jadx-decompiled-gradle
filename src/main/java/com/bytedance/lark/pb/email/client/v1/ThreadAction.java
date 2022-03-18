package com.bytedance.lark.pb.email.client.v1;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ThreadAction implements WireEnum {
    ARCHIVE(0),
    MOVE_TO_TRASH(1),
    MARK_AS_SPAM(2),
    MARK_AS_NOT_SPAM(3),
    MARK_AS_READ(4),
    MARK_AS_UNREAD(5),
    MOVE_TO_INBOX(6),
    MARK_AS_DELETE(7),
    MARK_AS_EDIT(8),
    SHOW_AUTO_FILTER(9),
    MARK_AS_FLAG(10),
    MARK_AS_UNFLAG(11),
    MOVE_TO_OTHER(12),
    MOVE_TO_IMPORTANT(13),
    ALWAYS_MOVE_TO_OTHER(14),
    ALWAYS_MOVE_TO_IMPORTANT(15),
    FORWARD_TO_CHAT(16),
    DELETE_PERMANENTLY(17),
    MOVE_TO_LABEL(18);
    
    public static final ProtoAdapter<ThreadAction> ADAPTER = ProtoAdapter.newEnumAdapter(ThreadAction.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ThreadAction fromValue(int i) {
        switch (i) {
            case 0:
                return ARCHIVE;
            case 1:
                return MOVE_TO_TRASH;
            case 2:
                return MARK_AS_SPAM;
            case 3:
                return MARK_AS_NOT_SPAM;
            case 4:
                return MARK_AS_READ;
            case 5:
                return MARK_AS_UNREAD;
            case 6:
                return MOVE_TO_INBOX;
            case 7:
                return MARK_AS_DELETE;
            case 8:
                return MARK_AS_EDIT;
            case 9:
                return SHOW_AUTO_FILTER;
            case 10:
                return MARK_AS_FLAG;
            case 11:
                return MARK_AS_UNFLAG;
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                return MOVE_TO_OTHER;
            case 13:
                return MOVE_TO_IMPORTANT;
            case 14:
                return ALWAYS_MOVE_TO_OTHER;
            case 15:
                return ALWAYS_MOVE_TO_IMPORTANT;
            case 16:
                return FORWARD_TO_CHAT;
            case 17:
                return DELETE_PERMANENTLY;
            case 18:
                return MOVE_TO_LABEL;
            default:
                return null;
        }
    }

    private ThreadAction(int i) {
        this.value = i;
    }
}
