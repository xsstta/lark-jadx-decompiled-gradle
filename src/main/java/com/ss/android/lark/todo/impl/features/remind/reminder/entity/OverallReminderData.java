package com.ss.android.lark.todo.impl.features.remind.reminder.entity;

import com.bytedance.lark.pb.todo.v1.PushTodoReminder;
import com.bytedance.lark.pb.todo.v1.TodoReminder;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000J\u0013\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0000H\u0002J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/remind/reminder/entity/OverallReminderData;", "Ljava/io/Serializable;", "todoReminder", "Lcom/bytedance/lark/pb/todo/v1/PushTodoReminder;", "arriveTime", "", "(Lcom/bytedance/lark/pb/todo/v1/PushTodoReminder;J)V", "getArriveTime", "()J", "setArriveTime", "(J)V", "getTodoReminder", "()Lcom/bytedance/lark/pb/todo/v1/PushTodoReminder;", "setTodoReminder", "(Lcom/bytedance/lark/pb/todo/v1/PushTodoReminder;)V", "component1", "component2", "copy", "equalExceptRemindMinute", "", "overallReminderUnit", "equals", "other", "", "hashCode", "", "isSameWithoutTodoReminder", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class OverallReminderData implements Serializable {
    private long arriveTime;
    private PushTodoReminder todoReminder;

    public static /* synthetic */ OverallReminderData copy$default(OverallReminderData overallReminderData, PushTodoReminder pushTodoReminder, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            pushTodoReminder = overallReminderData.todoReminder;
        }
        if ((i & 2) != 0) {
            j = overallReminderData.arriveTime;
        }
        return overallReminderData.copy(pushTodoReminder, j);
    }

    public final PushTodoReminder component1() {
        return this.todoReminder;
    }

    public final long component2() {
        return this.arriveTime;
    }

    public final OverallReminderData copy(PushTodoReminder pushTodoReminder, long j) {
        Intrinsics.checkParameterIsNotNull(pushTodoReminder, "todoReminder");
        return new OverallReminderData(pushTodoReminder, j);
    }

    public int hashCode() {
        PushTodoReminder pushTodoReminder = this.todoReminder;
        return ((pushTodoReminder != null ? pushTodoReminder.hashCode() : 0) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.arriveTime);
    }

    public String toString() {
        return "OverallReminderData(todoReminder=" + this.todoReminder + ", arriveTime=" + this.arriveTime + ")";
    }

    public final long getArriveTime() {
        return this.arriveTime;
    }

    public final PushTodoReminder getTodoReminder() {
        return this.todoReminder;
    }

    public final void setArriveTime(long j) {
        this.arriveTime = j;
    }

    public final void setTodoReminder(PushTodoReminder pushTodoReminder) {
        Intrinsics.checkParameterIsNotNull(pushTodoReminder, "<set-?>");
        this.todoReminder = pushTodoReminder;
    }

    public final boolean equalExceptRemindMinute(OverallReminderData overallReminderData) {
        if (overallReminderData == null) {
            return false;
        }
        return isSameWithoutTodoReminder(overallReminderData);
    }

    public boolean equals(Object obj) {
        Long l;
        if (obj == null || !(obj instanceof OverallReminderData)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        OverallReminderData overallReminderData = (OverallReminderData) obj;
        if (this.arriveTime != overallReminderData.arriveTime || !isSameWithoutTodoReminder(overallReminderData)) {
            return false;
        }
        TodoReminder todoReminder2 = this.todoReminder.reminder;
        Long l2 = null;
        if (todoReminder2 != null) {
            l = todoReminder2.time;
        } else {
            l = null;
        }
        TodoReminder todoReminder3 = overallReminderData.todoReminder.reminder;
        if (todoReminder3 != null) {
            l2 = todoReminder3.time;
        }
        if (Intrinsics.areEqual(l, l2)) {
            return true;
        }
        return false;
    }

    private final boolean isSameWithoutTodoReminder(OverallReminderData overallReminderData) {
        if (!Intrinsics.areEqual(this.todoReminder.guid, overallReminderData.todoReminder.guid) || !Intrinsics.areEqual(this.todoReminder.summary, overallReminderData.todoReminder.summary) || !Intrinsics.areEqual(this.todoReminder.due_time, overallReminderData.todoReminder.due_time) || !Intrinsics.areEqual(this.todoReminder.due_timezone, overallReminderData.todoReminder.due_timezone) || !Intrinsics.areEqual(this.todoReminder.is_all_day, overallReminderData.todoReminder.is_all_day)) {
            return false;
        }
        return true;
    }

    public OverallReminderData(PushTodoReminder pushTodoReminder, long j) {
        Intrinsics.checkParameterIsNotNull(pushTodoReminder, "todoReminder");
        this.todoReminder = pushTodoReminder;
        this.arriveTime = j;
    }
}
