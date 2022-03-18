package com.ss.android.lark.todo.impl.rustadapter.push;

import com.bytedance.lark.pb.basic.v1.Command;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.rustadapter.push.d */
public final /* synthetic */ class C57290d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f141141a;

    static {
        int[] iArr = new int[Command.values().length];
        f141141a = iArr;
        iArr[Command.PUSH_TODOS_CHANGED_NOTIFICATION.ordinal()] = 1;
        iArr[Command.PUSH_TODO_VIEWS_CHANGED_NOTIFICATION.ordinal()] = 2;
        iArr[Command.PUSH_TODO_REMINDER_NOTIFICATION.ordinal()] = 3;
        iArr[Command.PUSH_TODO_SETTING_CHANGE_NOTIFICATION.ordinal()] = 4;
        iArr[Command.PUSH_TODO_COMMENT_NOTIFICATION.ordinal()] = 5;
        iArr[Command.PUSH_TODO_COMMENT_REACTION_NOTIFICATION.ordinal()] = 6;
        iArr[Command.PUSH_TODO_BADGE_NOTIFICATION.ordinal()] = 7;
    }
}
