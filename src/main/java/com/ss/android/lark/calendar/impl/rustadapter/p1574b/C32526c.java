package com.ss.android.lark.calendar.impl.rustadapter.p1574b;

import com.bytedance.lark.pb.basic.v1.Command;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.b.c */
public final /* synthetic */ class C32526c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f83431a;

    static {
        int[] iArr = new int[Command.values().length];
        f83431a = iArr;
        iArr[Command.PUSH_CALENDAR_SYNC_NOTIFICATION.ordinal()] = 1;
        iArr[Command.PUSH_CALENDAR_EVENT_INVITATION.ordinal()] = 2;
        iArr[Command.PUSH_CALENDAR_AND_EVENT_SYNC_NOTIFICATION.ordinal()] = 3;
        iArr[Command.PUSH_CALENDAR_SETTINGS_CHANGE_NOTIFICATION.ordinal()] = 4;
        iArr[Command.PUSH_CALENDAR_EVENT_REMINDER.ordinal()] = 5;
        iArr[Command.PUSH_REMINDER_CLOSED_NOTIFICATION.ordinal()] = 6;
        iArr[Command.PUSH_CALENDAR_EVENT_SYNC_NOTIFICATION.ordinal()] = 7;
        iArr[Command.PUSH_CALENDAR_BIND_GOOGLE_NOTIFICATION.ordinal()] = 8;
        iArr[Command.PUSH_EXTERNAL_CALENDAR_CHANGE_NOTIFICATION.ordinal()] = 9;
        iArr[Command.PUSH_CALENDAR_EVENT_CHANGED_NOTIFICATION.ordinal()] = 10;
        iArr[Command.PUSH_MEETING_NOTIFICATION.ordinal()] = 11;
        iArr[Command.PUSH_MEETING_MINUTE_EDITORS.ordinal()] = 12;
        iArr[Command.PUSH_SCROLL_CLOSED_NOTIFICATION.ordinal()] = 13;
        iArr[Command.PUSH_EVENT_SHARE_TO_CHAT_NOTIFICATION.ordinal()] = 14;
        iArr[Command.PUSH_CALENDAR_EVENT_VIDEO_MEETING_CHANGE.ordinal()] = 15;
        iArr[Command.PUSH_ASSOCIATED_VC_STATUS.ordinal()] = 16;
        iArr[Command.PUSH_ASSOCIATED_LIVE_STATUS.ordinal()] = 17;
        iArr[Command.PUSH_ROOM_VIEW_INSTANCE_CHANGE_NOTIFICATION.ordinal()] = 18;
    }
}
