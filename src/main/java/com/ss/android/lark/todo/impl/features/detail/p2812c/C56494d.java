package com.ss.android.lark.todo.impl.features.detail.p2812c;

import com.bytedance.lark.pb.todo.v1.Record;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.c.d */
public final /* synthetic */ class C56494d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f139718a;

    static {
        int[] iArr = new int[Record.RecordType.values().length];
        f139718a = iArr;
        iArr[Record.RecordType.USER_ADDED_TODO.ordinal()] = 1;
        iArr[Record.RecordType.USER_COMPLETE_TODO.ordinal()] = 2;
        iArr[Record.RecordType.USER_CANCEL_COMPLETED_TODO.ordinal()] = 3;
        iArr[Record.RecordType.USER_DELETED_TODO.ordinal()] = 4;
        iArr[Record.RecordType.USER_CANCEL_DELETED_TODO.ordinal()] = 5;
        iArr[Record.RecordType.USER_UPDATED_SUMMARY.ordinal()] = 6;
        iArr[Record.RecordType.USER_UPDATED_RICH_SUMMARY.ordinal()] = 7;
        iArr[Record.RecordType.USERS_COMPLETED_MILLI_TIME.ordinal()] = 8;
        iArr[Record.RecordType.USER_ADDED_DESCRIPTION.ordinal()] = 9;
        iArr[Record.RecordType.USER_UPDATED_DESCRIPTION.ordinal()] = 10;
        iArr[Record.RecordType.USER_DELETED_DESCRIPTION.ordinal()] = 11;
        iArr[Record.RecordType.USER_ADDED_DUE_TIME.ordinal()] = 12;
        iArr[Record.RecordType.USER_UPDATED_DUE_TIME.ordinal()] = 13;
        iArr[Record.RecordType.USER_DELETED_DUE_TIME.ordinal()] = 14;
        iArr[Record.RecordType.REMINDERS.ordinal()] = 15;
        iArr[Record.RecordType.ASSIGNEES.ordinal()] = 16;
        iArr[Record.RecordType.FOLLOWERS.ordinal()] = 17;
        iArr[Record.RecordType.USER_DELETED_REFER_CONTEXT.ordinal()] = 18;
    }
}
